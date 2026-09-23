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
import static org.apache.commons.math3.geometry.euclidean.threed.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SubLine_init_10779425682 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23;

    public SubLine_init_10779425682() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Segment"));
        Object term24 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        Object term28 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        Object term32 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line"));
        Object term33 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        Object term37 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        setDoubleField(term24, term24.getClass(), "x", 0.1374549299694151);
        setDoubleField(term24, term24.getClass(), "y", 0.7031006357544823);
        setDoubleField(term24, term24.getClass(), "z", 0.9527281779865117);
        setField(term23, term23.getClass(), "start", term24);
        setDoubleField(term28, term28.getClass(), "x", 0.9828442029246764);
        setDoubleField(term28, term28.getClass(), "y", 0.2779719046761513);
        setDoubleField(term28, term28.getClass(), "z", 0.6436713023569729);
        setField(term23, term23.getClass(), "end", term28);
        setDoubleField(term33, term33.getClass(), "x", 0.7332741045694002);
        setDoubleField(term33, term33.getClass(), "y", 0.4569171842750229);
        setDoubleField(term33, term33.getClass(), "z", 0.8598297828918529);
        setField(term32, term32.getClass(), "direction", term33);
        setDoubleField(term37, term37.getClass(), "x", 0.43692187681405226);
        setDoubleField(term37, term37.getClass(), "y", 0.7633268466829064);
        setDoubleField(term37, term37.getClass(), "z", 0.13481025392611334);
        setField(term32, term32.getClass(), "zero", term37);
        setField(term23, term23.getClass(), "line", term32);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.geometry.euclidean.threed.SubLine");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Segment");
        Object[] args = new Object[1];
        args[0] = term23;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


