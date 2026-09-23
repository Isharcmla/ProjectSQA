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

public class UnreachableCodeElimination_process_13016735033 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3;
     Object term6;
     Object term33;

    public UnreachableCodeElimination_process_13016735033() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3 = newInstance(Class.forName("com.google.javascript.jscomp.UnreachableCodeElimination"));
        setField(term3, term3.getClass(), "compiler", null);
        setBooleanField(term3, term3.getClass(), "removeNoOpStatements", false);
        setBooleanField(term3, term3.getClass(), "codeChanged", false);
        term6 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term6, term6.getClass(), "type", 568599855);
        setIntField(term8, term8.getClass(), "type", 1162663216);
        setIntField(term10, term10.getClass(), "type", 1484323161);
        setIntField(term12, term12.getClass(), "type", 391863371);
        setIntField(term14, term14.getClass(), "type", -1922583790);
        setField(term14, term14.getClass(), "next", null);
        setField(term14, term14.getClass(), "first", null);
        setField(term14, term14.getClass(), "last", null);
        setField(term14, term14.getClass(), "propListHead", null);
        setIntField(term14, term14.getClass(), "sourcePosition", 0);
        setField(term14, term14.getClass(), "jsType", null);
        setField(term14, term14.getClass(), "parent", null);
        setField(term12, term12.getClass(), "next", term14);
        setIntField(term17, term17.getClass(), "type", -616727354);
        setField(term17, term17.getClass(), "next", null);
        setField(term17, term17.getClass(), "first", null);
        setField(term17, term17.getClass(), "last", term14);
        setField(term17, term17.getClass(), "propListHead", null);
        setIntField(term17, term17.getClass(), "sourcePosition", 0);
        setField(term17, term17.getClass(), "jsType", null);
        setField(term17, term17.getClass(), "parent", null);
        setField(term12, term12.getClass(), "first", term17);
        setField(term12, term12.getClass(), "last", term10);
        setField(term12, term12.getClass(), "propListHead", null);
        setIntField(term12, term12.getClass(), "sourcePosition", 0);
        setField(term12, term12.getClass(), "jsType", null);
        setField(term12, term12.getClass(), "parent", null);
        setField(term10, term10.getClass(), "next", term12);
        setField(term10, term10.getClass(), "first", term14);
        setIntField(term21, term21.getClass(), "type", -2038273078);
        setIntField(term23, term23.getClass(), "type", 1227103734);
        setField(term23, term23.getClass(), "next", null);
        setField(term23, term23.getClass(), "first", term17);
        setField(term23, term23.getClass(), "last", term12);
        setField(term23, term23.getClass(), "propListHead", null);
        setIntField(term23, term23.getClass(), "sourcePosition", 0);
        setField(term23, term23.getClass(), "jsType", null);
        setField(term23, term23.getClass(), "parent", null);
        setField(term21, term21.getClass(), "next", term23);
        setField(term21, term21.getClass(), "first", term8);
        setField(term21, term21.getClass(), "last", term8);
        setField(term21, term21.getClass(), "propListHead", null);
        setIntField(term21, term21.getClass(), "sourcePosition", 0);
        setField(term21, term21.getClass(), "jsType", null);
        setField(term21, term21.getClass(), "parent", null);
        setField(term10, term10.getClass(), "last", term21);
        setField(term10, term10.getClass(), "propListHead", null);
        setIntField(term10, term10.getClass(), "sourcePosition", 0);
        setField(term10, term10.getClass(), "jsType", null);
        setField(term10, term10.getClass(), "parent", null);
        setField(term8, term8.getClass(), "next", term10);
        setIntField(term28, term28.getClass(), "type", -1339778481);
        setField(term28, term28.getClass(), "next", term21);
        setField(term28, term28.getClass(), "first", term23);
        setField(term28, term28.getClass(), "last", term6);
        setField(term28, term28.getClass(), "propListHead", null);
        setIntField(term28, term28.getClass(), "sourcePosition", 0);
        setField(term28, term28.getClass(), "jsType", null);
        setField(term28, term28.getClass(), "parent", null);
        setField(term8, term8.getClass(), "first", term28);
        setField(term8, term8.getClass(), "last", term28);
        setField(term8, term8.getClass(), "propListHead", null);
        setIntField(term8, term8.getClass(), "sourcePosition", 0);
        setField(term8, term8.getClass(), "jsType", null);
        setField(term8, term8.getClass(), "parent", null);
        setField(term6, term6.getClass(), "next", term8);
        setField(term6, term6.getClass(), "first", term12);
        setField(term6, term6.getClass(), "last", term14);
        setField(term6, term6.getClass(), "propListHead", null);
        setIntField(term6, term6.getClass(), "sourcePosition", 0);
        setField(term6, term6.getClass(), "jsType", null);
        setField(term6, term6.getClass(), "parent", null);
        term33 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term39 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term41 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term44 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term50 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term55 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term33, term33.getClass(), "type", 1725571209);
        setIntField(term35, term35.getClass(), "type", -522618178);
        setIntField(term37, term37.getClass(), "type", 1134449235);
        setIntField(term39, term39.getClass(), "type", -883034806);
        setIntField(term41, term41.getClass(), "type", 1585847225);
        setField(term41, term41.getClass(), "next", null);
        setField(term41, term41.getClass(), "first", null);
        setField(term41, term41.getClass(), "last", null);
        setField(term41, term41.getClass(), "propListHead", null);
        setIntField(term41, term41.getClass(), "sourcePosition", 0);
        setField(term41, term41.getClass(), "jsType", null);
        setField(term41, term41.getClass(), "parent", null);
        setField(term39, term39.getClass(), "next", term41);
        setIntField(term44, term44.getClass(), "type", 597278769);
        setField(term44, term44.getClass(), "next", null);
        setField(term44, term44.getClass(), "first", null);
        setField(term44, term44.getClass(), "last", term41);
        setField(term44, term44.getClass(), "propListHead", null);
        setIntField(term44, term44.getClass(), "sourcePosition", 0);
        setField(term44, term44.getClass(), "jsType", null);
        setField(term44, term44.getClass(), "parent", null);
        setField(term39, term39.getClass(), "first", term44);
        setField(term39, term39.getClass(), "last", term37);
        setField(term39, term39.getClass(), "propListHead", null);
        setIntField(term39, term39.getClass(), "sourcePosition", 0);
        setField(term39, term39.getClass(), "jsType", null);
        setField(term39, term39.getClass(), "parent", null);
        setField(term37, term37.getClass(), "next", term39);
        setField(term37, term37.getClass(), "first", term41);
        setIntField(term48, term48.getClass(), "type", -1456670397);
        setIntField(term50, term50.getClass(), "type", 1622346318);
        setField(term50, term50.getClass(), "next", null);
        setField(term50, term50.getClass(), "first", term44);
        setField(term50, term50.getClass(), "last", term39);
        setField(term50, term50.getClass(), "propListHead", null);
        setIntField(term50, term50.getClass(), "sourcePosition", 0);
        setField(term50, term50.getClass(), "jsType", null);
        setField(term50, term50.getClass(), "parent", null);
        setField(term48, term48.getClass(), "next", term50);
        setField(term48, term48.getClass(), "first", term35);
        setField(term48, term48.getClass(), "last", term35);
        setField(term48, term48.getClass(), "propListHead", null);
        setIntField(term48, term48.getClass(), "sourcePosition", 0);
        setField(term48, term48.getClass(), "jsType", null);
        setField(term48, term48.getClass(), "parent", null);
        setField(term37, term37.getClass(), "last", term48);
        setField(term37, term37.getClass(), "propListHead", null);
        setIntField(term37, term37.getClass(), "sourcePosition", 0);
        setField(term37, term37.getClass(), "jsType", null);
        setField(term37, term37.getClass(), "parent", null);
        setField(term35, term35.getClass(), "next", term37);
        setIntField(term55, term55.getClass(), "type", 1048535127);
        setField(term55, term55.getClass(), "next", term48);
        setField(term55, term55.getClass(), "first", term50);
        setField(term55, term55.getClass(), "last", term33);
        setField(term55, term55.getClass(), "propListHead", null);
        setIntField(term55, term55.getClass(), "sourcePosition", 0);
        setField(term55, term55.getClass(), "jsType", null);
        setField(term55, term55.getClass(), "parent", null);
        setField(term35, term35.getClass(), "first", term55);
        setField(term35, term35.getClass(), "last", term55);
        setField(term35, term35.getClass(), "propListHead", null);
        setIntField(term35, term35.getClass(), "sourcePosition", 0);
        setField(term35, term35.getClass(), "jsType", null);
        setField(term35, term35.getClass(), "parent", null);
        setField(term33, term33.getClass(), "next", term35);
        setField(term33, term33.getClass(), "first", term39);
        setField(term33, term33.getClass(), "last", term41);
        setField(term33, term33.getClass(), "propListHead", null);
        setIntField(term33, term33.getClass(), "sourcePosition", 0);
        setField(term33, term33.getClass(), "jsType", null);
        setField(term33, term33.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.UnreachableCodeElimination");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term6;
        args[1] = term33;
        try {
            callMethod(klass, "process", argTypes, term3, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


