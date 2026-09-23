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
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;

public class DateTimeFormatterBuilder_appendTimeZoneId_68444435140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term572;
     Object term11382;
     Object term11371;

    public DateTimeFormatterBuilder_appendTimeZoneId_68444435140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term573 = new ArrayList();
        term572 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term577 = newInstance(Class.forName("java.lang.Object"));
        setField(term572, term572.getClass(), "iElementPairs", term573);
        setField(term572, term572.getClass(), "iFormatter", term577);
        Class<? extends Object> term11650 = Class.forName((String) "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneId");
        Field term11649 = ((Class) term11650).getDeclaredField((String) "INSTANCE");
        ((Field) term11649).setAccessible(true);
        Object enum0 =  ((Field) term11649).get((Object) null);
        ArrayList term11383 = new ArrayList();
        ((ArrayList) term11383).add(enum0);
        ((ArrayList) term11383).add(enum0);
        term11382 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term11382, term11382.getClass(), "iElementPairs", term11383);
        setField(term11382, term11382.getClass(), "iFormatter", null);
        Class<? extends Object> term11962 = Class.forName((String) "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneId");
        Field term11961 = ((Class) term11962).getDeclaredField((String) "INSTANCE");
        ((Field) term11961).setAccessible(true);
        Object enum1 =  ((Field) term11961).get((Object) null);
        ArrayList term11372 = new ArrayList();
        ((ArrayList) term11372).add(enum1);
        ((ArrayList) term11372).add(enum1);
        term11371 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term11371, term11371.getClass(), "iElementPairs", term11372);
        setField(term11371, term11371.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "appendTimeZoneId", argTypes, term572, args);
        assertTrue(recursiveEquals(term572, term11382));
        assertTrue(recursiveEquals(retValue, term11371));
    }

};


