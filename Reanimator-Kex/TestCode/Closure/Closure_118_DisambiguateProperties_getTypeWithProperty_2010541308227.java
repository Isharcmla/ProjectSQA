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
import java.util.HashMap;

public class DisambiguateProperties_getTypeWithProperty_2010541308227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103703;
     Object term103941;

    public DisambiguateProperties_getTypeWithProperty_2010541308227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103703 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        Object term103837 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties$JSTypeSystem"));
        setField(term103703, term103703.getClass(), "typeSystem", term103837);
        HashMap term104087 = new HashMap();
        ((HashMap) term104087).put((Object)null, (Object)null);
        ((HashMap) term104087).put((Object)null, (Object)null);
        term103941 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term104039 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PropertyMap"));
        setField(term104039, term104039.getClass(), "properties", term104087);
        setField(term103941, term103941.getClass(), "properties", term104039);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DisambiguateProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term103941;
        try {
            callMethod(klass, "getTypeWithProperty", argTypes, term103703, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


