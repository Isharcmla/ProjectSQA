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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943347 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90090;
     Object term90182;
     Object term90606;
     Object term90607;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943347() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90090 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term90182 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term90274 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term90370 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term90462 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term90182, term90182.getClass(), "type", 12);
        setIntField(term90274, term90274.getClass(), "type", 12);
        setField(term90274, term90274.getClass(), "jsType", term90370);
        setField(term90182, term90182.getClass(), "first", term90274);
        setIntField(term90462, term90462.getClass(), "type", 0);
        setField(term90462, term90462.getClass(), "jsType", null);
        setField(term90182, term90182.getClass(), "last", term90462);
        term90606 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term90606, term90606.getClass(), "INEQ", null);
        setField(term90606, term90606.getClass(), "convention", null);
        setField(term90606, term90606.getClass(), "typeRegistry", null);
        setField(term90606, term90606.getClass(), "firstLink", null);
        setField(term90606, term90606.getClass(), "nextLink", null);
        setField(term90606, term90606.getClass(), "restrictUndefinedVisitor", null);
        setField(term90606, term90606.getClass(), "restrictNullVisitor", null);
        term90607 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term90608 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term90609 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term90610 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term90607, term90607.getClass(), "str", null);
        setIntField(term90607, term90607.getClass(), "type", 12);
        setField(term90607, term90607.getClass(), "next", null);
        setField(term90608, term90608.getClass(), "str", null);
        setIntField(term90608, term90608.getClass(), "type", 12);
        setField(term90608, term90608.getClass(), "next", null);
        setField(term90608, term90608.getClass(), "first", null);
        setField(term90608, term90608.getClass(), "last", null);
        setField(term90608, term90608.getClass(), "propListHead", null);
        setIntField(term90608, term90608.getClass(), "sourcePosition", 0);
        setField(term90609, term90609.getClass(), "properties", null);
        setBooleanField(term90609, term90609.getClass(), "declared", false);
        setBooleanField(term90609, term90609.getClass(), "isFrozen", false);
        setField(term90609, term90609.getClass(), "className", null);
        setField(term90609, term90609.getClass(), "properties", null);
        setBooleanField(term90609, term90609.getClass(), "nativeType", false);
        setField(term90609, term90609.getClass(), "implicitPrototypeFallback", null);
        setField(term90609, term90609.getClass(), "ownerFunction", null);
        setBooleanField(term90609, term90609.getClass(), "prettyPrint", false);
        setBooleanField(term90609, term90609.getClass(), "visited", false);
        setField(term90609, term90609.getClass(), "docInfo", null);
        setBooleanField(term90609, term90609.getClass(), "unknown", false);
        setBooleanField(term90609, term90609.getClass(), "resolved", false);
        setField(term90609, term90609.getClass(), "resolveResult", null);
        setBooleanField(term90609, term90609.getClass(), "inTemplatedCheckVisit", false);
        setField(term90609, term90609.getClass(), "registry", null);
        setField(term90608, term90608.getClass(), "jsType", term90609);
        setField(term90608, term90608.getClass(), "parent", null);
        setField(term90607, term90607.getClass(), "first", term90608);
        setDoubleField(term90610, term90610.getClass(), "number", 0.0);
        setIntField(term90610, term90610.getClass(), "type", 0);
        setField(term90610, term90610.getClass(), "next", null);
        setField(term90610, term90610.getClass(), "first", null);
        setField(term90610, term90610.getClass(), "last", null);
        setField(term90610, term90610.getClass(), "propListHead", null);
        setIntField(term90610, term90610.getClass(), "sourcePosition", 0);
        setField(term90610, term90610.getClass(), "jsType", null);
        setField(term90610, term90610.getClass(), "parent", null);
        setField(term90607, term90607.getClass(), "last", term90610);
        setField(term90607, term90607.getClass(), "propListHead", null);
        setIntField(term90607, term90607.getClass(), "sourcePosition", 0);
        setField(term90607, term90607.getClass(), "jsType", null);
        setField(term90607, term90607.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term90182;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term90090, args);
        assertTrue(recursiveEquals(term90090, term90606));
        assertTrue(recursiveEquals(term90182, term90607));
        assertTrue(recursiveEquals(retValue, null));
    }

};


