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

public class NodeUtil_isForIn_1860155213142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term949;
     Object term7059;

    public NodeUtil_isForIn_1860155213142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term949 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term951 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term953 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term956 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term959 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term962 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term966 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term969 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term972 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term949, term949.getClass(), "type", -439048495);
        setIntField(term951, term951.getClass(), "type", 787278105);
        setIntField(term953, term953.getClass(), "type", 0);
        setField(term953, term953.getClass(), "next", null);
        setField(term953, term953.getClass(), "first", null);
        setField(term953, term953.getClass(), "last", null);
        setField(term953, term953.getClass(), "propListHead", null);
        setIntField(term953, term953.getClass(), "sourcePosition", 0);
        setField(term953, term953.getClass(), "jsType", null);
        setField(term953, term953.getClass(), "parent", null);
        setField(term951, term951.getClass(), "next", term953);
        setIntField(term956, term956.getClass(), "type", 0);
        setField(term956, term956.getClass(), "next", null);
        setField(term956, term956.getClass(), "first", null);
        setField(term956, term956.getClass(), "last", null);
        setField(term956, term956.getClass(), "propListHead", null);
        setIntField(term956, term956.getClass(), "sourcePosition", 0);
        setField(term956, term956.getClass(), "jsType", null);
        setField(term956, term956.getClass(), "parent", null);
        setField(term951, term951.getClass(), "first", term956);
        setIntField(term959, term959.getClass(), "type", 0);
        setField(term959, term959.getClass(), "next", null);
        setField(term959, term959.getClass(), "first", null);
        setField(term959, term959.getClass(), "last", null);
        setField(term959, term959.getClass(), "propListHead", null);
        setIntField(term959, term959.getClass(), "sourcePosition", 0);
        setField(term959, term959.getClass(), "jsType", null);
        setField(term959, term959.getClass(), "parent", null);
        setField(term951, term951.getClass(), "last", term959);
        setField(term962, term962.getClass(), "next", null);
        setIntField(term962, term962.getClass(), "type", 0);
        setIntField(term962, term962.getClass(), "intValue", 0);
        setField(term962, term962.getClass(), "objectValue", null);
        setField(term951, term951.getClass(), "propListHead", term962);
        setIntField(term951, term951.getClass(), "sourcePosition", 320711637);
        setField(term951, term951.getClass(), "jsType", null);
        setField(term951, term951.getClass(), "parent", null);
        setField(term949, term949.getClass(), "next", term951);
        setIntField(term966, term966.getClass(), "type", 0);
        setField(term966, term966.getClass(), "next", null);
        setField(term966, term966.getClass(), "first", null);
        setField(term966, term966.getClass(), "last", null);
        setField(term966, term966.getClass(), "propListHead", null);
        setIntField(term966, term966.getClass(), "sourcePosition", 0);
        setField(term966, term966.getClass(), "jsType", null);
        setField(term966, term966.getClass(), "parent", null);
        setField(term949, term949.getClass(), "first", term966);
        setIntField(term969, term969.getClass(), "type", 0);
        setField(term969, term969.getClass(), "next", null);
        setField(term969, term969.getClass(), "first", null);
        setField(term969, term969.getClass(), "last", null);
        setField(term969, term969.getClass(), "propListHead", null);
        setIntField(term969, term969.getClass(), "sourcePosition", 0);
        setField(term969, term969.getClass(), "jsType", null);
        setField(term969, term969.getClass(), "parent", null);
        setField(term949, term949.getClass(), "last", term969);
        setField(term972, term972.getClass(), "next", null);
        setIntField(term972, term972.getClass(), "type", 0);
        setIntField(term972, term972.getClass(), "intValue", 0);
        setField(term972, term972.getClass(), "objectValue", null);
        setField(term949, term949.getClass(), "propListHead", term972);
        setIntField(term949, term949.getClass(), "sourcePosition", 1241164745);
        setField(term949, term949.getClass(), "jsType", null);
        setField(term949, term949.getClass(), "parent", null);
        term7059 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7060 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7061 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7062 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7063 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7064 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term7065 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7066 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7067 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term7059, term7059.getClass(), "type", -439048495);
        setIntField(term7060, term7060.getClass(), "type", 787278105);
        setIntField(term7061, term7061.getClass(), "type", 0);
        setField(term7061, term7061.getClass(), "next", null);
        setField(term7061, term7061.getClass(), "first", null);
        setField(term7061, term7061.getClass(), "last", null);
        setField(term7061, term7061.getClass(), "propListHead", null);
        setIntField(term7061, term7061.getClass(), "sourcePosition", 0);
        setField(term7061, term7061.getClass(), "jsType", null);
        setField(term7061, term7061.getClass(), "parent", null);
        setField(term7060, term7060.getClass(), "next", term7061);
        setIntField(term7062, term7062.getClass(), "type", 0);
        setField(term7062, term7062.getClass(), "next", null);
        setField(term7062, term7062.getClass(), "first", null);
        setField(term7062, term7062.getClass(), "last", null);
        setField(term7062, term7062.getClass(), "propListHead", null);
        setIntField(term7062, term7062.getClass(), "sourcePosition", 0);
        setField(term7062, term7062.getClass(), "jsType", null);
        setField(term7062, term7062.getClass(), "parent", null);
        setField(term7060, term7060.getClass(), "first", term7062);
        setIntField(term7063, term7063.getClass(), "type", 0);
        setField(term7063, term7063.getClass(), "next", null);
        setField(term7063, term7063.getClass(), "first", null);
        setField(term7063, term7063.getClass(), "last", null);
        setField(term7063, term7063.getClass(), "propListHead", null);
        setIntField(term7063, term7063.getClass(), "sourcePosition", 0);
        setField(term7063, term7063.getClass(), "jsType", null);
        setField(term7063, term7063.getClass(), "parent", null);
        setField(term7060, term7060.getClass(), "last", term7063);
        setField(term7064, term7064.getClass(), "next", null);
        setIntField(term7064, term7064.getClass(), "type", 0);
        setIntField(term7064, term7064.getClass(), "intValue", 0);
        setField(term7064, term7064.getClass(), "objectValue", null);
        setField(term7060, term7060.getClass(), "propListHead", term7064);
        setIntField(term7060, term7060.getClass(), "sourcePosition", 320711637);
        setField(term7060, term7060.getClass(), "jsType", null);
        setField(term7060, term7060.getClass(), "parent", null);
        setField(term7059, term7059.getClass(), "next", term7060);
        setIntField(term7065, term7065.getClass(), "type", 0);
        setField(term7065, term7065.getClass(), "next", null);
        setField(term7065, term7065.getClass(), "first", null);
        setField(term7065, term7065.getClass(), "last", null);
        setField(term7065, term7065.getClass(), "propListHead", null);
        setIntField(term7065, term7065.getClass(), "sourcePosition", 0);
        setField(term7065, term7065.getClass(), "jsType", null);
        setField(term7065, term7065.getClass(), "parent", null);
        setField(term7059, term7059.getClass(), "first", term7065);
        setIntField(term7066, term7066.getClass(), "type", 0);
        setField(term7066, term7066.getClass(), "next", null);
        setField(term7066, term7066.getClass(), "first", null);
        setField(term7066, term7066.getClass(), "last", null);
        setField(term7066, term7066.getClass(), "propListHead", null);
        setIntField(term7066, term7066.getClass(), "sourcePosition", 0);
        setField(term7066, term7066.getClass(), "jsType", null);
        setField(term7066, term7066.getClass(), "parent", null);
        setField(term7059, term7059.getClass(), "last", term7066);
        setField(term7067, term7067.getClass(), "next", null);
        setIntField(term7067, term7067.getClass(), "type", 0);
        setIntField(term7067, term7067.getClass(), "intValue", 0);
        setField(term7067, term7067.getClass(), "objectValue", null);
        setField(term7059, term7059.getClass(), "propListHead", term7067);
        setIntField(term7059, term7059.getClass(), "sourcePosition", 1241164745);
        setField(term7059, term7059.getClass(), "jsType", null);
        setField(term7059, term7059.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term949;
        Object retValue = callMethod(klass, "isForIn", argTypes, null, args);
        assertTrue(recursiveEquals(term949, term7059));
        assertTrue(recursiveEquals(retValue, false));
    }

};


