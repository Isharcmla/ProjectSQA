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

public class Vector3D_distanceInf_912218133145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20193;
     Object term20281;
     Object term20317;
     Object term20318;

    public Vector3D_distanceInf_912218133145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20193 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term20193, term20193.getClass(), "x", -4.6071822813358981E18);
        setDoubleField(term20193, term20193.getClass(), "y", -1.2440479073304576E18);
        setDoubleField(term20193, term20193.getClass(), "z", 7.0368744177664E13);
        term20281 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term20281, term20281.getClass(), "x", 4.6133747725904118E18);
        setDoubleField(term20281, term20281.getClass(), "y", -2.4001371264117637E18);
        setDoubleField(term20281, term20281.getClass(), "z", 4.6657292139558339E18);
        term20317 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term20317, term20317.getClass(), "x", -4.6071822813358981E18);
        setDoubleField(term20317, term20317.getClass(), "y", -1.2440479073304576E18);
        setDoubleField(term20317, term20317.getClass(), "z", 7.0368744177664E13);
        term20318 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term20318, term20318.getClass(), "x", 4.6133747725904118E18);
        setDoubleField(term20318, term20318.getClass(), "y", -2.4001371264117637E18);
        setDoubleField(term20318, term20318.getClass(), "z", 4.6657292139558339E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        argTypes[1] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Object[] args = new Object[2];
        args[0] = term20193;
        args[1] = term20281;
        Object retValue = callMethod(klass, "distanceInf", argTypes, null, args);
        assertTrue(recursiveEquals(term20193, term20317));
        assertTrue(recursiveEquals(term20281, term20318));
        assertTrue(recursiveEquals(retValue, 9.2205570539263099E18));
    }

};


