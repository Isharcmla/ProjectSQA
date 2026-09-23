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

public class Rotation_applyTo_91249485536 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206;
     Object term211;
     Object term3104;
     Object term3105;
     Object term3092;

    public Rotation_applyTo_91249485536() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term206 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term206, term206.getClass(), "q0", 0.5644914462415626);
        setDoubleField(term206, term206.getClass(), "q1", 0.509895859167191);
        setDoubleField(term206, term206.getClass(), "q2", 0.07417792024383196);
        setDoubleField(term206, term206.getClass(), "q3", 0.686293604788188);
        term211 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Vector3D"));
        setDoubleField(term211, term211.getClass(), "x", 0.12764449157430724);
        setDoubleField(term211, term211.getClass(), "y", 0.39446728256884744);
        setDoubleField(term211, term211.getClass(), "z", 0.7865909711092062);
        term3104 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation"));
        setDoubleField(term3104, term3104.getClass(), "q0", 0.5644914462415626);
        setDoubleField(term3104, term3104.getClass(), "q1", 0.509895859167191);
        setDoubleField(term3104, term3104.getClass(), "q2", 0.07417792024383196);
        setDoubleField(term3104, term3104.getClass(), "q3", 0.686293604788188);
        term3105 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Vector3D"));
        setDoubleField(term3105, term3105.getClass(), "x", 0.12764449157430724);
        setDoubleField(term3105, term3105.getClass(), "y", 0.39446728256884744);
        setDoubleField(term3105, term3105.getClass(), "z", 0.7865909711092062);
        term3092 = newInstance(Class.forName("org.apache.commons.math.geometry.euclidean.threed.Vector3D"));
        setDoubleField(term3092, term3092.getClass(), "x", 0.8401986251291262);
        setDoubleField(term3092, term3092.getClass(), "y", 0.30492243529212404);
        setDoubleField(term3092, term3092.getClass(), "z", 0.36877887227125206);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Rotation");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.geometry.euclidean.threed.Vector3D");
        Object[] args = new Object[1];
        args[0] = term211;
        Object retValue = callMethod(klass, "applyTo", argTypes, term206, args);
        assertTrue(recursiveEquals(term206, term3104));
        assertTrue(recursiveEquals(term211, term3105));
        assertTrue(recursiveEquals(retValue, term3092));
    }

};


