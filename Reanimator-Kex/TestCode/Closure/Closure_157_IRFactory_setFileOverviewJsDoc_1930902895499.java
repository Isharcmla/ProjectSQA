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

public class IRFactory_setFileOverviewJsDoc_1930902895499 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95616;
     Object term96028;
     Object term96364;
     Object term96369;

    public IRFactory_setFileOverviewJsDoc_1930902895499() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term95616 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term95686 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term95782 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term95878 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term96260 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term95782, term95782.getClass(), "type", 0);
        setIntField(term95878, term95878.getClass(), "type", 29);
        setField(term95878, term95878.getClass(), "objectValue", null);
        setField(term95782, term95782.getClass(), "next", term95878);
        setField(term95686, term95686.getClass(), "propListHead", term95782);
        setField(term95616, term95616.getClass(), "rootNodeJsDocHolder", term95686);
        setField(term95616, term95616.getClass(), "fileOverviewInfo", term96260);
        term96028 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term96124 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term96220 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term96124, term96124.getClass(), "type", 0);
        setIntField(term96220, term96220.getClass(), "type", 29);
        setField(term96220, term96220.getClass(), "next", null);
        setField(term96124, term96124.getClass(), "next", term96220);
        setIntField(term96124, term96124.getClass(), "intValue", 0);
        setField(term96124, term96124.getClass(), "objectValue", term96260);
        setField(term96028, term96028.getClass(), "propListHead", term96124);
        term96364 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term96365 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term96366 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term96367 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term96368 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term96364, term96364.getClass(), "sourceString", null);
        setField(term96364, term96364.getClass(), "sourceName", null);
        setField(term96364, term96364.getClass(), "config", null);
        setField(term96364, term96364.getClass(), "errorReporter", null);
        setField(term96364, term96364.getClass(), "transformDispatcher", null);
        setField(term96364, term96364.getClass(), "ALLOWED_DIRECTIVES", null);
        setField(term96364, term96364.getClass(), "reservedKeywords", null);
        setIntField(term96365, term96365.getClass(), "type", 0);
        setField(term96365, term96365.getClass(), "next", null);
        setField(term96365, term96365.getClass(), "first", null);
        setField(term96365, term96365.getClass(), "last", null);
        setField(term96367, term96367.getClass(), "next", null);
        setIntField(term96367, term96367.getClass(), "type", 29);
        setIntField(term96367, term96367.getClass(), "intValue", 0);
        setField(term96367, term96367.getClass(), "objectValue", null);
        setField(term96366, term96366.getClass(), "next", term96367);
        setIntField(term96366, term96366.getClass(), "type", 0);
        setIntField(term96366, term96366.getClass(), "intValue", 0);
        setField(term96366, term96366.getClass(), "objectValue", null);
        setField(term96365, term96365.getClass(), "propListHead", term96366);
        setIntField(term96365, term96365.getClass(), "sourcePosition", 0);
        setField(term96365, term96365.getClass(), "jsType", null);
        setField(term96365, term96365.getClass(), "parent", null);
        setField(term96364, term96364.getClass(), "rootNodeJsDocHolder", term96365);
        setField(term96364, term96364.getClass(), "fileLevelJsDocBuilder", null);
        setField(term96368, term96368.getClass(), "info", null);
        setField(term96368, term96368.getClass(), "documentation", null);
        setField(term96368, term96368.getClass(), "sourceName", null);
        setField(term96368, term96368.getClass(), "visibility", null);
        setIntField(term96368, term96368.getClass(), "bitset", 0);
        setField(term96368, term96368.getClass(), "type", null);
        setField(term96368, term96368.getClass(), "thisType", null);
        setBooleanField(term96368, term96368.getClass(), "includeDocumentation", false);
        setField(term96364, term96364.getClass(), "fileOverviewInfo", term96368);
        setField(term96364, term96364.getClass(), "templateNode", null);
        term96369 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term96370 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term96371 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term96372 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term96369, term96369.getClass(), "type", 0);
        setField(term96369, term96369.getClass(), "next", null);
        setField(term96369, term96369.getClass(), "first", null);
        setField(term96369, term96369.getClass(), "last", null);
        setField(term96371, term96371.getClass(), "next", null);
        setIntField(term96371, term96371.getClass(), "type", 0);
        setIntField(term96371, term96371.getClass(), "intValue", 0);
        setField(term96372, term96372.getClass(), "info", null);
        setField(term96372, term96372.getClass(), "documentation", null);
        setField(term96372, term96372.getClass(), "sourceName", null);
        setField(term96372, term96372.getClass(), "visibility", null);
        setIntField(term96372, term96372.getClass(), "bitset", 0);
        setField(term96372, term96372.getClass(), "type", null);
        setField(term96372, term96372.getClass(), "thisType", null);
        setBooleanField(term96372, term96372.getClass(), "includeDocumentation", false);
        setField(term96371, term96371.getClass(), "objectValue", term96372);
        setField(term96370, term96370.getClass(), "next", term96371);
        setIntField(term96370, term96370.getClass(), "type", 29);
        setIntField(term96370, term96370.getClass(), "intValue", 0);
        setField(term96370, term96370.getClass(), "objectValue", term96372);
        setField(term96369, term96369.getClass(), "propListHead", term96370);
        setIntField(term96369, term96369.getClass(), "sourcePosition", 0);
        setField(term96369, term96369.getClass(), "jsType", null);
        setField(term96369, term96369.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term96028;
        callMethod(klass, "setFileOverviewJsDoc", argTypes, term95616, args);
        assertTrue(recursiveEquals(term95616, term96364));
        assertTrue(recursiveEquals(term96028, term96369));
    }

};


