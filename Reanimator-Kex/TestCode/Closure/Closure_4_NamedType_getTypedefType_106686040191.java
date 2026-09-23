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

public class NamedType_getTypedefType_106686040191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47129;
     Object term47373;

    public NamedType_getTypedefType_106686040191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term47281 = new HashSet();
        term47129 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term47233 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setBooleanField(term47233, term47233.getClass(), "lastGeneration", true);
        setField(term47233, term47233.getClass(), "forwardDeclaredTypes", term47281);
        setField(term47129, term47129.getClass(), "registry", term47233);
        setField(term47129, term47129.getClass(), "reference", null);
        term47373 = newInstance(Class.forName("com.google.javascript.rhino.jstype.Property"));
        setField(term47373, term47373.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.StaticSlot");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term47373;
        args[2] = null;
        try {
            callMethod(klass, "getTypedefType", argTypes, term47129, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


