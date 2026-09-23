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
import java.util.Iterator;

public class ExtendedProperties_subset_483178658559 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term240690;
     Object term240898;

    public ExtendedProperties_subset_483178658559() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term240841 = new ArrayList();
        Iterator term240802 =  ((ArrayList) term240841).iterator();
        Object term240840 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term240742 = new ArrayList();
        ((ArrayList) term240742).add((Object)null);
        ((ArrayList) term240742).add(term240802);
        ((ArrayList) term240742).add(term240840);
        term240690 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term240690, term240690.getClass(), "keysAsListed", term240742);
        ArrayList term240902 = new ArrayList();
        Object term240901 = newInstance(Class.forName("java.util.ArrayList$Itr"));
        setIntField(term240901, term240901.getClass(), "cursor", 0);
        setIntField(term240901, term240901.getClass(), "lastRet", -1);
        setIntField(term240901, term240901.getClass(), "expectedModCount", 0);
        setField(term240901, term240901.getClass(), "this$0", term240902);
        Object term240903 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term240899 = new ArrayList();
        ((ArrayList) term240899).add((Object)null);
        ((ArrayList) term240899).add(term240901);
        ((ArrayList) term240899).add(term240903);
        term240898 = newInstance(Class.forName("org.apache.commons.collections.ExtendedProperties"));
        setField(term240898, term240898.getClass(), "defaults", null);
        setField(term240898, term240898.getClass(), "file", null);
        setField(term240898, term240898.getClass(), "basePath", null);
        setField(term240898, term240898.getClass(), "fileSeparator", null);
        setBooleanField(term240898, term240898.getClass(), "isInitialized", false);
        setField(term240898, term240898.getClass(), "includePropertyName", null);
        setField(term240898, term240898.getClass(), "keysAsListed", term240899);
        setField(term240898, term240898.getClass(), "table", null);
        setIntField(term240898, term240898.getClass(), "count", 0);
        setIntField(term240898, term240898.getClass(), "threshold", 0);
        setFloatField(term240898, term240898.getClass(), "loadFactor", 0.0F);
        setIntField(term240898, term240898.getClass(), "modCount", 0);
        setField(term240898, term240898.getClass(), "keySet", null);
        setField(term240898, term240898.getClass(), "entrySet", null);
        setField(term240898, term240898.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.ExtendedProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "subset", argTypes, term240690, args);
        assertTrue(recursiveEquals(term240690, term240898));
        assertTrue(recursiveEquals(retValue, null));
    }

};


