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

public class TypeCheck_visitParameterList_2094647345102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61126;
     Object term61196;
     Object term61366;

    public TypeCheck_visitParameterList_2094647345102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61126 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term61196 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61266 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term61266, term61266.getClass(), "next", null);
        setField(term61196, term61196.getClass(), "first", term61266);
        term61366 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term61460 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term61530 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61600 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61670 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61766 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setField(term61530, term61530.getClass(), "first", term61600);
        setField(term61670, term61670.getClass(), "propListHead", term61766);
        setField(term61530, term61530.getClass(), "last", term61670);
        setField(term61460, term61460.getClass(), "parameters", term61530);
        setField(term61366, term61366.getClass(), "call", term61460);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term61196;
        args[2] = term61366;
        try {
            callMethod(klass, "visitParameterList", argTypes, term61126, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


