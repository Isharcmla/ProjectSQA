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

public class TypeInference_traverseAssign_1205191851406 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1161399;
     Object term1161469;

    public TypeInference_traverseAssign_1205191851406() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1161399 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1161469 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1161539 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1161609 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1161469, term1161469.getClass(), "first", term1161469);
        setField(term1161469, term1161469.getClass(), "last", term1161539);
        setIntField(term1161469, term1161469.getClass(), "type", 1072005683);
        setIntField(term1161609, term1161609.getClass(), "type", 114);
        setField(term1161469, term1161469.getClass(), "next", term1161609);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1161469;
        args[1] = null;
        try {
            callMethod(klass, "traverseAssign", argTypes, term1161399, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


