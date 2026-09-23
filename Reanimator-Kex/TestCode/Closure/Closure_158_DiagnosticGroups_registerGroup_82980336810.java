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

public class DiagnosticGroups_registerGroup_82980336810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1083;
     Object term8835;
     Object term8766;

    public DiagnosticGroups_registerGroup_82980336810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1086 = new HashMap();
        Set<Object> term8858 =  ((Map) term1086).keySet();
        HashSet term1085 = new HashSet((Collection<? extends Object>) term8858);
        HashMap term1106 = new HashMap();
        Set<Object> term8869 =  ((Map) term1106).keySet();
        HashSet term1105 = new HashSet((Collection<? extends Object>) term8869);
        term1083 = (Object[]) newArray("com.google.javascript.jscomp.DiagnosticGroup", 2);
        Object term1084 = newInstance(Class.forName("com.google.javascript.jscomp.DiagnosticGroup"));
        Object term1104 = newInstance(Class.forName("com.google.javascript.jscomp.DiagnosticGroup"));
        setField(term1084, term1084.getClass(), "types", term1085);
        setField(term1084, term1084.getClass(), "name", "eZFUvlxvGV");
        setElement(term1083, 0, term1084);
        setField(term1104, term1104.getClass(), "types", term1105);
        setField(term1104, term1104.getClass(), "name", "AijpHYOFuy");
        setElement(term1083, 1, term1104);
        HashMap term8838 = new HashMap();
        Set<Object> term8890 =  ((Map) term8838).keySet();
        HashSet term8837 = new HashSet((Collection<? extends Object>) term8890);
        HashMap term8844 = new HashMap();
        Set<Object> term8901 =  ((Map) term8844).keySet();
        HashSet term8843 = new HashSet((Collection<? extends Object>) term8901);
        term8835 = (Object[]) newArray("com.google.javascript.jscomp.DiagnosticGroup", 2);
        Object term8836 = newInstance(Class.forName("com.google.javascript.jscomp.DiagnosticGroup"));
        Object term8842 = newInstance(Class.forName("com.google.javascript.jscomp.DiagnosticGroup"));
        setField(term8836, term8836.getClass(), "types", term8837);
        setField(term8836, term8836.getClass(), "name", "eZFUvlxvGV");
        setElement(term8835, 0, term8836);
        setField(term8842, term8842.getClass(), "types", term8843);
        setField(term8842, term8842.getClass(), "name", "AijpHYOFuy");
        setElement(term8835, 1, term8842);
        term8766 = newInstance(Class.forName("com.google.javascript.jscomp.DiagnosticGroup"));
        Object term8767 = newInstance(Class.forName("com.google.common.collect.EmptyImmutableSet"));
        setField(term8767, term8767.getClass(), "asList", null);
        setField(term8766, term8766.getClass(), "types", term8767);
        setField(term8766, term8766.getClass(), "name", "hNxWaHcfhY");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DiagnosticGroups");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(Class.forName("com.google.javascript.jscomp.DiagnosticGroup"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = "hNxWaHcfhY";
        args[1] = term1083;
        Object retValue = callMethod(klass, "registerGroup", argTypes, null, args);
        assertTrue(recursiveEquals(term1083, term8835));
        assertTrue(recursiveEquals(retValue, term8766));
    }

};


