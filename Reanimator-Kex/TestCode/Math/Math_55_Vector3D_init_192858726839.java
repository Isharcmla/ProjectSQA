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

public class Vector3D_init_192858726839 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29;
     Object term31;
     Object term35;
     Object term37;
     Object term41;
     Object term43;
     Object term660;
     Object term661;
     Object term662;
     Object term663;

    public Vector3D_init_192858726839() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29 = new Double(0.2779719046761513);
        term31 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term31, term31.getClass(), "x", 0.6436713023569729);
        setDoubleField(term31, term31.getClass(), "y", 0.7332741045694002);
        setDoubleField(term31, term31.getClass(), "z", 0.4569171842750229);
        term35 = new Double(0.8598297828918529);
        term37 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term37, term37.getClass(), "x", 0.43692187681405226);
        setDoubleField(term37, term37.getClass(), "y", 0.7633268466829064);
        setDoubleField(term37, term37.getClass(), "z", 0.13481025392611334);
        term41 = new Double(0.3800088629986428);
        term43 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term43, term43.getClass(), "x", 0.5840714198152577);
        setDoubleField(term43, term43.getClass(), "y", 0.7559240768573477);
        setDoubleField(term43, term43.getClass(), "z", 0.10667076642995188);
        term660 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term660, term660.getClass(), "x", 0.7765532965372731);
        setDoubleField(term660, term660.getClass(), "y", 1.147418605315601);
        setDoubleField(term660, term660.getClass(), "z", 0.28345984802331753);
        term661 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term661, term661.getClass(), "x", 0.6436713023569729);
        setDoubleField(term661, term661.getClass(), "y", 0.7332741045694002);
        setDoubleField(term661, term661.getClass(), "z", 0.4569171842750229);
        term662 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term662, term662.getClass(), "x", 0.43692187681405226);
        setDoubleField(term662, term662.getClass(), "y", 0.7633268466829064);
        setDoubleField(term662, term662.getClass(), "z", 0.13481025392611334);
        term663 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term663, term663.getClass(), "x", 0.5840714198152577);
        setDoubleField(term663, term663.getClass(), "y", 0.7559240768573477);
        setDoubleField(term663, term663.getClass(), "z", 0.10667076642995188);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = double.class;
        argTypes[1] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        argTypes[2] = double.class;
        argTypes[3] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        argTypes[4] = double.class;
        argTypes[5] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Object[] args = new Object[6];
        args[0] = term29;
        args[1] = term31;
        args[2] = term35;
        args[3] = term37;
        args[4] = term41;
        args[5] = term43;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term660));
        assertTrue(recursiveEquals(term29, 0.2779719046761513));
        assertTrue(recursiveEquals(term31, term661));
        assertTrue(recursiveEquals(term35, 0.8598297828918529));
        assertTrue(recursiveEquals(term37, term662));
        assertTrue(recursiveEquals(term41, 0.3800088629986428));
        assertTrue(recursiveEquals(term43, term663));
    }

};


