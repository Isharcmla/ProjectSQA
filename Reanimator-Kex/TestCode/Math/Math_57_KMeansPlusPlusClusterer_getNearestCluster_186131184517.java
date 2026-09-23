package org.apache.commons.math.stat.clustering;

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
import java.lang.NullPointerException;
import static org.apache.commons.math.stat.clustering.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class KMeansPlusPlusClusterer_getNearestCluster_186131184517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term590;

    public KMeansPlusPlusClusterer_getNearestCluster_186131184517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term590 = newInstance(Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer"));
        setField(term590, term590.getClass(), "random", null);
        setField(term590, term590.getClass(), "emptyStrategy", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Collection");
        argTypes[1] = Class.forName("org.apache.commons.math.stat.clustering.Clusterable");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "getNearestCluster", argTypes, term590, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


