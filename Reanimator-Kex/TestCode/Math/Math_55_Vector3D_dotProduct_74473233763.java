package org.apache.commons.math.geometry;

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
import static org.apache.commons.math.geometry.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.geometry.EqualityUtils.*;

public class Vector3D_dotProduct_74473233763 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term186;
     Object term190;
     Object term2155;
     Object term2156;

    public Vector3D_dotProduct_74473233763() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term186 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term186, term186.getClass(), "x", 0.6512870939318848);
        setDoubleField(term186, term186.getClass(), "y", 0.8777038609128434);
        setDoubleField(term186, term186.getClass(), "z", 0.008025683154629148);
        term190 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term190, term190.getClass(), "x", 0.40598298281353484);
        setDoubleField(term190, term190.getClass(), "y", 0.3710067290060264);
        setDoubleField(term190, term190.getClass(), "z", 0.7818620200430967);
        term2155 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term2155, term2155.getClass(), "x", 0.6512870939318848);
        setDoubleField(term2155, term2155.getClass(), "y", 0.8777038609128434);
        setDoubleField(term2155, term2155.getClass(), "z", 0.008025683154629148);
        term2156 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term2156, term2156.getClass(), "x", 0.40598298281353484);
        setDoubleField(term2156, term2156.getClass(), "y", 0.3710067290060264);
        setDoubleField(term2156, term2156.getClass(), "z", 0.7818620200430967);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        argTypes[1] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Object[] args = new Object[2];
        args[0] = term186;
        args[1] = term190;
        Object retValue = callMethod(klass, "dotProduct", argTypes, null, args);
        assertTrue(recursiveEquals(term186, term2155));
        assertTrue(recursiveEquals(term190, term2156));
        assertTrue(recursiveEquals(retValue, 0.596320492379164));
    }

};


