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

public class IRFactory_position2charno_1370523140166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73133;
     Object term73180;

    public IRFactory_position2charno_1370523140166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73133 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(term73133, term73133.getClass(), "sourceString", "");
        term73180 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(term73180, term73180.getClass(), "sourceString", "");
        setField(term73180, term73180.getClass(), "sourceFile", null);
        setField(term73180, term73180.getClass(), "sourceName", null);
        setField(term73180, term73180.getClass(), "config", null);
        setField(term73180, term73180.getClass(), "errorReporter", null);
        setField(term73180, term73180.getClass(), "transformDispatcher", null);
        setField(term73180, term73180.getClass(), "reservedKeywords", null);
        setField(term73180, term73180.getClass(), "parsedComments", null);
        setField(term73180, term73180.getClass(), "rootNodeJsDocHolder", null);
        setField(term73180, term73180.getClass(), "fileLevelJsDocBuilder", null);
        setField(term73180, term73180.getClass(), "fileOverviewInfo", null);
        setField(term73180, term73180.getClass(), "templateNode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "position2charno", argTypes, term73133, args);
        assertTrue(recursiveEquals(term73133, term73180));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


