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

public class NodeUtil_newName_1541578555262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3015;

    public NodeUtil_newName_1541578555262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3015 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3017 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3019 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3021 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3023 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3026 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3030 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3032 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3037 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3015, term3015.getClass(), "type", -1665928103);
        setIntField(term3017, term3017.getClass(), "type", 1574458332);
        setIntField(term3019, term3019.getClass(), "type", -975856245);
        setIntField(term3021, term3021.getClass(), "type", -1023366103);
        setIntField(term3023, term3023.getClass(), "type", 81427089);
        setField(term3023, term3023.getClass(), "next", null);
        setField(term3023, term3023.getClass(), "first", null);
        setField(term3023, term3023.getClass(), "last", null);
        setField(term3023, term3023.getClass(), "propListHead", null);
        setIntField(term3023, term3023.getClass(), "sourcePosition", 0);
        setField(term3023, term3023.getClass(), "jsType", null);
        setField(term3023, term3023.getClass(), "parent", null);
        setField(term3021, term3021.getClass(), "next", term3023);
        setIntField(term3026, term3026.getClass(), "type", 755951489);
        setField(term3026, term3026.getClass(), "next", null);
        setField(term3026, term3026.getClass(), "first", null);
        setField(term3026, term3026.getClass(), "last", term3023);
        setField(term3026, term3026.getClass(), "propListHead", null);
        setIntField(term3026, term3026.getClass(), "sourcePosition", 0);
        setField(term3026, term3026.getClass(), "jsType", null);
        setField(term3026, term3026.getClass(), "parent", null);
        setField(term3021, term3021.getClass(), "first", term3026);
        setField(term3021, term3021.getClass(), "last", term3019);
        setField(term3021, term3021.getClass(), "propListHead", null);
        setIntField(term3021, term3021.getClass(), "sourcePosition", 0);
        setField(term3021, term3021.getClass(), "jsType", null);
        setField(term3021, term3021.getClass(), "parent", null);
        setField(term3019, term3019.getClass(), "next", term3021);
        setField(term3019, term3019.getClass(), "first", term3023);
        setIntField(term3030, term3030.getClass(), "type", -2137419728);
        setIntField(term3032, term3032.getClass(), "type", 1558810715);
        setField(term3032, term3032.getClass(), "next", null);
        setField(term3032, term3032.getClass(), "first", term3026);
        setField(term3032, term3032.getClass(), "last", term3021);
        setField(term3032, term3032.getClass(), "propListHead", null);
        setIntField(term3032, term3032.getClass(), "sourcePosition", 0);
        setField(term3032, term3032.getClass(), "jsType", null);
        setField(term3032, term3032.getClass(), "parent", null);
        setField(term3030, term3030.getClass(), "next", term3032);
        setField(term3030, term3030.getClass(), "first", term3017);
        setField(term3030, term3030.getClass(), "last", term3017);
        setField(term3030, term3030.getClass(), "propListHead", null);
        setIntField(term3030, term3030.getClass(), "sourcePosition", 0);
        setField(term3030, term3030.getClass(), "jsType", null);
        setField(term3030, term3030.getClass(), "parent", null);
        setField(term3019, term3019.getClass(), "last", term3030);
        setField(term3019, term3019.getClass(), "propListHead", null);
        setIntField(term3019, term3019.getClass(), "sourcePosition", 0);
        setField(term3019, term3019.getClass(), "jsType", null);
        setField(term3019, term3019.getClass(), "parent", null);
        setField(term3017, term3017.getClass(), "next", term3019);
        setIntField(term3037, term3037.getClass(), "type", -382652403);
        setField(term3037, term3037.getClass(), "next", term3030);
        setField(term3037, term3037.getClass(), "first", term3032);
        setField(term3037, term3037.getClass(), "last", term3015);
        setField(term3037, term3037.getClass(), "propListHead", null);
        setIntField(term3037, term3037.getClass(), "sourcePosition", 0);
        setField(term3037, term3037.getClass(), "jsType", null);
        setField(term3037, term3037.getClass(), "parent", null);
        setField(term3017, term3017.getClass(), "first", term3037);
        setField(term3017, term3017.getClass(), "last", term3037);
        setField(term3017, term3017.getClass(), "propListHead", null);
        setIntField(term3017, term3017.getClass(), "sourcePosition", 0);
        setField(term3017, term3017.getClass(), "jsType", null);
        setField(term3017, term3017.getClass(), "parent", null);
        setField(term3015, term3015.getClass(), "next", term3017);
        setField(term3015, term3015.getClass(), "first", term3021);
        setField(term3015, term3015.getClass(), "last", term3023);
        setField(term3015, term3015.getClass(), "propListHead", null);
        setIntField(term3015, term3015.getClass(), "sourcePosition", 0);
        setField(term3015, term3015.getClass(), "jsType", null);
        setField(term3015, term3015.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.CodingConvention");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[3] = Class.forName("java.lang.String");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = "hNxWaHcfhY";
        args[2] = term3015;
        args[3] = "RkybSrpybU";
        try {
            callMethod(klass, "newName", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


