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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943891 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term282355;
     Object term282447;
     Object term282862;
     Object term282863;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943891() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term282355 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term282447 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term282539 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term282643 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term282735 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term282447, term282447.getClass(), "type", 46);
        setIntField(term282539, term282539.getClass(), "type", 0);
        setField(term282539, term282539.getClass(), "jsType", term282643);
        setField(term282447, term282447.getClass(), "first", term282539);
        setIntField(term282735, term282735.getClass(), "type", 46);
        setField(term282735, term282735.getClass(), "jsType", null);
        setField(term282447, term282447.getClass(), "last", term282735);
        term282862 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term282862, term282862.getClass(), "INEQ", null);
        setField(term282862, term282862.getClass(), "convention", null);
        setField(term282862, term282862.getClass(), "typeRegistry", null);
        setField(term282862, term282862.getClass(), "firstLink", null);
        setField(term282862, term282862.getClass(), "nextLink", null);
        setField(term282862, term282862.getClass(), "restrictUndefinedVisitor", null);
        setField(term282862, term282862.getClass(), "restrictNullVisitor", null);
        term282863 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term282864 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term282865 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term282866 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term282863, term282863.getClass(), "number", 0.0);
        setIntField(term282863, term282863.getClass(), "type", 46);
        setField(term282863, term282863.getClass(), "next", null);
        setField(term282864, term282864.getClass(), "str", null);
        setIntField(term282864, term282864.getClass(), "type", 0);
        setField(term282864, term282864.getClass(), "next", null);
        setField(term282864, term282864.getClass(), "first", null);
        setField(term282864, term282864.getClass(), "last", null);
        setField(term282864, term282864.getClass(), "propListHead", null);
        setIntField(term282864, term282864.getClass(), "sourcePosition", 0);
        setField(term282865, term282865.getClass(), "call", null);
        setField(term282865, term282865.getClass(), "prototypeSlot", null);
        setField(term282865, term282865.getClass(), "kind", null);
        setField(term282865, term282865.getClass(), "typeOfThis", null);
        setField(term282865, term282865.getClass(), "source", null);
        setField(term282865, term282865.getClass(), "implementedInterfaces", null);
        setField(term282865, term282865.getClass(), "extendedInterfaces", null);
        setField(term282865, term282865.getClass(), "subTypes", null);
        setField(term282865, term282865.getClass(), "templateTypeNames", null);
        setField(term282865, term282865.getClass(), "className", null);
        setField(term282865, term282865.getClass(), "properties", null);
        setBooleanField(term282865, term282865.getClass(), "nativeType", false);
        setField(term282865, term282865.getClass(), "implicitPrototypeFallback", null);
        setField(term282865, term282865.getClass(), "ownerFunction", null);
        setBooleanField(term282865, term282865.getClass(), "prettyPrint", false);
        setBooleanField(term282865, term282865.getClass(), "visited", false);
        setField(term282865, term282865.getClass(), "docInfo", null);
        setBooleanField(term282865, term282865.getClass(), "unknown", false);
        setBooleanField(term282865, term282865.getClass(), "resolved", false);
        setField(term282865, term282865.getClass(), "resolveResult", null);
        setBooleanField(term282865, term282865.getClass(), "inTemplatedCheckVisit", false);
        setField(term282865, term282865.getClass(), "registry", null);
        setField(term282864, term282864.getClass(), "jsType", term282865);
        setField(term282864, term282864.getClass(), "parent", null);
        setField(term282863, term282863.getClass(), "first", term282864);
        setDoubleField(term282866, term282866.getClass(), "number", 0.0);
        setIntField(term282866, term282866.getClass(), "type", 46);
        setField(term282866, term282866.getClass(), "next", null);
        setField(term282866, term282866.getClass(), "first", null);
        setField(term282866, term282866.getClass(), "last", null);
        setField(term282866, term282866.getClass(), "propListHead", null);
        setIntField(term282866, term282866.getClass(), "sourcePosition", 0);
        setField(term282866, term282866.getClass(), "jsType", null);
        setField(term282866, term282866.getClass(), "parent", null);
        setField(term282863, term282863.getClass(), "last", term282866);
        setField(term282863, term282863.getClass(), "propListHead", null);
        setIntField(term282863, term282863.getClass(), "sourcePosition", 0);
        setField(term282863, term282863.getClass(), "jsType", null);
        setField(term282863, term282863.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term282447;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term282355, args);
        assertTrue(recursiveEquals(term282355, term282862));
        assertTrue(recursiveEquals(term282447, term282863));
        assertTrue(recursiveEquals(retValue, null));
    }

};


