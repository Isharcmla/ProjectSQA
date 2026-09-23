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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_208285994338 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6394;
     Object term6464;
     Object term6955;
     Object term6956;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_208285994338() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6394 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term6464 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term6464, term6464.getClass(), "type", 17);
        term6955 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term6955, term6955.getClass(), "INEQ", null);
        setField(term6955, term6955.getClass(), "convention", null);
        setField(term6955, term6955.getClass(), "typeRegistry", null);
        setField(term6955, term6955.getClass(), "firstLink", null);
        setField(term6955, term6955.getClass(), "nextLink", null);
        setField(term6955, term6955.getClass(), "restrictUndefinedVisitor", null);
        setField(term6955, term6955.getClass(), "restrictNullVisitor", null);
        term6956 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term6956, term6956.getClass(), "type", 17);
        setField(term6956, term6956.getClass(), "next", null);
        setField(term6956, term6956.getClass(), "first", null);
        setField(term6956, term6956.getClass(), "last", null);
        setField(term6956, term6956.getClass(), "propListHead", null);
        setIntField(term6956, term6956.getClass(), "sourcePosition", 0);
        setField(term6956, term6956.getClass(), "jsType", null);
        setField(term6956, term6956.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term6464;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term6394, args);
        assertTrue(recursiveEquals(term6394, term6955));
        assertTrue(recursiveEquals(term6464, term6956));
        assertTrue(recursiveEquals(retValue, null));
    }

};


