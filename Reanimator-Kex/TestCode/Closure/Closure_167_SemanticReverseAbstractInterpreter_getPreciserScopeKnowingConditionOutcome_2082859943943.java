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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943943 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term366696;
     Object term366788;
     Object term367383;
     Object term367384;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943943() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term366696 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term366788 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term366880 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term366980 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term367072 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term367160 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setIntField(term366788, term366788.getClass(), "type", 45);
        setIntField(term366880, term366880.getClass(), "type", 0);
        setField(term366880, term366880.getClass(), "jsType", term366980);
        setField(term366788, term366788.getClass(), "first", term366880);
        setIntField(term367072, term367072.getClass(), "type", 45);
        setField(term367072, term367072.getClass(), "jsType", term367160);
        setField(term366788, term366788.getClass(), "last", term367072);
        term367383 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term367383, term367383.getClass(), "INEQ", null);
        setField(term367383, term367383.getClass(), "convention", null);
        setField(term367383, term367383.getClass(), "typeRegistry", null);
        setField(term367383, term367383.getClass(), "firstLink", null);
        setField(term367383, term367383.getClass(), "nextLink", null);
        setField(term367383, term367383.getClass(), "restrictUndefinedVisitor", null);
        setField(term367383, term367383.getClass(), "restrictNullVisitor", null);
        term367384 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term367385 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term367386 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term367387 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term367388 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term367384, term367384.getClass(), "str", null);
        setIntField(term367384, term367384.getClass(), "type", 45);
        setField(term367384, term367384.getClass(), "next", null);
        setDoubleField(term367385, term367385.getClass(), "number", 0.0);
        setIntField(term367385, term367385.getClass(), "type", 0);
        setField(term367385, term367385.getClass(), "next", null);
        setField(term367385, term367385.getClass(), "first", null);
        setField(term367385, term367385.getClass(), "last", null);
        setField(term367385, term367385.getClass(), "propListHead", null);
        setIntField(term367385, term367385.getClass(), "sourcePosition", 0);
        setField(term367386, term367386.getClass(), "name", null);
        setField(term367386, term367386.getClass(), "referencedType", null);
        setField(term367386, term367386.getClass(), "referencedObjType", null);
        setBooleanField(term367386, term367386.getClass(), "visited", false);
        setField(term367386, term367386.getClass(), "docInfo", null);
        setBooleanField(term367386, term367386.getClass(), "unknown", false);
        setBooleanField(term367386, term367386.getClass(), "resolved", false);
        setField(term367386, term367386.getClass(), "resolveResult", null);
        setBooleanField(term367386, term367386.getClass(), "inTemplatedCheckVisit", false);
        setField(term367386, term367386.getClass(), "registry", null);
        setField(term367385, term367385.getClass(), "jsType", term367386);
        setField(term367385, term367385.getClass(), "parent", null);
        setField(term367384, term367384.getClass(), "first", term367385);
        setField(term367387, term367387.getClass(), "str", null);
        setIntField(term367387, term367387.getClass(), "type", 45);
        setField(term367387, term367387.getClass(), "next", null);
        setField(term367387, term367387.getClass(), "first", null);
        setField(term367387, term367387.getClass(), "last", null);
        setField(term367387, term367387.getClass(), "propListHead", null);
        setIntField(term367387, term367387.getClass(), "sourcePosition", 0);
        setField(term367388, term367388.getClass(), "call", null);
        setField(term367388, term367388.getClass(), "prototypeSlot", null);
        setField(term367388, term367388.getClass(), "kind", null);
        setField(term367388, term367388.getClass(), "typeOfThis", null);
        setField(term367388, term367388.getClass(), "source", null);
        setField(term367388, term367388.getClass(), "implementedInterfaces", null);
        setField(term367388, term367388.getClass(), "extendedInterfaces", null);
        setField(term367388, term367388.getClass(), "subTypes", null);
        setField(term367388, term367388.getClass(), "templateTypeNames", null);
        setField(term367388, term367388.getClass(), "className", null);
        setField(term367388, term367388.getClass(), "properties", null);
        setBooleanField(term367388, term367388.getClass(), "nativeType", false);
        setField(term367388, term367388.getClass(), "implicitPrototypeFallback", null);
        setField(term367388, term367388.getClass(), "ownerFunction", null);
        setBooleanField(term367388, term367388.getClass(), "prettyPrint", false);
        setBooleanField(term367388, term367388.getClass(), "visited", false);
        setField(term367388, term367388.getClass(), "docInfo", null);
        setBooleanField(term367388, term367388.getClass(), "unknown", false);
        setBooleanField(term367388, term367388.getClass(), "resolved", false);
        setField(term367388, term367388.getClass(), "resolveResult", null);
        setBooleanField(term367388, term367388.getClass(), "inTemplatedCheckVisit", false);
        setField(term367388, term367388.getClass(), "registry", null);
        setField(term367387, term367387.getClass(), "jsType", term367388);
        setField(term367387, term367387.getClass(), "parent", null);
        setField(term367384, term367384.getClass(), "last", term367387);
        setField(term367384, term367384.getClass(), "propListHead", null);
        setIntField(term367384, term367384.getClass(), "sourcePosition", 0);
        setField(term367384, term367384.getClass(), "jsType", null);
        setField(term367384, term367384.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term366788;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term366696, args);
        assertTrue(recursiveEquals(term366696, term367383));
        assertTrue(recursiveEquals(term366788, term367384));
        assertTrue(recursiveEquals(retValue, null));
    }

};


