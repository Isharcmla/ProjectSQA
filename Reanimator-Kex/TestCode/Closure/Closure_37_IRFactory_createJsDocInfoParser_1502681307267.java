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

public class IRFactory_createJsDocInfoParser_1502681307267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74862;
     Object term74994;

    public IRFactory_createJsDocInfoParser_1502681307267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74862 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        setField(term74862, term74862.getClass(), "sourceString", "");
        term74994 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.Comment"));
        setField(term74994, term74994.getClass(), "value", "                  ");
        setIntField(term74994, term74994.getClass(), "lineno", 0);
        setIntField(term74994, term74994.getClass(), "position", 0);
        setField(term74994, term74994.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.Comment");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term74994;
        args[1] = null;
        callMethod(klass, "createJsDocInfoParser", argTypes, term74862, args);
    }

};


