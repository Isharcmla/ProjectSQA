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
import java.util.HashMap;

public class DefaultKeyedValues_clone_196732209543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term344;
     Object term4146;
     Object term4118;

    public DefaultKeyedValues_clone_196732209543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term345 = new ArrayList();
        ArrayList term349 = new ArrayList();
        HashMap term353 = new HashMap();
        term344 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues"));
        setField(term344, term344.getClass(), "keys", term345);
        setField(term344, term344.getClass(), "values", term349);
        setField(term344, term344.getClass(), "indexMap", term353);
        ArrayList term4147 = new ArrayList();
        ArrayList term4149 = new ArrayList();
        HashMap term4151 = new HashMap();
        term4146 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues"));
        setField(term4146, term4146.getClass(), "keys", term4147);
        setField(term4146, term4146.getClass(), "values", term4149);
        setField(term4146, term4146.getClass(), "indexMap", term4151);
        ArrayList term4119 = new ArrayList();
        ArrayList term4123 = new ArrayList();
        HashMap term4127 = new HashMap();
        term4118 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues"));
        setField(term4118, term4118.getClass(), "keys", term4119);
        setField(term4118, term4118.getClass(), "values", term4123);
        setField(term4118, term4118.getClass(), "indexMap", term4127);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.DefaultKeyedValues");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "clone", argTypes, term344, args);
        assertTrue(recursiveEquals(term344, term4146));
        assertTrue(recursiveEquals(retValue, term4118));
    }

};


