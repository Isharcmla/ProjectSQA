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

public class TypeInference_traverseGetProp_220559067145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77589;
     Object term77659;

    public TypeInference_traverseGetProp_220559067145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77589 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term77659 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term77729 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term77799 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term77729, term77729.getClass(), "type", 92);
        setField(term77659, term77659.getClass(), "first", term77729);
        setField(term77659, term77659.getClass(), "last", term77799);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term77659;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetProp", argTypes, term77589, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


