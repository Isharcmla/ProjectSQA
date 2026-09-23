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

public class Line_reset_2537545102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18;
     Object term27;
     Object term31;

    public Line_reset_2537545102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line"));
        Object term19 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        Object term23 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        setDoubleField(term19, term19.getClass(), "x", 0.7655020693602768);
        setDoubleField(term19, term19.getClass(), "y", 0.1374549299694151);
        setDoubleField(term19, term19.getClass(), "z", 0.7031006357544823);
        setField(term18, term18.getClass(), "direction", term19);
        setDoubleField(term23, term23.getClass(), "x", 0.9527281779865117);
        setDoubleField(term23, term23.getClass(), "y", 0.9828442029246764);
        setDoubleField(term23, term23.getClass(), "z", 0.2779719046761513);
        setField(term18, term18.getClass(), "zero", term23);
        term27 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        setDoubleField(term27, term27.getClass(), "x", 0.6436713023569729);
        setDoubleField(term27, term27.getClass(), "y", 0.7332741045694002);
        setDoubleField(term27, term27.getClass(), "z", 0.4569171842750229);
        term31 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        setDoubleField(term31, term31.getClass(), "x", 0.8598297828918529);
        setDoubleField(term31, term31.getClass(), "y", 0.43692187681405226);
        setDoubleField(term31, term31.getClass(), "z", 0.7633268466829064);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Line");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D");
        argTypes[1] = Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D");
        Object[] args = new Object[2];
        args[0] = term27;
        args[1] = term31;
        callMethod(klass, "reset", argTypes, term18, args);
    }

};


