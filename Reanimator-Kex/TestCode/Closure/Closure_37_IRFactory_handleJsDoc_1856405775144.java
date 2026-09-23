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

public class IRFactory_handleJsDoc_1856405775144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48437;
     Object term48543;
     Object term49055;
     Object term49056;

    public IRFactory_handleJsDoc_1856405775144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48437 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        term48543 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.WithStatement"));
        term49055 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(term49055, term49055.getClass(), "sourceString", null);
        setField(term49055, term49055.getClass(), "sourceFile", null);
        setField(term49055, term49055.getClass(), "sourceName", null);
        setField(term49055, term49055.getClass(), "config", null);
        setField(term49055, term49055.getClass(), "errorReporter", null);
        setField(term49055, term49055.getClass(), "transformDispatcher", null);
        setField(term49055, term49055.getClass(), "ALLOWED_DIRECTIVES", null);
        setField(term49055, term49055.getClass(), "reservedKeywords", null);
        setField(term49055, term49055.getClass(), "parsedComments", null);
        setField(term49055, term49055.getClass(), "rootNodeJsDocHolder", null);
        setField(term49055, term49055.getClass(), "fileLevelJsDocBuilder", null);
        setField(term49055, term49055.getClass(), "fileOverviewInfo", null);
        setField(term49055, term49055.getClass(), "templateNode", null);
        term49056 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.WithStatement"));
        setField(term49056, term49056.getClass(), "expression", null);
        setField(term49056, term49056.getClass(), "statement", null);
        setIntField(term49056, term49056.getClass(), "lp", 0);
        setIntField(term49056, term49056.getClass(), "rp", 0);
        setIntField(term49056, term49056.getClass(), "position", 0);
        setIntField(term49056, term49056.getClass(), "length", 0);
        setField(term49056, term49056.getClass(), "parent", null);
        setIntField(term49056, term49056.getClass(), "type", 0);
        setField(term49056, term49056.getClass(), "next", null);
        setField(term49056, term49056.getClass(), "first", null);
        setField(term49056, term49056.getClass(), "last", null);
        setIntField(term49056, term49056.getClass(), "lineno", 0);
        setField(term49056, term49056.getClass(), "propListHead", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term48543;
        args[1] = null;
        Object retValue = callMethod(klass, "handleJsDoc", argTypes, term48437, args);
        assertTrue(recursiveEquals(term48437, term49055));
        assertTrue(recursiveEquals(term48543, term49056));
        assertTrue(recursiveEquals(retValue, null));
    }

};


