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

public class CSVParser_addRecordValue_1746571915103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term307371;

    public CSVParser_addRecordValue_1746571915103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        char[] term307086 = (char[]) newCharArray(41);
        StringBuilder term307493 = new StringBuilder();
        ((StringBuilder) term307493).append(term307086);
        term307371 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term307433 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term307563 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setField(term307433, term307433.getClass(), "content", term307493);
        setField(term307371, term307371.getClass(), "reusableToken", term307433);
        setBooleanField(term307563, term307563.getClass(), "trim", true);
        setField(term307371, term307371.getClass(), "format", term307563);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = true;
        try {
            callMethod(klass, "addRecordValue", argTypes, term307371, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


