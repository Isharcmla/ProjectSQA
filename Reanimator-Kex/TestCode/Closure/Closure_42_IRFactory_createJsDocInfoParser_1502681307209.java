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

public class IRFactory_createJsDocInfoParser_1502681307209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67052;
     Object term67184;

    public IRFactory_createJsDocInfoParser_1502681307209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67052 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(term67052, term67052.getClass(), "sourceString", "");
        term67184 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.Comment"));
        setField(term67184, term67184.getClass(), "value", "                  ");
        setIntField(term67184, term67184.getClass(), "lineno", 0);
        setIntField(term67184, term67184.getClass(), "position", 0);
        setField(term67184, term67184.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.Comment");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term67184;
        args[1] = null;
        callMethod(klass, "createJsDocInfoParser", argTypes, term67052, args);
    }

};


