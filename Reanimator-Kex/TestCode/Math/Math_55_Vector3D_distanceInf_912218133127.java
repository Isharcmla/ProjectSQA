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

public class Vector3D_distanceInf_912218133127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15412;
     Object term15500;
     Object term15540;
     Object term15541;

    public Vector3D_distanceInf_912218133127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15412 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term15412, term15412.getClass(), "x", 4.5756654677029714E18);
        setDoubleField(term15412, term15412.getClass(), "y", -4.6828881580212879E18);
        setDoubleField(term15412, term15412.getClass(), "z", -4.503599627370496E15);
        term15500 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term15500, term15500.getClass(), "x", 4.6161897383148257E18);
        setDoubleField(term15500, term15500.getClass(), "y", 4.6139378105637038E18);
        setDoubleField(term15500, term15500.getClass(), "z", 9.2214425429589443E18);
        term15540 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term15540, term15540.getClass(), "x", 4.5756654677029714E18);
        setDoubleField(term15540, term15540.getClass(), "y", -4.6828881580212879E18);
        setDoubleField(term15540, term15540.getClass(), "z", -4.503599627370496E15);
        term15541 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term15541, term15541.getClass(), "x", 4.6161897383148257E18);
        setDoubleField(term15541, term15541.getClass(), "y", 4.6139378105637038E18);
        setDoubleField(term15541, term15541.getClass(), "z", 9.2214425429589443E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        argTypes[1] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Object[] args = new Object[2];
        args[0] = term15412;
        args[1] = term15500;
        Object retValue = callMethod(klass, "distanceInf", argTypes, null, args);
        assertTrue(recursiveEquals(term15412, term15540));
        assertTrue(recursiveEquals(term15500, term15541));
        assertTrue(recursiveEquals(retValue, 9.29682596858499E18));
    }

};


