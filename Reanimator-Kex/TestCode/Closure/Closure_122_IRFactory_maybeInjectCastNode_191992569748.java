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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.parsing.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class IRFactory_maybeInjectCastNode_191992569748 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9424;

    public IRFactory_maybeInjectCastNode_191992569748() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9424 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(term9424, term9424.getClass(), "sourceString", null);
        setField(term9424, term9424.getClass(), "sourceFile", null);
        setField(term9424, term9424.getClass(), "sourceName", null);
        setField(term9424, term9424.getClass(), "config", null);
        setField(term9424, term9424.getClass(), "errorReporter", null);
        setField(term9424, term9424.getClass(), "transformDispatcher", null);
        setField(term9424, term9424.getClass(), "reservedKeywords", null);
        setField(term9424, term9424.getClass(), "parsedComments", null);
        setField(term9424, term9424.getClass(), "rootNodeJsDocHolder", null);
        setField(term9424, term9424.getClass(), "fileLevelJsDocBuilder", null);
        setField(term9424, term9424.getClass(), "fileOverviewInfo", null);
        setField(term9424, term9424.getClass(), "templateNode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "maybeInjectCastNode", argTypes, term9424, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


