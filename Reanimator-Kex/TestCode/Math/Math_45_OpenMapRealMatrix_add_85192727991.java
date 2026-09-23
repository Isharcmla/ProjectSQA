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

public class OpenMapRealMatrix_add_85192727991 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41845;
     Object term42055;

    public OpenMapRealMatrix_add_85192727991() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41845 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        Object term41953 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term41717 = (int[]) newIntArray(0);
        setIntField(term41845, term41845.getClass(), "rows", 0);
        setIntField(term41845, term41845.getClass(), "columns", 0);
        setField(term41953, term41953.getClass(), "keys", term41717);
        setField(term41845, term41845.getClass(), "entries", term41953);
        term42055 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setIntField(term42055, term42055.getClass(), "rows", 0);
        setIntField(term42055, term42055.getClass(), "columns", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix");
        Object[] args = new Object[1];
        args[0] = term42055;
        try {
            callMethod(klass, "add", argTypes, term41845, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


