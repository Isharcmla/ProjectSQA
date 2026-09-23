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
import java.util.ArrayDeque;
import java.lang.Object;

public class ReferenceCollectingCallback_exitScope_127262624118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term485;
     Object term523;

    public ReferenceCollectingCallback_exitScope_127262624118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term486 = new HashMap();
        Object term501 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock"));
        setField(term501, term501.getClass(), "parent", null);
        setBooleanField(term501, term501.getClass(), "isHoisted", false);
        setBooleanField(term501, term501.getClass(), "isFunction", false);
        setBooleanField(term501, term501.getClass(), "isLoop", false);
        Object term505 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock"));
        setField(term505, term505.getClass(), "parent", null);
        setBooleanField(term505, term505.getClass(), "isHoisted", false);
        setBooleanField(term505, term505.getClass(), "isFunction", false);
        setBooleanField(term505, term505.getClass(), "isLoop", false);
        Object term509 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock"));
        setField(term509, term509.getClass(), "parent", null);
        setBooleanField(term509, term509.getClass(), "isHoisted", false);
        setBooleanField(term509, term509.getClass(), "isFunction", false);
        setBooleanField(term509, term509.getClass(), "isLoop", false);
        Object term513 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock"));
        setField(term513, term513.getClass(), "parent", null);
        setBooleanField(term513, term513.getClass(), "isHoisted", false);
        setBooleanField(term513, term513.getClass(), "isFunction", false);
        setBooleanField(term513, term513.getClass(), "isLoop", false);
        Object term517 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock"));
        setField(term517, term517.getClass(), "parent", null);
        setBooleanField(term517, term517.getClass(), "isHoisted", false);
        setBooleanField(term517, term517.getClass(), "isFunction", false);
        setBooleanField(term517, term517.getClass(), "isLoop", false);
        ArrayDeque term499 = new ArrayDeque();
        ((ArrayDeque) term499).add(term501);
        ((ArrayDeque) term499).add(term505);
        ((ArrayDeque) term499).add(term509);
        ((ArrayDeque) term499).add(term513);
        ((ArrayDeque) term499).add(term517);
        term485 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term485, term485.getClass(), "referenceMap", term486);
        setField(term485, term485.getClass(), "blockStack", term499);
        setField(term485, term485.getClass(), "behavior", null);
        setField(term485, term485.getClass(), "compiler", null);
        setField(term485, term485.getClass(), "varFilter", null);
        Object term541 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term541, term541.getClass(), "vars", null);
        setField(term541, term541.getClass(), "parent", null);
        setIntField(term541, term541.getClass(), "depth", 0);
        setField(term541, term541.getClass(), "rootNode", null);
        setField(term541, term541.getClass(), "thisType", null);
        setBooleanField(term541, term541.getClass(), "isBottom", false);
        Object term544 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term544, term544.getClass(), "vars", null);
        setField(term544, term544.getClass(), "parent", null);
        setIntField(term544, term544.getClass(), "depth", 0);
        setField(term544, term544.getClass(), "rootNode", null);
        setField(term544, term544.getClass(), "thisType", null);
        setBooleanField(term544, term544.getClass(), "isBottom", false);
        Object term547 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term547, term547.getClass(), "vars", null);
        setField(term547, term547.getClass(), "parent", null);
        setIntField(term547, term547.getClass(), "depth", 0);
        setField(term547, term547.getClass(), "rootNode", null);
        setField(term547, term547.getClass(), "thisType", null);
        setBooleanField(term547, term547.getClass(), "isBottom", false);
        Object term550 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term550, term550.getClass(), "vars", null);
        setField(term550, term550.getClass(), "parent", null);
        setIntField(term550, term550.getClass(), "depth", 0);
        setField(term550, term550.getClass(), "rootNode", null);
        setField(term550, term550.getClass(), "thisType", null);
        setBooleanField(term550, term550.getClass(), "isBottom", false);
        Object term553 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term553, term553.getClass(), "vars", null);
        setField(term553, term553.getClass(), "parent", null);
        setIntField(term553, term553.getClass(), "depth", 0);
        setField(term553, term553.getClass(), "rootNode", null);
        setField(term553, term553.getClass(), "thisType", null);
        setBooleanField(term553, term553.getClass(), "isBottom", false);
        ArrayDeque term539 = new ArrayDeque();
        ((ArrayDeque) term539).add(term541);
        ((ArrayDeque) term539).add(term544);
        ((ArrayDeque) term539).add(term547);
        ((ArrayDeque) term539).add(term550);
        ((ArrayDeque) term539).add(term553);
        Object term560 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term560, term560.getClass(), "type", 0);
        setField(term560, term560.getClass(), "next", null);
        setField(term560, term560.getClass(), "first", null);
        setField(term560, term560.getClass(), "last", null);
        setField(term560, term560.getClass(), "propListHead", null);
        setIntField(term560, term560.getClass(), "sourcePosition", 0);
        setField(term560, term560.getClass(), "jsType", null);
        setField(term560, term560.getClass(), "parent", null);
        Object term563 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term563, term563.getClass(), "type", 0);
        setField(term563, term563.getClass(), "next", null);
        setField(term563, term563.getClass(), "first", null);
        setField(term563, term563.getClass(), "last", null);
        setField(term563, term563.getClass(), "propListHead", null);
        setIntField(term563, term563.getClass(), "sourcePosition", 0);
        setField(term563, term563.getClass(), "jsType", null);
        setField(term563, term563.getClass(), "parent", null);
        ArrayDeque term558 = new ArrayDeque();
        ((ArrayDeque) term558).add(term560);
        ((ArrayDeque) term558).add(term563);
        ArrayDeque term568 = new ArrayDeque();
        term523 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        Object term524 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term526 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term529 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term532 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term535 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setField(term523, term523.getClass(), "compiler", null);
        setField(term523, term523.getClass(), "callback", null);
        setIntField(term524, term524.getClass(), "type", -2015048153);
        setIntField(term526, term526.getClass(), "type", 0);
        setField(term526, term526.getClass(), "next", null);
        setField(term526, term526.getClass(), "first", null);
        setField(term526, term526.getClass(), "last", null);
        setField(term526, term526.getClass(), "propListHead", null);
        setIntField(term526, term526.getClass(), "sourcePosition", 0);
        setField(term526, term526.getClass(), "jsType", null);
        setField(term526, term526.getClass(), "parent", null);
        setField(term524, term524.getClass(), "next", term526);
        setIntField(term529, term529.getClass(), "type", 0);
        setField(term529, term529.getClass(), "next", null);
        setField(term529, term529.getClass(), "first", null);
        setField(term529, term529.getClass(), "last", null);
        setField(term529, term529.getClass(), "propListHead", null);
        setIntField(term529, term529.getClass(), "sourcePosition", 0);
        setField(term529, term529.getClass(), "jsType", null);
        setField(term529, term529.getClass(), "parent", null);
        setField(term524, term524.getClass(), "first", term529);
        setIntField(term532, term532.getClass(), "type", 0);
        setField(term532, term532.getClass(), "next", null);
        setField(term532, term532.getClass(), "first", null);
        setField(term532, term532.getClass(), "last", null);
        setField(term532, term532.getClass(), "propListHead", null);
        setIntField(term532, term532.getClass(), "sourcePosition", 0);
        setField(term532, term532.getClass(), "jsType", null);
        setField(term532, term532.getClass(), "parent", null);
        setField(term524, term524.getClass(), "last", term532);
        setField(term535, term535.getClass(), "next", null);
        setIntField(term535, term535.getClass(), "type", 0);
        setIntField(term535, term535.getClass(), "intValue", 0);
        setField(term535, term535.getClass(), "objectValue", null);
        setField(term524, term524.getClass(), "propListHead", term535);
        setIntField(term524, term524.getClass(), "sourcePosition", -1565502840);
        setField(term524, term524.getClass(), "jsType", null);
        setField(term524, term524.getClass(), "parent", null);
        setField(term523, term523.getClass(), "curNode", term524);
        setField(term523, term523.getClass(), "scopes", term539);
        setField(term523, term523.getClass(), "scopeRoots", term558);
        setField(term523, term523.getClass(), "cfgs", term568);
        setField(term523, term523.getClass(), "sourceName", "RMFIsYGgne");
        setField(term523, term523.getClass(), "scopeCreator", null);
        setField(term523, term523.getClass(), "scopeCallback", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Object[] args = new Object[1];
        args[0] = term523;
        try {
            callMethod(klass, "exitScope", argTypes, term485, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


