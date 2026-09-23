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
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class GlobalNamespace_scanNewNodes_28791347714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277;
     Object term361;
     Object term382;

    public GlobalNamespace_scanNewNodes_28791347714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term314 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term314, term314.getClass(), "name", null);
        setField(term314, term314.getClass(), "parent", null);
        setField(term314, term314.getClass(), "props", null);
        setField(term314, term314.getClass(), "declaration", null);
        setField(term314, term314.getClass(), "refs", null);
        setField(term314, term314.getClass(), "type", null);
        setBooleanField(term314, term314.getClass(), "isClassOrEnum", false);
        setBooleanField(term314, term314.getClass(), "hasClassOrEnumDescendant", false);
        setIntField(term314, term314.getClass(), "globalSets", 0);
        setIntField(term314, term314.getClass(), "localSets", 0);
        setIntField(term314, term314.getClass(), "aliasingGets", 0);
        setIntField(term314, term314.getClass(), "totalGets", 0);
        setIntField(term314, term314.getClass(), "callGets", 0);
        setBooleanField(term314, term314.getClass(), "inExterns", false);
        setField(term314, term314.getClass(), "docInfo", null);
        Object term323 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term323, term323.getClass(), "name", null);
        setField(term323, term323.getClass(), "parent", null);
        setField(term323, term323.getClass(), "props", null);
        setField(term323, term323.getClass(), "declaration", null);
        setField(term323, term323.getClass(), "refs", null);
        setField(term323, term323.getClass(), "type", null);
        setBooleanField(term323, term323.getClass(), "isClassOrEnum", false);
        setBooleanField(term323, term323.getClass(), "hasClassOrEnumDescendant", false);
        setIntField(term323, term323.getClass(), "globalSets", 0);
        setIntField(term323, term323.getClass(), "localSets", 0);
        setIntField(term323, term323.getClass(), "aliasingGets", 0);
        setIntField(term323, term323.getClass(), "totalGets", 0);
        setIntField(term323, term323.getClass(), "callGets", 0);
        setBooleanField(term323, term323.getClass(), "inExterns", false);
        setField(term323, term323.getClass(), "docInfo", null);
        Object term332 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term332, term332.getClass(), "name", null);
        setField(term332, term332.getClass(), "parent", null);
        setField(term332, term332.getClass(), "props", null);
        setField(term332, term332.getClass(), "declaration", null);
        setField(term332, term332.getClass(), "refs", null);
        setField(term332, term332.getClass(), "type", null);
        setBooleanField(term332, term332.getClass(), "isClassOrEnum", false);
        setBooleanField(term332, term332.getClass(), "hasClassOrEnumDescendant", false);
        setIntField(term332, term332.getClass(), "globalSets", 0);
        setIntField(term332, term332.getClass(), "localSets", 0);
        setIntField(term332, term332.getClass(), "aliasingGets", 0);
        setIntField(term332, term332.getClass(), "totalGets", 0);
        setIntField(term332, term332.getClass(), "callGets", 0);
        setBooleanField(term332, term332.getClass(), "inExterns", false);
        setField(term332, term332.getClass(), "docInfo", null);
        ArrayList term312 = new ArrayList();
        ((ArrayList) term312).add(term314);
        ((ArrayList) term312).add(term323);
        ((ArrayList) term312).add(term332);
        HashMap term343 = new HashMap();
        term277 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace"));
        Object term278 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term280 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term282 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term285 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term288 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term291 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term295 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term298 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term301 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term305 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term309 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term277, term277.getClass(), "compiler", null);
        setIntField(term278, term278.getClass(), "type", 1328271830);
        setIntField(term280, term280.getClass(), "type", -2095575670);
        setIntField(term282, term282.getClass(), "type", 0);
        setField(term282, term282.getClass(), "next", null);
        setField(term282, term282.getClass(), "first", null);
        setField(term282, term282.getClass(), "last", null);
        setField(term282, term282.getClass(), "propListHead", null);
        setIntField(term282, term282.getClass(), "sourcePosition", 0);
        setField(term282, term282.getClass(), "jsType", null);
        setField(term282, term282.getClass(), "parent", null);
        setField(term280, term280.getClass(), "next", term282);
        setIntField(term285, term285.getClass(), "type", 0);
        setField(term285, term285.getClass(), "next", null);
        setField(term285, term285.getClass(), "first", null);
        setField(term285, term285.getClass(), "last", null);
        setField(term285, term285.getClass(), "propListHead", null);
        setIntField(term285, term285.getClass(), "sourcePosition", 0);
        setField(term285, term285.getClass(), "jsType", null);
        setField(term285, term285.getClass(), "parent", null);
        setField(term280, term280.getClass(), "first", term285);
        setIntField(term288, term288.getClass(), "type", 0);
        setField(term288, term288.getClass(), "next", null);
        setField(term288, term288.getClass(), "first", null);
        setField(term288, term288.getClass(), "last", null);
        setField(term288, term288.getClass(), "propListHead", null);
        setIntField(term288, term288.getClass(), "sourcePosition", 0);
        setField(term288, term288.getClass(), "jsType", null);
        setField(term288, term288.getClass(), "parent", null);
        setField(term280, term280.getClass(), "last", term288);
        setField(term291, term291.getClass(), "next", null);
        setIntField(term291, term291.getClass(), "type", 0);
        setIntField(term291, term291.getClass(), "intValue", 0);
        setField(term291, term291.getClass(), "objectValue", null);
        setField(term280, term280.getClass(), "propListHead", term291);
        setIntField(term280, term280.getClass(), "sourcePosition", 1225272962);
        setField(term280, term280.getClass(), "jsType", null);
        setField(term280, term280.getClass(), "parent", null);
        setField(term278, term278.getClass(), "next", term280);
        setIntField(term295, term295.getClass(), "type", 0);
        setField(term295, term295.getClass(), "next", null);
        setField(term295, term295.getClass(), "first", null);
        setField(term295, term295.getClass(), "last", null);
        setField(term295, term295.getClass(), "propListHead", null);
        setIntField(term295, term295.getClass(), "sourcePosition", 0);
        setField(term295, term295.getClass(), "jsType", null);
        setField(term295, term295.getClass(), "parent", null);
        setField(term278, term278.getClass(), "first", term295);
        setIntField(term298, term298.getClass(), "type", 0);
        setField(term298, term298.getClass(), "next", null);
        setField(term298, term298.getClass(), "first", null);
        setField(term298, term298.getClass(), "last", null);
        setField(term298, term298.getClass(), "propListHead", null);
        setIntField(term298, term298.getClass(), "sourcePosition", 0);
        setField(term298, term298.getClass(), "jsType", null);
        setField(term298, term298.getClass(), "parent", null);
        setField(term278, term278.getClass(), "last", term298);
        setField(term301, term301.getClass(), "next", null);
        setIntField(term301, term301.getClass(), "type", 0);
        setIntField(term301, term301.getClass(), "intValue", 0);
        setField(term301, term301.getClass(), "objectValue", null);
        setField(term278, term278.getClass(), "propListHead", term301);
        setIntField(term278, term278.getClass(), "sourcePosition", 1324040357);
        setField(term278, term278.getClass(), "jsType", null);
        setField(term278, term278.getClass(), "parent", null);
        setField(term277, term277.getClass(), "root", term278);
        setIntField(term305, term305.getClass(), "type", 0);
        setField(term305, term305.getClass(), "next", null);
        setField(term305, term305.getClass(), "first", null);
        setField(term305, term305.getClass(), "last", null);
        setField(term305, term305.getClass(), "propListHead", null);
        setIntField(term305, term305.getClass(), "sourcePosition", 0);
        setField(term305, term305.getClass(), "jsType", null);
        setField(term305, term305.getClass(), "parent", null);
        setField(term277, term277.getClass(), "externsRoot", term305);
        setBooleanField(term277, term277.getClass(), "inExterns", true);
        setField(term309, term309.getClass(), "vars", null);
        setField(term309, term309.getClass(), "parent", null);
        setField(term309, term309.getClass(), "rootNode", null);
        setField(term309, term309.getClass(), "thisType", null);
        setBooleanField(term309, term309.getClass(), "isBottom", false);
        setField(term277, term277.getClass(), "externsScope", term309);
        setBooleanField(term277, term277.getClass(), "generated", true);
        setField(term277, term277.getClass(), "globalNames", term312);
        setField(term277, term277.getClass(), "nameMap", term343);
        HashMap term362 = new HashMap();
        term361 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term376 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term378 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term361, term361.getClass(), "vars", term362);
        setField(term376, term376.getClass(), "vars", null);
        setField(term376, term376.getClass(), "parent", null);
        setField(term376, term376.getClass(), "rootNode", null);
        setField(term376, term376.getClass(), "thisType", null);
        setBooleanField(term376, term376.getClass(), "isBottom", false);
        setField(term361, term361.getClass(), "parent", term376);
        setIntField(term378, term378.getClass(), "type", 0);
        setField(term378, term378.getClass(), "next", null);
        setField(term378, term378.getClass(), "first", null);
        setField(term378, term378.getClass(), "last", null);
        setField(term378, term378.getClass(), "propListHead", null);
        setIntField(term378, term378.getClass(), "sourcePosition", 0);
        setField(term378, term378.getClass(), "jsType", null);
        setField(term378, term378.getClass(), "parent", null);
        setField(term361, term361.getClass(), "rootNode", term378);
        setField(term361, term361.getClass(), "thisType", null);
        setBooleanField(term361, term361.getClass(), "isBottom", false);
        HashMap term383 = new HashMap();
        Set<Object> term3598 =  ((Map) term383).keySet();
        term382 = new HashSet((Collection<? extends Object>) term3598);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.Scope");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = term361;
        args[1] = term382;
        try {
            callMethod(klass, "scanNewNodes", argTypes, term277, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


