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
import java.lang.Object;

public class PeepholeFoldConstants_tryFoldTypeof_103678687742 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177;
     Object term179;

    public PeepholeFoldConstants_tryFoldTypeof_103678687742() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term177 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setBooleanField(term177, term177.getClass(), "late", true);
        setField(term177, term177.getClass(), "compiler", null);
        term179 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term181 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term183 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term185 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term187 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term190 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term194 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term196 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term201 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term179, term179.getClass(), "type", 1596070772);
        setIntField(term181, term181.getClass(), "type", 97029295);
        setIntField(term183, term183.getClass(), "type", -1371869594);
        setIntField(term185, term185.getClass(), "type", -2095575670);
        setIntField(term187, term187.getClass(), "type", 1225272962);
        setField(term187, term187.getClass(), "next", null);
        setField(term187, term187.getClass(), "first", null);
        setField(term187, term187.getClass(), "last", null);
        setField(term187, term187.getClass(), "propListHead", null);
        setIntField(term187, term187.getClass(), "sourcePosition", 0);
        setField(term187, term187.getClass(), "jsType", null);
        setField(term187, term187.getClass(), "parent", null);
        setField(term185, term185.getClass(), "next", term187);
        setIntField(term190, term190.getClass(), "type", 1324040357);
        setField(term190, term190.getClass(), "next", null);
        setField(term190, term190.getClass(), "first", null);
        setField(term190, term190.getClass(), "last", term187);
        setField(term190, term190.getClass(), "propListHead", null);
        setIntField(term190, term190.getClass(), "sourcePosition", 0);
        setField(term190, term190.getClass(), "jsType", null);
        setField(term190, term190.getClass(), "parent", null);
        setField(term185, term185.getClass(), "first", term190);
        setField(term185, term185.getClass(), "last", term183);
        setField(term185, term185.getClass(), "propListHead", null);
        setIntField(term185, term185.getClass(), "sourcePosition", 0);
        setField(term185, term185.getClass(), "jsType", null);
        setField(term185, term185.getClass(), "parent", null);
        setField(term183, term183.getClass(), "next", term185);
        setField(term183, term183.getClass(), "first", term187);
        setIntField(term194, term194.getClass(), "type", -93135961);
        setIntField(term196, term196.getClass(), "type", -112921587);
        setField(term196, term196.getClass(), "next", null);
        setField(term196, term196.getClass(), "first", term190);
        setField(term196, term196.getClass(), "last", term185);
        setField(term196, term196.getClass(), "propListHead", null);
        setIntField(term196, term196.getClass(), "sourcePosition", 0);
        setField(term196, term196.getClass(), "jsType", null);
        setField(term196, term196.getClass(), "parent", null);
        setField(term194, term194.getClass(), "next", term196);
        setField(term194, term194.getClass(), "first", term181);
        setField(term194, term194.getClass(), "last", term181);
        setField(term194, term194.getClass(), "propListHead", null);
        setIntField(term194, term194.getClass(), "sourcePosition", 0);
        setField(term194, term194.getClass(), "jsType", null);
        setField(term194, term194.getClass(), "parent", null);
        setField(term183, term183.getClass(), "last", term194);
        setField(term183, term183.getClass(), "propListHead", null);
        setIntField(term183, term183.getClass(), "sourcePosition", 0);
        setField(term183, term183.getClass(), "jsType", null);
        setField(term183, term183.getClass(), "parent", null);
        setField(term181, term181.getClass(), "next", term183);
        setIntField(term201, term201.getClass(), "type", 933028652);
        setField(term201, term201.getClass(), "next", term194);
        setField(term201, term201.getClass(), "first", term196);
        setField(term201, term201.getClass(), "last", term179);
        setField(term201, term201.getClass(), "propListHead", null);
        setIntField(term201, term201.getClass(), "sourcePosition", 0);
        setField(term201, term201.getClass(), "jsType", null);
        setField(term201, term201.getClass(), "parent", null);
        setField(term181, term181.getClass(), "first", term201);
        setField(term181, term181.getClass(), "last", term201);
        setField(term181, term181.getClass(), "propListHead", null);
        setIntField(term181, term181.getClass(), "sourcePosition", 0);
        setField(term181, term181.getClass(), "jsType", null);
        setField(term181, term181.getClass(), "parent", null);
        setField(term179, term179.getClass(), "next", term181);
        setField(term179, term179.getClass(), "first", term185);
        setField(term179, term179.getClass(), "last", term187);
        setField(term179, term179.getClass(), "propListHead", null);
        setIntField(term179, term179.getClass(), "sourcePosition", 0);
        setField(term179, term179.getClass(), "jsType", null);
        setField(term179, term179.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term179;
        try {
            callMethod(klass, "tryFoldTypeof", argTypes, term177, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


