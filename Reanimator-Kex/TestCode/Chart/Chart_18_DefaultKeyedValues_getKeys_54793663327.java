package org.jfree.data;

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
import static org.jfree.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jfree.data.EqualityUtils.*;
import java.util.ArrayList;
import java.util.HashMap;

public class DefaultKeyedValues_getKeys_54793663327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61;
     Object term1285;
     Object term1267;

    public DefaultKeyedValues_getKeys_54793663327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term62 = new ArrayList();
        ArrayList term66 = new ArrayList();
        HashMap term70 = new HashMap();
        term61 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues"));
        setField(term61, term61.getClass(), "keys", term62);
        setField(term61, term61.getClass(), "values", term66);
        setField(term61, term61.getClass(), "indexMap", term70);
        ArrayList term1286 = new ArrayList();
        ArrayList term1288 = new ArrayList();
        HashMap term1290 = new HashMap();
        term1285 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues"));
        setField(term1285, term1285.getClass(), "keys", term1286);
        setField(term1285, term1285.getClass(), "values", term1288);
        setField(term1285, term1285.getClass(), "indexMap", term1290);
        term1267 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.DefaultKeyedValues");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getKeys", argTypes, term61, args);
        assertTrue(recursiveEquals(term61, term1285));
        assertTrue(recursiveEquals(retValue, term1267));
    }

};


