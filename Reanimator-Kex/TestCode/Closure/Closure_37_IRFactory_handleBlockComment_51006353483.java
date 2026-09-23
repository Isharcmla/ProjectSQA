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

public class IRFactory_handleBlockComment_51006353483 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42796;
     Object term42890;
     Object term42944;
     Object term42945;

    public IRFactory_handleBlockComment_51006353483() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42796 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        term42890 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.Comment"));
        setField(term42890, term42890.getClass(), "value", "");
        term42944 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(term42944, term42944.getClass(), "sourceString", null);
        setField(term42944, term42944.getClass(), "sourceFile", null);
        setField(term42944, term42944.getClass(), "sourceName", null);
        setField(term42944, term42944.getClass(), "config", null);
        setField(term42944, term42944.getClass(), "errorReporter", null);
        setField(term42944, term42944.getClass(), "transformDispatcher", null);
        setField(term42944, term42944.getClass(), "ALLOWED_DIRECTIVES", null);
        setField(term42944, term42944.getClass(), "reservedKeywords", null);
        setField(term42944, term42944.getClass(), "parsedComments", null);
        setField(term42944, term42944.getClass(), "rootNodeJsDocHolder", null);
        setField(term42944, term42944.getClass(), "fileLevelJsDocBuilder", null);
        setField(term42944, term42944.getClass(), "fileOverviewInfo", null);
        setField(term42944, term42944.getClass(), "templateNode", null);
        term42945 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.Comment"));
        setField(term42945, term42945.getClass(), "value", "");
        setField(term42945, term42945.getClass(), "commentType", null);
        setIntField(term42945, term42945.getClass(), "position", 0);
        setIntField(term42945, term42945.getClass(), "length", 0);
        setField(term42945, term42945.getClass(), "parent", null);
        setIntField(term42945, term42945.getClass(), "type", 0);
        setField(term42945, term42945.getClass(), "next", null);
        setField(term42945, term42945.getClass(), "first", null);
        setField(term42945, term42945.getClass(), "last", null);
        setIntField(term42945, term42945.getClass(), "lineno", 0);
        setField(term42945, term42945.getClass(), "propListHead", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.Comment");
        Object[] args = new Object[1];
        args[0] = term42890;
        callMethod(klass, "handleBlockComment", argTypes, term42796, args);
        assertTrue(recursiveEquals(term42796, term42944));
        assertTrue(recursiveEquals(term42890, term42945));
    }

};


