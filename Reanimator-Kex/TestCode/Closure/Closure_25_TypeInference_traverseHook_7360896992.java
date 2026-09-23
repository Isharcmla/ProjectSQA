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

public class TypeInference_traverseHook_7360896992 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27856;
     Object term27926;

    public TypeInference_traverseHook_7360896992() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27856 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term27926 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27996 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28066 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28136 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term27996, term27996.getClass(), "next", term28066);
        setIntField(term27996, term27996.getClass(), "type", 85);
        setField(term27926, term27926.getClass(), "first", term27996);
        setField(term27926, term27926.getClass(), "last", term28136);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term27926;
        args[1] = null;
        try {
            callMethod(klass, "traverseHook", argTypes, term27856, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


