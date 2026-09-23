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

public class TypedScopeCreator_createInitialScope_76224746476 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42215;
     Object term42389;

    public TypedScopeCreator_createInitialScope_76224746476() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42215 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term42319 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term42215, term42215.getClass(), "compiler", null);
        setField(term42215, term42215.getClass(), "typeRegistry", term42319);
        term42389 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term42459 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term42529 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term42389, term42389.getClass(), "type", 119);
        setField(term42389, term42389.getClass(), "parent", null);
        setField(term42459, term42459.getClass(), "next", term42529);
        setIntField(term42459, term42459.getClass(), "type", 0);
        setField(term42389, term42389.getClass(), "first", term42459);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term42389;
        try {
            callMethod(klass, "createInitialScope", argTypes, term42215, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


