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

public class SimplexTableau_getSolution_190069562197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65294;

    public SimplexTableau_getSolution_190069562197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term65346 = new ArrayList();
        term65294 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term65488 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearObjectiveFunction"));
        Object term65582 = newInstance(Class.forName("org.apache.commons.math3.linear.RealVector$2"));
        setField(term65294, term65294.getClass(), "columnLabels", term65346);
        setField(term65488, term65488.getClass(), "coefficients", term65582);
        setField(term65294, term65294.getClass(), "f", term65488);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getSolution", argTypes, term65294, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


