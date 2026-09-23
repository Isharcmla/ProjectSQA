package com.google.javascript.rhino.jstype;

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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.jstype.EqualityUtils.*;
import java.lang.Object;

public class JSType_getGreatestSubtype_1951394506365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78186;
     Object term78402;
     Object term78677;
     Object term78679;
     Object term78504;

    public JSType_getGreatestSubtype_1951394506365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78186 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term78304 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setBooleanField(term78304, term78304.getClass(), "unknown", false);
        setField(term78186, term78186.getClass(), "referencedType", term78304);
        term78402 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term78502 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term78402, term78402.getClass(), "referencedType", term78502);
        term78677 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term78678 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term78677, term78677.getClass(), "indexType", null);
        setField(term78678, term78678.getClass(), "leastSupertypeVisitor", null);
        setField(term78678, term78678.getClass(), "greatestSubtypeVisitor", null);
        setField(term78678, term78678.getClass(), "call", null);
        setField(term78678, term78678.getClass(), "prototype", null);
        setField(term78678, term78678.getClass(), "kind", null);
        setField(term78678, term78678.getClass(), "typeOfThis", null);
        setField(term78678, term78678.getClass(), "source", null);
        setField(term78678, term78678.getClass(), "implementedInterfaces", null);
        setField(term78678, term78678.getClass(), "subTypes", null);
        setField(term78678, term78678.getClass(), "templateTypeName", null);
        setField(term78678, term78678.getClass(), "className", null);
        setField(term78678, term78678.getClass(), "properties", null);
        setField(term78678, term78678.getClass(), "implicitPrototype", null);
        setBooleanField(term78678, term78678.getClass(), "nativeType", false);
        setBooleanField(term78678, term78678.getClass(), "prettyPrint", false);
        setBooleanField(term78678, term78678.getClass(), "visited", false);
        setField(term78678, term78678.getClass(), "docInfo", null);
        setBooleanField(term78678, term78678.getClass(), "unknown", false);
        setBooleanField(term78678, term78678.getClass(), "resolved", false);
        setField(term78678, term78678.getClass(), "resolveResult", null);
        setField(term78678, term78678.getClass(), "registry", null);
        setField(term78677, term78677.getClass(), "referencedType", term78678);
        setBooleanField(term78677, term78677.getClass(), "visited", false);
        setField(term78677, term78677.getClass(), "docInfo", null);
        setBooleanField(term78677, term78677.getClass(), "unknown", false);
        setBooleanField(term78677, term78677.getClass(), "resolved", false);
        setField(term78677, term78677.getClass(), "resolveResult", null);
        setField(term78677, term78677.getClass(), "registry", null);
        term78679 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term78680 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term78679, term78679.getClass(), "indexType", null);
        setField(term78680, term78680.getClass(), "ownerFunction", null);
        setField(term78680, term78680.getClass(), "className", null);
        setField(term78680, term78680.getClass(), "properties", null);
        setField(term78680, term78680.getClass(), "implicitPrototype", null);
        setBooleanField(term78680, term78680.getClass(), "nativeType", false);
        setBooleanField(term78680, term78680.getClass(), "prettyPrint", false);
        setBooleanField(term78680, term78680.getClass(), "visited", false);
        setField(term78680, term78680.getClass(), "docInfo", null);
        setBooleanField(term78680, term78680.getClass(), "unknown", false);
        setBooleanField(term78680, term78680.getClass(), "resolved", false);
        setField(term78680, term78680.getClass(), "resolveResult", null);
        setField(term78680, term78680.getClass(), "registry", null);
        setField(term78679, term78679.getClass(), "referencedType", term78680);
        setBooleanField(term78679, term78679.getClass(), "visited", false);
        setField(term78679, term78679.getClass(), "docInfo", null);
        setBooleanField(term78679, term78679.getClass(), "unknown", false);
        setBooleanField(term78679, term78679.getClass(), "resolved", false);
        setField(term78679, term78679.getClass(), "resolveResult", null);
        setField(term78679, term78679.getClass(), "registry", null);
        term78504 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term78505 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term78504, term78504.getClass(), "indexType", null);
        setField(term78505, term78505.getClass(), "leastSupertypeVisitor", null);
        setField(term78505, term78505.getClass(), "greatestSubtypeVisitor", null);
        setField(term78505, term78505.getClass(), "call", null);
        setField(term78505, term78505.getClass(), "prototype", null);
        setField(term78505, term78505.getClass(), "kind", null);
        setField(term78505, term78505.getClass(), "typeOfThis", null);
        setField(term78505, term78505.getClass(), "source", null);
        setField(term78505, term78505.getClass(), "implementedInterfaces", null);
        setField(term78505, term78505.getClass(), "subTypes", null);
        setField(term78505, term78505.getClass(), "templateTypeName", null);
        setField(term78505, term78505.getClass(), "className", null);
        setField(term78505, term78505.getClass(), "properties", null);
        setField(term78505, term78505.getClass(), "implicitPrototype", null);
        setBooleanField(term78505, term78505.getClass(), "nativeType", false);
        setBooleanField(term78505, term78505.getClass(), "prettyPrint", false);
        setBooleanField(term78505, term78505.getClass(), "visited", false);
        setField(term78505, term78505.getClass(), "docInfo", null);
        setBooleanField(term78505, term78505.getClass(), "unknown", false);
        setBooleanField(term78505, term78505.getClass(), "resolved", false);
        setField(term78505, term78505.getClass(), "resolveResult", null);
        setField(term78505, term78505.getClass(), "registry", null);
        setField(term78504, term78504.getClass(), "referencedType", term78505);
        setBooleanField(term78504, term78504.getClass(), "visited", false);
        setField(term78504, term78504.getClass(), "docInfo", null);
        setBooleanField(term78504, term78504.getClass(), "unknown", false);
        setBooleanField(term78504, term78504.getClass(), "resolved", false);
        setField(term78504, term78504.getClass(), "resolveResult", null);
        setField(term78504, term78504.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term78186;
        args[1] = term78402;
        Object retValue = callMethod(klass, "getGreatestSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term78186, term78677));
        assertTrue(recursiveEquals(term78402, term78679));
        assertTrue(recursiveEquals(retValue, term78504));
    }

};


