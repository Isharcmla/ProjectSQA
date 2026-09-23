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
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class TypeInference_traverseChildren_1478920219175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54858;
     Object term54928;
     Object term55372;
     Object term55373;

    public TypeInference_traverseChildren_1478920219175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54858 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term54928 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term54998 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term55068 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term54998, term54998.getClass(), "type", 1241164745);
        setField(term54998, term54998.getClass(), "propListHead", null);
        setIntField(term55068, term55068.getClass(), "type", 41);
        setField(term54998, term54998.getClass(), "next", term55068);
        setField(term54928, term54928.getClass(), "first", term54998);
        term55372 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        setField(term55372, term55372.getClass(), "compiler", null);
        setField(term55372, term55372.getClass(), "registry", null);
        setField(term55372, term55372.getClass(), "reverseInterpreter", null);
        setField(term55372, term55372.getClass(), "syntacticScope", null);
        setField(term55372, term55372.getClass(), "functionScope", null);
        setField(term55372, term55372.getClass(), "bottomScope", null);
        setField(term55372, term55372.getClass(), "assertionFunctionsMap", null);
        setField(term55372, term55372.getClass(), "cfg", null);
        setField(term55372, term55372.getClass(), "joinOp", null);
        setField(term55372, term55372.getClass(), "orderedWorkSet", null);
        term55373 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term55374 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term55375 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term55373, term55373.getClass(), "type", 0);
        setField(term55373, term55373.getClass(), "next", null);
        setIntField(term55374, term55374.getClass(), "type", 1241164745);
        setIntField(term55375, term55375.getClass(), "type", 41);
        setField(term55375, term55375.getClass(), "next", null);
        setField(term55375, term55375.getClass(), "first", null);
        setField(term55375, term55375.getClass(), "last", null);
        setField(term55375, term55375.getClass(), "propListHead", null);
        setIntField(term55375, term55375.getClass(), "sourcePosition", 0);
        setField(term55375, term55375.getClass(), "jsType", null);
        setField(term55375, term55375.getClass(), "parent", null);
        setField(term55374, term55374.getClass(), "next", term55375);
        setField(term55374, term55374.getClass(), "first", null);
        setField(term55374, term55374.getClass(), "last", null);
        setField(term55374, term55374.getClass(), "propListHead", null);
        setIntField(term55374, term55374.getClass(), "sourcePosition", 0);
        setField(term55374, term55374.getClass(), "jsType", null);
        setField(term55374, term55374.getClass(), "parent", null);
        setField(term55373, term55373.getClass(), "first", term55374);
        setField(term55373, term55373.getClass(), "last", null);
        setField(term55373, term55373.getClass(), "propListHead", null);
        setIntField(term55373, term55373.getClass(), "sourcePosition", 0);
        setField(term55373, term55373.getClass(), "jsType", null);
        setField(term55373, term55373.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term54928;
        args[1] = null;
        Object retValue = callMethod(klass, "traverseChildren", argTypes, term54858, args);
        assertTrue(recursiveEquals(term54858, term55372));
        assertTrue(recursiveEquals(term54928, term55373));
        assertTrue(recursiveEquals(retValue, null));
    }

};


