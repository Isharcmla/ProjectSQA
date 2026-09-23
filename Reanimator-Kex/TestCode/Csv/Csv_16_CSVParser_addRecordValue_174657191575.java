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

public class CSVParser_addRecordValue_174657191575 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term250409;

    public CSVParser_addRecordValue_174657191575() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        char[] term248839 = (char[]) newCharArray(489);
        StringBuilder term250531 = new StringBuilder();
        ((StringBuilder) term250531).append(term248839);
        term250409 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term250471 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term250601 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setField(term250471, term250471.getClass(), "content", term250531);
        setField(term250409, term250409.getClass(), "reusableToken", term250471);
        setBooleanField(term250601, term250601.getClass(), "trim", true);
        setField(term250409, term250409.getClass(), "format", term250601);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = false;
        try {
            callMethod(klass, "addRecordValue", argTypes, term250409, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


