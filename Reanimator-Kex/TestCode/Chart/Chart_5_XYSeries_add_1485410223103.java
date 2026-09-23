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

public class XYSeries_add_1485410223103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16125;

    public XYSeries_add_1485410223103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term16177 = new ArrayList();
        term16125 = newInstance(Class.forName("org.jfree.data.xy.XYSeries"));
        setBooleanField(term16125, term16125.getClass(), "autoSort", false);
        setBooleanField(term16125, term16125.getClass(), "allowDuplicateXValues", true);
        setField(term16125, term16125.getClass(), "data", term16177);
        setIntField(term16125, term16125.getClass(), "maximumItemCount", 0);
        setBooleanField(term16125, term16125.getClass(), "notify", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.xy.XYSeries");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = 0.0;
        args[1] = 0.0;
        args[2] = true;
        callMethod(klass, "add", argTypes, term16125, args);
    }

};


