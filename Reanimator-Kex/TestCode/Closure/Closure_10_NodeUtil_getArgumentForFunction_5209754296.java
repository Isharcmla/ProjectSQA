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

public class NodeUtil_getArgumentForFunction_5209754296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4092;
     Object term4119;

    public NodeUtil_getArgumentForFunction_5209754296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4092 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4094 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4096 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4098 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4100 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4103 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4107 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4109 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4114 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4092, term4092.getClass(), "type", -1494372780);
        setIntField(term4094, term4094.getClass(), "type", 703799187);
        setIntField(term4096, term4096.getClass(), "type", -1305898281);
        setIntField(term4098, term4098.getClass(), "type", 140501130);
        setIntField(term4100, term4100.getClass(), "type", -1458890291);
        setField(term4100, term4100.getClass(), "next", null);
        setField(term4100, term4100.getClass(), "first", null);
        setField(term4100, term4100.getClass(), "last", null);
        setField(term4100, term4100.getClass(), "propListHead", null);
        setIntField(term4100, term4100.getClass(), "sourcePosition", 0);
        setField(term4100, term4100.getClass(), "jsType", null);
        setField(term4100, term4100.getClass(), "parent", null);
        setField(term4098, term4098.getClass(), "next", term4100);
        setIntField(term4103, term4103.getClass(), "type", 1016087323);
        setField(term4103, term4103.getClass(), "next", null);
        setField(term4103, term4103.getClass(), "first", null);
        setField(term4103, term4103.getClass(), "last", term4100);
        setField(term4103, term4103.getClass(), "propListHead", null);
        setIntField(term4103, term4103.getClass(), "sourcePosition", 0);
        setField(term4103, term4103.getClass(), "jsType", null);
        setField(term4103, term4103.getClass(), "parent", null);
        setField(term4098, term4098.getClass(), "first", term4103);
        setField(term4098, term4098.getClass(), "last", term4096);
        setField(term4098, term4098.getClass(), "propListHead", null);
        setIntField(term4098, term4098.getClass(), "sourcePosition", 0);
        setField(term4098, term4098.getClass(), "jsType", null);
        setField(term4098, term4098.getClass(), "parent", null);
        setField(term4096, term4096.getClass(), "next", term4098);
        setField(term4096, term4096.getClass(), "first", term4100);
        setIntField(term4107, term4107.getClass(), "type", -1290093259);
        setIntField(term4109, term4109.getClass(), "type", -1200934890);
        setField(term4109, term4109.getClass(), "next", null);
        setField(term4109, term4109.getClass(), "first", term4103);
        setField(term4109, term4109.getClass(), "last", term4098);
        setField(term4109, term4109.getClass(), "propListHead", null);
        setIntField(term4109, term4109.getClass(), "sourcePosition", 0);
        setField(term4109, term4109.getClass(), "jsType", null);
        setField(term4109, term4109.getClass(), "parent", null);
        setField(term4107, term4107.getClass(), "next", term4109);
        setField(term4107, term4107.getClass(), "first", term4094);
        setField(term4107, term4107.getClass(), "last", term4094);
        setField(term4107, term4107.getClass(), "propListHead", null);
        setIntField(term4107, term4107.getClass(), "sourcePosition", 0);
        setField(term4107, term4107.getClass(), "jsType", null);
        setField(term4107, term4107.getClass(), "parent", null);
        setField(term4096, term4096.getClass(), "last", term4107);
        setField(term4096, term4096.getClass(), "propListHead", null);
        setIntField(term4096, term4096.getClass(), "sourcePosition", 0);
        setField(term4096, term4096.getClass(), "jsType", null);
        setField(term4096, term4096.getClass(), "parent", null);
        setField(term4094, term4094.getClass(), "next", term4096);
        setIntField(term4114, term4114.getClass(), "type", 1765633108);
        setField(term4114, term4114.getClass(), "next", term4107);
        setField(term4114, term4114.getClass(), "first", term4109);
        setField(term4114, term4114.getClass(), "last", term4092);
        setField(term4114, term4114.getClass(), "propListHead", null);
        setIntField(term4114, term4114.getClass(), "sourcePosition", 0);
        setField(term4114, term4114.getClass(), "jsType", null);
        setField(term4114, term4114.getClass(), "parent", null);
        setField(term4094, term4094.getClass(), "first", term4114);
        setField(term4094, term4094.getClass(), "last", term4114);
        setField(term4094, term4094.getClass(), "propListHead", null);
        setIntField(term4094, term4094.getClass(), "sourcePosition", 0);
        setField(term4094, term4094.getClass(), "jsType", null);
        setField(term4094, term4094.getClass(), "parent", null);
        setField(term4092, term4092.getClass(), "next", term4094);
        setField(term4092, term4092.getClass(), "first", term4098);
        setField(term4092, term4092.getClass(), "last", term4100);
        setField(term4092, term4092.getClass(), "propListHead", null);
        setIntField(term4092, term4092.getClass(), "sourcePosition", 0);
        setField(term4092, term4092.getClass(), "jsType", null);
        setField(term4092, term4092.getClass(), "parent", null);
        term4119 = new Integer(1312888741);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term4092;
        args[1] = term4119;
        try {
            callMethod(klass, "getArgumentForFunction", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


