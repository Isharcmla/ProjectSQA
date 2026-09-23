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

public class CSVFormat_validate_725288942213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109231;

    public CSVFormat_validate_725288942213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term109798 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term109797 = ((Class) term109798).getDeclaredField((String) "NONE");
        ((Field) term109797).setAccessible(true);
        Object enum183 = ((Field) term109797).get((Object) null);
        term109231 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setField(term109231, term109231.getClass(), "quoteChar", null);
        setField(term109231, term109231.getClass(), "escape", null);
        setField(term109231, term109231.getClass(), "commentStart", null);
        setField(term109231, term109231.getClass(), "quotePolicy", enum183);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "validate", argTypes, term109231, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


