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
package com.cgi.pacoshop.core.daos;


import com.cgi.pacoshop.core.model.FingerprintSecretModel;

/**
 * Interface for DeeplinkFingerprintSecretDao - methods to find fingerprint secrets by fingerPrintSecretNo.
 *
 * @module kunde_new
 * @version 1.0v Apr 02, 2014
 * @author symmetrics - a CGI Group brand <info@symmetrics.de>
 * @author Alexandr Ionov <alexandr.ionov@symmetrics.de>
 * @link http://www.symmetrics.de/
 * @see https://wiki.hybris.com/
 * @copyright 2014 symmetrics - a CGI Group brand
 *
 *
 */
public interface DeeplinkFingerprintSecretDao
{
	/**
	 * Method to find FingerprintSecretModel by fingerPrintSecretNo.
	 *
	 * @param fingerprintSecretNo - fingerprintSecretNo
	 * @return DeeplinkFingerprintModel for given fingerprintSecretNo
	 */
	FingerprintSecretModel getFingerprintSecretByNumber(String fingerprintSecretNo);
}
