package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CodeGenerator_isOneExactlyFunctionOrDo_211412008711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term963;
     Object term964;

    public CodeGenerator_isOneExactlyFunctionOrDo_211412008711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term963 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term963, term963.getClass(), "cc", null);
        setField(term963, term963.getClass(), "outputCharsetEncoder", null);
        term964 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term966 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term968 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term971 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term974 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term977 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term981 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term984 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term987 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term964, term964.getClass(), "type", 454281060);
        setIntField(term966, term966.getClass(), "type", 292681826);
        setIntField(term968, term968.getClass(), "type", 0);
        setField(term968, term968.getClass(), "next", null);
        setField(term968, term968.getClass(), "first", null);
        setField(term968, term968.getClass(), "last", null);
        setField(term968, term968.getClass(), "propListHead", null);
        setIntField(term968, term968.getClass(), "sourcePosition", 0);
        setField(term968, term968.getClass(), "jsType", null);
        setField(term968, term968.getClass(), "parent", null);
        setField(term966, term966.getClass(), "next", term968);
        setIntField(term971, term971.getClass(), "type", 0);
        setField(term971, term971.getClass(), "next", null);
        setField(term971, term971.getClass(), "first", null);
        setField(term971, term971.getClass(), "last", null);
        setField(term971, term971.getClass(), "propListHead", null);
        setIntField(term971, term971.getClass(), "sourcePosition", 0);
        setField(term971, term971.getClass(), "jsType", null);
        setField(term971, term971.getClass(), "parent", null);
        setField(term966, term966.getClass(), "first", term971);
        setIntField(term974, term974.getClass(), "type", 0);
        setField(term974, term974.getClass(), "next", null);
        setField(term974, term974.getClass(), "first", null);
        setField(term974, term974.getClass(), "last", null);
        setField(term974, term974.getClass(), "propListHead", null);
        setIntField(term974, term974.getClass(), "sourcePosition", 0);
        setField(term974, term974.getClass(), "jsType", null);
        setField(term974, term974.getClass(), "parent", null);
        setField(term966, term966.getClass(), "last", term974);
        setField(term977, term977.getClass(), "next", null);
        setIntField(term977, term977.getClass(), "type", 0);
        setIntField(term977, term977.getClass(), "intValue", 0);
        setField(term977, term977.getClass(), "objectValue", null);
        setField(term966, term966.getClass(), "propListHead", term977);
        setIntField(term966, term966.getClass(), "sourcePosition", 493620644);
        setField(term966, term966.getClass(), "jsType", null);
        setField(term966, term966.getClass(), "parent", null);
        setField(term964, term964.getClass(), "next", term966);
        setIntField(term981, term981.getClass(), "type", 0);
        setField(term981, term981.getClass(), "next", null);
        setField(term981, term981.getClass(), "first", null);
        setField(term981, term981.getClass(), "last", null);
        setField(term981, term981.getClass(), "propListHead", null);
        setIntField(term981, term981.getClass(), "sourcePosition", 0);
        setField(term981, term981.getClass(), "jsType", null);
        setField(term981, term981.getClass(), "parent", null);
        setField(term964, term964.getClass(), "first", term981);
        setIntField(term984, term984.getClass(), "type", 0);
        setField(term984, term984.getClass(), "next", null);
        setField(term984, term984.getClass(), "first", null);
        setField(term984, term984.getClass(), "last", null);
        setField(term984, term984.getClass(), "propListHead", null);
        setIntField(term984, term984.getClass(), "sourcePosition", 0);
        setField(term984, term984.getClass(), "jsType", null);
        setField(term984, term984.getClass(), "parent", null);
        setField(term964, term964.getClass(), "last", term984);
        setField(term987, term987.getClass(), "next", null);
        setIntField(term987, term987.getClass(), "type", 0);
        setIntField(term987, term987.getClass(), "intValue", 0);
        setField(term987, term987.getClass(), "objectValue", null);
        setField(term964, term964.getClass(), "propListHead", term987);
        setIntField(term964, term964.getClass(), "sourcePosition", 1328271830);
        setField(term964, term964.getClass(), "jsType", null);
        setField(term964, term964.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term964;
        callMethod(klass, "isOneExactlyFunctionOrDo", argTypes, term963, args);
    }

};


