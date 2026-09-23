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
import java.lang.UnsupportedOperationException;
import static org.joda.time.format.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class DateTimeFormatter_printTo_84260732374 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term890;

    public DateTimeFormatter_printTo_84260732374() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term909 = new Integer(-244121226);
        term890 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term891 = newInstance(Class.forName("java.util.Locale"));
        Object term892 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        setField(term890, term890.getClass(), "iPrinter", null);
        setField(term890, term890.getClass(), "iParser", null);
        setField(term892, term892.getClass(), "language", "fur");
        setField(term892, term892.getClass(), "script", "");
        setField(term892, term892.getClass(), "region", "IT");
        setField(term892, term892.getClass(), "variant", "");
        setIntField(term892, term892.getClass(), "hash", -1263273006);
        setField(term891, term891.getClass(), "baseLocale", term892);
        setField(term891, term891.getClass(), "localeExtensions", null);
        setIntField(term891, term891.getClass(), "hashCodeValue", -1263273006);
        setField(term891, term891.getClass(), "languageTag", null);
        setField(term890, term890.getClass(), "iLocale", term891);
        setBooleanField(term890, term890.getClass(), "iOffsetParsed", true);
        setField(term890, term890.getClass(), "iChrono", null);
        setField(term890, term890.getClass(), "iZone", null);
        setField(term890, term890.getClass(), "iPivotYear", term909);
        setIntField(term890, term890.getClass(), "iDefaultYear", -226514366);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = Class.forName("org.joda.time.ReadablePartial");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "printTo", argTypes, term890, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


