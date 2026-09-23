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

public class TypeCheck_visitAssign_1165544828147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43366;
     Object term43540;

    public TypeCheck_visitAssign_1165544828147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43366 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term43470 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term43366, term43366.getClass(), "typeRegistry", term43470);
        term43540 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term43636 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term43636, term43636.getClass(), "type", -30);
        setField(term43636, term43636.getClass(), "next", null);
        setField(term43540, term43540.getClass(), "propListHead", term43636);
        setField(term43540, term43540.getClass(), "first", term43540);
        setField(term43540, term43540.getClass(), "last", null);
        setIntField(term43540, term43540.getClass(), "type", 0);
        setField(term43540, term43540.getClass(), "jsType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term43540;
        try {
            callMethod(klass, "visitAssign", argTypes, term43366, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


