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

public class DSCompiler_compileMultiplicationIndirection_418585576114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61284;

    public DSCompiler_compileMultiplicationIndirection_418585576114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61284 = (Object[]) newArray("[[I", 1);
        Object[] term61285 = (Object[]) newArray("[I", 1);
        int[] term61286 = (int[]) newIntArray(3);
        setIntElement(term61286, 0, 1);
        setElement(term61285, 0, term61286);
        setElement(term61284, 0, term61285);
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
        args[0] = 0;
        args[1] = 0;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        Object retValue = callMethod(klass, "compileMultiplicationIndirection", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term61284));
    }

};


