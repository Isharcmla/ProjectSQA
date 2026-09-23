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

public class TypedScopeCreator_createInitialScope_76224746446 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16956;
     Object term17210;

    public TypedScopeCreator_createInitialScope_76224746446() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16956 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term17036 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term17140 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term16956, term16956.getClass(), "compiler", term17036);
        setField(term16956, term16956.getClass(), "typeRegistry", term17140);
        term17210 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17280 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17350 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term17210, term17210.getClass(), "type", 114);
        setField(term17210, term17210.getClass(), "parent", null);
        setField(term17280, term17280.getClass(), "next", term17350);
        setIntField(term17280, term17280.getClass(), "type", 0);
        setField(term17210, term17210.getClass(), "first", term17280);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term17210;
        try {
            callMethod(klass, "createInitialScope", argTypes, term16956, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


