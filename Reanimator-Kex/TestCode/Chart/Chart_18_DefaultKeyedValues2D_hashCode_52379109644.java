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

public class DefaultKeyedValues2D_hashCode_52379109644 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term282;
     Object term3922;

    public DefaultKeyedValues2D_hashCode_52379109644() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term283 = new ArrayList();
        ArrayList term287 = new ArrayList();
        ArrayList term291 = new ArrayList();
        term282 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues2D"));
        setField(term282, term282.getClass(), "rowKeys", term283);
        setField(term282, term282.getClass(), "columnKeys", term287);
        setField(term282, term282.getClass(), "rows", term291);
        setBooleanField(term282, term282.getClass(), "sortRowKeys", true);
        ArrayList term3923 = new ArrayList();
        ArrayList term3925 = new ArrayList();
        ArrayList term3927 = new ArrayList();
        term3922 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues2D"));
        setField(term3922, term3922.getClass(), "rowKeys", term3923);
        setField(term3922, term3922.getClass(), "columnKeys", term3925);
        setField(term3922, term3922.getClass(), "rows", term3927);
        setBooleanField(term3922, term3922.getClass(), "sortRowKeys", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.DefaultKeyedValues2D");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term282, args);
        assertTrue(recursiveEquals(term282, term3922));
        assertTrue(recursiveEquals(retValue, 871));
    }

};


