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

public class ZonedChronology_getDateTimeMillis_230749326514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term233199;

    public ZonedChronology_getDateTimeMillis_230749326514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term233199 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term233277 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term233355 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term233433 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term233511 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term233589 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term233667 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term233745 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term233823 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term233901 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term233979 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term234057 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term234135 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term234213 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term234291 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term234369 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term234447 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term234525 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term234603 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term234681 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term234759 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term234841 = newInstance(Class.forName("org.joda.time.chrono.LenientChronology"));
        setField(term234759, term234759.getClass(), "iBase", term234841);
        setField(term234681, term234681.getClass(), "iBase", term234759);
        setField(term234603, term234603.getClass(), "iBase", term234681);
        setField(term234525, term234525.getClass(), "iBase", term234603);
        setField(term234447, term234447.getClass(), "iBase", term234525);
        setField(term234369, term234369.getClass(), "iBase", term234447);
        setField(term234291, term234291.getClass(), "iBase", term234369);
        setField(term234213, term234213.getClass(), "iBase", term234291);
        setField(term234135, term234135.getClass(), "iBase", term234213);
        setField(term234057, term234057.getClass(), "iBase", term234135);
        setField(term233979, term233979.getClass(), "iBase", term234057);
        setField(term233901, term233901.getClass(), "iBase", term233979);
        setField(term233823, term233823.getClass(), "iBase", term233901);
        setField(term233745, term233745.getClass(), "iBase", term233823);
        setField(term233667, term233667.getClass(), "iBase", term233745);
        setField(term233589, term233589.getClass(), "iBase", term233667);
        setField(term233511, term233511.getClass(), "iBase", term233589);
        setField(term233433, term233433.getClass(), "iBase", term233511);
        setField(term233355, term233355.getClass(), "iBase", term233433);
        setField(term233277, term233277.getClass(), "iBase", term233355);
        setField(term233199, term233199.getClass(), "iBase", term233277);
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
            callMethod(klass, "getDateTimeMillis", argTypes, term233199, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


