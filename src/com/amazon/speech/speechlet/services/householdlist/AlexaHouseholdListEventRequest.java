/*
 * Copyright 2016-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use
 * this file except in compliance with the License. A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0/
 *
 * or in the "license" file accompanying this file. This file is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazon.speech.speechlet.services.householdlist;

import com.amazon.speech.speechlet.SpeechletRequest;

import java.util.Date;
import java.util.Locale;

public class AlexaHouseholdListEventRequest extends SpeechletRequest {
    protected AlexaHouseholdListEventRequest(SpeechletRequest.SpeechletRequestBuilder builder) {
        super(builder);
    }

    protected AlexaHouseholdListEventRequest(String requestId, Date timestamp, Locale locale) {
        super(requestId, timestamp, locale);
    }

}

