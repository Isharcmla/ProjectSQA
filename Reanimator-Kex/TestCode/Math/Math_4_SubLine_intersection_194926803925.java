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
import java.lang.NullPointerException;
import static org.apache.commons.math3.geometry.euclidean.twod.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SubLine_intersection_194926803925 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4215;
     Object term4333;

    public SubLine_intersection_194926803925() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4215 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.SubLine"));
        setField(term4215, term4215.getClass(), "hyperplane", null);
        term4333 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.SubLine"));
        Object term4445 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.twod.Line"));
        setField(term4333, term4333.getClass(), "hyperplane", term4445);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.SubLine");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math3.geometry.euclidean.twod.SubLine");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term4333;
        args[1] = false;
        try {
            callMethod(klass, "intersection", argTypes, term4215, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


