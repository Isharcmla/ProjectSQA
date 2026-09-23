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
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class RenamePrototypes_process_5318199145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35;
     Object term105;
     Object term132;

    public RenamePrototypes_process_5318199145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term43 = new HashMap();
        HashMap term51 = new HashMap();
        HashMap term60 = new HashMap();
        Set<Object> term725 =  ((Map) term60).keySet();
        HashSet term59 = new HashSet((Collection<? extends Object>) term725);
        HashMap term70 = new HashMap();
        HashMap term84 = new HashMap();
        Set<Object> term726 =  ((Map) term84).keySet();
        HashSet term83 = new HashSet((Collection<? extends Object>) term726);
        HashMap term97 = new HashMap();
        Set<Object> term727 =  ((Map) term97).keySet();
        HashSet term96 = new HashSet((Collection<? extends Object>) term727);
        term35 = newInstance(Class.forName("com.google.javascript.jscomp.RenamePrototypes"));
        char[] term37 = (char[]) newCharArray(4);
        Object term42 = newInstance(Class.forName("com.google.javascript.jscomp.VariableMap"));
        setField(term35, term35.getClass(), "compiler", null);
        setBooleanField(term35, term35.getClass(), "aggressiveRenaming", false);
        setCharElement(term37, 0, 'n');
        setCharElement(term37, 1, 'Z');
        setCharElement(term37, 2, 't');
        setCharElement(term37, 3, 'T');
        setField(term35, term35.getClass(), "reservedCharacters", term37);
        setField(term42, term42.getClass(), "map", term43);
        setField(term42, term42.getClass(), "reverseMap", term51);
        setField(term35, term35.getClass(), "prevUsedRenameMap", term42);
        setField(term35, term35.getClass(), "stringNodes", term59);
        setField(term35, term35.getClass(), "properties", term70);
        setField(term35, term35.getClass(), "reservedNames", term83);
        setField(term35, term35.getClass(), "prototypeObjLits", term96);
        term105 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term107 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term109 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term112 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term115 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term118 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term122 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term125 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term128 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term105, term105.getClass(), "type", -883034806);
        setIntField(term107, term107.getClass(), "type", -1456670397);
        setIntField(term109, term109.getClass(), "type", 0);
        setField(term109, term109.getClass(), "next", null);
        setField(term109, term109.getClass(), "first", null);
        setField(term109, term109.getClass(), "last", null);
        setField(term109, term109.getClass(), "propListHead", null);
        setIntField(term109, term109.getClass(), "sourcePosition", 0);
        setField(term109, term109.getClass(), "jsType", null);
        setField(term109, term109.getClass(), "parent", null);
        setField(term107, term107.getClass(), "next", term109);
        setIntField(term112, term112.getClass(), "type", 0);
        setField(term112, term112.getClass(), "next", null);
        setField(term112, term112.getClass(), "first", null);
        setField(term112, term112.getClass(), "last", null);
        setField(term112, term112.getClass(), "propListHead", null);
        setIntField(term112, term112.getClass(), "sourcePosition", 0);
        setField(term112, term112.getClass(), "jsType", null);
        setField(term112, term112.getClass(), "parent", null);
        setField(term107, term107.getClass(), "first", term112);
        setIntField(term115, term115.getClass(), "type", 0);
        setField(term115, term115.getClass(), "next", null);
        setField(term115, term115.getClass(), "first", null);
        setField(term115, term115.getClass(), "last", null);
        setField(term115, term115.getClass(), "propListHead", null);
        setIntField(term115, term115.getClass(), "sourcePosition", 0);
        setField(term115, term115.getClass(), "jsType", null);
        setField(term115, term115.getClass(), "parent", null);
        setField(term107, term107.getClass(), "last", term115);
        setField(term118, term118.getClass(), "next", null);
        setIntField(term118, term118.getClass(), "type", 0);
        setIntField(term118, term118.getClass(), "intValue", 0);
        setField(term118, term118.getClass(), "objectValue", null);
        setField(term107, term107.getClass(), "propListHead", term118);
        setIntField(term107, term107.getClass(), "sourcePosition", -655067527);
        setField(term107, term107.getClass(), "jsType", null);
        setField(term107, term107.getClass(), "parent", null);
        setField(term105, term105.getClass(), "next", term107);
        setIntField(term122, term122.getClass(), "type", 0);
        setField(term122, term122.getClass(), "next", null);
        setField(term122, term122.getClass(), "first", null);
        setField(term122, term122.getClass(), "last", null);
        setField(term122, term122.getClass(), "propListHead", null);
        setIntField(term122, term122.getClass(), "sourcePosition", 0);
        setField(term122, term122.getClass(), "jsType", null);
        setField(term122, term122.getClass(), "parent", null);
        setField(term105, term105.getClass(), "first", term122);
        setIntField(term125, term125.getClass(), "type", 0);
        setField(term125, term125.getClass(), "next", null);
        setField(term125, term125.getClass(), "first", null);
        setField(term125, term125.getClass(), "last", null);
        setField(term125, term125.getClass(), "propListHead", null);
        setIntField(term125, term125.getClass(), "sourcePosition", 0);
        setField(term125, term125.getClass(), "jsType", null);
        setField(term125, term125.getClass(), "parent", null);
        setField(term105, term105.getClass(), "last", term125);
        setField(term128, term128.getClass(), "next", null);
        setIntField(term128, term128.getClass(), "type", 0);
        setIntField(term128, term128.getClass(), "intValue", 0);
        setField(term128, term128.getClass(), "objectValue", null);
        setField(term105, term105.getClass(), "propListHead", term128);
        setIntField(term105, term105.getClass(), "sourcePosition", -6029667);
        setField(term105, term105.getClass(), "jsType", null);
        setField(term105, term105.getClass(), "parent", null);
        term132 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term134 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term136 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term139 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term142 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term145 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term149 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term152 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term155 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term132, term132.getClass(), "type", 1135664017);
        setIntField(term134, term134.getClass(), "type", -244121226);
        setIntField(term136, term136.getClass(), "type", 0);
        setField(term136, term136.getClass(), "next", null);
        setField(term136, term136.getClass(), "first", null);
        setField(term136, term136.getClass(), "last", null);
        setField(term136, term136.getClass(), "propListHead", null);
        setIntField(term136, term136.getClass(), "sourcePosition", 0);
        setField(term136, term136.getClass(), "jsType", null);
        setField(term136, term136.getClass(), "parent", null);
        setField(term134, term134.getClass(), "next", term136);
        setIntField(term139, term139.getClass(), "type", 0);
        setField(term139, term139.getClass(), "next", null);
        setField(term139, term139.getClass(), "first", null);
        setField(term139, term139.getClass(), "last", null);
        setField(term139, term139.getClass(), "propListHead", null);
        setIntField(term139, term139.getClass(), "sourcePosition", 0);
        setField(term139, term139.getClass(), "jsType", null);
        setField(term139, term139.getClass(), "parent", null);
        setField(term134, term134.getClass(), "first", term139);
        setIntField(term142, term142.getClass(), "type", 0);
        setField(term142, term142.getClass(), "next", null);
        setField(term142, term142.getClass(), "first", null);
        setField(term142, term142.getClass(), "last", null);
        setField(term142, term142.getClass(), "propListHead", null);
        setIntField(term142, term142.getClass(), "sourcePosition", 0);
        setField(term142, term142.getClass(), "jsType", null);
        setField(term142, term142.getClass(), "parent", null);
        setField(term134, term134.getClass(), "last", term142);
        setField(term145, term145.getClass(), "next", null);
        setIntField(term145, term145.getClass(), "type", 0);
        setIntField(term145, term145.getClass(), "intValue", 0);
        setField(term145, term145.getClass(), "objectValue", null);
        setField(term134, term134.getClass(), "propListHead", term145);
        setIntField(term134, term134.getClass(), "sourcePosition", -73683645);
        setField(term134, term134.getClass(), "jsType", null);
        setField(term134, term134.getClass(), "parent", null);
        setField(term132, term132.getClass(), "next", term134);
        setIntField(term149, term149.getClass(), "type", 0);
        setField(term149, term149.getClass(), "next", null);
        setField(term149, term149.getClass(), "first", null);
        setField(term149, term149.getClass(), "last", null);
        setField(term149, term149.getClass(), "propListHead", null);
        setIntField(term149, term149.getClass(), "sourcePosition", 0);
        setField(term149, term149.getClass(), "jsType", null);
        setField(term149, term149.getClass(), "parent", null);
        setField(term132, term132.getClass(), "first", term149);
        setIntField(term152, term152.getClass(), "type", 0);
        setField(term152, term152.getClass(), "next", null);
        setField(term152, term152.getClass(), "first", null);
        setField(term152, term152.getClass(), "last", null);
        setField(term152, term152.getClass(), "propListHead", null);
        setIntField(term152, term152.getClass(), "sourcePosition", 0);
        setField(term152, term152.getClass(), "jsType", null);
        setField(term152, term152.getClass(), "parent", null);
        setField(term132, term132.getClass(), "last", term152);
        setField(term155, term155.getClass(), "next", null);
        setIntField(term155, term155.getClass(), "type", 0);
        setIntField(term155, term155.getClass(), "intValue", 0);
        setField(term155, term155.getClass(), "objectValue", null);
        setField(term132, term132.getClass(), "propListHead", term155);
        setIntField(term132, term132.getClass(), "sourcePosition", -226514366);
        setField(term132, term132.getClass(), "jsType", null);
        setField(term132, term132.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenamePrototypes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term105;
        args[1] = term132;
        try {
            callMethod(klass, "process", argTypes, term35, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


