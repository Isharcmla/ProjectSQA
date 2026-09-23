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
     Object term83;
     Object term110;

    public NameAnalyzer_process_25921399629() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4 = new HashMap();
        HashMap term18 = new HashMap();
        HashMap term35 = new HashMap();
        Set<Object> term7899 =  ((Map) term35).keySet();
        HashSet term34 = new HashSet((Collection<? extends Object>) term7899);
        ArrayList term52 = new ArrayList();
        HashMap term57 = new HashMap();
        Set<Object> term7900 =  ((Map) term57).keySet();
        HashSet term56 = new HashSet((Collection<? extends Object>) term7900);
        ArrayList term69 = new ArrayList();
        ((ArrayList) term69).add((Object)null);
        ((ArrayList) term69).add((Object)null);
        ((ArrayList) term69).add((Object)null);
        HashMap term73 = new HashMap();
        term3 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        Object term51 = newInstance(Class.forName("com.google.javascript.jscomp.AstChangeProxy"));
        setField(term3, term3.getClass(), "compiler", null);
        setField(term3, term3.getClass(), "allNames", term4);
        setField(term3, term3.getClass(), "referenceGraph", null);
        setField(term3, term3.getClass(), "scopes", term18);
        setBooleanField(term3, term3.getClass(), "removeUnreferenced", true);
        setField(term3, term3.getClass(), "globalNames", term34);
        setField(term51, term51.getClass(), "listeners", term52);
        setField(term3, term3.getClass(), "changeProxy", term51);
        setField(term3, term3.getClass(), "externalNames", term56);
        setField(term3, term3.getClass(), "refNodes", term69);
        setField(term3, term3.getClass(), "aliases", term73);
        term83 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term85 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term87 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term89 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term91 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term94 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term98 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term100 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term105 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term83, term83.getClass(), "type", -2038273078);
        setIntField(term85, term85.getClass(), "type", 1227103734);
        setIntField(term87, term87.getClass(), "type", -1339778481);
        setIntField(term89, term89.getClass(), "type", 1725571209);
        setIntField(term91, term91.getClass(), "type", -522618178);
        setField(term91, term91.getClass(), "next", null);
        setField(term91, term91.getClass(), "first", null);
        setField(term91, term91.getClass(), "last", null);
        setField(term91, term91.getClass(), "propListHead", null);
        setIntField(term91, term91.getClass(), "sourcePosition", 0);
        setField(term91, term91.getClass(), "jsType", null);
        setField(term91, term91.getClass(), "parent", null);
        setField(term89, term89.getClass(), "next", term91);
        setIntField(term94, term94.getClass(), "type", 1134449235);
        setField(term94, term94.getClass(), "next", null);
        setField(term94, term94.getClass(), "first", null);
        setField(term94, term94.getClass(), "last", term91);
        setField(term94, term94.getClass(), "propListHead", null);
        setIntField(term94, term94.getClass(), "sourcePosition", 0);
        setField(term94, term94.getClass(), "jsType", null);
        setField(term94, term94.getClass(), "parent", null);
        setField(term89, term89.getClass(), "first", term94);
        setField(term89, term89.getClass(), "last", term87);
        setField(term89, term89.getClass(), "propListHead", null);
        setIntField(term89, term89.getClass(), "sourcePosition", 0);
        setField(term89, term89.getClass(), "jsType", null);
        setField(term89, term89.getClass(), "parent", null);
        setField(term87, term87.getClass(), "next", term89);
        setField(term87, term87.getClass(), "first", term91);
        setIntField(term98, term98.getClass(), "type", 1585847225);
        setIntField(term100, term100.getClass(), "type", 597278769);
        setField(term100, term100.getClass(), "next", null);
        setField(term100, term100.getClass(), "first", term94);
        setField(term100, term100.getClass(), "last", term89);
        setField(term100, term100.getClass(), "propListHead", null);
        setIntField(term100, term100.getClass(), "sourcePosition", 0);
        setField(term100, term100.getClass(), "jsType", null);
        setField(term100, term100.getClass(), "parent", null);
        setField(term98, term98.getClass(), "next", term100);
        setField(term98, term98.getClass(), "first", term85);
        setField(term98, term98.getClass(), "last", term85);
        setField(term98, term98.getClass(), "propListHead", null);
        setIntField(term98, term98.getClass(), "sourcePosition", 0);
        setField(term98, term98.getClass(), "jsType", null);
        setField(term98, term98.getClass(), "parent", null);
        setField(term87, term87.getClass(), "last", term98);
        setField(term87, term87.getClass(), "propListHead", null);
        setIntField(term87, term87.getClass(), "sourcePosition", 0);
        setField(term87, term87.getClass(), "jsType", null);
        setField(term87, term87.getClass(), "parent", null);
        setField(term85, term85.getClass(), "next", term87);
        setIntField(term105, term105.getClass(), "type", -1685132342);
        setField(term105, term105.getClass(), "next", term98);
        setField(term105, term105.getClass(), "first", term100);
        setField(term105, term105.getClass(), "last", term83);
        setField(term105, term105.getClass(), "propListHead", null);
        setIntField(term105, term105.getClass(), "sourcePosition", 0);
        setField(term105, term105.getClass(), "jsType", null);
        setField(term105, term105.getClass(), "parent", null);
        setField(term85, term85.getClass(), "first", term105);
        setField(term85, term85.getClass(), "last", term105);
        setField(term85, term85.getClass(), "propListHead", null);
        setIntField(term85, term85.getClass(), "sourcePosition", 0);
        setField(term85, term85.getClass(), "jsType", null);
        setField(term85, term85.getClass(), "parent", null);
        setField(term83, term83.getClass(), "next", term85);
        setField(term83, term83.getClass(), "first", term89);
        setField(term83, term83.getClass(), "last", term91);
        setField(term83, term83.getClass(), "propListHead", null);
        setIntField(term83, term83.getClass(), "sourcePosition", 0);
        setField(term83, term83.getClass(), "jsType", null);
        setField(term83, term83.getClass(), "parent", null);
        term110 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term112 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term114 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term116 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term118 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term121 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term125 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term127 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term132 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term110, term110.getClass(), "type", -1456670397);
        setIntField(term112, term112.getClass(), "type", 1622346318);
        setIntField(term114, term114.getClass(), "type", 1048535127);
        setIntField(term116, term116.getClass(), "type", -655067527);
        setIntField(term118, term118.getClass(), "type", -6029667);
        setField(term118, term118.getClass(), "next", null);
        setField(term118, term118.getClass(), "first", null);
        setField(term118, term118.getClass(), "last", null);
        setField(term118, term118.getClass(), "propListHead", null);
        setIntField(term118, term118.getClass(), "sourcePosition", 0);
        setField(term118, term118.getClass(), "jsType", null);
        setField(term118, term118.getClass(), "parent", null);
        setField(term116, term116.getClass(), "next", term118);
        setIntField(term121, term121.getClass(), "type", -2068769794);
        setField(term121, term121.getClass(), "next", null);
        setField(term121, term121.getClass(), "first", null);
        setField(term121, term121.getClass(), "last", term118);
        setField(term121, term121.getClass(), "propListHead", null);
        setIntField(term121, term121.getClass(), "sourcePosition", 0);
        setField(term121, term121.getClass(), "jsType", null);
        setField(term121, term121.getClass(), "parent", null);
        setField(term116, term116.getClass(), "first", term121);
        setField(term116, term116.getClass(), "last", term114);
        setField(term116, term116.getClass(), "propListHead", null);
        setIntField(term116, term116.getClass(), "sourcePosition", 0);
        setField(term116, term116.getClass(), "jsType", null);
        setField(term116, term116.getClass(), "parent", null);
        setField(term114, term114.getClass(), "next", term116);
        setField(term114, term114.getClass(), "first", term118);
        setIntField(term125, term125.getClass(), "type", -1007160944);
        setIntField(term127, term127.getClass(), "type", 1135664017);
        setField(term127, term127.getClass(), "next", null);
        setField(term127, term127.getClass(), "first", term121);
        setField(term127, term127.getClass(), "last", term116);
        setField(term127, term127.getClass(), "propListHead", null);
        setIntField(term127, term127.getClass(), "sourcePosition", 0);
        setField(term127, term127.getClass(), "jsType", null);
        setField(term127, term127.getClass(), "parent", null);
        setField(term125, term125.getClass(), "next", term127);
        setField(term125, term125.getClass(), "first", term112);
        setField(term125, term125.getClass(), "last", term112);
        setField(term125, term125.getClass(), "propListHead", null);
        setIntField(term125, term125.getClass(), "sourcePosition", 0);
        setField(term125, term125.getClass(), "jsType", null);
        setField(term125, term125.getClass(), "parent", null);
        setField(term114, term114.getClass(), "last", term125);
        setField(term114, term114.getClass(), "propListHead", null);
        setIntField(term114, term114.getClass(), "sourcePosition", 0);
        setField(term114, term114.getClass(), "jsType", null);
        setField(term114, term114.getClass(), "parent", null);
        setField(term112, term112.getClass(), "next", term114);
        setIntField(term132, term132.getClass(), "type", 590364439);
        setField(term132, term132.getClass(), "next", term125);
        setField(term132, term132.getClass(), "first", term127);
        setField(term132, term132.getClass(), "last", term110);
        setField(term132, term132.getClass(), "propListHead", null);
        setIntField(term132, term132.getClass(), "sourcePosition", 0);
        setField(term132, term132.getClass(), "jsType", null);
        setField(term132, term132.getClass(), "parent", null);
        setField(term112, term112.getClass(), "first", term132);
        setField(term112, term112.getClass(), "last", term132);
        setField(term112, term112.getClass(), "propListHead", null);
        setIntField(term112, term112.getClass(), "sourcePosition", 0);
        setField(term112, term112.getClass(), "jsType", null);
        setField(term112, term112.getClass(), "parent", null);
        setField(term110, term110.getClass(), "next", term112);
        setField(term110, term110.getClass(), "first", term116);
        setField(term110, term110.getClass(), "last", term118);
        setField(term110, term110.getClass(), "propListHead", null);
        setIntField(term110, term110.getClass(), "sourcePosition", 0);
        setField(term110, term110.getClass(), "jsType", null);
        setField(term110, term110.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NameAnalyzer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term83;
        args[1] = term110;
        try {
            callMethod(klass, "process", argTypes, term3, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


