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
import java.lang.Object;

public class NodeUtil_maybeAddFinally_1429693753230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1977;

    public NodeUtil_maybeAddFinally_1429693753230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1977 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1979 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1981 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1983 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1985 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1988 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1992 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1994 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1999 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1977, term1977.getClass(), "type", -1511130237);
        setIntField(term1979, term1979.getClass(), "type", 452088587);
        setIntField(term1981, term1981.getClass(), "type", -1630069454);
        setIntField(term1983, term1983.getClass(), "type", 1499735894);
        setIntField(term1985, term1985.getClass(), "type", 716486048);
        setField(term1985, term1985.getClass(), "next", null);
        setField(term1985, term1985.getClass(), "first", null);
        setField(term1985, term1985.getClass(), "last", null);
        setField(term1985, term1985.getClass(), "propListHead", null);
        setIntField(term1985, term1985.getClass(), "sourcePosition", 0);
        setField(term1985, term1985.getClass(), "jsType", null);
        setField(term1985, term1985.getClass(), "parent", null);
        setField(term1983, term1983.getClass(), "next", term1985);
        setIntField(term1988, term1988.getClass(), "type", -466708718);
        setField(term1988, term1988.getClass(), "next", null);
        setField(term1988, term1988.getClass(), "first", null);
        setField(term1988, term1988.getClass(), "last", term1985);
        setField(term1988, term1988.getClass(), "propListHead", null);
        setIntField(term1988, term1988.getClass(), "sourcePosition", 0);
        setField(term1988, term1988.getClass(), "jsType", null);
        setField(term1988, term1988.getClass(), "parent", null);
        setField(term1983, term1983.getClass(), "first", term1988);
        setField(term1983, term1983.getClass(), "last", term1981);
        setField(term1983, term1983.getClass(), "propListHead", null);
        setIntField(term1983, term1983.getClass(), "sourcePosition", 0);
        setField(term1983, term1983.getClass(), "jsType", null);
        setField(term1983, term1983.getClass(), "parent", null);
        setField(term1981, term1981.getClass(), "next", term1983);
        setField(term1981, term1981.getClass(), "first", term1985);
        setIntField(term1992, term1992.getClass(), "type", 1137154606);
        setIntField(term1994, term1994.getClass(), "type", -100681578);
        setField(term1994, term1994.getClass(), "next", null);
        setField(term1994, term1994.getClass(), "first", term1988);
        setField(term1994, term1994.getClass(), "last", term1983);
        setField(term1994, term1994.getClass(), "propListHead", null);
        setIntField(term1994, term1994.getClass(), "sourcePosition", 0);
        setField(term1994, term1994.getClass(), "jsType", null);
        setField(term1994, term1994.getClass(), "parent", null);
        setField(term1992, term1992.getClass(), "next", term1994);
        setField(term1992, term1992.getClass(), "first", term1979);
        setField(term1992, term1992.getClass(), "last", term1979);
        setField(term1992, term1992.getClass(), "propListHead", null);
        setIntField(term1992, term1992.getClass(), "sourcePosition", 0);
        setField(term1992, term1992.getClass(), "jsType", null);
        setField(term1992, term1992.getClass(), "parent", null);
        setField(term1981, term1981.getClass(), "last", term1992);
        setField(term1981, term1981.getClass(), "propListHead", null);
        setIntField(term1981, term1981.getClass(), "sourcePosition", 0);
        setField(term1981, term1981.getClass(), "jsType", null);
        setField(term1981, term1981.getClass(), "parent", null);
        setField(term1979, term1979.getClass(), "next", term1981);
        setIntField(term1999, term1999.getClass(), "type", 296568835);
        setField(term1999, term1999.getClass(), "next", term1992);
        setField(term1999, term1999.getClass(), "first", term1994);
        setField(term1999, term1999.getClass(), "last", term1977);
        setField(term1999, term1999.getClass(), "propListHead", null);
        setIntField(term1999, term1999.getClass(), "sourcePosition", 0);
        setField(term1999, term1999.getClass(), "jsType", null);
        setField(term1999, term1999.getClass(), "parent", null);
        setField(term1979, term1979.getClass(), "first", term1999);
        setField(term1979, term1979.getClass(), "last", term1999);
        setField(term1979, term1979.getClass(), "propListHead", null);
        setIntField(term1979, term1979.getClass(), "sourcePosition", 0);
        setField(term1979, term1979.getClass(), "jsType", null);
        setField(term1979, term1979.getClass(), "parent", null);
        setField(term1977, term1977.getClass(), "next", term1979);
        setField(term1977, term1977.getClass(), "first", term1983);
        setField(term1977, term1977.getClass(), "last", term1985);
        setField(term1977, term1977.getClass(), "propListHead", null);
        setIntField(term1977, term1977.getClass(), "sourcePosition", 0);
        setField(term1977, term1977.getClass(), "jsType", null);
        setField(term1977, term1977.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1977;
        try {
            callMethod(klass, "maybeAddFinally", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


