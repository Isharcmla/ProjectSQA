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

public class DSCompiler_compileMultiplicationIndirection_418585576113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39536;
     Object term39662;

    public DSCompiler_compileMultiplicationIndirection_418585576113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39536 = newInstance(Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        Object[] term39312 = (Object[]) newArray("[[I", 253);
        setField(term39536, term39536.getClass(), "multIndirection", term39312);
        term39662 = newInstance(Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        Object[] term39313 = (Object[]) newArray("[[I", 4);
        Object[] term39314 = (Object[]) newArray("[I", 1);
        int[] term39315 = (int[]) newIntArray(18);
        setElement(term39314, 0, term39315);
        setElement(term39313, 0, term39314);
        setField(term39662, term39662.getClass(), "multIndirection", term39313);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        argTypes[3] = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        argTypes[4] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[5];
        args[0] = -1;
        args[1] = -1;
        args[2] = term39536;
        args[3] = term39662;
        args[4] = null;
        try {
            callMethod(klass, "compileMultiplicationIndirection", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


