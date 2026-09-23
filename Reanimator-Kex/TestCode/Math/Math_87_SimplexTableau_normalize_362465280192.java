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
import java.lang.Object;

public class SimplexTableau_normalize_362465280192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113728;
     Object term113854;

    public SimplexTableau_normalize_362465280192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term113728 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        term113854 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        Object term113956 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term114064 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setDoubleField(term113854, term113854.getClass(), "value", -9.2188684372274053E18);
        setIntField(term113956, term113956.getClass(), "virtualSize", 0);
        setField(term113956, term113956.getClass(), "entries", term114064);
        setField(term113854, term113854.getClass(), "coefficients", term113956);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint");
        Object[] args = new Object[1];
        args[0] = term113854;
        try {
            callMethod(klass, "normalize", argTypes, term113728, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


