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

public class ReferenceCollectingCallback_hotSwapScript_31646005120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94;
     Object term129;
     Object term156;

    public ReferenceCollectingCallback_hotSwapScript_31646005120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term95 = new HashMap();
        Object term111 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock"));
        setField(term111, term111.getClass(), "parent", null);
        setBooleanField(term111, term111.getClass(), "isHoisted", false);
        setBooleanField(term111, term111.getClass(), "isFunction", false);
        setBooleanField(term111, term111.getClass(), "isLoop", false);
        Object term115 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock"));
        setField(term115, term115.getClass(), "parent", null);
        setBooleanField(term115, term115.getClass(), "isHoisted", false);
        setBooleanField(term115, term115.getClass(), "isFunction", false);
        setBooleanField(term115, term115.getClass(), "isLoop", false);
        Object term119 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock"));
        setField(term119, term119.getClass(), "parent", null);
        setBooleanField(term119, term119.getClass(), "isHoisted", false);
        setBooleanField(term119, term119.getClass(), "isFunction", false);
        setBooleanField(term119, term119.getClass(), "isLoop", false);
        Object term123 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock"));
        setField(term123, term123.getClass(), "parent", null);
        setBooleanField(term123, term123.getClass(), "isHoisted", false);
        setBooleanField(term123, term123.getClass(), "isFunction", false);
        setBooleanField(term123, term123.getClass(), "isLoop", false);
        ArrayDeque term109 = new ArrayDeque();
        ((ArrayDeque) term109).add(term111);
        ((ArrayDeque) term109).add(term115);
        ((ArrayDeque) term109).add(term119);
        ((ArrayDeque) term109).add(term123);
        term94 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term94, term94.getClass(), "referenceMap", term95);
        setField(term94, term94.getClass(), "blockStack", term109);
        setField(term94, term94.getClass(), "behavior", null);
        setField(term94, term94.getClass(), "compiler", null);
        setField(term94, term94.getClass(), "varFilter", null);
        term129 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term131 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term133 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term135 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term137 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term140 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term144 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term146 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term151 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term129, term129.getClass(), "type", -1530420153);
        setIntField(term131, term131.getClass(), "type", -469968304);
        setIntField(term133, term133.getClass(), "type", -1145578966);
        setIntField(term135, term135.getClass(), "type", 679763016);
        setIntField(term137, term137.getClass(), "type", 1962444399);
        setField(term137, term137.getClass(), "next", null);
        setField(term137, term137.getClass(), "first", null);
        setField(term137, term137.getClass(), "last", null);
        setField(term137, term137.getClass(), "propListHead", null);
        setIntField(term137, term137.getClass(), "sourcePosition", 0);
        setField(term137, term137.getClass(), "jsType", null);
        setField(term137, term137.getClass(), "parent", null);
        setField(term135, term135.getClass(), "next", term137);
        setIntField(term140, term140.getClass(), "type", 767834723);
        setField(term140, term140.getClass(), "next", null);
        setField(term140, term140.getClass(), "first", null);
        setField(term140, term140.getClass(), "last", term137);
        setField(term140, term140.getClass(), "propListHead", null);
        setIntField(term140, term140.getClass(), "sourcePosition", 0);
        setField(term140, term140.getClass(), "jsType", null);
        setField(term140, term140.getClass(), "parent", null);
        setField(term135, term135.getClass(), "first", term140);
        setField(term135, term135.getClass(), "last", term133);
        setField(term135, term135.getClass(), "propListHead", null);
        setIntField(term135, term135.getClass(), "sourcePosition", 0);
        setField(term135, term135.getClass(), "jsType", null);
        setField(term135, term135.getClass(), "parent", null);
        setField(term133, term133.getClass(), "next", term135);
        setField(term133, term133.getClass(), "first", term137);
        setIntField(term144, term144.getClass(), "type", -157887805);
        setIntField(term146, term146.getClass(), "type", 1876565163);
        setField(term146, term146.getClass(), "next", null);
        setField(term146, term146.getClass(), "first", term140);
        setField(term146, term146.getClass(), "last", term135);
        setField(term146, term146.getClass(), "propListHead", null);
        setIntField(term146, term146.getClass(), "sourcePosition", 0);
        setField(term146, term146.getClass(), "jsType", null);
        setField(term146, term146.getClass(), "parent", null);
        setField(term144, term144.getClass(), "next", term146);
        setField(term144, term144.getClass(), "first", term131);
        setField(term144, term144.getClass(), "last", term131);
        setField(term144, term144.getClass(), "propListHead", null);
        setIntField(term144, term144.getClass(), "sourcePosition", 0);
        setField(term144, term144.getClass(), "jsType", null);
        setField(term144, term144.getClass(), "parent", null);
        setField(term133, term133.getClass(), "last", term144);
        setField(term133, term133.getClass(), "propListHead", null);
        setIntField(term133, term133.getClass(), "sourcePosition", 0);
        setField(term133, term133.getClass(), "jsType", null);
        setField(term133, term133.getClass(), "parent", null);
        setField(term131, term131.getClass(), "next", term133);
        setIntField(term151, term151.getClass(), "type", -817164822);
        setField(term151, term151.getClass(), "next", term144);
        setField(term151, term151.getClass(), "first", term146);
        setField(term151, term151.getClass(), "last", term129);
        setField(term151, term151.getClass(), "propListHead", null);
        setIntField(term151, term151.getClass(), "sourcePosition", 0);
        setField(term151, term151.getClass(), "jsType", null);
        setField(term151, term151.getClass(), "parent", null);
        setField(term131, term131.getClass(), "first", term151);
        setField(term131, term131.getClass(), "last", term151);
        setField(term131, term131.getClass(), "propListHead", null);
        setIntField(term131, term131.getClass(), "sourcePosition", 0);
        setField(term131, term131.getClass(), "jsType", null);
        setField(term131, term131.getClass(), "parent", null);
        setField(term129, term129.getClass(), "next", term131);
        setField(term129, term129.getClass(), "first", term135);
        setField(term129, term129.getClass(), "last", term137);
        setField(term129, term129.getClass(), "propListHead", null);
        setIntField(term129, term129.getClass(), "sourcePosition", 0);
        setField(term129, term129.getClass(), "jsType", null);
        setField(term129, term129.getClass(), "parent", null);
        term156 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term158 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term160 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term162 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term164 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term167 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term171 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term173 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term178 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term156, term156.getClass(), "type", -1016503459);
        setIntField(term158, term158.getClass(), "type", -1968847291);
        setIntField(term160, term160.getClass(), "type", 579005622);
        setIntField(term162, term162.getClass(), "type", -14890619);
        setIntField(term164, term164.getClass(), "type", 1632125673);
        setField(term164, term164.getClass(), "next", null);
        setField(term164, term164.getClass(), "first", null);
        setField(term164, term164.getClass(), "last", null);
        setField(term164, term164.getClass(), "propListHead", null);
        setIntField(term164, term164.getClass(), "sourcePosition", 0);
        setField(term164, term164.getClass(), "jsType", null);
        setField(term164, term164.getClass(), "parent", null);
        setField(term162, term162.getClass(), "next", term164);
        setIntField(term167, term167.getClass(), "type", 454281060);
        setField(term167, term167.getClass(), "next", null);
        setField(term167, term167.getClass(), "first", null);
        setField(term167, term167.getClass(), "last", term164);
        setField(term167, term167.getClass(), "propListHead", null);
        setIntField(term167, term167.getClass(), "sourcePosition", 0);
        setField(term167, term167.getClass(), "jsType", null);
        setField(term167, term167.getClass(), "parent", null);
        setField(term162, term162.getClass(), "first", term167);
        setField(term162, term162.getClass(), "last", term160);
        setField(term162, term162.getClass(), "propListHead", null);
        setIntField(term162, term162.getClass(), "sourcePosition", 0);
        setField(term162, term162.getClass(), "jsType", null);
        setField(term162, term162.getClass(), "parent", null);
        setField(term160, term160.getClass(), "next", term162);
        setField(term160, term160.getClass(), "first", term164);
        setIntField(term171, term171.getClass(), "type", 2055867847);
        setIntField(term173, term173.getClass(), "type", -1048298087);
        setField(term173, term173.getClass(), "next", null);
        setField(term173, term173.getClass(), "first", term167);
        setField(term173, term173.getClass(), "last", term162);
        setField(term173, term173.getClass(), "propListHead", null);
        setIntField(term173, term173.getClass(), "sourcePosition", 0);
        setField(term173, term173.getClass(), "jsType", null);
        setField(term173, term173.getClass(), "parent", null);
        setField(term171, term171.getClass(), "next", term173);
        setField(term171, term171.getClass(), "first", term158);
        setField(term171, term171.getClass(), "last", term158);
        setField(term171, term171.getClass(), "propListHead", null);
        setIntField(term171, term171.getClass(), "sourcePosition", 0);
        setField(term171, term171.getClass(), "jsType", null);
        setField(term171, term171.getClass(), "parent", null);
        setField(term160, term160.getClass(), "last", term171);
        setField(term160, term160.getClass(), "propListHead", null);
        setIntField(term160, term160.getClass(), "sourcePosition", 0);
        setField(term160, term160.getClass(), "jsType", null);
        setField(term160, term160.getClass(), "parent", null);
        setField(term158, term158.getClass(), "next", term160);
        setIntField(term178, term178.getClass(), "type", 292681826);
        setField(term178, term178.getClass(), "next", term171);
        setField(term178, term178.getClass(), "first", term173);
        setField(term178, term178.getClass(), "last", term156);
        setField(term178, term178.getClass(), "propListHead", null);
        setIntField(term178, term178.getClass(), "sourcePosition", 0);
        setField(term178, term178.getClass(), "jsType", null);
        setField(term178, term178.getClass(), "parent", null);
        setField(term158, term158.getClass(), "first", term178);
        setField(term158, term158.getClass(), "last", term178);
        setField(term158, term158.getClass(), "propListHead", null);
        setIntField(term158, term158.getClass(), "sourcePosition", 0);
        setField(term158, term158.getClass(), "jsType", null);
        setField(term158, term158.getClass(), "parent", null);
        setField(term156, term156.getClass(), "next", term158);
        setField(term156, term156.getClass(), "first", term162);
        setField(term156, term156.getClass(), "last", term164);
        setField(term156, term156.getClass(), "propListHead", null);
        setIntField(term156, term156.getClass(), "sourcePosition", 0);
        setField(term156, term156.getClass(), "jsType", null);
        setField(term156, term156.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term129;
        args[1] = term156;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term94, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


