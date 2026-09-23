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

public class KeyedObjects2D_getRowKeys_43574993227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72;
     Object term970;
     Object term956;

    public KeyedObjects2D_getRowKeys_43574993227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term73 = new ArrayList();
        ArrayList term77 = new ArrayList();
        ArrayList term81 = new ArrayList();
        term72 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        setField(term72, term72.getClass(), "rowKeys", term73);
        setField(term72, term72.getClass(), "columnKeys", term77);
        setField(term72, term72.getClass(), "rows", term81);
        ArrayList term971 = new ArrayList();
        ArrayList term973 = new ArrayList();
        ArrayList term975 = new ArrayList();
        term970 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        setField(term970, term970.getClass(), "rowKeys", term971);
        setField(term970, term970.getClass(), "columnKeys", term973);
        setField(term970, term970.getClass(), "rows", term975);
        ArrayList term957 = new ArrayList();
        term956 = newInstance(Class.forName("java.util.Collections$UnmodifiableRandomAccessList"));
        setField(term956, term956.getClass(), "list", term957);
        setField(term956, term956.getClass(), "c", term957);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.KeyedObjects2D");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRowKeys", argTypes, term72, args);
        assertTrue(recursiveEquals(term72, term970));
        assertTrue(recursiveEquals(retValue, term956));
    }

};


