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

package com.thuvien.model;

import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Phieumuon service. Represents a row in the &quot;phieumuon&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.thuvien.model.impl.PhieumuonModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.thuvien.model.impl.PhieumuonImpl}.
 * </p>
 *
 * @author PC
 * @see Phieumuon
 * @see com.thuvien.model.impl.PhieumuonImpl
 * @see com.thuvien.model.impl.PhieumuonModelImpl
 * @generated
 */
public interface PhieumuonModel extends BaseModel<Phieumuon> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a phieumuon model instance should use the {@link Phieumuon} interface instead.
	 */

	/**
	 * Returns the primary key of this phieumuon.
	 *
	 * @return the primary key of this phieumuon
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this phieumuon.
	 *
	 * @param primaryKey the primary key of this phieumuon
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this phieumuon.
	 *
	 * @return the ID of this phieumuon
	 */
	public long getId();

	/**
	 * Sets the ID of this phieumuon.
	 *
	 * @param id the ID of this phieumuon
	 */
	public void setId(long id);

	/**
	 * Returns the nguoi dung of this phieumuon.
	 *
	 * @return the nguoi dung of this phieumuon
	 */
	public long getNguoiDung();

	/**
	 * Sets the nguoi dung of this phieumuon.
	 *
	 * @param nguoiDung the nguoi dung of this phieumuon
	 */
	public void setNguoiDung(long nguoiDung);

	/**
	 * Returns the sach of this phieumuon.
	 *
	 * @return the sach of this phieumuon
	 */
	public long getSach();

	/**
	 * Sets the sach of this phieumuon.
	 *
	 * @param sach the sach of this phieumuon
	 */
	public void setSach(long sach);

	/**
	 * Returns the so luong of this phieumuon.
	 *
	 * @return the so luong of this phieumuon
	 */
	public long getSoLuong();

	/**
	 * Sets the so luong of this phieumuon.
	 *
	 * @param soLuong the so luong of this phieumuon
	 */
	public void setSoLuong(long soLuong);

	/**
	 * Returns the ngay muon of this phieumuon.
	 *
	 * @return the ngay muon of this phieumuon
	 */
	public Date getNgayMuon();

	/**
	 * Sets the ngay muon of this phieumuon.
	 *
	 * @param ngayMuon the ngay muon of this phieumuon
	 */
	public void setNgayMuon(Date ngayMuon);

	/**
	 * Returns the ngay tra of this phieumuon.
	 *
	 * @return the ngay tra of this phieumuon
	 */
	public Date getNgayTra();

	/**
	 * Sets the ngay tra of this phieumuon.
	 *
	 * @param ngayTra the ngay tra of this phieumuon
	 */
	public void setNgayTra(Date ngayTra);

	/**
	 * Returns the xac nhan of this phieumuon.
	 *
	 * @return the xac nhan of this phieumuon
	 */
	public long getXacNhan();

	/**
	 * Sets the xac nhan of this phieumuon.
	 *
	 * @param xacNhan the xac nhan of this phieumuon
	 */
	public void setXacNhan(long xacNhan);

	/**
	 * Returns the trang thai of this phieumuon.
	 *
	 * @return the trang thai of this phieumuon
	 */
	public long getTrangThai();

	/**
	 * Sets the trang thai of this phieumuon.
	 *
	 * @param trangThai the trang thai of this phieumuon
	 */
	public void setTrangThai(long trangThai);

	/**
	 * Returns the duyet muon of this phieumuon.
	 *
	 * @return the duyet muon of this phieumuon
	 */
	public long getDuyetMuon();

	/**
	 * Sets the duyet muon of this phieumuon.
	 *
	 * @param duyetMuon the duyet muon of this phieumuon
	 */
	public void setDuyetMuon(long duyetMuon);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(com.thuvien.model.Phieumuon phieumuon);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.thuvien.model.Phieumuon> toCacheModel();

	@Override
	public com.thuvien.model.Phieumuon toEscapedModel();

	@Override
	public com.thuvien.model.Phieumuon toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}