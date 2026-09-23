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

public class ZoneInfoCompiler_compile_151406476128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term171349;
     Object term171519;
     Object term171507;

    public ZoneInfoCompiler_compile_151406476128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term171401 = new ArrayList();
        ArrayList term171453 = new ArrayList();
        term171349 = newInstance(Class.forName("org.joda.time.tz.ZoneInfoCompiler"));
        setField(term171349, term171349.getClass(), "iZones", term171401);
        setField(term171349, term171349.getClass(), "iLinks", term171453);
        ArrayList term171520 = new ArrayList();
        ArrayList term171522 = new ArrayList();
        term171519 = newInstance(Class.forName("org.joda.time.tz.ZoneInfoCompiler"));
        setField(term171519, term171519.getClass(), "iRuleSets", null);
        setField(term171519, term171519.getClass(), "iZones", term171520);
        setField(term171519, term171519.getClass(), "iLinks", term171522);
        term171507 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term171507, term171507.getClass(), "comparator", null);
        setField(term171507, term171507.getClass(), "root", null);
        setIntField(term171507, term171507.getClass(), "size", 0);
        setIntField(term171507, term171507.getClass(), "modCount", 0);
        setField(term171507, term171507.getClass(), "entrySet", null);
        setField(term171507, term171507.getClass(), "navigableKeySet", null);
        setField(term171507, term171507.getClass(), "descendingMap", null);
        setField(term171507, term171507.getClass(), "keySet", null);
        setField(term171507, term171507.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.tz.ZoneInfoCompiler");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.File");
        argTypes[1] = Array.newInstance(Class.forName("java.io.File"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object retValue = callMethod(klass, "compile", argTypes, term171349, args);
        assertTrue(recursiveEquals(term171349, term171519));
        assertTrue(recursiveEquals(retValue, term171507));
    }

};


