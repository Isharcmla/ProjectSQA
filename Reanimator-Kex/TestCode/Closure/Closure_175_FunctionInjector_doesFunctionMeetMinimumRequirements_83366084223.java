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
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class FunctionInjector_doesFunctionMeetMinimumRequirements_83366084223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7;
     Object term38;

    public FunctionInjector_doesFunctionMeetMinimumRequirements_83366084223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term10 = new HashMap();
        Set<Object> term2972 =  ((Map) term10).keySet();
        HashSet term9 = new HashSet((Collection<? extends Object>) term2972);
        term7 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionInjector"));
        setField(term7, term7.getClass(), "compiler", null);
        setBooleanField(term7, term7.getClass(), "allowDecomposition", false);
        setField(term7, term7.getClass(), "knownConstants", term9);
        setBooleanField(term7, term7.getClass(), "assumeStrictThis", true);
        setBooleanField(term7, term7.getClass(), "assumeMinimumCapture", true);
        setField(term7, term7.getClass(), "safeNameIdSupplier", null);
        term38 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term40 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term42 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term44 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term46 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term49 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term53 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term55 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term60 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term38, term38.getClass(), "type", 568599855);
        setIntField(term40, term40.getClass(), "type", 1162663216);
        setIntField(term42, term42.getClass(), "type", 1484323161);
        setIntField(term44, term44.getClass(), "type", 391863371);
        setIntField(term46, term46.getClass(), "type", -1922583790);
        setField(term46, term46.getClass(), "next", null);
        setField(term46, term46.getClass(), "first", null);
        setField(term46, term46.getClass(), "last", null);
        setField(term46, term46.getClass(), "propListHead", null);
        setIntField(term46, term46.getClass(), "sourcePosition", 0);
        setField(term46, term46.getClass(), "jsType", null);
        setField(term46, term46.getClass(), "parent", null);
        setField(term44, term44.getClass(), "next", term46);
        setIntField(term49, term49.getClass(), "type", -616727354);
        setField(term49, term49.getClass(), "next", null);
        setField(term49, term49.getClass(), "first", null);
        setField(term49, term49.getClass(), "last", term46);
        setField(term49, term49.getClass(), "propListHead", null);
        setIntField(term49, term49.getClass(), "sourcePosition", 0);
        setField(term49, term49.getClass(), "jsType", null);
        setField(term49, term49.getClass(), "parent", null);
        setField(term44, term44.getClass(), "first", term49);
        setField(term44, term44.getClass(), "last", term42);
        setField(term44, term44.getClass(), "propListHead", null);
        setIntField(term44, term44.getClass(), "sourcePosition", 0);
        setField(term44, term44.getClass(), "jsType", null);
        setField(term44, term44.getClass(), "parent", null);
        setField(term42, term42.getClass(), "next", term44);
        setField(term42, term42.getClass(), "first", term46);
        setIntField(term53, term53.getClass(), "type", -2038273078);
        setIntField(term55, term55.getClass(), "type", 1227103734);
        setField(term55, term55.getClass(), "next", null);
        setField(term55, term55.getClass(), "first", term49);
        setField(term55, term55.getClass(), "last", term44);
        setField(term55, term55.getClass(), "propListHead", null);
        setIntField(term55, term55.getClass(), "sourcePosition", 0);
        setField(term55, term55.getClass(), "jsType", null);
        setField(term55, term55.getClass(), "parent", null);
        setField(term53, term53.getClass(), "next", term55);
        setField(term53, term53.getClass(), "first", term40);
        setField(term53, term53.getClass(), "last", term40);
        setField(term53, term53.getClass(), "propListHead", null);
        setIntField(term53, term53.getClass(), "sourcePosition", 0);
        setField(term53, term53.getClass(), "jsType", null);
        setField(term53, term53.getClass(), "parent", null);
        setField(term42, term42.getClass(), "last", term53);
        setField(term42, term42.getClass(), "propListHead", null);
        setIntField(term42, term42.getClass(), "sourcePosition", 0);
        setField(term42, term42.getClass(), "jsType", null);
        setField(term42, term42.getClass(), "parent", null);
        setField(term40, term40.getClass(), "next", term42);
        setIntField(term60, term60.getClass(), "type", -1339778481);
        setField(term60, term60.getClass(), "next", term53);
        setField(term60, term60.getClass(), "first", term55);
        setField(term60, term60.getClass(), "last", term38);
        setField(term60, term60.getClass(), "propListHead", null);
        setIntField(term60, term60.getClass(), "sourcePosition", 0);
        setField(term60, term60.getClass(), "jsType", null);
        setField(term60, term60.getClass(), "parent", null);
        setField(term40, term40.getClass(), "first", term60);
        setField(term40, term40.getClass(), "last", term60);
        setField(term40, term40.getClass(), "propListHead", null);
        setIntField(term40, term40.getClass(), "sourcePosition", 0);
        setField(term40, term40.getClass(), "jsType", null);
        setField(term40, term40.getClass(), "parent", null);
        setField(term38, term38.getClass(), "next", term40);
        setField(term38, term38.getClass(), "first", term44);
        setField(term38, term38.getClass(), "last", term46);
        setField(term38, term38.getClass(), "propListHead", null);
        setIntField(term38, term38.getClass(), "sourcePosition", 0);
        setField(term38, term38.getClass(), "jsType", null);
        setField(term38, term38.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = "EGtDIRbSSb";
        args[1] = term38;
        try {
            callMethod(klass, "doesFunctionMeetMinimumRequirements", argTypes, term7, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


