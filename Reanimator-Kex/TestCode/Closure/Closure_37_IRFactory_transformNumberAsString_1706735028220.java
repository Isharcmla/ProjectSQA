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
import java.lang.ClassCastException;
import static com.google.javascript.jscomp.parsing.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class IRFactory_transformNumberAsString_1706735028220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59304;
     Object term59480;

    public IRFactory_transformNumberAsString_1706735028220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59304 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term59374 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term59374, term59374.getClass(), "propListHead", null);
        setField(term59304, term59304.getClass(), "templateNode", term59374);
        term59480 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral"));
        Object term59586 = newInstance(Class.forName("com.google.javascript.rhino.head.Node$PropListItem"));
        Object term59624 = newInstance(Class.forName("java.lang.Object"));
        setDoubleField(term59480, term59480.getClass(), "number", 4.6837438873432228E18);
        setIntField(term59586, term59586.getClass(), "type", 24);
        setField(term59586, term59586.getClass(), "objectValue", term59624);
        setField(term59480, term59480.getClass(), "propListHead", term59586);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral");
        Object[] args = new Object[1];
        args[0] = term59480;
        try {
            callMethod(klass, "transformNumberAsString", argTypes, term59304, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


