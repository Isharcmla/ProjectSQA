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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943753 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term224099;
     Object term224191;
     Object term224515;
     Object term224516;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943753() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term224099 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term224191 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term224283 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term224375 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setIntField(term224191, term224191.getClass(), "type", 46);
        setField(term224191, term224191.getClass(), "first", term224191);
        setIntField(term224283, term224283.getClass(), "type", -33554991);
        setField(term224283, term224283.getClass(), "jsType", null);
        setField(term224191, term224191.getClass(), "last", term224283);
        setField(term224191, term224191.getClass(), "jsType", term224375);
        term224515 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term224515, term224515.getClass(), "INEQ", null);
        setField(term224515, term224515.getClass(), "convention", null);
        setField(term224515, term224515.getClass(), "typeRegistry", null);
        setField(term224515, term224515.getClass(), "firstLink", null);
        setField(term224515, term224515.getClass(), "nextLink", null);
        setField(term224515, term224515.getClass(), "restrictUndefinedVisitor", null);
        setField(term224515, term224515.getClass(), "restrictNullVisitor", null);
        term224516 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term224517 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term224518 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setDoubleField(term224516, term224516.getClass(), "number", 0.0);
        setIntField(term224516, term224516.getClass(), "type", 46);
        setField(term224516, term224516.getClass(), "next", null);
        setField(term224516, term224516.getClass(), "first", term224516);
        setDoubleField(term224517, term224517.getClass(), "number", 0.0);
        setIntField(term224517, term224517.getClass(), "type", -33554991);
        setField(term224517, term224517.getClass(), "next", null);
        setField(term224517, term224517.getClass(), "first", null);
        setField(term224517, term224517.getClass(), "last", null);
        setField(term224517, term224517.getClass(), "propListHead", null);
        setIntField(term224517, term224517.getClass(), "sourcePosition", 0);
        setField(term224517, term224517.getClass(), "jsType", null);
        setField(term224517, term224517.getClass(), "parent", null);
        setField(term224516, term224516.getClass(), "last", term224517);
        setField(term224516, term224516.getClass(), "propListHead", null);
        setIntField(term224516, term224516.getClass(), "sourcePosition", 0);
        setField(term224518, term224518.getClass(), "source", null);
        setField(term224518, term224518.getClass(), "elementsType", null);
        setField(term224518, term224518.getClass(), "elements", null);
        setField(term224518, term224518.getClass(), "className", null);
        setField(term224518, term224518.getClass(), "properties", null);
        setBooleanField(term224518, term224518.getClass(), "nativeType", false);
        setField(term224518, term224518.getClass(), "implicitPrototypeFallback", null);
        setField(term224518, term224518.getClass(), "ownerFunction", null);
        setBooleanField(term224518, term224518.getClass(), "prettyPrint", false);
        setBooleanField(term224518, term224518.getClass(), "visited", false);
        setField(term224518, term224518.getClass(), "docInfo", null);
        setBooleanField(term224518, term224518.getClass(), "unknown", false);
        setBooleanField(term224518, term224518.getClass(), "resolved", false);
        setField(term224518, term224518.getClass(), "resolveResult", null);
        setBooleanField(term224518, term224518.getClass(), "inTemplatedCheckVisit", false);
        setField(term224518, term224518.getClass(), "registry", null);
        setField(term224516, term224516.getClass(), "jsType", term224518);
        setField(term224516, term224516.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term224191;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term224099, args);
        assertTrue(recursiveEquals(term224099, term224515));
        assertTrue(recursiveEquals(term224191, term224516));
        assertTrue(recursiveEquals(retValue, null));
    }

};


