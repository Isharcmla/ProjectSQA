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

public class ExtendedProperties_subset_483178658719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1086226;
     Object term1086523;

    public ExtendedProperties_subset_483178658719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1086382 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        ArrayList term1086434 = new ArrayList();
        ArrayList term1086278 = new ArrayList();
        ((ArrayList) term1086278).add(term1086382);
        ((ArrayList) term1086278).add((Object)null);
        ((ArrayList) term1086278).add(term1086434);
        ((ArrayList) term1086278).add((Object)null);
        ((ArrayList) term1086278).add((Object)null);
        ((ArrayList) term1086278).add((Object)null);
        ((ArrayList) term1086278).add((Object)null);
        ((ArrayList) term1086278).add((Object)null);
        ((ArrayList) term1086278).add((Object)null);
        ((ArrayList) term1086278).add((Object)null);
        ((ArrayList) term1086278).add((Object)null);
        ((ArrayList) term1086278).add((Object)null);
        ((ArrayList) term1086278).add((Object)null);
        ((ArrayList) term1086278).add((Object)null);
        ((ArrayList) term1086278).add((Object)null);
        ((ArrayList) term1086278).add((Object)null);
        ((ArrayList) term1086278).add((Object)null);
        term1086226 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term1086226, term1086226.getClass(), "keysAsListed", term1086278);
        Object term1086526 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term1086526, term1086526.getClass(), "defaults", null);
        setField(term1086526, term1086526.getClass(), "file", null);
        setField(term1086526, term1086526.getClass(), "basePath", null);
        setField(term1086526, term1086526.getClass(), "fileSeparator", null);
        setBooleanField(term1086526, term1086526.getClass(), "isInitialized", false);
        setField(term1086526, term1086526.getClass(), "includePropertyName", null);
        setField(term1086526, term1086526.getClass(), "keysAsListed", null);
        setField(term1086526, term1086526.getClass(), "table", null);
        setIntField(term1086526, term1086526.getClass(), "count", 0);
        setIntField(term1086526, term1086526.getClass(), "threshold", 0);
        setFloatField(term1086526, term1086526.getClass(), "loadFactor", 0.0F);
        setIntField(term1086526, term1086526.getClass(), "modCount", 0);
        setField(term1086526, term1086526.getClass(), "keySet", null);
        setField(term1086526, term1086526.getClass(), "entrySet", null);
        setField(term1086526, term1086526.getClass(), "values", null);
        ArrayList term1086527 = new ArrayList();
        ArrayList term1086524 = new ArrayList();
        ((ArrayList) term1086524).add(term1086526);
        ((ArrayList) term1086524).add((Object)null);
        ((ArrayList) term1086524).add(term1086527);
        ((ArrayList) term1086524).add((Object)null);
        ((ArrayList) term1086524).add((Object)null);
        ((ArrayList) term1086524).add((Object)null);
        ((ArrayList) term1086524).add((Object)null);
        ((ArrayList) term1086524).add((Object)null);
        ((ArrayList) term1086524).add((Object)null);
        ((ArrayList) term1086524).add((Object)null);
        ((ArrayList) term1086524).add((Object)null);
        ((ArrayList) term1086524).add((Object)null);
        ((ArrayList) term1086524).add((Object)null);
        ((ArrayList) term1086524).add((Object)null);
        ((ArrayList) term1086524).add((Object)null);
        ((ArrayList) term1086524).add((Object)null);
        ((ArrayList) term1086524).add((Object)null);
        term1086523 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term1086523, term1086523.getClass(), "defaults", null);
        setField(term1086523, term1086523.getClass(), "file", null);
        setField(term1086523, term1086523.getClass(), "basePath", null);
        setField(term1086523, term1086523.getClass(), "fileSeparator", null);
        setBooleanField(term1086523, term1086523.getClass(), "isInitialized", false);
        setField(term1086523, term1086523.getClass(), "includePropertyName", null);
        setField(term1086523, term1086523.getClass(), "keysAsListed", term1086524);
        setField(term1086523, term1086523.getClass(), "table", null);
        setIntField(term1086523, term1086523.getClass(), "count", 0);
        setIntField(term1086523, term1086523.getClass(), "threshold", 0);
        setFloatField(term1086523, term1086523.getClass(), "loadFactor", 0.0F);
        setIntField(term1086523, term1086523.getClass(), "modCount", 0);
        setField(term1086523, term1086523.getClass(), "keySet", null);
        setField(term1086523, term1086523.getClass(), "entrySet", null);
        setField(term1086523, term1086523.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "subset", argTypes, term1086226, args);
        assertTrue(recursiveEquals(term1086226, term1086523));
        assertTrue(recursiveEquals(retValue, null));
    }

};


