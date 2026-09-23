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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.math3.analysis.differentiation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class DSCompiler_compileCompositionIndirection_703738680176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term587253;
     Object term587379;
     Object term587016;

    public DSCompiler_compileCompositionIndirection_703738680176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term587253 = newInstance(Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        Object[] term587017 = (Object[]) newArray("[[I", 672);
        setField(term587253, term587253.getClass(), "compIndirection", term587017);
        term587379 = newInstance(Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        Object[] term587018 = (Object[]) newArray("[[I", 1);
        Object[] term587019 = (Object[]) newArray("[I", 1);
        int[] term587020 = (int[]) newIntArray(3);
        setIntElement(term587020, 1, 557280383);
        setElement(term587019, 0, term587020);
        setElement(term587018, 0, term587019);
        setField(term587379, term587379.getClass(), "compIndirection", term587018);
        term587016 = (Object[]) newArray("[I", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        argTypes[3] = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        argTypes[4] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        argTypes[5] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[6];
        args[0] = 2;
        args[1] = 1073741824;
        args[2] = term587253;
        args[3] = term587379;
        args[4] = term587016;
        args[5] = null;
        try {
            callMethod(klass, "compileCompositionIndirection", argTypes, null, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


