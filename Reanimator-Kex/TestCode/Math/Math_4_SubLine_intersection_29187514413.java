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

public class SubLine_intersection_29187514413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2239;
     Object term2601;

    public SubLine_intersection_29187514413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2239 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.SubLine"));
        Object term2355 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line"));
        Object term2479 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        setField(term2355, term2355.getClass(), "direction", term2479);
        setField(term2239, term2239.getClass(), "line", term2355);
        term2601 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.SubLine"));
        Object term2717 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line"));
        setField(term2717, term2717.getClass(), "direction", null);
        setField(term2601, term2601.getClass(), "line", term2717);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.geometry.euclidean.threed.SubLine");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math3.geometry.euclidean.threed.SubLine");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term2601;
        args[1] = false;
        try {
            callMethod(klass, "intersection", argTypes, term2239, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


