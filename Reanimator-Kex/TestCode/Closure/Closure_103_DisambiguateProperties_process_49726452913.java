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

public class DisambiguateProperties_process_49726452913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14;
     Object term16;
     Object term43;

    public DisambiguateProperties_process_49726452913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        setBooleanField(term14, term14.getClass(), "showInvalidationWarnings", false);
        setField(term14, term14.getClass(), "compiler", null);
        setField(term14, term14.getClass(), "typeSystem", null);
        setField(term14, term14.getClass(), "properties", null);
        term16 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term26 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term33 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term39 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term16, term16.getClass(), "type", -883034806);
        setIntField(term18, term18.getClass(), "type", -1456670397);
        setIntField(term20, term20.getClass(), "type", 0);
        setField(term20, term20.getClass(), "next", null);
        setField(term20, term20.getClass(), "first", null);
        setField(term20, term20.getClass(), "last", null);
        setField(term20, term20.getClass(), "propListHead", null);
        setIntField(term20, term20.getClass(), "sourcePosition", 0);
        setField(term20, term20.getClass(), "jsType", null);
        setField(term20, term20.getClass(), "parent", null);
        setField(term18, term18.getClass(), "next", term20);
        setIntField(term23, term23.getClass(), "type", 0);
        setField(term23, term23.getClass(), "next", null);
        setField(term23, term23.getClass(), "first", null);
        setField(term23, term23.getClass(), "last", null);
        setField(term23, term23.getClass(), "propListHead", null);
        setIntField(term23, term23.getClass(), "sourcePosition", 0);
        setField(term23, term23.getClass(), "jsType", null);
        setField(term23, term23.getClass(), "parent", null);
        setField(term18, term18.getClass(), "first", term23);
        setIntField(term26, term26.getClass(), "type", 0);
        setField(term26, term26.getClass(), "next", null);
        setField(term26, term26.getClass(), "first", null);
        setField(term26, term26.getClass(), "last", null);
        setField(term26, term26.getClass(), "propListHead", null);
        setIntField(term26, term26.getClass(), "sourcePosition", 0);
        setField(term26, term26.getClass(), "jsType", null);
        setField(term26, term26.getClass(), "parent", null);
        setField(term18, term18.getClass(), "last", term26);
        setField(term29, term29.getClass(), "next", null);
        setIntField(term29, term29.getClass(), "type", 0);
        setIntField(term29, term29.getClass(), "intValue", 0);
        setField(term29, term29.getClass(), "objectValue", null);
        setField(term18, term18.getClass(), "propListHead", term29);
        setIntField(term18, term18.getClass(), "sourcePosition", -655067527);
        setField(term18, term18.getClass(), "jsType", null);
        setField(term18, term18.getClass(), "parent", null);
        setField(term16, term16.getClass(), "next", term18);
        setIntField(term33, term33.getClass(), "type", 0);
        setField(term33, term33.getClass(), "next", null);
        setField(term33, term33.getClass(), "first", null);
        setField(term33, term33.getClass(), "last", null);
        setField(term33, term33.getClass(), "propListHead", null);
        setIntField(term33, term33.getClass(), "sourcePosition", 0);
        setField(term33, term33.getClass(), "jsType", null);
        setField(term33, term33.getClass(), "parent", null);
        setField(term16, term16.getClass(), "first", term33);
        setIntField(term36, term36.getClass(), "type", 0);
        setField(term36, term36.getClass(), "next", null);
        setField(term36, term36.getClass(), "first", null);
        setField(term36, term36.getClass(), "last", null);
        setField(term36, term36.getClass(), "propListHead", null);
        setIntField(term36, term36.getClass(), "sourcePosition", 0);
        setField(term36, term36.getClass(), "jsType", null);
        setField(term36, term36.getClass(), "parent", null);
        setField(term16, term16.getClass(), "last", term36);
        setField(term39, term39.getClass(), "next", null);
        setIntField(term39, term39.getClass(), "type", 0);
        setIntField(term39, term39.getClass(), "intValue", 0);
        setField(term39, term39.getClass(), "objectValue", null);
        setField(term16, term16.getClass(), "propListHead", term39);
        setIntField(term16, term16.getClass(), "sourcePosition", -6029667);
        setField(term16, term16.getClass(), "jsType", null);
        setField(term16, term16.getClass(), "parent", null);
        term43 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term45 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term50 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term53 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term56 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term60 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term63 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term66 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term43, term43.getClass(), "type", 1135664017);
        setIntField(term45, term45.getClass(), "type", -244121226);
        setIntField(term47, term47.getClass(), "type", 0);
        setField(term47, term47.getClass(), "next", null);
        setField(term47, term47.getClass(), "first", null);
        setField(term47, term47.getClass(), "last", null);
        setField(term47, term47.getClass(), "propListHead", null);
        setIntField(term47, term47.getClass(), "sourcePosition", 0);
        setField(term47, term47.getClass(), "jsType", null);
        setField(term47, term47.getClass(), "parent", null);
        setField(term45, term45.getClass(), "next", term47);
        setIntField(term50, term50.getClass(), "type", 0);
        setField(term50, term50.getClass(), "next", null);
        setField(term50, term50.getClass(), "first", null);
        setField(term50, term50.getClass(), "last", null);
        setField(term50, term50.getClass(), "propListHead", null);
        setIntField(term50, term50.getClass(), "sourcePosition", 0);
        setField(term50, term50.getClass(), "jsType", null);
        setField(term50, term50.getClass(), "parent", null);
        setField(term45, term45.getClass(), "first", term50);
        setIntField(term53, term53.getClass(), "type", 0);
        setField(term53, term53.getClass(), "next", null);
        setField(term53, term53.getClass(), "first", null);
        setField(term53, term53.getClass(), "last", null);
        setField(term53, term53.getClass(), "propListHead", null);
        setIntField(term53, term53.getClass(), "sourcePosition", 0);
        setField(term53, term53.getClass(), "jsType", null);
        setField(term53, term53.getClass(), "parent", null);
        setField(term45, term45.getClass(), "last", term53);
        setField(term56, term56.getClass(), "next", null);
        setIntField(term56, term56.getClass(), "type", 0);
        setIntField(term56, term56.getClass(), "intValue", 0);
        setField(term56, term56.getClass(), "objectValue", null);
        setField(term45, term45.getClass(), "propListHead", term56);
        setIntField(term45, term45.getClass(), "sourcePosition", -73683645);
        setField(term45, term45.getClass(), "jsType", null);
        setField(term45, term45.getClass(), "parent", null);
        setField(term43, term43.getClass(), "next", term45);
        setIntField(term60, term60.getClass(), "type", 0);
        setField(term60, term60.getClass(), "next", null);
        setField(term60, term60.getClass(), "first", null);
        setField(term60, term60.getClass(), "last", null);
        setField(term60, term60.getClass(), "propListHead", null);
        setIntField(term60, term60.getClass(), "sourcePosition", 0);
        setField(term60, term60.getClass(), "jsType", null);
        setField(term60, term60.getClass(), "parent", null);
        setField(term43, term43.getClass(), "first", term60);
        setIntField(term63, term63.getClass(), "type", 0);
        setField(term63, term63.getClass(), "next", null);
        setField(term63, term63.getClass(), "first", null);
        setField(term63, term63.getClass(), "last", null);
        setField(term63, term63.getClass(), "propListHead", null);
        setIntField(term63, term63.getClass(), "sourcePosition", 0);
        setField(term63, term63.getClass(), "jsType", null);
        setField(term63, term63.getClass(), "parent", null);
        setField(term43, term43.getClass(), "last", term63);
        setField(term66, term66.getClass(), "next", null);
        setIntField(term66, term66.getClass(), "type", 0);
        setIntField(term66, term66.getClass(), "intValue", 0);
        setField(term66, term66.getClass(), "objectValue", null);
        setField(term43, term43.getClass(), "propListHead", term66);
        setIntField(term43, term43.getClass(), "sourcePosition", -226514366);
        setField(term43, term43.getClass(), "jsType", null);
        setField(term43, term43.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DisambiguateProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term16;
        args[1] = term43;
        try {
            callMethod(klass, "process", argTypes, term14, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


