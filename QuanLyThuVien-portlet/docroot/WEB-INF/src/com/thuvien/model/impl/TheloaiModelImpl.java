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

package com.thuvien.model.impl;

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

import com.thuvien.model.Theloai;
import com.thuvien.model.TheloaiModel;
import com.thuvien.model.TheloaiSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Theloai service. Represents a row in the &quot;theloai&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.thuvien.model.TheloaiModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TheloaiImpl}.
 * </p>
 *
 * @author PC
 * @see TheloaiImpl
 * @see com.thuvien.model.Theloai
 * @see com.thuvien.model.TheloaiModel
 * @generated
 */
@JSON(strict = true)
public class TheloaiModelImpl extends BaseModelImpl<Theloai>
	implements TheloaiModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a theloai model instance should use the {@link com.thuvien.model.Theloai} interface instead.
	 */
	public static final String TABLE_NAME = "theloai";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.BIGINT },
			{ "ten", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table theloai (id LONG not null primary key,ten VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table theloai";
	public static final String ORDER_BY_JPQL = " ORDER BY theloai.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY theloai.id ASC";
	public static final String DATA_SOURCE = "qlythuvienDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.thuvien.model.Theloai"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.thuvien.model.Theloai"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Theloai toModel(TheloaiSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Theloai model = new TheloaiImpl();

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
	public static List<Theloai> toModels(TheloaiSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Theloai> models = new ArrayList<Theloai>(soapModels.length);

		for (TheloaiSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.thuvien.model.Theloai"));

	public TheloaiModelImpl() {
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
		return Theloai.class;
	}

	@Override
	public String getModelClassName() {
		return Theloai.class.getName();
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
			Theloai.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Theloai toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Theloai)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		TheloaiImpl theloaiImpl = new TheloaiImpl();

		theloaiImpl.setId(getId());
		theloaiImpl.setTen(getTen());

		theloaiImpl.resetOriginalValues();

		return theloaiImpl;
	}

	@Override
	public int compareTo(Theloai theloai) {
		long primaryKey = theloai.getPrimaryKey();

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

		if (!(obj instanceof Theloai)) {
			return false;
		}

		Theloai theloai = (Theloai)obj;

		long primaryKey = theloai.getPrimaryKey();

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
	public CacheModel<Theloai> toCacheModel() {
		TheloaiCacheModel theloaiCacheModel = new TheloaiCacheModel();

		theloaiCacheModel.id = getId();

		theloaiCacheModel.ten = getTen();

		String ten = theloaiCacheModel.ten;

		if ((ten != null) && (ten.length() == 0)) {
			theloaiCacheModel.ten = null;
		}

		return theloaiCacheModel;
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
		sb.append("com.thuvien.model.Theloai");
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

	private static ClassLoader _classLoader = Theloai.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			Theloai.class
		};
	private long _id;
	private String _ten;
	private Theloai _escapedModel;
}