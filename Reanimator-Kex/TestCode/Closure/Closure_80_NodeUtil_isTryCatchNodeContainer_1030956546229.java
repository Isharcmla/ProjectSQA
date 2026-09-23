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

public class NodeUtil_isTryCatchNodeContainer_1030956546229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2027;

    public NodeUtil_isTryCatchNodeContainer_1030956546229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2027 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2029 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2031 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2034 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2037 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2040 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2044 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2047 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2050 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2027, term2027.getClass(), "type", 804070622);
        setIntField(term2029, term2029.getClass(), "type", 154111854);
        setIntField(term2031, term2031.getClass(), "type", 0);
        setField(term2031, term2031.getClass(), "next", null);
        setField(term2031, term2031.getClass(), "first", null);
        setField(term2031, term2031.getClass(), "last", null);
        setField(term2031, term2031.getClass(), "propListHead", null);
        setIntField(term2031, term2031.getClass(), "sourcePosition", 0);
        setField(term2031, term2031.getClass(), "jsType", null);
        setField(term2031, term2031.getClass(), "parent", null);
        setField(term2029, term2029.getClass(), "next", term2031);
        setIntField(term2034, term2034.getClass(), "type", 0);
        setField(term2034, term2034.getClass(), "next", null);
        setField(term2034, term2034.getClass(), "first", null);
        setField(term2034, term2034.getClass(), "last", null);
        setField(term2034, term2034.getClass(), "propListHead", null);
        setIntField(term2034, term2034.getClass(), "sourcePosition", 0);
        setField(term2034, term2034.getClass(), "jsType", null);
        setField(term2034, term2034.getClass(), "parent", null);
        setField(term2029, term2029.getClass(), "first", term2034);
        setIntField(term2037, term2037.getClass(), "type", 0);
        setField(term2037, term2037.getClass(), "next", null);
        setField(term2037, term2037.getClass(), "first", null);
        setField(term2037, term2037.getClass(), "last", null);
        setField(term2037, term2037.getClass(), "propListHead", null);
        setIntField(term2037, term2037.getClass(), "sourcePosition", 0);
        setField(term2037, term2037.getClass(), "jsType", null);
        setField(term2037, term2037.getClass(), "parent", null);
        setField(term2029, term2029.getClass(), "last", term2037);
        setField(term2040, term2040.getClass(), "next", null);
        setIntField(term2040, term2040.getClass(), "type", 0);
        setIntField(term2040, term2040.getClass(), "intValue", 0);
        setField(term2040, term2040.getClass(), "objectValue", null);
        setField(term2029, term2029.getClass(), "propListHead", term2040);
        setIntField(term2029, term2029.getClass(), "sourcePosition", -1780848958);
        setField(term2029, term2029.getClass(), "jsType", null);
        setField(term2029, term2029.getClass(), "parent", null);
        setField(term2027, term2027.getClass(), "next", term2029);
        setIntField(term2044, term2044.getClass(), "type", 0);
        setField(term2044, term2044.getClass(), "next", null);
        setField(term2044, term2044.getClass(), "first", null);
        setField(term2044, term2044.getClass(), "last", null);
        setField(term2044, term2044.getClass(), "propListHead", null);
        setIntField(term2044, term2044.getClass(), "sourcePosition", 0);
        setField(term2044, term2044.getClass(), "jsType", null);
        setField(term2044, term2044.getClass(), "parent", null);
        setField(term2027, term2027.getClass(), "first", term2044);
        setIntField(term2047, term2047.getClass(), "type", 0);
        setField(term2047, term2047.getClass(), "next", null);
        setField(term2047, term2047.getClass(), "first", null);
        setField(term2047, term2047.getClass(), "last", null);
        setField(term2047, term2047.getClass(), "propListHead", null);
        setIntField(term2047, term2047.getClass(), "sourcePosition", 0);
        setField(term2047, term2047.getClass(), "jsType", null);
        setField(term2047, term2047.getClass(), "parent", null);
        setField(term2027, term2027.getClass(), "last", term2047);
        setField(term2050, term2050.getClass(), "next", null);
        setIntField(term2050, term2050.getClass(), "type", 0);
        setIntField(term2050, term2050.getClass(), "intValue", 0);
        setField(term2050, term2050.getClass(), "objectValue", null);
        setField(term2027, term2027.getClass(), "propListHead", term2050);
        setIntField(term2027, term2027.getClass(), "sourcePosition", 1235045850);
        setField(term2027, term2027.getClass(), "jsType", null);
        setField(term2027, term2027.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2027;
        try {
            callMethod(klass, "isTryCatchNodeContainer", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


