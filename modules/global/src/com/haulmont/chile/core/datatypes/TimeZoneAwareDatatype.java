/*
 * Copyright (c) 2008-2017 Haulmont.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.haulmont.chile.core.datatypes;

import javax.annotation.Nullable;
import java.text.ParseException;
import java.util.Locale;
import java.util.TimeZone;

/**
 * A {@link Datatype} that supports correct presentation with timezone.
 */
public interface TimeZoneAwareDatatype<T> {
    /** Converts value to String taking into account local formats and timezone. Returns an empty string for null value. */
    String format(@Nullable Object value, Locale locale, TimeZone timeZone);

    /** Parses value from String taking into account local formats and timezone */
    @Nullable
    T parse(@Nullable String value, Locale locale, TimeZone timeZone) throws ParseException;

}
