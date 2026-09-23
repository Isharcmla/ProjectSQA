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
import java.lang.ClassCastException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeCheck_shouldTraverse_435604074586 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term181428;
     Object term181498;

    public TypeCheck_shouldTraverse_435604074586() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term181428 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term181498 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term181594 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term181690 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term181772 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setIntField(term181498, term181498.getClass(), "type", 118);
        setIntField(term181594, term181594.getClass(), "type", -30);
        setIntField(term181690, term181690.getClass(), "type", 29);
        setField(term181690, term181690.getClass(), "objectValue", term181772);
        setField(term181594, term181594.getClass(), "next", term181690);
        setField(term181498, term181498.getClass(), "propListHead", term181594);
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
        args[1] = term181498;
        args[2] = null;
        try {
            callMethod(klass, "shouldTraverse", argTypes, term181428, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


