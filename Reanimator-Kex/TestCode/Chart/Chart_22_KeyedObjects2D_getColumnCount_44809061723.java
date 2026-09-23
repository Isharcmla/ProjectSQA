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

public class KeyedObjects2D_getColumnCount_44809061723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14;
     Object term331;

    public KeyedObjects2D_getColumnCount_44809061723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term15 = new ArrayList();
        ArrayList term19 = new ArrayList();
        ArrayList term23 = new ArrayList();
        term14 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        setField(term14, term14.getClass(), "rowKeys", term15);
        setField(term14, term14.getClass(), "columnKeys", term19);
        setField(term14, term14.getClass(), "rows", term23);
        ArrayList term332 = new ArrayList();
        ArrayList term334 = new ArrayList();
        ArrayList term336 = new ArrayList();
        term331 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        setField(term331, term331.getClass(), "rowKeys", term332);
        setField(term331, term331.getClass(), "columnKeys", term334);
        setField(term331, term331.getClass(), "rows", term336);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.KeyedObjects2D");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getColumnCount", argTypes, term14, args);
        assertTrue(recursiveEquals(term14, term331));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


