package com.faith.dao;

import java.util.List;

import com.faith.model.VVendorContact;

public interface IVendor {
	public abstract int insertVendorContactDetails(VVendorContact vendorContact);

	public abstract List<VVendorContact> getAllDetails();

	public abstract int disableVendor(int vId);

	public abstract int updateVendorDetails(VVendorContact vendorContact);

	public abstract List<VVendorContact> searchVendorDetails(String searchString);

	public abstract VVendorContact getVendorById(int vId);

	public VVendorContact duplication(String phone, String email);

}
