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

public class CSVParser_addRecordValue_174657284545 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term187445;

    public CSVParser_addRecordValue_174657284545() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        char[] term187223 = (char[]) newCharArray(41);
        StringBuilder term187567 = new StringBuilder();
        ((StringBuilder) term187567).append(term187223);
        term187445 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term187507 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term187637 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setField(term187507, term187507.getClass(), "content", term187567);
        setField(term187445, term187445.getClass(), "reusableToken", term187507);
        setField(term187637, term187637.getClass(), "nullString", null);
        setField(term187445, term187445.getClass(), "format", term187637);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "addRecordValue", argTypes, term187445, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


