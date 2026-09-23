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

public class Vector3D_equals_2126608378157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22756;
     Object term22844;
     Object term22867;
     Object term22868;

    public Vector3D_equals_2126608378157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22756 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term22756, term22756.getClass(), "x", 1.1889503188067287E18);
        term22844 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term22844, term22844.getClass(), "x", 1.15742512141513523E18);
        setDoubleField(term22844, term22844.getClass(), "y", -9.2185869622506947E18);
        setDoubleField(term22844, term22844.getClass(), "z", -4.6116859497079112E18);
        term22867 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term22867, term22867.getClass(), "x", 1.1889503188067287E18);
        setDoubleField(term22867, term22867.getClass(), "y", 0.0);
        setDoubleField(term22867, term22867.getClass(), "z", 0.0);
        term22868 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term22868, term22868.getClass(), "x", 1.15742512141513523E18);
        setDoubleField(term22868, term22868.getClass(), "y", -9.2185869622506947E18);
        setDoubleField(term22868, term22868.getClass(), "z", -4.6116859497079112E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term22844;
        Object retValue = callMethod(klass, "equals", argTypes, term22756, args);
        assertTrue(recursiveEquals(term22756, term22867));
        assertTrue(recursiveEquals(term22844, term22868));
        assertTrue(recursiveEquals(retValue, false));
    }

};


