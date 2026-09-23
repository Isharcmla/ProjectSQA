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

public class TypeInference_traverseCall_82554492156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80771;
     Object term80841;

    public TypeInference_traverseCall_82554492156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80771 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term80841 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term80911 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term80981 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term80911, term80911.getClass(), "type", -945116798);
        setIntField(term80981, term80981.getClass(), "type", 107);
        setField(term80911, term80911.getClass(), "next", term80981);
        setField(term80841, term80841.getClass(), "first", term80911);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term80841;
        args[1] = null;
        try {
            callMethod(klass, "traverseCall", argTypes, term80771, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


