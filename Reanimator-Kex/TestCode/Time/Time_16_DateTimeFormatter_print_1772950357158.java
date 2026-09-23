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

public class DateTimeFormatter_print_1772950357158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28361;
     Object term28539;
     Object term29156;
     Object term29160;

    public DateTimeFormatter_print_1772950357158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term29162 = Class.forName((String) "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneId");
        Field term29161 = ((Class) term29162).getDeclaredField((String) "INSTANCE");
        ((Field) term29161).setAccessible(true);
        Object enum4 = ((Field) term29161).get((Object) null);
        term28361 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        setField(term28361, term28361.getClass(), "iPrinter", enum4);
        term28539 = newInstance(Class.forName("org.joda.time.LocalDateTime"));
        Class<? extends Object> term29473 = Class.forName((String) "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneId");
        Field term29472 = ((Class) term29473).getDeclaredField((String) "INSTANCE");
        ((Field) term29472).setAccessible(true);
        Object enum5 = ((Field) term29472).get((Object) null);
        term29156 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        setField(term29156, term29156.getClass(), "iPrinter", enum5);
        setField(term29156, term29156.getClass(), "iParser", null);
        setField(term29156, term29156.getClass(), "iLocale", null);
        setBooleanField(term29156, term29156.getClass(), "iOffsetParsed", false);
        setField(term29156, term29156.getClass(), "iChrono", null);
        setField(term29156, term29156.getClass(), "iZone", null);
        setField(term29156, term29156.getClass(), "iPivotYear", null);
        setIntField(term29156, term29156.getClass(), "iDefaultYear", 0);
        term29160 = newInstance(Class.forName("org.joda.time.LocalDateTime"));
        setLongField(term29160, term29160.getClass(), "iLocalMillis", 0L);
        setField(term29160, term29160.getClass(), "iChronology", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.ReadablePartial");
        Object[] args = new Object[1];
        args[0] = term28539;
        Object retValue = callMethod(klass, "print", argTypes, term28361, args);
        assertTrue(recursiveEquals(term28361, term29156));
        assertTrue(recursiveEquals(term28539, term29160));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


