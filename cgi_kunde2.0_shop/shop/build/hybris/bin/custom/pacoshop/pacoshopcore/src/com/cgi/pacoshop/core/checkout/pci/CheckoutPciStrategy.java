/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2013 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *
 *
 */
package com.cgi.pacoshop.core.checkout.pci;

import com.cgi.pacoshop.core.enums.CheckoutPciOptionEnum;


/**
 *
 *
 * @module pacoshopcore
 * @version 1.0v Jan 06, 2014
 * @author symmetrics - a CGI Group brand <info@symmetrics.de>
 * @link http://www.symmetrics.de/
 * @see        " https://wiki.hybris.com/
 * @copyright 2014 symmetrics - a CGI Group brand
 *
 *
 */
public interface CheckoutPciStrategy
{
	/**
	 * Gets subscription PCI Option.
	 * @return CheckoutPciOptionEnum
	 */
	CheckoutPciOptionEnum getSubscriptionPciOption();
}
