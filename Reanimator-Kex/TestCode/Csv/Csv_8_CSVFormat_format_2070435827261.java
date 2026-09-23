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
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class CSVFormat_format_2070435827261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139556;

    public CSVFormat_format_2070435827261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term140180 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term140179 = ((Class) term140180).getDeclaredField((String) "NONE");
        ((Field) term140179).setAccessible(true);
        Object enum241 = ((Field) term140179).get((Object) null);
        term139556 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setField(term139556, term139556.getClass(), "quoteChar", null);
        setField(term139556, term139556.getClass(), "escape", null);
        setField(term139556, term139556.getClass(), "commentStart", null);
        setField(term139556, term139556.getClass(), "quotePolicy", enum241);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "format", argTypes, term139556, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


