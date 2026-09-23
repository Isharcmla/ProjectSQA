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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943789 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term237895;
     Object term237987;
     Object term238403;
     Object term238404;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943789() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term237895 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term237987 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term238079 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term238189 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term238281 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term237987, term237987.getClass(), "type", 46);
        setIntField(term238079, term238079.getClass(), "type", 1078385728);
        setField(term238079, term238079.getClass(), "jsType", term238189);
        setField(term237987, term237987.getClass(), "first", term238079);
        setIntField(term238281, term238281.getClass(), "type", -1078385729);
        setField(term238281, term238281.getClass(), "jsType", null);
        setField(term237987, term237987.getClass(), "last", term238281);
        term238403 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term238403, term238403.getClass(), "INEQ", null);
        setField(term238403, term238403.getClass(), "convention", null);
        setField(term238403, term238403.getClass(), "typeRegistry", null);
        setField(term238403, term238403.getClass(), "firstLink", null);
        setField(term238403, term238403.getClass(), "nextLink", null);
        setField(term238403, term238403.getClass(), "restrictUndefinedVisitor", null);
        setField(term238403, term238403.getClass(), "restrictNullVisitor", null);
        term238404 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term238405 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term238406 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term238407 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term238404, term238404.getClass(), "number", 0.0);
        setIntField(term238404, term238404.getClass(), "type", 46);
        setField(term238404, term238404.getClass(), "next", null);
        setField(term238405, term238405.getClass(), "str", null);
        setIntField(term238405, term238405.getClass(), "type", 1078385728);
        setField(term238405, term238405.getClass(), "next", null);
        setField(term238405, term238405.getClass(), "first", null);
        setField(term238405, term238405.getClass(), "last", null);
        setField(term238405, term238405.getClass(), "propListHead", null);
        setIntField(term238405, term238405.getClass(), "sourcePosition", 0);
        setField(term238406, term238406.getClass(), "call", null);
        setField(term238406, term238406.getClass(), "prototypeSlot", null);
        setField(term238406, term238406.getClass(), "kind", null);
        setField(term238406, term238406.getClass(), "typeOfThis", null);
        setField(term238406, term238406.getClass(), "source", null);
        setField(term238406, term238406.getClass(), "implementedInterfaces", null);
        setField(term238406, term238406.getClass(), "extendedInterfaces", null);
        setField(term238406, term238406.getClass(), "subTypes", null);
        setField(term238406, term238406.getClass(), "templateTypeNames", null);
        setField(term238406, term238406.getClass(), "className", null);
        setField(term238406, term238406.getClass(), "properties", null);
        setBooleanField(term238406, term238406.getClass(), "nativeType", false);
        setField(term238406, term238406.getClass(), "implicitPrototypeFallback", null);
        setField(term238406, term238406.getClass(), "ownerFunction", null);
        setBooleanField(term238406, term238406.getClass(), "prettyPrint", false);
        setBooleanField(term238406, term238406.getClass(), "visited", false);
        setField(term238406, term238406.getClass(), "docInfo", null);
        setBooleanField(term238406, term238406.getClass(), "unknown", false);
        setBooleanField(term238406, term238406.getClass(), "resolved", false);
        setField(term238406, term238406.getClass(), "resolveResult", null);
        setBooleanField(term238406, term238406.getClass(), "inTemplatedCheckVisit", false);
        setField(term238406, term238406.getClass(), "registry", null);
        setField(term238405, term238405.getClass(), "jsType", term238406);
        setField(term238405, term238405.getClass(), "parent", null);
        setField(term238404, term238404.getClass(), "first", term238405);
        setField(term238407, term238407.getClass(), "str", null);
        setIntField(term238407, term238407.getClass(), "type", -1078385729);
        setField(term238407, term238407.getClass(), "next", null);
        setField(term238407, term238407.getClass(), "first", null);
        setField(term238407, term238407.getClass(), "last", null);
        setField(term238407, term238407.getClass(), "propListHead", null);
        setIntField(term238407, term238407.getClass(), "sourcePosition", 0);
        setField(term238407, term238407.getClass(), "jsType", null);
        setField(term238407, term238407.getClass(), "parent", null);
        setField(term238404, term238404.getClass(), "last", term238407);
        setField(term238404, term238404.getClass(), "propListHead", null);
        setIntField(term238404, term238404.getClass(), "sourcePosition", 0);
        setField(term238404, term238404.getClass(), "jsType", null);
        setField(term238404, term238404.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term237987;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term237895, args);
        assertTrue(recursiveEquals(term237895, term238403));
        assertTrue(recursiveEquals(term237987, term238404));
        assertTrue(recursiveEquals(retValue, null));
    }

};


