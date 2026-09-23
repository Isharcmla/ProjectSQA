package org.apache.commons.math3.geometry.euclidean.twod;

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
import static org.apache.commons.math3.geometry.euclidean.twod.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SubLine_side_98715573379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25422;
     Object term25552;

    public SubLine_side_98715573379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25422 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.SubLine"));
        setField(term25422, term25422.getClass(), "hyperplane", null);
        term25552 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.SubLine");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.geometry.partitioning.Hyperplane");
        Object[] args = new Object[1];
        args[0] = term25552;
        try {
            callMethod(klass, "side", argTypes, term25422, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


