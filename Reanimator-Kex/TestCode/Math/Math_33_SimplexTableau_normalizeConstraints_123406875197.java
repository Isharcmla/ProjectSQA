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

public class SimplexTableau_normalizeConstraints_123406875197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106051;
     Object term106103;

    public SimplexTableau_normalizeConstraints_123406875197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term106051 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term106231 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        term106103 = new ArrayList();
        ((ArrayList) term106103).add(term106231);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
        ((ArrayList) term106103).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = term106103;
        try {
            callMethod(klass, "normalizeConstraints", argTypes, term106051, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


