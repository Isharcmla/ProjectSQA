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

public class DateTimeFormatter_withPivotYear_203758841062 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term422;
     Object term443;
     Object term2484;
     Object term2460;

    public DateTimeFormatter_withPivotYear_203758841062() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term440 = new Integer(-1456670397);
        term422 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term423 = newInstance(Class.forName("java.util.Locale"));
        Object term424 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term422, term422.getClass(), "iPrinter", null);
        setField(term422, term422.getClass(), "iParser", null);
        setField(term424, term424.getClass(), "language", "ru");
        setField(term424, term424.getClass(), "script", "");
        setField(term424, term424.getClass(), "region", "KZ");
        setField(term424, term424.getClass(), "variant", "");
        setIntField(term424, term424.getClass(), "hash", 108841806);
        setField(term423, term423.getClass(), "baseLocale", term424);
        setField(term423, term423.getClass(), "localeExtensions", null);
        setIntField(term423, term423.getClass(), "hashCodeValue", 108841806);
        setField(term423, term423.getClass(), "languageTag", null);
        setField(term422, term422.getClass(), "iLocale", term423);
        setBooleanField(term422, term422.getClass(), "iOffsetParsed", true);
        setField(term422, term422.getClass(), "iChrono", null);
        setField(term422, term422.getClass(), "iZone", null);
        setField(term422, term422.getClass(), "iPivotYear", term440);
        setIntField(term422, term422.getClass(), "iDefaultYear", -1685132342);
        term443 = new Integer(-1456670397);
        Integer term2495 = new Integer(-1456670397);
        term2484 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term2485 = newInstance(Class.forName("java.util.Locale"));
        Object term2486 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term2484, term2484.getClass(), "iPrinter", null);
        setField(term2484, term2484.getClass(), "iParser", null);
        setField(term2486, term2486.getClass(), "language", "ru");
        setField(term2486, term2486.getClass(), "script", "");
        setField(term2486, term2486.getClass(), "region", "KZ");
        setField(term2486, term2486.getClass(), "variant", "");
        setIntField(term2486, term2486.getClass(), "hash", 108841806);
        setField(term2485, term2485.getClass(), "baseLocale", term2486);
        setField(term2485, term2485.getClass(), "localeExtensions", null);
        setIntField(term2485, term2485.getClass(), "hashCodeValue", 108841806);
        setField(term2485, term2485.getClass(), "languageTag", null);
        setField(term2484, term2484.getClass(), "iLocale", term2485);
        setBooleanField(term2484, term2484.getClass(), "iOffsetParsed", true);
        setField(term2484, term2484.getClass(), "iChrono", null);
        setField(term2484, term2484.getClass(), "iZone", null);
        setField(term2484, term2484.getClass(), "iPivotYear", term2495);
        setIntField(term2484, term2484.getClass(), "iDefaultYear", -1685132342);
        Integer term2478 = new Integer(-1456670397);
        term2460 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term2461 = newInstance(Class.forName("java.util.Locale"));
        Object term2462 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term2460, term2460.getClass(), "iPrinter", null);
        setField(term2460, term2460.getClass(), "iParser", null);
        setField(term2462, term2462.getClass(), "language", "ru");
        setField(term2462, term2462.getClass(), "script", "");
        setField(term2462, term2462.getClass(), "region", "KZ");
        setField(term2462, term2462.getClass(), "variant", "");
        setIntField(term2462, term2462.getClass(), "hash", 108841806);
        setField(term2461, term2461.getClass(), "baseLocale", term2462);
        setField(term2461, term2461.getClass(), "localeExtensions", null);
        setIntField(term2461, term2461.getClass(), "hashCodeValue", 108841806);
        setField(term2461, term2461.getClass(), "languageTag", null);
        setField(term2460, term2460.getClass(), "iLocale", term2461);
        setBooleanField(term2460, term2460.getClass(), "iOffsetParsed", true);
        setField(term2460, term2460.getClass(), "iChrono", null);
        setField(term2460, term2460.getClass(), "iZone", null);
        setField(term2460, term2460.getClass(), "iPivotYear", term2478);
        setIntField(term2460, term2460.getClass(), "iDefaultYear", -1685132342);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term443;
        Object retValue = callMethod(klass, "withPivotYear", argTypes, term422, args);
        assertTrue(recursiveEquals(term422, term2484));
        assertTrue(recursiveEquals(term443, -1456670397));
        assertTrue(recursiveEquals(retValue, term2460));
    }

};


