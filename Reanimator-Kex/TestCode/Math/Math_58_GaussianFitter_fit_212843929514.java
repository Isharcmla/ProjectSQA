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

public class GaussianFitter_fit_212843929514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3115;

    public GaussianFitter_fit_212843929514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term3305 = newInstance(Class.forName("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setDoubleField(term3305, term3305.getClass(), "y", 0.0);
        setDoubleField(term3305, term3305.getClass(), "weight", 0.0);
        Object term3443 = newInstance(Class.forName("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setDoubleField(term3443, term3443.getClass(), "y", 0.0);
        setDoubleField(term3443, term3443.getClass(), "weight", 0.0);
        Object term3581 = newInstance(Class.forName("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setDoubleField(term3581, term3581.getClass(), "y", 0.0);
        setDoubleField(term3581, term3581.getClass(), "weight", 0.0);
        Object term3719 = newInstance(Class.forName("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setDoubleField(term3719, term3719.getClass(), "y", 0.0);
        setDoubleField(term3719, term3719.getClass(), "weight", 0.0);
        ArrayList term3167 = new ArrayList();
        ((ArrayList) term3167).add(term3305);
        ((ArrayList) term3167).add(term3443);
        ((ArrayList) term3167).add(term3581);
        ((ArrayList) term3167).add(term3719);
        term3115 = newInstance(Class.forName("org.apache.commons.math.optimization.fitting.GaussianFitter"));
        setField(term3115, term3115.getClass(), "observations", term3167);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.fitting.GaussianFitter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "fit", argTypes, term3115, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


