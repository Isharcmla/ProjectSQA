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
import java.lang.Object;
import java.lang.Double;

public class XYSeries_add_95106764591 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13925;
     Object term14023;

    public XYSeries_add_95106764591() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term13977 = new ArrayList();
        ((ArrayList) term13977).add((Object)null);
        ((ArrayList) term13977).add((Object)null);
        ((ArrayList) term13977).add((Object)null);
        ((ArrayList) term13977).add((Object)null);
        term13925 = newInstance(Class.forName("org.jfree.data.xy.XYSeries"));
        setBooleanField(term13925, term13925.getClass(), "autoSort", true);
        setField(term13925, term13925.getClass(), "data", term13977);
        setIntField(term13925, term13925.getClass(), "maximumItemCount", 4);
        term14023 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.xy.XYSeries");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = double.class;
        argTypes[1] = Class.forName("java.lang.Number");
        Object[] args = new Object[2];
        args[0] = 0.0;
        args[1] = term14023;
        callMethod(klass, "add", argTypes, term13925, args);
    }

};


