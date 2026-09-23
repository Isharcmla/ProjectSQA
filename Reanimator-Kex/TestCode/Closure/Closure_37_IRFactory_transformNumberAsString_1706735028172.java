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

public class IRFactory_transformNumberAsString_1706735028172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52004;
     Object term52202;

    public IRFactory_transformNumberAsString_1706735028172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52004 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term52096 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term52004, term52004.getClass(), "templateNode", term52096);
        term52202 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral"));
        setDoubleField(term52202, term52202.getClass(), "number", 4.8906277204818657E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral");
        Object[] args = new Object[1];
        args[0] = term52202;
        try {
            callMethod(klass, "transformNumberAsString", argTypes, term52004, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


