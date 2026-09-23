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

public class Line_reset_25375451093 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29694;
     Object term29818;

    public Line_reset_25375451093() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29694 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line"));
        term29818 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D");
        argTypes[1] = Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term29818;
        try {
            callMethod(klass, "reset", argTypes, term29694, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


