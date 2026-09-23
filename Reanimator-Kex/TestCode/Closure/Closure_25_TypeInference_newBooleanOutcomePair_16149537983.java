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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;

public class TypeInference_newBooleanOutcomePair_16149537983 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5845;
     Object term25651;
     Object term25642;

    public TypeInference_newBooleanOutcomePair_16149537983() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5848 = new HashMap();
        HashMap term5857 = new HashMap();
        Set<Object> term25664 =  ((Map) term5857).keySet();
        HashSet term5856 = new HashSet((Collection<? extends Object>) term25664);
        HashMap term5864 = new HashMap();
        Set<Object> term25665 =  ((Map) term5864).keySet();
        HashSet term5863 = new HashSet((Collection<? extends Object>) term25665);
        HashMap term5871 = new HashMap();
        Set<Object> term25666 =  ((Map) term5871).keySet();
        HashSet term5870 = new HashSet((Collection<? extends Object>) term25666);
        HashMap term5877 = new HashMap();
        HashMap term5885 = new HashMap();
        HashMap term5890 = new HashMap();
        term5845 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term5846 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term5847 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 1);
        setField(term5845, term5845.getClass(), "compiler", null);
        setField(term5846, term5846.getClass(), "reporter", null);
        setField(term5846, term5846.getClass(), "nativeTypes", term5847);
        setField(term5846, term5846.getClass(), "namesToTypes", term5848);
        setField(term5846, term5846.getClass(), "namespaces", term5856);
        setField(term5846, term5846.getClass(), "nonNullableTypeNames", term5863);
        setField(term5846, term5846.getClass(), "forwardDeclaredTypes", term5870);
        setField(term5846, term5846.getClass(), "typesIndexedByProperty", term5877);
        setField(term5846, term5846.getClass(), "eachRefTypeIndexedByProperty", term5885);
        setField(term5846, term5846.getClass(), "greatestSubtypeByProperty", term5890);
        setField(term5846, term5846.getClass(), "interfaceToImplementors", null);
        setField(term5846, term5846.getClass(), "unresolvedNamedTypes", null);
        setField(term5846, term5846.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term5846, term5846.getClass(), "lastGeneration", false);
        setField(term5846, term5846.getClass(), "templateTypeName", null);
        setField(term5846, term5846.getClass(), "templateType", null);
        setBooleanField(term5846, term5846.getClass(), "tolerateUndefinedValues", false);
        setField(term5846, term5846.getClass(), "resolveMode", null);
        setField(term5845, term5845.getClass(), "registry", term5846);
        setField(term5845, term5845.getClass(), "reverseInterpreter", null);
        setField(term5845, term5845.getClass(), "syntacticScope", null);
        setField(term5845, term5845.getClass(), "functionScope", null);
        setField(term5845, term5845.getClass(), "bottomScope", null);
        setField(term5845, term5845.getClass(), "assertionFunctionsMap", null);
        setField(term5845, term5845.getClass(), "cfg", null);
        setField(term5845, term5845.getClass(), "joinOp", null);
        setField(term5845, term5845.getClass(), "orderedWorkSet", null);
        HashMap term25654 = new HashMap();
        HashMap term25656 = new HashMap();
        Set<Object> term25667 =  ((Map) term25656).keySet();
        HashSet term25655 = new HashSet((Collection<? extends Object>) term25667);
        HashMap term25658 = new HashMap();
        Set<Object> term25668 =  ((Map) term25658).keySet();
        HashSet term25657 = new HashSet((Collection<? extends Object>) term25668);
        HashMap term25660 = new HashMap();
        Set<Object> term25669 =  ((Map) term25660).keySet();
        HashSet term25659 = new HashSet((Collection<? extends Object>) term25669);
        HashMap term25661 = new HashMap();
        HashMap term25662 = new HashMap();
        HashMap term25663 = new HashMap();
        term25651 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term25652 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term25653 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 1);
        setField(term25651, term25651.getClass(), "compiler", null);
        setField(term25652, term25652.getClass(), "reporter", null);
        setField(term25652, term25652.getClass(), "nativeTypes", term25653);
        setField(term25652, term25652.getClass(), "namesToTypes", term25654);
        setField(term25652, term25652.getClass(), "namespaces", term25655);
        setField(term25652, term25652.getClass(), "nonNullableTypeNames", term25657);
        setField(term25652, term25652.getClass(), "forwardDeclaredTypes", term25659);
        setField(term25652, term25652.getClass(), "typesIndexedByProperty", term25661);
        setField(term25652, term25652.getClass(), "eachRefTypeIndexedByProperty", term25662);
        setField(term25652, term25652.getClass(), "greatestSubtypeByProperty", term25663);
        setField(term25652, term25652.getClass(), "interfaceToImplementors", null);
        setField(term25652, term25652.getClass(), "unresolvedNamedTypes", null);
        setField(term25652, term25652.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term25652, term25652.getClass(), "lastGeneration", false);
        setField(term25652, term25652.getClass(), "templateTypeName", null);
        setField(term25652, term25652.getClass(), "templateType", null);
        setBooleanField(term25652, term25652.getClass(), "tolerateUndefinedValues", false);
        setField(term25652, term25652.getClass(), "resolveMode", null);
        setField(term25651, term25651.getClass(), "registry", term25652);
        setField(term25651, term25651.getClass(), "reverseInterpreter", null);
        setField(term25651, term25651.getClass(), "syntacticScope", null);
        setField(term25651, term25651.getClass(), "functionScope", null);
        setField(term25651, term25651.getClass(), "bottomScope", null);
        setField(term25651, term25651.getClass(), "assertionFunctionsMap", null);
        setField(term25651, term25651.getClass(), "cfg", null);
        setField(term25651, term25651.getClass(), "joinOp", null);
        setField(term25651, term25651.getClass(), "orderedWorkSet", null);
        Class<? extends Object> term25671 = Class.forName((String) "com.google.javascript.rhino.jstype.BooleanLiteralSet");
        Field term25670 = ((Class) term25671).getDeclaredField((String) "BOTH");
        ((Field) term25670).setAccessible(true);
        Object enum30 = ((Field) term25670).get((Object) null);
        HashMap term25602 = new HashMap();
        HashMap term25608 = new HashMap();
        Set<Object> term25949 =  ((Map) term25608).keySet();
        HashSet term25607 = new HashSet((Collection<? extends Object>) term25949);
        HashMap term25614 = new HashMap();
        Set<Object> term25950 =  ((Map) term25614).keySet();
        HashSet term25613 = new HashSet((Collection<? extends Object>) term25950);
        HashMap term25620 = new HashMap();
        Set<Object> term25951 =  ((Map) term25620).keySet();
        HashSet term25619 = new HashSet((Collection<? extends Object>) term25951);
        HashMap term25625 = new HashMap();
        HashMap term25630 = new HashMap();
        HashMap term25635 = new HashMap();
        term25642 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair"));
        Object term25599 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term25600 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term25601 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 1);
        setField(term25642, term25642.getClass(), "toBooleanOutcomes", enum30);
        setField(term25642, term25642.getClass(), "booleanValues", enum30);
        setField(term25642, term25642.getClass(), "leftScope", null);
        setField(term25642, term25642.getClass(), "rightScope", null);
        setField(term25642, term25642.getClass(), "joinedScope", null);
        setField(term25599, term25599.getClass(), "compiler", null);
        setField(term25600, term25600.getClass(), "reporter", null);
        setField(term25600, term25600.getClass(), "nativeTypes", term25601);
        setField(term25600, term25600.getClass(), "namesToTypes", term25602);
        setField(term25600, term25600.getClass(), "namespaces", term25607);
        setField(term25600, term25600.getClass(), "nonNullableTypeNames", term25613);
        setField(term25600, term25600.getClass(), "forwardDeclaredTypes", term25619);
        setField(term25600, term25600.getClass(), "typesIndexedByProperty", term25625);
        setField(term25600, term25600.getClass(), "eachRefTypeIndexedByProperty", term25630);
        setField(term25600, term25600.getClass(), "greatestSubtypeByProperty", term25635);
        setField(term25600, term25600.getClass(), "interfaceToImplementors", null);
        setField(term25600, term25600.getClass(), "unresolvedNamedTypes", null);
        setField(term25600, term25600.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term25600, term25600.getClass(), "lastGeneration", false);
        setField(term25600, term25600.getClass(), "templateTypeName", null);
        setField(term25600, term25600.getClass(), "templateType", null);
        setBooleanField(term25600, term25600.getClass(), "tolerateUndefinedValues", false);
        setField(term25600, term25600.getClass(), "resolveMode", null);
        setField(term25599, term25599.getClass(), "registry", term25600);
        setField(term25599, term25599.getClass(), "reverseInterpreter", null);
        setField(term25599, term25599.getClass(), "syntacticScope", null);
        setField(term25599, term25599.getClass(), "functionScope", null);
        setField(term25599, term25599.getClass(), "bottomScope", null);
        setField(term25599, term25599.getClass(), "assertionFunctionsMap", null);
        setField(term25599, term25599.getClass(), "cfg", null);
        setField(term25599, term25599.getClass(), "joinOp", null);
        setField(term25599, term25599.getClass(), "orderedWorkSet", null);
        setField(term25642, term25642.getClass(), "this$0", term25599);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object retValue = callMethod(klass, "newBooleanOutcomePair", argTypes, term5845, args);
        assertTrue(recursiveEquals(term5845, term25651));
        assertTrue(recursiveEquals(retValue, term25642));
    }

};


