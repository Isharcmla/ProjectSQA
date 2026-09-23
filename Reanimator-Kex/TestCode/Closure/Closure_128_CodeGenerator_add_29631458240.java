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
import java.lang.Object;

public class CodeGenerator_add_29631458240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4686;
     Object term4699;

    public CodeGenerator_add_29631458240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4687 = new HashMap();
        term4686 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term4686, term4686.getClass(), "ESCAPED_JS_STRINGS", term4687);
        setField(term4686, term4686.getClass(), "cc", null);
        setField(term4686, term4686.getClass(), "outputCharsetEncoder", null);
        setBooleanField(term4686, term4686.getClass(), "preferSingleQuotes", false);
        setBooleanField(term4686, term4686.getClass(), "trustedStrings", true);
        term4699 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4701 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4703 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4705 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4707 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4710 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4714 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4716 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4721 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4699, term4699.getClass(), "type", 568599855);
        setIntField(term4701, term4701.getClass(), "type", 1162663216);
        setIntField(term4703, term4703.getClass(), "type", 1484323161);
        setIntField(term4705, term4705.getClass(), "type", 391863371);
        setIntField(term4707, term4707.getClass(), "type", -1922583790);
        setField(term4707, term4707.getClass(), "next", null);
        setField(term4707, term4707.getClass(), "first", null);
        setField(term4707, term4707.getClass(), "last", null);
        setField(term4707, term4707.getClass(), "propListHead", null);
        setIntField(term4707, term4707.getClass(), "sourcePosition", 0);
        setField(term4707, term4707.getClass(), "jsType", null);
        setField(term4707, term4707.getClass(), "parent", null);
        setField(term4705, term4705.getClass(), "next", term4707);
        setIntField(term4710, term4710.getClass(), "type", -616727354);
        setField(term4710, term4710.getClass(), "next", null);
        setField(term4710, term4710.getClass(), "first", null);
        setField(term4710, term4710.getClass(), "last", term4707);
        setField(term4710, term4710.getClass(), "propListHead", null);
        setIntField(term4710, term4710.getClass(), "sourcePosition", 0);
        setField(term4710, term4710.getClass(), "jsType", null);
        setField(term4710, term4710.getClass(), "parent", null);
        setField(term4705, term4705.getClass(), "first", term4710);
        setField(term4705, term4705.getClass(), "last", term4703);
        setField(term4705, term4705.getClass(), "propListHead", null);
        setIntField(term4705, term4705.getClass(), "sourcePosition", 0);
        setField(term4705, term4705.getClass(), "jsType", null);
        setField(term4705, term4705.getClass(), "parent", null);
        setField(term4703, term4703.getClass(), "next", term4705);
        setField(term4703, term4703.getClass(), "first", term4707);
        setIntField(term4714, term4714.getClass(), "type", -2038273078);
        setIntField(term4716, term4716.getClass(), "type", 1227103734);
        setField(term4716, term4716.getClass(), "next", null);
        setField(term4716, term4716.getClass(), "first", term4710);
        setField(term4716, term4716.getClass(), "last", term4705);
        setField(term4716, term4716.getClass(), "propListHead", null);
        setIntField(term4716, term4716.getClass(), "sourcePosition", 0);
        setField(term4716, term4716.getClass(), "jsType", null);
        setField(term4716, term4716.getClass(), "parent", null);
        setField(term4714, term4714.getClass(), "next", term4716);
        setField(term4714, term4714.getClass(), "first", term4701);
        setField(term4714, term4714.getClass(), "last", term4701);
        setField(term4714, term4714.getClass(), "propListHead", null);
        setIntField(term4714, term4714.getClass(), "sourcePosition", 0);
        setField(term4714, term4714.getClass(), "jsType", null);
        setField(term4714, term4714.getClass(), "parent", null);
        setField(term4703, term4703.getClass(), "last", term4714);
        setField(term4703, term4703.getClass(), "propListHead", null);
        setIntField(term4703, term4703.getClass(), "sourcePosition", 0);
        setField(term4703, term4703.getClass(), "jsType", null);
        setField(term4703, term4703.getClass(), "parent", null);
        setField(term4701, term4701.getClass(), "next", term4703);
        setIntField(term4721, term4721.getClass(), "type", -1339778481);
        setField(term4721, term4721.getClass(), "next", term4714);
        setField(term4721, term4721.getClass(), "first", term4716);
        setField(term4721, term4721.getClass(), "last", term4699);
        setField(term4721, term4721.getClass(), "propListHead", null);
        setIntField(term4721, term4721.getClass(), "sourcePosition", 0);
        setField(term4721, term4721.getClass(), "jsType", null);
        setField(term4721, term4721.getClass(), "parent", null);
        setField(term4701, term4701.getClass(), "first", term4721);
        setField(term4701, term4701.getClass(), "last", term4721);
        setField(term4701, term4701.getClass(), "propListHead", null);
        setIntField(term4701, term4701.getClass(), "sourcePosition", 0);
        setField(term4701, term4701.getClass(), "jsType", null);
        setField(term4701, term4701.getClass(), "parent", null);
        setField(term4699, term4699.getClass(), "next", term4701);
        setField(term4699, term4699.getClass(), "first", term4705);
        setField(term4699, term4699.getClass(), "last", term4707);
        setField(term4699, term4699.getClass(), "propListHead", null);
        setIntField(term4699, term4699.getClass(), "sourcePosition", 0);
        setField(term4699, term4699.getClass(), "jsType", null);
        setField(term4699, term4699.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4699;
        try {
            callMethod(klass, "add", argTypes, term4686, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


