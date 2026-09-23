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

public class TypeInference_traverseGetElem_100203513446 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1562582;
     Object term1562652;

    public TypeInference_traverseGetElem_100203513446() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1562582 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1562652 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1562722 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1562792 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1562862 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1562932 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1563002 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1563072 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1563142 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1562722, term1562722.getClass(), "type", 98);
        setField(term1562792, term1562792.getClass(), "next", term1562862);
        setIntField(term1562792, term1562792.getClass(), "type", 98);
        setField(term1562932, term1562932.getClass(), "next", term1563002);
        setIntField(term1562932, term1562932.getClass(), "type", 27);
        setField(term1562792, term1562792.getClass(), "first", term1562932);
        setField(term1562792, term1562792.getClass(), "last", term1563072);
        setField(term1562722, term1562722.getClass(), "first", term1562792);
        setField(term1562722, term1562722.getClass(), "last", term1563142);
        setField(term1562652, term1562652.getClass(), "first", term1562722);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1562652;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetElem", argTypes, term1562582, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


