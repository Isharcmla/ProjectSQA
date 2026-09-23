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

public class GaussianFitter_fit_21284392954 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term26;

    public GaussianFitter_fit_21284392954() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4 = newInstance(Class.forName("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setDoubleField(term4, term4.getClass(), "weight", 0.13238746331190498);
        setDoubleField(term4, term4.getClass(), "x", 0.3455959125047594);
        setDoubleField(term4, term4.getClass(), "y", 0.5523635872663106);
        Object term8 = newInstance(Class.forName("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setDoubleField(term8, term8.getClass(), "weight", 0.544608645520025);
        setDoubleField(term8, term8.getClass(), "x", 0.28570734989730284);
        setDoubleField(term8, term8.getClass(), "y", 0.40176586625454525);
        Object term12 = newInstance(Class.forName("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setDoubleField(term12, term12.getClass(), "weight", 0.2641345529914265);
        setDoubleField(term12, term12.getClass(), "x", 0.36923381893433327);
        setDoubleField(term12, term12.getClass(), "y", 0.6076495596892013);
        Object term16 = newInstance(Class.forName("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setDoubleField(term16, term16.getClass(), "weight", 0.37773193782763337);
        setDoubleField(term16, term16.getClass(), "x", 0.8474802076607362);
        setDoubleField(term16, term16.getClass(), "y", 0.5183269973490326);
        Object term20 = newInstance(Class.forName("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setDoubleField(term20, term20.getClass(), "weight", 0.7655020693602768);
        setDoubleField(term20, term20.getClass(), "x", 0.1374549299694151);
        setDoubleField(term20, term20.getClass(), "y", 0.7031006357544823);
        ArrayList term2 = new ArrayList();
        ((ArrayList) term2).add(term4);
        ((ArrayList) term2).add(term8);
        ((ArrayList) term2).add(term12);
        ((ArrayList) term2).add(term16);
        ((ArrayList) term2).add(term20);
        term1 = newInstance(Class.forName("org.apache.commons.math.optimization.fitting.GaussianFitter"));
        setField(term1, term1.getClass(), "optimizer", null);
        setField(term1, term1.getClass(), "observations", term2);
        term26 = (double[]) newDoubleArray(4);
        setDoubleElement(term26, 0, 0.9527281779865117);
        setDoubleElement(term26, 1, 0.9828442029246764);
        setDoubleElement(term26, 2, 0.2779719046761513);
        setDoubleElement(term26, 3, 0.6436713023569729);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.fitting.GaussianFitter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term26;
        try {
            callMethod(klass, "fit", argTypes, term1, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


