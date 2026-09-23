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
import java.lang.NullPointerException;
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CSVParser_initializeHeader_176341255140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28232;

    public CSVParser_initializeHeader_176341255140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28232 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term28302 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term28120 = (Object[]) newArray("java.lang.String", 0);
        setField(term28302, term28302.getClass(), "header", term28120);
        setField(term28232, term28232.getClass(), "format", term28302);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "initializeHeader", argTypes, term28232, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


