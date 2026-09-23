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
import java.lang.String;
import java.lang.Object;

public class DateTimeFormatter_printTo_563897694174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33014;
     Object term33180;
     Object term33945;
     Object term33949;

    public DateTimeFormatter_printTo_563897694174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term33951 = Class.forName((String) "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneId");
        Field term33950 = ((Class) term33951).getDeclaredField((String) "INSTANCE");
        ((Field) term33950).setAccessible(true);
        Object enum7 = ((Field) term33950).get((Object) null);
        term33014 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        setField(term33014, term33014.getClass(), "iPrinter", enum7);
        term33180 = newInstance(Class.forName("org.joda.time.Partial"));
        Class<? extends Object> term34262 = Class.forName((String) "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneId");
        Field term34261 = ((Class) term34262).getDeclaredField((String) "INSTANCE");
        ((Field) term34261).setAccessible(true);
        Object enum8 = ((Field) term34261).get((Object) null);
        term33945 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        setField(term33945, term33945.getClass(), "iPrinter", enum8);
        setField(term33945, term33945.getClass(), "iParser", null);
        setField(term33945, term33945.getClass(), "iLocale", null);
        setBooleanField(term33945, term33945.getClass(), "iOffsetParsed", false);
        setField(term33945, term33945.getClass(), "iChrono", null);
        setField(term33945, term33945.getClass(), "iZone", null);
        setField(term33945, term33945.getClass(), "iPivotYear", null);
        setIntField(term33945, term33945.getClass(), "iDefaultYear", 0);
        term33949 = newInstance(Class.forName("org.joda.time.Partial"));
        setField(term33949, term33949.getClass(), "iChronology", null);
        setField(term33949, term33949.getClass(), "iTypes", null);
        setField(term33949, term33949.getClass(), "iValues", null);
        setField(term33949, term33949.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.Writer");
        argTypes[1] = Class.forName("org.joda.time.ReadablePartial");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term33180;
        callMethod(klass, "printTo", argTypes, term33014, args);
        assertTrue(recursiveEquals(term33014, term33945));
        assertTrue(recursiveEquals(term33180, term33949));
    }

};


