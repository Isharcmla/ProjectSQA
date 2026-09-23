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

public class GJChronology_toString_88169915987 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33439;

    public GJChronology_toString_88169915987() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33439 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        Object term33555 = newInstance(Class.forName("org.joda.time.chrono.LimitChronology$LimitDateTimeField"));
        setField(term33439, term33439.getClass(), "iBase", null);
        setLongField(term33439, term33439.getClass(), "iCutoverMillis", 0L);
        setField(term33439, term33439.getClass(), "iDayOfYear", term33555);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.GJChronology");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "toString", argTypes, term33439, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


