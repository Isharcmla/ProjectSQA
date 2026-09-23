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

public class CodeGenerator_getFirstNonEmptyChild_162111751024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2351;

    public CodeGenerator_getFirstNonEmptyChild_162111751024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2351 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2353 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2355 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2358 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2361 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2364 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2368 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2371 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2374 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2351, term2351.getClass(), "type", 1557431527);
        setIntField(term2353, term2353.getClass(), "type", -506958186);
        setIntField(term2355, term2355.getClass(), "type", 0);
        setField(term2355, term2355.getClass(), "next", null);
        setField(term2355, term2355.getClass(), "first", null);
        setField(term2355, term2355.getClass(), "last", null);
        setField(term2355, term2355.getClass(), "propListHead", null);
        setIntField(term2355, term2355.getClass(), "sourcePosition", 0);
        setField(term2355, term2355.getClass(), "jsType", null);
        setField(term2355, term2355.getClass(), "parent", null);
        setField(term2353, term2353.getClass(), "next", term2355);
        setIntField(term2358, term2358.getClass(), "type", 0);
        setField(term2358, term2358.getClass(), "next", null);
        setField(term2358, term2358.getClass(), "first", null);
        setField(term2358, term2358.getClass(), "last", null);
        setField(term2358, term2358.getClass(), "propListHead", null);
        setIntField(term2358, term2358.getClass(), "sourcePosition", 0);
        setField(term2358, term2358.getClass(), "jsType", null);
        setField(term2358, term2358.getClass(), "parent", null);
        setField(term2353, term2353.getClass(), "first", term2358);
        setIntField(term2361, term2361.getClass(), "type", 0);
        setField(term2361, term2361.getClass(), "next", null);
        setField(term2361, term2361.getClass(), "first", null);
        setField(term2361, term2361.getClass(), "last", null);
        setField(term2361, term2361.getClass(), "propListHead", null);
        setIntField(term2361, term2361.getClass(), "sourcePosition", 0);
        setField(term2361, term2361.getClass(), "jsType", null);
        setField(term2361, term2361.getClass(), "parent", null);
        setField(term2353, term2353.getClass(), "last", term2361);
        setField(term2364, term2364.getClass(), "next", null);
        setIntField(term2364, term2364.getClass(), "type", 0);
        setIntField(term2364, term2364.getClass(), "intValue", 0);
        setField(term2364, term2364.getClass(), "objectValue", null);
        setField(term2353, term2353.getClass(), "propListHead", term2364);
        setIntField(term2353, term2353.getClass(), "sourcePosition", -1896376975);
        setField(term2353, term2353.getClass(), "jsType", null);
        setField(term2353, term2353.getClass(), "parent", null);
        setField(term2351, term2351.getClass(), "next", term2353);
        setIntField(term2368, term2368.getClass(), "type", 0);
        setField(term2368, term2368.getClass(), "next", null);
        setField(term2368, term2368.getClass(), "first", null);
        setField(term2368, term2368.getClass(), "last", null);
        setField(term2368, term2368.getClass(), "propListHead", null);
        setIntField(term2368, term2368.getClass(), "sourcePosition", 0);
        setField(term2368, term2368.getClass(), "jsType", null);
        setField(term2368, term2368.getClass(), "parent", null);
        setField(term2351, term2351.getClass(), "first", term2368);
        setIntField(term2371, term2371.getClass(), "type", 0);
        setField(term2371, term2371.getClass(), "next", null);
        setField(term2371, term2371.getClass(), "first", null);
        setField(term2371, term2371.getClass(), "last", null);
        setField(term2371, term2371.getClass(), "propListHead", null);
        setIntField(term2371, term2371.getClass(), "sourcePosition", 0);
        setField(term2371, term2371.getClass(), "jsType", null);
        setField(term2371, term2371.getClass(), "parent", null);
        setField(term2351, term2351.getClass(), "last", term2371);
        setField(term2374, term2374.getClass(), "next", null);
        setIntField(term2374, term2374.getClass(), "type", 0);
        setIntField(term2374, term2374.getClass(), "intValue", 0);
        setField(term2374, term2374.getClass(), "objectValue", null);
        setField(term2351, term2351.getClass(), "propListHead", term2374);
        setIntField(term2351, term2351.getClass(), "sourcePosition", 729658803);
        setField(term2351, term2351.getClass(), "jsType", null);
        setField(term2351, term2351.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2351;
        callMethod(klass, "getFirstNonEmptyChild", argTypes, null, args);
    }

};


