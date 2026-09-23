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
import java.lang.NullPointerException;
import static org.joda.time.chrono.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ZonedChronology_equals_141452681591 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term268410;
     Object term268644;

    public ZonedChronology_equals_141452681591() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term268410 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term268488 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term268566 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term268488, term268488.getClass(), "iBase", term268566);
        setField(term268410, term268410.getClass(), "iBase", term268488);
        term268644 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term268722 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term268800 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term268878 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term268956 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term269040 = newInstance(Class.forName("org.joda.time.chrono.EthiopicChronology"));
        setField(term268956, term268956.getClass(), "iBase", term269040);
        setField(term268878, term268878.getClass(), "iBase", term268956);
        setField(term268800, term268800.getClass(), "iBase", term268878);
        setField(term268722, term268722.getClass(), "iBase", term268800);
        setField(term268644, term268644.getClass(), "iBase", term268722);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term268644;
        try {
            callMethod(klass, "equals", argTypes, term268410, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


