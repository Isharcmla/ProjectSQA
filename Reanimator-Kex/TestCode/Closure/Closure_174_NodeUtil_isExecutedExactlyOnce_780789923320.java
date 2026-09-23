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

public class NodeUtil_isExecutedExactlyOnce_780789923320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5020;

    public NodeUtil_isExecutedExactlyOnce_780789923320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5020 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5022 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5024 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5026 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5028 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5031 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5035 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5037 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5042 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term5020, term5020.getClass(), "type", -288126597);
        setIntField(term5022, term5022.getClass(), "type", -218831961);
        setIntField(term5024, term5024.getClass(), "type", 826765055);
        setIntField(term5026, term5026.getClass(), "type", 1358117317);
        setIntField(term5028, term5028.getClass(), "type", 229989439);
        setField(term5028, term5028.getClass(), "next", null);
        setField(term5028, term5028.getClass(), "first", null);
        setField(term5028, term5028.getClass(), "last", null);
        setField(term5028, term5028.getClass(), "propListHead", null);
        setIntField(term5028, term5028.getClass(), "sourcePosition", 0);
        setField(term5028, term5028.getClass(), "jsType", null);
        setField(term5028, term5028.getClass(), "parent", null);
        setField(term5026, term5026.getClass(), "next", term5028);
        setIntField(term5031, term5031.getClass(), "type", -1620126913);
        setField(term5031, term5031.getClass(), "next", null);
        setField(term5031, term5031.getClass(), "first", null);
        setField(term5031, term5031.getClass(), "last", term5028);
        setField(term5031, term5031.getClass(), "propListHead", null);
        setIntField(term5031, term5031.getClass(), "sourcePosition", 0);
        setField(term5031, term5031.getClass(), "jsType", null);
        setField(term5031, term5031.getClass(), "parent", null);
        setField(term5026, term5026.getClass(), "first", term5031);
        setField(term5026, term5026.getClass(), "last", term5024);
        setField(term5026, term5026.getClass(), "propListHead", null);
        setIntField(term5026, term5026.getClass(), "sourcePosition", 0);
        setField(term5026, term5026.getClass(), "jsType", null);
        setField(term5026, term5026.getClass(), "parent", null);
        setField(term5024, term5024.getClass(), "next", term5026);
        setField(term5024, term5024.getClass(), "first", term5028);
        setIntField(term5035, term5035.getClass(), "type", -1674851914);
        setIntField(term5037, term5037.getClass(), "type", -1891353352);
        setField(term5037, term5037.getClass(), "next", null);
        setField(term5037, term5037.getClass(), "first", term5031);
        setField(term5037, term5037.getClass(), "last", term5026);
        setField(term5037, term5037.getClass(), "propListHead", null);
        setIntField(term5037, term5037.getClass(), "sourcePosition", 0);
        setField(term5037, term5037.getClass(), "jsType", null);
        setField(term5037, term5037.getClass(), "parent", null);
        setField(term5035, term5035.getClass(), "next", term5037);
        setField(term5035, term5035.getClass(), "first", term5022);
        setField(term5035, term5035.getClass(), "last", term5022);
        setField(term5035, term5035.getClass(), "propListHead", null);
        setIntField(term5035, term5035.getClass(), "sourcePosition", 0);
        setField(term5035, term5035.getClass(), "jsType", null);
        setField(term5035, term5035.getClass(), "parent", null);
        setField(term5024, term5024.getClass(), "last", term5035);
        setField(term5024, term5024.getClass(), "propListHead", null);
        setIntField(term5024, term5024.getClass(), "sourcePosition", 0);
        setField(term5024, term5024.getClass(), "jsType", null);
        setField(term5024, term5024.getClass(), "parent", null);
        setField(term5022, term5022.getClass(), "next", term5024);
        setIntField(term5042, term5042.getClass(), "type", 113007640);
        setField(term5042, term5042.getClass(), "next", term5035);
        setField(term5042, term5042.getClass(), "first", term5037);
        setField(term5042, term5042.getClass(), "last", term5020);
        setField(term5042, term5042.getClass(), "propListHead", null);
        setIntField(term5042, term5042.getClass(), "sourcePosition", 0);
        setField(term5042, term5042.getClass(), "jsType", null);
        setField(term5042, term5042.getClass(), "parent", null);
        setField(term5022, term5022.getClass(), "first", term5042);
        setField(term5022, term5022.getClass(), "last", term5042);
        setField(term5022, term5022.getClass(), "propListHead", null);
        setIntField(term5022, term5022.getClass(), "sourcePosition", 0);
        setField(term5022, term5022.getClass(), "jsType", null);
        setField(term5022, term5022.getClass(), "parent", null);
        setField(term5020, term5020.getClass(), "next", term5022);
        setField(term5020, term5020.getClass(), "first", term5026);
        setField(term5020, term5020.getClass(), "last", term5028);
        setField(term5020, term5020.getClass(), "propListHead", null);
        setIntField(term5020, term5020.getClass(), "sourcePosition", 0);
        setField(term5020, term5020.getClass(), "jsType", null);
        setField(term5020, term5020.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term5020;
        try {
            callMethod(klass, "isExecutedExactlyOnce", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


