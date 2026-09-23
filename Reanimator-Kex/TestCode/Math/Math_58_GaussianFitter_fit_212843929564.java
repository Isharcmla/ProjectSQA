package org.apache.commons.math.optimization.fitting;

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
import static org.apache.commons.math.optimization.fitting.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class GaussianFitter_fit_212843929564 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29978;

    public GaussianFitter_fit_212843929564() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term30168 = newInstance(Class.forName("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setDoubleField(term30168, term30168.getClass(), "y", 0.0);
        setDoubleField(term30168, term30168.getClass(), "weight", 0.0);
        Object term30306 = newInstance(Class.forName("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setDoubleField(term30306, term30306.getClass(), "y", 0.0);
        setDoubleField(term30306, term30306.getClass(), "weight", 0.0);
        ArrayList term30030 = new ArrayList();
        ((ArrayList) term30030).add(term30168);
        ((ArrayList) term30030).add(term30306);
        ((ArrayList) term30030).add(term30168);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        ((ArrayList) term30030).add((Object)null);
        term29978 = newInstance(Class.forName("org.apache.commons.math.optimization.fitting.GaussianFitter"));
        setField(term29978, term29978.getClass(), "observations", term30030);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.fitting.GaussianFitter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "fit", argTypes, term29978, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


