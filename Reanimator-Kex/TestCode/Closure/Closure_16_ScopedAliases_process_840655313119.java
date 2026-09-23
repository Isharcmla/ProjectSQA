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

public class ScopedAliases_process_840655313119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71748;
     Object term71818;
     Object term72788;
     Object term72789;

    public ScopedAliases_process_840655313119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71748 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term71748, term71748.getClass(), "compiler", null);
        term71818 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term71888 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term71958 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term72028 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term72098 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term71818, term71818.getClass(), "type", 0);
        setField(term71818, term71818.getClass(), "parent", null);
        setField(term72028, term72028.getClass(), "next", null);
        setIntField(term72028, term72028.getClass(), "type", 0);
        setField(term72028, term72028.getClass(), "first", null);
        setField(term71958, term71958.getClass(), "next", term72028);
        setIntField(term71958, term71958.getClass(), "type", 0);
        setField(term71958, term71958.getClass(), "first", null);
        setField(term71888, term71888.getClass(), "next", term71958);
        setIntField(term71888, term71888.getClass(), "type", 0);
        setField(term72098, term72098.getClass(), "next", null);
        setIntField(term72098, term72098.getClass(), "type", 0);
        setField(term72098, term72098.getClass(), "first", null);
        setField(term71888, term71888.getClass(), "first", term72098);
        setField(term71818, term71818.getClass(), "first", term71888);
        term72788 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term72788, term72788.getClass(), "compiler", null);
        setField(term72788, term72788.getClass(), "preprocessorSymbolTable", null);
        setField(term72788, term72788.getClass(), "transformationHandler", null);
        term72789 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term72790 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term72791 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term72792 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term72793 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term72789, term72789.getClass(), "type", 0);
        setField(term72789, term72789.getClass(), "next", null);
        setIntField(term72790, term72790.getClass(), "type", 0);
        setIntField(term72791, term72791.getClass(), "type", 0);
        setIntField(term72792, term72792.getClass(), "type", 0);
        setField(term72792, term72792.getClass(), "next", null);
        setField(term72792, term72792.getClass(), "first", null);
        setField(term72792, term72792.getClass(), "last", null);
        setField(term72792, term72792.getClass(), "propListHead", null);
        setIntField(term72792, term72792.getClass(), "sourcePosition", 0);
        setField(term72792, term72792.getClass(), "jsType", null);
        setField(term72792, term72792.getClass(), "parent", null);
        setField(term72791, term72791.getClass(), "next", term72792);
        setField(term72791, term72791.getClass(), "first", null);
        setField(term72791, term72791.getClass(), "last", null);
        setField(term72791, term72791.getClass(), "propListHead", null);
        setIntField(term72791, term72791.getClass(), "sourcePosition", 0);
        setField(term72791, term72791.getClass(), "jsType", null);
        setField(term72791, term72791.getClass(), "parent", null);
        setField(term72790, term72790.getClass(), "next", term72791);
        setIntField(term72793, term72793.getClass(), "type", 0);
        setField(term72793, term72793.getClass(), "next", null);
        setField(term72793, term72793.getClass(), "first", null);
        setField(term72793, term72793.getClass(), "last", null);
        setField(term72793, term72793.getClass(), "propListHead", null);
        setIntField(term72793, term72793.getClass(), "sourcePosition", 0);
        setField(term72793, term72793.getClass(), "jsType", null);
        setField(term72793, term72793.getClass(), "parent", null);
        setField(term72790, term72790.getClass(), "first", term72793);
        setField(term72790, term72790.getClass(), "last", null);
        setField(term72790, term72790.getClass(), "propListHead", null);
        setIntField(term72790, term72790.getClass(), "sourcePosition", 0);
        setField(term72790, term72790.getClass(), "jsType", null);
        setField(term72790, term72790.getClass(), "parent", null);
        setField(term72789, term72789.getClass(), "first", term72790);
        setField(term72789, term72789.getClass(), "last", null);
        setField(term72789, term72789.getClass(), "propListHead", null);
        setIntField(term72789, term72789.getClass(), "sourcePosition", 0);
        setField(term72789, term72789.getClass(), "jsType", null);
        setField(term72789, term72789.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term71818;
        callMethod(klass, "process", argTypes, term71748, args);
        assertTrue(recursiveEquals(term71748, term72788));
        assertTrue(recursiveEquals(term71818, null));
    }

};


