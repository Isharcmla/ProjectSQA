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

public class LocaleUtils_isAvailableLocale_197329387215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77;
     Object term14656;

    public LocaleUtils_isAvailableLocale_197329387215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77 = newInstance(Class.forName("java.util.Locale"));
        Object term78 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term78, term78.getClass(), "language", "ee");
        setField(term78, term78.getClass(), "script", "");
        setField(term78, term78.getClass(), "region", "GH");
        setField(term78, term78.getClass(), "variant", "");
        setIntField(term78, term78.getClass(), "hash", 96354975);
        setField(term77, term77.getClass(), "baseLocale", term78);
        setField(term77, term77.getClass(), "localeExtensions", null);
        setIntField(term77, term77.getClass(), "hashCodeValue", 96354975);
        setField(term77, term77.getClass(), "languageTag", null);
        term14656 = newInstance(Class.forName("java.util.Locale"));
        Object term14657 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term14657, term14657.getClass(), "language", "ee");
        setField(term14657, term14657.getClass(), "script", "");
        setField(term14657, term14657.getClass(), "region", "GH");
        setField(term14657, term14657.getClass(), "variant", "");
        setIntField(term14657, term14657.getClass(), "hash", 96354975);
        setField(term14656, term14656.getClass(), "baseLocale", term14657);
        setField(term14656, term14656.getClass(), "localeExtensions", null);
        setIntField(term14656, term14656.getClass(), "hashCodeValue", 96354975);
        setField(term14656, term14656.getClass(), "languageTag", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.LocaleUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Locale");
        Object[] args = new Object[1];
        args[0] = term77;
        callMethod(klass, "isAvailableLocale", argTypes, null, args);
        assertTrue(recursiveEquals(term77, term14656));
    }

};


