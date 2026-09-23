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
import java.lang.Object;
import java.util.HashMap;

public class RemoveUnusedVars_process_26289943116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65;
     Object term69;
     Object term96;
     Object term123;

    public RemoveUnusedVars_process_26289943116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65 = newInstance(Class.forName("com.google.javascript.jscomp.RemoveUnusedVars"));
        setField(term65, term65.getClass(), "compiler", null);
        setField(term65, term65.getClass(), "codingConvention", null);
        setBooleanField(term65, term65.getClass(), "removeGlobals", true);
        setBooleanField(term65, term65.getClass(), "preserveFunctionExpressionNames", true);
        setField(term65, term65.getClass(), "referenced", null);
        setField(term65, term65.getClass(), "maybeUnreferenced", null);
        setField(term65, term65.getClass(), "allFunctionScopes", null);
        setField(term65, term65.getClass(), "assignsByVar", null);
        setField(term65, term65.getClass(), "assignsByNode", null);
        setField(term65, term65.getClass(), "inheritsCalls", null);
        setField(term65, term65.getClass(), "continuations", null);
        setBooleanField(term65, term65.getClass(), "modifyCallSites", false);
        setField(term65, term65.getClass(), "callSiteOptimizer", null);
        term69 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term71 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term73 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term75 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term77 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term80 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term84 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term86 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term91 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term69, term69.getClass(), "type", -73683645);
        setIntField(term71, term71.getClass(), "type", -226514366);
        setIntField(term73, term73.getClass(), "type", 1193880199);
        setIntField(term75, term75.getClass(), "type", -1087774327);
        setIntField(term77, term77.getClass(), "type", -1530420153);
        setField(term77, term77.getClass(), "next", null);
        setField(term77, term77.getClass(), "first", null);
        setField(term77, term77.getClass(), "last", null);
        setField(term77, term77.getClass(), "propListHead", null);
        setIntField(term77, term77.getClass(), "sourcePosition", 0);
        setField(term77, term77.getClass(), "jsType", null);
        setField(term77, term77.getClass(), "parent", null);
        setField(term75, term75.getClass(), "next", term77);
        setIntField(term80, term80.getClass(), "type", -469968304);
        setField(term80, term80.getClass(), "next", null);
        setField(term80, term80.getClass(), "first", null);
        setField(term80, term80.getClass(), "last", term77);
        setField(term80, term80.getClass(), "propListHead", null);
        setIntField(term80, term80.getClass(), "sourcePosition", 0);
        setField(term80, term80.getClass(), "jsType", null);
        setField(term80, term80.getClass(), "parent", null);
        setField(term75, term75.getClass(), "first", term80);
        setField(term75, term75.getClass(), "last", term73);
        setField(term75, term75.getClass(), "propListHead", null);
        setIntField(term75, term75.getClass(), "sourcePosition", 0);
        setField(term75, term75.getClass(), "jsType", null);
        setField(term75, term75.getClass(), "parent", null);
        setField(term73, term73.getClass(), "next", term75);
        setField(term73, term73.getClass(), "first", term77);
        setIntField(term84, term84.getClass(), "type", 679763016);
        setIntField(term86, term86.getClass(), "type", 1962444399);
        setField(term86, term86.getClass(), "next", null);
        setField(term86, term86.getClass(), "first", term80);
        setField(term86, term86.getClass(), "last", term75);
        setField(term86, term86.getClass(), "propListHead", null);
        setIntField(term86, term86.getClass(), "sourcePosition", 0);
        setField(term86, term86.getClass(), "jsType", null);
        setField(term86, term86.getClass(), "parent", null);
        setField(term84, term84.getClass(), "next", term86);
        setField(term84, term84.getClass(), "first", term71);
        setField(term84, term84.getClass(), "last", term71);
        setField(term84, term84.getClass(), "propListHead", null);
        setIntField(term84, term84.getClass(), "sourcePosition", 0);
        setField(term84, term84.getClass(), "jsType", null);
        setField(term84, term84.getClass(), "parent", null);
        setField(term73, term73.getClass(), "last", term84);
        setField(term73, term73.getClass(), "propListHead", null);
        setIntField(term73, term73.getClass(), "sourcePosition", 0);
        setField(term73, term73.getClass(), "jsType", null);
        setField(term73, term73.getClass(), "parent", null);
        setField(term71, term71.getClass(), "next", term73);
        setIntField(term91, term91.getClass(), "type", 767834723);
        setField(term91, term91.getClass(), "next", term84);
        setField(term91, term91.getClass(), "first", term86);
        setField(term91, term91.getClass(), "last", term69);
        setField(term91, term91.getClass(), "propListHead", null);
        setIntField(term91, term91.getClass(), "sourcePosition", 0);
        setField(term91, term91.getClass(), "jsType", null);
        setField(term91, term91.getClass(), "parent", null);
        setField(term71, term71.getClass(), "first", term91);
        setField(term71, term71.getClass(), "last", term91);
        setField(term71, term71.getClass(), "propListHead", null);
        setIntField(term71, term71.getClass(), "sourcePosition", 0);
        setField(term71, term71.getClass(), "jsType", null);
        setField(term71, term71.getClass(), "parent", null);
        setField(term69, term69.getClass(), "next", term71);
        setField(term69, term69.getClass(), "first", term75);
        setField(term69, term69.getClass(), "last", term77);
        setField(term69, term69.getClass(), "propListHead", null);
        setIntField(term69, term69.getClass(), "sourcePosition", 0);
        setField(term69, term69.getClass(), "jsType", null);
        setField(term69, term69.getClass(), "parent", null);
        term96 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term98 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term100 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term102 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term104 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term107 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term111 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term113 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term118 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term96, term96.getClass(), "type", -602026508);
        setIntField(term98, term98.getClass(), "type", -157887805);
        setIntField(term100, term100.getClass(), "type", 1876565163);
        setIntField(term102, term102.getClass(), "type", -817164822);
        setIntField(term104, term104.getClass(), "type", -1016503459);
        setField(term104, term104.getClass(), "next", null);
        setField(term104, term104.getClass(), "first", null);
        setField(term104, term104.getClass(), "last", null);
        setField(term104, term104.getClass(), "propListHead", null);
        setIntField(term104, term104.getClass(), "sourcePosition", 0);
        setField(term104, term104.getClass(), "jsType", null);
        setField(term104, term104.getClass(), "parent", null);
        setField(term102, term102.getClass(), "next", term104);
        setIntField(term107, term107.getClass(), "type", -1968847291);
        setField(term107, term107.getClass(), "next", null);
        setField(term107, term107.getClass(), "first", null);
        setField(term107, term107.getClass(), "last", term104);
        setField(term107, term107.getClass(), "propListHead", null);
        setIntField(term107, term107.getClass(), "sourcePosition", 0);
        setField(term107, term107.getClass(), "jsType", null);
        setField(term107, term107.getClass(), "parent", null);
        setField(term102, term102.getClass(), "first", term107);
        setField(term102, term102.getClass(), "last", term100);
        setField(term102, term102.getClass(), "propListHead", null);
        setIntField(term102, term102.getClass(), "sourcePosition", 0);
        setField(term102, term102.getClass(), "jsType", null);
        setField(term102, term102.getClass(), "parent", null);
        setField(term100, term100.getClass(), "next", term102);
        setField(term100, term100.getClass(), "first", term104);
        setIntField(term111, term111.getClass(), "type", -14890619);
        setIntField(term113, term113.getClass(), "type", 1632125673);
        setField(term113, term113.getClass(), "next", null);
        setField(term113, term113.getClass(), "first", term107);
        setField(term113, term113.getClass(), "last", term102);
        setField(term113, term113.getClass(), "propListHead", null);
        setIntField(term113, term113.getClass(), "sourcePosition", 0);
        setField(term113, term113.getClass(), "jsType", null);
        setField(term113, term113.getClass(), "parent", null);
        setField(term111, term111.getClass(), "next", term113);
        setField(term111, term111.getClass(), "first", term98);
        setField(term111, term111.getClass(), "last", term98);
        setField(term111, term111.getClass(), "propListHead", null);
        setIntField(term111, term111.getClass(), "sourcePosition", 0);
        setField(term111, term111.getClass(), "jsType", null);
        setField(term111, term111.getClass(), "parent", null);
        setField(term100, term100.getClass(), "last", term111);
        setField(term100, term100.getClass(), "propListHead", null);
        setIntField(term100, term100.getClass(), "sourcePosition", 0);
        setField(term100, term100.getClass(), "jsType", null);
        setField(term100, term100.getClass(), "parent", null);
        setField(term98, term98.getClass(), "next", term100);
        setIntField(term118, term118.getClass(), "type", 454281060);
        setField(term118, term118.getClass(), "next", term111);
        setField(term118, term118.getClass(), "first", term113);
        setField(term118, term118.getClass(), "last", term96);
        setField(term118, term118.getClass(), "propListHead", null);
        setIntField(term118, term118.getClass(), "sourcePosition", 0);
        setField(term118, term118.getClass(), "jsType", null);
        setField(term118, term118.getClass(), "parent", null);
        setField(term98, term98.getClass(), "first", term118);
        setField(term98, term98.getClass(), "last", term118);
        setField(term98, term98.getClass(), "propListHead", null);
        setIntField(term98, term98.getClass(), "sourcePosition", 0);
        setField(term98, term98.getClass(), "jsType", null);
        setField(term98, term98.getClass(), "parent", null);
        setField(term96, term96.getClass(), "next", term98);
        setField(term96, term96.getClass(), "first", term102);
        setField(term96, term96.getClass(), "last", term104);
        setField(term96, term96.getClass(), "propListHead", null);
        setIntField(term96, term96.getClass(), "sourcePosition", 0);
        setField(term96, term96.getClass(), "jsType", null);
        setField(term96, term96.getClass(), "parent", null);
        HashMap term124 = new HashMap();
        term123 = newInstance(Class.forName("com.google.javascript.jscomp.SimpleDefinitionFinder"));
        setField(term123, term123.getClass(), "compiler", null);
        setField(term123, term123.getClass(), "definitionSiteMap", term124);
        setField(term123, term123.getClass(), "nameDefinitionMultimap", null);
        setField(term123, term123.getClass(), "nameUseSiteMultimap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.SimpleDefinitionFinder");
        Object[] args = new Object[3];
        args[0] = term69;
        args[1] = term96;
        args[2] = term123;
        try {
            callMethod(klass, "process", argTypes, term65, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


