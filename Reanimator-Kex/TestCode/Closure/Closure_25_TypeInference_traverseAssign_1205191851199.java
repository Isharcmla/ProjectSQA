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

public class TypeInference_traverseAssign_1205191851199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138402;
     Object term138472;

    public TypeInference_traverseAssign_1205191851199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138402 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term138472 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term138542 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term138612 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term138542, term138542.getClass(), "type", 117);
        setField(term138472, term138472.getClass(), "first", term138542);
        setField(term138472, term138472.getClass(), "last", term138612);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term138472;
        args[1] = null;
        try {
            callMethod(klass, "traverseAssign", argTypes, term138402, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


