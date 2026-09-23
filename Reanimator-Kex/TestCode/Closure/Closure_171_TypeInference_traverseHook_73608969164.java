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

public class TypeInference_traverseHook_73608969164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84573;
     Object term84643;

    public TypeInference_traverseHook_73608969164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84573 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term84643 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term84713 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term84783 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term84853 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term84713, term84713.getClass(), "next", term84783);
        setIntField(term84713, term84713.getClass(), "type", 86);
        setField(term84643, term84643.getClass(), "first", term84713);
        setField(term84643, term84643.getClass(), "last", term84853);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term84643;
        args[1] = null;
        try {
            callMethod(klass, "traverseHook", argTypes, term84573, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


