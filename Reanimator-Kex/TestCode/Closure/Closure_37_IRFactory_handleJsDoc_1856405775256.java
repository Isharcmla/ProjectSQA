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

public class IRFactory_handleJsDoc_1856405775256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70321;
     Object term70427;

    public IRFactory_handleJsDoc_1856405775256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70321 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        term70427 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.WithStatement"));
        Object term70533 = newInstance(Class.forName("com.google.javascript.rhino.head.Node$PropListItem"));
        setIntField(term70533, term70533.getClass(), "type", 24);
        setField(term70427, term70427.getClass(), "propListHead", term70533);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term70427;
        args[1] = null;
        callMethod(klass, "handleJsDoc", argTypes, term70321, args);
    }

};


