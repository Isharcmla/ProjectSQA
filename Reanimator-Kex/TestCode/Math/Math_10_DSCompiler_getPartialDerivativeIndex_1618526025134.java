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

public class DSCompiler_getPartialDerivativeIndex_1618526025134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66376;
     Object term66237;
     Object term72042;
     Object term72043;

    public DSCompiler_getPartialDerivativeIndex_1618526025134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66376 = newInstance(Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setIntField(term66376, term66376.getClass(), "parameters", 0);
        term66237 = (int[]) newIntArray(0);
        term72042 = newInstance(Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setIntField(term72042, term72042.getClass(), "parameters", 0);
        setIntField(term72042, term72042.getClass(), "order", 0);
        setField(term72042, term72042.getClass(), "sizes", null);
        setField(term72042, term72042.getClass(), "derivativesIndirection", null);
        setField(term72042, term72042.getClass(), "lowerIndirection", null);
        setField(term72042, term72042.getClass(), "multIndirection", null);
        setField(term72042, term72042.getClass(), "compIndirection", null);
        term72043 = (int[]) newIntArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term66237;
        Object retValue = callMethod(klass, "getPartialDerivativeIndex", argTypes, term66376, args);
        assertTrue(recursiveEquals(term66376, term72042));
        assertTrue(recursiveEquals(term66237, term72043));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


