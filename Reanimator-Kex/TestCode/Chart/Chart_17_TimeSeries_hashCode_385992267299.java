package org.jfree.data.time;

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
import static org.jfree.data.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class TimeSeries_hashCode_385992267299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92241;

    public TimeSeries_hashCode_385992267299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term92407 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term92369 = new ArrayList();
        ((ArrayList) term92369).add(term92407);
        term92241 = newInstance(Class.forName("org.jfree.data.time.TimeSeries"));
        Object term92317 = newInstance(Class.forName("java.nio.ByteBufferAsDoubleBufferRL"));
        setField(term92241, term92241.getClass(), "key", term92317);
        setField(term92241, term92241.getClass(), "description", null);
        setField(term92241, term92241.getClass(), "domain", null);
        setField(term92241, term92241.getClass(), "range", null);
        setField(term92241, term92241.getClass(), "timePeriodClass", null);
        setField(term92241, term92241.getClass(), "data", term92369);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.TimeSeries");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "hashCode", argTypes, term92241, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


