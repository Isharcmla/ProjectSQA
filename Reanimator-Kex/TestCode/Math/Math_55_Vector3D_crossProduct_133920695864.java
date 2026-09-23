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

public class Vector3D_crossProduct_133920695864 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term194;
     Object term198;
     Object term2172;
     Object term2173;
     Object term2157;

    public Vector3D_crossProduct_133920695864() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term194 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term194, term194.getClass(), "x", 0.04640022995603543);
        setDoubleField(term194, term194.getClass(), "y", 0.9123572866833729);
        setDoubleField(term194, term194.getClass(), "z", 0.40635376375558196);
        term198 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term198, term198.getClass(), "x", 0.4772043271031934);
        setDoubleField(term198, term198.getClass(), "y", 0.2446504549754045);
        setDoubleField(term198, term198.getClass(), "z", 0.6142723998707854);
        term2172 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term2172, term2172.getClass(), "x", 0.04640022995603543);
        setDoubleField(term2172, term2172.getClass(), "y", 0.9123572866833729);
        setDoubleField(term2172, term2172.getClass(), "z", 0.40635376375558196);
        term2173 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term2173, term2173.getClass(), "x", 0.4772043271031934);
        setDoubleField(term2173, term2173.getClass(), "y", 0.2446504549754045);
        setDoubleField(term2173, term2173.getClass(), "z", 0.6142723998707854);
        term2157 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term2157, term2157.getClass(), "x", 0.46102126684682243);
        setDoubleField(term2157, term2157.getClass(), "y", 0.16541139378918232);
        setDoubleField(term2157, term2157.getClass(), "z", -0.4240290076997268);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        argTypes[1] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Object[] args = new Object[2];
        args[0] = term194;
        args[1] = term198;
        Object retValue = callMethod(klass, "crossProduct", argTypes, null, args);
        assertTrue(recursiveEquals(term194, term2172));
        assertTrue(recursiveEquals(term198, term2173));
        assertTrue(recursiveEquals(retValue, term2157));
    }

};


