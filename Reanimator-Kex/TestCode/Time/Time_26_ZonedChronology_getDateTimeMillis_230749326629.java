package org.joda.time.chrono;

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
import org.joda.time.IllegalFieldValueException;
import static org.joda.time.chrono.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ZonedChronology_getDateTimeMillis_230749326629 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term325191;

    public ZonedChronology_getDateTimeMillis_230749326629() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term325191 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term325269 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term325347 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term325425 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term325503 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term325581 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term325659 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term325737 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term325815 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term325893 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term325971 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term326049 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term326127 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term326205 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term326291 = newInstance(Class.forName("org.joda.time.chrono.GregorianChronology"));
        setField(term326205, term326205.getClass(), "iBase", term326291);
        setField(term326127, term326127.getClass(), "iBase", term326205);
        setField(term326049, term326049.getClass(), "iBase", term326127);
        setField(term325971, term325971.getClass(), "iBase", term326049);
        setField(term325893, term325893.getClass(), "iBase", term325971);
        setField(term325815, term325815.getClass(), "iBase", term325893);
        setField(term325737, term325737.getClass(), "iBase", term325815);
        setField(term325659, term325659.getClass(), "iBase", term325737);
        setField(term325581, term325581.getClass(), "iBase", term325659);
        setField(term325503, term325503.getClass(), "iBase", term325581);
        setField(term325425, term325425.getClass(), "iBase", term325503);
        setField(term325347, term325347.getClass(), "iBase", term325425);
        setField(term325269, term325269.getClass(), "iBase", term325347);
        setField(term325191, term325191.getClass(), "iBase", term325269);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = 0;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        try {
            callMethod(klass, "getDateTimeMillis", argTypes, term325191, args);
            assertTrue(false);
        }
        catch (IllegalFieldValueException e) {
        }

    }

};


