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

public class ScopedAliases_process_840655313108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56492;
     Object term56562;
     Object term57102;
     Object term57103;

    public ScopedAliases_process_840655313108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56492 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term56492, term56492.getClass(), "compiler", null);
        term56562 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term56632 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term56702 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term56562, term56562.getClass(), "type", 0);
        setField(term56562, term56562.getClass(), "parent", null);
        setField(term56702, term56702.getClass(), "next", null);
        setIntField(term56702, term56702.getClass(), "type", 0);
        setField(term56702, term56702.getClass(), "first", null);
        setField(term56632, term56632.getClass(), "next", term56702);
        setIntField(term56632, term56632.getClass(), "type", 0);
        setField(term56632, term56632.getClass(), "first", null);
        setField(term56562, term56562.getClass(), "first", term56632);
        term57102 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term57102, term57102.getClass(), "compiler", null);
        setField(term57102, term57102.getClass(), "preprocessorSymbolTable", null);
        setField(term57102, term57102.getClass(), "transformationHandler", null);
        term57103 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57104 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57105 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term57103, term57103.getClass(), "type", 0);
        setField(term57103, term57103.getClass(), "next", null);
        setIntField(term57104, term57104.getClass(), "type", 0);
        setIntField(term57105, term57105.getClass(), "type", 0);
        setField(term57105, term57105.getClass(), "next", null);
        setField(term57105, term57105.getClass(), "first", null);
        setField(term57105, term57105.getClass(), "last", null);
        setField(term57105, term57105.getClass(), "propListHead", null);
        setIntField(term57105, term57105.getClass(), "sourcePosition", 0);
        setField(term57105, term57105.getClass(), "jsType", null);
        setField(term57105, term57105.getClass(), "parent", null);
        setField(term57104, term57104.getClass(), "next", term57105);
        setField(term57104, term57104.getClass(), "first", null);
        setField(term57104, term57104.getClass(), "last", null);
        setField(term57104, term57104.getClass(), "propListHead", null);
        setIntField(term57104, term57104.getClass(), "sourcePosition", 0);
        setField(term57104, term57104.getClass(), "jsType", null);
        setField(term57104, term57104.getClass(), "parent", null);
        setField(term57103, term57103.getClass(), "first", term57104);
        setField(term57103, term57103.getClass(), "last", null);
        setField(term57103, term57103.getClass(), "propListHead", null);
        setIntField(term57103, term57103.getClass(), "sourcePosition", 0);
        setField(term57103, term57103.getClass(), "jsType", null);
        setField(term57103, term57103.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term56562;
        callMethod(klass, "process", argTypes, term56492, args);
        assertTrue(recursiveEquals(term56492, term57102));
        assertTrue(recursiveEquals(term56562, null));
    }

};


