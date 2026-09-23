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
import java.lang.IllegalArgumentException;
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CSVParser_initializeHeader_176341255177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term251949;

    public CSVParser_initializeHeader_176341255177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term251949 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term252019 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term251867 = (Object[]) newArray("java.lang.String", 498);
        setField(term252019, term252019.getClass(), "header", term251867);
        setField(term251949, term251949.getClass(), "format", term252019);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "initializeHeader", argTypes, term251949, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


