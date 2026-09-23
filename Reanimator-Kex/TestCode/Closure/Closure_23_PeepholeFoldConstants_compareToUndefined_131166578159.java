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

public class PeepholeFoldConstants_compareToUndefined_131166578159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1339;
     Object term1341;
     Object term1368;

    public PeepholeFoldConstants_compareToUndefined_131166578159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1339 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setBooleanField(term1339, term1339.getClass(), "late", true);
        setField(term1339, term1339.getClass(), "compiler", null);
        term1341 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1343 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1345 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1347 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1349 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1352 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1356 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1358 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1363 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1341, term1341.getClass(), "type", -1840305774);
        setIntField(term1343, term1343.getClass(), "type", 1365087144);
        setIntField(term1345, term1345.getClass(), "type", -1537255112);
        setIntField(term1347, term1347.getClass(), "type", 934477462);
        setIntField(term1349, term1349.getClass(), "type", 4900410);
        setField(term1349, term1349.getClass(), "next", null);
        setField(term1349, term1349.getClass(), "first", null);
        setField(term1349, term1349.getClass(), "last", null);
        setField(term1349, term1349.getClass(), "propListHead", null);
        setIntField(term1349, term1349.getClass(), "sourcePosition", 0);
        setField(term1349, term1349.getClass(), "jsType", null);
        setField(term1349, term1349.getClass(), "parent", null);
        setField(term1347, term1347.getClass(), "next", term1349);
        setIntField(term1352, term1352.getClass(), "type", -1252345779);
        setField(term1352, term1352.getClass(), "next", null);
        setField(term1352, term1352.getClass(), "first", null);
        setField(term1352, term1352.getClass(), "last", term1349);
        setField(term1352, term1352.getClass(), "propListHead", null);
        setIntField(term1352, term1352.getClass(), "sourcePosition", 0);
        setField(term1352, term1352.getClass(), "jsType", null);
        setField(term1352, term1352.getClass(), "parent", null);
        setField(term1347, term1347.getClass(), "first", term1352);
        setField(term1347, term1347.getClass(), "last", term1345);
        setField(term1347, term1347.getClass(), "propListHead", null);
        setIntField(term1347, term1347.getClass(), "sourcePosition", 0);
        setField(term1347, term1347.getClass(), "jsType", null);
        setField(term1347, term1347.getClass(), "parent", null);
        setField(term1345, term1345.getClass(), "next", term1347);
        setField(term1345, term1345.getClass(), "first", term1349);
        setIntField(term1356, term1356.getClass(), "type", 812570053);
        setIntField(term1358, term1358.getClass(), "type", -1488938905);
        setField(term1358, term1358.getClass(), "next", null);
        setField(term1358, term1358.getClass(), "first", term1352);
        setField(term1358, term1358.getClass(), "last", term1347);
        setField(term1358, term1358.getClass(), "propListHead", null);
        setIntField(term1358, term1358.getClass(), "sourcePosition", 0);
        setField(term1358, term1358.getClass(), "jsType", null);
        setField(term1358, term1358.getClass(), "parent", null);
        setField(term1356, term1356.getClass(), "next", term1358);
        setField(term1356, term1356.getClass(), "first", term1343);
        setField(term1356, term1356.getClass(), "last", term1343);
        setField(term1356, term1356.getClass(), "propListHead", null);
        setIntField(term1356, term1356.getClass(), "sourcePosition", 0);
        setField(term1356, term1356.getClass(), "jsType", null);
        setField(term1356, term1356.getClass(), "parent", null);
        setField(term1345, term1345.getClass(), "last", term1356);
        setField(term1345, term1345.getClass(), "propListHead", null);
        setIntField(term1345, term1345.getClass(), "sourcePosition", 0);
        setField(term1345, term1345.getClass(), "jsType", null);
        setField(term1345, term1345.getClass(), "parent", null);
        setField(term1343, term1343.getClass(), "next", term1345);
        setIntField(term1363, term1363.getClass(), "type", 1916544127);
        setField(term1363, term1363.getClass(), "next", term1356);
        setField(term1363, term1363.getClass(), "first", term1358);
        setField(term1363, term1363.getClass(), "last", term1341);
        setField(term1363, term1363.getClass(), "propListHead", null);
        setIntField(term1363, term1363.getClass(), "sourcePosition", 0);
        setField(term1363, term1363.getClass(), "jsType", null);
        setField(term1363, term1363.getClass(), "parent", null);
        setField(term1343, term1343.getClass(), "first", term1363);
        setField(term1343, term1343.getClass(), "last", term1363);
        setField(term1343, term1343.getClass(), "propListHead", null);
        setIntField(term1343, term1343.getClass(), "sourcePosition", 0);
        setField(term1343, term1343.getClass(), "jsType", null);
        setField(term1343, term1343.getClass(), "parent", null);
        setField(term1341, term1341.getClass(), "next", term1343);
        setField(term1341, term1341.getClass(), "first", term1347);
        setField(term1341, term1341.getClass(), "last", term1349);
        setField(term1341, term1341.getClass(), "propListHead", null);
        setIntField(term1341, term1341.getClass(), "sourcePosition", 0);
        setField(term1341, term1341.getClass(), "jsType", null);
        setField(term1341, term1341.getClass(), "parent", null);
        term1368 = new Integer(-1133405894);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term1341;
        args[1] = term1368;
        try {
            callMethod(klass, "compareToUndefined", argTypes, term1339, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


