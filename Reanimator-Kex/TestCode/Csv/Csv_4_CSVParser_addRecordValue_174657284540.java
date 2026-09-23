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

public class CSVParser_addRecordValue_174657284540 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30390;
     Object term39295;

    public CSVParser_addRecordValue_174657284540() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        char[] term28331 = (char[]) newCharArray(1);
        StringBuilder term30512 = new StringBuilder();
        ((StringBuilder) term30512).append(term28331);
        ArrayList term30672 = new ArrayList();
        term30390 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term30452 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term30582 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setField(term30452, term30452.getClass(), "content", term30512);
        setField(term30390, term30390.getClass(), "reusableToken", term30452);
        setField(term30582, term30582.getClass(), "nullString", "");
        setField(term30390, term30390.getClass(), "format", term30582);
        setField(term30390, term30390.getClass(), "record", term30672);
        ArrayList term39299 = new ArrayList();
        ((ArrayList) term39299).add(" ");
        term39295 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term39296 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object term39303 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term39304 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term39305 = (byte[]) newByteArray(16);
        setCharField(term39296, term39296.getClass(), "delimiter", (char) 0);
        setField(term39296, term39296.getClass(), "quoteChar", null);
        setField(term39296, term39296.getClass(), "quotePolicy", null);
        setField(term39296, term39296.getClass(), "commentStart", null);
        setField(term39296, term39296.getClass(), "escape", null);
        setBooleanField(term39296, term39296.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term39296, term39296.getClass(), "ignoreEmptyLines", false);
        setField(term39296, term39296.getClass(), "recordSeparator", null);
        setField(term39296, term39296.getClass(), "nullString", "");
        setField(term39296, term39296.getClass(), "header", null);
        setBooleanField(term39296, term39296.getClass(), "skipHeaderRecord", false);
        setField(term39295, term39295.getClass(), "format", term39296);
        setField(term39295, term39295.getClass(), "headerMap", null);
        setField(term39295, term39295.getClass(), "lexer", null);
        setField(term39295, term39295.getClass(), "record", term39299);
        setLongField(term39295, term39295.getClass(), "recordNumber", 0L);
        setField(term39303, term39303.getClass(), "type", null);
        setField(term39304, term39304.getClass(), "value", term39305);
        setByteField(term39304, term39304.getClass(), "coder", (byte) 0);
        setIntField(term39304, term39304.getClass(), "count", 1);
        setField(term39303, term39303.getClass(), "content", term39304);
        setBooleanField(term39303, term39303.getClass(), "isReady", false);
        setField(term39295, term39295.getClass(), "reusableToken", term39303);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "addRecordValue", argTypes, term30390, args);
        assertTrue(recursiveEquals(term30390, term39295));
    }

};


