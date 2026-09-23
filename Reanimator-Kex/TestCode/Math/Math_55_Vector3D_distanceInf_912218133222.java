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

public class Vector3D_distanceInf_912218133222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37059;
     Object term37147;

    public Vector3D_distanceInf_912218133222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37059 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term37059, term37059.getClass(), "x", -4.6139379556779295E18);
        setDoubleField(term37059, term37059.getClass(), "y", -3.8911099341499269E18);
        setDoubleField(term37059, term37059.getClass(), "z", -1.09084034548551168E17);
        term37147 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term37147, term37147.getClass(), "x", 4.680366462500864E18);
        setDoubleField(term37147, term37147.getClass(), "y", -3.8936430822262374E18);
        setDoubleField(term37147, term37147.getClass(), "z", -1.0908419789246448E17);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        argTypes[1] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Object[] args = new Object[2];
        args[0] = term37059;
        args[1] = term37147;
        callMethod(klass, "distanceInf", argTypes, null, args);
    }

};


