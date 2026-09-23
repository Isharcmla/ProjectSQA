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

public class CSVParser_initializeHeader_176341255165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term212113;

    public CSVParser_initializeHeader_176341255165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term212113 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term212183 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term211991 = (Object[]) newArray("java.lang.String", 0);
        setField(term212183, term212183.getClass(), "header", term211991);
        setBooleanField(term212183, term212183.getClass(), "skipHeaderRecord", false);
        setField(term212113, term212113.getClass(), "format", term212183);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "initializeHeader", argTypes, term212113, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


