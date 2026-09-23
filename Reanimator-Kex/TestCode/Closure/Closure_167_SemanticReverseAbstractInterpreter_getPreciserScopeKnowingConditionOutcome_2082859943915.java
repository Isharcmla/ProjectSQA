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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term297286;
     Object term297378;
     Object term297877;
     Object term297878;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term297286 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term297378 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term297470 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term297584 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term297676 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term297378, term297378.getClass(), "type", 46);
        setIntField(term297470, term297470.getClass(), "type", 0);
        setField(term297470, term297470.getClass(), "jsType", term297584);
        setField(term297378, term297378.getClass(), "first", term297470);
        setIntField(term297676, term297676.getClass(), "type", 0);
        setField(term297676, term297676.getClass(), "jsType", term297584);
        setField(term297378, term297378.getClass(), "last", term297676);
        term297877 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term297877, term297877.getClass(), "INEQ", null);
        setField(term297877, term297877.getClass(), "convention", null);
        setField(term297877, term297877.getClass(), "typeRegistry", null);
        setField(term297877, term297877.getClass(), "firstLink", null);
        setField(term297877, term297877.getClass(), "nextLink", null);
        setField(term297877, term297877.getClass(), "restrictUndefinedVisitor", null);
        setField(term297877, term297877.getClass(), "restrictNullVisitor", null);
        term297878 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term297879 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term297880 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term297881 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term297878, term297878.getClass(), "number", 0.0);
        setIntField(term297878, term297878.getClass(), "type", 46);
        setField(term297878, term297878.getClass(), "next", null);
        setField(term297879, term297879.getClass(), "str", null);
        setIntField(term297879, term297879.getClass(), "type", 0);
        setField(term297879, term297879.getClass(), "next", null);
        setField(term297879, term297879.getClass(), "first", null);
        setField(term297879, term297879.getClass(), "last", null);
        setField(term297879, term297879.getClass(), "propListHead", null);
        setIntField(term297879, term297879.getClass(), "sourcePosition", 0);
        setField(term297880, term297880.getClass(), "className", null);
        setField(term297880, term297880.getClass(), "properties", null);
        setBooleanField(term297880, term297880.getClass(), "nativeType", false);
        setField(term297880, term297880.getClass(), "implicitPrototypeFallback", null);
        setField(term297880, term297880.getClass(), "ownerFunction", null);
        setBooleanField(term297880, term297880.getClass(), "prettyPrint", false);
        setBooleanField(term297880, term297880.getClass(), "visited", false);
        setField(term297880, term297880.getClass(), "docInfo", null);
        setBooleanField(term297880, term297880.getClass(), "unknown", false);
        setBooleanField(term297880, term297880.getClass(), "resolved", false);
        setField(term297880, term297880.getClass(), "resolveResult", null);
        setBooleanField(term297880, term297880.getClass(), "inTemplatedCheckVisit", false);
        setField(term297880, term297880.getClass(), "registry", null);
        setField(term297879, term297879.getClass(), "jsType", term297880);
        setField(term297879, term297879.getClass(), "parent", null);
        setField(term297878, term297878.getClass(), "first", term297879);
        setField(term297881, term297881.getClass(), "str", null);
        setIntField(term297881, term297881.getClass(), "type", 0);
        setField(term297881, term297881.getClass(), "next", null);
        setField(term297881, term297881.getClass(), "first", null);
        setField(term297881, term297881.getClass(), "last", null);
        setField(term297881, term297881.getClass(), "propListHead", null);
        setIntField(term297881, term297881.getClass(), "sourcePosition", 0);
        setField(term297881, term297881.getClass(), "jsType", term297880);
        setField(term297881, term297881.getClass(), "parent", null);
        setField(term297878, term297878.getClass(), "last", term297881);
        setField(term297878, term297878.getClass(), "propListHead", null);
        setIntField(term297878, term297878.getClass(), "sourcePosition", 0);
        setField(term297878, term297878.getClass(), "jsType", null);
        setField(term297878, term297878.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term297378;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term297286, args);
        assertTrue(recursiveEquals(term297286, term297877));
        assertTrue(recursiveEquals(term297378, term297878));
        assertTrue(recursiveEquals(retValue, null));
    }

};


