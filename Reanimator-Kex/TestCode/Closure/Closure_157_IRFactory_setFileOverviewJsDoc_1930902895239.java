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

public class IRFactory_setFileOverviewJsDoc_1930902895239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42781;
     Object term43113;
     Object term43165;
     Object term43169;

    public IRFactory_setFileOverviewJsDoc_1930902895239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42781 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term42851 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term42947 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term43043 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term42947, term42947.getClass(), "type", 0);
        setIntField(term43043, term43043.getClass(), "type", 0);
        setField(term43043, term43043.getClass(), "next", null);
        setField(term42947, term42947.getClass(), "next", term43043);
        setField(term42851, term42851.getClass(), "propListHead", term42947);
        setField(term42781, term42781.getClass(), "rootNodeJsDocHolder", term42851);
        term43113 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term43165 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term43166 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term43167 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term43168 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setField(term43165, term43165.getClass(), "sourceString", null);
        setField(term43165, term43165.getClass(), "sourceName", null);
        setField(term43165, term43165.getClass(), "config", null);
        setField(term43165, term43165.getClass(), "errorReporter", null);
        setField(term43165, term43165.getClass(), "transformDispatcher", null);
        setField(term43165, term43165.getClass(), "ALLOWED_DIRECTIVES", null);
        setField(term43165, term43165.getClass(), "reservedKeywords", null);
        setIntField(term43166, term43166.getClass(), "type", 0);
        setField(term43166, term43166.getClass(), "next", null);
        setField(term43166, term43166.getClass(), "first", null);
        setField(term43166, term43166.getClass(), "last", null);
        setField(term43168, term43168.getClass(), "next", null);
        setIntField(term43168, term43168.getClass(), "type", 0);
        setIntField(term43168, term43168.getClass(), "intValue", 0);
        setField(term43168, term43168.getClass(), "objectValue", null);
        setField(term43167, term43167.getClass(), "next", term43168);
        setIntField(term43167, term43167.getClass(), "type", 0);
        setIntField(term43167, term43167.getClass(), "intValue", 0);
        setField(term43167, term43167.getClass(), "objectValue", null);
        setField(term43166, term43166.getClass(), "propListHead", term43167);
        setIntField(term43166, term43166.getClass(), "sourcePosition", 0);
        setField(term43166, term43166.getClass(), "jsType", null);
        setField(term43166, term43166.getClass(), "parent", null);
        setField(term43165, term43165.getClass(), "rootNodeJsDocHolder", term43166);
        setField(term43165, term43165.getClass(), "fileLevelJsDocBuilder", null);
        setField(term43165, term43165.getClass(), "fileOverviewInfo", null);
        setField(term43165, term43165.getClass(), "templateNode", null);
        term43169 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term43169, term43169.getClass(), "type", 0);
        setField(term43169, term43169.getClass(), "next", null);
        setField(term43169, term43169.getClass(), "first", null);
        setField(term43169, term43169.getClass(), "last", null);
        setField(term43169, term43169.getClass(), "propListHead", null);
        setIntField(term43169, term43169.getClass(), "sourcePosition", 0);
        setField(term43169, term43169.getClass(), "jsType", null);
        setField(term43169, term43169.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term43113;
        callMethod(klass, "setFileOverviewJsDoc", argTypes, term42781, args);
        assertTrue(recursiveEquals(term42781, term43165));
        assertTrue(recursiveEquals(term43113, term43169));
    }

};


