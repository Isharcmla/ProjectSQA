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

public class Vector3D_distance1_768944965135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17824;
     Object term17912;
     Object term17938;
     Object term17939;

    public Vector3D_distance1_768944965135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17824 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term17824, term17824.getClass(), "x", 1.08121575648888832E17);
        term17912 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term17912, term17912.getClass(), "x", -9.1512440010655662E18);
        term17938 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term17938, term17938.getClass(), "x", 1.08121575648888832E17);
        setDoubleField(term17938, term17938.getClass(), "y", 0.0);
        setDoubleField(term17938, term17938.getClass(), "z", 0.0);
        term17939 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term17939, term17939.getClass(), "x", -9.1512440010655662E18);
        setDoubleField(term17939, term17939.getClass(), "y", 0.0);
        setDoubleField(term17939, term17939.getClass(), "z", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        argTypes[1] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Object[] args = new Object[2];
        args[0] = term17824;
        args[1] = term17912;
        Object retValue = callMethod(klass, "distance1", argTypes, null, args);
        assertTrue(recursiveEquals(term17824, term17938));
        assertTrue(recursiveEquals(term17912, term17939));
        assertTrue(recursiveEquals(retValue, 9.259365576714455E18));
    }

};


