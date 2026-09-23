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

public class DateTimeFormatterBuilder_toParser_1736117511207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23875;
     Object term24673;
     Object enum5;

    public DateTimeFormatterBuilder_toParser_1736117511207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term24678 = Class.forName((String) "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneId");
        Field term24677 = ((Class) term24678).getDeclaredField((String) "INSTANCE");
        ((Field) term24677).setAccessible(true);
        Object enum3 = ((Field) term24677).get((Object) null);
        term23875 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term23875, term23875.getClass(), "iFormatter", enum3);
        Class<? extends Object> term24989 = Class.forName((String) "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneId");
        Field term24988 = ((Class) term24989).getDeclaredField((String) "INSTANCE");
        ((Field) term24988).setAccessible(true);
        Object enum4 = ((Field) term24988).get((Object) null);
        term24673 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term24673, term24673.getClass(), "iElementPairs", null);
        setField(term24673, term24673.getClass(), "iFormatter", enum4);
        Class<? extends Object> term25300 = Class.forName((String) "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneId");
        Field term25299 = ((Class) term25300).getDeclaredField((String) "INSTANCE");
        ((Field) term25299).setAccessible(true);
        enum5 = ((Field) term25299).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toParser", argTypes, term23875, args);
        assertTrue(recursiveEquals(term23875, term24673));
        assertTrue(recursiveEquals(retValue, enum5));
    }

};


