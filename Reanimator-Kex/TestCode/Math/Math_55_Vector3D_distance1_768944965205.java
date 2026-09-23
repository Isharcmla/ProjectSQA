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

public class Vector3D_distance1_768944965205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33998;
     Object term34086;

    public Vector3D_distance1_768944965205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33998 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term33998, term33998.getClass(), "x", 2.8192533667339305E18);
        setDoubleField(term33998, term33998.getClass(), "y", -9.2191499121667656E18);
        setDoubleField(term33998, term33998.getClass(), "z", -9.208633598880514E18);
        term34086 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term34086, term34086.getClass(), "x", -1.78792890842424934E18);
        setDoubleField(term34086, term34086.getClass(), "y", -9.2191499121667656E18);
        setDoubleField(term34086, term34086.getClass(), "z", -9.2231983314910679E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        argTypes[1] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Object[] args = new Object[2];
        args[0] = term33998;
        args[1] = term34086;
        callMethod(klass, "distance1", argTypes, null, args);
    }

};


