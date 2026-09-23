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

public class IRFactory_setFileOverviewJsDoc_1930902895523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102766;
     Object term103098;
     Object term103625;
     Object term103629;

    public IRFactory_setFileOverviewJsDoc_1930902895523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term102766 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term102836 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term102932 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term103028 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term102932, term102932.getClass(), "type", 0);
        setIntField(term103028, term103028.getClass(), "type", 29);
        setField(term103028, term103028.getClass(), "objectValue", null);
        setField(term102932, term102932.getClass(), "next", term103028);
        setField(term102836, term102836.getClass(), "propListHead", term102932);
        setField(term102766, term102766.getClass(), "rootNodeJsDocHolder", term102836);
        term103098 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term103194 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term103290 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term103194, term103194.getClass(), "type", 0);
        setIntField(term103290, term103290.getClass(), "type", 29);
        setField(term103290, term103290.getClass(), "next", term103290);
        setField(term103194, term103194.getClass(), "next", term103290);
        setField(term103098, term103098.getClass(), "propListHead", term103194);
        term103625 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term103626 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term103627 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term103628 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setField(term103625, term103625.getClass(), "sourceString", null);
        setField(term103625, term103625.getClass(), "sourceName", null);
        setField(term103625, term103625.getClass(), "config", null);
        setField(term103625, term103625.getClass(), "errorReporter", null);
        setField(term103625, term103625.getClass(), "transformDispatcher", null);
        setField(term103625, term103625.getClass(), "ALLOWED_DIRECTIVES", null);
        setField(term103625, term103625.getClass(), "reservedKeywords", null);
        setIntField(term103626, term103626.getClass(), "type", 0);
        setField(term103626, term103626.getClass(), "next", null);
        setField(term103626, term103626.getClass(), "first", null);
        setField(term103626, term103626.getClass(), "last", null);
        setField(term103628, term103628.getClass(), "next", null);
        setIntField(term103628, term103628.getClass(), "type", 29);
        setIntField(term103628, term103628.getClass(), "intValue", 0);
        setField(term103628, term103628.getClass(), "objectValue", null);
        setField(term103627, term103627.getClass(), "next", term103628);
        setIntField(term103627, term103627.getClass(), "type", 0);
        setIntField(term103627, term103627.getClass(), "intValue", 0);
        setField(term103627, term103627.getClass(), "objectValue", null);
        setField(term103626, term103626.getClass(), "propListHead", term103627);
        setIntField(term103626, term103626.getClass(), "sourcePosition", 0);
        setField(term103626, term103626.getClass(), "jsType", null);
        setField(term103626, term103626.getClass(), "parent", null);
        setField(term103625, term103625.getClass(), "rootNodeJsDocHolder", term103626);
        setField(term103625, term103625.getClass(), "fileLevelJsDocBuilder", null);
        setField(term103625, term103625.getClass(), "fileOverviewInfo", null);
        setField(term103625, term103625.getClass(), "templateNode", null);
        term103629 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term103630 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term103631 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term103629, term103629.getClass(), "type", 0);
        setField(term103629, term103629.getClass(), "next", null);
        setField(term103629, term103629.getClass(), "first", null);
        setField(term103629, term103629.getClass(), "last", null);
        setField(term103631, term103631.getClass(), "next", term103631);
        setIntField(term103631, term103631.getClass(), "type", 29);
        setIntField(term103631, term103631.getClass(), "intValue", 0);
        setField(term103631, term103631.getClass(), "objectValue", null);
        setField(term103630, term103630.getClass(), "next", term103631);
        setIntField(term103630, term103630.getClass(), "type", 0);
        setIntField(term103630, term103630.getClass(), "intValue", 0);
        setField(term103630, term103630.getClass(), "objectValue", null);
        setField(term103629, term103629.getClass(), "propListHead", term103630);
        setIntField(term103629, term103629.getClass(), "sourcePosition", 0);
        setField(term103629, term103629.getClass(), "jsType", null);
        setField(term103629, term103629.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term103098;
        callMethod(klass, "setFileOverviewJsDoc", argTypes, term102766, args);
        assertTrue(recursiveEquals(term102766, term103625));
        assertTrue(recursiveEquals(term103098, term103629));
    }

};


