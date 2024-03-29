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

package com.test.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the sovanban service. Represents a row in the &quot;sovanban&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.test.model.impl.sovanbanModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.test.model.impl.sovanbanImpl}.
 * </p>
 *
 * @author Duy Nguyen
 * @see sovanban
 * @see com.test.model.impl.sovanbanImpl
 * @see com.test.model.impl.sovanbanModelImpl
 * @generated
 */
public interface sovanbanModel extends BaseModel<sovanban> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a sovanban model instance should use the {@link sovanban} interface instead.
	 */

	/**
	 * Returns the primary key of this sovanban.
	 *
	 * @return the primary key of this sovanban
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this sovanban.
	 *
	 * @param primaryKey the primary key of this sovanban
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this sovanban.
	 *
	 * @return the ID of this sovanban
	 */
	public long getId();

	/**
	 * Sets the ID of this sovanban.
	 *
	 * @param id the ID of this sovanban
	 */
	public void setId(long id);

	/**
	 * Returns the ten of this sovanban.
	 *
	 * @return the ten of this sovanban
	 */
	@AutoEscape
	public String getTen();

	/**
	 * Sets the ten of this sovanban.
	 *
	 * @param ten the ten of this sovanban
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
	public int compareTo(com.test.model.sovanban sovanban);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.test.model.sovanban> toCacheModel();

	@Override
	public com.test.model.sovanban toEscapedModel();

	@Override
	public com.test.model.sovanban toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}