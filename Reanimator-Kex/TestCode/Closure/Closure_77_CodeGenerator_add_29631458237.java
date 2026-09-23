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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CodeGenerator_add_29631458237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48;
     Object term49;

    public CodeGenerator_add_29631458237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term48, term48.getClass(), "cc", null);
        setField(term48, term48.getClass(), "outputCharsetEncoder", null);
        term49 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term51 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term53 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term56 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term59 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term62 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term66 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term69 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term72 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term49, term49.getClass(), "type", 391863371);
        setIntField(term51, term51.getClass(), "type", -2038273078);
        setIntField(term53, term53.getClass(), "type", 0);
        setField(term53, term53.getClass(), "next", null);
        setField(term53, term53.getClass(), "first", null);
        setField(term53, term53.getClass(), "last", null);
        setField(term53, term53.getClass(), "propListHead", null);
        setIntField(term53, term53.getClass(), "sourcePosition", 0);
        setField(term53, term53.getClass(), "jsType", null);
        setField(term53, term53.getClass(), "parent", null);
        setField(term51, term51.getClass(), "next", term53);
        setIntField(term56, term56.getClass(), "type", 0);
        setField(term56, term56.getClass(), "next", null);
        setField(term56, term56.getClass(), "first", null);
        setField(term56, term56.getClass(), "last", null);
        setField(term56, term56.getClass(), "propListHead", null);
        setIntField(term56, term56.getClass(), "sourcePosition", 0);
        setField(term56, term56.getClass(), "jsType", null);
        setField(term56, term56.getClass(), "parent", null);
        setField(term51, term51.getClass(), "first", term56);
        setIntField(term59, term59.getClass(), "type", 0);
        setField(term59, term59.getClass(), "next", null);
        setField(term59, term59.getClass(), "first", null);
        setField(term59, term59.getClass(), "last", null);
        setField(term59, term59.getClass(), "propListHead", null);
        setIntField(term59, term59.getClass(), "sourcePosition", 0);
        setField(term59, term59.getClass(), "jsType", null);
        setField(term59, term59.getClass(), "parent", null);
        setField(term51, term51.getClass(), "last", term59);
        setField(term62, term62.getClass(), "next", null);
        setIntField(term62, term62.getClass(), "type", 0);
        setIntField(term62, term62.getClass(), "intValue", 0);
        setField(term62, term62.getClass(), "objectValue", null);
        setField(term51, term51.getClass(), "propListHead", term62);
        setIntField(term51, term51.getClass(), "sourcePosition", 1725571209);
        setField(term51, term51.getClass(), "jsType", null);
        setField(term51, term51.getClass(), "parent", null);
        setField(term49, term49.getClass(), "next", term51);
        setIntField(term66, term66.getClass(), "type", 0);
        setField(term66, term66.getClass(), "next", null);
        setField(term66, term66.getClass(), "first", null);
        setField(term66, term66.getClass(), "last", null);
        setField(term66, term66.getClass(), "propListHead", null);
        setIntField(term66, term66.getClass(), "sourcePosition", 0);
        setField(term66, term66.getClass(), "jsType", null);
        setField(term66, term66.getClass(), "parent", null);
        setField(term49, term49.getClass(), "first", term66);
        setIntField(term69, term69.getClass(), "type", 0);
        setField(term69, term69.getClass(), "next", null);
        setField(term69, term69.getClass(), "first", null);
        setField(term69, term69.getClass(), "last", null);
        setField(term69, term69.getClass(), "propListHead", null);
        setIntField(term69, term69.getClass(), "sourcePosition", 0);
        setField(term69, term69.getClass(), "jsType", null);
        setField(term69, term69.getClass(), "parent", null);
        setField(term49, term49.getClass(), "last", term69);
        setField(term72, term72.getClass(), "next", null);
        setIntField(term72, term72.getClass(), "type", 0);
        setIntField(term72, term72.getClass(), "intValue", 0);
        setField(term72, term72.getClass(), "objectValue", null);
        setField(term49, term49.getClass(), "propListHead", term72);
        setIntField(term49, term49.getClass(), "sourcePosition", -522618178);
        setField(term49, term49.getClass(), "jsType", null);
        setField(term49, term49.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term49;
        try {
            callMethod(klass, "add", argTypes, term48, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


