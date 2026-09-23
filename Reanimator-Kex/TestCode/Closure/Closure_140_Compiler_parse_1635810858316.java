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
import java.lang.String;

public class Compiler_parse_1635810858316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1308492;

    public Compiler_parse_1635810858316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2553793 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$DevMode");
        Field term2553792 = ((Class) term2553793).getDeclaredField((String) "OFF");
        ((Field) term2553792).setAccessible(true);
        Object enum1971 = ((Field) term2553792).get((Object) null);
        term1308492 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term1308586 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        Object term1308804 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1308586, term1308586.getClass(), "devMode", enum1971);
        setField(term1308492, term1308492.getClass(), "options", term1308586);
        setField(term1308804, term1308804.getClass(), "first", null);
        setField(term1308804, term1308804.getClass(), "last", null);
        setField(term1308492, term1308492.getClass(), "externsRoot", term1308804);
        setField(term1308492, term1308492.getClass(), "jsRoot", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "parse", argTypes, term1308492, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


