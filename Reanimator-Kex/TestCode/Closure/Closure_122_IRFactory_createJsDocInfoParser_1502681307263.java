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

public class IRFactory_createJsDocInfoParser_1502681307263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105985;
     Object term106117;

    public IRFactory_createJsDocInfoParser_1502681307263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105985 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(term105985, term105985.getClass(), "sourceString", "");
        term106117 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.Comment"));
        setField(term106117, term106117.getClass(), "value", "                  ");
        setIntField(term106117, term106117.getClass(), "lineno", 0);
        setIntField(term106117, term106117.getClass(), "position", 0);
        setField(term106117, term106117.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.Comment");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term106117;
        args[1] = null;
        callMethod(klass, "createJsDocInfoParser", argTypes, term105985, args);
    }

};


