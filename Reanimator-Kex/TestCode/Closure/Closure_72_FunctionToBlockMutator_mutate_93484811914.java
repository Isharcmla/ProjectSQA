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
import java.lang.Boolean;

public class FunctionToBlockMutator_mutate_93484811914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term14;
     Object term41;
     Object term80;
     Object term82;

    public FunctionToBlockMutator_mutate_93484811914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionToBlockMutator"));
        setField(term1, term1.getClass(), "compiler", null);
        setField(term1, term1.getClass(), "safeNameIdSupplier", null);
        term14 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term31 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term14, term14.getClass(), "type", 391863371);
        setIntField(term16, term16.getClass(), "type", -2038273078);
        setIntField(term18, term18.getClass(), "type", 0);
        setField(term18, term18.getClass(), "next", null);
        setField(term18, term18.getClass(), "first", null);
        setField(term18, term18.getClass(), "last", null);
        setField(term18, term18.getClass(), "propListHead", null);
        setIntField(term18, term18.getClass(), "sourcePosition", 0);
        setField(term18, term18.getClass(), "jsType", null);
        setField(term18, term18.getClass(), "parent", null);
        setField(term16, term16.getClass(), "next", term18);
        setIntField(term21, term21.getClass(), "type", 0);
        setField(term21, term21.getClass(), "next", null);
        setField(term21, term21.getClass(), "first", null);
        setField(term21, term21.getClass(), "last", null);
        setField(term21, term21.getClass(), "propListHead", null);
        setIntField(term21, term21.getClass(), "sourcePosition", 0);
        setField(term21, term21.getClass(), "jsType", null);
        setField(term21, term21.getClass(), "parent", null);
        setField(term16, term16.getClass(), "first", term21);
        setIntField(term24, term24.getClass(), "type", 0);
        setField(term24, term24.getClass(), "next", null);
        setField(term24, term24.getClass(), "first", null);
        setField(term24, term24.getClass(), "last", null);
        setField(term24, term24.getClass(), "propListHead", null);
        setIntField(term24, term24.getClass(), "sourcePosition", 0);
        setField(term24, term24.getClass(), "jsType", null);
        setField(term24, term24.getClass(), "parent", null);
        setField(term16, term16.getClass(), "last", term24);
        setField(term27, term27.getClass(), "next", null);
        setIntField(term27, term27.getClass(), "type", 0);
        setIntField(term27, term27.getClass(), "intValue", 0);
        setField(term27, term27.getClass(), "objectValue", null);
        setField(term16, term16.getClass(), "propListHead", term27);
        setIntField(term16, term16.getClass(), "sourcePosition", 1725571209);
        setField(term16, term16.getClass(), "jsType", null);
        setField(term16, term16.getClass(), "parent", null);
        setField(term14, term14.getClass(), "next", term16);
        setIntField(term31, term31.getClass(), "type", 0);
        setField(term31, term31.getClass(), "next", null);
        setField(term31, term31.getClass(), "first", null);
        setField(term31, term31.getClass(), "last", null);
        setField(term31, term31.getClass(), "propListHead", null);
        setIntField(term31, term31.getClass(), "sourcePosition", 0);
        setField(term31, term31.getClass(), "jsType", null);
        setField(term31, term31.getClass(), "parent", null);
        setField(term14, term14.getClass(), "first", term31);
        setIntField(term34, term34.getClass(), "type", 0);
        setField(term34, term34.getClass(), "next", null);
        setField(term34, term34.getClass(), "first", null);
        setField(term34, term34.getClass(), "last", null);
        setField(term34, term34.getClass(), "propListHead", null);
        setIntField(term34, term34.getClass(), "sourcePosition", 0);
        setField(term34, term34.getClass(), "jsType", null);
        setField(term34, term34.getClass(), "parent", null);
        setField(term14, term14.getClass(), "last", term34);
        setField(term37, term37.getClass(), "next", null);
        setIntField(term37, term37.getClass(), "type", 0);
        setIntField(term37, term37.getClass(), "intValue", 0);
        setField(term37, term37.getClass(), "objectValue", null);
        setField(term14, term14.getClass(), "propListHead", term37);
        setIntField(term14, term14.getClass(), "sourcePosition", -522618178);
        setField(term14, term14.getClass(), "jsType", null);
        setField(term14, term14.getClass(), "parent", null);
        term41 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term43 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term45 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term51 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term54 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term58 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term64 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term41, term41.getClass(), "type", 597278769);
        setIntField(term43, term43.getClass(), "type", 1048535127);
        setIntField(term45, term45.getClass(), "type", 0);
        setField(term45, term45.getClass(), "next", null);
        setField(term45, term45.getClass(), "first", null);
        setField(term45, term45.getClass(), "last", null);
        setField(term45, term45.getClass(), "propListHead", null);
        setIntField(term45, term45.getClass(), "sourcePosition", 0);
        setField(term45, term45.getClass(), "jsType", null);
        setField(term45, term45.getClass(), "parent", null);
        setField(term43, term43.getClass(), "next", term45);
        setIntField(term48, term48.getClass(), "type", 0);
        setField(term48, term48.getClass(), "next", null);
        setField(term48, term48.getClass(), "first", null);
        setField(term48, term48.getClass(), "last", null);
        setField(term48, term48.getClass(), "propListHead", null);
        setIntField(term48, term48.getClass(), "sourcePosition", 0);
        setField(term48, term48.getClass(), "jsType", null);
        setField(term48, term48.getClass(), "parent", null);
        setField(term43, term43.getClass(), "first", term48);
        setIntField(term51, term51.getClass(), "type", 0);
        setField(term51, term51.getClass(), "next", null);
        setField(term51, term51.getClass(), "first", null);
        setField(term51, term51.getClass(), "last", null);
        setField(term51, term51.getClass(), "propListHead", null);
        setIntField(term51, term51.getClass(), "sourcePosition", 0);
        setField(term51, term51.getClass(), "jsType", null);
        setField(term51, term51.getClass(), "parent", null);
        setField(term43, term43.getClass(), "last", term51);
        setField(term54, term54.getClass(), "next", null);
        setIntField(term54, term54.getClass(), "type", 0);
        setIntField(term54, term54.getClass(), "intValue", 0);
        setField(term54, term54.getClass(), "objectValue", null);
        setField(term43, term43.getClass(), "propListHead", term54);
        setIntField(term43, term43.getClass(), "sourcePosition", -2068769794);
        setField(term43, term43.getClass(), "jsType", null);
        setField(term43, term43.getClass(), "parent", null);
        setField(term41, term41.getClass(), "next", term43);
        setIntField(term58, term58.getClass(), "type", 0);
        setField(term58, term58.getClass(), "next", null);
        setField(term58, term58.getClass(), "first", null);
        setField(term58, term58.getClass(), "last", null);
        setField(term58, term58.getClass(), "propListHead", null);
        setIntField(term58, term58.getClass(), "sourcePosition", 0);
        setField(term58, term58.getClass(), "jsType", null);
        setField(term58, term58.getClass(), "parent", null);
        setField(term41, term41.getClass(), "first", term58);
        setIntField(term61, term61.getClass(), "type", 0);
        setField(term61, term61.getClass(), "next", null);
        setField(term61, term61.getClass(), "first", null);
        setField(term61, term61.getClass(), "last", null);
        setField(term61, term61.getClass(), "propListHead", null);
        setIntField(term61, term61.getClass(), "sourcePosition", 0);
        setField(term61, term61.getClass(), "jsType", null);
        setField(term61, term61.getClass(), "parent", null);
        setField(term41, term41.getClass(), "last", term61);
        setField(term64, term64.getClass(), "next", null);
        setIntField(term64, term64.getClass(), "type", 0);
        setIntField(term64, term64.getClass(), "intValue", 0);
        setField(term64, term64.getClass(), "objectValue", null);
        setField(term41, term41.getClass(), "propListHead", term64);
        setIntField(term41, term41.getClass(), "sourcePosition", -117576464);
        setField(term41, term41.getClass(), "jsType", null);
        setField(term41, term41.getClass(), "parent", null);
        term80 = new Boolean(false);
        term82 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionToBlockMutator");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = boolean.class;
        argTypes[5] = boolean.class;
        Object[] args = new Object[6];
        args[0] = "PAEBtnZtTD";
        args[1] = term14;
        args[2] = term41;
        args[3] = "sjlJAEtRrb";
        args[4] = term80;
        args[5] = term82;
        try {
            callMethod(klass, "mutate", argTypes, term1, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


