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
import java.util.ArrayDeque;

public class PeepholeFoldConstants_tryFoldUnaryOperator_42933858525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term290;
     Object term351;

    public PeepholeFoldConstants_tryFoldUnaryOperator_42933858525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term309 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term309, term309.getClass(), "vars", null);
        setField(term309, term309.getClass(), "parent", null);
        setField(term309, term309.getClass(), "rootNode", null);
        setField(term309, term309.getClass(), "thisType", null);
        setBooleanField(term309, term309.getClass(), "isBottom", false);
        ArrayDeque term307 = new ArrayDeque();
        ((ArrayDeque) term307).add(term309);
        Object term315 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term315, term315.getClass(), "type", 0);
        setField(term315, term315.getClass(), "next", null);
        setField(term315, term315.getClass(), "first", null);
        setField(term315, term315.getClass(), "last", null);
        setField(term315, term315.getClass(), "propListHead", null);
        setIntField(term315, term315.getClass(), "sourcePosition", 0);
        setField(term315, term315.getClass(), "jsType", null);
        setField(term315, term315.getClass(), "parent", null);
        Object term318 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term318, term318.getClass(), "type", 0);
        setField(term318, term318.getClass(), "next", null);
        setField(term318, term318.getClass(), "first", null);
        setField(term318, term318.getClass(), "last", null);
        setField(term318, term318.getClass(), "propListHead", null);
        setIntField(term318, term318.getClass(), "sourcePosition", 0);
        setField(term318, term318.getClass(), "jsType", null);
        setField(term318, term318.getClass(), "parent", null);
        Object term321 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term321, term321.getClass(), "type", 0);
        setField(term321, term321.getClass(), "next", null);
        setField(term321, term321.getClass(), "first", null);
        setField(term321, term321.getClass(), "last", null);
        setField(term321, term321.getClass(), "propListHead", null);
        setIntField(term321, term321.getClass(), "sourcePosition", 0);
        setField(term321, term321.getClass(), "jsType", null);
        setField(term321, term321.getClass(), "parent", null);
        Object term324 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term324, term324.getClass(), "type", 0);
        setField(term324, term324.getClass(), "next", null);
        setField(term324, term324.getClass(), "first", null);
        setField(term324, term324.getClass(), "last", null);
        setField(term324, term324.getClass(), "propListHead", null);
        setIntField(term324, term324.getClass(), "sourcePosition", 0);
        setField(term324, term324.getClass(), "jsType", null);
        setField(term324, term324.getClass(), "parent", null);
        Object term327 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term327, term327.getClass(), "type", 0);
        setField(term327, term327.getClass(), "next", null);
        setField(term327, term327.getClass(), "first", null);
        setField(term327, term327.getClass(), "last", null);
        setField(term327, term327.getClass(), "propListHead", null);
        setIntField(term327, term327.getClass(), "sourcePosition", 0);
        setField(term327, term327.getClass(), "jsType", null);
        setField(term327, term327.getClass(), "parent", null);
        Object term330 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term330, term330.getClass(), "type", 0);
        setField(term330, term330.getClass(), "next", null);
        setField(term330, term330.getClass(), "first", null);
        setField(term330, term330.getClass(), "last", null);
        setField(term330, term330.getClass(), "propListHead", null);
        setIntField(term330, term330.getClass(), "sourcePosition", 0);
        setField(term330, term330.getClass(), "jsType", null);
        setField(term330, term330.getClass(), "parent", null);
        ArrayDeque term313 = new ArrayDeque();
        ((ArrayDeque) term313).add(term315);
        ((ArrayDeque) term313).add(term318);
        ((ArrayDeque) term313).add(term321);
        ((ArrayDeque) term313).add(term324);
        ((ArrayDeque) term313).add(term327);
        ((ArrayDeque) term313).add(term330);
        ArrayDeque term335 = new ArrayDeque();
        term290 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term291 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        Object term292 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term294 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term297 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term300 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term303 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setField(term291, term291.getClass(), "compiler", null);
        setField(term291, term291.getClass(), "callback", null);
        setIntField(term292, term292.getClass(), "type", 1596070772);
        setIntField(term294, term294.getClass(), "type", 0);
        setField(term294, term294.getClass(), "next", null);
        setField(term294, term294.getClass(), "first", null);
        setField(term294, term294.getClass(), "last", null);
        setField(term294, term294.getClass(), "propListHead", null);
        setIntField(term294, term294.getClass(), "sourcePosition", 0);
        setField(term294, term294.getClass(), "jsType", null);
        setField(term294, term294.getClass(), "parent", null);
        setField(term292, term292.getClass(), "next", term294);
        setIntField(term297, term297.getClass(), "type", 0);
        setField(term297, term297.getClass(), "next", null);
        setField(term297, term297.getClass(), "first", null);
        setField(term297, term297.getClass(), "last", null);
        setField(term297, term297.getClass(), "propListHead", null);
        setIntField(term297, term297.getClass(), "sourcePosition", 0);
        setField(term297, term297.getClass(), "jsType", null);
        setField(term297, term297.getClass(), "parent", null);
        setField(term292, term292.getClass(), "first", term297);
        setIntField(term300, term300.getClass(), "type", 0);
        setField(term300, term300.getClass(), "next", null);
        setField(term300, term300.getClass(), "first", null);
        setField(term300, term300.getClass(), "last", null);
        setField(term300, term300.getClass(), "propListHead", null);
        setIntField(term300, term300.getClass(), "sourcePosition", 0);
        setField(term300, term300.getClass(), "jsType", null);
        setField(term300, term300.getClass(), "parent", null);
        setField(term292, term292.getClass(), "last", term300);
        setField(term303, term303.getClass(), "next", null);
        setIntField(term303, term303.getClass(), "type", 0);
        setIntField(term303, term303.getClass(), "intValue", 0);
        setField(term303, term303.getClass(), "objectValue", null);
        setField(term292, term292.getClass(), "propListHead", term303);
        setIntField(term292, term292.getClass(), "sourcePosition", -2095575670);
        setField(term292, term292.getClass(), "jsType", null);
        setField(term292, term292.getClass(), "parent", null);
        setField(term291, term291.getClass(), "curNode", term292);
        setField(term291, term291.getClass(), "scopes", term307);
        setField(term291, term291.getClass(), "scopeRoots", term313);
        setField(term291, term291.getClass(), "cfgs", term335);
        setField(term291, term291.getClass(), "sourceName", "xxtlPwDYFs");
        setField(term291, term291.getClass(), "scopeCreator", null);
        setField(term291, term291.getClass(), "scopeCallback", null);
        setField(term290, term290.getClass(), "currentTraversal", term291);
        term351 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term353 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term355 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term358 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term361 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term364 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term368 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term371 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term374 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term351, term351.getClass(), "type", -93135961);
        setIntField(term353, term353.getClass(), "type", 962840079);
        setIntField(term355, term355.getClass(), "type", 0);
        setField(term355, term355.getClass(), "next", null);
        setField(term355, term355.getClass(), "first", null);
        setField(term355, term355.getClass(), "last", null);
        setField(term355, term355.getClass(), "propListHead", null);
        setIntField(term355, term355.getClass(), "sourcePosition", 0);
        setField(term355, term355.getClass(), "jsType", null);
        setField(term355, term355.getClass(), "parent", null);
        setField(term353, term353.getClass(), "next", term355);
        setIntField(term358, term358.getClass(), "type", 0);
        setField(term358, term358.getClass(), "next", null);
        setField(term358, term358.getClass(), "first", null);
        setField(term358, term358.getClass(), "last", null);
        setField(term358, term358.getClass(), "propListHead", null);
        setIntField(term358, term358.getClass(), "sourcePosition", 0);
        setField(term358, term358.getClass(), "jsType", null);
        setField(term358, term358.getClass(), "parent", null);
        setField(term353, term353.getClass(), "first", term358);
        setIntField(term361, term361.getClass(), "type", 0);
        setField(term361, term361.getClass(), "next", null);
        setField(term361, term361.getClass(), "first", null);
        setField(term361, term361.getClass(), "last", null);
        setField(term361, term361.getClass(), "propListHead", null);
        setIntField(term361, term361.getClass(), "sourcePosition", 0);
        setField(term361, term361.getClass(), "jsType", null);
        setField(term361, term361.getClass(), "parent", null);
        setField(term353, term353.getClass(), "last", term361);
        setField(term364, term364.getClass(), "next", null);
        setIntField(term364, term364.getClass(), "type", 0);
        setIntField(term364, term364.getClass(), "intValue", 0);
        setField(term364, term364.getClass(), "objectValue", null);
        setField(term353, term353.getClass(), "propListHead", term364);
        setIntField(term353, term353.getClass(), "sourcePosition", 335112684);
        setField(term353, term353.getClass(), "jsType", null);
        setField(term353, term353.getClass(), "parent", null);
        setField(term351, term351.getClass(), "next", term353);
        setIntField(term368, term368.getClass(), "type", 0);
        setField(term368, term368.getClass(), "next", null);
        setField(term368, term368.getClass(), "first", null);
        setField(term368, term368.getClass(), "last", null);
        setField(term368, term368.getClass(), "propListHead", null);
        setIntField(term368, term368.getClass(), "sourcePosition", 0);
        setField(term368, term368.getClass(), "jsType", null);
        setField(term368, term368.getClass(), "parent", null);
        setField(term351, term351.getClass(), "first", term368);
        setIntField(term371, term371.getClass(), "type", 0);
        setField(term371, term371.getClass(), "next", null);
        setField(term371, term371.getClass(), "first", null);
        setField(term371, term371.getClass(), "last", null);
        setField(term371, term371.getClass(), "propListHead", null);
        setIntField(term371, term371.getClass(), "sourcePosition", 0);
        setField(term371, term371.getClass(), "jsType", null);
        setField(term371, term371.getClass(), "parent", null);
        setField(term351, term351.getClass(), "last", term371);
        setField(term374, term374.getClass(), "next", null);
        setIntField(term374, term374.getClass(), "type", 0);
        setIntField(term374, term374.getClass(), "intValue", 0);
        setField(term374, term374.getClass(), "objectValue", null);
        setField(term351, term351.getClass(), "propListHead", term374);
        setIntField(term351, term351.getClass(), "sourcePosition", 1551099402);
        setField(term351, term351.getClass(), "jsType", null);
        setField(term351, term351.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term351;
        try {
            callMethod(klass, "tryFoldUnaryOperator", argTypes, term290, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


