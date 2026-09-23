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
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.util.HashMap;
import java.lang.Object;

public class Scope_getArgumentsVar_175570571942 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term772;
     Object term3309;
     Object term3293;

    public Scope_getArgumentsVar_175570571942() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term773 = new HashMap();
        term772 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term786 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term790 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term772, term772.getClass(), "vars", term773);
        setField(term786, term786.getClass(), "vars", null);
        setField(term786, term786.getClass(), "parent", null);
        setIntField(term786, term786.getClass(), "depth", 0);
        setField(term786, term786.getClass(), "rootNode", null);
        setField(term786, term786.getClass(), "thisType", null);
        setBooleanField(term786, term786.getClass(), "isBottom", false);
        setField(term786, term786.getClass(), "arguments", null);
        setField(term772, term772.getClass(), "parent", term786);
        setIntField(term772, term772.getClass(), "depth", -1222614956);
        setIntField(term790, term790.getClass(), "type", 0);
        setField(term790, term790.getClass(), "next", null);
        setField(term790, term790.getClass(), "first", null);
        setField(term790, term790.getClass(), "last", null);
        setField(term790, term790.getClass(), "propListHead", null);
        setIntField(term790, term790.getClass(), "sourcePosition", 0);
        setField(term790, term790.getClass(), "jsType", null);
        setField(term790, term790.getClass(), "parent", null);
        setField(term772, term772.getClass(), "rootNode", term790);
        setField(term772, term772.getClass(), "thisType", null);
        setBooleanField(term772, term772.getClass(), "isBottom", false);
        setField(term772, term772.getClass(), "arguments", null);
        HashMap term3310 = new HashMap();
        term3309 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term3311 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term3312 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3313 = newInstance(Class.forName("com.google.javascript.jscomp.Scope$Arguments"));
        setField(term3309, term3309.getClass(), "vars", term3310);
        setField(term3311, term3311.getClass(), "vars", null);
        setField(term3311, term3311.getClass(), "parent", null);
        setIntField(term3311, term3311.getClass(), "depth", 0);
        setField(term3311, term3311.getClass(), "rootNode", null);
        setField(term3311, term3311.getClass(), "thisType", null);
        setBooleanField(term3311, term3311.getClass(), "isBottom", false);
        setField(term3311, term3311.getClass(), "arguments", null);
        setField(term3309, term3309.getClass(), "parent", term3311);
        setIntField(term3309, term3309.getClass(), "depth", -1222614956);
        setIntField(term3312, term3312.getClass(), "type", 0);
        setField(term3312, term3312.getClass(), "next", null);
        setField(term3312, term3312.getClass(), "first", null);
        setField(term3312, term3312.getClass(), "last", null);
        setField(term3312, term3312.getClass(), "propListHead", null);
        setIntField(term3312, term3312.getClass(), "sourcePosition", 0);
        setField(term3312, term3312.getClass(), "jsType", null);
        setField(term3312, term3312.getClass(), "parent", null);
        setField(term3309, term3309.getClass(), "rootNode", term3312);
        setField(term3309, term3309.getClass(), "thisType", null);
        setBooleanField(term3309, term3309.getClass(), "isBottom", false);
        setField(term3313, term3313.getClass(), "name", "arguments");
        setField(term3313, term3313.getClass(), "nameNode", null);
        setField(term3313, term3313.getClass(), "type", null);
        setField(term3313, term3313.getClass(), "info", null);
        setBooleanField(term3313, term3313.getClass(), "typeInferred", false);
        setField(term3313, term3313.getClass(), "input", null);
        setBooleanField(term3313, term3313.getClass(), "isDefine", false);
        setIntField(term3313, term3313.getClass(), "index", -1);
        setField(term3313, term3313.getClass(), "scope", term3309);
        setField(term3309, term3309.getClass(), "arguments", term3313);
        HashMap term3280 = new HashMap();
        term3293 = newInstance(Class.forName("com.google.javascript.jscomp.Scope$Arguments"));
        Object term3279 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term3285 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term3289 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term3293, term3293.getClass(), "name", "arguments");
        setField(term3293, term3293.getClass(), "nameNode", null);
        setField(term3293, term3293.getClass(), "type", null);
        setField(term3293, term3293.getClass(), "info", null);
        setBooleanField(term3293, term3293.getClass(), "typeInferred", false);
        setField(term3293, term3293.getClass(), "input", null);
        setBooleanField(term3293, term3293.getClass(), "isDefine", false);
        setIntField(term3293, term3293.getClass(), "index", -1);
        setField(term3279, term3279.getClass(), "vars", term3280);
        setField(term3285, term3285.getClass(), "vars", null);
        setField(term3285, term3285.getClass(), "parent", null);
        setIntField(term3285, term3285.getClass(), "depth", 0);
        setField(term3285, term3285.getClass(), "rootNode", null);
        setField(term3285, term3285.getClass(), "thisType", null);
        setBooleanField(term3285, term3285.getClass(), "isBottom", false);
        setField(term3285, term3285.getClass(), "arguments", null);
        setField(term3279, term3279.getClass(), "parent", term3285);
        setIntField(term3279, term3279.getClass(), "depth", -1222614956);
        setIntField(term3289, term3289.getClass(), "type", 0);
        setField(term3289, term3289.getClass(), "next", null);
        setField(term3289, term3289.getClass(), "first", null);
        setField(term3289, term3289.getClass(), "last", null);
        setField(term3289, term3289.getClass(), "propListHead", null);
        setIntField(term3289, term3289.getClass(), "sourcePosition", 0);
        setField(term3289, term3289.getClass(), "jsType", null);
        setField(term3289, term3289.getClass(), "parent", null);
        setField(term3279, term3279.getClass(), "rootNode", term3289);
        setField(term3279, term3279.getClass(), "thisType", null);
        setBooleanField(term3279, term3279.getClass(), "isBottom", false);
        setField(term3279, term3279.getClass(), "arguments", term3293);
        setField(term3293, term3293.getClass(), "scope", term3279);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Scope");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getArgumentsVar", argTypes, term772, args);
        assertTrue(recursiveEquals(term772, term3309));
        assertTrue(recursiveEquals(retValue, term3293));
    }

};


