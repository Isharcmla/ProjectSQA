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

public class HarmonicFitter_fit_210215446811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6194;

    public HarmonicFitter_fit_210215446811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term6386 = newInstance(Class.forName("org.apache.commons.math3.optimization.fitting.WeightedObservedPoint"));
        setDoubleField(term6386, term6386.getClass(), "y", 0.0);
        setDoubleField(term6386, term6386.getClass(), "weight", 0.0);
        Object term6526 = newInstance(Class.forName("org.apache.commons.math3.optimization.fitting.WeightedObservedPoint"));
        setDoubleField(term6526, term6526.getClass(), "y", 0.0);
        setDoubleField(term6526, term6526.getClass(), "weight", 0.0);
        Object term6666 = newInstance(Class.forName("org.apache.commons.math3.optimization.fitting.WeightedObservedPoint"));
        setDoubleField(term6666, term6666.getClass(), "y", 0.0);
        setDoubleField(term6666, term6666.getClass(), "weight", 0.0);
        ArrayList term6246 = new ArrayList();
        ((ArrayList) term6246).add(term6386);
        ((ArrayList) term6246).add(term6526);
        ((ArrayList) term6246).add(term6666);
        term6194 = newInstance(Class.forName("org.apache.commons.math3.optimization.fitting.HarmonicFitter"));
        setField(term6194, term6194.getClass(), "observations", term6246);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.fitting.HarmonicFitter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "fit", argTypes, term6194, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


