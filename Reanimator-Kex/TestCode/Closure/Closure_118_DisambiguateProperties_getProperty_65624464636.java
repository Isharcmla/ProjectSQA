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

public class DisambiguateProperties_getProperty_65624464636 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7715;
     Object term8579;
     Object term8556;

    public DisambiguateProperties_getProperty_65624464636() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7763 = new HashMap();
        term7715 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        setField(term7715, term7715.getClass(), "properties", term7763);
        HashMap term8580 = new HashMap();
        term8579 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        setField(term8579, term8579.getClass(), "compiler", null);
        setField(term8579, term8579.getClass(), "typeSystem", null);
        setField(term8579, term8579.getClass(), "invalidationMap", null);
        setField(term8579, term8579.getClass(), "propertiesToErrorFor", null);
        setField(term8579, term8579.getClass(), "properties", term8580);
        HashMap term8558 = new HashMap();
        Set<Object> term8589 =  ((Map) term8558).keySet();
        HashSet term8557 = new HashSet((Collection<? extends Object>) term8589);
        HashMap term8565 = new HashMap();
        Set<Object> term8590 =  ((Map) term8565).keySet();
        HashSet term8564 = new HashSet((Collection<? extends Object>) term8590);
        HashMap term8570 = new HashMap();
        HashMap term8552 = new HashMap();
        term8556 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties$Property"));
        Object term8551 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        setField(term8556, term8556.getClass(), "name", null);
        setField(term8556, term8556.getClass(), "types", null);
        setField(term8556, term8556.getClass(), "typesToSkip", term8557);
        setBooleanField(term8556, term8556.getClass(), "skipRenaming", false);
        setField(term8556, term8556.getClass(), "renameNodes", term8564);
        setField(term8556, term8556.getClass(), "rootTypes", term8570);
        setField(term8551, term8551.getClass(), "compiler", null);
        setField(term8551, term8551.getClass(), "typeSystem", null);
        setField(term8551, term8551.getClass(), "invalidationMap", null);
        setField(term8551, term8551.getClass(), "propertiesToErrorFor", null);
        setField(term8551, term8551.getClass(), "properties", term8552);
        setField(term8556, term8556.getClass(), "this$0", term8551);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DisambiguateProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "getProperty", argTypes, term7715, args);
        assertTrue(recursiveEquals(term7715, term8579));
        assertTrue(recursiveEquals(retValue, term8556));
    }

};


