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
import java.util.HashMap;

public class PrototypeObjectType_init_1781841665138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24547;
     Object term24647;
     Object term24694;
     Object term24698;
     Object term24699;

    public PrototypeObjectType_init_1781841665138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term24405 = new HashMap();
        Object term24173 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term24277 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term24357 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setBooleanField(term24173, term24173.getClass(), "resolved", false);
        setField(term24173, term24173.getClass(), "resolveResult", null);
        setBooleanField(term24173, term24173.getClass(), "inTemplatedCheckVisit", false);
        setField(term24173, term24173.getClass(), "registry", term24277);
        setField(term24173, term24173.getClass(), "docInfo", term24357);
        setBooleanField(term24173, term24173.getClass(), "unknown", false);
        setField(term24173, term24173.getClass(), "ownerFunction", null);
        setBooleanField(term24173, term24173.getClass(), "prettyPrint", false);
        setField(term24173, term24173.getClass(), "properties", term24405);
        setField(term24173, term24173.getClass(), "className", "");
        setBooleanField(term24173, term24173.getClass(), "nativeType", false);
        term24547 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        term24647 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        term24694 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term24695 = newInstance(Class.forName("java.util.TreeMap"));
        Object term24696 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term24697 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term24694, term24694.getClass(), "className", null);
        setField(term24695, term24695.getClass(), "comparator", null);
        setField(term24695, term24695.getClass(), "root", null);
        setIntField(term24695, term24695.getClass(), "size", 0);
        setIntField(term24695, term24695.getClass(), "modCount", 0);
        setField(term24695, term24695.getClass(), "entrySet", null);
        setField(term24695, term24695.getClass(), "navigableKeySet", null);
        setField(term24695, term24695.getClass(), "descendingMap", null);
        setField(term24695, term24695.getClass(), "keySet", null);
        setField(term24695, term24695.getClass(), "values", null);
        setField(term24694, term24694.getClass(), "properties", term24695);
        setBooleanField(term24694, term24694.getClass(), "nativeType", false);
        setField(term24696, term24696.getClass(), "call", null);
        setField(term24696, term24696.getClass(), "prototypeSlot", null);
        setField(term24696, term24696.getClass(), "kind", null);
        setField(term24696, term24696.getClass(), "typeOfThis", null);
        setField(term24696, term24696.getClass(), "source", null);
        setField(term24696, term24696.getClass(), "implementedInterfaces", null);
        setField(term24696, term24696.getClass(), "extendedInterfaces", null);
        setField(term24696, term24696.getClass(), "subTypes", null);
        setField(term24696, term24696.getClass(), "templateTypeNames", null);
        setField(term24696, term24696.getClass(), "className", null);
        setField(term24696, term24696.getClass(), "properties", null);
        setBooleanField(term24696, term24696.getClass(), "nativeType", false);
        setField(term24696, term24696.getClass(), "implicitPrototypeFallback", null);
        setField(term24696, term24696.getClass(), "ownerFunction", null);
        setBooleanField(term24696, term24696.getClass(), "prettyPrint", false);
        setBooleanField(term24696, term24696.getClass(), "visited", false);
        setField(term24696, term24696.getClass(), "docInfo", null);
        setBooleanField(term24696, term24696.getClass(), "unknown", false);
        setBooleanField(term24696, term24696.getClass(), "resolved", false);
        setField(term24696, term24696.getClass(), "resolveResult", null);
        setBooleanField(term24696, term24696.getClass(), "inTemplatedCheckVisit", false);
        setField(term24696, term24696.getClass(), "registry", null);
        setField(term24694, term24694.getClass(), "implicitPrototypeFallback", term24696);
        setField(term24694, term24694.getClass(), "ownerFunction", null);
        setBooleanField(term24694, term24694.getClass(), "prettyPrint", false);
        setBooleanField(term24694, term24694.getClass(), "visited", false);
        setField(term24694, term24694.getClass(), "docInfo", null);
        setBooleanField(term24694, term24694.getClass(), "unknown", true);
        setBooleanField(term24694, term24694.getClass(), "resolved", false);
        setField(term24694, term24694.getClass(), "resolveResult", null);
        setBooleanField(term24694, term24694.getClass(), "inTemplatedCheckVisit", false);
        setField(term24697, term24697.getClass(), "reporter", null);
        setField(term24697, term24697.getClass(), "nativeTypes", null);
        setField(term24697, term24697.getClass(), "namesToTypes", null);
        setField(term24697, term24697.getClass(), "namespaces", null);
        setField(term24697, term24697.getClass(), "nonNullableTypeNames", null);
        setField(term24697, term24697.getClass(), "forwardDeclaredTypes", null);
        setField(term24697, term24697.getClass(), "typesIndexedByProperty", null);
        setField(term24697, term24697.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term24697, term24697.getClass(), "greatestSubtypeByProperty", null);
        setField(term24697, term24697.getClass(), "interfaceToImplementors", null);
        setField(term24697, term24697.getClass(), "unresolvedNamedTypes", null);
        setField(term24697, term24697.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term24697, term24697.getClass(), "lastGeneration", false);
        setField(term24697, term24697.getClass(), "templateTypes", null);
        setBooleanField(term24697, term24697.getClass(), "tolerateUndefinedValues", false);
        setField(term24697, term24697.getClass(), "resolveMode", null);
        setField(term24694, term24694.getClass(), "registry", term24697);
        term24698 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term24698, term24698.getClass(), "reporter", null);
        setField(term24698, term24698.getClass(), "nativeTypes", null);
        setField(term24698, term24698.getClass(), "namesToTypes", null);
        setField(term24698, term24698.getClass(), "namespaces", null);
        setField(term24698, term24698.getClass(), "nonNullableTypeNames", null);
        setField(term24698, term24698.getClass(), "forwardDeclaredTypes", null);
        setField(term24698, term24698.getClass(), "typesIndexedByProperty", null);
        setField(term24698, term24698.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term24698, term24698.getClass(), "greatestSubtypeByProperty", null);
        setField(term24698, term24698.getClass(), "interfaceToImplementors", null);
        setField(term24698, term24698.getClass(), "unresolvedNamedTypes", null);
        setField(term24698, term24698.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term24698, term24698.getClass(), "lastGeneration", false);
        setField(term24698, term24698.getClass(), "templateTypes", null);
        setBooleanField(term24698, term24698.getClass(), "tolerateUndefinedValues", false);
        setField(term24698, term24698.getClass(), "resolveMode", null);
        term24699 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term24699, term24699.getClass(), "call", null);
        setField(term24699, term24699.getClass(), "prototypeSlot", null);
        setField(term24699, term24699.getClass(), "kind", null);
        setField(term24699, term24699.getClass(), "typeOfThis", null);
        setField(term24699, term24699.getClass(), "source", null);
        setField(term24699, term24699.getClass(), "implementedInterfaces", null);
        setField(term24699, term24699.getClass(), "extendedInterfaces", null);
        setField(term24699, term24699.getClass(), "subTypes", null);
        setField(term24699, term24699.getClass(), "templateTypeNames", null);
        setField(term24699, term24699.getClass(), "className", null);
        setField(term24699, term24699.getClass(), "properties", null);
        setBooleanField(term24699, term24699.getClass(), "nativeType", false);
        setField(term24699, term24699.getClass(), "implicitPrototypeFallback", null);
        setField(term24699, term24699.getClass(), "ownerFunction", null);
        setBooleanField(term24699, term24699.getClass(), "prettyPrint", false);
        setBooleanField(term24699, term24699.getClass(), "visited", false);
        setField(term24699, term24699.getClass(), "docInfo", null);
        setBooleanField(term24699, term24699.getClass(), "unknown", false);
        setBooleanField(term24699, term24699.getClass(), "resolved", false);
        setField(term24699, term24699.getClass(), "resolveResult", null);
        setBooleanField(term24699, term24699.getClass(), "inTemplatedCheckVisit", false);
        setField(term24699, term24699.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Object[] args = new Object[3];
        args[0] = term24547;
        args[1] = null;
        args[2] = term24647;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term24694));
        assertTrue(recursiveEquals(term24547, term24698));
        assertTrue(recursiveEquals(term24647, null));
    }

};


