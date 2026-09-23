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

public class DateTimeFormatterBuilder_append_58061458501 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97614;
     Object term97498;
     Object term98112;
     Object term98117;
     Object term98100;

    public DateTimeFormatterBuilder_append_58061458501() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term97666 = new ArrayList();
        term97614 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term97614, term97614.getClass(), "iFormatter", null);
        setField(term97614, term97614.getClass(), "iElementPairs", term97666);
        Class<? extends Object> term98121 = Class.forName((String) "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneId");
        Field term98120 = ((Class) term98121).getDeclaredField((String) "INSTANCE");
        ((Field) term98120).setAccessible(true);
        Object enum44 = ((Field) term98120).get((Object) null);
        term97498 = (Object[]) newArray("org.joda.time.format.DateTimeParser", 1);
        setElement(term97498, 0, enum44);
        Class<? extends Object> term98432 = Class.forName((String) "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneId");
        Field term98431 = ((Class) term98432).getDeclaredField((String) "INSTANCE");
        ((Field) term98431).setAccessible(true);
        Object enum45 =  ((Field) term98431).get((Object) null);
        ArrayList term98113 = new ArrayList();
        ((ArrayList) term98113).add((Object)null);
        ((ArrayList) term98113).add(enum45);
        term98112 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term98112, term98112.getClass(), "iElementPairs", term98113);
        setField(term98112, term98112.getClass(), "iFormatter", null);
        Class<? extends Object> term98743 = Class.forName((String) "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneId");
        Field term98742 = ((Class) term98743).getDeclaredField((String) "INSTANCE");
        ((Field) term98742).setAccessible(true);
        Object enum46 = ((Field) term98742).get((Object) null);
        term98117 = (Object[]) newArray("org.joda.time.format.DateTimeParser", 1);
        setElement(term98117, 0, enum46);
        Class<? extends Object> term99054 = Class.forName((String) "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneId");
        Field term99053 = ((Class) term99054).getDeclaredField((String) "INSTANCE");
        ((Field) term99053).setAccessible(true);
        Object enum47 =  ((Field) term99053).get((Object) null);
        ArrayList term98101 = new ArrayList();
        ((ArrayList) term98101).add((Object)null);
        ((ArrayList) term98101).add(enum47);
        term98100 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term98100, term98100.getClass(), "iElementPairs", term98101);
        setField(term98100, term98100.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.format.DateTimePrinter");
        argTypes[1] = Array.newInstance(Class.forName("org.joda.time.format.DateTimeParser"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term97498;
        Object retValue = callMethod(klass, "append", argTypes, term97614, args);
        assertTrue(recursiveEquals(term97614, term98112));
        assertTrue(recursiveEquals(term97498, term98117));
        assertTrue(recursiveEquals(retValue, term98100));
    }

};


