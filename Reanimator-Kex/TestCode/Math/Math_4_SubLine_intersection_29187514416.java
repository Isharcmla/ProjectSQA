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

public class SubLine_intersection_29187514416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3105;
     Object term3227;

    public SubLine_intersection_29187514416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3105 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.SubLine"));
        setField(term3105, term3105.getClass(), "line", null);
        term3227 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.SubLine"));
        Object term3343 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line"));
        setField(term3227, term3227.getClass(), "line", term3343);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.geometry.euclidean.threed.SubLine");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math3.geometry.euclidean.threed.SubLine");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term3227;
        args[1] = false;
        try {
            callMethod(klass, "intersection", argTypes, term3105, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


