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

public class DefaultKeyedValues2D_getRowKeys_9576774130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79;
     Object term1281;
     Object term1266;

    public DefaultKeyedValues2D_getRowKeys_9576774130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term80 = new ArrayList();
        ArrayList term84 = new ArrayList();
        ArrayList term88 = new ArrayList();
        term79 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues2D"));
        setField(term79, term79.getClass(), "rowKeys", term80);
        setField(term79, term79.getClass(), "columnKeys", term84);
        setField(term79, term79.getClass(), "rows", term88);
        setBooleanField(term79, term79.getClass(), "sortRowKeys", true);
        ArrayList term1282 = new ArrayList();
        ArrayList term1284 = new ArrayList();
        ArrayList term1286 = new ArrayList();
        term1281 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues2D"));
        setField(term1281, term1281.getClass(), "rowKeys", term1282);
        setField(term1281, term1281.getClass(), "columnKeys", term1284);
        setField(term1281, term1281.getClass(), "rows", term1286);
        setBooleanField(term1281, term1281.getClass(), "sortRowKeys", true);
        ArrayList term1267 = new ArrayList();
        term1266 = newInstance(Class.forName("java.util.Collections$UnmodifiableRandomAccessList"));
        setField(term1266, term1266.getClass(), "list", term1267);
        setField(term1266, term1266.getClass(), "c", term1267);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.DefaultKeyedValues2D");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRowKeys", argTypes, term79, args);
        assertTrue(recursiveEquals(term79, term1281));
        assertTrue(recursiveEquals(retValue, term1266));
    }

};


