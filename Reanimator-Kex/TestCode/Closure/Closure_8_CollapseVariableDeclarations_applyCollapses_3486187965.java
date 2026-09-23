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
import java.lang.IllegalArgumentException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class CollapseVariableDeclarations_applyCollapses_3486187965 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109;

    public CollapseVariableDeclarations_applyCollapses_3486187965() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term112 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseVariableDeclarations$Collapse"));
        Object term113 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term116 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term119 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term113, term113.getClass(), "type", 865208305);
        setField(term113, term113.getClass(), "next", null);
        setField(term113, term113.getClass(), "first", null);
        setField(term113, term113.getClass(), "last", null);
        setField(term113, term113.getClass(), "propListHead", null);
        setIntField(term113, term113.getClass(), "sourcePosition", 0);
        setField(term113, term113.getClass(), "jsType", null);
        setField(term113, term113.getClass(), "parent", null);
        setField(term112, term112.getClass(), "startNode", term113);
        setIntField(term116, term116.getClass(), "type", 0);
        setField(term116, term116.getClass(), "next", null);
        setField(term116, term116.getClass(), "first", null);
        setField(term116, term116.getClass(), "last", null);
        setField(term116, term116.getClass(), "propListHead", null);
        setIntField(term116, term116.getClass(), "sourcePosition", 0);
        setField(term116, term116.getClass(), "jsType", null);
        setField(term116, term116.getClass(), "parent", null);
        setField(term112, term112.getClass(), "endNode", term116);
        setIntField(term119, term119.getClass(), "type", -73683645);
        setField(term119, term119.getClass(), "next", null);
        setField(term119, term119.getClass(), "first", term116);
        setField(term119, term119.getClass(), "last", null);
        setField(term119, term119.getClass(), "propListHead", null);
        setIntField(term119, term119.getClass(), "sourcePosition", 0);
        setField(term119, term119.getClass(), "jsType", null);
        setField(term119, term119.getClass(), "parent", null);
        setField(term112, term112.getClass(), "parent", term119);
        Object term122 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseVariableDeclarations$Collapse"));
        Object term123 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term126 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term123, term123.getClass(), "type", -244121226);
        setField(term123, term123.getClass(), "next", null);
        setField(term123, term123.getClass(), "first", null);
        setField(term123, term123.getClass(), "last", null);
        setField(term123, term123.getClass(), "propListHead", null);
        setIntField(term123, term123.getClass(), "sourcePosition", 0);
        setField(term123, term123.getClass(), "jsType", null);
        setField(term123, term123.getClass(), "parent", null);
        setField(term122, term122.getClass(), "startNode", term123);
        setIntField(term126, term126.getClass(), "type", -1179120542);
        setField(term126, term126.getClass(), "next", term119);
        setField(term126, term126.getClass(), "first", term113);
        setField(term126, term126.getClass(), "last", term119);
        setField(term126, term126.getClass(), "propListHead", null);
        setIntField(term126, term126.getClass(), "sourcePosition", 0);
        setField(term126, term126.getClass(), "jsType", null);
        setField(term126, term126.getClass(), "parent", null);
        setField(term122, term122.getClass(), "endNode", term126);
        setField(term122, term122.getClass(), "parent", term116);
        Object term129 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseVariableDeclarations$Collapse"));
        Object term130 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term133 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term130, term130.getClass(), "type", 0);
        setField(term130, term130.getClass(), "next", null);
        setField(term130, term130.getClass(), "first", null);
        setField(term130, term130.getClass(), "last", null);
        setField(term130, term130.getClass(), "propListHead", null);
        setIntField(term130, term130.getClass(), "sourcePosition", 0);
        setField(term130, term130.getClass(), "jsType", null);
        setField(term130, term130.getClass(), "parent", null);
        setField(term129, term129.getClass(), "startNode", term130);
        setField(term129, term129.getClass(), "endNode", term130);
        setIntField(term133, term133.getClass(), "type", -203030934);
        setField(term133, term133.getClass(), "next", term126);
        setField(term133, term133.getClass(), "first", term133);
        setField(term133, term133.getClass(), "last", null);
        setField(term133, term133.getClass(), "propListHead", null);
        setIntField(term133, term133.getClass(), "sourcePosition", 0);
        setField(term133, term133.getClass(), "jsType", null);
        setField(term133, term133.getClass(), "parent", null);
        setField(term129, term129.getClass(), "parent", term133);
        ArrayList term110 = new ArrayList();
        ((ArrayList) term110).add(term112);
        ((ArrayList) term110).add(term122);
        ((ArrayList) term110).add(term129);
        HashMap term139 = new HashMap();
        Set<Object> term1675 =  ((Map) term139).keySet();
        HashSet term138 = new HashSet((Collection<? extends Object>) term1675);
        term109 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseVariableDeclarations"));
        setField(term109, term109.getClass(), "compiler", null);
        setField(term109, term109.getClass(), "collapses", term110);
        setField(term109, term109.getClass(), "nodesToCollapse", term138);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseVariableDeclarations");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "applyCollapses", argTypes, term109, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


