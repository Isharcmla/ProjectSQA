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

public class IRFactory_position2charno_1370523140181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23752;
     Object term23797;

    public IRFactory_position2charno_1370523140181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23752 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(term23752, term23752.getClass(), "sourceString", "");
        term23797 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(term23797, term23797.getClass(), "sourceString", "");
        setField(term23797, term23797.getClass(), "sourceName", null);
        setField(term23797, term23797.getClass(), "config", null);
        setField(term23797, term23797.getClass(), "errorReporter", null);
        setField(term23797, term23797.getClass(), "transformDispatcher", null);
        setField(term23797, term23797.getClass(), "ALLOWED_DIRECTIVES", null);
        setField(term23797, term23797.getClass(), "rootNodeJsDocHolder", null);
        setField(term23797, term23797.getClass(), "fileLevelJsDocBuilder", null);
        setField(term23797, term23797.getClass(), "fileOverviewInfo", null);
        setField(term23797, term23797.getClass(), "templateNode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "position2charno", argTypes, term23752, args);
        assertTrue(recursiveEquals(term23752, term23797));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


