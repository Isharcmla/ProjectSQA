package org.joda.time.format;

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
import static org.joda.time.format.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.joda.time.format.EqualityUtils.*;
import java.lang.Object;
import java.lang.Integer;

public class DateTimeFormatter_getChronolgy_34647338157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term303;
     Object term2128;

    public DateTimeFormatter_getChronolgy_34647338157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term321 = new Integer(-522618178);
        term303 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term304 = newInstance(Class.forName("java.util.Locale"));
        Object term305 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term303, term303.getClass(), "iPrinter", null);
        setField(term303, term303.getClass(), "iParser", null);
        setField(term305, term305.getClass(), "language", "en");
        setField(term305, term305.getClass(), "script", "");
        setField(term305, term305.getClass(), "region", "ZW");
        setField(term305, term305.getClass(), "variant", "");
        setIntField(term305, term305.getClass(), "hash", 96641818);
        setField(term304, term304.getClass(), "baseLocale", term305);
        setField(term304, term304.getClass(), "localeExtensions", null);
        setIntField(term304, term304.getClass(), "hashCodeValue", 96641818);
        setField(term304, term304.getClass(), "languageTag", null);
        setField(term303, term303.getClass(), "iLocale", term304);
        setBooleanField(term303, term303.getClass(), "iOffsetParsed", true);
        setField(term303, term303.getClass(), "iChrono", null);
        setField(term303, term303.getClass(), "iZone", null);
        setField(term303, term303.getClass(), "iPivotYear", term321);
        setIntField(term303, term303.getClass(), "iDefaultYear", -522618178);
        Integer term2139 = new Integer(-522618178);
        term2128 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term2129 = newInstance(Class.forName("java.util.Locale"));
        Object term2130 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term2128, term2128.getClass(), "iPrinter", null);
        setField(term2128, term2128.getClass(), "iParser", null);
        setField(term2130, term2130.getClass(), "language", "en");
        setField(term2130, term2130.getClass(), "script", "");
        setField(term2130, term2130.getClass(), "region", "ZW");
        setField(term2130, term2130.getClass(), "variant", "");
        setIntField(term2130, term2130.getClass(), "hash", 96641818);
        setField(term2129, term2129.getClass(), "baseLocale", term2130);
        setField(term2129, term2129.getClass(), "localeExtensions", null);
        setIntField(term2129, term2129.getClass(), "hashCodeValue", 96641818);
        setField(term2129, term2129.getClass(), "languageTag", null);
        setField(term2128, term2128.getClass(), "iLocale", term2129);
        setBooleanField(term2128, term2128.getClass(), "iOffsetParsed", true);
        setField(term2128, term2128.getClass(), "iChrono", null);
        setField(term2128, term2128.getClass(), "iZone", null);
        setField(term2128, term2128.getClass(), "iPivotYear", term2139);
        setIntField(term2128, term2128.getClass(), "iDefaultYear", -522618178);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getChronolgy", argTypes, term303, args);
        assertTrue(recursiveEquals(term303, term2128));
        assertTrue(recursiveEquals(retValue, null));
    }

};


