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

public class KeyedObjects2D_hashCode_772657740 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term250;
     Object term3919;

    public KeyedObjects2D_hashCode_772657740() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term251 = new ArrayList();
        ArrayList term255 = new ArrayList();
        ArrayList term259 = new ArrayList();
        term250 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        setField(term250, term250.getClass(), "rowKeys", term251);
        setField(term250, term250.getClass(), "columnKeys", term255);
        setField(term250, term250.getClass(), "rows", term259);
        ArrayList term3920 = new ArrayList();
        ArrayList term3922 = new ArrayList();
        ArrayList term3924 = new ArrayList();
        term3919 = newInstance(Class.forName("org.jfree.data.KeyedObjects2D"));
        setField(term3919, term3919.getClass(), "rowKeys", term3920);
        setField(term3919, term3919.getClass(), "columnKeys", term3922);
        setField(term3919, term3919.getClass(), "rows", term3924);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.KeyedObjects2D");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term250, args);
        assertTrue(recursiveEquals(term250, term3919));
        assertTrue(recursiveEquals(retValue, 871));
    }

};


