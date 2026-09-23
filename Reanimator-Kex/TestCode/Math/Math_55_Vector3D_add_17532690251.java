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
import java.lang.Double;

public class Vector3D_add_17532690251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115;
     Object term119;
     Object term121;
     Object term1576;
     Object term1577;
     Object term1560;

    public Vector3D_add_17532690251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term115 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term115, term115.getClass(), "x", 0.426231085465289);
        setDoubleField(term115, term115.getClass(), "y", 0.0027299293098262956);
        setDoubleField(term115, term115.getClass(), "z", 0.29874017652881824);
        term119 = new Double(0.32554480512985284);
        term121 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term121, term121.getClass(), "x", 0.8924855581421237);
        setDoubleField(term121, term121.getClass(), "y", 0.32237559209193944);
        setDoubleField(term121, term121.getClass(), "z", 0.53094494792755);
        term1576 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term1576, term1576.getClass(), "x", 0.426231085465289);
        setDoubleField(term1576, term1576.getClass(), "y", 0.0027299293098262956);
        setDoubleField(term1576, term1576.getClass(), "z", 0.29874017652881824);
        term1577 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term1577, term1577.getClass(), "x", 0.8924855581421237);
        setDoubleField(term1577, term1577.getClass(), "y", 0.32237559209193944);
        setDoubleField(term1577, term1577.getClass(), "z", 0.53094494792755);
        term1560 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term1560, term1560.getClass(), "x", 0.7167751225718746);
        setDoubleField(term1560, term1560.getClass(), "y", 0.10767762861601765);
        setDoubleField(term1560, term1560.getClass(), "z", 0.47158654613657236);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = double.class;
        argTypes[1] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Object[] args = new Object[2];
        args[0] = term119;
        args[1] = term121;
        Object retValue = callMethod(klass, "add", argTypes, term115, args);
        assertTrue(recursiveEquals(term115, term1576));
        assertTrue(recursiveEquals(term119, 0.32554480512985284));
        assertTrue(recursiveEquals(term121, term1577));
        assertTrue(recursiveEquals(retValue, term1560));
    }

};


