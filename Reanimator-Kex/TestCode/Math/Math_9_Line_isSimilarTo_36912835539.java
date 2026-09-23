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
import org.apache.commons.math3.exception.MathArithmeticException;
import static org.apache.commons.math3.geometry.euclidean.threed.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Line_isSimilarTo_36912835539 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6026;
     Object term6266;

    public Line_isSimilarTo_36912835539() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6026 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line"));
        Object term6328 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        setDoubleField(term6328, term6328.getClass(), "x", 0.0);
        setDoubleField(term6328, term6328.getClass(), "y", 0.0);
        setDoubleField(term6328, term6328.getClass(), "z", 0.0);
        setField(term6026, term6026.getClass(), "direction", term6328);
        term6266 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line"));
        setField(term6266, term6266.getClass(), "direction", term6328);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line");
        Object[] args = new Object[1];
        args[0] = term6266;
        try {
            callMethod(klass, "isSimilarTo", argTypes, term6026, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


