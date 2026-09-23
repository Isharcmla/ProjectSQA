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

public class Vector3D_getNorm1_93940056844 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83;
     Object term734;

    public Vector3D_getNorm1_93940056844() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term83, term83.getClass(), "x", 0.8566567697571895);
        setDoubleField(term83, term83.getClass(), "y", 0.9203805380592256);
        setDoubleField(term83, term83.getClass(), "z", 0.5804948995371725);
        term734 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term734, term734.getClass(), "x", 0.8566567697571895);
        setDoubleField(term734, term734.getClass(), "y", 0.9203805380592256);
        setDoubleField(term734, term734.getClass(), "z", 0.5804948995371725);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNorm1", argTypes, term83, args);
        assertTrue(recursiveEquals(term83, term734));
        assertTrue(recursiveEquals(retValue, 2.3575322073535876));
    }

};


