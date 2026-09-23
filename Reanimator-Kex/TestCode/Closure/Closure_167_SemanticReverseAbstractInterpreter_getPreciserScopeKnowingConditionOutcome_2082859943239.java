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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57688;
     Object term57758;
     Object term57955;
     Object term57956;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57688 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term57758 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57828 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57898 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term57758, term57758.getClass(), "type", 45);
        setIntField(term57828, term57828.getClass(), "type", 45);
        setField(term57758, term57758.getClass(), "first", term57828);
        setIntField(term57898, term57898.getClass(), "type", 45);
        setField(term57758, term57758.getClass(), "last", term57898);
        term57955 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term57955, term57955.getClass(), "INEQ", null);
        setField(term57955, term57955.getClass(), "convention", null);
        setField(term57955, term57955.getClass(), "typeRegistry", null);
        setField(term57955, term57955.getClass(), "firstLink", null);
        setField(term57955, term57955.getClass(), "nextLink", null);
        setField(term57955, term57955.getClass(), "restrictUndefinedVisitor", null);
        setField(term57955, term57955.getClass(), "restrictNullVisitor", null);
        term57956 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57957 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57958 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term57956, term57956.getClass(), "type", 45);
        setField(term57956, term57956.getClass(), "next", null);
        setIntField(term57957, term57957.getClass(), "type", 45);
        setField(term57957, term57957.getClass(), "next", null);
        setField(term57957, term57957.getClass(), "first", null);
        setField(term57957, term57957.getClass(), "last", null);
        setField(term57957, term57957.getClass(), "propListHead", null);
        setIntField(term57957, term57957.getClass(), "sourcePosition", 0);
        setField(term57957, term57957.getClass(), "jsType", null);
        setField(term57957, term57957.getClass(), "parent", null);
        setField(term57956, term57956.getClass(), "first", term57957);
        setIntField(term57958, term57958.getClass(), "type", 45);
        setField(term57958, term57958.getClass(), "next", null);
        setField(term57958, term57958.getClass(), "first", null);
        setField(term57958, term57958.getClass(), "last", null);
        setField(term57958, term57958.getClass(), "propListHead", null);
        setIntField(term57958, term57958.getClass(), "sourcePosition", 0);
        setField(term57958, term57958.getClass(), "jsType", null);
        setField(term57958, term57958.getClass(), "parent", null);
        setField(term57956, term57956.getClass(), "last", term57958);
        setField(term57956, term57956.getClass(), "propListHead", null);
        setIntField(term57956, term57956.getClass(), "sourcePosition", 0);
        setField(term57956, term57956.getClass(), "jsType", null);
        setField(term57956, term57956.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term57758;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term57688, args);
        assertTrue(recursiveEquals(term57688, term57955));
        assertTrue(recursiveEquals(term57758, term57956));
        assertTrue(recursiveEquals(retValue, null));
    }

};


