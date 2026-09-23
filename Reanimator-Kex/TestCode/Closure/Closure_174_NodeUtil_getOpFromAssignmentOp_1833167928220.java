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

public class NodeUtil_getOpFromAssignmentOp_1833167928220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1331;

    public NodeUtil_getOpFromAssignmentOp_1833167928220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1331 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1333 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1335 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1337 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1339 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1342 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1346 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1348 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1353 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1331, term1331.getClass(), "type", 644154104);
        setIntField(term1333, term1333.getClass(), "type", 76650923);
        setIntField(term1335, term1335.getClass(), "type", 1003743923);
        setIntField(term1337, term1337.getClass(), "type", 1887772522);
        setIntField(term1339, term1339.getClass(), "type", 354196060);
        setField(term1339, term1339.getClass(), "next", null);
        setField(term1339, term1339.getClass(), "first", null);
        setField(term1339, term1339.getClass(), "last", null);
        setField(term1339, term1339.getClass(), "propListHead", null);
        setIntField(term1339, term1339.getClass(), "sourcePosition", 0);
        setField(term1339, term1339.getClass(), "jsType", null);
        setField(term1339, term1339.getClass(), "parent", null);
        setField(term1337, term1337.getClass(), "next", term1339);
        setIntField(term1342, term1342.getClass(), "type", -1840305774);
        setField(term1342, term1342.getClass(), "next", null);
        setField(term1342, term1342.getClass(), "first", null);
        setField(term1342, term1342.getClass(), "last", term1339);
        setField(term1342, term1342.getClass(), "propListHead", null);
        setIntField(term1342, term1342.getClass(), "sourcePosition", 0);
        setField(term1342, term1342.getClass(), "jsType", null);
        setField(term1342, term1342.getClass(), "parent", null);
        setField(term1337, term1337.getClass(), "first", term1342);
        setField(term1337, term1337.getClass(), "last", term1335);
        setField(term1337, term1337.getClass(), "propListHead", null);
        setIntField(term1337, term1337.getClass(), "sourcePosition", 0);
        setField(term1337, term1337.getClass(), "jsType", null);
        setField(term1337, term1337.getClass(), "parent", null);
        setField(term1335, term1335.getClass(), "next", term1337);
        setField(term1335, term1335.getClass(), "first", term1339);
        setIntField(term1346, term1346.getClass(), "type", -1537255112);
        setIntField(term1348, term1348.getClass(), "type", 934477462);
        setField(term1348, term1348.getClass(), "next", null);
        setField(term1348, term1348.getClass(), "first", term1342);
        setField(term1348, term1348.getClass(), "last", term1337);
        setField(term1348, term1348.getClass(), "propListHead", null);
        setIntField(term1348, term1348.getClass(), "sourcePosition", 0);
        setField(term1348, term1348.getClass(), "jsType", null);
        setField(term1348, term1348.getClass(), "parent", null);
        setField(term1346, term1346.getClass(), "next", term1348);
        setField(term1346, term1346.getClass(), "first", term1333);
        setField(term1346, term1346.getClass(), "last", term1333);
        setField(term1346, term1346.getClass(), "propListHead", null);
        setIntField(term1346, term1346.getClass(), "sourcePosition", 0);
        setField(term1346, term1346.getClass(), "jsType", null);
        setField(term1346, term1346.getClass(), "parent", null);
        setField(term1335, term1335.getClass(), "last", term1346);
        setField(term1335, term1335.getClass(), "propListHead", null);
        setIntField(term1335, term1335.getClass(), "sourcePosition", 0);
        setField(term1335, term1335.getClass(), "jsType", null);
        setField(term1335, term1335.getClass(), "parent", null);
        setField(term1333, term1333.getClass(), "next", term1335);
        setIntField(term1353, term1353.getClass(), "type", 4900410);
        setField(term1353, term1353.getClass(), "next", term1346);
        setField(term1353, term1353.getClass(), "first", term1348);
        setField(term1353, term1353.getClass(), "last", term1331);
        setField(term1353, term1353.getClass(), "propListHead", null);
        setIntField(term1353, term1353.getClass(), "sourcePosition", 0);
        setField(term1353, term1353.getClass(), "jsType", null);
        setField(term1353, term1353.getClass(), "parent", null);
        setField(term1333, term1333.getClass(), "first", term1353);
        setField(term1333, term1333.getClass(), "last", term1353);
        setField(term1333, term1333.getClass(), "propListHead", null);
        setIntField(term1333, term1333.getClass(), "sourcePosition", 0);
        setField(term1333, term1333.getClass(), "jsType", null);
        setField(term1333, term1333.getClass(), "parent", null);
        setField(term1331, term1331.getClass(), "next", term1333);
        setField(term1331, term1331.getClass(), "first", term1337);
        setField(term1331, term1331.getClass(), "last", term1339);
        setField(term1331, term1331.getClass(), "propListHead", null);
        setIntField(term1331, term1331.getClass(), "sourcePosition", 0);
        setField(term1331, term1331.getClass(), "jsType", null);
        setField(term1331, term1331.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1331;
        try {
            callMethod(klass, "getOpFromAssignmentOp", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


