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

public class NameAnalyzer_removeUnreferenced_149374253332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term650;

    public NameAnalyzer_removeUnreferenced_149374253332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term651 = new HashMap();
        HashMap term667 = new HashMap();
        Set<Object> term5759 =  ((Map) term667).keySet();
        HashSet term666 = new HashSet((Collection<? extends Object>) term5759);
        ArrayList term684 = new ArrayList();
        HashMap term689 = new HashMap();
        Set<Object> term5760 =  ((Map) term689).keySet();
        HashSet term688 = new HashSet((Collection<? extends Object>) term5760);
        ArrayList term699 = new ArrayList();
        ((ArrayList) term699).add((Object)null);
        ((ArrayList) term699).add((Object)null);
        ((ArrayList) term699).add((Object)null);
        HashMap term703 = new HashMap();
        term650 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        Object term683 = newInstance(Class.forName("com.google.javascript.jscomp.AstChangeProxy"));
        setField(term650, term650.getClass(), "compiler", null);
        setField(term650, term650.getClass(), "allNames", term651);
        setField(term650, term650.getClass(), "referenceGraph", null);
        setField(term650, term650.getClass(), "scopes", null);
        setBooleanField(term650, term650.getClass(), "removeUnreferenced", true);
        setField(term650, term650.getClass(), "globalNames", term666);
        setField(term683, term683.getClass(), "listeners", term684);
        setField(term650, term650.getClass(), "changeProxy", term683);
        setField(term650, term650.getClass(), "externalNames", term688);
        setField(term650, term650.getClass(), "refNodes", term699);
        setField(term650, term650.getClass(), "aliases", term703);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NameAnalyzer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "removeUnreferenced", argTypes, term650, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


