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

public class IRFactory_transformNumberAsString_1706735028218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88770;
     Object term88946;

    public IRFactory_transformNumberAsString_1706735028218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term88770 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term88840 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term88840, term88840.getClass(), "propListHead", null);
        setField(term88770, term88770.getClass(), "templateNode", term88840);
        term88946 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral"));
        Object term89052 = newInstance(Class.forName("com.google.javascript.rhino.head.Node$PropListItem"));
        Object term89090 = newInstance(Class.forName("java.lang.Object"));
        setDoubleField(term88946, term88946.getClass(), "number", 4.6837438873432228E18);
        setIntField(term89052, term89052.getClass(), "type", 24);
        setField(term89052, term89052.getClass(), "objectValue", term89090);
        setField(term88946, term88946.getClass(), "propListHead", term89052);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral");
        Object[] args = new Object[1];
        args[0] = term88946;
        try {
            callMethod(klass, "transformNumberAsString", argTypes, term88770, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


