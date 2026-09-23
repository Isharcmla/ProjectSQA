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

public class Vector3D_distanceInf_912218133191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29668;
     Object term29756;
     Object term29792;
     Object term29793;

    public Vector3D_distanceInf_912218133191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29668 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term29668, term29668.getClass(), "x", 9.2211202486850693E18);
        setDoubleField(term29668, term29668.getClass(), "y", -9.223372036854776E18);
        term29756 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term29756, term29756.getClass(), "x", -4.503599627370496E15);
        setDoubleField(term29756, term29756.getClass(), "y", -9.0792568487789199E18);
        term29792 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term29792, term29792.getClass(), "x", 9.2211202486850693E18);
        setDoubleField(term29792, term29792.getClass(), "y", -9.223372036854776E18);
        setDoubleField(term29792, term29792.getClass(), "z", 0.0);
        term29793 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term29793, term29793.getClass(), "x", -4.503599627370496E15);
        setDoubleField(term29793, term29793.getClass(), "y", -9.0792568487789199E18);
        setDoubleField(term29793, term29793.getClass(), "z", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        argTypes[1] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Object[] args = new Object[2];
        args[0] = term29668;
        args[1] = term29756;
        Object retValue = callMethod(klass, "distanceInf", argTypes, null, args);
        assertTrue(recursiveEquals(term29668, term29792));
        assertTrue(recursiveEquals(term29756, term29793));
        assertTrue(recursiveEquals(retValue, 9.225623848312439E18));
    }

};


