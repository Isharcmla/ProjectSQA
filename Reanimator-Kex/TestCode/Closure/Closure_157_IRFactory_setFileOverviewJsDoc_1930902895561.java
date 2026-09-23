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

public class IRFactory_setFileOverviewJsDoc_1930902895561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113654;
     Object term114066;
     Object term114621;
     Object term114626;

    public IRFactory_setFileOverviewJsDoc_1930902895561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term113654 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term113724 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term113820 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term113916 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term113996 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term113820, term113820.getClass(), "type", 0);
        setIntField(term113916, term113916.getClass(), "type", 29);
        setField(term113916, term113916.getClass(), "objectValue", null);
        setField(term113820, term113820.getClass(), "next", term113916);
        setField(term113724, term113724.getClass(), "propListHead", term113820);
        setField(term113654, term113654.getClass(), "rootNodeJsDocHolder", term113724);
        setField(term113654, term113654.getClass(), "fileOverviewInfo", term113996);
        term114066 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term114162 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term114258 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term114162, term114162.getClass(), "type", 0);
        setIntField(term114258, term114258.getClass(), "type", 29);
        setField(term114258, term114258.getClass(), "next", term114258);
        setField(term114162, term114162.getClass(), "next", term114258);
        setField(term114066, term114066.getClass(), "propListHead", term114162);
        term114621 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term114622 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term114623 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term114624 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term114625 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term114621, term114621.getClass(), "sourceString", null);
        setField(term114621, term114621.getClass(), "sourceName", null);
        setField(term114621, term114621.getClass(), "config", null);
        setField(term114621, term114621.getClass(), "errorReporter", null);
        setField(term114621, term114621.getClass(), "transformDispatcher", null);
        setField(term114621, term114621.getClass(), "ALLOWED_DIRECTIVES", null);
        setField(term114621, term114621.getClass(), "reservedKeywords", null);
        setIntField(term114622, term114622.getClass(), "type", 0);
        setField(term114622, term114622.getClass(), "next", null);
        setField(term114622, term114622.getClass(), "first", null);
        setField(term114622, term114622.getClass(), "last", null);
        setField(term114624, term114624.getClass(), "next", null);
        setIntField(term114624, term114624.getClass(), "type", 29);
        setIntField(term114624, term114624.getClass(), "intValue", 0);
        setField(term114624, term114624.getClass(), "objectValue", null);
        setField(term114623, term114623.getClass(), "next", term114624);
        setIntField(term114623, term114623.getClass(), "type", 0);
        setIntField(term114623, term114623.getClass(), "intValue", 0);
        setField(term114623, term114623.getClass(), "objectValue", null);
        setField(term114622, term114622.getClass(), "propListHead", term114623);
        setIntField(term114622, term114622.getClass(), "sourcePosition", 0);
        setField(term114622, term114622.getClass(), "jsType", null);
        setField(term114622, term114622.getClass(), "parent", null);
        setField(term114621, term114621.getClass(), "rootNodeJsDocHolder", term114622);
        setField(term114621, term114621.getClass(), "fileLevelJsDocBuilder", null);
        setField(term114625, term114625.getClass(), "info", null);
        setField(term114625, term114625.getClass(), "documentation", null);
        setField(term114625, term114625.getClass(), "sourceName", null);
        setField(term114625, term114625.getClass(), "visibility", null);
        setIntField(term114625, term114625.getClass(), "bitset", 0);
        setField(term114625, term114625.getClass(), "type", null);
        setField(term114625, term114625.getClass(), "thisType", null);
        setBooleanField(term114625, term114625.getClass(), "includeDocumentation", false);
        setField(term114621, term114621.getClass(), "fileOverviewInfo", term114625);
        setField(term114621, term114621.getClass(), "templateNode", null);
        term114626 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term114627 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term114628 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term114629 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term114630 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term114626, term114626.getClass(), "type", 0);
        setField(term114626, term114626.getClass(), "next", null);
        setField(term114626, term114626.getClass(), "first", null);
        setField(term114626, term114626.getClass(), "last", null);
        setField(term114629, term114629.getClass(), "next", term114629);
        setIntField(term114629, term114629.getClass(), "type", 29);
        setIntField(term114629, term114629.getClass(), "intValue", 0);
        setField(term114629, term114629.getClass(), "objectValue", null);
        setField(term114628, term114628.getClass(), "next", term114629);
        setIntField(term114628, term114628.getClass(), "type", 0);
        setIntField(term114628, term114628.getClass(), "intValue", 0);
        setField(term114628, term114628.getClass(), "objectValue", null);
        setField(term114627, term114627.getClass(), "next", term114628);
        setIntField(term114627, term114627.getClass(), "type", 29);
        setIntField(term114627, term114627.getClass(), "intValue", 0);
        setField(term114630, term114630.getClass(), "info", null);
        setField(term114630, term114630.getClass(), "documentation", null);
        setField(term114630, term114630.getClass(), "sourceName", null);
        setField(term114630, term114630.getClass(), "visibility", null);
        setIntField(term114630, term114630.getClass(), "bitset", 0);
        setField(term114630, term114630.getClass(), "type", null);
        setField(term114630, term114630.getClass(), "thisType", null);
        setBooleanField(term114630, term114630.getClass(), "includeDocumentation", false);
        setField(term114627, term114627.getClass(), "objectValue", term114630);
        setField(term114626, term114626.getClass(), "propListHead", term114627);
        setIntField(term114626, term114626.getClass(), "sourcePosition", 0);
        setField(term114626, term114626.getClass(), "jsType", null);
        setField(term114626, term114626.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term114066;
        callMethod(klass, "setFileOverviewJsDoc", argTypes, term113654, args);
        assertTrue(recursiveEquals(term113654, term114621));
        assertTrue(recursiveEquals(term114066, term114626));
    }

};


