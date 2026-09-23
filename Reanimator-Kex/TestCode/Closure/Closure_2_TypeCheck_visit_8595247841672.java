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

public class TypeCheck_visit_8595247841672 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term568787;
     Object term568983;

    public TypeCheck_visit_8595247841672() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term568787 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term568891 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term568787, term568787.getClass(), "typeRegistry", term568891);
        term568983 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term569075 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term568983, term568983.getClass(), "type", 90);
        setIntField(term569075, term569075.getClass(), "type", 0);
        setField(term569075, term569075.getClass(), "jsType", null);
        setField(term568983, term568983.getClass(), "first", term569075);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term568983;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term568787, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


