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
import java.lang.String;

public class NodeUtil_getPureBooleanValue_1302448051154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28;
     Object term4856;
     Object enum1;

    public NodeUtil_getPureBooleanValue_1302448051154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term38 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term41 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term45 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term51 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term28, term28.getClass(), "type", 597278769);
        setIntField(term30, term30.getClass(), "type", 1048535127);
        setIntField(term32, term32.getClass(), "type", 0);
        setField(term32, term32.getClass(), "next", null);
        setField(term32, term32.getClass(), "first", null);
        setField(term32, term32.getClass(), "last", null);
        setField(term32, term32.getClass(), "propListHead", null);
        setIntField(term32, term32.getClass(), "sourcePosition", 0);
        setField(term32, term32.getClass(), "jsType", null);
        setField(term32, term32.getClass(), "parent", null);
        setField(term30, term30.getClass(), "next", term32);
        setIntField(term35, term35.getClass(), "type", 0);
        setField(term35, term35.getClass(), "next", null);
        setField(term35, term35.getClass(), "first", null);
        setField(term35, term35.getClass(), "last", null);
        setField(term35, term35.getClass(), "propListHead", null);
        setIntField(term35, term35.getClass(), "sourcePosition", 0);
        setField(term35, term35.getClass(), "jsType", null);
        setField(term35, term35.getClass(), "parent", null);
        setField(term30, term30.getClass(), "first", term35);
        setIntField(term38, term38.getClass(), "type", 0);
        setField(term38, term38.getClass(), "next", null);
        setField(term38, term38.getClass(), "first", null);
        setField(term38, term38.getClass(), "last", null);
        setField(term38, term38.getClass(), "propListHead", null);
        setIntField(term38, term38.getClass(), "sourcePosition", 0);
        setField(term38, term38.getClass(), "jsType", null);
        setField(term38, term38.getClass(), "parent", null);
        setField(term30, term30.getClass(), "last", term38);
        setField(term41, term41.getClass(), "next", null);
        setIntField(term41, term41.getClass(), "type", 0);
        setIntField(term41, term41.getClass(), "intValue", 0);
        setField(term41, term41.getClass(), "objectValue", null);
        setField(term30, term30.getClass(), "propListHead", term41);
        setIntField(term30, term30.getClass(), "sourcePosition", -2068769794);
        setField(term30, term30.getClass(), "jsType", null);
        setField(term30, term30.getClass(), "parent", null);
        setField(term28, term28.getClass(), "next", term30);
        setIntField(term45, term45.getClass(), "type", 0);
        setField(term45, term45.getClass(), "next", null);
        setField(term45, term45.getClass(), "first", null);
        setField(term45, term45.getClass(), "last", null);
        setField(term45, term45.getClass(), "propListHead", null);
        setIntField(term45, term45.getClass(), "sourcePosition", 0);
        setField(term45, term45.getClass(), "jsType", null);
        setField(term45, term45.getClass(), "parent", null);
        setField(term28, term28.getClass(), "first", term45);
        setIntField(term48, term48.getClass(), "type", 0);
        setField(term48, term48.getClass(), "next", null);
        setField(term48, term48.getClass(), "first", null);
        setField(term48, term48.getClass(), "last", null);
        setField(term48, term48.getClass(), "propListHead", null);
        setIntField(term48, term48.getClass(), "sourcePosition", 0);
        setField(term48, term48.getClass(), "jsType", null);
        setField(term48, term48.getClass(), "parent", null);
        setField(term28, term28.getClass(), "last", term48);
        setField(term51, term51.getClass(), "next", null);
        setIntField(term51, term51.getClass(), "type", 0);
        setIntField(term51, term51.getClass(), "intValue", 0);
        setField(term51, term51.getClass(), "objectValue", null);
        setField(term28, term28.getClass(), "propListHead", term51);
        setIntField(term28, term28.getClass(), "sourcePosition", -117576464);
        setField(term28, term28.getClass(), "jsType", null);
        setField(term28, term28.getClass(), "parent", null);
        term4856 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4857 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4858 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4859 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4860 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4861 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term4862 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4863 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4864 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term4856, term4856.getClass(), "type", 597278769);
        setIntField(term4857, term4857.getClass(), "type", 1048535127);
        setIntField(term4858, term4858.getClass(), "type", 0);
        setField(term4858, term4858.getClass(), "next", null);
        setField(term4858, term4858.getClass(), "first", null);
        setField(term4858, term4858.getClass(), "last", null);
        setField(term4858, term4858.getClass(), "propListHead", null);
        setIntField(term4858, term4858.getClass(), "sourcePosition", 0);
        setField(term4858, term4858.getClass(), "jsType", null);
        setField(term4858, term4858.getClass(), "parent", null);
        setField(term4857, term4857.getClass(), "next", term4858);
        setIntField(term4859, term4859.getClass(), "type", 0);
        setField(term4859, term4859.getClass(), "next", null);
        setField(term4859, term4859.getClass(), "first", null);
        setField(term4859, term4859.getClass(), "last", null);
        setField(term4859, term4859.getClass(), "propListHead", null);
        setIntField(term4859, term4859.getClass(), "sourcePosition", 0);
        setField(term4859, term4859.getClass(), "jsType", null);
        setField(term4859, term4859.getClass(), "parent", null);
        setField(term4857, term4857.getClass(), "first", term4859);
        setIntField(term4860, term4860.getClass(), "type", 0);
        setField(term4860, term4860.getClass(), "next", null);
        setField(term4860, term4860.getClass(), "first", null);
        setField(term4860, term4860.getClass(), "last", null);
        setField(term4860, term4860.getClass(), "propListHead", null);
        setIntField(term4860, term4860.getClass(), "sourcePosition", 0);
        setField(term4860, term4860.getClass(), "jsType", null);
        setField(term4860, term4860.getClass(), "parent", null);
        setField(term4857, term4857.getClass(), "last", term4860);
        setField(term4861, term4861.getClass(), "next", null);
        setIntField(term4861, term4861.getClass(), "type", 0);
        setIntField(term4861, term4861.getClass(), "intValue", 0);
        setField(term4861, term4861.getClass(), "objectValue", null);
        setField(term4857, term4857.getClass(), "propListHead", term4861);
        setIntField(term4857, term4857.getClass(), "sourcePosition", -2068769794);
        setField(term4857, term4857.getClass(), "jsType", null);
        setField(term4857, term4857.getClass(), "parent", null);
        setField(term4856, term4856.getClass(), "next", term4857);
        setIntField(term4862, term4862.getClass(), "type", 0);
        setField(term4862, term4862.getClass(), "next", null);
        setField(term4862, term4862.getClass(), "first", null);
        setField(term4862, term4862.getClass(), "last", null);
        setField(term4862, term4862.getClass(), "propListHead", null);
        setIntField(term4862, term4862.getClass(), "sourcePosition", 0);
        setField(term4862, term4862.getClass(), "jsType", null);
        setField(term4862, term4862.getClass(), "parent", null);
        setField(term4856, term4856.getClass(), "first", term4862);
        setIntField(term4863, term4863.getClass(), "type", 0);
        setField(term4863, term4863.getClass(), "next", null);
        setField(term4863, term4863.getClass(), "first", null);
        setField(term4863, term4863.getClass(), "last", null);
        setField(term4863, term4863.getClass(), "propListHead", null);
        setIntField(term4863, term4863.getClass(), "sourcePosition", 0);
        setField(term4863, term4863.getClass(), "jsType", null);
        setField(term4863, term4863.getClass(), "parent", null);
        setField(term4856, term4856.getClass(), "last", term4863);
        setField(term4864, term4864.getClass(), "next", null);
        setIntField(term4864, term4864.getClass(), "type", 0);
        setIntField(term4864, term4864.getClass(), "intValue", 0);
        setField(term4864, term4864.getClass(), "objectValue", null);
        setField(term4856, term4856.getClass(), "propListHead", term4864);
        setIntField(term4856, term4856.getClass(), "sourcePosition", -117576464);
        setField(term4856, term4856.getClass(), "jsType", null);
        setField(term4856, term4856.getClass(), "parent", null);
        Class<? extends Object> term4866 = Class.forName((String) "com.google.javascript.rhino.jstype.TernaryValue");
        Field term4865 = ((Class) term4866).getDeclaredField((String) "UNKNOWN");
        ((Field) term4865).setAccessible(true);
        enum1 = ((Field) term4865).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term28;
        Object retValue = callMethod(klass, "getPureBooleanValue", argTypes, null, args);
        assertTrue(recursiveEquals(term28, term4856));
        assertTrue(recursiveEquals(retValue, enum1));
    }

};


