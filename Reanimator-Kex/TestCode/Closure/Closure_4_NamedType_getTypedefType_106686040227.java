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

public class NamedType_getTypedefType_106686040227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67831;
     Object term68279;
     Object term68393;

    public NamedType_getTypedefType_106686040227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term67983 = new HashSet();
        term67831 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term67935 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setBooleanField(term67935, term67935.getClass(), "lastGeneration", true);
        setField(term67935, term67935.getClass(), "forwardDeclaredTypes", term67983);
        setField(term67831, term67831.getClass(), "registry", term67935);
        setField(term67831, term67831.getClass(), "reference", null);
        setField(term67831, term67831.getClass(), "sourceName", null);
        setIntField(term67831, term67831.getClass(), "lineno", 0);
        setIntField(term67831, term67831.getClass(), "charno", 0);
        term68279 = newInstance(Class.forName("com.google.javascript.jscomp.RhinoErrorReporter$OldRhinoErrorReporter"));
        term68393 = newInstance(Class.forName("com.google.javascript.jscomp.TightenTypes$ConcreteSlot"));
        setField(term68393, term68393.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.StaticSlot");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term68279;
        args[1] = term68393;
        args[2] = null;
        try {
            callMethod(klass, "getTypedefType", argTypes, term67831, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


