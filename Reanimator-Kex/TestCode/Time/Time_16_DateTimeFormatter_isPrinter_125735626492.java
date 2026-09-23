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

public class DateTimeFormatter_isPrinter_125735626492 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10610;
     Object term10956;

    public DateTimeFormatter_isPrinter_125735626492() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10610 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term10734 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$StringLiteral"));
        setField(term10610, term10610.getClass(), "iPrinter", term10734);
        term10956 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term10957 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$StringLiteral"));
        setField(term10957, term10957.getClass(), "iValue", null);
        setField(term10956, term10956.getClass(), "iPrinter", term10957);
        setField(term10956, term10956.getClass(), "iParser", null);
        setField(term10956, term10956.getClass(), "iLocale", null);
        setBooleanField(term10956, term10956.getClass(), "iOffsetParsed", false);
        setField(term10956, term10956.getClass(), "iChrono", null);
        setField(term10956, term10956.getClass(), "iZone", null);
        setField(term10956, term10956.getClass(), "iPivotYear", null);
        setIntField(term10956, term10956.getClass(), "iDefaultYear", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isPrinter", argTypes, term10610, args);
        assertTrue(recursiveEquals(term10610, term10956));
        assertTrue(recursiveEquals(retValue, true));
    }

};


