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

public class DateTimeFormatterBuilder_toPrinter_2074353183233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29848;
     Object term29982;
     Object term29976;

    public DateTimeFormatterBuilder_toPrinter_2074353183233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29848 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term29972 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$StringLiteral"));
        setField(term29848, term29848.getClass(), "iFormatter", term29972);
        term29982 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term29983 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$StringLiteral"));
        setField(term29982, term29982.getClass(), "iElementPairs", null);
        setField(term29983, term29983.getClass(), "iValue", null);
        setField(term29982, term29982.getClass(), "iFormatter", term29983);
        term29976 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$StringLiteral"));
        setField(term29976, term29976.getClass(), "iValue", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toPrinter", argTypes, term29848, args);
        assertTrue(recursiveEquals(term29848, term29982));
        assertTrue(recursiveEquals(retValue, term29976));
    }

};


