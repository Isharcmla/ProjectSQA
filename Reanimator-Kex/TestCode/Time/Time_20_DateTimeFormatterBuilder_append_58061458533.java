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

public class DateTimeFormatterBuilder_append_58061458533 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110628;
     Object term110411;

    public DateTimeFormatterBuilder_append_58061458533() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term110628 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Class<? extends Object> term112820 = Class.forName((String) "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneId");
        Field term112819 = ((Class) term112820).getDeclaredField((String) "INSTANCE");
        ((Field) term112819).setAccessible(true);
        Object enum56 = ((Field) term112819).get((Object) null);
        Class<? extends Object> term113131 = Class.forName((String) "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneId");
        Field term113130 = ((Class) term113131).getDeclaredField((String) "INSTANCE");
        ((Field) term113130).setAccessible(true);
        Object enum57 = ((Field) term113130).get((Object) null);
        Class<? extends Object> term113442 = Class.forName((String) "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneId");
        Field term113441 = ((Class) term113442).getDeclaredField((String) "INSTANCE");
        ((Field) term113441).setAccessible(true);
        Object enum58 = ((Field) term113441).get((Object) null);
        Class<? extends Object> term113753 = Class.forName((String) "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneId");
        Field term113752 = ((Class) term113753).getDeclaredField((String) "INSTANCE");
        ((Field) term113752).setAccessible(true);
        Object enum59 = ((Field) term113752).get((Object) null);
        term110411 = (Object[]) newArray("org.joda.time.format.DateTimeParser", 5);
        Object term110750 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$TimeZoneName"));
        setElement(term110411, 0, term110750);
        setElement(term110411, 1, enum56);
        setElement(term110411, 2, enum57);
        setElement(term110411, 3, enum58);
        setElement(term110411, 4, enum59);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.format.DateTimePrinter");
        argTypes[1] = Array.newInstance(Class.forName("org.joda.time.format.DateTimeParser"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term110411;
        try {
            callMethod(klass, "append", argTypes, term110628, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


