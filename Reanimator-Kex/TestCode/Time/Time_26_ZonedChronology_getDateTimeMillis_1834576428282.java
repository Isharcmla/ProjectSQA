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

public class ZonedChronology_getDateTimeMillis_1834576428282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104550;

    public ZonedChronology_getDateTimeMillis_1834576428282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104550 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term104628 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term104702 = newInstance(Class.forName("org.joda.time.tz.FixedDateTimeZone"));
        setField(term104550, term104550.getClass(), "iBase", term104628);
        setIntField(term104702, term104702.getClass(), "iWallOffset", 0);
        setField(term104550, term104550.getClass(), "iParam", term104702);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = long.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        Object[] args = new Object[5];
        args[0] = 0L;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        try {
            callMethod(klass, "getDateTimeMillis", argTypes, term104550, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


