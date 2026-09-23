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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.parsing.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class IRFactory_transformNumberAsString_1706735028151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49220;
     Object term49396;

    public IRFactory_transformNumberAsString_1706735028151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49220 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term49290 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term49290, term49290.getClass(), "propListHead", null);
        setField(term49220, term49220.getClass(), "templateNode", term49290);
        term49396 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral"));
        Object term49502 = newInstance(Class.forName("com.google.javascript.rhino.head.Node$PropListItem"));
        Object term49608 = newInstance(Class.forName("com.google.javascript.rhino.head.Node$PropListItem"));
        setDoubleField(term49396, term49396.getClass(), "number", 5.7604692533418445E18);
        setIntField(term49502, term49502.getClass(), "type", -25);
        setField(term49502, term49502.getClass(), "next", term49608);
        setField(term49396, term49396.getClass(), "propListHead", term49502);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral");
        Object[] args = new Object[1];
        args[0] = term49396;
        try {
            callMethod(klass, "transformNumberAsString", argTypes, term49220, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


