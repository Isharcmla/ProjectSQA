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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943465 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124054;
     Object term124146;
     Object term125423;
     Object term125424;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943465() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term124054 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term124146 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term124238 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term124344 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        Object term124414 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term124146, term124146.getClass(), "type", 46);
        setIntField(term124238, term124238.getClass(), "type", -458799);
        setField(term124238, term124238.getClass(), "jsType", term124344);
        setField(term124146, term124146.getClass(), "first", term124238);
        setIntField(term124414, term124414.getClass(), "type", 46);
        setField(term124414, term124414.getClass(), "jsType", null);
        setField(term124146, term124146.getClass(), "last", term124414);
        term125423 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term125423, term125423.getClass(), "INEQ", null);
        setField(term125423, term125423.getClass(), "convention", null);
        setField(term125423, term125423.getClass(), "typeRegistry", null);
        setField(term125423, term125423.getClass(), "firstLink", null);
        setField(term125423, term125423.getClass(), "nextLink", null);
        setField(term125423, term125423.getClass(), "restrictUndefinedVisitor", null);
        setField(term125423, term125423.getClass(), "restrictNullVisitor", null);
        term125424 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term125425 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term125426 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        Object term125427 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term125424, term125424.getClass(), "str", null);
        setIntField(term125424, term125424.getClass(), "type", 46);
        setField(term125424, term125424.getClass(), "next", null);
        setDoubleField(term125425, term125425.getClass(), "number", 0.0);
        setIntField(term125425, term125425.getClass(), "type", -458799);
        setField(term125425, term125425.getClass(), "next", null);
        setField(term125425, term125425.getClass(), "first", null);
        setField(term125425, term125425.getClass(), "last", null);
        setField(term125425, term125425.getClass(), "propListHead", null);
        setIntField(term125425, term125425.getClass(), "sourcePosition", 0);
        setField(term125426, term125426.getClass(), "referencedType", null);
        setField(term125426, term125426.getClass(), "referencedObjType", null);
        setBooleanField(term125426, term125426.getClass(), "visited", false);
        setField(term125426, term125426.getClass(), "docInfo", null);
        setBooleanField(term125426, term125426.getClass(), "unknown", false);
        setBooleanField(term125426, term125426.getClass(), "resolved", false);
        setField(term125426, term125426.getClass(), "resolveResult", null);
        setBooleanField(term125426, term125426.getClass(), "inTemplatedCheckVisit", false);
        setField(term125426, term125426.getClass(), "registry", null);
        setField(term125425, term125425.getClass(), "jsType", term125426);
        setField(term125425, term125425.getClass(), "parent", null);
        setField(term125424, term125424.getClass(), "first", term125425);
        setIntField(term125427, term125427.getClass(), "type", 46);
        setField(term125427, term125427.getClass(), "next", null);
        setField(term125427, term125427.getClass(), "first", null);
        setField(term125427, term125427.getClass(), "last", null);
        setField(term125427, term125427.getClass(), "propListHead", null);
        setIntField(term125427, term125427.getClass(), "sourcePosition", 0);
        setField(term125427, term125427.getClass(), "jsType", null);
        setField(term125427, term125427.getClass(), "parent", null);
        setField(term125424, term125424.getClass(), "last", term125427);
        setField(term125424, term125424.getClass(), "propListHead", null);
        setIntField(term125424, term125424.getClass(), "sourcePosition", 0);
        setField(term125424, term125424.getClass(), "jsType", null);
        setField(term125424, term125424.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term124146;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term124054, args);
        assertTrue(recursiveEquals(term124054, term125423));
        assertTrue(recursiveEquals(term124146, term125424));
        assertTrue(recursiveEquals(retValue, null));
    }

};


