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
import java.lang.StringIndexOutOfBoundsException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;

public class NameAnalyzer_appendListItem_194071392134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term845;
     Object term910;

    public NameAnalyzer_appendListItem_194071392134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term846 = new HashMap();
        HashMap term860 = new HashMap();
        HashMap term877 = new HashMap();
        Set<Object> term11474 =  ((Map) term877).keySet();
        HashSet term876 = new HashSet((Collection<? extends Object>) term11474);
        ArrayList term886 = new ArrayList();
        HashMap term891 = new HashMap();
        Set<Object> term11475 =  ((Map) term891).keySet();
        HashSet term890 = new HashSet((Collection<? extends Object>) term11475);
        ArrayList term896 = new ArrayList();
        ((ArrayList) term896).add((Object)null);
        ((ArrayList) term896).add((Object)null);
        HashMap term900 = new HashMap();
        term845 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        Object term885 = newInstance(Class.forName("com.google.javascript.jscomp.AstChangeProxy"));
        setField(term845, term845.getClass(), "compiler", null);
        setField(term845, term845.getClass(), "allNames", term846);
        setField(term845, term845.getClass(), "referenceGraph", null);
        setField(term845, term845.getClass(), "scopes", term860);
        setBooleanField(term845, term845.getClass(), "removeUnreferenced", true);
        setField(term845, term845.getClass(), "globalNames", term876);
        setField(term885, term885.getClass(), "listeners", term886);
        setField(term845, term845.getClass(), "changeProxy", term885);
        setField(term845, term845.getClass(), "externalNames", term890);
        setField(term845, term845.getClass(), "refNodes", term896);
        setField(term845, term845.getClass(), "aliases", term900);
        term910 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term911 = (byte[]) newByteArray(16);
        setField(term910, term910.getClass(), "value", term911);
        setByteField(term910, term910.getClass(), "coder", (byte) 47);
        setIntField(term910, term910.getClass(), "count", -1371869594);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NameAnalyzer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term910;
        args[1] = "nHXjMycHlU";
        try {
            callMethod(klass, "appendListItem", argTypes, term845, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


