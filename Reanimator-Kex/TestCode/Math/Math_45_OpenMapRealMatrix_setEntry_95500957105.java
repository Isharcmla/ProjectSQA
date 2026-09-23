package org.apache.commons.math.linear;

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
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class OpenMapRealMatrix_setEntry_95500957105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49690;

    public OpenMapRealMatrix_setEntry_95500957105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49690 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        Object term49798 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setIntField(term49690, term49690.getClass(), "rows", 1465981317);
        setIntField(term49690, term49690.getClass(), "columns", 87744494);
        setIntField(term49798, term49798.getClass(), "mask", 0);
        setField(term49690, term49690.getClass(), "entries", term49798);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = 1465981316;
        args[1] = 0;
        args[2] = 0.0;
        try {
            callMethod(klass, "setEntry", argTypes, term49690, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


