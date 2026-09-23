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

public class TypedScopeCreator_createScope_26573221589 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55916;
     Object term55986;
     Object term56200;

    public TypedScopeCreator_createScope_26573221589() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55916 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term55916, term55916.getClass(), "compiler", null);
        term55986 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term56056 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term56126 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term55986, term55986.getClass(), "jsType", null);
        setIntField(term55986, term55986.getClass(), "type", 0);
        setField(term55986, term55986.getClass(), "parent", null);
        setField(term56056, term56056.getClass(), "next", null);
        setIntField(term56056, term56056.getClass(), "type", 0);
        setField(term56126, term56126.getClass(), "next", null);
        setIntField(term56126, term56126.getClass(), "type", 83);
        setField(term56126, term56126.getClass(), "first", null);
        setField(term56056, term56056.getClass(), "first", term56126);
        setField(term55986, term55986.getClass(), "first", term56056);
        term56200 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term56270 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term56200, term56200.getClass(), "rootNode", term56270);
        setField(term56200, term56200.getClass(), "thisType", null);
        setIntField(term56200, term56200.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term55986;
        args[1] = term56200;
        try {
            callMethod(klass, "createScope", argTypes, term55916, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


