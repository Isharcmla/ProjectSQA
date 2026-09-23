package org.apache.commons.math3.analysis.differentiation;

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
import static org.apache.commons.math3.analysis.differentiation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class DSCompiler_linearCombination_1960694852126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43821;

    public DSCompiler_linearCombination_1960694852126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43821 = newInstance(Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        Object[] term43681 = (Object[]) newArray("[I", 41);
        setField(term43821, term43821.getClass(), "sizes", term43681);
        setIntField(term43821, term43821.getClass(), "parameters", 40);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = double.class;
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        argTypes[2] = int.class;
        argTypes[3] = double.class;
        argTypes[4] = Array.newInstance(double.class, 0).getClass();
        argTypes[5] = int.class;
        argTypes[6] = Array.newInstance(double.class, 0).getClass();
        argTypes[7] = int.class;
        Object[] args = new Object[8];
        args[0] = 0.0;
        args[1] = null;
        args[2] = 0;
        args[3] = 0.0;
        args[4] = null;
        args[5] = 0;
        args[6] = null;
        args[7] = 0;
        try {
            callMethod(klass, "linearCombination", argTypes, term43821, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


