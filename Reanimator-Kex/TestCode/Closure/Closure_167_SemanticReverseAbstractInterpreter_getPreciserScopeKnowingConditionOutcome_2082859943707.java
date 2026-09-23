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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943707 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term205804;
     Object term206042;
     Object term206298;
     Object term206300;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943707() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term205804 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object term205950 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter$3"));
        setField(term205804, term205804.getClass(), "INEQ", term205950);
        term206042 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term206134 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term206230 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        setIntField(term206042, term206042.getClass(), "type", 14);
        setIntField(term206134, term206134.getClass(), "type", 14);
        setField(term206134, term206134.getClass(), "jsType", term206230);
        setField(term206042, term206042.getClass(), "first", term206134);
        setField(term206042, term206042.getClass(), "last", term206042);
        term206298 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object term206299 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter$3"));
        setField(term206298, term206298.getClass(), "INEQ", term206299);
        setField(term206298, term206298.getClass(), "convention", null);
        setField(term206298, term206298.getClass(), "typeRegistry", null);
        setField(term206298, term206298.getClass(), "firstLink", null);
        setField(term206298, term206298.getClass(), "nextLink", null);
        setField(term206298, term206298.getClass(), "restrictUndefinedVisitor", null);
        setField(term206298, term206298.getClass(), "restrictNullVisitor", null);
        term206300 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term206301 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term206302 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        setDoubleField(term206300, term206300.getClass(), "number", 0.0);
        setIntField(term206300, term206300.getClass(), "type", 14);
        setField(term206300, term206300.getClass(), "next", null);
        setDoubleField(term206301, term206301.getClass(), "number", 0.0);
        setIntField(term206301, term206301.getClass(), "type", 14);
        setField(term206301, term206301.getClass(), "next", null);
        setField(term206301, term206301.getClass(), "first", null);
        setField(term206301, term206301.getClass(), "last", null);
        setField(term206301, term206301.getClass(), "propListHead", null);
        setIntField(term206301, term206301.getClass(), "sourcePosition", 0);
        setBooleanField(term206302, term206302.getClass(), "resolved", false);
        setField(term206302, term206302.getClass(), "resolveResult", null);
        setBooleanField(term206302, term206302.getClass(), "inTemplatedCheckVisit", false);
        setField(term206302, term206302.getClass(), "registry", null);
        setField(term206301, term206301.getClass(), "jsType", term206302);
        setField(term206301, term206301.getClass(), "parent", null);
        setField(term206300, term206300.getClass(), "first", term206301);
        setField(term206300, term206300.getClass(), "last", term206300);
        setField(term206300, term206300.getClass(), "propListHead", null);
        setIntField(term206300, term206300.getClass(), "sourcePosition", 0);
        setField(term206300, term206300.getClass(), "jsType", null);
        setField(term206300, term206300.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term206042;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term205804, args);
        assertTrue(recursiveEquals(term205804, term206298));
        assertTrue(recursiveEquals(term206042, term206300));
        assertTrue(recursiveEquals(retValue, null));
    }

};


