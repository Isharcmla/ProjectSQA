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
import static org.apache.commons.math.optimization.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class SimplexTableau_initializeColumnLabels_1346305290223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134682;

    public SimplexTableau_initializeColumnLabels_1346305290223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term134734 = new ArrayList();
        term134682 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term134874 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        Object term134976 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        setIntField(term134682, term134682.getClass(), "numArtificialVariables", 0);
        setField(term134682, term134682.getClass(), "columnLabels", term134734);
        setIntField(term134976, term134976.getClass(), "virtualSize", 0);
        setField(term134874, term134874.getClass(), "coefficients", term134976);
        setField(term134682, term134682.getClass(), "f", term134874);
        setBooleanField(term134682, term134682.getClass(), "restrictToNonNegative", false);
        setIntField(term134682, term134682.getClass(), "numSlackVariables", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "initializeColumnLabels", argTypes, term134682, args);
    }

};


