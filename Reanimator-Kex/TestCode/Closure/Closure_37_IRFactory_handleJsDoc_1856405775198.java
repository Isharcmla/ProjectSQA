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

public class IRFactory_handleJsDoc_1856405775198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55684;
     Object term55790;
     Object term55914;
     Object term55915;

    public IRFactory_handleJsDoc_1856405775198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55684 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        term55790 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.WithStatement"));
        Object term55896 = newInstance(Class.forName("com.google.javascript.rhino.head.Node$PropListItem"));
        setField(term55790, term55790.getClass(), "propListHead", term55896);
        term55914 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(term55914, term55914.getClass(), "sourceString", null);
        setField(term55914, term55914.getClass(), "sourceFile", null);
        setField(term55914, term55914.getClass(), "sourceName", null);
        setField(term55914, term55914.getClass(), "config", null);
        setField(term55914, term55914.getClass(), "errorReporter", null);
        setField(term55914, term55914.getClass(), "transformDispatcher", null);
        setField(term55914, term55914.getClass(), "ALLOWED_DIRECTIVES", null);
        setField(term55914, term55914.getClass(), "reservedKeywords", null);
        setField(term55914, term55914.getClass(), "parsedComments", null);
        setField(term55914, term55914.getClass(), "rootNodeJsDocHolder", null);
        setField(term55914, term55914.getClass(), "fileLevelJsDocBuilder", null);
        setField(term55914, term55914.getClass(), "fileOverviewInfo", null);
        setField(term55914, term55914.getClass(), "templateNode", null);
        term55915 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.WithStatement"));
        Object term55916 = newInstance(Class.forName("com.google.javascript.rhino.head.Node$PropListItem"));
        setField(term55915, term55915.getClass(), "expression", null);
        setField(term55915, term55915.getClass(), "statement", null);
        setIntField(term55915, term55915.getClass(), "lp", 0);
        setIntField(term55915, term55915.getClass(), "rp", 0);
        setIntField(term55915, term55915.getClass(), "position", 0);
        setIntField(term55915, term55915.getClass(), "length", 0);
        setField(term55915, term55915.getClass(), "parent", null);
        setIntField(term55915, term55915.getClass(), "type", 0);
        setField(term55915, term55915.getClass(), "next", null);
        setField(term55915, term55915.getClass(), "first", null);
        setField(term55915, term55915.getClass(), "last", null);
        setIntField(term55915, term55915.getClass(), "lineno", 0);
        setField(term55916, term55916.getClass(), "next", null);
        setIntField(term55916, term55916.getClass(), "type", 0);
        setIntField(term55916, term55916.getClass(), "intValue", 0);
        setField(term55916, term55916.getClass(), "objectValue", null);
        setField(term55915, term55915.getClass(), "propListHead", term55916);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term55790;
        args[1] = null;
        Object retValue = callMethod(klass, "handleJsDoc", argTypes, term55684, args);
        assertTrue(recursiveEquals(term55684, term55914));
        assertTrue(recursiveEquals(term55790, term55915));
        assertTrue(recursiveEquals(retValue, null));
    }

};


