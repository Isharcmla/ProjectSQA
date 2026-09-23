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

public class TypeInference_traverseAssign_157422923113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32910;
     Object term32980;

    public TypeInference_traverseAssign_157422923113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32910 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term32980 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term33050 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term33120 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term33050, term33050.getClass(), "type", -615654495);
        setField(term33050, term33050.getClass(), "propListHead", null);
        setIntField(term33120, term33120.getClass(), "type", 123);
        setField(term33050, term33050.getClass(), "next", term33120);
        setField(term32980, term32980.getClass(), "first", term33050);
        setField(term32980, term32980.getClass(), "last", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term32980;
        args[1] = null;
        try {
            callMethod(klass, "traverseAssign", argTypes, term32910, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


