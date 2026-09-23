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
import java.lang.Integer;

public class CodeGenerator_getNonEmptyChildCount_147325746223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2322;
     Object term2349;

    public CodeGenerator_getNonEmptyChildCount_147325746223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2322 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2324 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2326 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2329 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2332 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2335 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2339 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2342 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2345 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2322, term2322.getClass(), "type", -1002370457);
        setIntField(term2324, term2324.getClass(), "type", -1274456137);
        setIntField(term2326, term2326.getClass(), "type", 0);
        setField(term2326, term2326.getClass(), "next", null);
        setField(term2326, term2326.getClass(), "first", null);
        setField(term2326, term2326.getClass(), "last", null);
        setField(term2326, term2326.getClass(), "propListHead", null);
        setIntField(term2326, term2326.getClass(), "sourcePosition", 0);
        setField(term2326, term2326.getClass(), "jsType", null);
        setField(term2326, term2326.getClass(), "parent", null);
        setField(term2324, term2324.getClass(), "next", term2326);
        setIntField(term2329, term2329.getClass(), "type", 0);
        setField(term2329, term2329.getClass(), "next", null);
        setField(term2329, term2329.getClass(), "first", null);
        setField(term2329, term2329.getClass(), "last", null);
        setField(term2329, term2329.getClass(), "propListHead", null);
        setIntField(term2329, term2329.getClass(), "sourcePosition", 0);
        setField(term2329, term2329.getClass(), "jsType", null);
        setField(term2329, term2329.getClass(), "parent", null);
        setField(term2324, term2324.getClass(), "first", term2329);
        setIntField(term2332, term2332.getClass(), "type", 0);
        setField(term2332, term2332.getClass(), "next", null);
        setField(term2332, term2332.getClass(), "first", null);
        setField(term2332, term2332.getClass(), "last", null);
        setField(term2332, term2332.getClass(), "propListHead", null);
        setIntField(term2332, term2332.getClass(), "sourcePosition", 0);
        setField(term2332, term2332.getClass(), "jsType", null);
        setField(term2332, term2332.getClass(), "parent", null);
        setField(term2324, term2324.getClass(), "last", term2332);
        setField(term2335, term2335.getClass(), "next", null);
        setIntField(term2335, term2335.getClass(), "type", 0);
        setIntField(term2335, term2335.getClass(), "intValue", 0);
        setField(term2335, term2335.getClass(), "objectValue", null);
        setField(term2324, term2324.getClass(), "propListHead", term2335);
        setIntField(term2324, term2324.getClass(), "sourcePosition", 663292551);
        setField(term2324, term2324.getClass(), "jsType", null);
        setField(term2324, term2324.getClass(), "parent", null);
        setField(term2322, term2322.getClass(), "next", term2324);
        setIntField(term2339, term2339.getClass(), "type", 0);
        setField(term2339, term2339.getClass(), "next", null);
        setField(term2339, term2339.getClass(), "first", null);
        setField(term2339, term2339.getClass(), "last", null);
        setField(term2339, term2339.getClass(), "propListHead", null);
        setIntField(term2339, term2339.getClass(), "sourcePosition", 0);
        setField(term2339, term2339.getClass(), "jsType", null);
        setField(term2339, term2339.getClass(), "parent", null);
        setField(term2322, term2322.getClass(), "first", term2339);
        setIntField(term2342, term2342.getClass(), "type", 0);
        setField(term2342, term2342.getClass(), "next", null);
        setField(term2342, term2342.getClass(), "first", null);
        setField(term2342, term2342.getClass(), "last", null);
        setField(term2342, term2342.getClass(), "propListHead", null);
        setIntField(term2342, term2342.getClass(), "sourcePosition", 0);
        setField(term2342, term2342.getClass(), "jsType", null);
        setField(term2342, term2342.getClass(), "parent", null);
        setField(term2322, term2322.getClass(), "last", term2342);
        setField(term2345, term2345.getClass(), "next", null);
        setIntField(term2345, term2345.getClass(), "type", 0);
        setIntField(term2345, term2345.getClass(), "intValue", 0);
        setField(term2345, term2345.getClass(), "objectValue", null);
        setField(term2322, term2322.getClass(), "propListHead", term2345);
        setIntField(term2322, term2322.getClass(), "sourcePosition", -1885090354);
        setField(term2322, term2322.getClass(), "jsType", null);
        setField(term2322, term2322.getClass(), "parent", null);
        term2349 = new Integer(-2066804303);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term2322;
        args[1] = term2349;
        callMethod(klass, "getNonEmptyChildCount", argTypes, null, args);
    }

};


