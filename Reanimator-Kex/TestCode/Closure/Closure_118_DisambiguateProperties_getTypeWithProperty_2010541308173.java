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

public class DisambiguateProperties_getTypeWithProperty_2010541308173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65882;
     Object term66120;

    public DisambiguateProperties_getTypeWithProperty_2010541308173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65882 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        Object term66016 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties$JSTypeSystem"));
        setField(term65882, term65882.getClass(), "typeSystem", term66016);
        HashMap term66266 = new HashMap();
        term66120 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term66218 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PropertyMap"));
        setField(term66218, term66218.getClass(), "properties", term66266);
        setField(term66120, term66120.getClass(), "properties", term66218);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DisambiguateProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term66120;
        try {
            callMethod(klass, "getTypeWithProperty", argTypes, term65882, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


