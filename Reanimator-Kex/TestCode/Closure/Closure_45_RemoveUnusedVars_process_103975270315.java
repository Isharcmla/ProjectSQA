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

public class RemoveUnusedVars_process_103975270315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7;
     Object term11;
     Object term38;

    public RemoveUnusedVars_process_103975270315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7 = newInstance(Class.forName("com.google.javascript.jscomp.RemoveUnusedVars"));
        setField(term7, term7.getClass(), "compiler", null);
        setField(term7, term7.getClass(), "codingConvention", null);
        setBooleanField(term7, term7.getClass(), "removeGlobals", false);
        setBooleanField(term7, term7.getClass(), "preserveFunctionExpressionNames", true);
        setField(term7, term7.getClass(), "referenced", null);
        setField(term7, term7.getClass(), "maybeUnreferenced", null);
        setField(term7, term7.getClass(), "allFunctionScopes", null);
        setField(term7, term7.getClass(), "assignsByVar", null);
        setField(term7, term7.getClass(), "assignsByNode", null);
        setField(term7, term7.getClass(), "inheritsCalls", null);
        setField(term7, term7.getClass(), "continuations", null);
        setBooleanField(term7, term7.getClass(), "modifyCallSites", false);
        setField(term7, term7.getClass(), "callSiteOptimizer", null);
        term11 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term26 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term33 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term11, term11.getClass(), "type", -1955890973);
        setIntField(term13, term13.getClass(), "type", -2038273078);
        setIntField(term15, term15.getClass(), "type", 1227103734);
        setIntField(term17, term17.getClass(), "type", -1339778481);
        setIntField(term19, term19.getClass(), "type", 1725571209);
        setField(term19, term19.getClass(), "next", null);
        setField(term19, term19.getClass(), "first", null);
        setField(term19, term19.getClass(), "last", null);
        setField(term19, term19.getClass(), "propListHead", null);
        setIntField(term19, term19.getClass(), "sourcePosition", 0);
        setField(term19, term19.getClass(), "jsType", null);
        setField(term19, term19.getClass(), "parent", null);
        setField(term17, term17.getClass(), "next", term19);
        setIntField(term22, term22.getClass(), "type", -522618178);
        setField(term22, term22.getClass(), "next", null);
        setField(term22, term22.getClass(), "first", null);
        setField(term22, term22.getClass(), "last", term19);
        setField(term22, term22.getClass(), "propListHead", null);
        setIntField(term22, term22.getClass(), "sourcePosition", 0);
        setField(term22, term22.getClass(), "jsType", null);
        setField(term22, term22.getClass(), "parent", null);
        setField(term17, term17.getClass(), "first", term22);
        setField(term17, term17.getClass(), "last", term15);
        setField(term17, term17.getClass(), "propListHead", null);
        setIntField(term17, term17.getClass(), "sourcePosition", 0);
        setField(term17, term17.getClass(), "jsType", null);
        setField(term17, term17.getClass(), "parent", null);
        setField(term15, term15.getClass(), "next", term17);
        setField(term15, term15.getClass(), "first", term19);
        setIntField(term26, term26.getClass(), "type", -883034806);
        setIntField(term28, term28.getClass(), "type", 1585847225);
        setField(term28, term28.getClass(), "next", null);
        setField(term28, term28.getClass(), "first", term22);
        setField(term28, term28.getClass(), "last", term17);
        setField(term28, term28.getClass(), "propListHead", null);
        setIntField(term28, term28.getClass(), "sourcePosition", 0);
        setField(term28, term28.getClass(), "jsType", null);
        setField(term28, term28.getClass(), "parent", null);
        setField(term26, term26.getClass(), "next", term28);
        setField(term26, term26.getClass(), "first", term13);
        setField(term26, term26.getClass(), "last", term13);
        setField(term26, term26.getClass(), "propListHead", null);
        setIntField(term26, term26.getClass(), "sourcePosition", 0);
        setField(term26, term26.getClass(), "jsType", null);
        setField(term26, term26.getClass(), "parent", null);
        setField(term15, term15.getClass(), "last", term26);
        setField(term15, term15.getClass(), "propListHead", null);
        setIntField(term15, term15.getClass(), "sourcePosition", 0);
        setField(term15, term15.getClass(), "jsType", null);
        setField(term15, term15.getClass(), "parent", null);
        setField(term13, term13.getClass(), "next", term15);
        setIntField(term33, term33.getClass(), "type", 597278769);
        setField(term33, term33.getClass(), "next", term26);
        setField(term33, term33.getClass(), "first", term28);
        setField(term33, term33.getClass(), "last", term11);
        setField(term33, term33.getClass(), "propListHead", null);
        setIntField(term33, term33.getClass(), "sourcePosition", 0);
        setField(term33, term33.getClass(), "jsType", null);
        setField(term33, term33.getClass(), "parent", null);
        setField(term13, term13.getClass(), "first", term33);
        setField(term13, term13.getClass(), "last", term33);
        setField(term13, term13.getClass(), "propListHead", null);
        setIntField(term13, term13.getClass(), "sourcePosition", 0);
        setField(term13, term13.getClass(), "jsType", null);
        setField(term13, term13.getClass(), "parent", null);
        setField(term11, term11.getClass(), "next", term13);
        setField(term11, term11.getClass(), "first", term17);
        setField(term11, term11.getClass(), "last", term19);
        setField(term11, term11.getClass(), "propListHead", null);
        setIntField(term11, term11.getClass(), "sourcePosition", 0);
        setField(term11, term11.getClass(), "jsType", null);
        setField(term11, term11.getClass(), "parent", null);
        term38 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term40 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term42 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term44 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term46 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term49 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term53 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term55 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term60 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term38, term38.getClass(), "type", -1685132342);
        setIntField(term40, term40.getClass(), "type", -1456670397);
        setIntField(term42, term42.getClass(), "type", 1622346318);
        setIntField(term44, term44.getClass(), "type", 1048535127);
        setIntField(term46, term46.getClass(), "type", -655067527);
        setField(term46, term46.getClass(), "next", null);
        setField(term46, term46.getClass(), "first", null);
        setField(term46, term46.getClass(), "last", null);
        setField(term46, term46.getClass(), "propListHead", null);
        setIntField(term46, term46.getClass(), "sourcePosition", 0);
        setField(term46, term46.getClass(), "jsType", null);
        setField(term46, term46.getClass(), "parent", null);
        setField(term44, term44.getClass(), "next", term46);
        setIntField(term49, term49.getClass(), "type", -6029667);
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
        setIntField(term53, term53.getClass(), "type", -117576464);
        setIntField(term55, term55.getClass(), "type", -1007160944);
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
        setIntField(term60, term60.getClass(), "type", 1135664017);
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
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term11;
        args[1] = term38;
        try {
            callMethod(klass, "process", argTypes, term7, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


