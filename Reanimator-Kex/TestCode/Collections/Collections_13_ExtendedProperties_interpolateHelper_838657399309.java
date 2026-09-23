package org.apache.commons.collections;

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
import static org.apache.commons.collections.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections.EqualityUtils.*;
import java.util.ArrayList;

public class ExtendedProperties_interpolateHelper_838657399309 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116284;
     Object term116374;
     Object term116703;
     Object term116706;

    public ExtendedProperties_interpolateHelper_838657399309() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term116284 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        term116374 = new ArrayList();
        term116703 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term116703, term116703.getClass(), "defaults", null);
        setField(term116703, term116703.getClass(), "file", null);
        setField(term116703, term116703.getClass(), "basePath", null);
        setField(term116703, term116703.getClass(), "fileSeparator", null);
        setBooleanField(term116703, term116703.getClass(), "isInitialized", false);
        setField(term116703, term116703.getClass(), "includePropertyName", null);
        setField(term116703, term116703.getClass(), "keysAsListed", null);
        setField(term116703, term116703.getClass(), "table", null);
        setIntField(term116703, term116703.getClass(), "count", 0);
        setIntField(term116703, term116703.getClass(), "threshold", 0);
        setFloatField(term116703, term116703.getClass(), "loadFactor", 0.0F);
        setIntField(term116703, term116703.getClass(), "modCount", 0);
        setField(term116703, term116703.getClass(), "keySet", null);
        setField(term116703, term116703.getClass(), "entrySet", null);
        setField(term116703, term116703.getClass(), "values", null);
        term116706 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term116374;
        Object retValue = callMethod(klass, "interpolateHelper", argTypes, term116284, args);
        assertTrue(recursiveEquals(term116284, term116703));
        assertTrue(recursiveEquals(term116374, term116706));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


