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

public class Vector3D_distanceInf_91221813367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term218;
     Object term222;
     Object term2251;
     Object term2252;

    public Vector3D_distanceInf_91221813367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term218 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term218, term218.getClass(), "x", 0.18717846301066243);
        setDoubleField(term218, term218.getClass(), "y", 0.5335953039331021);
        setDoubleField(term218, term218.getClass(), "z", 0.5725602309856443);
        term222 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term222, term222.getClass(), "x", 0.5310967137636303);
        setDoubleField(term222, term222.getClass(), "y", 0.6054109236809134);
        setDoubleField(term222, term222.getClass(), "z", 0.9165240441138934);
        term2251 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term2251, term2251.getClass(), "x", 0.18717846301066243);
        setDoubleField(term2251, term2251.getClass(), "y", 0.5335953039331021);
        setDoubleField(term2251, term2251.getClass(), "z", 0.5725602309856443);
        term2252 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term2252, term2252.getClass(), "x", 0.5310967137636303);
        setDoubleField(term2252, term2252.getClass(), "y", 0.6054109236809134);
        setDoubleField(term2252, term2252.getClass(), "z", 0.9165240441138934);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        argTypes[1] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Object[] args = new Object[2];
        args[0] = term218;
        args[1] = term222;
        Object retValue = callMethod(klass, "distanceInf", argTypes, null, args);
        assertTrue(recursiveEquals(term218, term2251));
        assertTrue(recursiveEquals(term222, term2252));
        assertTrue(recursiveEquals(retValue, 0.3439638131282491));
    }

};


