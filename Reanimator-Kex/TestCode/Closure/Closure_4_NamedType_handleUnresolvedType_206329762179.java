package com.google.javascript.rhino.jstype;

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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashSet;

public class NamedType_handleUnresolvedType_206329762179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43771;

    public NamedType_handleUnresolvedType_206329762179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term43923 = new HashSet();
        term43771 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term43875 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setBooleanField(term43875, term43875.getClass(), "lastGeneration", true);
        setField(term43875, term43875.getClass(), "forwardDeclaredTypes", term43923);
        setField(term43771, term43771.getClass(), "registry", term43875);
        setField(term43771, term43771.getClass(), "reference", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = true;
        try {
            callMethod(klass, "handleUnresolvedType", argTypes, term43771, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


