package org.apache.commons.lang3;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static org.apache.commons.lang3.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;

public class LocaleUtils_localeLookupList_164143596111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23;
     Object term469;
     Object term460;

    public LocaleUtils_localeLookupList_164143596111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23 = newInstance(Class.forName("java.util.Locale"));
        Object term24 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term24, term24.getClass(), "language", "pt");
        setField(term24, term24.getClass(), "script", "");
        setField(term24, term24.getClass(), "region", "MO");
        setField(term24, term24.getClass(), "variant", "");
        setIntField(term24, term24.getClass(), "hash", 106966554);
        setField(term23, term23.getClass(), "baseLocale", term24);
        setField(term23, term23.getClass(), "localeExtensions", null);
        setIntField(term23, term23.getClass(), "hashCodeValue", 106966554);
        setField(term23, term23.getClass(), "languageTag", null);
        term469 = newInstance(Class.forName("java.util.Locale"));
        Object term470 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term470, term470.getClass(), "language", null);
        setField(term470, term470.getClass(), "script", null);
        setField(term470, term470.getClass(), "region", null);
        setField(term470, term470.getClass(), "variant", null);
        setIntField(term470, term470.getClass(), "hash", 106966554);
        setField(term469, term469.getClass(), "baseLocale", term470);
        setField(term469, term469.getClass(), "localeExtensions", null);
        setIntField(term469, term469.getClass(), "hashCodeValue", 106966554);
        setField(term469, term469.getClass(), "languageTag", null);
        Object term456 = newInstance(Class.forName("java.util.Locale"));
        Object term457 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term457, term457.getClass(), "language", null);
        setField(term457, term457.getClass(), "script", null);
        setField(term457, term457.getClass(), "region", null);
        setField(term457, term457.getClass(), "variant", null);
        setIntField(term457, term457.getClass(), "hash", 106966554);
        setField(term456, term456.getClass(), "baseLocale", term457);
        setField(term456, term456.getClass(), "localeExtensions", null);
        setIntField(term456, term456.getClass(), "hashCodeValue", 106966554);
        setField(term456, term456.getClass(), "languageTag", null);
        Object term463 = newInstance(Class.forName("java.util.Locale"));
        Object term464 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term464, term464.getClass(), "language", null);
        setField(term464, term464.getClass(), "script", null);
        setField(term464, term464.getClass(), "region", null);
        setField(term464, term464.getClass(), "variant", null);
        setIntField(term464, term464.getClass(), "hash", 106890108);
        setField(term463, term463.getClass(), "baseLocale", term464);
        setField(term463, term463.getClass(), "localeExtensions", null);
        setIntField(term463, term463.getClass(), "hashCodeValue", 0);
        setField(term463, term463.getClass(), "languageTag", null);
        ArrayList term461 = new ArrayList();
        ((ArrayList) term461).add(term456);
        ((ArrayList) term461).add(term463);
        term460 = newInstance(Class.forName("java.util.Collections$UnmodifiableRandomAccessList"));
        setField(term460, term460.getClass(), "list", term461);
        setField(term460, term460.getClass(), "c", term461);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.LocaleUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Locale");
        Object[] args = new Object[1];
        args[0] = term23;
        Object retValue = callMethod(klass, "localeLookupList", argTypes, null, args);
        assertTrue(recursiveEquals(term23, term469));
        assertTrue(recursiveEquals(retValue, term460));
    }

};


