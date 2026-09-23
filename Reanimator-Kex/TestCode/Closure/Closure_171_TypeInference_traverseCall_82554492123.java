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

public class TypeInference_traverseCall_82554492123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71270;
     Object term71340;

    public TypeInference_traverseCall_82554492123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71270 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term71340 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term71410 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term71480 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term71410, term71410.getClass(), "type", -945116798);
        setIntField(term71480, term71480.getClass(), "type", 25);
        setField(term71410, term71410.getClass(), "next", term71480);
        setField(term71340, term71340.getClass(), "first", term71410);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term71340;
        args[1] = null;
        try {
            callMethod(klass, "traverseCall", argTypes, term71270, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


