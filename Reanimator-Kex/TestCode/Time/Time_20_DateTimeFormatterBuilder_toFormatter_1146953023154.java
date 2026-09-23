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

public class DateTimeFormatterBuilder_toFormatter_1146953023154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13561;
     Object term14056;
     Object term14052;

    public DateTimeFormatterBuilder_toFormatter_1146953023154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13561 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term13685 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$StringLiteral"));
        setField(term13561, term13561.getClass(), "iFormatter", term13685);
        term14056 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term14057 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$StringLiteral"));
        setField(term14056, term14056.getClass(), "iElementPairs", null);
        setField(term14057, term14057.getClass(), "iValue", null);
        setField(term14056, term14056.getClass(), "iFormatter", term14057);
        term14052 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term14041 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$StringLiteral"));
        setField(term14041, term14041.getClass(), "iValue", null);
        setField(term14052, term14052.getClass(), "iPrinter", term14041);
        setField(term14052, term14052.getClass(), "iParser", term14041);
        setField(term14052, term14052.getClass(), "iLocale", null);
        setBooleanField(term14052, term14052.getClass(), "iOffsetParsed", false);
        setField(term14052, term14052.getClass(), "iChrono", null);
        setField(term14052, term14052.getClass(), "iZone", null);
        setField(term14052, term14052.getClass(), "iPivotYear", null);
        setIntField(term14052, term14052.getClass(), "iDefaultYear", 2000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toFormatter", argTypes, term13561, args);
        assertTrue(recursiveEquals(term13561, term14056));
        assertTrue(recursiveEquals(retValue, term14052));
    }

};


