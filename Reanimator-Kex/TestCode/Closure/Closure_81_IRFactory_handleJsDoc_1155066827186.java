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

public class IRFactory_handleJsDoc_1155066827186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23909;
     Object term24043;
     Object term24059;
     Object term24060;

    public IRFactory_handleJsDoc_1155066827186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23909 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        term24043 = newInstance(Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.ContinueStatement"));
        term24059 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(term24059, term24059.getClass(), "sourceString", null);
        setField(term24059, term24059.getClass(), "sourceName", null);
        setField(term24059, term24059.getClass(), "config", null);
        setField(term24059, term24059.getClass(), "errorReporter", null);
        setField(term24059, term24059.getClass(), "transformDispatcher", null);
        setField(term24059, term24059.getClass(), "ALLOWED_DIRECTIVES", null);
        setField(term24059, term24059.getClass(), "rootNodeJsDocHolder", null);
        setField(term24059, term24059.getClass(), "fileLevelJsDocBuilder", null);
        setField(term24059, term24059.getClass(), "fileOverviewInfo", null);
        setField(term24059, term24059.getClass(), "templateNode", null);
        term24060 = newInstance(Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.ContinueStatement"));
        setField(term24060, term24060.getClass(), "label", null);
        setField(term24060, term24060.getClass(), "target", null);
        setField(term24060, term24060.getClass(), "target", null);
        setField(term24060, term24060.getClass(), "target2", null);
        setField(term24060, term24060.getClass(), "jumpNode", null);
        setIntField(term24060, term24060.getClass(), "position", 0);
        setIntField(term24060, term24060.getClass(), "length", 0);
        setField(term24060, term24060.getClass(), "parent", null);
        setIntField(term24060, term24060.getClass(), "type", 0);
        setField(term24060, term24060.getClass(), "next", null);
        setField(term24060, term24060.getClass(), "first", null);
        setField(term24060, term24060.getClass(), "last", null);
        setIntField(term24060, term24060.getClass(), "lineno", 0);
        setField(term24060, term24060.getClass(), "propListHead", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Object[] args = new Object[1];
        args[0] = term24043;
        Object retValue = callMethod(klass, "handleJsDoc", argTypes, term23909, args);
        assertTrue(recursiveEquals(term23909, term24059));
        assertTrue(recursiveEquals(term24043, term24060));
        assertTrue(recursiveEquals(retValue, null));
    }

};


