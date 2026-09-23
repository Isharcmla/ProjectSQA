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
import java.lang.NullPointerException;
import static org.joda.time.format.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class DateTimeFormatterBuilder_append_58061458489 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91618;
     Object term91428;

    public DateTimeFormatterBuilder_append_58061458489() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91618 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Class<? extends Object> term93813 = Class.forName((String) "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneId");
        Field term93812 = ((Class) term93813).getDeclaredField((String) "INSTANCE");
        ((Field) term93812).setAccessible(true);
        Object enum39 = ((Field) term93812).get((Object) null);
        Class<? extends Object> term94124 = Class.forName((String) "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneId");
        Field term94123 = ((Class) term94124).getDeclaredField((String) "INSTANCE");
        ((Field) term94123).setAccessible(true);
        Object enum40 = ((Field) term94123).get((Object) null);
        Class<? extends Object> term94435 = Class.forName((String) "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneId");
        Field term94434 = ((Class) term94435).getDeclaredField((String) "INSTANCE");
        ((Field) term94434).setAccessible(true);
        Object enum41 = ((Field) term94434).get((Object) null);
        Class<? extends Object> term94746 = Class.forName((String) "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneId");
        Field term94745 = ((Class) term94746).getDeclaredField((String) "INSTANCE");
        ((Field) term94745).setAccessible(true);
        Object enum42 = ((Field) term94745).get((Object) null);
        term91428 = (Object[]) newArray("org.joda.time.format.DateTimeParser", 5);
        Object term91744 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$MatchingParser"));
        setElement(term91428, 0, term91744);
        setElement(term91428, 1, enum39);
        setElement(term91428, 2, enum40);
        setElement(term91428, 3, enum41);
        setElement(term91428, 4, enum42);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.format.DateTimePrinter");
        argTypes[1] = Array.newInstance(Class.forName("org.joda.time.format.DateTimeParser"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term91428;
        try {
            callMethod(klass, "append", argTypes, term91618, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


