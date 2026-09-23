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

public class NameAnalyzer_process_25921399629 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3;
     Object term68;
     Object term95;

    public NameAnalyzer_process_25921399629() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4 = new HashMap();
        HashMap term20 = new HashMap();
        Set<Object> term4256 =  ((Map) term20).keySet();
        HashSet term19 = new HashSet((Collection<? extends Object>) term4256);
        ArrayList term37 = new ArrayList();
        HashMap term42 = new HashMap();
        Set<Object> term4257 =  ((Map) term42).keySet();
        HashSet term41 = new HashSet((Collection<? extends Object>) term4257);
        ArrayList term54 = new ArrayList();
        ((ArrayList) term54).add((Object)null);
        ((ArrayList) term54).add((Object)null);
        ((ArrayList) term54).add((Object)null);
        HashMap term58 = new HashMap();
        term3 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        Object term36 = newInstance(Class.forName("com.google.javascript.jscomp.AstChangeProxy"));
        setField(term3, term3.getClass(), "compiler", null);
        setField(term3, term3.getClass(), "allNames", term4);
        setField(term3, term3.getClass(), "referenceGraph", null);
        setField(term3, term3.getClass(), "scopes", null);
        setBooleanField(term3, term3.getClass(), "removeUnreferenced", true);
        setField(term3, term3.getClass(), "globalNames", term19);
        setField(term36, term36.getClass(), "listeners", term37);
        setField(term3, term3.getClass(), "changeProxy", term36);
        setField(term3, term3.getClass(), "externalNames", term41);
        setField(term3, term3.getClass(), "refNodes", term54);
        setField(term3, term3.getClass(), "aliases", term58);
        term68 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term70 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term72 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term74 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term76 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term79 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term83 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term85 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term90 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term68, term68.getClass(), "type", 568599855);
        setIntField(term70, term70.getClass(), "type", 1162663216);
        setIntField(term72, term72.getClass(), "type", 1484323161);
        setIntField(term74, term74.getClass(), "type", 391863371);
        setIntField(term76, term76.getClass(), "type", -1922583790);
        setField(term76, term76.getClass(), "next", null);
        setField(term76, term76.getClass(), "first", null);
        setField(term76, term76.getClass(), "last", null);
        setField(term76, term76.getClass(), "propListHead", null);
        setIntField(term76, term76.getClass(), "sourcePosition", 0);
        setField(term76, term76.getClass(), "jsType", null);
        setField(term76, term76.getClass(), "parent", null);
        setField(term74, term74.getClass(), "next", term76);
        setIntField(term79, term79.getClass(), "type", -616727354);
        setField(term79, term79.getClass(), "next", null);
        setField(term79, term79.getClass(), "first", null);
        setField(term79, term79.getClass(), "last", term76);
        setField(term79, term79.getClass(), "propListHead", null);
        setIntField(term79, term79.getClass(), "sourcePosition", 0);
        setField(term79, term79.getClass(), "jsType", null);
        setField(term79, term79.getClass(), "parent", null);
        setField(term74, term74.getClass(), "first", term79);
        setField(term74, term74.getClass(), "last", term72);
        setField(term74, term74.getClass(), "propListHead", null);
        setIntField(term74, term74.getClass(), "sourcePosition", 0);
        setField(term74, term74.getClass(), "jsType", null);
        setField(term74, term74.getClass(), "parent", null);
        setField(term72, term72.getClass(), "next", term74);
        setField(term72, term72.getClass(), "first", term76);
        setIntField(term83, term83.getClass(), "type", -2038273078);
        setIntField(term85, term85.getClass(), "type", 1227103734);
        setField(term85, term85.getClass(), "next", null);
        setField(term85, term85.getClass(), "first", term79);
        setField(term85, term85.getClass(), "last", term74);
        setField(term85, term85.getClass(), "propListHead", null);
        setIntField(term85, term85.getClass(), "sourcePosition", 0);
        setField(term85, term85.getClass(), "jsType", null);
        setField(term85, term85.getClass(), "parent", null);
        setField(term83, term83.getClass(), "next", term85);
        setField(term83, term83.getClass(), "first", term70);
        setField(term83, term83.getClass(), "last", term70);
        setField(term83, term83.getClass(), "propListHead", null);
        setIntField(term83, term83.getClass(), "sourcePosition", 0);
        setField(term83, term83.getClass(), "jsType", null);
        setField(term83, term83.getClass(), "parent", null);
        setField(term72, term72.getClass(), "last", term83);
        setField(term72, term72.getClass(), "propListHead", null);
        setIntField(term72, term72.getClass(), "sourcePosition", 0);
        setField(term72, term72.getClass(), "jsType", null);
        setField(term72, term72.getClass(), "parent", null);
        setField(term70, term70.getClass(), "next", term72);
        setIntField(term90, term90.getClass(), "type", -1339778481);
        setField(term90, term90.getClass(), "next", term83);
        setField(term90, term90.getClass(), "first", term85);
        setField(term90, term90.getClass(), "last", term68);
        setField(term90, term90.getClass(), "propListHead", null);
        setIntField(term90, term90.getClass(), "sourcePosition", 0);
        setField(term90, term90.getClass(), "jsType", null);
        setField(term90, term90.getClass(), "parent", null);
        setField(term70, term70.getClass(), "first", term90);
        setField(term70, term70.getClass(), "last", term90);
        setField(term70, term70.getClass(), "propListHead", null);
        setIntField(term70, term70.getClass(), "sourcePosition", 0);
        setField(term70, term70.getClass(), "jsType", null);
        setField(term70, term70.getClass(), "parent", null);
        setField(term68, term68.getClass(), "next", term70);
        setField(term68, term68.getClass(), "first", term74);
        setField(term68, term68.getClass(), "last", term76);
        setField(term68, term68.getClass(), "propListHead", null);
        setIntField(term68, term68.getClass(), "sourcePosition", 0);
        setField(term68, term68.getClass(), "jsType", null);
        setField(term68, term68.getClass(), "parent", null);
        term95 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term97 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term99 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term101 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term103 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term106 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term110 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term112 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term117 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term95, term95.getClass(), "type", 1725571209);
        setIntField(term97, term97.getClass(), "type", -522618178);
        setIntField(term99, term99.getClass(), "type", 1134449235);
        setIntField(term101, term101.getClass(), "type", -883034806);
        setIntField(term103, term103.getClass(), "type", 1585847225);
        setField(term103, term103.getClass(), "next", null);
        setField(term103, term103.getClass(), "first", null);
        setField(term103, term103.getClass(), "last", null);
        setField(term103, term103.getClass(), "propListHead", null);
        setIntField(term103, term103.getClass(), "sourcePosition", 0);
        setField(term103, term103.getClass(), "jsType", null);
        setField(term103, term103.getClass(), "parent", null);
        setField(term101, term101.getClass(), "next", term103);
        setIntField(term106, term106.getClass(), "type", 597278769);
        setField(term106, term106.getClass(), "next", null);
        setField(term106, term106.getClass(), "first", null);
        setField(term106, term106.getClass(), "last", term103);
        setField(term106, term106.getClass(), "propListHead", null);
        setIntField(term106, term106.getClass(), "sourcePosition", 0);
        setField(term106, term106.getClass(), "jsType", null);
        setField(term106, term106.getClass(), "parent", null);
        setField(term101, term101.getClass(), "first", term106);
        setField(term101, term101.getClass(), "last", term99);
        setField(term101, term101.getClass(), "propListHead", null);
        setIntField(term101, term101.getClass(), "sourcePosition", 0);
        setField(term101, term101.getClass(), "jsType", null);
        setField(term101, term101.getClass(), "parent", null);
        setField(term99, term99.getClass(), "next", term101);
        setField(term99, term99.getClass(), "first", term103);
        setIntField(term110, term110.getClass(), "type", -1456670397);
        setIntField(term112, term112.getClass(), "type", 1622346318);
        setField(term112, term112.getClass(), "next", null);
        setField(term112, term112.getClass(), "first", term106);
        setField(term112, term112.getClass(), "last", term101);
        setField(term112, term112.getClass(), "propListHead", null);
        setIntField(term112, term112.getClass(), "sourcePosition", 0);
        setField(term112, term112.getClass(), "jsType", null);
        setField(term112, term112.getClass(), "parent", null);
        setField(term110, term110.getClass(), "next", term112);
        setField(term110, term110.getClass(), "first", term97);
        setField(term110, term110.getClass(), "last", term97);
        setField(term110, term110.getClass(), "propListHead", null);
        setIntField(term110, term110.getClass(), "sourcePosition", 0);
        setField(term110, term110.getClass(), "jsType", null);
        setField(term110, term110.getClass(), "parent", null);
        setField(term99, term99.getClass(), "last", term110);
        setField(term99, term99.getClass(), "propListHead", null);
        setIntField(term99, term99.getClass(), "sourcePosition", 0);
        setField(term99, term99.getClass(), "jsType", null);
        setField(term99, term99.getClass(), "parent", null);
        setField(term97, term97.getClass(), "next", term99);
        setIntField(term117, term117.getClass(), "type", 1048535127);
        setField(term117, term117.getClass(), "next", term110);
        setField(term117, term117.getClass(), "first", term112);
        setField(term117, term117.getClass(), "last", term95);
        setField(term117, term117.getClass(), "propListHead", null);
        setIntField(term117, term117.getClass(), "sourcePosition", 0);
        setField(term117, term117.getClass(), "jsType", null);
        setField(term117, term117.getClass(), "parent", null);
        setField(term97, term97.getClass(), "first", term117);
        setField(term97, term97.getClass(), "last", term117);
        setField(term97, term97.getClass(), "propListHead", null);
        setIntField(term97, term97.getClass(), "sourcePosition", 0);
        setField(term97, term97.getClass(), "jsType", null);
        setField(term97, term97.getClass(), "parent", null);
        setField(term95, term95.getClass(), "next", term97);
        setField(term95, term95.getClass(), "first", term101);
        setField(term95, term95.getClass(), "last", term103);
        setField(term95, term95.getClass(), "propListHead", null);
        setIntField(term95, term95.getClass(), "sourcePosition", 0);
        setField(term95, term95.getClass(), "jsType", null);
        setField(term95, term95.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NameAnalyzer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term68;
        args[1] = term95;
        try {
            callMethod(klass, "process", argTypes, term3, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


