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

public class Line_distance_207193322375 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22594;
     Object term22780;

    public Line_distance_207193322375() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22594 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line"));
        term22780 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        setDoubleField(term22780, term22780.getClass(), "x", 0.0);
        setDoubleField(term22780, term22780.getClass(), "y", 0.0);
        setDoubleField(term22780, term22780.getClass(), "z", 0.0);
        setField(term22594, term22594.getClass(), "zero", term22780);
        setField(term22594, term22594.getClass(), "direction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D");
        Object[] args = new Object[1];
        args[0] = term22780;
        try {
            callMethod(klass, "distance", argTypes, term22594, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


