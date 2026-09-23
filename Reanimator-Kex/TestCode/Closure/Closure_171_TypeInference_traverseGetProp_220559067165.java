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

public class TypeInference_traverseGetProp_220559067165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85244;
     Object term85314;

    public TypeInference_traverseGetProp_220559067165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term85244 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term85314 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term85384 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term85454 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term85384, term85384.getClass(), "type", 153);
        setField(term85314, term85314.getClass(), "first", term85384);
        setField(term85314, term85314.getClass(), "last", term85454);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term85314;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetProp", argTypes, term85244, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


