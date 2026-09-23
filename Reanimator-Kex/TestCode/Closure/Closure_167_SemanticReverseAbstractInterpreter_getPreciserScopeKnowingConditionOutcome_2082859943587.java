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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943587 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term164733;
     Object term164825;
     Object term165223;
     Object term165224;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943587() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term164733 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term164825 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term164917 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term165027 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term165119 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term164825, term164825.getClass(), "type", 13);
        setIntField(term164917, term164917.getClass(), "type", 1078385728);
        setField(term164917, term164917.getClass(), "jsType", term165027);
        setField(term164825, term164825.getClass(), "first", term164917);
        setIntField(term165119, term165119.getClass(), "type", -1078385729);
        setField(term165119, term165119.getClass(), "jsType", null);
        setField(term164825, term164825.getClass(), "last", term165119);
        term165223 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term165223, term165223.getClass(), "INEQ", null);
        setField(term165223, term165223.getClass(), "convention", null);
        setField(term165223, term165223.getClass(), "typeRegistry", null);
        setField(term165223, term165223.getClass(), "firstLink", null);
        setField(term165223, term165223.getClass(), "nextLink", null);
        setField(term165223, term165223.getClass(), "restrictUndefinedVisitor", null);
        setField(term165223, term165223.getClass(), "restrictNullVisitor", null);
        term165224 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term165225 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term165226 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term165227 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term165224, term165224.getClass(), "number", 0.0);
        setIntField(term165224, term165224.getClass(), "type", 13);
        setField(term165224, term165224.getClass(), "next", null);
        setField(term165225, term165225.getClass(), "str", null);
        setIntField(term165225, term165225.getClass(), "type", 1078385728);
        setField(term165225, term165225.getClass(), "next", null);
        setField(term165225, term165225.getClass(), "first", null);
        setField(term165225, term165225.getClass(), "last", null);
        setField(term165225, term165225.getClass(), "propListHead", null);
        setIntField(term165225, term165225.getClass(), "sourcePosition", 0);
        setField(term165226, term165226.getClass(), "parameterType", null);
        setField(term165226, term165226.getClass(), "referencedType", null);
        setField(term165226, term165226.getClass(), "referencedObjType", null);
        setBooleanField(term165226, term165226.getClass(), "visited", false);
        setField(term165226, term165226.getClass(), "docInfo", null);
        setBooleanField(term165226, term165226.getClass(), "unknown", false);
        setBooleanField(term165226, term165226.getClass(), "resolved", false);
        setField(term165226, term165226.getClass(), "resolveResult", null);
        setBooleanField(term165226, term165226.getClass(), "inTemplatedCheckVisit", false);
        setField(term165226, term165226.getClass(), "registry", null);
        setField(term165225, term165225.getClass(), "jsType", term165226);
        setField(term165225, term165225.getClass(), "parent", null);
        setField(term165224, term165224.getClass(), "first", term165225);
        setField(term165227, term165227.getClass(), "str", null);
        setIntField(term165227, term165227.getClass(), "type", -1078385729);
        setField(term165227, term165227.getClass(), "next", null);
        setField(term165227, term165227.getClass(), "first", null);
        setField(term165227, term165227.getClass(), "last", null);
        setField(term165227, term165227.getClass(), "propListHead", null);
        setIntField(term165227, term165227.getClass(), "sourcePosition", 0);
        setField(term165227, term165227.getClass(), "jsType", null);
        setField(term165227, term165227.getClass(), "parent", null);
        setField(term165224, term165224.getClass(), "last", term165227);
        setField(term165224, term165224.getClass(), "propListHead", null);
        setIntField(term165224, term165224.getClass(), "sourcePosition", 0);
        setField(term165224, term165224.getClass(), "jsType", null);
        setField(term165224, term165224.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term164825;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term164733, args);
        assertTrue(recursiveEquals(term164733, term165223));
        assertTrue(recursiveEquals(term164825, term165224));
        assertTrue(recursiveEquals(retValue, null));
    }

};


