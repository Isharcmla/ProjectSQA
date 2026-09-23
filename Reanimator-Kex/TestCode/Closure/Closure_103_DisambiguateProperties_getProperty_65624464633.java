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

public class DisambiguateProperties_getProperty_65624464633 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2923;
     Object term198764;
     Object term198741;

    public DisambiguateProperties_getProperty_65624464633() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2971 = new HashMap();
        term2923 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        setField(term2923, term2923.getClass(), "properties", term2971);
        HashMap term198765 = new HashMap();
        term198764 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        setBooleanField(term198764, term198764.getClass(), "showInvalidationWarnings", false);
        setField(term198764, term198764.getClass(), "compiler", null);
        setField(term198764, term198764.getClass(), "typeSystem", null);
        setField(term198764, term198764.getClass(), "properties", term198765);
        HashMap term198743 = new HashMap();
        Set<Object> term198774 =  ((Map) term198743).keySet();
        HashSet term198742 = new HashSet((Collection<? extends Object>) term198774);
        HashMap term198750 = new HashMap();
        Set<Object> term198775 =  ((Map) term198750).keySet();
        HashSet term198749 = new HashSet((Collection<? extends Object>) term198775);
        HashMap term198755 = new HashMap();
        HashMap term198737 = new HashMap();
        term198741 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties$Property"));
        Object term198735 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        setField(term198741, term198741.getClass(), "name", null);
        setField(term198741, term198741.getClass(), "types", null);
        setField(term198741, term198741.getClass(), "typesToSkip", term198742);
        setBooleanField(term198741, term198741.getClass(), "skipRenaming", false);
        setField(term198741, term198741.getClass(), "renameNodes", term198749);
        setField(term198741, term198741.getClass(), "rootTypes", term198755);
        setBooleanField(term198735, term198735.getClass(), "showInvalidationWarnings", false);
        setField(term198735, term198735.getClass(), "compiler", null);
        setField(term198735, term198735.getClass(), "typeSystem", null);
        setField(term198735, term198735.getClass(), "properties", term198737);
        setField(term198741, term198741.getClass(), "this$0", term198735);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DisambiguateProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "getProperty", argTypes, term2923, args);
        assertTrue(recursiveEquals(term2923, term198764));
        assertTrue(recursiveEquals(retValue, term198741));
    }

};


