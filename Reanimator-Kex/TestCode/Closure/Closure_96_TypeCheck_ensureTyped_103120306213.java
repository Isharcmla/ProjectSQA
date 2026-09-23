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
import java.lang.Object;

public class TypeCheck_ensureTyped_103120306213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97056;
     Object term97126;
     Object term97958;
     Object term97959;

    public TypeCheck_ensureTyped_103120306213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97056 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term97126 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term97222 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term97318 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term97126, term97126.getClass(), "type", -106);
        setIntField(term97222, term97222.getClass(), "type", -30);
        setField(term97222, term97222.getClass(), "next", term97318);
        setField(term97126, term97126.getClass(), "propListHead", term97222);
        term97958 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term97958, term97958.getClass(), "compiler", null);
        setField(term97958, term97958.getClass(), "validator", null);
        setField(term97958, term97958.getClass(), "reverseInterpreter", null);
        setField(term97958, term97958.getClass(), "typeRegistry", null);
        setField(term97958, term97958.getClass(), "topScope", null);
        setField(term97958, term97958.getClass(), "scopeCreator", null);
        setField(term97958, term97958.getClass(), "reportMissingOverride", null);
        setField(term97958, term97958.getClass(), "reportUnknownTypes", null);
        setBooleanField(term97958, term97958.getClass(), "reportMissingProperties", false);
        setField(term97958, term97958.getClass(), "inferJSDocInfo", null);
        setIntField(term97958, term97958.getClass(), "typedCount", 0);
        setIntField(term97958, term97958.getClass(), "nullCount", 0);
        setIntField(term97958, term97958.getClass(), "unknownCount", 0);
        setBooleanField(term97958, term97958.getClass(), "inExterns", false);
        setIntField(term97958, term97958.getClass(), "noTypeCheckSection", 0);
        term97959 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term97960 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term97961 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term97959, term97959.getClass(), "type", -106);
        setField(term97959, term97959.getClass(), "next", null);
        setField(term97959, term97959.getClass(), "first", null);
        setField(term97959, term97959.getClass(), "last", null);
        setField(term97961, term97961.getClass(), "next", null);
        setIntField(term97961, term97961.getClass(), "type", 0);
        setIntField(term97961, term97961.getClass(), "intValue", 0);
        setField(term97961, term97961.getClass(), "objectValue", null);
        setField(term97960, term97960.getClass(), "next", term97961);
        setIntField(term97960, term97960.getClass(), "type", -30);
        setIntField(term97960, term97960.getClass(), "intValue", 0);
        setField(term97960, term97960.getClass(), "objectValue", null);
        setField(term97959, term97959.getClass(), "propListHead", term97960);
        setIntField(term97959, term97959.getClass(), "sourcePosition", 0);
        setField(term97959, term97959.getClass(), "jsType", null);
        setField(term97959, term97959.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term97126;
        args[2] = null;
        callMethod(klass, "ensureTyped", argTypes, term97056, args);
        assertTrue(recursiveEquals(term97056, term97958));
        assertTrue(recursiveEquals(term97126, null));
    }

};


