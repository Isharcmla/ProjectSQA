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
import java.lang.StringBuilder;

public class CSVParser_addRecordValue_174657284537 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26441;

    public CSVParser_addRecordValue_174657284537() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        char[] term26219 = (char[]) newCharArray(41);
        StringBuilder term26563 = new StringBuilder();
        ((StringBuilder) term26563).append(term26219);
        term26441 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term26503 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term26633 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setField(term26503, term26503.getClass(), "content", term26563);
        setField(term26441, term26441.getClass(), "reusableToken", term26503);
        setField(term26633, term26633.getClass(), "nullString", null);
        setField(term26441, term26441.getClass(), "format", term26633);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "addRecordValue", argTypes, term26441, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


