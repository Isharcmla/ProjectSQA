package org.jfree.data.xy;

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
import static org.jfree.data.xy.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class XYSeries_equals_148457148096 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14771;

    public XYSeries_equals_148457148096() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14771 = newInstance(Class.forName("org.jfree.data.xy.XYSeries"));
        setField(term14771, term14771.getClass(), "data", null);
        setIntField(term14771, term14771.getClass(), "maximumItemCount", 0);
        setBooleanField(term14771, term14771.getClass(), "autoSort", false);
        setBooleanField(term14771, term14771.getClass(), "allowDuplicateXValues", false);
        setField(term14771, term14771.getClass(), "key", null);
        setField(term14771, term14771.getClass(), "description", null);
        setField(term14771, term14771.getClass(), "listeners", null);
        setField(term14771, term14771.getClass(), "propertyChangeSupport", null);
        setBooleanField(term14771, term14771.getClass(), "notify", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.xy.XYSeries");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term14771, args);
    }

};


