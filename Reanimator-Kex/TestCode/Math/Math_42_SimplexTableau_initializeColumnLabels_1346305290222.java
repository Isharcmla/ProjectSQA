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

public class SimplexTableau_initializeColumnLabels_1346305290222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134103;

    public SimplexTableau_initializeColumnLabels_1346305290222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term134193 = newInstance(Class.forName("java.lang.Object"));
        Object term134231 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term134155 = new ArrayList();
        ((ArrayList) term134155).add(term134193);
        ((ArrayList) term134155).add(term134231);
        term134103 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term134371 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        Object term134473 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        setIntField(term134103, term134103.getClass(), "numArtificialVariables", 0);
        setField(term134103, term134103.getClass(), "columnLabels", term134155);
        setIntField(term134473, term134473.getClass(), "virtualSize", 0);
        setField(term134371, term134371.getClass(), "coefficients", term134473);
        setField(term134103, term134103.getClass(), "f", term134371);
        setBooleanField(term134103, term134103.getClass(), "restrictToNonNegative", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "initializeColumnLabels", argTypes, term134103, args);
    }

};


