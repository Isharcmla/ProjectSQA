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

public class IRFactory_setFileOverviewJsDoc_1930902895395 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68611;
     Object term68943;
     Object term69251;
     Object term69255;

    public IRFactory_setFileOverviewJsDoc_1930902895395() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68611 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term68681 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term68777 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term68873 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term68777, term68777.getClass(), "type", -30);
        setIntField(term68873, term68873.getClass(), "type", 29);
        setField(term68873, term68873.getClass(), "objectValue", null);
        setField(term68777, term68777.getClass(), "next", term68873);
        setField(term68681, term68681.getClass(), "propListHead", term68777);
        setField(term68611, term68611.getClass(), "rootNodeJsDocHolder", term68681);
        term68943 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term69251 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term69252 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term69253 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term69254 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setField(term69251, term69251.getClass(), "sourceString", null);
        setField(term69251, term69251.getClass(), "sourceName", null);
        setField(term69251, term69251.getClass(), "config", null);
        setField(term69251, term69251.getClass(), "errorReporter", null);
        setField(term69251, term69251.getClass(), "transformDispatcher", null);
        setField(term69251, term69251.getClass(), "ALLOWED_DIRECTIVES", null);
        setField(term69251, term69251.getClass(), "reservedKeywords", null);
        setIntField(term69252, term69252.getClass(), "type", 0);
        setField(term69252, term69252.getClass(), "next", null);
        setField(term69252, term69252.getClass(), "first", null);
        setField(term69252, term69252.getClass(), "last", null);
        setField(term69254, term69254.getClass(), "next", null);
        setIntField(term69254, term69254.getClass(), "type", 29);
        setIntField(term69254, term69254.getClass(), "intValue", 0);
        setField(term69254, term69254.getClass(), "objectValue", null);
        setField(term69253, term69253.getClass(), "next", term69254);
        setIntField(term69253, term69253.getClass(), "type", -30);
        setIntField(term69253, term69253.getClass(), "intValue", 0);
        setField(term69253, term69253.getClass(), "objectValue", null);
        setField(term69252, term69252.getClass(), "propListHead", term69253);
        setIntField(term69252, term69252.getClass(), "sourcePosition", 0);
        setField(term69252, term69252.getClass(), "jsType", null);
        setField(term69252, term69252.getClass(), "parent", null);
        setField(term69251, term69251.getClass(), "rootNodeJsDocHolder", term69252);
        setField(term69251, term69251.getClass(), "fileLevelJsDocBuilder", null);
        setField(term69251, term69251.getClass(), "fileOverviewInfo", null);
        setField(term69251, term69251.getClass(), "templateNode", null);
        term69255 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term69255, term69255.getClass(), "type", 0);
        setField(term69255, term69255.getClass(), "next", null);
        setField(term69255, term69255.getClass(), "first", null);
        setField(term69255, term69255.getClass(), "last", null);
        setField(term69255, term69255.getClass(), "propListHead", null);
        setIntField(term69255, term69255.getClass(), "sourcePosition", 0);
        setField(term69255, term69255.getClass(), "jsType", null);
        setField(term69255, term69255.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term68943;
        callMethod(klass, "setFileOverviewJsDoc", argTypes, term68611, args);
        assertTrue(recursiveEquals(term68611, term69251));
        assertTrue(recursiveEquals(term68943, term69255));
    }

};


