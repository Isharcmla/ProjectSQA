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

public class IRFactory_transformNumberAsString_1706735028222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90019;
     Object term90325;

    public IRFactory_transformNumberAsString_1706735028222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90019 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term90111 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term90219 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        setField(term90111, term90111.getClass(), "propListHead", term90219);
        setField(term90019, term90019.getClass(), "templateNode", term90111);
        term90325 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral"));
        Object term90431 = newInstance(Class.forName("com.google.javascript.rhino.head.Node$PropListItem"));
        setDoubleField(term90325, term90325.getClass(), "number", -4.4402677220260413E18);
        setIntField(term90431, term90431.getClass(), "type", 24);
        setField(term90431, term90431.getClass(), "objectValue", null);
        setField(term90325, term90325.getClass(), "propListHead", term90431);
        setIntField(term90325, term90325.getClass(), "lineno", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral");
        Object[] args = new Object[1];
        args[0] = term90325;
        try {
            callMethod(klass, "transformNumberAsString", argTypes, term90019, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


