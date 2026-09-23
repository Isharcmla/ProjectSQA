package org.apache.commons.csv;

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
import java.lang.ClassCastException;
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;

public class CSVRecord_putIn_182936077247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8383;

    public CSVRecord_putIn_182936077247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term8521 = newInstance(Class.forName("java.lang.Object"));
        Object term8559 = newInstance(Class.forName("java.lang.Object"));
        HashMap term8431 = new HashMap();
        ((HashMap) term8431).put(term8521, term8521);
        ((HashMap) term8431).put(term8559, term8559);
        ((HashMap) term8431).put(term8559, term8559);
        ((HashMap) term8431).put(term8559, term8559);
        ((HashMap) term8431).put(term8559, term8559);
        ((HashMap) term8431).put(term8559, term8559);
        ((HashMap) term8431).put(term8559, term8559);
        ((HashMap) term8431).put(term8559, term8559);
        ((HashMap) term8431).put(term8559, term8559);
        ((HashMap) term8431).put(term8559, term8559);
        ((HashMap) term8431).put(term8559, term8559);
        ((HashMap) term8431).put(term8559, term8559);
        ((HashMap) term8431).put(term8559, term8559);
        ((HashMap) term8431).put(term8559, term8559);
        ((HashMap) term8431).put(term8559, term8559);
        ((HashMap) term8431).put(term8559, term8559);
        ((HashMap) term8431).put(term8559, term8559);
        ((HashMap) term8431).put(term8559, term8559);
        ((HashMap) term8431).put(term8559, term8559);
        ((HashMap) term8431).put(term8559, term8559);
        ((HashMap) term8431).put(term8559, term8559);
        ((HashMap) term8431).put(term8559, term8559);
        ((HashMap) term8431).put(term8559, term8559);
        ((HashMap) term8431).put(term8559, term8559);
        ((HashMap) term8431).put(term8559, term8559);
        ((HashMap) term8431).put(term8559, term8559);
        ((HashMap) term8431).put(term8559, term8559);
        ((HashMap) term8431).put(term8559, term8559);
        ((HashMap) term8431).put(term8559, term8559);
        ((HashMap) term8431).put(term8559, term8559);
        ((HashMap) term8431).put(term8559, term8559);
        ((HashMap) term8431).put(term8559, term8559);
        ((HashMap) term8431).put(term8559, term8559);
        ((HashMap) term8431).put(term8559, term8559);
        ((HashMap) term8431).put(term8559, term8559);
        ((HashMap) term8431).put(term8559, term8559);
        ((HashMap) term8431).put(term8559, term8559);
        ((HashMap) term8431).put(term8559, term8559);
        ((HashMap) term8431).put(term8559, term8559);
        ((HashMap) term8431).put(term8559, term8559);
        ((HashMap) term8431).put(term8559, term8559);
        ((HashMap) term8431).put(term8559, term8559);
        term8383 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        setField(term8383, term8383.getClass(), "mapping", term8431);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "putIn", argTypes, term8383, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


