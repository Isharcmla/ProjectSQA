package org.apache.commons.lang;

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
import static org.apache.commons.lang.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;

public class LocaleUtils_localeLookupList_128625482011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23;
     Object term471;
     Object term462;

    public LocaleUtils_localeLookupList_128625482011() {
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
        term471 = newInstance(Class.forName("java.util.Locale"));
        Object term472 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term472, term472.getClass(), "language", null);
        setField(term472, term472.getClass(), "script", null);
        setField(term472, term472.getClass(), "region", null);
        setField(term472, term472.getClass(), "variant", null);
        setIntField(term472, term472.getClass(), "hash", 106966554);
        setField(term471, term471.getClass(), "baseLocale", term472);
        setField(term471, term471.getClass(), "localeExtensions", null);
        setIntField(term471, term471.getClass(), "hashCodeValue", 106966554);
        setField(term471, term471.getClass(), "languageTag", null);
        Object term458 = newInstance(Class.forName("java.util.Locale"));
        Object term459 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term459, term459.getClass(), "language", null);
        setField(term459, term459.getClass(), "script", null);
        setField(term459, term459.getClass(), "region", null);
        setField(term459, term459.getClass(), "variant", null);
        setIntField(term459, term459.getClass(), "hash", 106966554);
        setField(term458, term458.getClass(), "baseLocale", term459);
        setField(term458, term458.getClass(), "localeExtensions", null);
        setIntField(term458, term458.getClass(), "hashCodeValue", 106966554);
        setField(term458, term458.getClass(), "languageTag", null);
        Object term465 = newInstance(Class.forName("java.util.Locale"));
        Object term466 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term466, term466.getClass(), "language", null);
        setField(term466, term466.getClass(), "script", null);
        setField(term466, term466.getClass(), "region", null);
        setField(term466, term466.getClass(), "variant", null);
        setIntField(term466, term466.getClass(), "hash", 106890108);
        setField(term465, term465.getClass(), "baseLocale", term466);
        setField(term465, term465.getClass(), "localeExtensions", null);
        setIntField(term465, term465.getClass(), "hashCodeValue", 0);
        setField(term465, term465.getClass(), "languageTag", null);
        ArrayList term463 = new ArrayList();
        ((ArrayList) term463).add(term458);
        ((ArrayList) term463).add(term465);
        term462 = newInstance(Class.forName("java.util.Collections$UnmodifiableRandomAccessList"));
        setField(term462, term462.getClass(), "list", term463);
        setField(term462, term462.getClass(), "c", term463);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.LocaleUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Locale");
        Object[] args = new Object[1];
        args[0] = term23;
        Object retValue = callMethod(klass, "localeLookupList", argTypes, null, args);
        assertTrue(recursiveEquals(term23, term471));
        assertTrue(recursiveEquals(retValue, term462));
    }

};


