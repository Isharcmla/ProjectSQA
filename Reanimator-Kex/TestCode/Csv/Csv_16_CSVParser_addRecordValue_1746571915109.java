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

public class CSVParser_addRecordValue_1746571915109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term319268;

    public CSVParser_addRecordValue_1746571915109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        char[] term319162 = (char[]) newCharArray(0);
        StringBuilder term319390 = new StringBuilder();
        ((StringBuilder) term319390).append(term319162);
        term319268 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term319330 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term319460 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setField(term319330, term319330.getClass(), "content", term319390);
        setField(term319268, term319268.getClass(), "reusableToken", term319330);
        setBooleanField(term319460, term319460.getClass(), "trim", false);
        setField(term319268, term319268.getClass(), "format", term319460);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = true;
        try {
            callMethod(klass, "addRecordValue", argTypes, term319268, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


