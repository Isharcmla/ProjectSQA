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

public class Vector3D_distanceInf_912218133209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34682;
     Object term34770;

    public Vector3D_distanceInf_912218133209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34682 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term34682, term34682.getClass(), "x", 0.0);
        setDoubleField(term34682, term34682.getClass(), "y", 4.5598858266196664E18);
        setDoubleField(term34682, term34682.getClass(), "z", 9.2188684372274053E18);
        term34770 = newInstance(Class.forName("org.apache.commons.math.geometry.Vector3D"));
        setDoubleField(term34770, term34770.getClass(), "x", -9.2154867516660122E18);
        setDoubleField(term34770, term34770.getClass(), "y", 4.6071840648462336E18);
        setDoubleField(term34770, term34770.getClass(), "z", -4.6114045434506772E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        argTypes[1] = Class.forName("org.apache.commons.math.geometry.Vector3D");
        Object[] args = new Object[2];
        args[0] = term34682;
        args[1] = term34770;
        callMethod(klass, "distanceInf", argTypes, null, args);
    }

};


