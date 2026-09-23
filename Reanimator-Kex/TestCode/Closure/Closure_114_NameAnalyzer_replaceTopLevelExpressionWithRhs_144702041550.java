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
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;

public class NameAnalyzer_replaceTopLevelExpressionWithRhs_144702041550 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3060;
     Object term3123;
     Object term3150;

    public NameAnalyzer_replaceTopLevelExpressionWithRhs_144702041550() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3061 = new HashMap();
        HashMap term3077 = new HashMap();
        Set<Object> term12512 =  ((Map) term3077).keySet();
        HashSet term3076 = new HashSet((Collection<? extends Object>) term12512);
        ArrayList term3094 = new ArrayList();
        HashMap term3099 = new HashMap();
        Set<Object> term12513 =  ((Map) term3099).keySet();
        HashSet term3098 = new HashSet((Collection<? extends Object>) term12513);
        ArrayList term3109 = new ArrayList();
        ((ArrayList) term3109).add((Object)null);
        HashMap term3113 = new HashMap();
        term3060 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        Object term3093 = newInstance(Class.forName("com.google.javascript.jscomp.AstChangeProxy"));
        setField(term3060, term3060.getClass(), "compiler", null);
        setField(term3060, term3060.getClass(), "allNames", term3061);
        setField(term3060, term3060.getClass(), "referenceGraph", null);
        setField(term3060, term3060.getClass(), "scopes", null);
        setBooleanField(term3060, term3060.getClass(), "removeUnreferenced", false);
        setField(term3060, term3060.getClass(), "globalNames", term3076);
        setField(term3093, term3093.getClass(), "listeners", term3094);
        setField(term3060, term3060.getClass(), "changeProxy", term3093);
        setField(term3060, term3060.getClass(), "externalNames", term3098);
        setField(term3060, term3060.getClass(), "refNodes", term3109);
        setField(term3060, term3060.getClass(), "aliases", term3113);
        term3123 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3125 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3127 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3129 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3131 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3134 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3138 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3140 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3145 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3123, term3123.getClass(), "type", 1141317871);
        setIntField(term3125, term3125.getClass(), "type", 890669485);
        setIntField(term3127, term3127.getClass(), "type", 691577392);
        setIntField(term3129, term3129.getClass(), "type", -893623680);
        setIntField(term3131, term3131.getClass(), "type", -1963434938);
        setField(term3131, term3131.getClass(), "next", null);
        setField(term3131, term3131.getClass(), "first", null);
        setField(term3131, term3131.getClass(), "last", null);
        setField(term3131, term3131.getClass(), "propListHead", null);
        setIntField(term3131, term3131.getClass(), "sourcePosition", 0);
        setField(term3131, term3131.getClass(), "jsType", null);
        setField(term3131, term3131.getClass(), "parent", null);
        setField(term3129, term3129.getClass(), "next", term3131);
        setIntField(term3134, term3134.getClass(), "type", 906181092);
        setField(term3134, term3134.getClass(), "next", null);
        setField(term3134, term3134.getClass(), "first", null);
        setField(term3134, term3134.getClass(), "last", term3131);
        setField(term3134, term3134.getClass(), "propListHead", null);
        setIntField(term3134, term3134.getClass(), "sourcePosition", 0);
        setField(term3134, term3134.getClass(), "jsType", null);
        setField(term3134, term3134.getClass(), "parent", null);
        setField(term3129, term3129.getClass(), "first", term3134);
        setField(term3129, term3129.getClass(), "last", term3127);
        setField(term3129, term3129.getClass(), "propListHead", null);
        setIntField(term3129, term3129.getClass(), "sourcePosition", 0);
        setField(term3129, term3129.getClass(), "jsType", null);
        setField(term3129, term3129.getClass(), "parent", null);
        setField(term3127, term3127.getClass(), "next", term3129);
        setField(term3127, term3127.getClass(), "first", term3131);
        setIntField(term3138, term3138.getClass(), "type", 1386130016);
        setIntField(term3140, term3140.getClass(), "type", 1072005683);
        setField(term3140, term3140.getClass(), "next", null);
        setField(term3140, term3140.getClass(), "first", term3134);
        setField(term3140, term3140.getClass(), "last", term3129);
        setField(term3140, term3140.getClass(), "propListHead", null);
        setIntField(term3140, term3140.getClass(), "sourcePosition", 0);
        setField(term3140, term3140.getClass(), "jsType", null);
        setField(term3140, term3140.getClass(), "parent", null);
        setField(term3138, term3138.getClass(), "next", term3140);
        setField(term3138, term3138.getClass(), "first", term3125);
        setField(term3138, term3138.getClass(), "last", term3125);
        setField(term3138, term3138.getClass(), "propListHead", null);
        setIntField(term3138, term3138.getClass(), "sourcePosition", 0);
        setField(term3138, term3138.getClass(), "jsType", null);
        setField(term3138, term3138.getClass(), "parent", null);
        setField(term3127, term3127.getClass(), "last", term3138);
        setField(term3127, term3127.getClass(), "propListHead", null);
        setIntField(term3127, term3127.getClass(), "sourcePosition", 0);
        setField(term3127, term3127.getClass(), "jsType", null);
        setField(term3127, term3127.getClass(), "parent", null);
        setField(term3125, term3125.getClass(), "next", term3127);
        setIntField(term3145, term3145.getClass(), "type", 1861318859);
        setField(term3145, term3145.getClass(), "next", term3138);
        setField(term3145, term3145.getClass(), "first", term3140);
        setField(term3145, term3145.getClass(), "last", term3123);
        setField(term3145, term3145.getClass(), "propListHead", null);
        setIntField(term3145, term3145.getClass(), "sourcePosition", 0);
        setField(term3145, term3145.getClass(), "jsType", null);
        setField(term3145, term3145.getClass(), "parent", null);
        setField(term3125, term3125.getClass(), "first", term3145);
        setField(term3125, term3125.getClass(), "last", term3145);
        setField(term3125, term3125.getClass(), "propListHead", null);
        setIntField(term3125, term3125.getClass(), "sourcePosition", 0);
        setField(term3125, term3125.getClass(), "jsType", null);
        setField(term3125, term3125.getClass(), "parent", null);
        setField(term3123, term3123.getClass(), "next", term3125);
        setField(term3123, term3123.getClass(), "first", term3129);
        setField(term3123, term3123.getClass(), "last", term3131);
        setField(term3123, term3123.getClass(), "propListHead", null);
        setIntField(term3123, term3123.getClass(), "sourcePosition", 0);
        setField(term3123, term3123.getClass(), "jsType", null);
        setField(term3123, term3123.getClass(), "parent", null);
        term3150 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3152 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3154 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3156 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3158 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3161 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3165 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3167 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3172 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3150, term3150.getClass(), "type", 1474524152);
        setIntField(term3152, term3152.getClass(), "type", 568954359);
        setIntField(term3154, term3154.getClass(), "type", 53410913);
        setIntField(term3156, term3156.getClass(), "type", -375014958);
        setIntField(term3158, term3158.getClass(), "type", 1107176718);
        setField(term3158, term3158.getClass(), "next", null);
        setField(term3158, term3158.getClass(), "first", null);
        setField(term3158, term3158.getClass(), "last", null);
        setField(term3158, term3158.getClass(), "propListHead", null);
        setIntField(term3158, term3158.getClass(), "sourcePosition", 0);
        setField(term3158, term3158.getClass(), "jsType", null);
        setField(term3158, term3158.getClass(), "parent", null);
        setField(term3156, term3156.getClass(), "next", term3158);
        setIntField(term3161, term3161.getClass(), "type", 480137250);
        setField(term3161, term3161.getClass(), "next", null);
        setField(term3161, term3161.getClass(), "first", null);
        setField(term3161, term3161.getClass(), "last", term3158);
        setField(term3161, term3161.getClass(), "propListHead", null);
        setIntField(term3161, term3161.getClass(), "sourcePosition", 0);
        setField(term3161, term3161.getClass(), "jsType", null);
        setField(term3161, term3161.getClass(), "parent", null);
        setField(term3156, term3156.getClass(), "first", term3161);
        setField(term3156, term3156.getClass(), "last", term3154);
        setField(term3156, term3156.getClass(), "propListHead", null);
        setIntField(term3156, term3156.getClass(), "sourcePosition", 0);
        setField(term3156, term3156.getClass(), "jsType", null);
        setField(term3156, term3156.getClass(), "parent", null);
        setField(term3154, term3154.getClass(), "next", term3156);
        setField(term3154, term3154.getClass(), "first", term3158);
        setIntField(term3165, term3165.getClass(), "type", -2015854073);
        setIntField(term3167, term3167.getClass(), "type", 538259104);
        setField(term3167, term3167.getClass(), "next", null);
        setField(term3167, term3167.getClass(), "first", term3161);
        setField(term3167, term3167.getClass(), "last", term3156);
        setField(term3167, term3167.getClass(), "propListHead", null);
        setIntField(term3167, term3167.getClass(), "sourcePosition", 0);
        setField(term3167, term3167.getClass(), "jsType", null);
        setField(term3167, term3167.getClass(), "parent", null);
        setField(term3165, term3165.getClass(), "next", term3167);
        setField(term3165, term3165.getClass(), "first", term3152);
        setField(term3165, term3165.getClass(), "last", term3152);
        setField(term3165, term3165.getClass(), "propListHead", null);
        setIntField(term3165, term3165.getClass(), "sourcePosition", 0);
        setField(term3165, term3165.getClass(), "jsType", null);
        setField(term3165, term3165.getClass(), "parent", null);
        setField(term3154, term3154.getClass(), "last", term3165);
        setField(term3154, term3154.getClass(), "propListHead", null);
        setIntField(term3154, term3154.getClass(), "sourcePosition", 0);
        setField(term3154, term3154.getClass(), "jsType", null);
        setField(term3154, term3154.getClass(), "parent", null);
        setField(term3152, term3152.getClass(), "next", term3154);
        setIntField(term3172, term3172.getClass(), "type", 96566506);
        setField(term3172, term3172.getClass(), "next", term3165);
        setField(term3172, term3172.getClass(), "first", term3167);
        setField(term3172, term3172.getClass(), "last", term3150);
        setField(term3172, term3172.getClass(), "propListHead", null);
        setIntField(term3172, term3172.getClass(), "sourcePosition", 0);
        setField(term3172, term3172.getClass(), "jsType", null);
        setField(term3172, term3172.getClass(), "parent", null);
        setField(term3152, term3152.getClass(), "first", term3172);
        setField(term3152, term3152.getClass(), "last", term3172);
        setField(term3152, term3152.getClass(), "propListHead", null);
        setIntField(term3152, term3152.getClass(), "sourcePosition", 0);
        setField(term3152, term3152.getClass(), "jsType", null);
        setField(term3152, term3152.getClass(), "parent", null);
        setField(term3150, term3150.getClass(), "next", term3152);
        setField(term3150, term3150.getClass(), "first", term3156);
        setField(term3150, term3150.getClass(), "last", term3158);
        setField(term3150, term3150.getClass(), "propListHead", null);
        setIntField(term3150, term3150.getClass(), "sourcePosition", 0);
        setField(term3150, term3150.getClass(), "jsType", null);
        setField(term3150, term3150.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NameAnalyzer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term3123;
        args[1] = term3150;
        try {
            callMethod(klass, "replaceTopLevelExpressionWithRhs", argTypes, term3060, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


