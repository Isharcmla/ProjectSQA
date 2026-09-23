package org.joda.time.tz;

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
import static org.joda.time.tz.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.joda.time.tz.EqualityUtils.*;
import java.util.ArrayList;
import java.lang.Object;

public class ZoneInfoCompiler_compile_151406476119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111996;
     Object term111849;
     Object term112168;
     Object term112173;
     Object term112155;

    public ZoneInfoCompiler_compile_151406476119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term112048 = new ArrayList();
        ArrayList term112100 = new ArrayList();
        term111996 = newInstance(Class.forName("org.joda.time.tz.ZoneInfoCompiler"));
        setField(term111996, term111996.getClass(), "iZones", term112048);
        setField(term111996, term111996.getClass(), "iLinks", term112100);
        term111849 = (Object[]) newArray("java.io.File", 0);
        ArrayList term112169 = new ArrayList();
        ArrayList term112171 = new ArrayList();
        term112168 = newInstance(Class.forName("org.joda.time.tz.ZoneInfoCompiler"));
        setField(term112168, term112168.getClass(), "iRuleSets", null);
        setField(term112168, term112168.getClass(), "iZones", term112169);
        setField(term112168, term112168.getClass(), "iLinks", term112171);
        term112173 = (Object[]) newArray("java.io.File", 0);
        term112155 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term112155, term112155.getClass(), "comparator", null);
        setField(term112155, term112155.getClass(), "root", null);
        setIntField(term112155, term112155.getClass(), "size", 0);
        setIntField(term112155, term112155.getClass(), "modCount", 0);
        setField(term112155, term112155.getClass(), "entrySet", null);
        setField(term112155, term112155.getClass(), "navigableKeySet", null);
        setField(term112155, term112155.getClass(), "descendingMap", null);
        setField(term112155, term112155.getClass(), "keySet", null);
        setField(term112155, term112155.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.tz.ZoneInfoCompiler");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.File");
        argTypes[1] = Array.newInstance(Class.forName("java.io.File"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term111849;
        Object retValue = callMethod(klass, "compile", argTypes, term111996, args);
        assertTrue(recursiveEquals(term111996, term112168));
        assertTrue(recursiveEquals(term111849, term112173));
        assertTrue(recursiveEquals(retValue, term112155));
    }

};


