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
import java.util.HashMap;
import java.lang.Object;

public class AmbiguateProperties_computeRelatedTypes_51687743351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term191598;

    public AmbiguateProperties_computeRelatedTypes_51687743351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term191736 = newInstance(Class.forName("java.lang.Object"));
        HashMap term191646 = new HashMap();
        ((HashMap) term191646).put(term191736, term191736);
        ((HashMap) term191646).put(term191736, term191736);
        ((HashMap) term191646).put(term191736, term191736);
        ((HashMap) term191646).put(term191736, term191736);
        ((HashMap) term191646).put(term191736, term191736);
        ((HashMap) term191646).put(term191736, term191736);
        ((HashMap) term191646).put(term191736, term191736);
        ((HashMap) term191646).put(term191736, term191736);
        ((HashMap) term191646).put(term191736, term191736);
        term191598 = newInstance(Class.forName("com.google.javascript.jscomp.AmbiguateProperties"));
        Object term191838 = newInstance(Class.forName("com.google.common.collect.Maps$UnmodifiableBiMap"));
        setField(term191598, term191598.getClass(), "relatedBitsets", term191646);
        setField(term191598, term191598.getClass(), "intForType", term191838);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.AmbiguateProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "computeRelatedTypes", argTypes, term191598, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


