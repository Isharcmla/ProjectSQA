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

public class IRFactory_handleBlockComment_510063534157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71692;
     Object term71786;
     Object term72468;
     Object term72469;

    public IRFactory_handleBlockComment_510063534157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71692 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        term71786 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.Comment"));
        setField(term71786, term71786.getClass(), "value", "");
        term72468 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(term72468, term72468.getClass(), "sourceString", null);
        setField(term72468, term72468.getClass(), "sourceFile", null);
        setField(term72468, term72468.getClass(), "sourceName", null);
        setField(term72468, term72468.getClass(), "config", null);
        setField(term72468, term72468.getClass(), "errorReporter", null);
        setField(term72468, term72468.getClass(), "transformDispatcher", null);
        setField(term72468, term72468.getClass(), "reservedKeywords", null);
        setField(term72468, term72468.getClass(), "parsedComments", null);
        setField(term72468, term72468.getClass(), "rootNodeJsDocHolder", null);
        setField(term72468, term72468.getClass(), "fileLevelJsDocBuilder", null);
        setField(term72468, term72468.getClass(), "fileOverviewInfo", null);
        setField(term72468, term72468.getClass(), "templateNode", null);
        term72469 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.Comment"));
        setField(term72469, term72469.getClass(), "value", "");
        setField(term72469, term72469.getClass(), "commentType", null);
        setIntField(term72469, term72469.getClass(), "position", 0);
        setIntField(term72469, term72469.getClass(), "length", 0);
        setField(term72469, term72469.getClass(), "parent", null);
        setIntField(term72469, term72469.getClass(), "type", 0);
        setField(term72469, term72469.getClass(), "next", null);
        setField(term72469, term72469.getClass(), "first", null);
        setField(term72469, term72469.getClass(), "last", null);
        setIntField(term72469, term72469.getClass(), "lineno", 0);
        setField(term72469, term72469.getClass(), "propListHead", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.Comment");
        Object[] args = new Object[1];
        args[0] = term71786;
        callMethod(klass, "handleBlockComment", argTypes, term71692, args);
        assertTrue(recursiveEquals(term71692, term72468));
        assertTrue(recursiveEquals(term71786, term72469));
    }

};


