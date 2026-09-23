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

public class CSVParser_addRecordValue_174657284531 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26900;

    public CSVParser_addRecordValue_174657284531() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        char[] term26678 = (char[]) newCharArray(41);
        StringBuilder term27022 = new StringBuilder();
        ((StringBuilder) term27022).append(term26678);
        term26900 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term26962 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term27092 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setField(term26962, term26962.getClass(), "content", term27022);
        setField(term26900, term26900.getClass(), "reusableToken", term26962);
        setField(term27092, term27092.getClass(), "nullString", null);
        setField(term26900, term26900.getClass(), "format", term27092);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "addRecordValue", argTypes, term26900, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


