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

public class TypeInference_traverseCall_965214436141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44668;
     Object term44738;

    public TypeInference_traverseCall_965214436141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44668 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term44738 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term44808 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term44878 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term44808, term44808.getClass(), "type", 1935707624);
        setField(term44808, term44808.getClass(), "propListHead", null);
        setIntField(term44878, term44878.getClass(), "type", 81);
        setField(term44808, term44808.getClass(), "next", term44878);
        setField(term44738, term44738.getClass(), "first", term44808);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term44738;
        args[1] = null;
        try {
            callMethod(klass, "traverseCall", argTypes, term44668, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


