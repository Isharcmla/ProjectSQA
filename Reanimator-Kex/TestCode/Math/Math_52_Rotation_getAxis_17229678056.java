package org.apache.commons.math.geometry.euclidean.threed;

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
import static org.apache.commons.math.geometry.euclidean.threed.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.geometry.euclidean.threed.EqualityUtils.*;

public class Rotation_getAxis_17229678056 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7937;
     Object term7960;
     Object term7951;

    public Rotation_getAxis_17229678056() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7937 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term7937, term7937.getClass(), "q1", 1.3231660780705288E16);
        setDoubleField(term7937, term7937.getClass(), "q2", 2.294837721170844E15);
        setDoubleField(term7937, term7937.getClass(), "q3", -8.6485188547946824E18);
        term7960 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term7960, term7960.getClass(), "q0", 0.0);
        setDoubleField(term7960, term7960.getClass(), "q1", 1.3231660780705288E16);
        setDoubleField(term7960, term7960.getClass(), "q2", 2.294837721170844E15);
        setDoubleField(term7960, term7960.getClass(), "q3", -8.6485188547946824E18);
        term7951 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Vector3D"));
        setDoubleField(term7951, term7951.getClass(), "x", -0.001529931893706503);
        setDoubleField(term7951, term7951.getClass(), "y", -2.653442737603859E-4);
        setDoubleField(term7951, term7951.getClass(), "z", 0.9999987944496819);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getAxis", argTypes, term7937, args);
        assertTrue(recursiveEquals(term7937, term7960));
        assertTrue(recursiveEquals(retValue, term7951));
    }

};


