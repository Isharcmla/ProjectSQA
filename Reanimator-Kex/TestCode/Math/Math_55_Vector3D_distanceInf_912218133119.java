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

public class Vector3D_distanceInf_912218133119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11805;
     Object term11893;
     Object term11929;
     Object term11930;

    public Vector3D_distanceInf_912218133119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11805 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term11805, term11805.getClass(), "x", 1.08121575648888832E17);
        term11893 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term11893, term11893.getClass(), "x", -9.1512440010655662E18);
        term11929 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term11929, term11929.getClass(), "x", 1.08121575648888832E17);
        setDoubleField(term11929, term11929.getClass(), "y", 0.0);
        setDoubleField(term11929, term11929.getClass(), "z", 0.0);
        term11930 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term11930, term11930.getClass(), "x", -9.1512440010655662E18);
        setDoubleField(term11930, term11930.getClass(), "y", 0.0);
        setDoubleField(term11930, term11930.getClass(), "z", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        argTypes[1] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Object[] args = new Object[2];
        args[0] = term11805;
        args[1] = term11893;
        Object retValue = callMethod(klass, "distanceInf", argTypes, null, args);
        assertTrue(recursiveEquals(term11805, term11929));
        assertTrue(recursiveEquals(term11893, term11930));
        assertTrue(recursiveEquals(retValue, 9.259365576714455E18));
    }

};


