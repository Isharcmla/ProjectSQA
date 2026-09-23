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
import java.util.HashSet;

public class CompilerOptions_disables_85154331182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term273941;
     Object term274139;

    public CompilerOptions_disables_85154331182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term273941 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        Object term274045 = newInstance(Class.forName("com.google.javascript.jscomp.ComposeWarningsGuard"));
        setField(term273941, term273941.getClass(), "warningsGuard", term274045);
        Object term274325 = newInstance(Class.forName("java.lang.Object"));
        HashSet term274187 = new HashSet();
        ((HashSet) term274187).add((Object)null);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        ((HashSet) term274187).add(term274325);
        term274139 = newInstance(Class.forName("com.google.javascript.jscomp.DiagnosticGroup"));
        setField(term274139, term274139.getClass(), "types", term274187);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.DiagnosticGroup");
        Object[] args = new Object[1];
        args[0] = term274139;
        try {
            callMethod(klass, "disables", argTypes, term273941, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


