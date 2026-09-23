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

public class IRFactory_setFileOverviewJsDoc_1930902895315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35913;
     Object term36229;
     Object term36383;
     Object term36387;

    public IRFactory_setFileOverviewJsDoc_1930902895315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35913 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term35983 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36079 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term36159 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term36079, term36079.getClass(), "type", 29);
        setField(term36079, term36079.getClass(), "objectValue", null);
        setField(term35983, term35983.getClass(), "propListHead", term36079);
        setField(term35913, term35913.getClass(), "rootNodeJsDocHolder", term35983);
        setField(term35913, term35913.getClass(), "fileOverviewInfo", term36159);
        term36229 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36325 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term36325, term36325.getClass(), "type", 29);
        setField(term36325, term36325.getClass(), "next", null);
        setField(term36229, term36229.getClass(), "propListHead", term36325);
        term36383 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term36384 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36385 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term36386 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term36383, term36383.getClass(), "sourceString", null);
        setField(term36383, term36383.getClass(), "sourceName", null);
        setField(term36383, term36383.getClass(), "config", null);
        setField(term36383, term36383.getClass(), "errorReporter", null);
        setField(term36383, term36383.getClass(), "transformDispatcher", null);
        setField(term36383, term36383.getClass(), "ALLOWED_DIRECTIVES", null);
        setIntField(term36384, term36384.getClass(), "type", 0);
        setField(term36384, term36384.getClass(), "next", null);
        setField(term36384, term36384.getClass(), "first", null);
        setField(term36384, term36384.getClass(), "last", null);
        setField(term36385, term36385.getClass(), "next", null);
        setIntField(term36385, term36385.getClass(), "type", 29);
        setIntField(term36385, term36385.getClass(), "intValue", 0);
        setField(term36385, term36385.getClass(), "objectValue", null);
        setField(term36384, term36384.getClass(), "propListHead", term36385);
        setIntField(term36384, term36384.getClass(), "sourcePosition", 0);
        setField(term36384, term36384.getClass(), "jsType", null);
        setField(term36384, term36384.getClass(), "parent", null);
        setField(term36383, term36383.getClass(), "rootNodeJsDocHolder", term36384);
        setField(term36383, term36383.getClass(), "fileLevelJsDocBuilder", null);
        setField(term36386, term36386.getClass(), "info", null);
        setField(term36386, term36386.getClass(), "documentation", null);
        setField(term36386, term36386.getClass(), "sourceName", null);
        setField(term36386, term36386.getClass(), "visibility", null);
        setIntField(term36386, term36386.getClass(), "bitset", 0);
        setField(term36386, term36386.getClass(), "type", null);
        setField(term36386, term36386.getClass(), "thisType", null);
        setBooleanField(term36386, term36386.getClass(), "includeDocumentation", false);
        setField(term36383, term36383.getClass(), "fileOverviewInfo", term36386);
        setField(term36383, term36383.getClass(), "templateNode", null);
        term36387 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36388 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term36389 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term36387, term36387.getClass(), "type", 0);
        setField(term36387, term36387.getClass(), "next", null);
        setField(term36387, term36387.getClass(), "first", null);
        setField(term36387, term36387.getClass(), "last", null);
        setField(term36388, term36388.getClass(), "next", null);
        setIntField(term36388, term36388.getClass(), "type", 29);
        setIntField(term36388, term36388.getClass(), "intValue", 0);
        setField(term36389, term36389.getClass(), "info", null);
        setField(term36389, term36389.getClass(), "documentation", null);
        setField(term36389, term36389.getClass(), "sourceName", null);
        setField(term36389, term36389.getClass(), "visibility", null);
        setIntField(term36389, term36389.getClass(), "bitset", 0);
        setField(term36389, term36389.getClass(), "type", null);
        setField(term36389, term36389.getClass(), "thisType", null);
        setBooleanField(term36389, term36389.getClass(), "includeDocumentation", false);
        setField(term36388, term36388.getClass(), "objectValue", term36389);
        setField(term36387, term36387.getClass(), "propListHead", term36388);
        setIntField(term36387, term36387.getClass(), "sourcePosition", 0);
        setField(term36387, term36387.getClass(), "jsType", null);
        setField(term36387, term36387.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term36229;
        callMethod(klass, "setFileOverviewJsDoc", argTypes, term35913, args);
        assertTrue(recursiveEquals(term35913, term36383));
        assertTrue(recursiveEquals(term36229, term36387));
    }

};


