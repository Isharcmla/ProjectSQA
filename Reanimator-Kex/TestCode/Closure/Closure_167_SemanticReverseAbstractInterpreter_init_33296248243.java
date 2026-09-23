package com.google.javascript.jscomp.type;

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
import static com.google.javascript.jscomp.type.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.type.EqualityUtils.*;
import java.lang.Object;

public class SemanticReverseAbstractInterpreter_init_33296248243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7513;
     Object term7922;
     Object term7927;

    public SemanticReverseAbstractInterpreter_init_33296248243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term7117 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object term7261 = newInstance(Class.forName("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter$2"));
        Object term7405 = newInstance(Class.forName("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter$1"));
        setField(term7117, term7117.getClass(), "restrictUndefinedVisitor", term7261);
        setField(term7117, term7117.getClass(), "restrictNullVisitor", term7405);
        term7513 = newInstance(Class.forName("com.google.javascript.jscomp.JqueryCodingConvention"));
        term7922 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object term7923 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter$5"));
        Object term7924 = newInstance(Class.forName("com.google.javascript.jscomp.JqueryCodingConvention"));
        Object term7925 = newInstance(Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter$1"));
        Object term7926 = newInstance(Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter$2"));
        setField(term7923, term7923.getClass(), "this$0", term7922);
        setField(term7922, term7922.getClass(), "INEQ", term7923);
        setField(term7924, term7924.getClass(), "nextConvention", null);
        setField(term7922, term7922.getClass(), "convention", term7924);
        setField(term7922, term7922.getClass(), "typeRegistry", null);
        setField(term7922, term7922.getClass(), "firstLink", term7922);
        setField(term7922, term7922.getClass(), "nextLink", null);
        setField(term7925, term7925.getClass(), "this$0", term7922);
        setField(term7922, term7922.getClass(), "restrictUndefinedVisitor", term7925);
        setField(term7926, term7926.getClass(), "this$0", term7922);
        setField(term7922, term7922.getClass(), "restrictNullVisitor", term7926);
        term7927 = newInstance(Class.forName("com.google.javascript.jscomp.JqueryCodingConvention"));
        setField(term7927, term7927.getClass(), "nextConvention", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.CodingConvention");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Object[] args = new Object[2];
        args[0] = term7513;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term7922));
        assertTrue(recursiveEquals(term7513, term7927));
    }

};


