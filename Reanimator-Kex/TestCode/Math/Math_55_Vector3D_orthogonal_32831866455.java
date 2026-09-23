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

public class Vector3D_orthogonal_32831866455 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147;
     Object term1665;
     Object term1661;

    public Vector3D_orthogonal_32831866455() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term147 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term147, term147.getClass(), "x", 0.9006361024877096);
        setDoubleField(term147, term147.getClass(), "y", 0.5644914462415626);
        setDoubleField(term147, term147.getClass(), "z", 0.509895859167191);
        term1665 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term1665, term1665.getClass(), "x", 0.9006361024877096);
        setDoubleField(term1665, term1665.getClass(), "y", 0.5644914462415626);
        setDoubleField(term1665, term1665.getClass(), "z", 0.509895859167191);
        term1661 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term1661, term1661.getClass(), "x", -0.4926727402368441);
        setDoubleField(term1661, term1661.getClass(), "y", 0.0);
        setDoubleField(term1661, term1661.getClass(), "z", 0.8702146695083456);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "orthogonal", argTypes, term147, args);
        assertTrue(recursiveEquals(term147, term1665));
        assertTrue(recursiveEquals(retValue, term1661));
    }

};


