package com.google.javascript.jscomp;

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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;
import java.util.ArrayList;

public class TypedScopeCreator_createInitialScope_76224746413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term523;
     Object term602;

    public TypedScopeCreator_createInitialScope_76224746413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term527 = new HashMap();
        HashMap term534 = new HashMap();
        Set<Object> term8932 =  ((Map) term534).keySet();
        HashSet term533 = new HashSet((Collection<? extends Object>) term8932);
        HashMap term540 = new HashMap();
        Set<Object> term8933 =  ((Map) term540).keySet();
        HashSet term539 = new HashSet((Collection<? extends Object>) term8933);
        HashMap term546 = new HashMap();
        Set<Object> term8934 =  ((Map) term546).keySet();
        HashSet term545 = new HashSet((Collection<? extends Object>) term8934);
        HashMap term551 = new HashMap();
        HashMap term556 = new HashMap();
        Class<? extends Object> term8946 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeRegistry$ResolveMode");
        Field term8945 = ((Class) term8946).getDeclaredField((String) "IMMEDIATE");
        ((Field) term8945).setAccessible(true);
        Object enum12 = ((Field) term8945).get((Object) null);
        Object term586 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator$TypeMismatch"));
        setField(term586, term586.getClass(), "typeA", null);
        setField(term586, term586.getClass(), "typeB", null);
        Object term587 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator$TypeMismatch"));
        setField(term587, term587.getClass(), "typeA", null);
        setField(term587, term587.getClass(), "typeB", null);
        Object term588 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator$TypeMismatch"));
        setField(term588, term588.getClass(), "typeA", null);
        setField(term588, term588.getClass(), "typeB", null);
        Object term589 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator$TypeMismatch"));
        setField(term589, term589.getClass(), "typeA", null);
        setField(term589, term589.getClass(), "typeB", null);
        Object term590 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator$TypeMismatch"));
        setField(term590, term590.getClass(), "typeA", null);
        setField(term590, term590.getClass(), "typeB", null);
        Object term591 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator$TypeMismatch"));
        setField(term591, term591.getClass(), "typeA", null);
        setField(term591, term591.getClass(), "typeB", null);
        Object term592 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator$TypeMismatch"));
        setField(term592, term592.getClass(), "typeA", null);
        setField(term592, term592.getClass(), "typeB", null);
        ArrayList term584 = new ArrayList();
        ((ArrayList) term584).add(term586);
        ((ArrayList) term584).add(term587);
        ((ArrayList) term584).add(term588);
        ((ArrayList) term584).add(term589);
        ((ArrayList) term584).add(term590);
        ((ArrayList) term584).add(term591);
        ((ArrayList) term584).add(term592);
        ArrayList term598 = new ArrayList();
        term523 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term524 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term525 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term526 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 0);
        Object term575 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term595 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term523, term523.getClass(), "compiler", null);
        setField(term523, term523.getClass(), "typeParsingErrorReporter", null);
        setField(term524, term524.getClass(), "compiler", null);
        setField(term525, term525.getClass(), "reporter", null);
        setField(term525, term525.getClass(), "nativeTypes", term526);
        setField(term525, term525.getClass(), "namesToTypes", term527);
        setField(term525, term525.getClass(), "namespaces", term533);
        setField(term525, term525.getClass(), "enumTypeNames", term539);
        setField(term525, term525.getClass(), "forwardDeclaredTypes", term545);
        setField(term525, term525.getClass(), "typesIndexedByProperty", term551);
        setField(term525, term525.getClass(), "greatestSubtypeByProperty", term556);
        setField(term525, term525.getClass(), "interfaceToImplementors", null);
        setField(term525, term525.getClass(), "unresolvedNamedTypes", null);
        setField(term525, term525.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term525, term525.getClass(), "lastGeneration", false);
        setField(term525, term525.getClass(), "templateTypeName", "aKnKipADSo");
        setField(term575, term575.getClass(), "name", null);
        setField(term575, term575.getClass(), "referencedType", null);
        setBooleanField(term575, term575.getClass(), "visited", false);
        setField(term575, term575.getClass(), "docInfo", null);
        setBooleanField(term575, term575.getClass(), "unknown", false);
        setBooleanField(term575, term575.getClass(), "resolved", false);
        setField(term575, term575.getClass(), "resolveResult", null);
        setField(term575, term575.getClass(), "registry", null);
        setField(term525, term525.getClass(), "templateType", term575);
        setBooleanField(term525, term525.getClass(), "tolerateUndefinedValues", true);
        setField(term525, term525.getClass(), "resolveMode", enum12);
        setField(term524, term524.getClass(), "typeRegistry", term525);
        setField(term524, term524.getClass(), "allValueTypes", null);
        setBooleanField(term524, term524.getClass(), "shouldReport", true);
        setField(term524, term524.getClass(), "mismatches", term584);
        setField(term523, term523.getClass(), "validator", term524);
        setField(term523, term523.getClass(), "codingConvention", null);
        setField(term595, term595.getClass(), "reporter", null);
        setField(term595, term595.getClass(), "nativeTypes", null);
        setField(term595, term595.getClass(), "namesToTypes", null);
        setField(term595, term595.getClass(), "namespaces", null);
        setField(term595, term595.getClass(), "enumTypeNames", null);
        setField(term595, term595.getClass(), "forwardDeclaredTypes", null);
        setField(term595, term595.getClass(), "typesIndexedByProperty", null);
        setField(term595, term595.getClass(), "greatestSubtypeByProperty", null);
        setField(term595, term595.getClass(), "interfaceToImplementors", null);
        setField(term595, term595.getClass(), "unresolvedNamedTypes", null);
        setField(term595, term595.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term595, term595.getClass(), "lastGeneration", false);
        setField(term595, term595.getClass(), "templateTypeName", null);
        setField(term595, term595.getClass(), "templateType", null);
        setBooleanField(term595, term595.getClass(), "tolerateUndefinedValues", false);
        setField(term595, term595.getClass(), "resolveMode", null);
        setField(term523, term523.getClass(), "typeRegistry", term595);
        setField(term523, term523.getClass(), "delegateProxyPrototypes", term598);
        term602 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term604 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term606 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term609 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term612 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term615 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term619 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term622 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term625 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term602, term602.getClass(), "type", 1135664017);
        setIntField(term604, term604.getClass(), "type", -244121226);
        setIntField(term606, term606.getClass(), "type", 0);
        setField(term606, term606.getClass(), "next", null);
        setField(term606, term606.getClass(), "first", null);
        setField(term606, term606.getClass(), "last", null);
        setField(term606, term606.getClass(), "propListHead", null);
        setIntField(term606, term606.getClass(), "sourcePosition", 0);
        setField(term606, term606.getClass(), "jsType", null);
        setField(term606, term606.getClass(), "parent", null);
        setField(term604, term604.getClass(), "next", term606);
        setIntField(term609, term609.getClass(), "type", 0);
        setField(term609, term609.getClass(), "next", null);
        setField(term609, term609.getClass(), "first", null);
        setField(term609, term609.getClass(), "last", null);
        setField(term609, term609.getClass(), "propListHead", null);
        setIntField(term609, term609.getClass(), "sourcePosition", 0);
        setField(term609, term609.getClass(), "jsType", null);
        setField(term609, term609.getClass(), "parent", null);
        setField(term604, term604.getClass(), "first", term609);
        setIntField(term612, term612.getClass(), "type", 0);
        setField(term612, term612.getClass(), "next", null);
        setField(term612, term612.getClass(), "first", null);
        setField(term612, term612.getClass(), "last", null);
        setField(term612, term612.getClass(), "propListHead", null);
        setIntField(term612, term612.getClass(), "sourcePosition", 0);
        setField(term612, term612.getClass(), "jsType", null);
        setField(term612, term612.getClass(), "parent", null);
        setField(term604, term604.getClass(), "last", term612);
        setField(term615, term615.getClass(), "next", null);
        setIntField(term615, term615.getClass(), "type", 0);
        setIntField(term615, term615.getClass(), "intValue", 0);
        setField(term615, term615.getClass(), "objectValue", null);
        setField(term604, term604.getClass(), "propListHead", term615);
        setIntField(term604, term604.getClass(), "sourcePosition", -73683645);
        setField(term604, term604.getClass(), "jsType", null);
        setField(term604, term604.getClass(), "parent", null);
        setField(term602, term602.getClass(), "next", term604);
        setIntField(term619, term619.getClass(), "type", 0);
        setField(term619, term619.getClass(), "next", null);
        setField(term619, term619.getClass(), "first", null);
        setField(term619, term619.getClass(), "last", null);
        setField(term619, term619.getClass(), "propListHead", null);
        setIntField(term619, term619.getClass(), "sourcePosition", 0);
        setField(term619, term619.getClass(), "jsType", null);
        setField(term619, term619.getClass(), "parent", null);
        setField(term602, term602.getClass(), "first", term619);
        setIntField(term622, term622.getClass(), "type", 0);
        setField(term622, term622.getClass(), "next", null);
        setField(term622, term622.getClass(), "first", null);
        setField(term622, term622.getClass(), "last", null);
        setField(term622, term622.getClass(), "propListHead", null);
        setIntField(term622, term622.getClass(), "sourcePosition", 0);
        setField(term622, term622.getClass(), "jsType", null);
        setField(term622, term622.getClass(), "parent", null);
        setField(term602, term602.getClass(), "last", term622);
        setField(term625, term625.getClass(), "next", null);
        setIntField(term625, term625.getClass(), "type", 0);
        setIntField(term625, term625.getClass(), "intValue", 0);
        setField(term625, term625.getClass(), "objectValue", null);
        setField(term602, term602.getClass(), "propListHead", term625);
        setIntField(term602, term602.getClass(), "sourcePosition", -226514366);
        setField(term602, term602.getClass(), "jsType", null);
        setField(term602, term602.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term602;
        try {
            callMethod(klass, "createInitialScope", argTypes, term523, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


