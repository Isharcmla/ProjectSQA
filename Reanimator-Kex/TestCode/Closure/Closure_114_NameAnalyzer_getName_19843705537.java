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
import java.lang.Boolean;

public class NameAnalyzer_getName_19843705537 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1066;
     Object term1139;
     Object term8232;
     Object term8167;

    public NameAnalyzer_getName_19843705537() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1067 = new HashMap();
        HashMap term1083 = new HashMap();
        Set<Object> term8254 =  ((Map) term1083).keySet();
        HashSet term1082 = new HashSet((Collection<? extends Object>) term8254);
        ArrayList term1094 = new ArrayList();
        HashMap term1099 = new HashMap();
        Set<Object> term8255 =  ((Map) term1099).keySet();
        HashSet term1098 = new HashSet((Collection<? extends Object>) term8255);
        ArrayList term1113 = new ArrayList();
        ((ArrayList) term1113).add((Object)null);
        ((ArrayList) term1113).add((Object)null);
        ((ArrayList) term1113).add((Object)null);
        HashMap term1117 = new HashMap();
        term1066 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        Object term1093 = newInstance(Class.forName("com.google.javascript.jscomp.AstChangeProxy"));
        setField(term1066, term1066.getClass(), "compiler", null);
        setField(term1066, term1066.getClass(), "allNames", term1067);
        setField(term1066, term1066.getClass(), "referenceGraph", null);
        setField(term1066, term1066.getClass(), "scopes", null);
        setBooleanField(term1066, term1066.getClass(), "removeUnreferenced", true);
        setField(term1066, term1066.getClass(), "globalNames", term1082);
        setField(term1093, term1093.getClass(), "listeners", term1094);
        setField(term1066, term1066.getClass(), "changeProxy", term1093);
        setField(term1066, term1066.getClass(), "externalNames", term1098);
        setField(term1066, term1066.getClass(), "refNodes", term1113);
        setField(term1066, term1066.getClass(), "aliases", term1117);
        term1139 = new Boolean(true);
        HashMap term8233 = new HashMap();
        HashMap term8243 = new HashMap();
        Set<Object> term8266 =  ((Map) term8243).keySet();
        HashSet term8242 = new HashSet((Collection<? extends Object>) term8266);
        ArrayList term8245 = new ArrayList();
        HashMap term8248 = new HashMap();
        Set<Object> term8267 =  ((Map) term8248).keySet();
        HashSet term8247 = new HashSet((Collection<? extends Object>) term8267);
        ArrayList term8249 = new ArrayList();
        ((ArrayList) term8249).add((Object)null);
        ((ArrayList) term8249).add((Object)null);
        ((ArrayList) term8249).add((Object)null);
        HashMap term8251 = new HashMap();
        term8232 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        Object term8244 = newInstance(Class.forName("com.google.javascript.jscomp.AstChangeProxy"));
        setField(term8232, term8232.getClass(), "compiler", null);
        setField(term8232, term8232.getClass(), "allNames", term8233);
        setField(term8232, term8232.getClass(), "referenceGraph", null);
        setField(term8232, term8232.getClass(), "scopes", null);
        setBooleanField(term8232, term8232.getClass(), "removeUnreferenced", true);
        setField(term8232, term8232.getClass(), "globalNames", term8242);
        setField(term8244, term8244.getClass(), "listeners", term8245);
        setField(term8232, term8232.getClass(), "changeProxy", term8244);
        setField(term8232, term8232.getClass(), "externalNames", term8247);
        setField(term8232, term8232.getClass(), "refNodes", term8249);
        setField(term8232, term8232.getClass(), "aliases", term8251);
        ArrayList term8180 = new ArrayList();
        term8167 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer$JsName"));
        setField(term8167, term8167.getClass(), "name", "wfaXBpWAUH");
        setField(term8167, term8167.getClass(), "prototypeNames", term8180);
        setBooleanField(term8167, term8167.getClass(), "externallyDefined", false);
        setBooleanField(term8167, term8167.getClass(), "referenced", false);
        setBooleanField(term8167, term8167.getClass(), "hasWrittenDescendants", false);
        setBooleanField(term8167, term8167.getClass(), "hasInstanceOfReference", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NameAnalyzer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "wfaXBpWAUH";
        args[1] = term1139;
        Object retValue = callMethod(klass, "getName", argTypes, term1066, args);
        assertTrue(recursiveEquals(term1066, term8232));
        assertTrue(recursiveEquals(term1139, true));
        assertTrue(recursiveEquals(retValue, term8167));
    }

};


