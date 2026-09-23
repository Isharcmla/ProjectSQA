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

public class DateTimeFormatter_withDefaultYear_46314341764 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term474;
     Object term494;
     Object term2616;
     Object term2551;

    public DateTimeFormatter_withDefaultYear_46314341764() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term491 = new Integer(1048535127);
        term474 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term475 = newInstance(Class.forName("java.util.Locale"));
        Object term476 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term474, term474.getClass(), "iPrinter", null);
        setField(term474, term474.getClass(), "iParser", null);
        setField(term476, term476.getClass(), "language", "ses");
        setField(term476, term476.getClass(), "script", "");
        setField(term476, term476.getClass(), "region", "");
        setField(term476, term476.getClass(), "variant", "");
        setIntField(term476, term476.getClass(), "hash", -905913345);
        setField(term475, term475.getClass(), "baseLocale", term476);
        setField(term475, term475.getClass(), "localeExtensions", null);
        setIntField(term475, term475.getClass(), "hashCodeValue", -905913345);
        setField(term475, term475.getClass(), "languageTag", null);
        setField(term474, term474.getClass(), "iLocale", term475);
        setBooleanField(term474, term474.getClass(), "iOffsetParsed", false);
        setField(term474, term474.getClass(), "iChrono", null);
        setField(term474, term474.getClass(), "iZone", null);
        setField(term474, term474.getClass(), "iPivotYear", term491);
        setIntField(term474, term474.getClass(), "iDefaultYear", 1048535127);
        term494 = new Integer(-655067527);
        Integer term2627 = new Integer(1048535127);
        term2616 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term2617 = newInstance(Class.forName("java.util.Locale"));
        Object term2618 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term2616, term2616.getClass(), "iPrinter", null);
        setField(term2616, term2616.getClass(), "iParser", null);
        setField(term2618, term2618.getClass(), "language", "ses");
        setField(term2618, term2618.getClass(), "script", "");
        setField(term2618, term2618.getClass(), "region", "");
        setField(term2618, term2618.getClass(), "variant", "");
        setIntField(term2618, term2618.getClass(), "hash", -905913345);
        setField(term2617, term2617.getClass(), "baseLocale", term2618);
        setField(term2617, term2617.getClass(), "localeExtensions", null);
        setIntField(term2617, term2617.getClass(), "hashCodeValue", -905913345);
        setField(term2617, term2617.getClass(), "languageTag", null);
        setField(term2616, term2616.getClass(), "iLocale", term2617);
        setBooleanField(term2616, term2616.getClass(), "iOffsetParsed", false);
        setField(term2616, term2616.getClass(), "iChrono", null);
        setField(term2616, term2616.getClass(), "iZone", null);
        setField(term2616, term2616.getClass(), "iPivotYear", term2627);
        setIntField(term2616, term2616.getClass(), "iDefaultYear", 1048535127);
        Integer term2568 = new Integer(1048535127);
        term2551 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term2552 = newInstance(Class.forName("java.util.Locale"));
        Object term2553 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term2551, term2551.getClass(), "iPrinter", null);
        setField(term2551, term2551.getClass(), "iParser", null);
        setField(term2553, term2553.getClass(), "language", "ses");
        setField(term2553, term2553.getClass(), "script", "");
        setField(term2553, term2553.getClass(), "region", "");
        setField(term2553, term2553.getClass(), "variant", "");
        setIntField(term2553, term2553.getClass(), "hash", -905913345);
        setField(term2552, term2552.getClass(), "baseLocale", term2553);
        setField(term2552, term2552.getClass(), "localeExtensions", null);
        setIntField(term2552, term2552.getClass(), "hashCodeValue", -905913345);
        setField(term2552, term2552.getClass(), "languageTag", null);
        setField(term2551, term2551.getClass(), "iLocale", term2552);
        setBooleanField(term2551, term2551.getClass(), "iOffsetParsed", false);
        setField(term2551, term2551.getClass(), "iChrono", null);
        setField(term2551, term2551.getClass(), "iZone", null);
        setField(term2551, term2551.getClass(), "iPivotYear", term2568);
        setIntField(term2551, term2551.getClass(), "iDefaultYear", -655067527);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term494;
        Object retValue = callMethod(klass, "withDefaultYear", argTypes, term474, args);
        assertTrue(recursiveEquals(term474, term2616));
        assertTrue(recursiveEquals(term494, -655067527));
        assertTrue(recursiveEquals(retValue, term2551));
    }

};


