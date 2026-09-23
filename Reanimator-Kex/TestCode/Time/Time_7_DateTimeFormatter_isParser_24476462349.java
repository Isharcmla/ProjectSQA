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

public class DateTimeFormatter_isParser_24476462349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71;
     Object term1661;

    public DateTimeFormatter_isParser_24476462349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term89 = new Integer(391863371);
        term71 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term72 = newInstance(Class.forName("java.util.Locale"));
        Object term73 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term71, term71.getClass(), "iPrinter", null);
        setField(term71, term71.getClass(), "iParser", null);
        setField(term73, term73.getClass(), "language", "ee");
        setField(term73, term73.getClass(), "script", "");
        setField(term73, term73.getClass(), "region", "GH");
        setField(term73, term73.getClass(), "variant", "");
        setIntField(term73, term73.getClass(), "hash", 96354975);
        setField(term72, term72.getClass(), "baseLocale", term73);
        setField(term72, term72.getClass(), "localeExtensions", null);
        setIntField(term72, term72.getClass(), "hashCodeValue", 96354975);
        setField(term72, term72.getClass(), "languageTag", null);
        setField(term71, term71.getClass(), "iLocale", term72);
        setBooleanField(term71, term71.getClass(), "iOffsetParsed", false);
        setField(term71, term71.getClass(), "iChrono", null);
        setField(term71, term71.getClass(), "iZone", null);
        setField(term71, term71.getClass(), "iPivotYear", term89);
        setIntField(term71, term71.getClass(), "iDefaultYear", 391863371);
        Integer term1672 = new Integer(391863371);
        term1661 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term1662 = newInstance(Class.forName("java.util.Locale"));
        Object term1663 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term1661, term1661.getClass(), "iPrinter", null);
        setField(term1661, term1661.getClass(), "iParser", null);
        setField(term1663, term1663.getClass(), "language", "ee");
        setField(term1663, term1663.getClass(), "script", "");
        setField(term1663, term1663.getClass(), "region", "GH");
        setField(term1663, term1663.getClass(), "variant", "");
        setIntField(term1663, term1663.getClass(), "hash", 96354975);
        setField(term1662, term1662.getClass(), "baseLocale", term1663);
        setField(term1662, term1662.getClass(), "localeExtensions", null);
        setIntField(term1662, term1662.getClass(), "hashCodeValue", 96354975);
        setField(term1662, term1662.getClass(), "languageTag", null);
        setField(term1661, term1661.getClass(), "iLocale", term1662);
        setBooleanField(term1661, term1661.getClass(), "iOffsetParsed", false);
        setField(term1661, term1661.getClass(), "iChrono", null);
        setField(term1661, term1661.getClass(), "iZone", null);
        setField(term1661, term1661.getClass(), "iPivotYear", term1672);
        setIntField(term1661, term1661.getClass(), "iDefaultYear", 391863371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isParser", argTypes, term71, args);
        assertTrue(recursiveEquals(term71, term1661));
        assertTrue(recursiveEquals(retValue, false));
    }

};


