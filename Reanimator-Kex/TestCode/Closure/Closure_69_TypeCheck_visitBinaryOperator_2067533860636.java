package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeCheck_visitBinaryOperator_2067533860636 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term205015;
     Object term205189;

    public TypeCheck_visitBinaryOperator_2067533860636() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term205015 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term205119 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setIntField(term205015, term205015.getClass(), "noTypeCheckSection", -1);
        setField(term205015, term205015.getClass(), "typeRegistry", term205119);
        term205189 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term205259 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term205369 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term205439 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term205529 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setField(term205259, term205259.getClass(), "jsType", term205369);
        setField(term205189, term205189.getClass(), "first", term205259);
        setField(term205439, term205439.getClass(), "jsType", term205529);
        setField(term205189, term205189.getClass(), "last", term205439);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = 82;
        args[1] = null;
        args[2] = term205189;
        callMethod(klass, "visitBinaryOperator", argTypes, term205015, args);
    }

};


