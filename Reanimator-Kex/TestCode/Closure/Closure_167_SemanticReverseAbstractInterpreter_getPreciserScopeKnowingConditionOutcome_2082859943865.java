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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943865 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term270447;
     Object term270539;
     Object term270934;
     Object term270935;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943865() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term270447 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term270539 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term270631 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term270729 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        Object term270821 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term270539, term270539.getClass(), "type", 12);
        setIntField(term270631, term270631.getClass(), "type", 1078385728);
        setField(term270631, term270631.getClass(), "jsType", term270729);
        setField(term270539, term270539.getClass(), "first", term270631);
        setIntField(term270821, term270821.getClass(), "type", -1078385729);
        setField(term270821, term270821.getClass(), "jsType", null);
        setField(term270539, term270539.getClass(), "last", term270821);
        term270934 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term270934, term270934.getClass(), "INEQ", null);
        setField(term270934, term270934.getClass(), "convention", null);
        setField(term270934, term270934.getClass(), "typeRegistry", null);
        setField(term270934, term270934.getClass(), "firstLink", null);
        setField(term270934, term270934.getClass(), "nextLink", null);
        setField(term270934, term270934.getClass(), "restrictUndefinedVisitor", null);
        setField(term270934, term270934.getClass(), "restrictNullVisitor", null);
        term270935 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term270936 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term270937 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        Object term270938 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term270935, term270935.getClass(), "number", 0.0);
        setIntField(term270935, term270935.getClass(), "type", 12);
        setField(term270935, term270935.getClass(), "next", null);
        setField(term270936, term270936.getClass(), "str", null);
        setIntField(term270936, term270936.getClass(), "type", 1078385728);
        setField(term270936, term270936.getClass(), "next", null);
        setField(term270936, term270936.getClass(), "first", null);
        setField(term270936, term270936.getClass(), "last", null);
        setField(term270936, term270936.getClass(), "propListHead", null);
        setIntField(term270936, term270936.getClass(), "sourcePosition", 0);
        setBooleanField(term270937, term270937.getClass(), "isChecked", false);
        setBooleanField(term270937, term270937.getClass(), "visited", false);
        setField(term270937, term270937.getClass(), "docInfo", null);
        setBooleanField(term270937, term270937.getClass(), "unknown", false);
        setBooleanField(term270937, term270937.getClass(), "resolved", false);
        setField(term270937, term270937.getClass(), "resolveResult", null);
        setBooleanField(term270937, term270937.getClass(), "inTemplatedCheckVisit", false);
        setField(term270937, term270937.getClass(), "registry", null);
        setField(term270936, term270936.getClass(), "jsType", term270937);
        setField(term270936, term270936.getClass(), "parent", null);
        setField(term270935, term270935.getClass(), "first", term270936);
        setField(term270938, term270938.getClass(), "str", null);
        setIntField(term270938, term270938.getClass(), "type", -1078385729);
        setField(term270938, term270938.getClass(), "next", null);
        setField(term270938, term270938.getClass(), "first", null);
        setField(term270938, term270938.getClass(), "last", null);
        setField(term270938, term270938.getClass(), "propListHead", null);
        setIntField(term270938, term270938.getClass(), "sourcePosition", 0);
        setField(term270938, term270938.getClass(), "jsType", null);
        setField(term270938, term270938.getClass(), "parent", null);
        setField(term270935, term270935.getClass(), "last", term270938);
        setField(term270935, term270935.getClass(), "propListHead", null);
        setIntField(term270935, term270935.getClass(), "sourcePosition", 0);
        setField(term270935, term270935.getClass(), "jsType", null);
        setField(term270935, term270935.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term270539;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term270447, args);
        assertTrue(recursiveEquals(term270447, term270934));
        assertTrue(recursiveEquals(term270539, term270935));
        assertTrue(recursiveEquals(retValue, null));
    }

};


