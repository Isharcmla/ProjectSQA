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
import java.lang.RuntimeException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypedScopeCreator_createScope_265732215133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98316;
     Object term98466;
     Object term98680;

    public TypedScopeCreator_createScope_265732215133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98316 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term98396 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term98316, term98316.getClass(), "compiler", term98396);
        term98466 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term98536 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term98606 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term98466, term98466.getClass(), "jsType", null);
        setIntField(term98466, term98466.getClass(), "type", 0);
        setField(term98466, term98466.getClass(), "parent", null);
        setField(term98536, term98536.getClass(), "next", term98606);
        setIntField(term98536, term98536.getClass(), "type", 83);
        setField(term98536, term98536.getClass(), "first", null);
        setField(term98466, term98466.getClass(), "first", term98536);
        term98680 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term98804 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term98680, term98680.getClass(), "rootNode", null);
        setField(term98680, term98680.getClass(), "thisType", term98804);
        setIntField(term98680, term98680.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term98466;
        args[1] = term98680;
        try {
            callMethod(klass, "createScope", argTypes, term98316, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


