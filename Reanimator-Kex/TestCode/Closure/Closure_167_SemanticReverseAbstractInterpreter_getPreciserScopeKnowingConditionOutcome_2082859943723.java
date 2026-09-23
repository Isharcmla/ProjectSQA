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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term212418;
     Object term212510;
     Object term212878;
     Object term212879;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term212418 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term212510 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term212602 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term212700 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        Object term212792 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term212510, term212510.getClass(), "type", 45);
        setIntField(term212602, term212602.getClass(), "type", 1078385728);
        setField(term212602, term212602.getClass(), "jsType", term212700);
        setField(term212510, term212510.getClass(), "first", term212602);
        setIntField(term212792, term212792.getClass(), "type", -1078385729);
        setField(term212792, term212792.getClass(), "jsType", null);
        setField(term212510, term212510.getClass(), "last", term212792);
        term212878 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term212878, term212878.getClass(), "INEQ", null);
        setField(term212878, term212878.getClass(), "convention", null);
        setField(term212878, term212878.getClass(), "typeRegistry", null);
        setField(term212878, term212878.getClass(), "firstLink", null);
        setField(term212878, term212878.getClass(), "nextLink", null);
        setField(term212878, term212878.getClass(), "restrictUndefinedVisitor", null);
        setField(term212878, term212878.getClass(), "restrictNullVisitor", null);
        term212879 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term212880 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term212881 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        Object term212882 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term212879, term212879.getClass(), "number", 0.0);
        setIntField(term212879, term212879.getClass(), "type", 45);
        setField(term212879, term212879.getClass(), "next", null);
        setField(term212880, term212880.getClass(), "str", null);
        setIntField(term212880, term212880.getClass(), "type", 1078385728);
        setField(term212880, term212880.getClass(), "next", null);
        setField(term212880, term212880.getClass(), "first", null);
        setField(term212880, term212880.getClass(), "last", null);
        setField(term212880, term212880.getClass(), "propListHead", null);
        setIntField(term212880, term212880.getClass(), "sourcePosition", 0);
        setBooleanField(term212881, term212881.getClass(), "resolved", false);
        setField(term212881, term212881.getClass(), "resolveResult", null);
        setBooleanField(term212881, term212881.getClass(), "inTemplatedCheckVisit", false);
        setField(term212881, term212881.getClass(), "registry", null);
        setField(term212880, term212880.getClass(), "jsType", term212881);
        setField(term212880, term212880.getClass(), "parent", null);
        setField(term212879, term212879.getClass(), "first", term212880);
        setField(term212882, term212882.getClass(), "str", null);
        setIntField(term212882, term212882.getClass(), "type", -1078385729);
        setField(term212882, term212882.getClass(), "next", null);
        setField(term212882, term212882.getClass(), "first", null);
        setField(term212882, term212882.getClass(), "last", null);
        setField(term212882, term212882.getClass(), "propListHead", null);
        setIntField(term212882, term212882.getClass(), "sourcePosition", 0);
        setField(term212882, term212882.getClass(), "jsType", null);
        setField(term212882, term212882.getClass(), "parent", null);
        setField(term212879, term212879.getClass(), "last", term212882);
        setField(term212879, term212879.getClass(), "propListHead", null);
        setIntField(term212879, term212879.getClass(), "sourcePosition", 0);
        setField(term212879, term212879.getClass(), "jsType", null);
        setField(term212879, term212879.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term212510;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term212418, args);
        assertTrue(recursiveEquals(term212418, term212878));
        assertTrue(recursiveEquals(term212510, term212879));
        assertTrue(recursiveEquals(retValue, null));
    }

};


