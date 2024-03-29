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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the Sach service. Represents a row in the &quot;sach&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.thuvien.model.impl.SachModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.thuvien.model.impl.SachImpl}.
 * </p>
 *
 * @author PC
 * @see Sach
 * @see com.thuvien.model.impl.SachImpl
 * @see com.thuvien.model.impl.SachModelImpl
 * @generated
 */
public interface SachModel extends BaseModel<Sach> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a sach model instance should use the {@link Sach} interface instead.
	 */

	/**
	 * Returns the primary key of this sach.
	 *
	 * @return the primary key of this sach
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this sach.
	 *
	 * @param primaryKey the primary key of this sach
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this sach.
	 *
	 * @return the ID of this sach
	 */
	public long getId();

	/**
	 * Sets the ID of this sach.
	 *
	 * @param id the ID of this sach
	 */
	public void setId(long id);

	/**
	 * Returns the ten of this sach.
	 *
	 * @return the ten of this sach
	 */
	@AutoEscape
	public String getTen();

	/**
	 * Sets the ten of this sach.
	 *
	 * @param ten the ten of this sach
	 */
	public void setTen(String ten);

	/**
	 * Returns the ma sach of this sach.
	 *
	 * @return the ma sach of this sach
	 */
	@AutoEscape
	public String getMaSach();

	/**
	 * Sets the ma sach of this sach.
	 *
	 * @param maSach the ma sach of this sach
	 */
	public void setMaSach(String maSach);

	/**
	 * Returns the so luong of this sach.
	 *
	 * @return the so luong of this sach
	 */
	public long getSoLuong();

	/**
	 * Sets the so luong of this sach.
	 *
	 * @param soLuong the so luong of this sach
	 */
	public void setSoLuong(long soLuong);

	/**
	 * Returns the the loai of this sach.
	 *
	 * @return the the loai of this sach
	 */
	public long getTheLoai();

	/**
	 * Sets the the loai of this sach.
	 *
	 * @param theLoai the the loai of this sach
	 */
	public void setTheLoai(long theLoai);

	/**
	 * Returns the ke of this sach.
	 *
	 * @return the ke of this sach
	 */
	@AutoEscape
	public String getKe();

	/**
	 * Sets the ke of this sach.
	 *
	 * @param ke the ke of this sach
	 */
	public void setKe(String ke);

	/**
	 * Returns the tang of this sach.
	 *
	 * @return the tang of this sach
	 */
	@AutoEscape
	public String getTang();

	/**
	 * Sets the tang of this sach.
	 *
	 * @param tang the tang of this sach
	 */
	public void setTang(String tang);

	/**
	 * Returns the tac gia of this sach.
	 *
	 * @return the tac gia of this sach
	 */
	@AutoEscape
	public String getTacGia();

	/**
	 * Sets the tac gia of this sach.
	 *
	 * @param tacGia the tac gia of this sach
	 */
	public void setTacGia(String tacGia);

	/**
	 * Returns the nha xuat ban of this sach.
	 *
	 * @return the nha xuat ban of this sach
	 */
	@AutoEscape
	public String getNhaXuatBan();

	/**
	 * Sets the nha xuat ban of this sach.
	 *
	 * @param nhaXuatBan the nha xuat ban of this sach
	 */
	public void setNhaXuatBan(String nhaXuatBan);

	/**
	 * Returns the so luong conlai of this sach.
	 *
	 * @return the so luong conlai of this sach
	 */
	public long getSoLuongConlai();

	/**
	 * Sets the so luong conlai of this sach.
	 *
	 * @param soLuongConlai the so luong conlai of this sach
	 */
	public void setSoLuongConlai(long soLuongConlai);

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
	public int compareTo(com.thuvien.model.Sach sach);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.thuvien.model.Sach> toCacheModel();

	@Override
	public com.thuvien.model.Sach toEscapedModel();

	@Override
	public com.thuvien.model.Sach toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}