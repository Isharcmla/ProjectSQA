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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class Compiler_initOptions_1057247739163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term884942;
     Object term885130;

    public Compiler_initOptions_1057247739163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term884942 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term885036 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        setField(term884942, term884942.getClass(), "options", term885036);
        setField(term884942, term884942.getClass(), "errorManager", null);
        setField(term884942, term884942.getClass(), "outStream", null);
        Class<? extends Object> term885686 = Class.forName((String) "com.google.javascript.jscomp.ErrorFormat");
        Field term885685 = ((Class) term885686).getDeclaredField((String) "SINGLELINE");
        ((Field) term885685).setAccessible(true);
        Object enum2024 = ((Field) term885685).get((Object) null);
        term885130 = newInstance(Class.forName("com.google.javascript.jscomp.CompilerOptions"));
        Object term885362 = newInstance(Class.forName("com.google.javascript.jscomp.ComposeWarningsGuard"));
        Object term885402 = newInstance(Class.forName("java.util.TreeSet"));
        setBooleanField(term885130, term885130.getClass(), "colorizeErrorOutput", false);
        setField(term885130, term885130.getClass(), "errorFormat", enum2024);
        setField(term885362, term885362.getClass(), "guards", term885402);
        setField(term885130, term885130.getClass(), "warningsGuard", term885362);
        Object term885496 = newInstance(Class.forName("com.google.javascript.jscomp.DiagnosticGroup"));
        Object term885592 = newInstance(Class.forName("com.google.common.collect.RegularImmutableSet"));
        Object[] term884854 = (Object[]) newArray("java.lang.Object", 512);
        Object term885684 = newInstance(Class.forName("com.google.javascript.jscomp.DiagnosticType"));
        setElement(term884854, 0, term885684);
        setField(term885592, term885592.getClass(), "elements", term884854);
        setField(term885496, term885496.getClass(), "types", term885592);
        setField(null, Class.forName("com.google.javascript.jscomp.DiagnosticGroups"), "CHECK_TYPES", term885496);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Object[] args = new Object[1];
        args[0] = term885130;
        callMethod(klass, "initOptions", argTypes, term884942, args);
    }

};


