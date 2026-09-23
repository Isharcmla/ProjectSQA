package org.apache.commons.math.optimization.linear;

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
import static org.apache.commons.math.optimization.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class SimplexTableau_initializeColumnLabels_1346305290129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79387;

    public SimplexTableau_initializeColumnLabels_1346305290129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term79439 = new ArrayList();
        term79387 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term79579 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        Object term79671 = newInstance(Class.forName("org.apache.commons.math.linear.RealVector$2"));
        Object term79763 = newInstance(Class.forName("org.apache.commons.math.linear.RealVector$2"));
        setIntField(term79387, term79387.getClass(), "numArtificialVariables", 1);
        setField(term79387, term79387.getClass(), "columnLabels", term79439);
        setField(term79671, term79671.getClass(), "val$v", term79763);
        setField(term79579, term79579.getClass(), "coefficients", term79671);
        setField(term79387, term79387.getClass(), "f", term79579);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "initializeColumnLabels", argTypes, term79387, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


