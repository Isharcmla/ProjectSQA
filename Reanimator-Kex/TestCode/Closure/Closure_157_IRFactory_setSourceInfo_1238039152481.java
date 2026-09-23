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

public class IRFactory_setSourceInfo_1238039152481 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90458;
     Object term90528;
     Object term90857;
     Object term90858;

    public IRFactory_setSourceInfo_1238039152481() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90458 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        term90528 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term90528, term90528.getClass(), "type", 105);
        setField(term90528, term90528.getClass(), "first", term90528);
        term90857 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(term90857, term90857.getClass(), "sourceString", null);
        setField(term90857, term90857.getClass(), "sourceName", null);
        setField(term90857, term90857.getClass(), "config", null);
        setField(term90857, term90857.getClass(), "errorReporter", null);
        setField(term90857, term90857.getClass(), "transformDispatcher", null);
        setField(term90857, term90857.getClass(), "ALLOWED_DIRECTIVES", null);
        setField(term90857, term90857.getClass(), "reservedKeywords", null);
        setField(term90857, term90857.getClass(), "rootNodeJsDocHolder", null);
        setField(term90857, term90857.getClass(), "fileLevelJsDocBuilder", null);
        setField(term90857, term90857.getClass(), "fileOverviewInfo", null);
        setField(term90857, term90857.getClass(), "templateNode", null);
        term90858 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term90858, term90858.getClass(), "type", 105);
        setField(term90858, term90858.getClass(), "next", null);
        setField(term90858, term90858.getClass(), "first", term90858);
        setField(term90858, term90858.getClass(), "last", null);
        setField(term90858, term90858.getClass(), "propListHead", null);
        setIntField(term90858, term90858.getClass(), "sourcePosition", 0);
        setField(term90858, term90858.getClass(), "jsType", null);
        setField(term90858, term90858.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Object[] args = new Object[2];
        args[0] = term90528;
        args[1] = null;
        callMethod(klass, "setSourceInfo", argTypes, term90458, args);
        assertTrue(recursiveEquals(term90458, term90857));
        assertTrue(recursiveEquals(term90528, term90858));
    }

};


