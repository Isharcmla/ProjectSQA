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

public class TypeInference_traverseGetProp_220559067134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39757;
     Object term39827;

    public TypeInference_traverseGetProp_220559067134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39757 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term39827 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term39897 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term39967 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term39897, term39897.getClass(), "type", -941356098);
        setField(term39897, term39897.getClass(), "propListHead", null);
        setIntField(term39967, term39967.getClass(), "type", 127);
        setField(term39897, term39897.getClass(), "next", term39967);
        setField(term39827, term39827.getClass(), "first", term39897);
        setField(term39827, term39827.getClass(), "last", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term39827;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetProp", argTypes, term39757, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


