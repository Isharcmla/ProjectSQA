package org.apache.commons.math3.geometry.euclidean.threed;

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
import static org.apache.commons.math3.geometry.euclidean.threed.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SubLine_init_16093276611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15;
     Object term19;

    public SubLine_init_16093276611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        setDoubleField(term15, term15.getClass(), "x", 0.36923381893433327);
        setDoubleField(term15, term15.getClass(), "y", 0.6076495596892013);
        setDoubleField(term15, term15.getClass(), "z", 0.37773193782763337);
        term19 = newInstance(Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D"));
        setDoubleField(term19, term19.getClass(), "x", 0.8474802076607362);
        setDoubleField(term19, term19.getClass(), "y", 0.5183269973490326);
        setDoubleField(term19, term19.getClass(), "z", 0.7655020693602768);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.geometry.euclidean.threed.SubLine");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D");
        argTypes[1] = Class.forName("org.apache.commons.math3.geometry.euclidean.threed.Vector3D");
        Object[] args = new Object[2];
        args[0] = term15;
        args[1] = term19;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


