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

public class NodeUtil_isGet_883122773205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1325;
     Object term11879;

    public NodeUtil_isGet_883122773205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1325 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1327 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1329 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1332 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1335 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1338 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1342 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1345 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1348 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1325, term1325.getClass(), "type", -1220630391);
        setIntField(term1327, term1327.getClass(), "type", 40571662);
        setIntField(term1329, term1329.getClass(), "type", 0);
        setField(term1329, term1329.getClass(), "next", null);
        setField(term1329, term1329.getClass(), "first", null);
        setField(term1329, term1329.getClass(), "last", null);
        setField(term1329, term1329.getClass(), "propListHead", null);
        setIntField(term1329, term1329.getClass(), "sourcePosition", 0);
        setField(term1329, term1329.getClass(), "jsType", null);
        setField(term1329, term1329.getClass(), "parent", null);
        setField(term1327, term1327.getClass(), "next", term1329);
        setIntField(term1332, term1332.getClass(), "type", 0);
        setField(term1332, term1332.getClass(), "next", null);
        setField(term1332, term1332.getClass(), "first", null);
        setField(term1332, term1332.getClass(), "last", null);
        setField(term1332, term1332.getClass(), "propListHead", null);
        setIntField(term1332, term1332.getClass(), "sourcePosition", 0);
        setField(term1332, term1332.getClass(), "jsType", null);
        setField(term1332, term1332.getClass(), "parent", null);
        setField(term1327, term1327.getClass(), "first", term1332);
        setIntField(term1335, term1335.getClass(), "type", 0);
        setField(term1335, term1335.getClass(), "next", null);
        setField(term1335, term1335.getClass(), "first", null);
        setField(term1335, term1335.getClass(), "last", null);
        setField(term1335, term1335.getClass(), "propListHead", null);
        setIntField(term1335, term1335.getClass(), "sourcePosition", 0);
        setField(term1335, term1335.getClass(), "jsType", null);
        setField(term1335, term1335.getClass(), "parent", null);
        setField(term1327, term1327.getClass(), "last", term1335);
        setField(term1338, term1338.getClass(), "next", null);
        setIntField(term1338, term1338.getClass(), "type", 0);
        setIntField(term1338, term1338.getClass(), "intValue", 0);
        setField(term1338, term1338.getClass(), "objectValue", null);
        setField(term1327, term1327.getClass(), "propListHead", term1338);
        setIntField(term1327, term1327.getClass(), "sourcePosition", 279384872);
        setField(term1327, term1327.getClass(), "jsType", null);
        setField(term1327, term1327.getClass(), "parent", null);
        setField(term1325, term1325.getClass(), "next", term1327);
        setIntField(term1342, term1342.getClass(), "type", 0);
        setField(term1342, term1342.getClass(), "next", null);
        setField(term1342, term1342.getClass(), "first", null);
        setField(term1342, term1342.getClass(), "last", null);
        setField(term1342, term1342.getClass(), "propListHead", null);
        setIntField(term1342, term1342.getClass(), "sourcePosition", 0);
        setField(term1342, term1342.getClass(), "jsType", null);
        setField(term1342, term1342.getClass(), "parent", null);
        setField(term1325, term1325.getClass(), "first", term1342);
        setIntField(term1345, term1345.getClass(), "type", 0);
        setField(term1345, term1345.getClass(), "next", null);
        setField(term1345, term1345.getClass(), "first", null);
        setField(term1345, term1345.getClass(), "last", null);
        setField(term1345, term1345.getClass(), "propListHead", null);
        setIntField(term1345, term1345.getClass(), "sourcePosition", 0);
        setField(term1345, term1345.getClass(), "jsType", null);
        setField(term1345, term1345.getClass(), "parent", null);
        setField(term1325, term1325.getClass(), "last", term1345);
        setField(term1348, term1348.getClass(), "next", null);
        setIntField(term1348, term1348.getClass(), "type", 0);
        setIntField(term1348, term1348.getClass(), "intValue", 0);
        setField(term1348, term1348.getClass(), "objectValue", null);
        setField(term1325, term1325.getClass(), "propListHead", term1348);
        setIntField(term1325, term1325.getClass(), "sourcePosition", 1427305953);
        setField(term1325, term1325.getClass(), "jsType", null);
        setField(term1325, term1325.getClass(), "parent", null);
        term11879 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11880 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11881 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11882 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11883 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11884 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term11885 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11886 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11887 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term11879, term11879.getClass(), "type", -1220630391);
        setIntField(term11880, term11880.getClass(), "type", 40571662);
        setIntField(term11881, term11881.getClass(), "type", 0);
        setField(term11881, term11881.getClass(), "next", null);
        setField(term11881, term11881.getClass(), "first", null);
        setField(term11881, term11881.getClass(), "last", null);
        setField(term11881, term11881.getClass(), "propListHead", null);
        setIntField(term11881, term11881.getClass(), "sourcePosition", 0);
        setField(term11881, term11881.getClass(), "jsType", null);
        setField(term11881, term11881.getClass(), "parent", null);
        setField(term11880, term11880.getClass(), "next", term11881);
        setIntField(term11882, term11882.getClass(), "type", 0);
        setField(term11882, term11882.getClass(), "next", null);
        setField(term11882, term11882.getClass(), "first", null);
        setField(term11882, term11882.getClass(), "last", null);
        setField(term11882, term11882.getClass(), "propListHead", null);
        setIntField(term11882, term11882.getClass(), "sourcePosition", 0);
        setField(term11882, term11882.getClass(), "jsType", null);
        setField(term11882, term11882.getClass(), "parent", null);
        setField(term11880, term11880.getClass(), "first", term11882);
        setIntField(term11883, term11883.getClass(), "type", 0);
        setField(term11883, term11883.getClass(), "next", null);
        setField(term11883, term11883.getClass(), "first", null);
        setField(term11883, term11883.getClass(), "last", null);
        setField(term11883, term11883.getClass(), "propListHead", null);
        setIntField(term11883, term11883.getClass(), "sourcePosition", 0);
        setField(term11883, term11883.getClass(), "jsType", null);
        setField(term11883, term11883.getClass(), "parent", null);
        setField(term11880, term11880.getClass(), "last", term11883);
        setField(term11884, term11884.getClass(), "next", null);
        setIntField(term11884, term11884.getClass(), "type", 0);
        setIntField(term11884, term11884.getClass(), "intValue", 0);
        setField(term11884, term11884.getClass(), "objectValue", null);
        setField(term11880, term11880.getClass(), "propListHead", term11884);
        setIntField(term11880, term11880.getClass(), "sourcePosition", 279384872);
        setField(term11880, term11880.getClass(), "jsType", null);
        setField(term11880, term11880.getClass(), "parent", null);
        setField(term11879, term11879.getClass(), "next", term11880);
        setIntField(term11885, term11885.getClass(), "type", 0);
        setField(term11885, term11885.getClass(), "next", null);
        setField(term11885, term11885.getClass(), "first", null);
        setField(term11885, term11885.getClass(), "last", null);
        setField(term11885, term11885.getClass(), "propListHead", null);
        setIntField(term11885, term11885.getClass(), "sourcePosition", 0);
        setField(term11885, term11885.getClass(), "jsType", null);
        setField(term11885, term11885.getClass(), "parent", null);
        setField(term11879, term11879.getClass(), "first", term11885);
        setIntField(term11886, term11886.getClass(), "type", 0);
        setField(term11886, term11886.getClass(), "next", null);
        setField(term11886, term11886.getClass(), "first", null);
        setField(term11886, term11886.getClass(), "last", null);
        setField(term11886, term11886.getClass(), "propListHead", null);
        setIntField(term11886, term11886.getClass(), "sourcePosition", 0);
        setField(term11886, term11886.getClass(), "jsType", null);
        setField(term11886, term11886.getClass(), "parent", null);
        setField(term11879, term11879.getClass(), "last", term11886);
        setField(term11887, term11887.getClass(), "next", null);
        setIntField(term11887, term11887.getClass(), "type", 0);
        setIntField(term11887, term11887.getClass(), "intValue", 0);
        setField(term11887, term11887.getClass(), "objectValue", null);
        setField(term11879, term11879.getClass(), "propListHead", term11887);
        setIntField(term11879, term11879.getClass(), "sourcePosition", 1427305953);
        setField(term11879, term11879.getClass(), "jsType", null);
        setField(term11879, term11879.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1325;
        Object retValue = callMethod(klass, "isGet", argTypes, null, args);
        assertTrue(recursiveEquals(term1325, term11879));
        assertTrue(recursiveEquals(retValue, false));
    }

};


