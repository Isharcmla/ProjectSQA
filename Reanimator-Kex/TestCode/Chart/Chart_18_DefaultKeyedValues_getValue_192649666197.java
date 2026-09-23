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
import java.lang.NullPointerException;
import static org.jfree.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;

public class DefaultKeyedValues_getValue_192649666197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23783;
     Object term23907;

    public DefaultKeyedValues_getValue_192649666197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term23831 = new HashMap();
        term23783 = newInstance(Class.forName("org.jfree.data.DefaultKeyedValues"));
        setField(term23783, term23783.getClass(), "indexMap", term23831);
        term23907 = newInstance(Class.forName("org.jfree.data.xy.YIntervalDataItem"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.DefaultKeyedValues");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Comparable");
        Object[] args = new Object[1];
        args[0] = term23907;
        try {
            callMethod(klass, "getValue", argTypes, term23783, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


