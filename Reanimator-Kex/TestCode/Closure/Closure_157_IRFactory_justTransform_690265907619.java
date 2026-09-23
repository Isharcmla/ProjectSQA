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
import java.lang.Object;

public class IRFactory_justTransform_690265907619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132583;
     Object term132859;

    public IRFactory_justTransform_690265907619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term132583 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term132721 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher"));
        setField(term132583, term132583.getClass(), "transformDispatcher", term132721);
        term132859 = newInstance(Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.ExpressionStatement"));
        setIntField(term132859, term132859.getClass(), "type", 146);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Object[] args = new Object[1];
        args[0] = term132859;
        callMethod(klass, "justTransform", argTypes, term132583, args);
    }

};


