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

public class GaussianFitter_fit_212843929570 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32756;

    public GaussianFitter_fit_212843929570() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term32936 = newInstance(Class.forName("org.apache.commons.math.analysis.function.Gaussian$Parametric"));
        Object term32974 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term32808 = new ArrayList();
        ((ArrayList) term32808).add(term32936);
        ((ArrayList) term32808).add(term32974);
        term32756 = newInstance(Class.forName("org.apache.commons.math.optimization.fitting.GaussianFitter"));
        setField(term32756, term32756.getClass(), "observations", term32808);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.fitting.GaussianFitter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "fit", argTypes, term32756, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


