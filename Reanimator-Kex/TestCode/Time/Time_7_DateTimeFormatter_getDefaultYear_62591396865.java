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
     Object term2637;

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
        Integer term2648 = new Integer(-655067527);
        term2637 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term2638 = newInstance(Class.forName("java.util.Locale"));
        Object term2639 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term2637, term2637.getClass(), "iPrinter", null);
        setField(term2637, term2637.getClass(), "iParser", null);
        setField(term2639, term2639.getClass(), "language", "khq");
        setField(term2639, term2639.getClass(), "script", "");
        setField(term2639, term2639.getClass(), "region", "");
        setField(term2639, term2639.getClass(), "variant", "");
        setIntField(term2639, term2639.getClass(), "hash", -1132235572);
        setField(term2638, term2638.getClass(), "baseLocale", term2639);
        setField(term2638, term2638.getClass(), "localeExtensions", null);
        setIntField(term2638, term2638.getClass(), "hashCodeValue", -1132235572);
        setField(term2638, term2638.getClass(), "languageTag", null);
        setField(term2637, term2637.getClass(), "iLocale", term2638);
        setBooleanField(term2637, term2637.getClass(), "iOffsetParsed", false);
        setField(term2637, term2637.getClass(), "iChrono", null);
        setField(term2637, term2637.getClass(), "iZone", null);
        setField(term2637, term2637.getClass(), "iPivotYear", term2648);
        setIntField(term2637, term2637.getClass(), "iDefaultYear", -6029667);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDefaultYear", argTypes, term499, args);
        assertTrue(recursiveEquals(term499, term2637));
        assertTrue(recursiveEquals(retValue, -6029667));
    }

};


