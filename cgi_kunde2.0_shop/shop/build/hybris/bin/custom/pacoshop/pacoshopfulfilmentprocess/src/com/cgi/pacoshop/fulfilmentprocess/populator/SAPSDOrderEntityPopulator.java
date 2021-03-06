/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2014 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *
 *
 */
package com.cgi.pacoshop.fulfilmentprocess.populator;

import com.cgi.pacoshop.fulfilmentprocess.exceptions.SAPException;
import com.cgi.pacoshop.fulfilmentprocess.model.SAPSDOrderEntity;

import de.hybris.platform.core.model.order.AbstractOrderModel;
import de.hybris.platform.core.model.order.OrderModel;


/**
 * Defines the populator for the SAP create single order population.
 *
 * @module hybris - pacoshopcore
 * @version 1.0v Mar 04 2014
 * @author symmetrics - a CGI Group brand <info@symmetrics.de>
 * @author Phillipe Bergeron <philippe.bergeron@cgi.com>
 * @see "https://wiki.hybris.com/"
 * @copyright 2014 symmetrics - a CGI Group brand
 */
public interface SAPSDOrderEntityPopulator
{
	/**
	 * Creates a {@link SAPSDOrderEntity} from an {@link AbstractOrderModel}.
	 *
	 * @param order
	 *            the order to process.
	 * @return the {@link SAPSDOrderEntity} created.
	 * @throws SAPException
	 *             if the conversion was impossible.
	 */
	SAPSDOrderEntity populate(OrderModel order) throws SAPException;
}
