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

public class DSCompiler_compileCompositionIndirection_703738680161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term339133;
     Object term339534;

    public DSCompiler_compileCompositionIndirection_703738680161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term339133 = newInstance(Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        Object[] term331988 = (Object[]) newArray("[[I", 0);
        setField(term339133, term339133.getClass(), "compIndirection", term331988);
        term339534 = newInstance(Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        Object[] term331989 = (Object[]) newArray("[[I", 4);
        Object[] term331990 = (Object[]) newArray("[I", 4);
        int[] term331991 = (int[]) newIntArray(752);
        int[] term332744 = (int[]) newIntArray(0);
        setIntElement(term331991, 1, 721419772);
        setElement(term331990, 0, term331991);
        setElement(term331990, 1, term331991);
        setElement(term331990, 2, term332744);
        setElement(term331990, 3, term331991);
        setElement(term331989, 0, term331990);
        setField(term339534, term339534.getClass(), "compIndirection", term331989);
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
        args[2] = term339133;
        args[3] = term339534;
        args[4] = null;
        args[5] = null;
        try {
            callMethod(klass, "compileCompositionIndirection", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


