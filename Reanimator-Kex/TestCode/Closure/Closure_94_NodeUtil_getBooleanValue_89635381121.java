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

public class NodeUtil_getBooleanValue_89635381121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28;
     Object term4018;
     Object enum1;

    public NodeUtil_getBooleanValue_89635381121() {
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
        term4018 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4019 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4020 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4021 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4022 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4023 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term4024 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4025 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4026 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term4018, term4018.getClass(), "type", 597278769);
        setIntField(term4019, term4019.getClass(), "type", 1048535127);
        setIntField(term4020, term4020.getClass(), "type", 0);
        setField(term4020, term4020.getClass(), "next", null);
        setField(term4020, term4020.getClass(), "first", null);
        setField(term4020, term4020.getClass(), "last", null);
        setField(term4020, term4020.getClass(), "propListHead", null);
        setIntField(term4020, term4020.getClass(), "sourcePosition", 0);
        setField(term4020, term4020.getClass(), "jsType", null);
        setField(term4020, term4020.getClass(), "parent", null);
        setField(term4019, term4019.getClass(), "next", term4020);
        setIntField(term4021, term4021.getClass(), "type", 0);
        setField(term4021, term4021.getClass(), "next", null);
        setField(term4021, term4021.getClass(), "first", null);
        setField(term4021, term4021.getClass(), "last", null);
        setField(term4021, term4021.getClass(), "propListHead", null);
        setIntField(term4021, term4021.getClass(), "sourcePosition", 0);
        setField(term4021, term4021.getClass(), "jsType", null);
        setField(term4021, term4021.getClass(), "parent", null);
        setField(term4019, term4019.getClass(), "first", term4021);
        setIntField(term4022, term4022.getClass(), "type", 0);
        setField(term4022, term4022.getClass(), "next", null);
        setField(term4022, term4022.getClass(), "first", null);
        setField(term4022, term4022.getClass(), "last", null);
        setField(term4022, term4022.getClass(), "propListHead", null);
        setIntField(term4022, term4022.getClass(), "sourcePosition", 0);
        setField(term4022, term4022.getClass(), "jsType", null);
        setField(term4022, term4022.getClass(), "parent", null);
        setField(term4019, term4019.getClass(), "last", term4022);
        setField(term4023, term4023.getClass(), "next", null);
        setIntField(term4023, term4023.getClass(), "type", 0);
        setIntField(term4023, term4023.getClass(), "intValue", 0);
        setField(term4023, term4023.getClass(), "objectValue", null);
        setField(term4019, term4019.getClass(), "propListHead", term4023);
        setIntField(term4019, term4019.getClass(), "sourcePosition", -2068769794);
        setField(term4019, term4019.getClass(), "jsType", null);
        setField(term4019, term4019.getClass(), "parent", null);
        setField(term4018, term4018.getClass(), "next", term4019);
        setIntField(term4024, term4024.getClass(), "type", 0);
        setField(term4024, term4024.getClass(), "next", null);
        setField(term4024, term4024.getClass(), "first", null);
        setField(term4024, term4024.getClass(), "last", null);
        setField(term4024, term4024.getClass(), "propListHead", null);
        setIntField(term4024, term4024.getClass(), "sourcePosition", 0);
        setField(term4024, term4024.getClass(), "jsType", null);
        setField(term4024, term4024.getClass(), "parent", null);
        setField(term4018, term4018.getClass(), "first", term4024);
        setIntField(term4025, term4025.getClass(), "type", 0);
        setField(term4025, term4025.getClass(), "next", null);
        setField(term4025, term4025.getClass(), "first", null);
        setField(term4025, term4025.getClass(), "last", null);
        setField(term4025, term4025.getClass(), "propListHead", null);
        setIntField(term4025, term4025.getClass(), "sourcePosition", 0);
        setField(term4025, term4025.getClass(), "jsType", null);
        setField(term4025, term4025.getClass(), "parent", null);
        setField(term4018, term4018.getClass(), "last", term4025);
        setField(term4026, term4026.getClass(), "next", null);
        setIntField(term4026, term4026.getClass(), "type", 0);
        setIntField(term4026, term4026.getClass(), "intValue", 0);
        setField(term4026, term4026.getClass(), "objectValue", null);
        setField(term4018, term4018.getClass(), "propListHead", term4026);
        setIntField(term4018, term4018.getClass(), "sourcePosition", -117576464);
        setField(term4018, term4018.getClass(), "jsType", null);
        setField(term4018, term4018.getClass(), "parent", null);
        Class<? extends Object> term4028 = Class.forName((String) "com.google.javascript.rhino.jstype.TernaryValue");
        Field term4027 = ((Class) term4028).getDeclaredField((String) "UNKNOWN");
        ((Field) term4027).setAccessible(true);
        enum1 = ((Field) term4027).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term28;
        Object retValue = callMethod(klass, "getBooleanValue", argTypes, null, args);
        assertTrue(recursiveEquals(term28, term4018));
        assertTrue(recursiveEquals(retValue, enum1));
    }

};


