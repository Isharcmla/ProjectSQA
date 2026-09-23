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

public class TypeInference_traverseGetProp_1268327995345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term976847;
     Object term976917;

    public TypeInference_traverseGetProp_1268327995345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term976847 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term976917 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term976987 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term977057 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term976987, term976987.getClass(), "type", -941356098);
        setField(term976987, term976987.getClass(), "propListHead", null);
        setIntField(term977057, term977057.getClass(), "type", 25);
        setField(term976987, term976987.getClass(), "next", term977057);
        setField(term976917, term976917.getClass(), "first", term976987);
        setField(term976917, term976917.getClass(), "last", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term976917;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetProp", argTypes, term976847, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


