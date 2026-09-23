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

public class GJChronology_toString_881699159145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78854;

    public GJChronology_toString_881699159145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78854 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        Object term78926 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        Object term78998 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        Object term79070 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        Object term79142 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        Object term79214 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        Object term79286 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        Object term79358 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        Object term79430 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        Object term79502 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        Object term79574 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        Object term79646 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        Object term79718 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        Object term79790 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        Object term79862 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        Object term79934 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        Object term80006 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        Object term80078 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        Object term80150 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        Object term80222 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        Object term80294 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        Object term80366 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        Object term80438 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        Object term80510 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        Object term80582 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        Object term80654 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        Object term80726 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        Object term80798 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        Object term80870 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        Object term80942 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        Object term81014 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        Object term81086 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        Object term81168 = newInstance(Class.forName("org.joda.time.chrono.LenientChronology"));
        setField(term81086, term81086.getClass(), "iBase", term81168);
        setField(term81014, term81014.getClass(), "iBase", term81086);
        setField(term80942, term80942.getClass(), "iBase", term81014);
        setField(term80870, term80870.getClass(), "iBase", term80942);
        setField(term80798, term80798.getClass(), "iBase", term80870);
        setField(term80726, term80726.getClass(), "iBase", term80798);
        setField(term80654, term80654.getClass(), "iBase", term80726);
        setField(term80582, term80582.getClass(), "iBase", term80654);
        setField(term80510, term80510.getClass(), "iBase", term80582);
        setField(term80438, term80438.getClass(), "iBase", term80510);
        setField(term80366, term80366.getClass(), "iBase", term80438);
        setField(term80294, term80294.getClass(), "iBase", term80366);
        setField(term80222, term80222.getClass(), "iBase", term80294);
        setField(term80150, term80150.getClass(), "iBase", term80222);
        setField(term80078, term80078.getClass(), "iBase", term80150);
        setField(term80006, term80006.getClass(), "iBase", term80078);
        setField(term79934, term79934.getClass(), "iBase", term80006);
        setField(term79862, term79862.getClass(), "iBase", term79934);
        setField(term79790, term79790.getClass(), "iBase", term79862);
        setField(term79718, term79718.getClass(), "iBase", term79790);
        setField(term79646, term79646.getClass(), "iBase", term79718);
        setField(term79574, term79574.getClass(), "iBase", term79646);
        setField(term79502, term79502.getClass(), "iBase", term79574);
        setField(term79430, term79430.getClass(), "iBase", term79502);
        setField(term79358, term79358.getClass(), "iBase", term79430);
        setField(term79286, term79286.getClass(), "iBase", term79358);
        setField(term79214, term79214.getClass(), "iBase", term79286);
        setField(term79142, term79142.getClass(), "iBase", term79214);
        setField(term79070, term79070.getClass(), "iBase", term79142);
        setField(term78998, term78998.getClass(), "iBase", term79070);
        setField(term78926, term78926.getClass(), "iBase", term78998);
        setField(term78854, term78854.getClass(), "iBase", term78926);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.GJChronology");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "toString", argTypes, term78854, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


