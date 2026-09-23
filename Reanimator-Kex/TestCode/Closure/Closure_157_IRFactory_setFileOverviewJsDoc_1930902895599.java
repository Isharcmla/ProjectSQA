package com.google.javascript.jscomp.parsing;

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
import static com.google.javascript.jscomp.parsing.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.parsing.EqualityUtils.*;
import java.lang.Object;

public class IRFactory_setFileOverviewJsDoc_1930902895599 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125325;
     Object term125465;
     Object term126110;
     Object term126112;

    public IRFactory_setFileOverviewJsDoc_1930902895599() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term125325 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term125395 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term125395, term125395.getClass(), "propListHead", null);
        setField(term125325, term125325.getClass(), "rootNodeJsDocHolder", term125395);
        term125465 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term125561 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setField(term125465, term125465.getClass(), "propListHead", term125561);
        term126110 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term126111 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term126110, term126110.getClass(), "sourceString", null);
        setField(term126110, term126110.getClass(), "sourceName", null);
        setField(term126110, term126110.getClass(), "config", null);
        setField(term126110, term126110.getClass(), "errorReporter", null);
        setField(term126110, term126110.getClass(), "transformDispatcher", null);
        setField(term126110, term126110.getClass(), "ALLOWED_DIRECTIVES", null);
        setField(term126110, term126110.getClass(), "reservedKeywords", null);
        setIntField(term126111, term126111.getClass(), "type", 0);
        setField(term126111, term126111.getClass(), "next", null);
        setField(term126111, term126111.getClass(), "first", null);
        setField(term126111, term126111.getClass(), "last", null);
        setField(term126111, term126111.getClass(), "propListHead", null);
        setIntField(term126111, term126111.getClass(), "sourcePosition", 0);
        setField(term126111, term126111.getClass(), "jsType", null);
        setField(term126111, term126111.getClass(), "parent", null);
        setField(term126110, term126110.getClass(), "rootNodeJsDocHolder", term126111);
        setField(term126110, term126110.getClass(), "fileLevelJsDocBuilder", null);
        setField(term126110, term126110.getClass(), "fileOverviewInfo", null);
        setField(term126110, term126110.getClass(), "templateNode", null);
        term126112 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term126113 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term126112, term126112.getClass(), "type", 0);
        setField(term126112, term126112.getClass(), "next", null);
        setField(term126112, term126112.getClass(), "first", null);
        setField(term126112, term126112.getClass(), "last", null);
        setField(term126113, term126113.getClass(), "next", null);
        setIntField(term126113, term126113.getClass(), "type", 0);
        setIntField(term126113, term126113.getClass(), "intValue", 0);
        setField(term126113, term126113.getClass(), "objectValue", null);
        setField(term126112, term126112.getClass(), "propListHead", term126113);
        setIntField(term126112, term126112.getClass(), "sourcePosition", 0);
        setField(term126112, term126112.getClass(), "jsType", null);
        setField(term126112, term126112.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term125465;
        callMethod(klass, "setFileOverviewJsDoc", argTypes, term125325, args);
        assertTrue(recursiveEquals(term125325, term126110));
        assertTrue(recursiveEquals(term125465, term126112));
    }

};


