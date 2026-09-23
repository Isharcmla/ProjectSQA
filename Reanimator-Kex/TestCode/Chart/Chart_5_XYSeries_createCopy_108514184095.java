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
import java.lang.Integer;

public class XYSeries_createCopy_108514184095 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14762;
     Object term14767;
     Object term14769;

    public XYSeries_createCopy_108514184095() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14762 = newInstance(Class.forName("org.jfree.data.xy.XYSeries"));
        setField(term14762, term14762.getClass(), "data", null);
        setIntField(term14762, term14762.getClass(), "maximumItemCount", 0);
        setBooleanField(term14762, term14762.getClass(), "autoSort", false);
        setBooleanField(term14762, term14762.getClass(), "allowDuplicateXValues", false);
        setField(term14762, term14762.getClass(), "key", null);
        setField(term14762, term14762.getClass(), "description", null);
        setField(term14762, term14762.getClass(), "listeners", null);
        setField(term14762, term14762.getClass(), "propertyChangeSupport", null);
        setBooleanField(term14762, term14762.getClass(), "notify", false);
        term14767 = new Integer(0);
        term14769 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.xy.XYSeries");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term14767;
        args[1] = term14769;
        callMethod(klass, "createCopy", argTypes, term14762, args);
    }

};


