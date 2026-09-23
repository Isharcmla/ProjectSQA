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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypedScopeCreator_createScope_26573221579 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45805;
     Object term45875;
     Object term46089;

    public TypedScopeCreator_createScope_26573221579() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45805 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term45805, term45805.getClass(), "compiler", null);
        term45875 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term45945 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term46015 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term45875, term45875.getClass(), "jsType", null);
        setIntField(term45875, term45875.getClass(), "type", 0);
        setField(term45875, term45875.getClass(), "parent", null);
        setField(term45945, term45945.getClass(), "next", null);
        setIntField(term45945, term45945.getClass(), "type", 122);
        setField(term46015, term46015.getClass(), "next", null);
        setIntField(term46015, term46015.getClass(), "type", 125);
        setField(term46015, term46015.getClass(), "first", null);
        setField(term45945, term45945.getClass(), "first", term46015);
        setField(term45875, term45875.getClass(), "first", term45945);
        term46089 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term46159 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term46089, term46089.getClass(), "rootNode", term46159);
        setField(term46089, term46089.getClass(), "thisType", null);
        setIntField(term46089, term46089.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term45875;
        args[1] = term46089;
        callMethod(klass, "createScope", argTypes, term45805, args);
    }

};


