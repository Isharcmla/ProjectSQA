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

public class IRFactory_transformNumberAsString_1706735028225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69646;
     Object term69990;

    public IRFactory_transformNumberAsString_1706735028225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69646 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term69738 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term69846 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        setField(term69738, term69738.getClass(), "propListHead", term69846);
        setField(term69646, term69646.getClass(), "templateNode", term69738);
        setField(term69646, term69646.getClass(), "sourceString", "");
        term69990 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral"));
        Object term70096 = newInstance(Class.forName("com.google.javascript.rhino.head.Node$PropListItem"));
        setDoubleField(term69990, term69990.getClass(), "number", 4.7017580453345362E18);
        setIntField(term70096, term70096.getClass(), "type", 24);
        setField(term70096, term70096.getClass(), "objectValue", null);
        setField(term69990, term69990.getClass(), "propListHead", term70096);
        setIntField(term69990, term69990.getClass(), "lineno", 0);
        setIntField(term69990, term69990.getClass(), "position", 0);
        setField(term69990, term69990.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral");
        Object[] args = new Object[1];
        args[0] = term69990;
        callMethod(klass, "transformNumberAsString", argTypes, term69646, args);
    }

};


