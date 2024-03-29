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

package com.test.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.test.model.phongban;
import com.test.model.phongbanModel;
import com.test.model.phongbanSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the phongban service. Represents a row in the &quot;phongban&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.test.model.phongbanModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link phongbanImpl}.
 * </p>
 *
 * @author Duy Nguyen
 * @see phongbanImpl
 * @see com.test.model.phongban
 * @see com.test.model.phongbanModel
 * @generated
 */
@JSON(strict = true)
public class phongbanModelImpl extends BaseModelImpl<phongban>
	implements phongbanModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a phongban model instance should use the {@link com.test.model.phongban} interface instead.
	 */
	public static final String TABLE_NAME = "phongban";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.BIGINT },
			{ "ten", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table phongban (id LONG not null primary key,ten VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table phongban";
	public static final String ORDER_BY_JPQL = " ORDER BY phongban.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY phongban.id ASC";
	public static final String DATA_SOURCE = "danhmucDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.test.model.phongban"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.test.model.phongban"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static phongban toModel(phongbanSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		phongban model = new phongbanImpl();

		model.setId(soapModel.getId());
		model.setTen(soapModel.getTen());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<phongban> toModels(phongbanSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<phongban> models = new ArrayList<phongban>(soapModels.length);

		for (phongbanSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.test.model.phongban"));

	public phongbanModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return phongban.class;
	}

	@Override
	public String getModelClassName() {
		return phongban.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("ten", getTen());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String ten = (String)attributes.get("ten");

		if (ten != null) {
			setTen(ten);
		}
	}

	@JSON
	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;
	}

	@JSON
	@Override
	public String getTen() {
		if (_ten == null) {
			return StringPool.BLANK;
		}
		else {
			return _ten;
		}
	}

	@Override
	public void setTen(String ten) {
		_ten = ten;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			phongban.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public phongban toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (phongban)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		phongbanImpl phongbanImpl = new phongbanImpl();

		phongbanImpl.setId(getId());
		phongbanImpl.setTen(getTen());

		phongbanImpl.resetOriginalValues();

		return phongbanImpl;
	}

	@Override
	public int compareTo(phongban phongban) {
		long primaryKey = phongban.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof phongban)) {
			return false;
		}

		phongban phongban = (phongban)obj;

		long primaryKey = phongban.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<phongban> toCacheModel() {
		phongbanCacheModel phongbanCacheModel = new phongbanCacheModel();

		phongbanCacheModel.id = getId();

		phongbanCacheModel.ten = getTen();

		String ten = phongbanCacheModel.ten;

		if ((ten != null) && (ten.length() == 0)) {
			phongbanCacheModel.ten = null;
		}

		return phongbanCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", ten=");
		sb.append(getTen());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("com.test.model.phongban");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ten</column-name><column-value><![CDATA[");
		sb.append(getTen());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = phongban.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			phongban.class
		};
	private long _id;
	private String _ten;
	private phongban _escapedModel;
}