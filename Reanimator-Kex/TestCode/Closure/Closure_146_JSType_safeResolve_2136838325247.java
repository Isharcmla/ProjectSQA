package com.google.javascript.rhino.jstype;

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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.jstype.EqualityUtils.*;
import java.util.ArrayList;

public class JSType_safeResolve_2136838325247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43705;
     Object term43792;
     Object term43760;

    public JSType_safeResolve_2136838325247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term43757 = new ArrayList();
        term43705 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setBooleanField(term43705, term43705.getClass(), "resolved", false);
        setField(term43705, term43705.getClass(), "resolveResult", null);
        setField(term43705, term43705.getClass(), "alternates", term43757);
        ArrayList term43793 = new ArrayList();
        term43792 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term43792, term43792.getClass(), "alternates", term43793);
        setIntField(term43792, term43792.getClass(), "hashcode", 0);
        setBooleanField(term43792, term43792.getClass(), "resolved", true);
        setField(term43792, term43792.getClass(), "resolveResult", term43792);
        setField(term43792, term43792.getClass(), "registry", null);
        ArrayList term43761 = new ArrayList();
        term43760 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term43760, term43760.getClass(), "alternates", term43761);
        setIntField(term43760, term43760.getClass(), "hashcode", 0);
        setBooleanField(term43760, term43760.getClass(), "resolved", true);
        setField(term43760, term43760.getClass(), "resolveResult", term43760);
        setField(term43760, term43760.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Object[] args = new Object[3];
        args[0] = term43705;
        args[1] = null;
        args[2] = null;
        Object retValue = callMethod(klass, "safeResolve", argTypes, null, args);
        assertTrue(recursiveEquals(term43705, term43792));
        assertTrue(recursiveEquals(retValue, term43760));
    }

};


