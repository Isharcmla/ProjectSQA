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
     Object term259;
     Object enum3;

    public NameAnalyzer_recordReference_175844602631() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term260 = new HashMap();
        HashMap term274 = new HashMap();
        HashMap term291 = new HashMap();
        Set<Object> term8795 =  ((Map) term291).keySet();
        HashSet term290 = new HashSet((Collection<? extends Object>) term8795);
        ArrayList term300 = new ArrayList();
        HashMap term305 = new HashMap();
        Set<Object> term8796 =  ((Map) term305).keySet();
        HashSet term304 = new HashSet((Collection<? extends Object>) term8796);
        ArrayList term319 = new ArrayList();
        ((ArrayList) term319).add((Object)null);
        ((ArrayList) term319).add((Object)null);
        ((ArrayList) term319).add((Object)null);
        ((ArrayList) term319).add((Object)null);
        ((ArrayList) term319).add((Object)null);
        ((ArrayList) term319).add((Object)null);
        ((ArrayList) term319).add((Object)null);
        HashMap term323 = new HashMap();
        term259 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        Object term299 = newInstance(Class.forName("com.google.javascript.jscomp.AstChangeProxy"));
        setField(term259, term259.getClass(), "compiler", null);
        setField(term259, term259.getClass(), "allNames", term260);
        setField(term259, term259.getClass(), "referenceGraph", null);
        setField(term259, term259.getClass(), "scopes", term274);
        setBooleanField(term259, term259.getClass(), "removeUnreferenced", false);
        setField(term259, term259.getClass(), "globalNames", term290);
        setField(term299, term299.getClass(), "listeners", term300);
        setField(term259, term259.getClass(), "changeProxy", term299);
        setField(term259, term259.getClass(), "externalNames", term304);
        setField(term259, term259.getClass(), "refNodes", term319);
        setField(term259, term259.getClass(), "aliases", term323);
        Class<? extends Object> term8818 = Class.forName((String) "com.google.javascript.jscomp.NameAnalyzer$RefType");
        Field term8817 = ((Class) term8818).getDeclaredField((String) "REGULAR");
        ((Field) term8817).setAccessible(true);
        enum3 = ((Field) term8817).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NameAnalyzer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.NameAnalyzer$RefType");
        Object[] args = new Object[3];
        args[0] = "SbAoxhfrkn";
        args[1] = "kuTXqwMtDB";
        args[2] = enum3;
        try {
            callMethod(klass, "recordReference", argTypes, term259, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


