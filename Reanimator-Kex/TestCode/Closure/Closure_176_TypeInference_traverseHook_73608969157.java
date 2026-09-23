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

public class TypeInference_traverseHook_73608969157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81091;
     Object term81161;

    public TypeInference_traverseHook_73608969157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81091 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term81161 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term81231 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term81301 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term81371 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term81231, term81231.getClass(), "next", term81301);
        setIntField(term81231, term81231.getClass(), "type", 44);
        setField(term81161, term81161.getClass(), "first", term81231);
        setField(term81161, term81161.getClass(), "last", term81371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term81161;
        args[1] = null;
        try {
            callMethod(klass, "traverseHook", argTypes, term81091, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


