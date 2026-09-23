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

public class Scope_isLocal_167383655350 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1066;
     Object term3917;

    public Scope_isLocal_167383655350() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1067 = new HashMap();
        term1066 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term1080 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term1084 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1066, term1066.getClass(), "vars", term1067);
        setField(term1080, term1080.getClass(), "vars", null);
        setField(term1080, term1080.getClass(), "parent", null);
        setIntField(term1080, term1080.getClass(), "depth", 0);
        setField(term1080, term1080.getClass(), "rootNode", null);
        setField(term1080, term1080.getClass(), "thisType", null);
        setBooleanField(term1080, term1080.getClass(), "isBottom", false);
        setField(term1080, term1080.getClass(), "arguments", null);
        setField(term1066, term1066.getClass(), "parent", term1080);
        setIntField(term1066, term1066.getClass(), "depth", 1166710220);
        setIntField(term1084, term1084.getClass(), "type", 0);
        setField(term1084, term1084.getClass(), "next", null);
        setField(term1084, term1084.getClass(), "first", null);
        setField(term1084, term1084.getClass(), "last", null);
        setField(term1084, term1084.getClass(), "propListHead", null);
        setIntField(term1084, term1084.getClass(), "sourcePosition", 0);
        setField(term1084, term1084.getClass(), "jsType", null);
        setField(term1084, term1084.getClass(), "parent", null);
        setField(term1066, term1066.getClass(), "rootNode", term1084);
        setField(term1066, term1066.getClass(), "thisType", null);
        setBooleanField(term1066, term1066.getClass(), "isBottom", false);
        setField(term1066, term1066.getClass(), "arguments", null);
        HashMap term3918 = new HashMap();
        term3917 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term3919 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term3920 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term3917, term3917.getClass(), "vars", term3918);
        setField(term3919, term3919.getClass(), "vars", null);
        setField(term3919, term3919.getClass(), "parent", null);
        setIntField(term3919, term3919.getClass(), "depth", 0);
        setField(term3919, term3919.getClass(), "rootNode", null);
        setField(term3919, term3919.getClass(), "thisType", null);
        setBooleanField(term3919, term3919.getClass(), "isBottom", false);
        setField(term3919, term3919.getClass(), "arguments", null);
        setField(term3917, term3917.getClass(), "parent", term3919);
        setIntField(term3917, term3917.getClass(), "depth", 1166710220);
        setIntField(term3920, term3920.getClass(), "type", 0);
        setField(term3920, term3920.getClass(), "next", null);
        setField(term3920, term3920.getClass(), "first", null);
        setField(term3920, term3920.getClass(), "last", null);
        setField(term3920, term3920.getClass(), "propListHead", null);
        setIntField(term3920, term3920.getClass(), "sourcePosition", 0);
        setField(term3920, term3920.getClass(), "jsType", null);
        setField(term3920, term3920.getClass(), "parent", null);
        setField(term3917, term3917.getClass(), "rootNode", term3920);
        setField(term3917, term3917.getClass(), "thisType", null);
        setBooleanField(term3917, term3917.getClass(), "isBottom", false);
        setField(term3917, term3917.getClass(), "arguments", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Scope");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isLocal", argTypes, term1066, args);
        assertTrue(recursiveEquals(term1066, term3917));
        assertTrue(recursiveEquals(retValue, true));
    }

};


