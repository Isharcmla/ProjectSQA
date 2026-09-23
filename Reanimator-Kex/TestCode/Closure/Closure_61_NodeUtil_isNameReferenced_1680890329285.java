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

public class NodeUtil_isNameReferenced_1680890329285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3028;

    public NodeUtil_isNameReferenced_1680890329285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3028 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3030 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3032 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3035 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3038 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3042 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3045 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3028, term3028.getClass(), "type", 428360161);
        setIntField(term3030, term3030.getClass(), "type", -1652588127);
        setIntField(term3032, term3032.getClass(), "type", 0);
        setField(term3032, term3032.getClass(), "next", null);
        setField(term3032, term3032.getClass(), "first", null);
        setField(term3032, term3032.getClass(), "last", null);
        setField(term3032, term3032.getClass(), "propListHead", null);
        setIntField(term3032, term3032.getClass(), "sourcePosition", 0);
        setField(term3032, term3032.getClass(), "jsType", null);
        setField(term3032, term3032.getClass(), "parent", null);
        setField(term3030, term3030.getClass(), "next", term3032);
        setIntField(term3035, term3035.getClass(), "type", 0);
        setField(term3035, term3035.getClass(), "next", null);
        setField(term3035, term3035.getClass(), "first", null);
        setField(term3035, term3035.getClass(), "last", null);
        setField(term3035, term3035.getClass(), "propListHead", null);
        setIntField(term3035, term3035.getClass(), "sourcePosition", 0);
        setField(term3035, term3035.getClass(), "jsType", null);
        setField(term3035, term3035.getClass(), "parent", null);
        setField(term3030, term3030.getClass(), "first", term3035);
        setIntField(term3038, term3038.getClass(), "type", 0);
        setField(term3038, term3038.getClass(), "next", null);
        setField(term3038, term3038.getClass(), "first", null);
        setField(term3038, term3038.getClass(), "last", null);
        setField(term3038, term3038.getClass(), "propListHead", null);
        setIntField(term3038, term3038.getClass(), "sourcePosition", 0);
        setField(term3038, term3038.getClass(), "jsType", null);
        setField(term3038, term3038.getClass(), "parent", null);
        setField(term3030, term3030.getClass(), "last", term3038);
        setField(term3030, term3030.getClass(), "propListHead", null);
        setIntField(term3030, term3030.getClass(), "sourcePosition", 0);
        setField(term3030, term3030.getClass(), "jsType", null);
        setField(term3030, term3030.getClass(), "parent", null);
        setField(term3028, term3028.getClass(), "next", term3030);
        setIntField(term3042, term3042.getClass(), "type", 0);
        setField(term3042, term3042.getClass(), "next", null);
        setField(term3042, term3042.getClass(), "first", null);
        setField(term3042, term3042.getClass(), "last", null);
        setField(term3042, term3042.getClass(), "propListHead", null);
        setIntField(term3042, term3042.getClass(), "sourcePosition", 0);
        setField(term3042, term3042.getClass(), "jsType", null);
        setField(term3042, term3042.getClass(), "parent", null);
        setField(term3028, term3028.getClass(), "first", term3042);
        setIntField(term3045, term3045.getClass(), "type", 0);
        setField(term3045, term3045.getClass(), "next", null);
        setField(term3045, term3045.getClass(), "first", null);
        setField(term3045, term3045.getClass(), "last", null);
        setField(term3045, term3045.getClass(), "propListHead", null);
        setIntField(term3045, term3045.getClass(), "sourcePosition", 0);
        setField(term3045, term3045.getClass(), "jsType", null);
        setField(term3045, term3045.getClass(), "parent", null);
        setField(term3028, term3028.getClass(), "last", term3045);
        setField(term3028, term3028.getClass(), "propListHead", null);
        setIntField(term3028, term3028.getClass(), "sourcePosition", 0);
        setField(term3028, term3028.getClass(), "jsType", null);
        setField(term3028, term3028.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term3028;
        args[1] = "flxyYxBRtu";
        args[2] = null;
        try {
            callMethod(klass, "isNameReferenced", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


