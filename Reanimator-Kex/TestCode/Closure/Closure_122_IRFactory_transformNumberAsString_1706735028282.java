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

public class IRFactory_transformNumberAsString_1706735028282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112367;
     Object term112581;

    public IRFactory_transformNumberAsString_1706735028282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112367 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term112437 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term112437, term112437.getClass(), "propListHead", null);
        setField(term112367, term112367.getClass(), "templateNode", term112437);
        setField(term112367, term112367.getClass(), "sourceString", "");
        term112581 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral"));
        Object term112687 = newInstance(Class.forName("com.google.javascript.rhino.head.Node$PropListItem"));
        setDoubleField(term112581, term112581.getClass(), "number", 0.0);
        setIntField(term112687, term112687.getClass(), "type", 24);
        setField(term112687, term112687.getClass(), "objectValue", null);
        setField(term112581, term112581.getClass(), "propListHead", term112687);
        setIntField(term112581, term112581.getClass(), "lineno", -1);
        setField(term112581, term112581.getClass(), "parent", null);
        setIntField(term112581, term112581.getClass(), "position", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral");
        Object[] args = new Object[1];
        args[0] = term112581;
        callMethod(klass, "transformNumberAsString", argTypes, term112367, args);
    }

};


