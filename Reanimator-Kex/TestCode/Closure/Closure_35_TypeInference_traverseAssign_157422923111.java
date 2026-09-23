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

public class TypeInference_traverseAssign_157422923111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32399;
     Object term32469;

    public TypeInference_traverseAssign_157422923111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32399 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term32469 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32539 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32609 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term32539, term32539.getClass(), "type", 49);
        setField(term32469, term32469.getClass(), "first", term32539);
        setField(term32469, term32469.getClass(), "last", term32609);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term32469;
        args[1] = null;
        try {
            callMethod(klass, "traverseAssign", argTypes, term32399, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


