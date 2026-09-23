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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeInference_traverseGetProp_220559067207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97506;
     Object term97576;

    public TypeInference_traverseGetProp_220559067207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97506 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term97576 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term97646 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term97716 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term97646, term97646.getClass(), "type", 34);
        setField(term97576, term97576.getClass(), "first", term97646);
        setField(term97576, term97576.getClass(), "last", term97716);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term97576;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetProp", argTypes, term97506, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


