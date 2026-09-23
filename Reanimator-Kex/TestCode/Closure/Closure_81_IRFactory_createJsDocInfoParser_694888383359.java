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

public class IRFactory_createJsDocInfoParser_694888383359 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40420;
     Object term40534;

    public IRFactory_createJsDocInfoParser_694888383359() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40420 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        term40534 = newInstance(Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.Comment"));
        setField(term40534, term40534.getClass(), "value", "");
        setIntField(term40534, term40534.getClass(), "lineno", -1);
        setField(term40534, term40534.getClass(), "parent", null);
        setIntField(term40534, term40534.getClass(), "position", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.Comment");
        Object[] args = new Object[1];
        args[0] = term40534;
        callMethod(klass, "createJsDocInfoParser", argTypes, term40420, args);
    }

};


