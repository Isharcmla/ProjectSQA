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

public class InlineObjectLiterals_process_5984448093 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;
     Object term29;

    public InlineObjectLiterals_process_5984448093() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.google.javascript.jscomp.InlineObjectLiterals"));
        setField(term1, term1.getClass(), "compiler", null);
        setField(term1, term1.getClass(), "safeNameIdSupplier", null);
        term2 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2, term2.getClass(), "type", 568599855);
        setIntField(term4, term4.getClass(), "type", 1162663216);
        setIntField(term6, term6.getClass(), "type", 1484323161);
        setIntField(term8, term8.getClass(), "type", 391863371);
        setIntField(term10, term10.getClass(), "type", -1922583790);
        setField(term10, term10.getClass(), "next", null);
        setField(term10, term10.getClass(), "first", null);
        setField(term10, term10.getClass(), "last", null);
        setField(term10, term10.getClass(), "propListHead", null);
        setIntField(term10, term10.getClass(), "sourcePosition", 0);
        setField(term10, term10.getClass(), "jsType", null);
        setField(term10, term10.getClass(), "parent", null);
        setField(term8, term8.getClass(), "next", term10);
        setIntField(term13, term13.getClass(), "type", -616727354);
        setField(term13, term13.getClass(), "next", null);
        setField(term13, term13.getClass(), "first", null);
        setField(term13, term13.getClass(), "last", term10);
        setField(term13, term13.getClass(), "propListHead", null);
        setIntField(term13, term13.getClass(), "sourcePosition", 0);
        setField(term13, term13.getClass(), "jsType", null);
        setField(term13, term13.getClass(), "parent", null);
        setField(term8, term8.getClass(), "first", term13);
        setField(term8, term8.getClass(), "last", term6);
        setField(term8, term8.getClass(), "propListHead", null);
        setIntField(term8, term8.getClass(), "sourcePosition", 0);
        setField(term8, term8.getClass(), "jsType", null);
        setField(term8, term8.getClass(), "parent", null);
        setField(term6, term6.getClass(), "next", term8);
        setField(term6, term6.getClass(), "first", term10);
        setIntField(term17, term17.getClass(), "type", -2038273078);
        setIntField(term19, term19.getClass(), "type", 1227103734);
        setField(term19, term19.getClass(), "next", null);
        setField(term19, term19.getClass(), "first", term13);
        setField(term19, term19.getClass(), "last", term8);
        setField(term19, term19.getClass(), "propListHead", null);
        setIntField(term19, term19.getClass(), "sourcePosition", 0);
        setField(term19, term19.getClass(), "jsType", null);
        setField(term19, term19.getClass(), "parent", null);
        setField(term17, term17.getClass(), "next", term19);
        setField(term17, term17.getClass(), "first", term4);
        setField(term17, term17.getClass(), "last", term4);
        setField(term17, term17.getClass(), "propListHead", null);
        setIntField(term17, term17.getClass(), "sourcePosition", 0);
        setField(term17, term17.getClass(), "jsType", null);
        setField(term17, term17.getClass(), "parent", null);
        setField(term6, term6.getClass(), "last", term17);
        setField(term6, term6.getClass(), "propListHead", null);
        setIntField(term6, term6.getClass(), "sourcePosition", 0);
        setField(term6, term6.getClass(), "jsType", null);
        setField(term6, term6.getClass(), "parent", null);
        setField(term4, term4.getClass(), "next", term6);
        setIntField(term24, term24.getClass(), "type", -1339778481);
        setField(term24, term24.getClass(), "next", term17);
        setField(term24, term24.getClass(), "first", term19);
        setField(term24, term24.getClass(), "last", term2);
        setField(term24, term24.getClass(), "propListHead", null);
        setIntField(term24, term24.getClass(), "sourcePosition", 0);
        setField(term24, term24.getClass(), "jsType", null);
        setField(term24, term24.getClass(), "parent", null);
        setField(term4, term4.getClass(), "first", term24);
        setField(term4, term4.getClass(), "last", term24);
        setField(term4, term4.getClass(), "propListHead", null);
        setIntField(term4, term4.getClass(), "sourcePosition", 0);
        setField(term4, term4.getClass(), "jsType", null);
        setField(term4, term4.getClass(), "parent", null);
        setField(term2, term2.getClass(), "next", term4);
        setField(term2, term2.getClass(), "first", term8);
        setField(term2, term2.getClass(), "last", term10);
        setField(term2, term2.getClass(), "propListHead", null);
        setIntField(term2, term2.getClass(), "sourcePosition", 0);
        setField(term2, term2.getClass(), "jsType", null);
        setField(term2, term2.getClass(), "parent", null);
        term29 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term33 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term40 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term44 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term46 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term51 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29, term29.getClass(), "type", 1725571209);
        setIntField(term31, term31.getClass(), "type", -522618178);
        setIntField(term33, term33.getClass(), "type", 1134449235);
        setIntField(term35, term35.getClass(), "type", -883034806);
        setIntField(term37, term37.getClass(), "type", 1585847225);
        setField(term37, term37.getClass(), "next", null);
        setField(term37, term37.getClass(), "first", null);
        setField(term37, term37.getClass(), "last", null);
        setField(term37, term37.getClass(), "propListHead", null);
        setIntField(term37, term37.getClass(), "sourcePosition", 0);
        setField(term37, term37.getClass(), "jsType", null);
        setField(term37, term37.getClass(), "parent", null);
        setField(term35, term35.getClass(), "next", term37);
        setIntField(term40, term40.getClass(), "type", 597278769);
        setField(term40, term40.getClass(), "next", null);
        setField(term40, term40.getClass(), "first", null);
        setField(term40, term40.getClass(), "last", term37);
        setField(term40, term40.getClass(), "propListHead", null);
        setIntField(term40, term40.getClass(), "sourcePosition", 0);
        setField(term40, term40.getClass(), "jsType", null);
        setField(term40, term40.getClass(), "parent", null);
        setField(term35, term35.getClass(), "first", term40);
        setField(term35, term35.getClass(), "last", term33);
        setField(term35, term35.getClass(), "propListHead", null);
        setIntField(term35, term35.getClass(), "sourcePosition", 0);
        setField(term35, term35.getClass(), "jsType", null);
        setField(term35, term35.getClass(), "parent", null);
        setField(term33, term33.getClass(), "next", term35);
        setField(term33, term33.getClass(), "first", term37);
        setIntField(term44, term44.getClass(), "type", -1456670397);
        setIntField(term46, term46.getClass(), "type", 1622346318);
        setField(term46, term46.getClass(), "next", null);
        setField(term46, term46.getClass(), "first", term40);
        setField(term46, term46.getClass(), "last", term35);
        setField(term46, term46.getClass(), "propListHead", null);
        setIntField(term46, term46.getClass(), "sourcePosition", 0);
        setField(term46, term46.getClass(), "jsType", null);
        setField(term46, term46.getClass(), "parent", null);
        setField(term44, term44.getClass(), "next", term46);
        setField(term44, term44.getClass(), "first", term31);
        setField(term44, term44.getClass(), "last", term31);
        setField(term44, term44.getClass(), "propListHead", null);
        setIntField(term44, term44.getClass(), "sourcePosition", 0);
        setField(term44, term44.getClass(), "jsType", null);
        setField(term44, term44.getClass(), "parent", null);
        setField(term33, term33.getClass(), "last", term44);
        setField(term33, term33.getClass(), "propListHead", null);
        setIntField(term33, term33.getClass(), "sourcePosition", 0);
        setField(term33, term33.getClass(), "jsType", null);
        setField(term33, term33.getClass(), "parent", null);
        setField(term31, term31.getClass(), "next", term33);
        setIntField(term51, term51.getClass(), "type", 1048535127);
        setField(term51, term51.getClass(), "next", term44);
        setField(term51, term51.getClass(), "first", term46);
        setField(term51, term51.getClass(), "last", term29);
        setField(term51, term51.getClass(), "propListHead", null);
        setIntField(term51, term51.getClass(), "sourcePosition", 0);
        setField(term51, term51.getClass(), "jsType", null);
        setField(term51, term51.getClass(), "parent", null);
        setField(term31, term31.getClass(), "first", term51);
        setField(term31, term31.getClass(), "last", term51);
        setField(term31, term31.getClass(), "propListHead", null);
        setIntField(term31, term31.getClass(), "sourcePosition", 0);
        setField(term31, term31.getClass(), "jsType", null);
        setField(term31, term31.getClass(), "parent", null);
        setField(term29, term29.getClass(), "next", term31);
        setField(term29, term29.getClass(), "first", term35);
        setField(term29, term29.getClass(), "last", term37);
        setField(term29, term29.getClass(), "propListHead", null);
        setIntField(term29, term29.getClass(), "sourcePosition", 0);
        setField(term29, term29.getClass(), "jsType", null);
        setField(term29, term29.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineObjectLiterals");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term2;
        args[1] = term29;
        try {
            callMethod(klass, "process", argTypes, term1, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


