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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943785 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term236676;
     Object term236768;
     Object term237088;
     Object term237089;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943785() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term236676 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term236768 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term236860 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term236948 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setIntField(term236768, term236768.getClass(), "type", 45);
        setField(term236768, term236768.getClass(), "first", term236768);
        setIntField(term236860, term236860.getClass(), "type", -33554990);
        setField(term236860, term236860.getClass(), "jsType", null);
        setField(term236768, term236768.getClass(), "last", term236860);
        setField(term236768, term236768.getClass(), "jsType", term236948);
        term237088 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term237088, term237088.getClass(), "INEQ", null);
        setField(term237088, term237088.getClass(), "convention", null);
        setField(term237088, term237088.getClass(), "typeRegistry", null);
        setField(term237088, term237088.getClass(), "firstLink", null);
        setField(term237088, term237088.getClass(), "nextLink", null);
        setField(term237088, term237088.getClass(), "restrictUndefinedVisitor", null);
        setField(term237088, term237088.getClass(), "restrictNullVisitor", null);
        term237089 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term237090 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term237091 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setDoubleField(term237089, term237089.getClass(), "number", 0.0);
        setIntField(term237089, term237089.getClass(), "type", 45);
        setField(term237089, term237089.getClass(), "next", null);
        setField(term237089, term237089.getClass(), "first", term237089);
        setDoubleField(term237090, term237090.getClass(), "number", 0.0);
        setIntField(term237090, term237090.getClass(), "type", -33554990);
        setField(term237090, term237090.getClass(), "next", null);
        setField(term237090, term237090.getClass(), "first", null);
        setField(term237090, term237090.getClass(), "last", null);
        setField(term237090, term237090.getClass(), "propListHead", null);
        setIntField(term237090, term237090.getClass(), "sourcePosition", 0);
        setField(term237090, term237090.getClass(), "jsType", null);
        setField(term237090, term237090.getClass(), "parent", null);
        setField(term237089, term237089.getClass(), "last", term237090);
        setField(term237089, term237089.getClass(), "propListHead", null);
        setIntField(term237089, term237089.getClass(), "sourcePosition", 0);
        setField(term237091, term237091.getClass(), "call", null);
        setField(term237091, term237091.getClass(), "prototypeSlot", null);
        setField(term237091, term237091.getClass(), "kind", null);
        setField(term237091, term237091.getClass(), "typeOfThis", null);
        setField(term237091, term237091.getClass(), "source", null);
        setField(term237091, term237091.getClass(), "implementedInterfaces", null);
        setField(term237091, term237091.getClass(), "extendedInterfaces", null);
        setField(term237091, term237091.getClass(), "subTypes", null);
        setField(term237091, term237091.getClass(), "templateTypeNames", null);
        setField(term237091, term237091.getClass(), "className", null);
        setField(term237091, term237091.getClass(), "properties", null);
        setBooleanField(term237091, term237091.getClass(), "nativeType", false);
        setField(term237091, term237091.getClass(), "implicitPrototypeFallback", null);
        setField(term237091, term237091.getClass(), "ownerFunction", null);
        setBooleanField(term237091, term237091.getClass(), "prettyPrint", false);
        setBooleanField(term237091, term237091.getClass(), "visited", false);
        setField(term237091, term237091.getClass(), "docInfo", null);
        setBooleanField(term237091, term237091.getClass(), "unknown", false);
        setBooleanField(term237091, term237091.getClass(), "resolved", false);
        setField(term237091, term237091.getClass(), "resolveResult", null);
        setBooleanField(term237091, term237091.getClass(), "inTemplatedCheckVisit", false);
        setField(term237091, term237091.getClass(), "registry", null);
        setField(term237089, term237089.getClass(), "jsType", term237091);
        setField(term237089, term237089.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term236768;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term236676, args);
        assertTrue(recursiveEquals(term236676, term237088));
        assertTrue(recursiveEquals(term236768, term237089));
        assertTrue(recursiveEquals(retValue, null));
    }

};


