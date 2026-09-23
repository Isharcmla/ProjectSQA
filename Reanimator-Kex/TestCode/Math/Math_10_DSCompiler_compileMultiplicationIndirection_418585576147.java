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

public class DSCompiler_compileMultiplicationIndirection_418585576147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84035;
     Object term84161;
     Object term84181;
     Object term84183;
     Object term84168;

    public DSCompiler_compileMultiplicationIndirection_418585576147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84035 = newInstance(Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        Object[] term83840 = (Object[]) newArray("[[I", 496);
        setField(term84035, term84035.getClass(), "multIndirection", term83840);
        term84161 = newInstance(Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        Object[] term83841 = (Object[]) newArray("[[I", 1);
        Object[] term83842 = (Object[]) newArray("[I", 0);
        setElement(term83841, 0, term83842);
        setField(term84161, term84161.getClass(), "multIndirection", term83841);
        term84181 = newInstance(Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        Object[] term84182 = (Object[]) newArray("[[I", 496);
        setIntField(term84181, term84181.getClass(), "parameters", 0);
        setIntField(term84181, term84181.getClass(), "order", 0);
        setField(term84181, term84181.getClass(), "sizes", null);
        setField(term84181, term84181.getClass(), "derivativesIndirection", null);
        setField(term84181, term84181.getClass(), "lowerIndirection", null);
        setField(term84181, term84181.getClass(), "multIndirection", term84182);
        setField(term84181, term84181.getClass(), "compIndirection", null);
        term84183 = newInstance(Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        Object[] term84184 = (Object[]) newArray("[[I", 1);
        Object[] term84185 = (Object[]) newArray("[I", 0);
        setIntField(term84183, term84183.getClass(), "parameters", 0);
        setIntField(term84183, term84183.getClass(), "order", 0);
        setField(term84183, term84183.getClass(), "sizes", null);
        setField(term84183, term84183.getClass(), "derivativesIndirection", null);
        setField(term84183, term84183.getClass(), "lowerIndirection", null);
        setElement(term84184, 0, term84185);
        setField(term84183, term84183.getClass(), "multIndirection", term84184);
        setField(term84183, term84183.getClass(), "compIndirection", null);
        term84168 = (Object[]) newArray("[[I", 497);
        Object[] term84169 = (Object[]) newArray("[I", 0);
        setElement(term84168, 496, term84169);
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
        args[2] = term84035;
        args[3] = term84161;
        args[4] = null;
        Object retValue = callMethod(klass, "compileMultiplicationIndirection", argTypes, null, args);
        assertTrue(recursiveEquals(term84035, term84181));
        assertTrue(recursiveEquals(term84161, term84183));
        assertTrue(recursiveEquals(retValue, term84168));
    }

};


