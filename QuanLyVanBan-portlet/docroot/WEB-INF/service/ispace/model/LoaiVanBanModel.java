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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the LoaiVanBan service. Represents a row in the &quot;loaivanban&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link ispace.model.impl.LoaiVanBanModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ispace.model.impl.LoaiVanBanImpl}.
 * </p>
 *
 * @author PC
 * @see LoaiVanBan
 * @see ispace.model.impl.LoaiVanBanImpl
 * @see ispace.model.impl.LoaiVanBanModelImpl
 * @generated
 */
public interface LoaiVanBanModel extends BaseModel<LoaiVanBan> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a loai van ban model instance should use the {@link LoaiVanBan} interface instead.
	 */

	/**
	 * Returns the primary key of this loai van ban.
	 *
	 * @return the primary key of this loai van ban
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this loai van ban.
	 *
	 * @param primaryKey the primary key of this loai van ban
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this loai van ban.
	 *
	 * @return the ID of this loai van ban
	 */
	public long getId();

	/**
	 * Sets the ID of this loai van ban.
	 *
	 * @param id the ID of this loai van ban
	 */
	public void setId(long id);

	/**
	 * Returns the ten of this loai van ban.
	 *
	 * @return the ten of this loai van ban
	 */
	@AutoEscape
	public String getTen();

	/**
	 * Sets the ten of this loai van ban.
	 *
	 * @param ten the ten of this loai van ban
	 */
	public void setTen(String ten);

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
	public int compareTo(ispace.model.LoaiVanBan loaiVanBan);

	@Override
	public int hashCode();

	@Override
	public CacheModel<ispace.model.LoaiVanBan> toCacheModel();

	@Override
	public ispace.model.LoaiVanBan toEscapedModel();

	@Override
	public ispace.model.LoaiVanBan toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}