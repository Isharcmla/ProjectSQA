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

public class CSVParser_addRecordValue_174657284567 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term214030;
     Object term215769;

    public CSVParser_addRecordValue_174657284567() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        char[] term212461 = (char[]) newCharArray(489);
        StringBuilder term214152 = new StringBuilder();
        ((StringBuilder) term214152).append(term212461);
        ArrayList term214274 = new ArrayList();
        term214030 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term214092 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term214222 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setField(term214092, term214092.getClass(), "content", term214152);
        setField(term214030, term214030.getClass(), "reusableToken", term214092);
        setField(term214222, term214222.getClass(), "nullString", null);
        setField(term214030, term214030.getClass(), "format", term214222);
        setField(term214030, term214030.getClass(), "record", term214274);
        ArrayList term215771 = new ArrayList();
        ((ArrayList) term215771).add("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        term215769 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term215770 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object term215775 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term215776 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term215777 = (byte[]) newByteArray(489);
        setCharField(term215770, term215770.getClass(), "delimiter", (char) 0);
        setField(term215770, term215770.getClass(), "quoteChar", null);
        setField(term215770, term215770.getClass(), "quotePolicy", null);
        setField(term215770, term215770.getClass(), "commentStart", null);
        setField(term215770, term215770.getClass(), "escape", null);
        setBooleanField(term215770, term215770.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term215770, term215770.getClass(), "ignoreEmptyHeaders", false);
        setBooleanField(term215770, term215770.getClass(), "ignoreEmptyLines", false);
        setField(term215770, term215770.getClass(), "recordSeparator", null);
        setField(term215770, term215770.getClass(), "nullString", null);
        setField(term215770, term215770.getClass(), "header", null);
        setBooleanField(term215770, term215770.getClass(), "skipHeaderRecord", false);
        setField(term215769, term215769.getClass(), "format", term215770);
        setField(term215769, term215769.getClass(), "headerMap", null);
        setField(term215769, term215769.getClass(), "lexer", null);
        setField(term215769, term215769.getClass(), "record", term215771);
        setLongField(term215769, term215769.getClass(), "recordNumber", 0L);
        setField(term215775, term215775.getClass(), "type", null);
        setField(term215776, term215776.getClass(), "value", term215777);
        setByteField(term215776, term215776.getClass(), "coder", (byte) 0);
        setIntField(term215776, term215776.getClass(), "count", 489);
        setField(term215775, term215775.getClass(), "content", term215776);
        setBooleanField(term215775, term215775.getClass(), "isReady", false);
        setField(term215769, term215769.getClass(), "reusableToken", term215775);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "addRecordValue", argTypes, term214030, args);
        assertTrue(recursiveEquals(term214030, term215769));
    }

};


