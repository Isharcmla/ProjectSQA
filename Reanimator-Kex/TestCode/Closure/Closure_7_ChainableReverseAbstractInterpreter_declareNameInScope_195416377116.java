package com.google.javascript.jscomp.type;

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
import static com.google.javascript.jscomp.type.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ChainableReverseAbstractInterpreter_declareNameInScope_195416377116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86;

    public ChainableReverseAbstractInterpreter_declareNameInScope_195416377116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term88 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term90 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term92 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term94 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term97 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term101 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term103 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term108 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term86, term86.getClass(), "type", -203030934);
        setIntField(term88, term88.getClass(), "type", -1179120542);
        setIntField(term90, term90.getClass(), "type", -73683645);
        setIntField(term92, term92.getClass(), "type", -226514366);
        setIntField(term94, term94.getClass(), "type", 1193880199);
        setField(term94, term94.getClass(), "next", null);
        setField(term94, term94.getClass(), "first", null);
        setField(term94, term94.getClass(), "last", null);
        setField(term94, term94.getClass(), "propListHead", null);
        setIntField(term94, term94.getClass(), "sourcePosition", 0);
        setField(term94, term94.getClass(), "jsType", null);
        setField(term94, term94.getClass(), "parent", null);
        setField(term92, term92.getClass(), "next", term94);
        setIntField(term97, term97.getClass(), "type", -1087774327);
        setField(term97, term97.getClass(), "next", null);
        setField(term97, term97.getClass(), "first", null);
        setField(term97, term97.getClass(), "last", term94);
        setField(term97, term97.getClass(), "propListHead", null);
        setIntField(term97, term97.getClass(), "sourcePosition", 0);
        setField(term97, term97.getClass(), "jsType", null);
        setField(term97, term97.getClass(), "parent", null);
        setField(term92, term92.getClass(), "first", term97);
        setField(term92, term92.getClass(), "last", term90);
        setField(term92, term92.getClass(), "propListHead", null);
        setIntField(term92, term92.getClass(), "sourcePosition", 0);
        setField(term92, term92.getClass(), "jsType", null);
        setField(term92, term92.getClass(), "parent", null);
        setField(term90, term90.getClass(), "next", term92);
        setField(term90, term90.getClass(), "first", term94);
        setIntField(term101, term101.getClass(), "type", -469968304);
        setIntField(term103, term103.getClass(), "type", -1145578966);
        setField(term103, term103.getClass(), "next", null);
        setField(term103, term103.getClass(), "first", term97);
        setField(term103, term103.getClass(), "last", term92);
        setField(term103, term103.getClass(), "propListHead", null);
        setIntField(term103, term103.getClass(), "sourcePosition", 0);
        setField(term103, term103.getClass(), "jsType", null);
        setField(term103, term103.getClass(), "parent", null);
        setField(term101, term101.getClass(), "next", term103);
        setField(term101, term101.getClass(), "first", term88);
        setField(term101, term101.getClass(), "last", term88);
        setField(term101, term101.getClass(), "propListHead", null);
        setIntField(term101, term101.getClass(), "sourcePosition", 0);
        setField(term101, term101.getClass(), "jsType", null);
        setField(term101, term101.getClass(), "parent", null);
        setField(term90, term90.getClass(), "last", term101);
        setField(term90, term90.getClass(), "propListHead", null);
        setIntField(term90, term90.getClass(), "sourcePosition", 0);
        setField(term90, term90.getClass(), "jsType", null);
        setField(term90, term90.getClass(), "parent", null);
        setField(term88, term88.getClass(), "next", term90);
        setIntField(term108, term108.getClass(), "type", 679763016);
        setField(term108, term108.getClass(), "next", term101);
        setField(term108, term108.getClass(), "first", term103);
        setField(term108, term108.getClass(), "last", term86);
        setField(term108, term108.getClass(), "propListHead", null);
        setIntField(term108, term108.getClass(), "sourcePosition", 0);
        setField(term108, term108.getClass(), "jsType", null);
        setField(term108, term108.getClass(), "parent", null);
        setField(term88, term88.getClass(), "first", term108);
        setField(term88, term88.getClass(), "last", term108);
        setField(term88, term88.getClass(), "propListHead", null);
        setIntField(term88, term88.getClass(), "sourcePosition", 0);
        setField(term88, term88.getClass(), "jsType", null);
        setField(term88, term88.getClass(), "parent", null);
        setField(term86, term86.getClass(), "next", term88);
        setField(term86, term86.getClass(), "first", term92);
        setField(term86, term86.getClass(), "last", term94);
        setField(term86, term86.getClass(), "propListHead", null);
        setIntField(term86, term86.getClass(), "sourcePosition", 0);
        setField(term86, term86.getClass(), "jsType", null);
        setField(term86, term86.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term86;
        args[2] = null;
        try {
            callMethod(klass, "declareNameInScope", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


