package org.apache.commons.math3.optimization.fitting;

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
import static org.apache.commons.math3.optimization.fitting.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class HarmonicFitter_fit_21021544687 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1537;

    public HarmonicFitter_fit_21021544687() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1729 = newInstance(Class.forName("org.apache.commons.math3.optimization.fitting.WeightedObservedPoint"));
        setDoubleField(term1729, term1729.getClass(), "y", 0.0);
        setDoubleField(term1729, term1729.getClass(), "weight", 0.0);
        Object term1869 = newInstance(Class.forName("org.apache.commons.math3.optimization.fitting.WeightedObservedPoint"));
        setDoubleField(term1869, term1869.getClass(), "y", 0.0);
        setDoubleField(term1869, term1869.getClass(), "weight", 0.0);
        ArrayList term1589 = new ArrayList();
        ((ArrayList) term1589).add(term1729);
        ((ArrayList) term1589).add(term1869);
        term1537 = newInstance(Class.forName("org.apache.commons.math3.optimization.fitting.HarmonicFitter"));
        setField(term1537, term1537.getClass(), "observations", term1589);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.fitting.HarmonicFitter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "fit", argTypes, term1537, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


