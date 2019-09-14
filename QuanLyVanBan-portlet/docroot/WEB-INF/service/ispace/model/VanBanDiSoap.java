/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package ispace.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link ispace.service.http.VanBanDiServiceSoap}.
 *
 * @author PC
 * @see ispace.service.http.VanBanDiServiceSoap
 * @generated
 */
public class VanBanDiSoap implements Serializable {
	public static VanBanDiSoap toSoapModel(VanBanDi model) {
		VanBanDiSoap soapModel = new VanBanDiSoap();

		soapModel.setId(model.getId());
		soapModel.setSoKiHieu(model.getSoKiHieu());
		soapModel.setSoVanBanId(model.getSoVanBanId());
		soapModel.setLoaiVanBanId(model.getLoaiVanBanId());
		soapModel.setDate(model.getDate());
		soapModel.setNguoiKiId(model.getNguoiKiId());

		return soapModel;
	}

	public static VanBanDiSoap[] toSoapModels(VanBanDi[] models) {
		VanBanDiSoap[] soapModels = new VanBanDiSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VanBanDiSoap[][] toSoapModels(VanBanDi[][] models) {
		VanBanDiSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VanBanDiSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VanBanDiSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VanBanDiSoap[] toSoapModels(List<VanBanDi> models) {
		List<VanBanDiSoap> soapModels = new ArrayList<VanBanDiSoap>(models.size());

		for (VanBanDi model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VanBanDiSoap[soapModels.size()]);
	}

	public VanBanDiSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public String getSoKiHieu() {
		return _soKiHieu;
	}

	public void setSoKiHieu(String soKiHieu) {
		_soKiHieu = soKiHieu;
	}

	public long getSoVanBanId() {
		return _soVanBanId;
	}

	public void setSoVanBanId(long soVanBanId) {
		_soVanBanId = soVanBanId;
	}

	public long getLoaiVanBanId() {
		return _loaiVanBanId;
	}

	public void setLoaiVanBanId(long loaiVanBanId) {
		_loaiVanBanId = loaiVanBanId;
	}

	public Date getDate() {
		return _date;
	}

	public void setDate(Date date) {
		_date = date;
	}

	public long getNguoiKiId() {
		return _nguoiKiId;
	}

	public void setNguoiKiId(long nguoiKiId) {
		_nguoiKiId = nguoiKiId;
	}

	private long _id;
	private String _soKiHieu;
	private long _soVanBanId;
	private long _loaiVanBanId;
	private Date _date;
	private long _nguoiKiId;
}