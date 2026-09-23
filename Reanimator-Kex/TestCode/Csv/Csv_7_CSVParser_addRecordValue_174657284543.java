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
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.csv.EqualityUtils.*;
import java.lang.Object;
import java.lang.StringBuilder;
import java.util.ArrayList;

public class CSVParser_addRecordValue_174657284543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34689;
     Object term35019;

    public CSVParser_addRecordValue_174657284543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term34811 = new StringBuilder();
        ArrayList term34971 = new ArrayList();
        term34689 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term34751 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term34881 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setField(term34751, term34751.getClass(), "content", term34811);
        setField(term34689, term34689.getClass(), "reusableToken", term34751);
        setField(term34881, term34881.getClass(), "nullString", "");
        setField(term34689, term34689.getClass(), "format", term34881);
        setField(term34689, term34689.getClass(), "record", term34971);
        ArrayList term35023 = new ArrayList();
        ((ArrayList) term35023).add((Object)null);
        term35019 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term35020 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object term35025 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term35026 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term35027 = (byte[]) newByteArray(16);
        setCharField(term35020, term35020.getClass(), "delimiter", (char) 0);
        setField(term35020, term35020.getClass(), "quoteChar", null);
        setField(term35020, term35020.getClass(), "quotePolicy", null);
        setField(term35020, term35020.getClass(), "commentStart", null);
        setField(term35020, term35020.getClass(), "escape", null);
        setBooleanField(term35020, term35020.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term35020, term35020.getClass(), "ignoreEmptyLines", false);
        setField(term35020, term35020.getClass(), "recordSeparator", null);
        setField(term35020, term35020.getClass(), "nullString", "");
        setField(term35020, term35020.getClass(), "header", null);
        setBooleanField(term35020, term35020.getClass(), "skipHeaderRecord", false);
        setField(term35019, term35019.getClass(), "format", term35020);
        setField(term35019, term35019.getClass(), "headerMap", null);
        setField(term35019, term35019.getClass(), "lexer", null);
        setField(term35019, term35019.getClass(), "record", term35023);
        setLongField(term35019, term35019.getClass(), "recordNumber", 0L);
        setField(term35025, term35025.getClass(), "type", null);
        setField(term35026, term35026.getClass(), "value", term35027);
        setByteField(term35026, term35026.getClass(), "coder", (byte) 0);
        setIntField(term35026, term35026.getClass(), "count", 0);
        setField(term35025, term35025.getClass(), "content", term35026);
        setBooleanField(term35025, term35025.getClass(), "isReady", false);
        setField(term35019, term35019.getClass(), "reusableToken", term35025);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "addRecordValue", argTypes, term34689, args);
        assertTrue(recursiveEquals(term34689, term35019));
    }

};


