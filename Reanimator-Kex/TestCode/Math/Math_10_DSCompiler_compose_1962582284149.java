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
import static org.apache.commons.math3.analysis.differentiation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.analysis.differentiation.EqualityUtils.*;
import java.lang.Object;

public class DSCompiler_compose_1962582284149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84327;
     Object term84335;

    public DSCompiler_compose_1962582284149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84327 = newInstance(Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        Object[] term84189 = (Object[]) newArray("[[I", 0);
        setField(term84327, term84327.getClass(), "compIndirection", term84189);
        term84335 = newInstance(Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        Object[] term84336 = (Object[]) newArray("[[I", 0);
        setIntField(term84335, term84335.getClass(), "parameters", 0);
        setIntField(term84335, term84335.getClass(), "order", 0);
        setField(term84335, term84335.getClass(), "sizes", null);
        setField(term84335, term84335.getClass(), "derivativesIndirection", null);
        setField(term84335, term84335.getClass(), "lowerIndirection", null);
        setField(term84335, term84335.getClass(), "multIndirection", null);
        setField(term84335, term84335.getClass(), "compIndirection", term84336);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = Array.newInstance(double.class, 0).getClass();
        argTypes[3] = Array.newInstance(double.class, 0).getClass();
        argTypes[4] = int.class;
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = 0;
        args[2] = null;
        args[3] = null;
        args[4] = 0;
        callMethod(klass, "compose", argTypes, term84327, args);
        assertTrue(recursiveEquals(term84327, term84335));
    }

};


