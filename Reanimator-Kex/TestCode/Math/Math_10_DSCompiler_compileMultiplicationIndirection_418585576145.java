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

public class DSCompiler_compileMultiplicationIndirection_418585576145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83286;
     Object term83412;
     Object term82988;

    public DSCompiler_compileMultiplicationIndirection_418585576145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83286 = newInstance(Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        Object[] term83039 = (Object[]) newArray("[[I", 0);
        setField(term83286, term83286.getClass(), "multIndirection", term83039);
        term83412 = newInstance(Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        Object[] term83040 = (Object[]) newArray("[[I", 929);
        Object[] term83041 = (Object[]) newArray("[I", 2);
        int[] term83042 = (int[]) newIntArray(16);
        int[] term83059 = (int[]) newIntArray(0);
        setElement(term83041, 0, term83042);
        setElement(term83041, 1, term83059);
        setElement(term83040, 0, term83041);
        setField(term83412, term83412.getClass(), "multIndirection", term83040);
        term82988 = (int[]) newIntArray(50);
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
        args[2] = term83286;
        args[3] = term83412;
        args[4] = term82988;
        try {
            callMethod(klass, "compileMultiplicationIndirection", argTypes, null, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


