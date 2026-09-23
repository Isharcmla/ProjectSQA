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

public class TypeInference_traverseChildren_431151291138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43984;
     Object term44054;

    public TypeInference_traverseChildren_431151291138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43984 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term44054 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term44124 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term44194 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term44124, term44124.getClass(), "type", 1241164745);
        setField(term44124, term44124.getClass(), "propListHead", null);
        setIntField(term44194, term44194.getClass(), "type", 45);
        setField(term44124, term44124.getClass(), "next", term44194);
        setField(term44054, term44054.getClass(), "first", term44124);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term44054;
        args[1] = null;
        try {
            callMethod(klass, "traverseChildren", argTypes, term43984, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


