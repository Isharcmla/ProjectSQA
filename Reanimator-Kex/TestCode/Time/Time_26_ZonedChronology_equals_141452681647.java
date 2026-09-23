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
import java.lang.ClassCastException;
import static org.joda.time.chrono.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ZonedChronology_equals_141452681647 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term336380;
     Object term337004;

    public ZonedChronology_equals_141452681647() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term336380 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term336458 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term336536 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term336614 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term336692 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term337043 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term337082 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term336926 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term337082, term337082.getClass(), "iBase", term337043);
        setField(term337043, term337043.getClass(), "iBase", term337082);
        setField(term336692, term336692.getClass(), "iBase", term337043);
        setField(term336692, term336692.getClass(), "iParam", term336926);
        setField(term336614, term336614.getClass(), "iBase", term336692);
        setField(term336536, term336536.getClass(), "iBase", term336614);
        setField(term336458, term336458.getClass(), "iBase", term336536);
        setField(term336380, term336380.getClass(), "iBase", term336458);
        term337004 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term337004, term337004.getClass(), "iBase", term337043);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term337004;
        try {
            callMethod(klass, "equals", argTypes, term336380, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


