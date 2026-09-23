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
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.lang.String;

public class NameAnalyzer_recordReference_175844602631 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term233;
     Object enum3;

    public NameAnalyzer_recordReference_175844602631() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term234 = new HashMap();
        HashMap term250 = new HashMap();
        Set<Object> term5140 =  ((Map) term250).keySet();
        HashSet term249 = new HashSet((Collection<? extends Object>) term5140);
        ArrayList term267 = new ArrayList();
        HashMap term272 = new HashMap();
        Set<Object> term5141 =  ((Map) term272).keySet();
        HashSet term271 = new HashSet((Collection<? extends Object>) term5141);
        ArrayList term280 = new ArrayList();
        ((ArrayList) term280).add((Object)null);
        ((ArrayList) term280).add((Object)null);
        ((ArrayList) term280).add((Object)null);
        ((ArrayList) term280).add((Object)null);
        ((ArrayList) term280).add((Object)null);
        ((ArrayList) term280).add((Object)null);
        HashMap term284 = new HashMap();
        term233 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        Object term266 = newInstance(Class.forName("com.google.javascript.jscomp.AstChangeProxy"));
        setField(term233, term233.getClass(), "compiler", null);
        setField(term233, term233.getClass(), "allNames", term234);
        setField(term233, term233.getClass(), "referenceGraph", null);
        setField(term233, term233.getClass(), "scopes", null);
        setBooleanField(term233, term233.getClass(), "removeUnreferenced", false);
        setField(term233, term233.getClass(), "globalNames", term249);
        setField(term266, term266.getClass(), "listeners", term267);
        setField(term233, term233.getClass(), "changeProxy", term266);
        setField(term233, term233.getClass(), "externalNames", term271);
        setField(term233, term233.getClass(), "refNodes", term280);
        setField(term233, term233.getClass(), "aliases", term284);
        Class<? extends Object> term5163 = Class.forName((String) "com.google.javascript.jscomp.NameAnalyzer$RefType");
        Field term5162 = ((Class) term5163).getDeclaredField((String) "REGULAR");
        ((Field) term5162).setAccessible(true);
        enum3 = ((Field) term5162).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NameAnalyzer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.NameAnalyzer$RefType");
        Object[] args = new Object[3];
        args[0] = "nGKItKLYNC";
        args[1] = "UiUYnPrcCi";
        args[2] = enum3;
        try {
            callMethod(klass, "recordReference", argTypes, term233, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


