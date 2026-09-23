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

public class TypeInference_traverseAssign_157422923161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50148;
     Object term50218;

    public TypeInference_traverseAssign_157422923161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50148 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term50218 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term50288 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term50358 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term50288, term50288.getClass(), "type", 44);
        setField(term50218, term50218.getClass(), "first", term50288);
        setField(term50218, term50218.getClass(), "last", term50358);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term50218;
        args[1] = null;
        try {
            callMethod(klass, "traverseAssign", argTypes, term50148, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


