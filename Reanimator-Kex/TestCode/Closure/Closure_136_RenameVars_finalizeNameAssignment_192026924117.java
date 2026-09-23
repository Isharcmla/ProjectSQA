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
import java.util.ArrayList;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class RenameVars_finalizeNameAssignment_192026924117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1893;
     Object term2070;

    public RenameVars_finalizeNameAssignment_192026924117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1896 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1898 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1901 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1904 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1907 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1896, term1896.getClass(), "type", 1861318859);
        setIntField(term1898, term1898.getClass(), "type", -375014958);
        setField(term1898, term1898.getClass(), "next", null);
        setField(term1898, term1898.getClass(), "first", null);
        setField(term1898, term1898.getClass(), "last", null);
        setField(term1898, term1898.getClass(), "propListHead", null);
        setIntField(term1898, term1898.getClass(), "sourcePosition", 1107176718);
        setField(term1898, term1898.getClass(), "jsType", null);
        setField(term1898, term1898.getClass(), "parent", null);
        setField(term1896, term1896.getClass(), "next", term1898);
        setIntField(term1901, term1901.getClass(), "type", 0);
        setField(term1901, term1901.getClass(), "next", null);
        setField(term1901, term1901.getClass(), "first", null);
        setField(term1901, term1901.getClass(), "last", null);
        setField(term1901, term1901.getClass(), "propListHead", null);
        setIntField(term1901, term1901.getClass(), "sourcePosition", 0);
        setField(term1901, term1901.getClass(), "jsType", null);
        setField(term1901, term1901.getClass(), "parent", null);
        setField(term1896, term1896.getClass(), "first", term1901);
        setIntField(term1904, term1904.getClass(), "type", 0);
        setField(term1904, term1904.getClass(), "next", null);
        setField(term1904, term1904.getClass(), "first", null);
        setField(term1904, term1904.getClass(), "last", null);
        setField(term1904, term1904.getClass(), "propListHead", null);
        setIntField(term1904, term1904.getClass(), "sourcePosition", 0);
        setField(term1904, term1904.getClass(), "jsType", null);
        setField(term1904, term1904.getClass(), "parent", null);
        setField(term1896, term1896.getClass(), "last", term1904);
        setField(term1907, term1907.getClass(), "next", null);
        setIntField(term1907, term1907.getClass(), "type", 0);
        setIntField(term1907, term1907.getClass(), "intValue", 0);
        setField(term1907, term1907.getClass(), "objectValue", null);
        setField(term1896, term1896.getClass(), "propListHead", term1907);
        setIntField(term1896, term1896.getClass(), "sourcePosition", 480137250);
        setField(term1896, term1896.getClass(), "jsType", null);
        setField(term1896, term1896.getClass(), "parent", null);
        Object term1911 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1911, term1911.getClass(), "type", 0);
        setField(term1911, term1911.getClass(), "next", null);
        setField(term1911, term1911.getClass(), "first", null);
        setField(term1911, term1911.getClass(), "last", null);
        setField(term1911, term1911.getClass(), "propListHead", null);
        setIntField(term1911, term1911.getClass(), "sourcePosition", 0);
        setField(term1911, term1911.getClass(), "jsType", null);
        setField(term1911, term1911.getClass(), "parent", null);
        Object term1914 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1914, term1914.getClass(), "type", 0);
        setField(term1914, term1914.getClass(), "next", null);
        setField(term1914, term1914.getClass(), "first", null);
        setField(term1914, term1914.getClass(), "last", null);
        setField(term1914, term1914.getClass(), "propListHead", null);
        setIntField(term1914, term1914.getClass(), "sourcePosition", 0);
        setField(term1914, term1914.getClass(), "jsType", null);
        setField(term1914, term1914.getClass(), "parent", null);
        Object term1917 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1917, term1917.getClass(), "type", 0);
        setField(term1917, term1917.getClass(), "next", null);
        setField(term1917, term1917.getClass(), "first", null);
        setField(term1917, term1917.getClass(), "last", null);
        setField(term1917, term1917.getClass(), "propListHead", null);
        setIntField(term1917, term1917.getClass(), "sourcePosition", 0);
        setField(term1917, term1917.getClass(), "jsType", null);
        setField(term1917, term1917.getClass(), "parent", null);
        ArrayList term1894 = new ArrayList();
        ((ArrayList) term1894).add(term1896);
        ((ArrayList) term1894).add(term1911);
        ((ArrayList) term1894).add(term1914);
        ((ArrayList) term1894).add(term1917);
        ((ArrayList) term1894).add(term1911);
        ArrayList term1922 = new ArrayList();
        ((ArrayList) term1922).add(term1914);
        ArrayList term1926 = new ArrayList();
        ((ArrayList) term1926).add("BjugTaMcxJ");
        ((ArrayList) term1926).add("vGiuZVPJNH");
        ((ArrayList) term1926).add("tlzpzIjMib");
        ((ArrayList) term1926).add("AZdLeSugwv");
        HashMap term1979 = new HashMap();
        Set<Object> term13911 =  ((Map) term1979).keySet();
        HashSet term1978 = new HashSet((Collection<? extends Object>) term13911);
        HashMap term1988 = new HashMap();
        Set<Object> term13912 =  ((Map) term1988).keySet();
        HashSet term1987 = new HashSet((Collection<? extends Object>) term13912);
        HashMap term1996 = new HashMap();
        term1893 = newInstance(Class.forName("com.google.javascript.jscomp.RenameVars"));
        Object term2006 = newInstance(Class.forName("com.google.javascript.jscomp.VariableMap"));
        Object term2020 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term2021 = (byte[]) newByteArray(16);
        Object term2040 = newInstance(Class.forName("java.util.TreeMap"));
        Object term2041 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term2054 = newInstance(Class.forName("com.google.javascript.jscomp.RenameVars$Assignment"));
        char[] term2063 = (char[]) newCharArray(6);
        setField(term1893, term1893.getClass(), "compiler", null);
        setField(term1893, term1893.getClass(), "globalNameNodes", term1894);
        setField(term1893, term1893.getClass(), "localNameNodes", term1922);
        setField(term1893, term1893.getClass(), "localTempNames", term1926);
        setField(term1893, term1893.getClass(), "externNames", term1978);
        setField(term1893, term1893.getClass(), "reservedNames", term1987);
        setField(term1893, term1893.getClass(), "renameMap", term1996);
        setField(term2006, term2006.getClass(), "map", null);
        setField(term2006, term2006.getClass(), "reverseMap", null);
        setField(term1893, term1893.getClass(), "prevUsedRenameMap", term2006);
        setField(term1893, term1893.getClass(), "prefix", "izPpKDErnQ");
        setIntField(term1893, term1893.getClass(), "assignmentCount", -341152642);
        setField(term2020, term2020.getClass(), "value", term2021);
        setByteField(term2020, term2020.getClass(), "coder", (byte) 0);
        setIntField(term2020, term2020.getClass(), "count", 0);
        setField(term1893, term1893.getClass(), "assignmentLog", term2020);
        setField(term2040, term2040.getClass(), "comparator", null);
        setField(term2041, term2041.getClass(), "key", "NnpwZBUTvx");
        setField(term2054, term2054.getClass(), "input", null);
        setField(term2054, term2054.getClass(), "oldName", null);
        setIntField(term2054, term2054.getClass(), "orderOfOccurrence", 0);
        setField(term2054, term2054.getClass(), "newName", null);
        setIntField(term2054, term2054.getClass(), "count", 0);
        setField(term2054, term2054.getClass(), "this$0", null);
        setField(term2041, term2041.getClass(), "value", term2054);
        setField(term2041, term2041.getClass(), "left", null);
        setField(term2041, term2041.getClass(), "right", null);
        setField(term2041, term2041.getClass(), "parent", null);
        setBooleanField(term2041, term2041.getClass(), "color", true);
        setField(term2040, term2040.getClass(), "root", term2041);
        setIntField(term2040, term2040.getClass(), "size", 1);
        setIntField(term2040, term2040.getClass(), "modCount", 1);
        setField(term2040, term2040.getClass(), "entrySet", null);
        setField(term2040, term2040.getClass(), "navigableKeySet", null);
        setField(term2040, term2040.getClass(), "descendingMap", null);
        setField(term2040, term2040.getClass(), "keySet", null);
        setField(term2040, term2040.getClass(), "values", null);
        setField(term1893, term1893.getClass(), "assignments", term2040);
        setBooleanField(term1893, term1893.getClass(), "localRenamingOnly", true);
        setBooleanField(term1893, term1893.getClass(), "preserveAnonymousFunctionNames", true);
        setBooleanField(term1893, term1893.getClass(), "generatePseudoNames", true);
        setCharElement(term2063, 0, 'M');
        setCharElement(term2063, 1, 'u');
        setCharElement(term2063, 2, 'L');
        setCharElement(term2063, 3, 'c');
        setCharElement(term2063, 4, 'g');
        setCharElement(term2063, 5, 'Q');
        setField(term1893, term1893.getClass(), "reservedCharacters", term2063);
        ArrayList term2085 = new ArrayList();
        ((ArrayList) term2085).add((Object)null);
        ((ArrayList) term2085).add((Object)null);
        ((ArrayList) term2085).add((Object)null);
        ((ArrayList) term2085).add((Object)null);
        ((ArrayList) term2085).add((Object)null);
        ((ArrayList) term2085).add((Object)null);
        ((ArrayList) term2085).add((Object)null);
        ArrayList term2089 = new ArrayList();
        ((ArrayList) term2089).add((Object)null);
        ((ArrayList) term2089).add((Object)null);
        ((ArrayList) term2089).add((Object)null);
        ((ArrayList) term2089).add((Object)null);
        ((ArrayList) term2089).add((Object)null);
        HashMap term2107 = new HashMap();
        Set<Object> term13975 =  ((Map) term2107).keySet();
        HashSet term2106 = new HashSet((Collection<? extends Object>) term13975);
        HashMap term2114 = new HashMap();
        Set<Object> term13976 =  ((Map) term2114).keySet();
        HashSet term2113 = new HashSet((Collection<? extends Object>) term13976);
        term2070 = newInstance(Class.forName("com.google.javascript.jscomp.RenameVars$Assignment"));
        Object term2071 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerInput"));
        Object term2072 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term2072, term2072.getClass(), "name", "tlQSNgTkQX");
        setField(term2072, term2072.getClass(), "inputs", term2085);
        setField(term2072, term2072.getClass(), "deps", term2089);
        setField(term2071, term2071.getClass(), "module", term2072);
        setBooleanField(term2071, term2071.getClass(), "isExtern", true);
        setField(term2071, term2071.getClass(), "ast", null);
        setField(term2071, term2071.getClass(), "name", "WVRMUmrljA");
        setField(term2071, term2071.getClass(), "provides", term2106);
        setField(term2071, term2071.getClass(), "requires", term2113);
        setField(term2070, term2070.getClass(), "input", term2071);
        setField(term2070, term2070.getClass(), "oldName", "sNQFlATEeQ");
        setIntField(term2070, term2070.getClass(), "orderOfOccurrence", -2015854073);
        setField(term2070, term2070.getClass(), "newName", "ZKMLioamsY");
        setIntField(term2070, term2070.getClass(), "count", 538259104);
        setField(term2070, term2070.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenameVars");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.RenameVars$Assignment");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term2070;
        args[1] = "WVbxuoDBcn";
        try {
            callMethod(klass, "finalizeNameAssignment", argTypes, term1893, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


