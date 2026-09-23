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

public class IRFactory_position2charno_137052314094 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48898;
     Object term48943;

    public IRFactory_position2charno_137052314094() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48898 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(term48898, term48898.getClass(), "sourceString", "");
        term48943 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(term48943, term48943.getClass(), "sourceString", "");
        setField(term48943, term48943.getClass(), "sourceFile", null);
        setField(term48943, term48943.getClass(), "sourceName", null);
        setField(term48943, term48943.getClass(), "config", null);
        setField(term48943, term48943.getClass(), "errorReporter", null);
        setField(term48943, term48943.getClass(), "transformDispatcher", null);
        setField(term48943, term48943.getClass(), "ALLOWED_DIRECTIVES", null);
        setField(term48943, term48943.getClass(), "reservedKeywords", null);
        setField(term48943, term48943.getClass(), "parsedComments", null);
        setField(term48943, term48943.getClass(), "rootNodeJsDocHolder", null);
        setField(term48943, term48943.getClass(), "fileLevelJsDocBuilder", null);
        setField(term48943, term48943.getClass(), "fileOverviewInfo", null);
        setField(term48943, term48943.getClass(), "templateNode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "position2charno", argTypes, term48898, args);
        assertTrue(recursiveEquals(term48898, term48943));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


