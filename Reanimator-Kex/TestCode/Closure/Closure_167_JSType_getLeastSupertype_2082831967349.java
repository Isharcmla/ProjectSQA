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

public class JSType_getLeastSupertype_2082831967349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63131;
     Object term63349;
     Object term64068;
     Object term64070;
     Object term64060;

    public JSType_getLeastSupertype_2082831967349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63131 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NullType"));
        Object term63235 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term63131, term63131.getClass(), "registry", term63235);
        term63349 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        term64068 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NullType"));
        Object term64069 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setBooleanField(term64068, term64068.getClass(), "resolved", false);
        setField(term64068, term64068.getClass(), "resolveResult", null);
        setBooleanField(term64068, term64068.getClass(), "inTemplatedCheckVisit", false);
        setField(term64069, term64069.getClass(), "reporter", null);
        setField(term64069, term64069.getClass(), "nativeTypes", null);
        setField(term64069, term64069.getClass(), "namesToTypes", null);
        setField(term64069, term64069.getClass(), "namespaces", null);
        setField(term64069, term64069.getClass(), "nonNullableTypeNames", null);
        setField(term64069, term64069.getClass(), "forwardDeclaredTypes", null);
        setField(term64069, term64069.getClass(), "typesIndexedByProperty", null);
        setField(term64069, term64069.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term64069, term64069.getClass(), "greatestSubtypeByProperty", null);
        setField(term64069, term64069.getClass(), "interfaceToImplementors", null);
        setField(term64069, term64069.getClass(), "unresolvedNamedTypes", null);
        setField(term64069, term64069.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term64069, term64069.getClass(), "lastGeneration", false);
        setField(term64069, term64069.getClass(), "templateTypes", null);
        setBooleanField(term64069, term64069.getClass(), "tolerateUndefinedValues", false);
        setField(term64069, term64069.getClass(), "resolveMode", null);
        setField(term64068, term64068.getClass(), "registry", term64069);
        term64070 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term64070, term64070.getClass(), "className", null);
        setField(term64070, term64070.getClass(), "properties", null);
        setBooleanField(term64070, term64070.getClass(), "nativeType", false);
        setField(term64070, term64070.getClass(), "implicitPrototypeFallback", null);
        setField(term64070, term64070.getClass(), "ownerFunction", null);
        setBooleanField(term64070, term64070.getClass(), "prettyPrint", false);
        setBooleanField(term64070, term64070.getClass(), "visited", false);
        setField(term64070, term64070.getClass(), "docInfo", null);
        setBooleanField(term64070, term64070.getClass(), "unknown", false);
        setBooleanField(term64070, term64070.getClass(), "resolved", false);
        setField(term64070, term64070.getClass(), "resolveResult", null);
        setBooleanField(term64070, term64070.getClass(), "inTemplatedCheckVisit", false);
        setField(term64070, term64070.getClass(), "registry", null);
        term64060 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term64061 = newInstance(Class.forName("com.google.common.collect.RegularImmutableList"));
        Object[] term64064 = (Object[]) newArray("java.lang.Object", 2);
        Object term63469 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NullType"));
        Object term63472 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term63475 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setIntField(term64061, term64061.getClass(), "offset", 0);
        setIntField(term64061, term64061.getClass(), "size", 2);
        setBooleanField(term63469, term63469.getClass(), "resolved", false);
        setField(term63469, term63469.getClass(), "resolveResult", null);
        setBooleanField(term63469, term63469.getClass(), "inTemplatedCheckVisit", false);
        setField(term63472, term63472.getClass(), "reporter", null);
        setField(term63472, term63472.getClass(), "nativeTypes", null);
        setField(term63472, term63472.getClass(), "namesToTypes", null);
        setField(term63472, term63472.getClass(), "namespaces", null);
        setField(term63472, term63472.getClass(), "nonNullableTypeNames", null);
        setField(term63472, term63472.getClass(), "forwardDeclaredTypes", null);
        setField(term63472, term63472.getClass(), "typesIndexedByProperty", null);
        setField(term63472, term63472.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term63472, term63472.getClass(), "greatestSubtypeByProperty", null);
        setField(term63472, term63472.getClass(), "interfaceToImplementors", null);
        setField(term63472, term63472.getClass(), "unresolvedNamedTypes", null);
        setField(term63472, term63472.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term63472, term63472.getClass(), "lastGeneration", false);
        setField(term63472, term63472.getClass(), "templateTypes", null);
        setBooleanField(term63472, term63472.getClass(), "tolerateUndefinedValues", false);
        setField(term63472, term63472.getClass(), "resolveMode", null);
        setField(term63469, term63469.getClass(), "registry", term63472);
        setElement(term64064, 0, term63469);
        setField(term63475, term63475.getClass(), "className", null);
        setField(term63475, term63475.getClass(), "properties", null);
        setBooleanField(term63475, term63475.getClass(), "nativeType", false);
        setField(term63475, term63475.getClass(), "implicitPrototypeFallback", null);
        setField(term63475, term63475.getClass(), "ownerFunction", null);
        setBooleanField(term63475, term63475.getClass(), "prettyPrint", false);
        setBooleanField(term63475, term63475.getClass(), "visited", false);
        setField(term63475, term63475.getClass(), "docInfo", null);
        setBooleanField(term63475, term63475.getClass(), "unknown", false);
        setBooleanField(term63475, term63475.getClass(), "resolved", false);
        setField(term63475, term63475.getClass(), "resolveResult", null);
        setBooleanField(term63475, term63475.getClass(), "inTemplatedCheckVisit", false);
        setField(term63475, term63475.getClass(), "registry", null);
        setElement(term64064, 1, term63475);
        setField(term64061, term64061.getClass(), "array", term64064);
        setField(term64061, term64061.getClass(), "asList", null);
        setField(term64060, term64060.getClass(), "alternates", term64061);
        setIntField(term64060, term64060.getClass(), "hashcode", 2134522418);
        setBooleanField(term64060, term64060.getClass(), "resolved", false);
        setField(term64060, term64060.getClass(), "resolveResult", null);
        setBooleanField(term64060, term64060.getClass(), "inTemplatedCheckVisit", false);
        setField(term64060, term64060.getClass(), "registry", term63472);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term63131;
        args[1] = term63349;
        Object retValue = callMethod(klass, "getLeastSupertype", argTypes, null, args);
        assertTrue(recursiveEquals(term63131, term64068));
        assertTrue(recursiveEquals(term63349, term64070));
        assertTrue(recursiveEquals(retValue, term64060));
    }

};


