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

public class TypeInference_traverseGetElem_100203513436 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1458727;
     Object term1458797;

    public TypeInference_traverseGetElem_100203513436() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1458727 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1458797 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1458867 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1458937 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1459007 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1459077 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1458867, term1458867.getClass(), "type", 98);
        setField(term1458937, term1458937.getClass(), "next", term1459007);
        setIntField(term1458937, term1458937.getClass(), "type", 115);
        setField(term1458867, term1458867.getClass(), "first", term1458937);
        setField(term1458867, term1458867.getClass(), "last", term1459077);
        setField(term1458797, term1458797.getClass(), "first", term1458867);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1458797;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetElem", argTypes, term1458727, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


