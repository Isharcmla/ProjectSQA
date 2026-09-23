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
import java.lang.Double;

public class Vector3D_init_198513896238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17;
     Object term19;
     Object term23;
     Object term25;
     Object term638;
     Object term639;
     Object term640;

    public Vector3D_init_198513896238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17 = new Double(0.37773193782763337);
        term19 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term19, term19.getClass(), "x", 0.8474802076607362);
        setDoubleField(term19, term19.getClass(), "y", 0.5183269973490326);
        setDoubleField(term19, term19.getClass(), "z", 0.7655020693602768);
        term23 = new Double(0.1374549299694151);
        term25 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term25, term25.getClass(), "x", 0.7031006357544823);
        setDoubleField(term25, term25.getClass(), "y", 0.9527281779865117);
        setDoubleField(term25, term25.getClass(), "z", 0.9828442029246764);
        term638 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term638, term638.getClass(), "x", 0.4167649897593386);
        setDoubleField(term638, term638.getClass(), "y", 0.3267458461220531);
        setDoubleField(term638, term638.getClass(), "z", 0.4242513611543778);
        term639 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term639, term639.getClass(), "x", 0.8474802076607362);
        setDoubleField(term639, term639.getClass(), "y", 0.5183269973490326);
        setDoubleField(term639, term639.getClass(), "z", 0.7655020693602768);
        term640 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term640, term640.getClass(), "x", 0.7031006357544823);
        setDoubleField(term640, term640.getClass(), "y", 0.9527281779865117);
        setDoubleField(term640, term640.getClass(), "z", 0.9828442029246764);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = double.class;
        argTypes[1] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        argTypes[2] = double.class;
        argTypes[3] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Object[] args = new Object[4];
        args[0] = term17;
        args[1] = term19;
        args[2] = term23;
        args[3] = term25;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term638));
        assertTrue(recursiveEquals(term17, 0.37773193782763337));
        assertTrue(recursiveEquals(term19, term639));
        assertTrue(recursiveEquals(term23, 0.1374549299694151));
        assertTrue(recursiveEquals(term25, term640));
    }

};


