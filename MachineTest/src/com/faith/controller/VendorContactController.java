package com.faith.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.faith.dao.IVendor;
import com.faith.model.VVendorContact;



@CrossOrigin
@RestController
@RequestMapping("/api")
public class VendorContactController {
	@Autowired
	private IVendor dao;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public List getUserDetails() {
		List list;
		System.out.println("Getting the vendor details");
		list = dao.getAllDetails();
		return list;
	}

	@RequestMapping(value = "/listbyid/{vdId}", method = RequestMethod.GET)
	public VVendorContact getVendorById(@PathVariable("vdId") int vdId) {

		System.out.println("Get the single contact details using id : ");
		VVendorContact vc = (VVendorContact) dao.getVendorById(vdId);
		return vc;
	}
	@RequestMapping(value = "/disable/{vdId}", method = RequestMethod.PUT)
	void disableAsset(@PathVariable("vdId") int vdId) {

		dao.disableVendor(vdId);
	}
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public void insertDetails(@RequestBody VVendorContact vc) {
		dao.insertVendorContactDetails(vc);
	}
	@RequestMapping(value = "/update/{vdId}", method = RequestMethod.PUT)
	public void updateDetails(@RequestBody VVendorContact vc) {

		dao.updateVendorDetails(vc);
	}
	@RequestMapping(value="/duplication/{cpMobile}/{cpEmail}",method = RequestMethod.GET)
	public VVendorContact duplication(@PathVariable(value="cpMobile")String phone,
			@PathVariable(value="cpEmail")String email){
		VVendorContact vendorContact= (VVendorContact)dao.duplication(phone,email);
		return vendorContact;
		
	}
	@SuppressWarnings("rawtypes")
	@RequestMapping(value="/search/{searchString}",method= RequestMethod.GET)
	public List getSearch(@PathVariable("searchString") String searchString) {
		List list;
		if(searchString.equals("all")){
			list=dao.getAllDetails();
		}else{
			list=dao.searchVendorDetails(searchString);
		}
		return list;
	}
}
