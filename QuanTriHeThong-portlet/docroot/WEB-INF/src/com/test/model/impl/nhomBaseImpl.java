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

import com.liferay.portal.kernel.exception.SystemException;

import com.test.model.nhom;

import com.test.service.nhomLocalServiceUtil;

/**
 * The extended model base implementation for the nhom service. Represents a row in the &quot;nhom&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link nhomImpl}.
 * </p>
 *
 * @author Duy Nguyen
 * @see nhomImpl
 * @see com.test.model.nhom
 * @generated
 */
public abstract class nhomBaseImpl extends nhomModelImpl implements nhom {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a nhom model instance should use the {@link nhom} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			nhomLocalServiceUtil.addnhom(this);
		}
		else {
			nhomLocalServiceUtil.updatenhom(this);
		}
	}
}