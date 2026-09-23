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

public class PeepholeSubstituteAlternateSyntax_tryMinimizeStringArrayLiteral_54653093990 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1322;
     Object term1325;

    public PeepholeSubstituteAlternateSyntax_tryMinimizeStringArrayLiteral_54653093990() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1322 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term1322, term1322.getClass(), "late", true);
        setIntField(term1322, term1322.getClass(), "STRING_SPLIT_OVERHEAD", -197820800);
        setField(term1322, term1322.getClass(), "compiler", null);
        term1325 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1327 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1329 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1331 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1333 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1336 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1340 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1342 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1347 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1325, term1325.getClass(), "type", 723812297);
        setIntField(term1327, term1327.getClass(), "type", 1639448749);
        setIntField(term1329, term1329.getClass(), "type", 873659088);
        setIntField(term1331, term1331.getClass(), "type", -975748721);
        setIntField(term1333, term1333.getClass(), "type", 433248783);
        setField(term1333, term1333.getClass(), "next", null);
        setField(term1333, term1333.getClass(), "first", null);
        setField(term1333, term1333.getClass(), "last", null);
        setField(term1333, term1333.getClass(), "propListHead", null);
        setIntField(term1333, term1333.getClass(), "sourcePosition", 0);
        setField(term1333, term1333.getClass(), "jsType", null);
        setField(term1333, term1333.getClass(), "parent", null);
        setField(term1331, term1331.getClass(), "next", term1333);
        setIntField(term1336, term1336.getClass(), "type", -507944154);
        setField(term1336, term1336.getClass(), "next", null);
        setField(term1336, term1336.getClass(), "first", null);
        setField(term1336, term1336.getClass(), "last", term1333);
        setField(term1336, term1336.getClass(), "propListHead", null);
        setIntField(term1336, term1336.getClass(), "sourcePosition", 0);
        setField(term1336, term1336.getClass(), "jsType", null);
        setField(term1336, term1336.getClass(), "parent", null);
        setField(term1331, term1331.getClass(), "first", term1336);
        setField(term1331, term1331.getClass(), "last", term1329);
        setField(term1331, term1331.getClass(), "propListHead", null);
        setIntField(term1331, term1331.getClass(), "sourcePosition", 0);
        setField(term1331, term1331.getClass(), "jsType", null);
        setField(term1331, term1331.getClass(), "parent", null);
        setField(term1329, term1329.getClass(), "next", term1331);
        setField(term1329, term1329.getClass(), "first", term1333);
        setIntField(term1340, term1340.getClass(), "type", 897010381);
        setIntField(term1342, term1342.getClass(), "type", -15712667);
        setField(term1342, term1342.getClass(), "next", null);
        setField(term1342, term1342.getClass(), "first", term1336);
        setField(term1342, term1342.getClass(), "last", term1331);
        setField(term1342, term1342.getClass(), "propListHead", null);
        setIntField(term1342, term1342.getClass(), "sourcePosition", 0);
        setField(term1342, term1342.getClass(), "jsType", null);
        setField(term1342, term1342.getClass(), "parent", null);
        setField(term1340, term1340.getClass(), "next", term1342);
        setField(term1340, term1340.getClass(), "first", term1327);
        setField(term1340, term1340.getClass(), "last", term1327);
        setField(term1340, term1340.getClass(), "propListHead", null);
        setIntField(term1340, term1340.getClass(), "sourcePosition", 0);
        setField(term1340, term1340.getClass(), "jsType", null);
        setField(term1340, term1340.getClass(), "parent", null);
        setField(term1329, term1329.getClass(), "last", term1340);
        setField(term1329, term1329.getClass(), "propListHead", null);
        setIntField(term1329, term1329.getClass(), "sourcePosition", 0);
        setField(term1329, term1329.getClass(), "jsType", null);
        setField(term1329, term1329.getClass(), "parent", null);
        setField(term1327, term1327.getClass(), "next", term1329);
        setIntField(term1347, term1347.getClass(), "type", 1964967720);
        setField(term1347, term1347.getClass(), "next", term1340);
        setField(term1347, term1347.getClass(), "first", term1342);
        setField(term1347, term1347.getClass(), "last", term1325);
        setField(term1347, term1347.getClass(), "propListHead", null);
        setIntField(term1347, term1347.getClass(), "sourcePosition", 0);
        setField(term1347, term1347.getClass(), "jsType", null);
        setField(term1347, term1347.getClass(), "parent", null);
        setField(term1327, term1327.getClass(), "first", term1347);
        setField(term1327, term1327.getClass(), "last", term1347);
        setField(term1327, term1327.getClass(), "propListHead", null);
        setIntField(term1327, term1327.getClass(), "sourcePosition", 0);
        setField(term1327, term1327.getClass(), "jsType", null);
        setField(term1327, term1327.getClass(), "parent", null);
        setField(term1325, term1325.getClass(), "next", term1327);
        setField(term1325, term1325.getClass(), "first", term1331);
        setField(term1325, term1325.getClass(), "last", term1333);
        setField(term1325, term1325.getClass(), "propListHead", null);
        setIntField(term1325, term1325.getClass(), "sourcePosition", 0);
        setField(term1325, term1325.getClass(), "jsType", null);
        setField(term1325, term1325.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1325;
        try {
            callMethod(klass, "tryMinimizeStringArrayLiteral", argTypes, term1322, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


