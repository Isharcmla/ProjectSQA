package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeInference_traverseReturn_1142297770363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term901388;
     Object term901458;

    public TypeInference_traverseReturn_1142297770363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term901388 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term901458 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term901528 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term901598 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term901668 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term901738 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term901808 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term901878 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term901948 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term902018 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term902088 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term902158 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term902228 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term902298 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term902368 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term902438 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term902508 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term902578 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term902648 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term902718 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term902788 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term902858 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term902928 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term902998 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term903068 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term901528, term901528.getClass(), "type", 29);
        setIntField(term901598, term901598.getClass(), "type", 29);
        setIntField(term901668, term901668.getClass(), "type", 29);
        setIntField(term901738, term901738.getClass(), "type", 29);
        setIntField(term901808, term901808.getClass(), "type", 29);
        setIntField(term901878, term901878.getClass(), "type", 29);
        setIntField(term901948, term901948.getClass(), "type", 29);
        setIntField(term902018, term902018.getClass(), "type", 29);
        setIntField(term902088, term902088.getClass(), "type", 29);
        setIntField(term902158, term902158.getClass(), "type", 29);
        setIntField(term902228, term902228.getClass(), "type", 29);
        setIntField(term902298, term902298.getClass(), "type", 29);
        setIntField(term902368, term902368.getClass(), "type", 29);
        setIntField(term902438, term902438.getClass(), "type", 29);
        setIntField(term902508, term902508.getClass(), "type", 29);
        setIntField(term902578, term902578.getClass(), "type", 29);
        setIntField(term902648, term902648.getClass(), "type", 29);
        setIntField(term902718, term902718.getClass(), "type", 29);
        setIntField(term902788, term902788.getClass(), "type", 29);
        setIntField(term902858, term902858.getClass(), "type", 29);
        setIntField(term902928, term902928.getClass(), "type", 29);
        setIntField(term902998, term902998.getClass(), "type", 29);
        setIntField(term903068, term903068.getClass(), "type", 67);
        setField(term902998, term902998.getClass(), "first", term903068);
        setField(term902928, term902928.getClass(), "first", term902998);
        setField(term902858, term902858.getClass(), "first", term902928);
        setField(term902788, term902788.getClass(), "first", term902858);
        setField(term902718, term902718.getClass(), "first", term902788);
        setField(term902648, term902648.getClass(), "first", term902718);
        setField(term902578, term902578.getClass(), "first", term902648);
        setField(term902508, term902508.getClass(), "first", term902578);
        setField(term902438, term902438.getClass(), "first", term902508);
        setField(term902368, term902368.getClass(), "first", term902438);
        setField(term902298, term902298.getClass(), "first", term902368);
        setField(term902228, term902228.getClass(), "first", term902298);
        setField(term902158, term902158.getClass(), "first", term902228);
        setField(term902088, term902088.getClass(), "first", term902158);
        setField(term902018, term902018.getClass(), "first", term902088);
        setField(term901948, term901948.getClass(), "first", term902018);
        setField(term901878, term901878.getClass(), "first", term901948);
        setField(term901808, term901808.getClass(), "first", term901878);
        setField(term901738, term901738.getClass(), "first", term901808);
        setField(term901668, term901668.getClass(), "first", term901738);
        setField(term901598, term901598.getClass(), "first", term901668);
        setField(term901528, term901528.getClass(), "first", term901598);
        setField(term901458, term901458.getClass(), "first", term901528);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term901458;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term901388, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


