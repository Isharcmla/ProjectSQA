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

public class Vector3D_distanceInf_912218133221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36828;
     Object term36916;

    public Vector3D_distanceInf_912218133221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36828 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term36828, term36828.getClass(), "x", 4.8999163945790996E18);
        setDoubleField(term36828, term36828.getClass(), "y", -9.223372036854776E18);
        setDoubleField(term36828, term36828.getClass(), "z", -9.220906242443051E18);
        term36916 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term36916, term36916.getClass(), "x", -4.3459736404125286E18);
        setDoubleField(term36916, term36916.getClass(), "y", -8.9396100759583457E18);
        setDoubleField(term36916, term36916.getClass(), "z", -9.2232315742443274E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        argTypes[1] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Object[] args = new Object[2];
        args[0] = term36828;
        args[1] = term36916;
        callMethod(klass, "distanceInf", argTypes, null, args);
    }

};


