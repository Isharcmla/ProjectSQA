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

public class PeepholeSubstituteAlternateSyntax_tryReplaceUndefined_139053707426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175;
     Object term177;

    public PeepholeSubstituteAlternateSyntax_tryReplaceUndefined_139053707426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term175 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term175, term175.getClass(), "late", true);
        setField(term175, term175.getClass(), "compiler", null);
        term177 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term179 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term181 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term183 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term185 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term188 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term192 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term194 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term199 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term177, term177.getClass(), "type", 1596070772);
        setIntField(term179, term179.getClass(), "type", 97029295);
        setIntField(term181, term181.getClass(), "type", -1371869594);
        setIntField(term183, term183.getClass(), "type", -2095575670);
        setIntField(term185, term185.getClass(), "type", 1225272962);
        setField(term185, term185.getClass(), "next", null);
        setField(term185, term185.getClass(), "first", null);
        setField(term185, term185.getClass(), "last", null);
        setField(term185, term185.getClass(), "propListHead", null);
        setIntField(term185, term185.getClass(), "sourcePosition", 0);
        setField(term185, term185.getClass(), "jsType", null);
        setField(term185, term185.getClass(), "parent", null);
        setField(term183, term183.getClass(), "next", term185);
        setIntField(term188, term188.getClass(), "type", 1324040357);
        setField(term188, term188.getClass(), "next", null);
        setField(term188, term188.getClass(), "first", null);
        setField(term188, term188.getClass(), "last", term185);
        setField(term188, term188.getClass(), "propListHead", null);
        setIntField(term188, term188.getClass(), "sourcePosition", 0);
        setField(term188, term188.getClass(), "jsType", null);
        setField(term188, term188.getClass(), "parent", null);
        setField(term183, term183.getClass(), "first", term188);
        setField(term183, term183.getClass(), "last", term181);
        setField(term183, term183.getClass(), "propListHead", null);
        setIntField(term183, term183.getClass(), "sourcePosition", 0);
        setField(term183, term183.getClass(), "jsType", null);
        setField(term183, term183.getClass(), "parent", null);
        setField(term181, term181.getClass(), "next", term183);
        setField(term181, term181.getClass(), "first", term185);
        setIntField(term192, term192.getClass(), "type", -93135961);
        setIntField(term194, term194.getClass(), "type", -112921587);
        setField(term194, term194.getClass(), "next", null);
        setField(term194, term194.getClass(), "first", term188);
        setField(term194, term194.getClass(), "last", term183);
        setField(term194, term194.getClass(), "propListHead", null);
        setIntField(term194, term194.getClass(), "sourcePosition", 0);
        setField(term194, term194.getClass(), "jsType", null);
        setField(term194, term194.getClass(), "parent", null);
        setField(term192, term192.getClass(), "next", term194);
        setField(term192, term192.getClass(), "first", term179);
        setField(term192, term192.getClass(), "last", term179);
        setField(term192, term192.getClass(), "propListHead", null);
        setIntField(term192, term192.getClass(), "sourcePosition", 0);
        setField(term192, term192.getClass(), "jsType", null);
        setField(term192, term192.getClass(), "parent", null);
        setField(term181, term181.getClass(), "last", term192);
        setField(term181, term181.getClass(), "propListHead", null);
        setIntField(term181, term181.getClass(), "sourcePosition", 0);
        setField(term181, term181.getClass(), "jsType", null);
        setField(term181, term181.getClass(), "parent", null);
        setField(term179, term179.getClass(), "next", term181);
        setIntField(term199, term199.getClass(), "type", 933028652);
        setField(term199, term199.getClass(), "next", term192);
        setField(term199, term199.getClass(), "first", term194);
        setField(term199, term199.getClass(), "last", term177);
        setField(term199, term199.getClass(), "propListHead", null);
        setIntField(term199, term199.getClass(), "sourcePosition", 0);
        setField(term199, term199.getClass(), "jsType", null);
        setField(term199, term199.getClass(), "parent", null);
        setField(term179, term179.getClass(), "first", term199);
        setField(term179, term179.getClass(), "last", term199);
        setField(term179, term179.getClass(), "propListHead", null);
        setIntField(term179, term179.getClass(), "sourcePosition", 0);
        setField(term179, term179.getClass(), "jsType", null);
        setField(term179, term179.getClass(), "parent", null);
        setField(term177, term177.getClass(), "next", term179);
        setField(term177, term177.getClass(), "first", term183);
        setField(term177, term177.getClass(), "last", term185);
        setField(term177, term177.getClass(), "propListHead", null);
        setIntField(term177, term177.getClass(), "sourcePosition", 0);
        setField(term177, term177.getClass(), "jsType", null);
        setField(term177, term177.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term177;
        try {
            callMethod(klass, "tryReplaceUndefined", argTypes, term175, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


