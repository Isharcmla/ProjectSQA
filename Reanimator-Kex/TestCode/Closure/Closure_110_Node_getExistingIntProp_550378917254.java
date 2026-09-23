package com.google.javascript.rhino;

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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class Node_getExistingIntProp_550378917254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1986;
     Object term2013;

    public Node_getExistingIntProp_550378917254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1986 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1988 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1990 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1992 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1994 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1997 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2001 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2003 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2008 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1986, term1986.getClass(), "type", 2107679041);
        setIntField(term1988, term1988.getClass(), "type", 2040965507);
        setIntField(term1990, term1990.getClass(), "type", -1281083262);
        setIntField(term1992, term1992.getClass(), "type", 1059930704);
        setIntField(term1994, term1994.getClass(), "type", -1967153290);
        setField(term1994, term1994.getClass(), "next", null);
        setField(term1994, term1994.getClass(), "first", null);
        setField(term1994, term1994.getClass(), "last", null);
        setField(term1994, term1994.getClass(), "propListHead", null);
        setIntField(term1994, term1994.getClass(), "sourcePosition", 0);
        setField(term1994, term1994.getClass(), "jsType", null);
        setField(term1994, term1994.getClass(), "parent", null);
        setField(term1992, term1992.getClass(), "next", term1994);
        setIntField(term1997, term1997.getClass(), "type", -1397251956);
        setField(term1997, term1997.getClass(), "next", null);
        setField(term1997, term1997.getClass(), "first", null);
        setField(term1997, term1997.getClass(), "last", term1994);
        setField(term1997, term1997.getClass(), "propListHead", null);
        setIntField(term1997, term1997.getClass(), "sourcePosition", 0);
        setField(term1997, term1997.getClass(), "jsType", null);
        setField(term1997, term1997.getClass(), "parent", null);
        setField(term1992, term1992.getClass(), "first", term1997);
        setField(term1992, term1992.getClass(), "last", term1990);
        setField(term1992, term1992.getClass(), "propListHead", null);
        setIntField(term1992, term1992.getClass(), "sourcePosition", 0);
        setField(term1992, term1992.getClass(), "jsType", null);
        setField(term1992, term1992.getClass(), "parent", null);
        setField(term1990, term1990.getClass(), "next", term1992);
        setField(term1990, term1990.getClass(), "first", term1994);
        setIntField(term2001, term2001.getClass(), "type", 405295896);
        setIntField(term2003, term2003.getClass(), "type", -814977075);
        setField(term2003, term2003.getClass(), "next", null);
        setField(term2003, term2003.getClass(), "first", term1997);
        setField(term2003, term2003.getClass(), "last", term1992);
        setField(term2003, term2003.getClass(), "propListHead", null);
        setIntField(term2003, term2003.getClass(), "sourcePosition", 0);
        setField(term2003, term2003.getClass(), "jsType", null);
        setField(term2003, term2003.getClass(), "parent", null);
        setField(term2001, term2001.getClass(), "next", term2003);
        setField(term2001, term2001.getClass(), "first", term1988);
        setField(term2001, term2001.getClass(), "last", term1988);
        setField(term2001, term2001.getClass(), "propListHead", null);
        setIntField(term2001, term2001.getClass(), "sourcePosition", 0);
        setField(term2001, term2001.getClass(), "jsType", null);
        setField(term2001, term2001.getClass(), "parent", null);
        setField(term1990, term1990.getClass(), "last", term2001);
        setField(term1990, term1990.getClass(), "propListHead", null);
        setIntField(term1990, term1990.getClass(), "sourcePosition", 0);
        setField(term1990, term1990.getClass(), "jsType", null);
        setField(term1990, term1990.getClass(), "parent", null);
        setField(term1988, term1988.getClass(), "next", term1990);
        setIntField(term2008, term2008.getClass(), "type", 808614267);
        setField(term2008, term2008.getClass(), "next", term2001);
        setField(term2008, term2008.getClass(), "first", term2003);
        setField(term2008, term2008.getClass(), "last", term1986);
        setField(term2008, term2008.getClass(), "propListHead", null);
        setIntField(term2008, term2008.getClass(), "sourcePosition", 0);
        setField(term2008, term2008.getClass(), "jsType", null);
        setField(term2008, term2008.getClass(), "parent", null);
        setField(term1988, term1988.getClass(), "first", term2008);
        setField(term1988, term1988.getClass(), "last", term2008);
        setField(term1988, term1988.getClass(), "propListHead", null);
        setIntField(term1988, term1988.getClass(), "sourcePosition", 0);
        setField(term1988, term1988.getClass(), "jsType", null);
        setField(term1988, term1988.getClass(), "parent", null);
        setField(term1986, term1986.getClass(), "next", term1988);
        setField(term1986, term1986.getClass(), "first", term1992);
        setField(term1986, term1986.getClass(), "last", term1994);
        setField(term1986, term1986.getClass(), "propListHead", null);
        setIntField(term1986, term1986.getClass(), "sourcePosition", 0);
        setField(term1986, term1986.getClass(), "jsType", null);
        setField(term1986, term1986.getClass(), "parent", null);
        term2013 = new Integer(1611734632);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2013;
        try {
            callMethod(klass, "getExistingIntProp", argTypes, term1986, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


