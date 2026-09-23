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

public class GJChronology_readResolve_190179542596 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29662;

    public GJChronology_readResolve_190179542596() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29662 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        Object term29734 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        Object term29820 = newInstance(Class.forName("org.joda.time.chrono.GregorianChronology"));
        setField(term29734, term29734.getClass(), "iBase", null);
        setField(term29662, term29662.getClass(), "iBase", term29734);
        setField(term29662, term29662.getClass(), "iCutoverInstant", null);
        setField(term29662, term29662.getClass(), "iGregorianChronology", term29820);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.GJChronology");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "readResolve", argTypes, term29662, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


