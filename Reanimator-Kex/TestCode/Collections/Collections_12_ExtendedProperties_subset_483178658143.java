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
import java.lang.Object;

public class ExtendedProperties_subset_483178658143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86287;
     Object term86666;

    public ExtendedProperties_subset_483178658143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term86377 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term86339 = new ArrayList();
        ((ArrayList) term86339).add(term86377);
        term86287 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term86287, term86287.getClass(), "keysAsListed", term86339);
        Object term86669 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term86667 = new ArrayList();
        ((ArrayList) term86667).add(term86669);
        term86666 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term86666, term86666.getClass(), "defaults", null);
        setField(term86666, term86666.getClass(), "file", null);
        setField(term86666, term86666.getClass(), "basePath", null);
        setField(term86666, term86666.getClass(), "fileSeparator", null);
        setBooleanField(term86666, term86666.getClass(), "isInitialized", false);
        setField(term86666, term86666.getClass(), "includePropertyName", null);
        setField(term86666, term86666.getClass(), "keysAsListed", term86667);
        setField(term86666, term86666.getClass(), "table", null);
        setIntField(term86666, term86666.getClass(), "count", 0);
        setIntField(term86666, term86666.getClass(), "threshold", 0);
        setFloatField(term86666, term86666.getClass(), "loadFactor", 0.0F);
        setIntField(term86666, term86666.getClass(), "modCount", 0);
        setField(term86666, term86666.getClass(), "keySet", null);
        setField(term86666, term86666.getClass(), "entrySet", null);
        setField(term86666, term86666.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "subset", argTypes, term86287, args);
        assertTrue(recursiveEquals(term86287, term86666));
        assertTrue(recursiveEquals(retValue, null));
    }

};


