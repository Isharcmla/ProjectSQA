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

public class DSCompiler_compileCompositionIndirection_703738680116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61309;

    public DSCompiler_compileCompositionIndirection_703738680116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61309 = (Object[]) newArray("[[I", 1);
        Object[] term61310 = (Object[]) newArray("[I", 1);
        int[] term61311 = (int[]) newIntArray(2);
        setIntElement(term61311, 0, 1);
        setElement(term61310, 0, term61311);
        setElement(term61309, 0, term61310);
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
        args[0] = 0;
        args[1] = 0;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        Object retValue = callMethod(klass, "compileCompositionIndirection", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term61309));
    }

};


