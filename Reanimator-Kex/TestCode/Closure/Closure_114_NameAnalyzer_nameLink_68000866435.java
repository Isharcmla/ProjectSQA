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
import java.util.ArrayList;

public class NameAnalyzer_nameLink_68000866435 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term884;
     Object term7917;

    public NameAnalyzer_nameLink_68000866435() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term885 = new HashMap();
        HashMap term901 = new HashMap();
        Set<Object> term7931 =  ((Map) term901).keySet();
        HashSet term900 = new HashSet((Collection<? extends Object>) term7931);
        ArrayList term918 = new ArrayList();
        HashMap term923 = new HashMap();
        Set<Object> term7932 =  ((Map) term923).keySet();
        HashSet term922 = new HashSet((Collection<? extends Object>) term7932);
        ArrayList term939 = new ArrayList();
        ((ArrayList) term939).add((Object)null);
        ((ArrayList) term939).add((Object)null);
        ((ArrayList) term939).add((Object)null);
        ((ArrayList) term939).add((Object)null);
        ((ArrayList) term939).add((Object)null);
        HashMap term943 = new HashMap();
        term884 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        Object term917 = newInstance(Class.forName("com.google.javascript.jscomp.AstChangeProxy"));
        setField(term884, term884.getClass(), "compiler", null);
        setField(term884, term884.getClass(), "allNames", term885);
        setField(term884, term884.getClass(), "referenceGraph", null);
        setField(term884, term884.getClass(), "scopes", null);
        setBooleanField(term884, term884.getClass(), "removeUnreferenced", true);
        setField(term884, term884.getClass(), "globalNames", term900);
        setField(term917, term917.getClass(), "listeners", term918);
        setField(term884, term884.getClass(), "changeProxy", term917);
        setField(term884, term884.getClass(), "externalNames", term922);
        setField(term884, term884.getClass(), "refNodes", term939);
        setField(term884, term884.getClass(), "aliases", term943);
        HashMap term7918 = new HashMap();
        HashMap term7920 = new HashMap();
        Set<Object> term7943 =  ((Map) term7920).keySet();
        HashSet term7919 = new HashSet((Collection<? extends Object>) term7943);
        ArrayList term7922 = new ArrayList();
        HashMap term7925 = new HashMap();
        Set<Object> term7944 =  ((Map) term7925).keySet();
        HashSet term7924 = new HashSet((Collection<? extends Object>) term7944);
        ArrayList term7926 = new ArrayList();
        ((ArrayList) term7926).add((Object)null);
        ((ArrayList) term7926).add((Object)null);
        ((ArrayList) term7926).add((Object)null);
        ((ArrayList) term7926).add((Object)null);
        ((ArrayList) term7926).add((Object)null);
        HashMap term7928 = new HashMap();
        term7917 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        Object term7921 = newInstance(Class.forName("com.google.javascript.jscomp.AstChangeProxy"));
        setField(term7917, term7917.getClass(), "compiler", null);
        setField(term7917, term7917.getClass(), "allNames", term7918);
        setField(term7917, term7917.getClass(), "referenceGraph", null);
        setField(term7917, term7917.getClass(), "scopes", null);
        setBooleanField(term7917, term7917.getClass(), "removeUnreferenced", true);
        setField(term7917, term7917.getClass(), "globalNames", term7919);
        setField(term7921, term7921.getClass(), "listeners", term7922);
        setField(term7917, term7917.getClass(), "changeProxy", term7921);
        setField(term7917, term7917.getClass(), "externalNames", term7924);
        setField(term7917, term7917.getClass(), "refNodes", term7926);
        setField(term7917, term7917.getClass(), "aliases", term7928);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NameAnalyzer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "sEccwbJKYE";
        Object retValue = callMethod(klass, "nameLink", argTypes, term884, args);
        assertTrue(recursiveEquals(term884, term7917));
        assertTrue(recursiveEquals(retValue, "<a href=\"#sEccwbJKYE\">sEccwbJKYE</a>"));
    }

};


