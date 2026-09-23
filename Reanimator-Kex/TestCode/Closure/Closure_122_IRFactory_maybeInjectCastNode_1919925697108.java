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

public class IRFactory_maybeInjectCastNode_1919925697108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61264;
     Object term61364;
     Object term61373;
     Object term61374;

    public IRFactory_maybeInjectCastNode_1919925697108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61264 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        term61364 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.SwitchCase"));
        term61373 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(term61373, term61373.getClass(), "sourceString", null);
        setField(term61373, term61373.getClass(), "sourceFile", null);
        setField(term61373, term61373.getClass(), "sourceName", null);
        setField(term61373, term61373.getClass(), "config", null);
        setField(term61373, term61373.getClass(), "errorReporter", null);
        setField(term61373, term61373.getClass(), "transformDispatcher", null);
        setField(term61373, term61373.getClass(), "reservedKeywords", null);
        setField(term61373, term61373.getClass(), "parsedComments", null);
        setField(term61373, term61373.getClass(), "rootNodeJsDocHolder", null);
        setField(term61373, term61373.getClass(), "fileLevelJsDocBuilder", null);
        setField(term61373, term61373.getClass(), "fileOverviewInfo", null);
        setField(term61373, term61373.getClass(), "templateNode", null);
        term61374 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.SwitchCase"));
        setField(term61374, term61374.getClass(), "expression", null);
        setField(term61374, term61374.getClass(), "statements", null);
        setIntField(term61374, term61374.getClass(), "position", 0);
        setIntField(term61374, term61374.getClass(), "length", 0);
        setField(term61374, term61374.getClass(), "parent", null);
        setIntField(term61374, term61374.getClass(), "type", 0);
        setField(term61374, term61374.getClass(), "next", null);
        setField(term61374, term61374.getClass(), "first", null);
        setField(term61374, term61374.getClass(), "last", null);
        setIntField(term61374, term61374.getClass(), "lineno", 0);
        setField(term61374, term61374.getClass(), "propListHead", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term61364;
        args[1] = null;
        args[2] = null;
        Object retValue = callMethod(klass, "maybeInjectCastNode", argTypes, term61264, args);
        assertTrue(recursiveEquals(term61264, term61373));
        assertTrue(recursiveEquals(term61364, term61374));
        assertTrue(recursiveEquals(retValue, null));
    }

};


