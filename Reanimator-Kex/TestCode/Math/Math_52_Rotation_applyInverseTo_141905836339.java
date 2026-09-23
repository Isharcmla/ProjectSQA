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

public class Rotation_applyInverseTo_141905836339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term234;
     Object term239;
     Object term3171;
     Object term3172;
     Object term3151;

    public Rotation_applyInverseTo_141905836339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term234 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term234, term234.getClass(), "q0", 0.34010089048558567);
        setDoubleField(term234, term234.getClass(), "q1", 0.19625398866403143);
        setDoubleField(term234, term234.getClass(), "q2", 0.45069204793711093);
        setDoubleField(term234, term234.getClass(), "q3", 0.9341364461850963);
        term239 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term239, term239.getClass(), "q0", 0.9022041121474429);
        setDoubleField(term239, term239.getClass(), "q1", 0.6512870939318848);
        setDoubleField(term239, term239.getClass(), "q2", 0.8777038609128434);
        setDoubleField(term239, term239.getClass(), "q3", 0.008025683154629148);
        term3171 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term3171, term3171.getClass(), "q0", 0.34010089048558567);
        setDoubleField(term3171, term3171.getClass(), "q1", 0.19625398866403143);
        setDoubleField(term3171, term3171.getClass(), "q2", 0.45069204793711093);
        setDoubleField(term3171, term3171.getClass(), "q3", 0.9341364461850963);
        term3172 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term3172, term3172.getClass(), "q0", 0.9022041121474429);
        setDoubleField(term3172, term3172.getClass(), "q1", 0.6512870939318848);
        setDoubleField(term3172, term3172.getClass(), "q2", 0.8777038609128434);
        setDoubleField(term3172, term3172.getClass(), "q3", 0.008025683154629148);
        term3151 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term3151, term3151.getClass(), "q0", -0.837729345588032);
        setDoubleField(term3151, term3151.getClass(), "q1", 0.7718358888490309);
        setDoubleField(term3151, term3151.getClass(), "q2", -0.49870758475898075);
        setDoubleField(term3151, term3151.getClass(), "q3", 0.9613292316565527);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        Object[] args = new Object[1];
        args[0] = term239;
        Object retValue = callMethod(klass, "applyInverseTo", argTypes, term234, args);
        assertTrue(recursiveEquals(term234, term3171));
        assertTrue(recursiveEquals(term239, term3172));
        assertTrue(recursiveEquals(retValue, term3151));
    }

};


