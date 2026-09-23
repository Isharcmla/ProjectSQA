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

public class CodeGenerator_isOneExactlyFunctionOrDo_21141200879 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term919;
     Object term920;

    public CodeGenerator_isOneExactlyFunctionOrDo_21141200879() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term919 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term919, term919.getClass(), "cc", null);
        setField(term919, term919.getClass(), "outputCharsetEncoder", null);
        term920 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term922 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term924 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term927 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term930 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term933 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term937 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term940 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term943 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term920, term920.getClass(), "type", 454281060);
        setIntField(term922, term922.getClass(), "type", 292681826);
        setIntField(term924, term924.getClass(), "type", 0);
        setField(term924, term924.getClass(), "next", null);
        setField(term924, term924.getClass(), "first", null);
        setField(term924, term924.getClass(), "last", null);
        setField(term924, term924.getClass(), "propListHead", null);
        setIntField(term924, term924.getClass(), "sourcePosition", 0);
        setField(term924, term924.getClass(), "jsType", null);
        setField(term924, term924.getClass(), "parent", null);
        setField(term922, term922.getClass(), "next", term924);
        setIntField(term927, term927.getClass(), "type", 0);
        setField(term927, term927.getClass(), "next", null);
        setField(term927, term927.getClass(), "first", null);
        setField(term927, term927.getClass(), "last", null);
        setField(term927, term927.getClass(), "propListHead", null);
        setIntField(term927, term927.getClass(), "sourcePosition", 0);
        setField(term927, term927.getClass(), "jsType", null);
        setField(term927, term927.getClass(), "parent", null);
        setField(term922, term922.getClass(), "first", term927);
        setIntField(term930, term930.getClass(), "type", 0);
        setField(term930, term930.getClass(), "next", null);
        setField(term930, term930.getClass(), "first", null);
        setField(term930, term930.getClass(), "last", null);
        setField(term930, term930.getClass(), "propListHead", null);
        setIntField(term930, term930.getClass(), "sourcePosition", 0);
        setField(term930, term930.getClass(), "jsType", null);
        setField(term930, term930.getClass(), "parent", null);
        setField(term922, term922.getClass(), "last", term930);
        setField(term933, term933.getClass(), "next", null);
        setIntField(term933, term933.getClass(), "type", 0);
        setIntField(term933, term933.getClass(), "intValue", 0);
        setField(term933, term933.getClass(), "objectValue", null);
        setField(term922, term922.getClass(), "propListHead", term933);
        setIntField(term922, term922.getClass(), "sourcePosition", 493620644);
        setField(term922, term922.getClass(), "jsType", null);
        setField(term922, term922.getClass(), "parent", null);
        setField(term920, term920.getClass(), "next", term922);
        setIntField(term937, term937.getClass(), "type", 0);
        setField(term937, term937.getClass(), "next", null);
        setField(term937, term937.getClass(), "first", null);
        setField(term937, term937.getClass(), "last", null);
        setField(term937, term937.getClass(), "propListHead", null);
        setIntField(term937, term937.getClass(), "sourcePosition", 0);
        setField(term937, term937.getClass(), "jsType", null);
        setField(term937, term937.getClass(), "parent", null);
        setField(term920, term920.getClass(), "first", term937);
        setIntField(term940, term940.getClass(), "type", 0);
        setField(term940, term940.getClass(), "next", null);
        setField(term940, term940.getClass(), "first", null);
        setField(term940, term940.getClass(), "last", null);
        setField(term940, term940.getClass(), "propListHead", null);
        setIntField(term940, term940.getClass(), "sourcePosition", 0);
        setField(term940, term940.getClass(), "jsType", null);
        setField(term940, term940.getClass(), "parent", null);
        setField(term920, term920.getClass(), "last", term940);
        setField(term943, term943.getClass(), "next", null);
        setIntField(term943, term943.getClass(), "type", 0);
        setIntField(term943, term943.getClass(), "intValue", 0);
        setField(term943, term943.getClass(), "objectValue", null);
        setField(term920, term920.getClass(), "propListHead", term943);
        setIntField(term920, term920.getClass(), "sourcePosition", 1328271830);
        setField(term920, term920.getClass(), "jsType", null);
        setField(term920, term920.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term920;
        callMethod(klass, "isOneExactlyFunctionOrDo", argTypes, term919, args);
    }

};


