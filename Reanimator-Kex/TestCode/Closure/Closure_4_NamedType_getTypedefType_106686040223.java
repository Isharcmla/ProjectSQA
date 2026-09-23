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

public class NamedType_getTypedefType_106686040223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65368;
     Object term65816;
     Object term65940;

    public NamedType_getTypedefType_106686040223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term65520 = new HashSet();
        term65368 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term65472 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setBooleanField(term65472, term65472.getClass(), "lastGeneration", true);
        setField(term65472, term65472.getClass(), "forwardDeclaredTypes", term65520);
        setField(term65368, term65368.getClass(), "registry", term65472);
        setField(term65368, term65368.getClass(), "reference", null);
        setField(term65368, term65368.getClass(), "sourceName", null);
        setIntField(term65368, term65368.getClass(), "lineno", 0);
        setIntField(term65368, term65368.getClass(), "charno", 0);
        term65816 = newInstance(Class.forName("com.google.javascript.jscomp.RhinoErrorReporter$OldRhinoErrorReporter"));
        term65940 = newInstance(Class.forName("com.google.javascript.jscomp.LinkedFlowScope$LinkedFlowSlot"));
        setField(term65940, term65940.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.StaticSlot");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term65816;
        args[1] = term65940;
        args[2] = null;
        try {
            callMethod(klass, "getTypedefType", argTypes, term65368, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


