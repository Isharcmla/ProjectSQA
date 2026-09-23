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
import java.io.IOException;
import static org.joda.time.tz.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;

public class ZoneInfoCompiler_compile_15140647631 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term308;
     Object term322;
     Object term347;

    public ZoneInfoCompiler_compile_15140647631() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term309 = new HashMap();
        ArrayList term314 = new ArrayList();
        ArrayList term318 = new ArrayList();
        term308 = newInstance(Class.forName("org.joda.time.tz.ZoneInfoCompiler"));
        setField(term308, term308.getClass(), "iRuleSets", term309);
        setField(term308, term308.getClass(), "iZones", term314);
        setField(term308, term308.getClass(), "iLinks", term318);
        Class<? extends Object> term58249 = Class.forName((String) "java.io.File$PathStatus");
        Field term58248 = ((Class) term58249).getDeclaredField((String) "INVALID");
        ((Field) term58248).setAccessible(true);
        Object enum1 = ((Field) term58248).get((Object) null);
        term322 = newInstance(Class.forName("java.io.File"));
        setField(term322, term322.getClass(), "path", "aJlieCFVtF");
        setField(term322, term322.getClass(), "status", enum1);
        setIntField(term322, term322.getClass(), "prefixLength", -1922583790);
        setField(term322, term322.getClass(), "filePath", null);
        term347 = (Object[]) newArray("java.io.File", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.tz.ZoneInfoCompiler");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.File");
        argTypes[1] = Array.newInstance(Class.forName("java.io.File"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term322;
        args[1] = term347;
        try {
            callMethod(klass, "compile", argTypes, term308, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


