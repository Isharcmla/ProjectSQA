package org.apache.commons.lang;

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
import static org.apache.commons.lang.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.EqualityUtils.*;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Integer;

public class Entities_addEntity_198641744913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term429;
     Object term454;
     Object term567557;

    public Entities_addEntity_198641744913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term432 = new HashMap();
        term429 = newInstance(Class.forName("org.apache.commons.lang.Entities"));
        Object term430 = newInstance(Class.forName("org.apache.commons.lang.Entities$LookupEntityMap"));
        Object term437 = newInstance(Class.forName("org.apache.commons.lang.IntHashMap"));
        Object[] term438 = (Object[]) newArray("org.apache.commons.lang.IntHashMap$Entry", 20);
        setField(term430, term430.getClass(), "lookupTable", null);
        setIntField(term430, term430.getClass(), "LOOKUP_TABLE_SIZE", 256);
        setField(term430, term430.getClass(), "mapNameToValue", term432);
        setField(term437, term437.getClass(), "table", term438);
        setIntField(term437, term437.getClass(), "count", 0);
        setIntField(term437, term437.getClass(), "threshold", 15);
        setFloatField(term437, term437.getClass(), "loadFactor", 0.75F);
        setField(term430, term430.getClass(), "mapValueToName", term437);
        setField(term429, term429.getClass(), "map", term430);
        term454 = new Integer(568599855);
        HashMap term567559 = new HashMap();
        term567557 = newInstance(Class.forName("org.apache.commons.lang.Entities"));
        Object term567558 = newInstance(Class.forName("org.apache.commons.lang.Entities$LookupEntityMap"));
        Object term567563 = newInstance(Class.forName("org.apache.commons.lang.IntHashMap"));
        Object[] term567564 = (Object[]) newArray("org.apache.commons.lang.IntHashMap$Entry", 20);
        Object term567565 = newInstance(Class.forName("org.apache.commons.lang.IntHashMap$Entry"));
        setField(term567558, term567558.getClass(), "lookupTable", null);
        setIntField(term567558, term567558.getClass(), "LOOKUP_TABLE_SIZE", 256);
        setField(term567558, term567558.getClass(), "mapNameToValue", term567559);
        setIntField(term567565, term567565.getClass(), "hash", 568599855);
        setIntField(term567565, term567565.getClass(), "key", 568599855);
        setField(term567565, term567565.getClass(), "value", null);
        setField(term567565, term567565.getClass(), "next", null);
        setElement(term567564, 15, term567565);
        setField(term567563, term567563.getClass(), "table", term567564);
        setIntField(term567563, term567563.getClass(), "count", 1);
        setIntField(term567563, term567563.getClass(), "threshold", 15);
        setFloatField(term567563, term567563.getClass(), "loadFactor", 0.75F);
        setField(term567558, term567558.getClass(), "mapValueToName", term567563);
        setField(term567557, term567557.getClass(), "map", term567558);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.Entities");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = "HyxfbSQYBe";
        args[1] = term454;
        callMethod(klass, "addEntity", argTypes, term429, args);
        assertTrue(recursiveEquals(term429, term567557));
        assertTrue(recursiveEquals(term454, "HyxfbSQYBe"));
    }

};


