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
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class JSTypeRegistry_createParameterizedType_228999089157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12588;
     Object term507579;
     Object term507532;

    public JSTypeRegistry_createParameterizedType_228999089157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term12590 = new HashMap();
        HashMap term12600 = new HashMap();
        Set<Object> term507591 =  ((Map) term12600).keySet();
        HashSet term12599 = new HashSet((Collection<? extends Object>) term507591);
        HashMap term12615 = new HashMap();
        Set<Object> term507592 =  ((Map) term12615).keySet();
        HashSet term12614 = new HashSet((Collection<? extends Object>) term507592);
        HashMap term12621 = new HashMap();
        Set<Object> term507593 =  ((Map) term12621).keySet();
        HashSet term12620 = new HashSet((Collection<? extends Object>) term507593);
        HashMap term12633 = new HashMap();
        HashMap term12648 = new HashMap();
        HashMap term12653 = new HashMap();
        term12588 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term12589 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 3);
        setField(term12588, term12588.getClass(), "reporter", null);
        setField(term12588, term12588.getClass(), "nativeTypes", term12589);
        setField(term12588, term12588.getClass(), "namesToTypes", term12590);
        setField(term12588, term12588.getClass(), "namespaces", term12599);
        setField(term12588, term12588.getClass(), "nonNullableTypeNames", term12614);
        setField(term12588, term12588.getClass(), "forwardDeclaredTypes", term12620);
        setField(term12588, term12588.getClass(), "typesIndexedByProperty", term12633);
        setField(term12588, term12588.getClass(), "eachRefTypeIndexedByProperty", term12648);
        setField(term12588, term12588.getClass(), "greatestSubtypeByProperty", term12653);
        setField(term12588, term12588.getClass(), "interfaceToImplementors", null);
        setField(term12588, term12588.getClass(), "unresolvedNamedTypes", null);
        setField(term12588, term12588.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term12588, term12588.getClass(), "lastGeneration", false);
        setField(term12588, term12588.getClass(), "templateTypeName", null);
        setField(term12588, term12588.getClass(), "templateType", null);
        setBooleanField(term12588, term12588.getClass(), "tolerateUndefinedValues", false);
        setField(term12588, term12588.getClass(), "resolveMode", null);
        HashMap term507581 = new HashMap();
        HashMap term507583 = new HashMap();
        Set<Object> term507594 =  ((Map) term507583).keySet();
        HashSet term507582 = new HashSet((Collection<? extends Object>) term507594);
        HashMap term507585 = new HashMap();
        Set<Object> term507595 =  ((Map) term507585).keySet();
        HashSet term507584 = new HashSet((Collection<? extends Object>) term507595);
        HashMap term507587 = new HashMap();
        Set<Object> term507596 =  ((Map) term507587).keySet();
        HashSet term507586 = new HashSet((Collection<? extends Object>) term507596);
        HashMap term507588 = new HashMap();
        HashMap term507589 = new HashMap();
        HashMap term507590 = new HashMap();
        term507579 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term507580 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 3);
        setField(term507579, term507579.getClass(), "reporter", null);
        setField(term507579, term507579.getClass(), "nativeTypes", term507580);
        setField(term507579, term507579.getClass(), "namesToTypes", term507581);
        setField(term507579, term507579.getClass(), "namespaces", term507582);
        setField(term507579, term507579.getClass(), "nonNullableTypeNames", term507584);
        setField(term507579, term507579.getClass(), "forwardDeclaredTypes", term507586);
        setField(term507579, term507579.getClass(), "typesIndexedByProperty", term507588);
        setField(term507579, term507579.getClass(), "eachRefTypeIndexedByProperty", term507589);
        setField(term507579, term507579.getClass(), "greatestSubtypeByProperty", term507590);
        setField(term507579, term507579.getClass(), "interfaceToImplementors", null);
        setField(term507579, term507579.getClass(), "unresolvedNamedTypes", null);
        setField(term507579, term507579.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term507579, term507579.getClass(), "lastGeneration", false);
        setField(term507579, term507579.getClass(), "templateTypeName", null);
        setField(term507579, term507579.getClass(), "templateType", null);
        setBooleanField(term507579, term507579.getClass(), "tolerateUndefinedValues", false);
        setField(term507579, term507579.getClass(), "resolveMode", null);
        HashMap term507538 = new HashMap();
        HashMap term507544 = new HashMap();
        Set<Object> term507597 =  ((Map) term507544).keySet();
        HashSet term507543 = new HashSet((Collection<? extends Object>) term507597);
        HashMap term507550 = new HashMap();
        Set<Object> term507598 =  ((Map) term507550).keySet();
        HashSet term507549 = new HashSet((Collection<? extends Object>) term507598);
        HashMap term507556 = new HashMap();
        Set<Object> term507599 =  ((Map) term507556).keySet();
        HashSet term507555 = new HashSet((Collection<? extends Object>) term507599);
        HashMap term507561 = new HashMap();
        HashMap term507566 = new HashMap();
        HashMap term507571 = new HashMap();
        term507532 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term507536 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term507537 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 3);
        setField(term507532, term507532.getClass(), "parameterType", null);
        setField(term507532, term507532.getClass(), "referencedType", null);
        setField(term507532, term507532.getClass(), "referencedObjType", null);
        setBooleanField(term507532, term507532.getClass(), "visited", false);
        setField(term507532, term507532.getClass(), "docInfo", null);
        setBooleanField(term507532, term507532.getClass(), "unknown", true);
        setBooleanField(term507532, term507532.getClass(), "resolved", false);
        setField(term507532, term507532.getClass(), "resolveResult", null);
        setField(term507536, term507536.getClass(), "reporter", null);
        setField(term507536, term507536.getClass(), "nativeTypes", term507537);
        setField(term507536, term507536.getClass(), "namesToTypes", term507538);
        setField(term507536, term507536.getClass(), "namespaces", term507543);
        setField(term507536, term507536.getClass(), "nonNullableTypeNames", term507549);
        setField(term507536, term507536.getClass(), "forwardDeclaredTypes", term507555);
        setField(term507536, term507536.getClass(), "typesIndexedByProperty", term507561);
        setField(term507536, term507536.getClass(), "eachRefTypeIndexedByProperty", term507566);
        setField(term507536, term507536.getClass(), "greatestSubtypeByProperty", term507571);
        setField(term507536, term507536.getClass(), "interfaceToImplementors", null);
        setField(term507536, term507536.getClass(), "unresolvedNamedTypes", null);
        setField(term507536, term507536.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term507536, term507536.getClass(), "lastGeneration", false);
        setField(term507536, term507536.getClass(), "templateTypeName", null);
        setField(term507536, term507536.getClass(), "templateType", null);
        setBooleanField(term507536, term507536.getClass(), "tolerateUndefinedValues", false);
        setField(term507536, term507536.getClass(), "resolveMode", null);
        setField(term507532, term507532.getClass(), "registry", term507536);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object retValue = callMethod(klass, "createParameterizedType", argTypes, term12588, args);
        assertTrue(recursiveEquals(term12588, term507579));
        assertTrue(recursiveEquals(retValue, term507532));
    }

};


