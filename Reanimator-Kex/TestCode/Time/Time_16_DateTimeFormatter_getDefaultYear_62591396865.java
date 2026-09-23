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

public class DateTimeFormatter_getDefaultYear_62591396865 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term499;
     Object term2628;

    public DateTimeFormatter_getDefaultYear_62591396865() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term516 = new Integer(-655067527);
        term499 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term500 = newInstance(Class.forName("java.util.Locale"));
        Object term501 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term499, term499.getClass(), "iPrinter", null);
        setField(term499, term499.getClass(), "iParser", null);
        setField(term501, term501.getClass(), "language", "khq");
        setField(term501, term501.getClass(), "script", "");
        setField(term501, term501.getClass(), "region", "");
        setField(term501, term501.getClass(), "variant", "");
        setIntField(term501, term501.getClass(), "hash", -1132235572);
        setField(term500, term500.getClass(), "baseLocale", term501);
        setField(term500, term500.getClass(), "localeExtensions", null);
        setIntField(term500, term500.getClass(), "hashCodeValue", -1132235572);
        setField(term500, term500.getClass(), "languageTag", null);
        setField(term499, term499.getClass(), "iLocale", term500);
        setBooleanField(term499, term499.getClass(), "iOffsetParsed", false);
        setField(term499, term499.getClass(), "iChrono", null);
        setField(term499, term499.getClass(), "iZone", null);
        setField(term499, term499.getClass(), "iPivotYear", term516);
        setIntField(term499, term499.getClass(), "iDefaultYear", -6029667);
        Integer term2639 = new Integer(-655067527);
        term2628 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term2629 = newInstance(Class.forName("java.util.Locale"));
        Object term2630 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term2628, term2628.getClass(), "iPrinter", null);
        setField(term2628, term2628.getClass(), "iParser", null);
        setField(term2630, term2630.getClass(), "language", "khq");
        setField(term2630, term2630.getClass(), "script", "");
        setField(term2630, term2630.getClass(), "region", "");
        setField(term2630, term2630.getClass(), "variant", "");
        setIntField(term2630, term2630.getClass(), "hash", -1132235572);
        setField(term2629, term2629.getClass(), "baseLocale", term2630);
        setField(term2629, term2629.getClass(), "localeExtensions", null);
        setIntField(term2629, term2629.getClass(), "hashCodeValue", -1132235572);
        setField(term2629, term2629.getClass(), "languageTag", null);
        setField(term2628, term2628.getClass(), "iLocale", term2629);
        setBooleanField(term2628, term2628.getClass(), "iOffsetParsed", false);
        setField(term2628, term2628.getClass(), "iChrono", null);
        setField(term2628, term2628.getClass(), "iZone", null);
        setField(term2628, term2628.getClass(), "iPivotYear", term2639);
        setIntField(term2628, term2628.getClass(), "iDefaultYear", -6029667);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDefaultYear", argTypes, term499, args);
        assertTrue(recursiveEquals(term499, term2628));
        assertTrue(recursiveEquals(retValue, -6029667));
    }

};


