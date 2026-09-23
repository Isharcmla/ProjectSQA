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

public class NameAnalyzer_isExternallyReferenceable_79181543043 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1968;
     Object term2048;

    public NameAnalyzer_isExternallyReferenceable_79181543043() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1969 = new HashMap();
        HashMap term1983 = new HashMap();
        HashMap term2000 = new HashMap();
        Set<Object> term13041 =  ((Map) term2000).keySet();
        HashSet term1999 = new HashSet((Collection<? extends Object>) term13041);
        ArrayList term2013 = new ArrayList();
        HashMap term2018 = new HashMap();
        Set<Object> term13042 =  ((Map) term2018).keySet();
        HashSet term2017 = new HashSet((Collection<? extends Object>) term13042);
        ArrayList term2034 = new ArrayList();
        ((ArrayList) term2034).add((Object)null);
        ((ArrayList) term2034).add((Object)null);
        ((ArrayList) term2034).add((Object)null);
        ((ArrayList) term2034).add((Object)null);
        ((ArrayList) term2034).add((Object)null);
        ((ArrayList) term2034).add((Object)null);
        ((ArrayList) term2034).add((Object)null);
        ((ArrayList) term2034).add((Object)null);
        HashMap term2038 = new HashMap();
        term1968 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        Object term2012 = newInstance(Class.forName("com.google.javascript.jscomp.AstChangeProxy"));
        setField(term1968, term1968.getClass(), "compiler", null);
        setField(term1968, term1968.getClass(), "allNames", term1969);
        setField(term1968, term1968.getClass(), "referenceGraph", null);
        setField(term1968, term1968.getClass(), "scopes", term1983);
        setBooleanField(term1968, term1968.getClass(), "removeUnreferenced", true);
        setField(term1968, term1968.getClass(), "globalNames", term1999);
        setField(term2012, term2012.getClass(), "listeners", term2013);
        setField(term1968, term1968.getClass(), "changeProxy", term2012);
        setField(term1968, term1968.getClass(), "externalNames", term2017);
        setField(term1968, term1968.getClass(), "refNodes", term2034);
        setField(term1968, term1968.getClass(), "aliases", term2038);
        HashMap term2049 = new HashMap();
        term2048 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term2063 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term2067 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2069 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2071 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2073 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2076 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2079 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2083 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2085 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2090 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2092 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term2048, term2048.getClass(), "vars", term2049);
        setField(term2063, term2063.getClass(), "vars", null);
        setField(term2063, term2063.getClass(), "parent", null);
        setIntField(term2063, term2063.getClass(), "depth", 0);
        setField(term2063, term2063.getClass(), "rootNode", null);
        setField(term2063, term2063.getClass(), "thisType", null);
        setBooleanField(term2063, term2063.getClass(), "isBottom", false);
        setField(term2063, term2063.getClass(), "arguments", null);
        setField(term2048, term2048.getClass(), "parent", term2063);
        setIntField(term2048, term2048.getClass(), "depth", 1557431527);
        setIntField(term2067, term2067.getClass(), "type", -2066804303);
        setIntField(term2069, term2069.getClass(), "type", -1731761810);
        setIntField(term2071, term2071.getClass(), "type", 197109649);
        setIntField(term2073, term2073.getClass(), "type", -1239406390);
        setField(term2073, term2073.getClass(), "next", null);
        setField(term2073, term2073.getClass(), "first", null);
        setField(term2073, term2073.getClass(), "last", term2073);
        setField(term2073, term2073.getClass(), "propListHead", null);
        setIntField(term2073, term2073.getClass(), "sourcePosition", 0);
        setField(term2073, term2073.getClass(), "jsType", null);
        setField(term2073, term2073.getClass(), "parent", null);
        setField(term2071, term2071.getClass(), "next", term2073);
        setIntField(term2076, term2076.getClass(), "type", 0);
        setField(term2076, term2076.getClass(), "next", null);
        setField(term2076, term2076.getClass(), "first", null);
        setField(term2076, term2076.getClass(), "last", null);
        setField(term2076, term2076.getClass(), "propListHead", null);
        setIntField(term2076, term2076.getClass(), "sourcePosition", 0);
        setField(term2076, term2076.getClass(), "jsType", null);
        setField(term2076, term2076.getClass(), "parent", null);
        setField(term2071, term2071.getClass(), "first", term2076);
        setIntField(term2079, term2079.getClass(), "type", 1041916673);
        setField(term2079, term2079.getClass(), "next", null);
        setField(term2079, term2079.getClass(), "first", term2069);
        setField(term2079, term2079.getClass(), "last", null);
        setField(term2079, term2079.getClass(), "propListHead", null);
        setIntField(term2079, term2079.getClass(), "sourcePosition", 0);
        setField(term2079, term2079.getClass(), "jsType", null);
        setField(term2079, term2079.getClass(), "parent", null);
        setField(term2071, term2071.getClass(), "last", term2079);
        setField(term2071, term2071.getClass(), "propListHead", null);
        setIntField(term2071, term2071.getClass(), "sourcePosition", 0);
        setField(term2071, term2071.getClass(), "jsType", null);
        setField(term2071, term2071.getClass(), "parent", null);
        setField(term2069, term2069.getClass(), "next", term2071);
        setField(term2069, term2069.getClass(), "first", term2069);
        setIntField(term2083, term2083.getClass(), "type", -1885090354);
        setField(term2083, term2083.getClass(), "next", term2067);
        setIntField(term2085, term2085.getClass(), "type", 0);
        setField(term2085, term2085.getClass(), "next", null);
        setField(term2085, term2085.getClass(), "first", null);
        setField(term2085, term2085.getClass(), "last", null);
        setField(term2085, term2085.getClass(), "propListHead", null);
        setIntField(term2085, term2085.getClass(), "sourcePosition", 0);
        setField(term2085, term2085.getClass(), "jsType", null);
        setField(term2085, term2085.getClass(), "parent", null);
        setField(term2083, term2083.getClass(), "first", term2085);
        setField(term2083, term2083.getClass(), "last", term2073);
        setField(term2083, term2083.getClass(), "propListHead", null);
        setIntField(term2083, term2083.getClass(), "sourcePosition", 0);
        setField(term2083, term2083.getClass(), "jsType", null);
        setField(term2083, term2083.getClass(), "parent", null);
        setField(term2069, term2069.getClass(), "last", term2083);
        setField(term2069, term2069.getClass(), "propListHead", null);
        setIntField(term2069, term2069.getClass(), "sourcePosition", 0);
        setField(term2069, term2069.getClass(), "jsType", null);
        setField(term2069, term2069.getClass(), "parent", null);
        setField(term2067, term2067.getClass(), "next", term2069);
        setIntField(term2090, term2090.getClass(), "type", -601863069);
        setIntField(term2092, term2092.getClass(), "type", 663292551);
        setField(term2092, term2092.getClass(), "next", term2083);
        setField(term2092, term2092.getClass(), "first", term2073);
        setField(term2092, term2092.getClass(), "last", term2067);
        setField(term2092, term2092.getClass(), "propListHead", null);
        setIntField(term2092, term2092.getClass(), "sourcePosition", 0);
        setField(term2092, term2092.getClass(), "jsType", null);
        setField(term2092, term2092.getClass(), "parent", null);
        setField(term2090, term2090.getClass(), "next", term2092);
        setField(term2090, term2090.getClass(), "first", term2085);
        setField(term2090, term2090.getClass(), "last", term2073);
        setField(term2090, term2090.getClass(), "propListHead", null);
        setIntField(term2090, term2090.getClass(), "sourcePosition", 0);
        setField(term2090, term2090.getClass(), "jsType", null);
        setField(term2090, term2090.getClass(), "parent", null);
        setField(term2067, term2067.getClass(), "first", term2090);
        setField(term2067, term2067.getClass(), "last", term2090);
        setField(term2067, term2067.getClass(), "propListHead", null);
        setIntField(term2067, term2067.getClass(), "sourcePosition", 0);
        setField(term2067, term2067.getClass(), "jsType", null);
        setField(term2067, term2067.getClass(), "parent", null);
        setField(term2048, term2048.getClass(), "rootNode", term2067);
        setField(term2048, term2048.getClass(), "thisType", null);
        setBooleanField(term2048, term2048.getClass(), "isBottom", false);
        setField(term2048, term2048.getClass(), "arguments", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NameAnalyzer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.Scope");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term2048;
        args[1] = "YpJbIgJWWv";
        try {
            callMethod(klass, "isExternallyReferenceable", argTypes, term1968, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


