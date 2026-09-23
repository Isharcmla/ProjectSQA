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

public class IRFactory_transformNumberAsString_1706735028211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56956;
     Object term57262;

    public IRFactory_transformNumberAsString_1706735028211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56956 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term57048 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term57156 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        setField(term57048, term57048.getClass(), "propListHead", term57156);
        setField(term56956, term56956.getClass(), "templateNode", term57048);
        term57262 = newInstance(Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral"));
        Object term57368 = newInstance(Class.forName("com.google.javascript.rhino.head.Node$PropListItem"));
        setDoubleField(term57262, term57262.getClass(), "number", -4.3726076603111834E18);
        setIntField(term57368, term57368.getClass(), "type", 24);
        setField(term57368, term57368.getClass(), "objectValue", null);
        setField(term57262, term57262.getClass(), "propListHead", term57368);
        setIntField(term57262, term57262.getClass(), "lineno", -2147483648);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.NumberLiteral");
        Object[] args = new Object[1];
        args[0] = term57262;
        try {
            callMethod(klass, "transformNumberAsString", argTypes, term56956, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


