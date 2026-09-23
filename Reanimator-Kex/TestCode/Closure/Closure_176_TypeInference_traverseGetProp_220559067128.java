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

public class TypeInference_traverseGetProp_220559067128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70773;
     Object term70843;

    public TypeInference_traverseGetProp_220559067128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70773 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term70843 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term70913 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term70983 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term70843, term70843.getClass(), "first", term70843);
        setField(term70843, term70843.getClass(), "last", term70913);
        setIntField(term70843, term70843.getClass(), "type", -728760750);
        setIntField(term70983, term70983.getClass(), "type", 10);
        setField(term70843, term70843.getClass(), "next", term70983);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term70843;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetProp", argTypes, term70773, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


