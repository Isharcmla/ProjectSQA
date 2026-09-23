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

public class TypedScopeCreator_attachLiteralTypes_52104352879 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49782;
     Object term49956;

    public TypedScopeCreator_attachLiteralTypes_52104352879() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49782 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term49886 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term49782, term49782.getClass(), "typeRegistry", term49886);
        term49956 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term49956, term49956.getClass(), "type", 44);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term49956;
        try {
            callMethod(klass, "attachLiteralTypes", argTypes, term49782, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


