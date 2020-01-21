/*
    Copyright 2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.

    Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file
    except in compliance with the License. A copy of the License is located at

        http://aws.amazon.com/apache2.0/

    or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for
    the specific language governing permissions and limitations under the License.
*/

package com.amazon.ask.utils;

import com.amazon.ask.model.services.Pair;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Utility class to provide header values retrieval.
 */
public final class Utils {

    /**
     * Prevent instantiation.
     */
    private Utils() { }

    /**
     * Returns the value of the requested key from the response header. If multiple values exist, returns all values
     * as list of strings. Returns empty list if no matching key is found.
     * @param headers list of headers represented as key values pairs.
     * @param key header with key.
     * @return list of values which match the input key.
     */
    public static List<String> getValuesByKey(final List<Pair<String, String>> headers, final String key) {
        if (headers == null || key == null) {
            return Collections.emptyList();
        }
        return headers.stream()
                .filter(pair -> pair.getName().equals(key))
                .map(Pair::getValue)
                .collect(Collectors.toList());
    }
}
