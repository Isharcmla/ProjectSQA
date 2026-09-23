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

public class CSVParser_initializeHeader_176341255145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55869;

    public CSVParser_initializeHeader_176341255145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55869 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term55939 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term55757 = (Object[]) newArray("java.lang.String", 0);
        setField(term55939, term55939.getClass(), "header", term55757);
        setField(term55869, term55869.getClass(), "format", term55939);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "initializeHeader", argTypes, term55869, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


