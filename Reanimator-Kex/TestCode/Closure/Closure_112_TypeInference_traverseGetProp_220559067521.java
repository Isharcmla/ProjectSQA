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

public class TypeInference_traverseGetProp_220559067521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2258277;
     Object term2258347;

    public TypeInference_traverseGetProp_220559067521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2258277 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term2258347 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2258417 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2258487 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term2258347, term2258347.getClass(), "first", term2258347);
        setField(term2258347, term2258347.getClass(), "last", term2258417);
        setIntField(term2258347, term2258347.getClass(), "type", 1716165145);
        setIntField(term2258487, term2258487.getClass(), "type", 110);
        setField(term2258347, term2258347.getClass(), "next", term2258487);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term2258347;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetProp", argTypes, term2258277, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


