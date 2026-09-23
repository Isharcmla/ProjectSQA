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

public class PeepholeSubstituteAlternateSyntax_tryRemoveRepeatedStatements_176545266168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term627;
     Object term630;

    public PeepholeSubstituteAlternateSyntax_tryRemoveRepeatedStatements_176545266168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term627 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term627, term627.getClass(), "late", true);
        setIntField(term627, term627.getClass(), "STRING_SPLIT_OVERHEAD", 1270666529);
        setField(term627, term627.getClass(), "compiler", null);
        term630 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term632 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term634 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term636 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term638 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term641 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term645 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term647 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term652 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term630, term630.getClass(), "type", -1146679443);
        setIntField(term632, term632.getClass(), "type", -860131894);
        setIntField(term634, term634.getClass(), "type", -1022990421);
        setIntField(term636, term636.getClass(), "type", 1045547089);
        setIntField(term638, term638.getClass(), "type", -1122880881);
        setField(term638, term638.getClass(), "next", null);
        setField(term638, term638.getClass(), "first", null);
        setField(term638, term638.getClass(), "last", null);
        setField(term638, term638.getClass(), "propListHead", null);
        setIntField(term638, term638.getClass(), "sourcePosition", 0);
        setField(term638, term638.getClass(), "jsType", null);
        setField(term638, term638.getClass(), "parent", null);
        setField(term636, term636.getClass(), "next", term638);
        setIntField(term641, term641.getClass(), "type", -542712742);
        setField(term641, term641.getClass(), "next", null);
        setField(term641, term641.getClass(), "first", null);
        setField(term641, term641.getClass(), "last", term638);
        setField(term641, term641.getClass(), "propListHead", null);
        setIntField(term641, term641.getClass(), "sourcePosition", 0);
        setField(term641, term641.getClass(), "jsType", null);
        setField(term641, term641.getClass(), "parent", null);
        setField(term636, term636.getClass(), "first", term641);
        setField(term636, term636.getClass(), "last", term634);
        setField(term636, term636.getClass(), "propListHead", null);
        setIntField(term636, term636.getClass(), "sourcePosition", 0);
        setField(term636, term636.getClass(), "jsType", null);
        setField(term636, term636.getClass(), "parent", null);
        setField(term634, term634.getClass(), "next", term636);
        setField(term634, term634.getClass(), "first", term638);
        setIntField(term645, term645.getClass(), "type", -1111249833);
        setIntField(term647, term647.getClass(), "type", -1692331299);
        setField(term647, term647.getClass(), "next", null);
        setField(term647, term647.getClass(), "first", term641);
        setField(term647, term647.getClass(), "last", term636);
        setField(term647, term647.getClass(), "propListHead", null);
        setIntField(term647, term647.getClass(), "sourcePosition", 0);
        setField(term647, term647.getClass(), "jsType", null);
        setField(term647, term647.getClass(), "parent", null);
        setField(term645, term645.getClass(), "next", term647);
        setField(term645, term645.getClass(), "first", term632);
        setField(term645, term645.getClass(), "last", term632);
        setField(term645, term645.getClass(), "propListHead", null);
        setIntField(term645, term645.getClass(), "sourcePosition", 0);
        setField(term645, term645.getClass(), "jsType", null);
        setField(term645, term645.getClass(), "parent", null);
        setField(term634, term634.getClass(), "last", term645);
        setField(term634, term634.getClass(), "propListHead", null);
        setIntField(term634, term634.getClass(), "sourcePosition", 0);
        setField(term634, term634.getClass(), "jsType", null);
        setField(term634, term634.getClass(), "parent", null);
        setField(term632, term632.getClass(), "next", term634);
        setIntField(term652, term652.getClass(), "type", 479531250);
        setField(term652, term652.getClass(), "next", term645);
        setField(term652, term652.getClass(), "first", term647);
        setField(term652, term652.getClass(), "last", term630);
        setField(term652, term652.getClass(), "propListHead", null);
        setIntField(term652, term652.getClass(), "sourcePosition", 0);
        setField(term652, term652.getClass(), "jsType", null);
        setField(term652, term652.getClass(), "parent", null);
        setField(term632, term632.getClass(), "first", term652);
        setField(term632, term632.getClass(), "last", term652);
        setField(term632, term632.getClass(), "propListHead", null);
        setIntField(term632, term632.getClass(), "sourcePosition", 0);
        setField(term632, term632.getClass(), "jsType", null);
        setField(term632, term632.getClass(), "parent", null);
        setField(term630, term630.getClass(), "next", term632);
        setField(term630, term630.getClass(), "first", term636);
        setField(term630, term630.getClass(), "last", term638);
        setField(term630, term630.getClass(), "propListHead", null);
        setIntField(term630, term630.getClass(), "sourcePosition", 0);
        setField(term630, term630.getClass(), "jsType", null);
        setField(term630, term630.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term630;
        try {
            callMethod(klass, "tryRemoveRepeatedStatements", argTypes, term627, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


