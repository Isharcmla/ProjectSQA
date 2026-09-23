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

public class KeyedObjects2D_getRowCount_62077065522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term310;

    public KeyedObjects2D_getRowCount_62077065522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2 = new ArrayList();
        ArrayList term6 = new ArrayList();
        ArrayList term10 = new ArrayList();
        term1 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        setField(term1, term1.getClass(), "rowKeys", term2);
        setField(term1, term1.getClass(), "columnKeys", term6);
        setField(term1, term1.getClass(), "rows", term10);
        ArrayList term311 = new ArrayList();
        ArrayList term313 = new ArrayList();
        ArrayList term315 = new ArrayList();
        term310 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        setField(term310, term310.getClass(), "rowKeys", term311);
        setField(term310, term310.getClass(), "columnKeys", term313);
        setField(term310, term310.getClass(), "rows", term315);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.KeyedObjects2D");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRowCount", argTypes, term1, args);
        assertTrue(recursiveEquals(term1, term310));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


