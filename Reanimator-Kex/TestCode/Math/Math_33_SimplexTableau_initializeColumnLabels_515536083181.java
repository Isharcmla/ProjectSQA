package org.apache.commons.math3.optimization.linear;

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
import static org.apache.commons.math3.optimization.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class SimplexTableau_initializeColumnLabels_515536083181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93193;

    public SimplexTableau_initializeColumnLabels_515536083181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term93245 = new ArrayList();
        term93193 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term93387 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearObjectiveFunction"));
        Object term93481 = newInstance(Class.forName("org.apache.commons.math3.linear.RealVector$2"));
        setIntField(term93193, term93193.getClass(), "numArtificialVariables", 1);
        setField(term93193, term93193.getClass(), "columnLabels", term93245);
        setField(term93387, term93387.getClass(), "coefficients", term93481);
        setField(term93193, term93193.getClass(), "f", term93387);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "initializeColumnLabels", argTypes, term93193, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


