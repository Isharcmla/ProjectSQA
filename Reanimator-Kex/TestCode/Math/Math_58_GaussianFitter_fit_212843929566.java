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
import java.lang.ClassCastException;
import static org.apache.commons.math.optimization.fitting.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.util.Iterator;

public class GaussianFitter_fit_212843929566 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30837;

    public GaussianFitter_fit_212843929566() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term31027 = newInstance(Class.forName("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setDoubleField(term31027, term31027.getClass(), "y", 0.0);
        setDoubleField(term31027, term31027.getClass(), "weight", 0.0);
        ArrayList term31088 = new ArrayList();
        Iterator term31087 =  ((ArrayList) term31088).iterator();
        ArrayList term30889 = new ArrayList();
        ((ArrayList) term30889).add(term31027);
        ((ArrayList) term30889).add(term31087);
        ((ArrayList) term30889).add(term31027);
        ((ArrayList) term30889).add(term31027);
        ((ArrayList) term30889).add(term31027);
        ((ArrayList) term30889).add(term31027);
        ((ArrayList) term30889).add(term31027);
        ((ArrayList) term30889).add(term31027);
        ((ArrayList) term30889).add((Object)null);
        ((ArrayList) term30889).add(term31027);
        term30837 = newInstance(Class.forName("org.apache.commons.math.optimization.fitting.GaussianFitter"));
        setField(term30837, term30837.getClass(), "observations", term30889);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.fitting.GaussianFitter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "fit", argTypes, term30837, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


