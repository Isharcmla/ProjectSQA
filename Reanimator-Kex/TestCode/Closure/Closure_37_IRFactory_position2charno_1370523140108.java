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

public class IRFactory_position2charno_1370523140108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46193;
     Object term46238;

    public IRFactory_position2charno_1370523140108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46193 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(term46193, term46193.getClass(), "sourceString", "");
        term46238 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(term46238, term46238.getClass(), "sourceString", "");
        setField(term46238, term46238.getClass(), "sourceFile", null);
        setField(term46238, term46238.getClass(), "sourceName", null);
        setField(term46238, term46238.getClass(), "config", null);
        setField(term46238, term46238.getClass(), "errorReporter", null);
        setField(term46238, term46238.getClass(), "transformDispatcher", null);
        setField(term46238, term46238.getClass(), "ALLOWED_DIRECTIVES", null);
        setField(term46238, term46238.getClass(), "reservedKeywords", null);
        setField(term46238, term46238.getClass(), "parsedComments", null);
        setField(term46238, term46238.getClass(), "rootNodeJsDocHolder", null);
        setField(term46238, term46238.getClass(), "fileLevelJsDocBuilder", null);
        setField(term46238, term46238.getClass(), "fileOverviewInfo", null);
        setField(term46238, term46238.getClass(), "templateNode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "position2charno", argTypes, term46193, args);
        assertTrue(recursiveEquals(term46193, term46238));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


