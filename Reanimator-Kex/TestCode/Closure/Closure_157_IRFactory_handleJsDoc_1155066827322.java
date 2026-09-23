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

public class IRFactory_handleJsDoc_1155066827322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54310;
     Object term54430;
     Object term54674;
     Object term54675;

    public IRFactory_handleJsDoc_1155066827322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54310 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        term54430 = newInstance(Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.XmlElemRef"));
        term54674 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(term54674, term54674.getClass(), "sourceString", null);
        setField(term54674, term54674.getClass(), "sourceName", null);
        setField(term54674, term54674.getClass(), "config", null);
        setField(term54674, term54674.getClass(), "errorReporter", null);
        setField(term54674, term54674.getClass(), "transformDispatcher", null);
        setField(term54674, term54674.getClass(), "ALLOWED_DIRECTIVES", null);
        setField(term54674, term54674.getClass(), "reservedKeywords", null);
        setField(term54674, term54674.getClass(), "rootNodeJsDocHolder", null);
        setField(term54674, term54674.getClass(), "fileLevelJsDocBuilder", null);
        setField(term54674, term54674.getClass(), "fileOverviewInfo", null);
        setField(term54674, term54674.getClass(), "templateNode", null);
        term54675 = newInstance(Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.XmlElemRef"));
        setField(term54675, term54675.getClass(), "indexExpr", null);
        setIntField(term54675, term54675.getClass(), "lb", 0);
        setIntField(term54675, term54675.getClass(), "rb", 0);
        setField(term54675, term54675.getClass(), "namespace", null);
        setIntField(term54675, term54675.getClass(), "atPos", 0);
        setIntField(term54675, term54675.getClass(), "colonPos", 0);
        setIntField(term54675, term54675.getClass(), "position", 0);
        setIntField(term54675, term54675.getClass(), "length", 0);
        setField(term54675, term54675.getClass(), "parent", null);
        setIntField(term54675, term54675.getClass(), "type", 0);
        setField(term54675, term54675.getClass(), "next", null);
        setField(term54675, term54675.getClass(), "first", null);
        setField(term54675, term54675.getClass(), "last", null);
        setIntField(term54675, term54675.getClass(), "lineno", 0);
        setField(term54675, term54675.getClass(), "propListHead", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Object[] args = new Object[1];
        args[0] = term54430;
        Object retValue = callMethod(klass, "handleJsDoc", argTypes, term54310, args);
        assertTrue(recursiveEquals(term54310, term54674));
        assertTrue(recursiveEquals(term54430, term54675));
        assertTrue(recursiveEquals(retValue, null));
    }

};


