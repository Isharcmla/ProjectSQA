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

public class TypedScopeCreator_createScope_26573221597 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70675;
     Object term70825;
     Object term71109;

    public TypedScopeCreator_createScope_26573221597() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70675 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term70755 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term70675, term70675.getClass(), "compiler", term70755);
        term70825 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term70895 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term70965 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term71035 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term70825, term70825.getClass(), "jsType", null);
        setIntField(term70825, term70825.getClass(), "type", 0);
        setField(term70825, term70825.getClass(), "parent", null);
        setField(term70965, term70965.getClass(), "next", null);
        setIntField(term70965, term70965.getClass(), "type", 125);
        setField(term70965, term70965.getClass(), "first", null);
        setField(term70965, term70965.getClass(), "parent", null);
        setField(term70895, term70895.getClass(), "next", term70965);
        setIntField(term70895, term70895.getClass(), "type", 0);
        setField(term71035, term71035.getClass(), "next", null);
        setIntField(term71035, term71035.getClass(), "type", 0);
        setField(term71035, term71035.getClass(), "first", null);
        setField(term71035, term71035.getClass(), "parent", null);
        setField(term70895, term70895.getClass(), "first", term71035);
        setField(term70895, term70895.getClass(), "parent", null);
        setField(term70825, term70825.getClass(), "first", term70895);
        term71109 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term71179 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term71303 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term71109, term71109.getClass(), "rootNode", term71179);
        setField(term71109, term71109.getClass(), "thisType", term71303);
        setIntField(term71109, term71109.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term70825;
        args[1] = term71109;
        try {
            callMethod(klass, "createScope", argTypes, term70675, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


