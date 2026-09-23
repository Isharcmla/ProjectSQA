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

public class IRFactory_handlePossibleFileOverviewJsDoc_1608183152261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73515;
     Object term73609;

    public IRFactory_handlePossibleFileOverviewJsDoc_1608183152261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73515 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        term73609 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.Comment"));
        setField(term73609, term73609.getClass(), "value", "");
        setIntField(term73609, term73609.getClass(), "lineno", -1);
        setField(term73609, term73609.getClass(), "parent", null);
        setIntField(term73609, term73609.getClass(), "position", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.Comment");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term73609;
        args[1] = null;
        callMethod(klass, "handlePossibleFileOverviewJsDoc", argTypes, term73515, args);
    }

};


