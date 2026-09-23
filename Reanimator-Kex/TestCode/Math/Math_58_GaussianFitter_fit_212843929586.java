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

public class GaussianFitter_fit_212843929586 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43833;

    public GaussianFitter_fit_212843929586() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term44023 = newInstance(Class.forName("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setDoubleField(term44023, term44023.getClass(), "y", 0.0);
        setDoubleField(term44023, term44023.getClass(), "weight", 0.0);
        Object term44161 = newInstance(Class.forName("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setDoubleField(term44161, term44161.getClass(), "y", 0.0);
        setDoubleField(term44161, term44161.getClass(), "weight", 0.0);
        ArrayList term43885 = new ArrayList();
        ((ArrayList) term43885).add(term44023);
        ((ArrayList) term43885).add(term44161);
        ((ArrayList) term43885).add((Object)null);
        ((ArrayList) term43885).add(term44161);
        ((ArrayList) term43885).add(term44161);
        ((ArrayList) term43885).add(term44161);
        ((ArrayList) term43885).add(term44161);
        ((ArrayList) term43885).add(term44161);
        ((ArrayList) term43885).add(term44161);
        ((ArrayList) term43885).add(term44161);
        ((ArrayList) term43885).add(term44161);
        ((ArrayList) term43885).add(term44161);
        ((ArrayList) term43885).add(term44161);
        ((ArrayList) term43885).add(term44161);
        ((ArrayList) term43885).add(term44161);
        ((ArrayList) term43885).add(term44161);
        ((ArrayList) term43885).add(term44161);
        ((ArrayList) term43885).add(term44161);
        ((ArrayList) term43885).add(term44161);
        ((ArrayList) term43885).add(term44161);
        ((ArrayList) term43885).add(term44161);
        ((ArrayList) term43885).add(term44161);
        ((ArrayList) term43885).add(term44161);
        ((ArrayList) term43885).add(term44161);
        ((ArrayList) term43885).add(term44161);
        ((ArrayList) term43885).add(term44161);
        ((ArrayList) term43885).add(term44161);
        ((ArrayList) term43885).add(term44161);
        ((ArrayList) term43885).add(term44161);
        ((ArrayList) term43885).add(term44161);
        ((ArrayList) term43885).add(term44161);
        ((ArrayList) term43885).add(term44161);
        ((ArrayList) term43885).add(term44161);
        ((ArrayList) term43885).add(term44161);
        ((ArrayList) term43885).add(term44161);
        ((ArrayList) term43885).add(term44161);
        ((ArrayList) term43885).add(term44161);
        ((ArrayList) term43885).add(term44161);
        ((ArrayList) term43885).add(term44161);
        ((ArrayList) term43885).add(term44161);
        ((ArrayList) term43885).add(term44161);
        ((ArrayList) term43885).add(term44161);
        ((ArrayList) term43885).add(term44161);
        ((ArrayList) term43885).add(term44161);
        ((ArrayList) term43885).add(term44161);
        ((ArrayList) term43885).add(term44161);
        ((ArrayList) term43885).add(term44161);
        ((ArrayList) term43885).add(term44161);
        ((ArrayList) term43885).add(term44161);
        ((ArrayList) term43885).add(term44161);
        ((ArrayList) term43885).add(term44161);
        ((ArrayList) term43885).add(term44161);
        ((ArrayList) term43885).add(term44161);
        term43833 = newInstance(Class.forName("org.apache.commons.math.optimization.fitting.GaussianFitter"));
        setField(term43833, term43833.getClass(), "observations", term43885);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.fitting.GaussianFitter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "fit", argTypes, term43833, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


