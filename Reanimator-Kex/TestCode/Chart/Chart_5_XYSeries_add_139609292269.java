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

public class XYSeries_add_139609292269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11467;
     Object term11581;

    public XYSeries_add_139609292269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term11519 = new ArrayList();
        term11467 = newInstance(Class.forName("org.jfree.data.xy.XYSeries"));
        setBooleanField(term11467, term11467.getClass(), "autoSort", true);
        setField(term11467, term11467.getClass(), "data", term11519);
        setIntField(term11467, term11467.getClass(), "maximumItemCount", 0);
        setBooleanField(term11467, term11467.getClass(), "notify", false);
        term11581 = newInstance(Class.forName("org.jfree.data.xy.XYDataItem"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.xy.XYSeries");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jfree.data.xy.XYDataItem");
        Object[] args = new Object[1];
        args[0] = term11581;
        callMethod(klass, "add", argTypes, term11467, args);
    }

};


