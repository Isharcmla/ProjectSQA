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

public class SimplexTableau_normalize_68256699977 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58978;
     Object term59106;

    public SimplexTableau_normalize_68256699977() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58978 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        term59106 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setDoubleField(term59106, term59106.getClass(), "value", -9.2188684372274053E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint");
        Object[] args = new Object[1];
        args[0] = term59106;
        try {
            callMethod(klass, "normalize", argTypes, term58978, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


