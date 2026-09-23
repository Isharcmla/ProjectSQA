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

public class XYSeries_add_72782031479 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12579;
     Object term12641;

    public XYSeries_add_72782031479() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12579 = newInstance(Class.forName("org.jfree.data.xy.XYSeries"));
        setBooleanField(term12579, term12579.getClass(), "autoSort", false);
        term12641 = newInstance(Class.forName("org.jfree.data.xy.XYDataItem"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.xy.XYSeries");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jfree.data.xy.XYDataItem");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term12641;
        args[1] = false;
        callMethod(klass, "add", argTypes, term12579, args);
    }

};


