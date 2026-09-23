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

public class TypeInference_traverseAssign_1205191851158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82962;
     Object term83032;

    public TypeInference_traverseAssign_1205191851158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82962 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term83032 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term83102 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term83172 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term83032, term83032.getClass(), "first", term83032);
        setField(term83032, term83032.getClass(), "last", term83102);
        setIntField(term83032, term83032.getClass(), "type", 1072005683);
        setIntField(term83172, term83172.getClass(), "type", 109);
        setField(term83032, term83032.getClass(), "next", term83172);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term83032;
        args[1] = null;
        try {
            callMethod(klass, "traverseAssign", argTypes, term82962, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


