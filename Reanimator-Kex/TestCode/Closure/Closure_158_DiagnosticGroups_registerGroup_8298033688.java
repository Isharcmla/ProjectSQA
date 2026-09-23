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
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class DiagnosticGroups_registerGroup_8298033688 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13;
     Object term5886;
     Object term5855;

    public DiagnosticGroups_registerGroup_8298033688() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term15 = new HashMap();
        Set<Object> term5903 =  ((Map) term15).keySet();
        HashSet term14 = new HashSet((Collection<? extends Object>) term5903);
        term13 = newInstance(Class.forName("com.google.javascript.jscomp.DiagnosticGroup"));
        setField(term13, term13.getClass(), "types", term14);
        setField(term13, term13.getClass(), "name", "RMFIsYGgne");
        HashMap term5888 = new HashMap();
        Set<Object> term5914 =  ((Map) term5888).keySet();
        HashSet term5887 = new HashSet((Collection<? extends Object>) term5914);
        term5886 = newInstance(Class.forName("com.google.javascript.jscomp.DiagnosticGroup"));
        setField(term5886, term5886.getClass(), "types", term5887);
        setField(term5886, term5886.getClass(), "name", "RMFIsYGgne");
        HashMap term5857 = new HashMap();
        Set<Object> term5935 =  ((Map) term5857).keySet();
        HashSet term5856 = new HashSet((Collection<? extends Object>) term5935);
        term5855 = newInstance(Class.forName("com.google.javascript.jscomp.DiagnosticGroup"));
        setField(term5855, term5855.getClass(), "types", term5856);
        setField(term5855, term5855.getClass(), "name", "RMFIsYGgne");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DiagnosticGroups");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.DiagnosticGroup");
        Object[] args = new Object[2];
        args[0] = "PAEBtnZtTD";
        args[1] = term13;
        Object retValue = callMethod(klass, "registerGroup", argTypes, null, args);
        assertTrue(recursiveEquals(term13, "PAEBtnZtTD"));
        assertTrue(recursiveEquals(retValue, term5855));
    }

};


