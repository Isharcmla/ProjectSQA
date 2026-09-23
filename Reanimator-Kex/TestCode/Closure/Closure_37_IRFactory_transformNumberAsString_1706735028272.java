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

public class IRFactory_transformNumberAsString_1706735028272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76353;
     Object term76567;

    public IRFactory_transformNumberAsString_1706735028272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76353 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term76423 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term76423, term76423.getClass(), "propListHead", null);
        setField(term76353, term76353.getClass(), "templateNode", term76423);
        setField(term76353, term76353.getClass(), "sourceString", "");
        term76567 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral"));
        Object term76673 = newInstance(Class.forName("com.google.javascript.rhino.head.Node$PropListItem"));
        setDoubleField(term76567, term76567.getClass(), "number", -4.404379640618025E18);
        setIntField(term76673, term76673.getClass(), "type", 24);
        setField(term76673, term76673.getClass(), "objectValue", null);
        setField(term76567, term76567.getClass(), "propListHead", term76673);
        setIntField(term76567, term76567.getClass(), "lineno", -2147483648);
        setIntField(term76567, term76567.getClass(), "position", 0);
        setField(term76567, term76567.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral");
        Object[] args = new Object[1];
        args[0] = term76567;
        callMethod(klass, "transformNumberAsString", argTypes, term76353, args);
    }

};


