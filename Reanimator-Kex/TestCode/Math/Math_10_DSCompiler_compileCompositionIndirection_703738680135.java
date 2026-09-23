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

public class DSCompiler_compileCompositionIndirection_703738680135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66537;
     Object term66663;
     Object term72058;
     Object term72060;
     Object term72047;

    public DSCompiler_compileCompositionIndirection_703738680135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66537 = newInstance(Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        Object[] term66383 = (Object[]) newArray("[[I", 0);
        setField(term66537, term66537.getClass(), "compIndirection", term66383);
        term66663 = newInstance(Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(term66663, term66663.getClass(), "compIndirection", term66383);
        term72058 = newInstance(Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        Object[] term72059 = (Object[]) newArray("[[I", 0);
        setIntField(term72058, term72058.getClass(), "parameters", 0);
        setIntField(term72058, term72058.getClass(), "order", 0);
        setField(term72058, term72058.getClass(), "sizes", null);
        setField(term72058, term72058.getClass(), "derivativesIndirection", null);
        setField(term72058, term72058.getClass(), "lowerIndirection", null);
        setField(term72058, term72058.getClass(), "multIndirection", null);
        setField(term72058, term72058.getClass(), "compIndirection", term72059);
        term72060 = newInstance(Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        Object[] term72061 = (Object[]) newArray("[[I", 0);
        setIntField(term72060, term72060.getClass(), "parameters", 0);
        setIntField(term72060, term72060.getClass(), "order", 0);
        setField(term72060, term72060.getClass(), "sizes", null);
        setField(term72060, term72060.getClass(), "derivativesIndirection", null);
        setField(term72060, term72060.getClass(), "lowerIndirection", null);
        setField(term72060, term72060.getClass(), "multIndirection", null);
        setField(term72060, term72060.getClass(), "compIndirection", term72061);
        term72047 = (Object[]) newArray("[[I", 0);
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
        args[0] = -1;
        args[1] = -1;
        args[2] = term66537;
        args[3] = term66663;
        args[4] = null;
        args[5] = null;
        Object retValue = callMethod(klass, "compileCompositionIndirection", argTypes, null, args);
        assertTrue(recursiveEquals(term66537, term72058));
        assertTrue(recursiveEquals(term66663, term72060));
        assertTrue(recursiveEquals(retValue, term72047));
    }

};


