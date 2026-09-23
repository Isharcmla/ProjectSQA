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

public class GJChronology_readResolve_190179542583 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24924;

    public GJChronology_readResolve_190179542583() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24924 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        Object term25010 = newInstance(Class.forName("org.joda.time.chrono.GregorianChronology"));
        setField(term24924, term24924.getClass(), "iBase", null);
        setField(term24924, term24924.getClass(), "iCutoverInstant", null);
        setIntField(term25010, term25010.getClass(), "iMinDaysInFirstWeek", 0);
        setField(term24924, term24924.getClass(), "iGregorianChronology", term25010);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.GJChronology");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "readResolve", argTypes, term24924, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


