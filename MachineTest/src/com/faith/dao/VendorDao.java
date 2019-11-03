package com.faith.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


import com.faith.model.VVendorContact;


public class VendorDao implements IVendor {

	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public Integer getMaxId(){
		String sql = "select max(vdId) from vendor";
		Integer id=template.update(sql, new Object[] {},Integer.class);
		return id;
	}
	
	@Override
	public int insertVendorContactDetails(VVendorContact vc) {
		// TODO Auto-generated method stub
		String sqlone = "insert into vendor(vdName,vdAddr,vdLocation,vdService,vdPin) " 
						+ "values('" + vc.getVdName() 
						+ "','"
						+ vc.getVdAddr()
						+ "','" 
						+ vc.getVdLocation()
						+"','"
						+ vc.getVdService()
						+"',"
						+vc.getVdPin()
						+ ")";

		 template.update(sqlone);
		
		Integer maxid= getMaxId();
		System.out.println(maxid);
		
		String sqltwo="insert into contact(cpName,cpDepartment,cpVendor,cpEmail,cpMobile) "
				+"values('"+vc.getCpName()
				+"','"
				+vc.getCpDepartment()
				+"','"
				+vc.getCpEmail()
				+"','"
				+vc.getCpMobile()
				+ "',?)";
		return template.update(sqltwo, new Object[] { maxid });
				
	}
	
	

	@Override
	public List<VVendorContact> getAllDetails() {
		// TODO Auto-generated method stub
		return template.query("select v.vdid,v.vdName,v.vdAddr,v.vdlocation,v.vdservice,v.vdpin,c.cpname,c.cpdepartment,c.cpemail,c.cpmobile  from vendor v join contact c on(c.cpvendor=v.vdid) and v.isActive='Y' order by v.vdid desc"
				, new RowMapper<VVendorContact>() {

					@Override
					public VVendorContact mapRow(ResultSet rs, int row) throws SQLException {
						// TODO Auto-generated method stub
						VVendorContact vendorContact = new VVendorContact();
						vendorContact.setVdId(rs.getInt(1));
						vendorContact.setVdName(rs.getString(2));
						vendorContact.setVdAddr(rs.getString(3));
						vendorContact.setVdLocation(rs.getString(4));
						vendorContact.setVdService(rs.getString(5));
						vendorContact.setVdPin(rs.getInt(6));
						vendorContact.setCpName(rs.getString(7));
						vendorContact.setCpDepartment(rs.getString(8));
						vendorContact.setCpEmail(rs.getString(9));
						vendorContact.setCpMobile(rs.getString(10));
						return vendorContact;
						
					}

				});
	}

	@Override
	public int disableVendor(int vId) {
		// TODO Auto-generated method stub
		String sql = "update vendor set isActive='N' where vdId = ?";
		return template.update(sql, new Object[] { vId });
	}

	@Override
	public int updateVendorDetails(VVendorContact vc) {
		// TODO Auto-generated method stub
		String sqlone = "update vendor set vdName= '"+vc.getVdName()+",vdAddr= '"+vc.getVdAddr()+"',vdLocation= '"+vc.getVdLocation()+"',vdService= '"+vc.getVdService()+"',vdPin= "+vc.getVdPin()+" where vdId = ?";
		template.update(sqlone, new Object[] { vc.getVdId() });
		String sqltwo = "update contact set cpName= '"+vc.getCpName()+",cpDepartment= '"+vc.getCpDepartment()+"',cpEmail= '"+vc.getCpEmail()+"',cpMobile= '"+vc.getCpMobile()+"' where vdId = ?";
		return template.update(sqltwo, new Object[] { vc.getVdId() });
	}

	@Override
	public List<VVendorContact> searchVendorDetails(String searchString) {
		// TODO Auto-generated method stub
		return template.query("select v.vdid,v.vdName,v.vdAddr,v.vdlocation,v.vdservice,v.vdpin,"
				+ "c.cpname,c.cpdepartment,c.cpemail,c.cpmobile  from vendor v join contact c "
				+ "on(c.cpvendor=v.vdid) and v.isActive='Y' and v.vdname='"+searchString+""
						+ "' or v.vdLocation='"+searchString+"' or v.vdService='"+searchString+
						"' or v.vdAddr='"+searchString+"' or c.cpName='"+searchString+
						"' or c.cpDepartment='"+searchString+" order by v.vdid desc"
				, new RowMapper<VVendorContact>() {

					@Override
					public VVendorContact mapRow(ResultSet rs, int row) throws SQLException {
						// TODO Auto-generated method stub
						VVendorContact vendorContact = new VVendorContact();
						vendorContact.setVdId(rs.getInt(1));
						vendorContact.setVdName(rs.getString(2));
						vendorContact.setVdAddr(rs.getString(3));
						vendorContact.setVdLocation(rs.getString(4));
						vendorContact.setVdService(rs.getString(5));
						vendorContact.setVdPin(rs.getInt(6));
						vendorContact.setCpName(rs.getString(7));
						vendorContact.setCpDepartment(rs.getString(8));
						vendorContact.setCpEmail(rs.getString(9));
						vendorContact.setCpMobile(rs.getString(10));
						return vendorContact;
						
					}

				});
	}

	@Override
	public VVendorContact getVendorById(int vdId) {
		// TODO Auto-generated method stub
		String sql = "select v.vdid,v.vdName,v.vdaddr,v.vdlocation,v.vdservice,v.vdpin,c.cpname,c.cpdepartment,c.cpemail,c.cpmobile  from vendor v join contact c on(c.cpvendor=v.vdid) and v.isActive='Y' and vdId=? order by vdid desc ";
		return template.queryForObject(sql, new Object[] { vdId }, new BeanPropertyRowMapper<VVendorContact>(VVendorContact.class));
	}

	@Override
	public VVendorContact duplication(String phone, String email) {
		// TODO Auto-generated method stub
		String sql = "select c.cpemail,c.cpmobile from vendor v join contact c on(v.vdid=c.cpvendor) where (c.cpmobile=? or c.cpemail=?) and v.isactive='Y'";
		return template.queryForObject(sql, new Object[] {phone,email},
				new BeanPropertyRowMapper<VVendorContact>(VVendorContact.class));
	}

}
