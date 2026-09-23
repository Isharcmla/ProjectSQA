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
import java.util.ArrayList;
import java.lang.Long;

public class XYSeries_add_1638702013102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15890;
     Object term15984;

    public XYSeries_add_1638702013102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term15942 = new ArrayList();
        term15890 = newInstance(Class.forName("org.jfree.data.xy.XYSeries"));
        setBooleanField(term15890, term15890.getClass(), "autoSort", false);
        setBooleanField(term15890, term15890.getClass(), "allowDuplicateXValues", true);
        setField(term15890, term15890.getClass(), "data", term15942);
        setIntField(term15890, term15890.getClass(), "maximumItemCount", 0);
        term15984 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.xy.XYSeries");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = double.class;
        argTypes[1] = Class.forName("java.lang.Number");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = 0.0;
        args[1] = term15984;
        args[2] = false;
        callMethod(klass, "add", argTypes, term15890, args);
    }

};


