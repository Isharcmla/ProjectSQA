package org.apache.commons.math3.geometry.euclidean.threed;

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
import static org.apache.commons.math3.geometry.euclidean.threed.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SubLine_init_107794256833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7476;

    public SubLine_init_107794256833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term7354 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.SubLine"));
        term7476 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Segment"));
        Object term7600 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        setField(term7476, term7476.getClass(), "line", null);
        setField(term7476, term7476.getClass(), "start", term7600);
        setField(term7476, term7476.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.geometry.euclidean.threed.SubLine");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Segment");
        Object[] args = new Object[1];
        args[0] = term7476;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


