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

public class DisambiguateProperties_getTypeWithProperty_2010541308225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102562;
     Object term102798;

    public DisambiguateProperties_getTypeWithProperty_2010541308225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term102562 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties"));
        Object term102696 = newInstance(Class.forName("com.google.javascript.jscomp.DisambiguateProperties$JSTypeSystem"));
        setField(term102562, term102562.getClass(), "typeSystem", term102696);
        term102798 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamespaceType"));
        Object term102904 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplatizedType"));
        Object term102996 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term102904, term102904.getClass(), "referencedType", term102996);
        setField(term102798, term102798.getClass(), "referencedType", term102904);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DisambiguateProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term102798;
        try {
            callMethod(klass, "getTypeWithProperty", argTypes, term102562, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


