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
import java.lang.IllegalArgumentException;
import static org.joda.time.chrono.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class GJChronology_readResolve_190179542568 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18056;

    public GJChronology_readResolve_190179542568() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18056 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        Object term18104 = newInstance(Class.forName("org.joda.time.Instant"));
        Object term18190 = newInstance(Class.forName("org.joda.time.chrono.GregorianChronology"));
        setField(term18056, term18056.getClass(), "iBase", null);
        setField(term18056, term18056.getClass(), "iCutoverInstant", term18104);
        setIntField(term18190, term18190.getClass(), "iMinDaysInFirstWeek", 0);
        setField(term18056, term18056.getClass(), "iGregorianChronology", term18190);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.GJChronology");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "readResolve", argTypes, term18056, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


