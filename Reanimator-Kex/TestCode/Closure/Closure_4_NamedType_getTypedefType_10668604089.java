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

public class NamedType_getTypedefType_10668604089 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16582;
     Object term16800;
     Object term16819;
     Object term16821;

    public NamedType_getTypedefType_10668604089() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16582 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term16686 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term16582, term16582.getClass(), "registry", term16686);
        term16800 = newInstance(Class.forName("com.google.javascript.jscomp.TightenTypes$ConcreteSlot"));
        setField(term16800, term16800.getClass(), "type", null);
        term16819 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term16820 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term16819, term16819.getClass(), "reference", null);
        setField(term16819, term16819.getClass(), "sourceName", null);
        setIntField(term16819, term16819.getClass(), "lineno", 0);
        setIntField(term16819, term16819.getClass(), "charno", 0);
        setField(term16819, term16819.getClass(), "validator", null);
        setField(term16819, term16819.getClass(), "propertyContinuations", null);
        setField(term16819, term16819.getClass(), "referencedType", null);
        setField(term16819, term16819.getClass(), "referencedObjType", null);
        setBooleanField(term16819, term16819.getClass(), "visited", false);
        setField(term16819, term16819.getClass(), "docInfo", null);
        setBooleanField(term16819, term16819.getClass(), "unknown", false);
        setBooleanField(term16819, term16819.getClass(), "resolved", true);
        setField(term16819, term16819.getClass(), "resolveResult", term16819);
        setField(term16819, term16819.getClass(), "templateKeys", null);
        setField(term16819, term16819.getClass(), "templatizedTypes", null);
        setBooleanField(term16819, term16819.getClass(), "inTemplatedCheckVisit", false);
        setField(term16820, term16820.getClass(), "reporter", null);
        setField(term16820, term16820.getClass(), "nativeTypes", null);
        setField(term16820, term16820.getClass(), "namesToTypes", null);
        setField(term16820, term16820.getClass(), "namespaces", null);
        setField(term16820, term16820.getClass(), "nonNullableTypeNames", null);
        setField(term16820, term16820.getClass(), "forwardDeclaredTypes", null);
        setField(term16820, term16820.getClass(), "typesIndexedByProperty", null);
        setField(term16820, term16820.getClass(), "eachRefTypeIndexedByProperty", null);
        setField(term16820, term16820.getClass(), "greatestSubtypeByProperty", null);
        setField(term16820, term16820.getClass(), "interfaceToImplementors", null);
        setField(term16820, term16820.getClass(), "unresolvedNamedTypes", null);
        setField(term16820, term16820.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term16820, term16820.getClass(), "lastGeneration", false);
        setField(term16820, term16820.getClass(), "templateTypes", null);
        setBooleanField(term16820, term16820.getClass(), "tolerateUndefinedValues", false);
        setField(term16820, term16820.getClass(), "resolveMode", null);
        setField(term16819, term16819.getClass(), "registry", term16820);
        term16821 = newInstance(Class.forName("com.google.javascript.jscomp.TightenTypes$ConcreteSlot"));
        setField(term16821, term16821.getClass(), "scope", null);
        setField(term16821, term16821.getClass(), "name", null);
        setField(term16821, term16821.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.StaticSlot");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term16800;
        args[2] = null;
        Object retValue = callMethod(klass, "getTypedefType", argTypes, term16582, args);
        assertTrue(recursiveEquals(term16582, term16819));
        assertTrue(recursiveEquals(term16800, null));
        assertTrue(recursiveEquals(retValue, null));
    }

};


