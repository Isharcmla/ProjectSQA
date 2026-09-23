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

public class IRFactory_transformNumberAsString_1706735028255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69683;
     Object term69989;

    public IRFactory_transformNumberAsString_1706735028255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69683 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term69775 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term69883 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        setField(term69775, term69775.getClass(), "propListHead", term69883);
        setField(term69683, term69683.getClass(), "templateNode", term69775);
        term69989 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral"));
        Object term70095 = newInstance(Class.forName("com.google.javascript.rhino.head.Node$PropListItem"));
        Object term70201 = newInstance(Class.forName("com.google.javascript.rhino.head.Node$PropListItem"));
        setDoubleField(term69989, term69989.getClass(), "number", 0.0);
        setIntField(term70095, term70095.getClass(), "type", 0);
        setIntField(term70201, term70201.getClass(), "type", 0);
        setField(term70201, term70201.getClass(), "next", null);
        setField(term70095, term70095.getClass(), "next", term70201);
        setField(term69989, term69989.getClass(), "propListHead", term70095);
        setIntField(term69989, term69989.getClass(), "lineno", -2147483648);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral");
        Object[] args = new Object[1];
        args[0] = term69989;
        callMethod(klass, "transformNumberAsString", argTypes, term69683, args);
    }

};


