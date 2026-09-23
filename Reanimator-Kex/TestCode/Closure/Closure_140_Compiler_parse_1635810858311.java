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

public class Compiler_parse_1635810858311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1306104;

    public Compiler_parse_1635810858311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2551729 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$DevMode");
        Field term2551728 = ((Class) term2551729).getDeclaredField((String) "EVERY_PASS");
        ((Field) term2551728).setAccessible(true);
        Object enum1970 = ((Field) term2551728).get((Object) null);
        term1306104 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term1306198 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        setField(term1306198, term1306198.getClass(), "devMode", enum1970);
        setField(term1306104, term1306104.getClass(), "options", term1306198);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "parse", argTypes, term1306104, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


