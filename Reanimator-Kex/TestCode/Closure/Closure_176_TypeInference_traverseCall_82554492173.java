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

public class TypeInference_traverseCall_82554492173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84326;
     Object term84396;

    public TypeInference_traverseCall_82554492173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84326 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term84396 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term84466 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term84536 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term84466, term84466.getClass(), "type", -945116798);
        setIntField(term84536, term84536.getClass(), "type", 135);
        setField(term84466, term84466.getClass(), "next", term84536);
        setField(term84396, term84396.getClass(), "first", term84466);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term84396;
        args[1] = null;
        try {
            callMethod(klass, "traverseCall", argTypes, term84326, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


