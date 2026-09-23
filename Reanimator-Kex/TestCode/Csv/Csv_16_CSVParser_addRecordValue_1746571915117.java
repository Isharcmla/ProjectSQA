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

public class CSVParser_addRecordValue_1746571915117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term336795;
     Object term337050;

    public CSVParser_addRecordValue_1746571915117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        char[] term336669 = (char[]) newCharArray(0);
        StringBuilder term336917 = new StringBuilder();
        ((StringBuilder) term336917).append(term336669);
        term336795 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term336857 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term336987 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setField(term336857, term336857.getClass(), "content", term336917);
        setField(term336795, term336795.getClass(), "reusableToken", term336857);
        setBooleanField(term336987, term336987.getClass(), "trim", true);
        setBooleanField(term336987, term336987.getClass(), "trailingDelimiter", true);
        setField(term336795, term336795.getClass(), "format", term336987);
        term337050 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term337051 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object term337052 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term337053 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term337054 = (byte[]) newByteArray(16);
        setBooleanField(term337051, term337051.getClass(), "allowMissingColumnNames", false);
        setField(term337051, term337051.getClass(), "commentMarker", null);
        setCharField(term337051, term337051.getClass(), "delimiter", (char) 0);
        setField(term337051, term337051.getClass(), "escapeCharacter", null);
        setField(term337051, term337051.getClass(), "header", null);
        setField(term337051, term337051.getClass(), "headerComments", null);
        setBooleanField(term337051, term337051.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term337051, term337051.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term337051, term337051.getClass(), "ignoreSurroundingSpaces", false);
        setField(term337051, term337051.getClass(), "nullString", null);
        setField(term337051, term337051.getClass(), "quoteCharacter", null);
        setField(term337051, term337051.getClass(), "quoteMode", null);
        setField(term337051, term337051.getClass(), "recordSeparator", null);
        setBooleanField(term337051, term337051.getClass(), "skipHeaderRecord", false);
        setBooleanField(term337051, term337051.getClass(), "trailingDelimiter", true);
        setBooleanField(term337051, term337051.getClass(), "trim", true);
        setBooleanField(term337051, term337051.getClass(), "autoFlush", false);
        setField(term337050, term337050.getClass(), "format", term337051);
        setField(term337050, term337050.getClass(), "headerMap", null);
        setField(term337050, term337050.getClass(), "lexer", null);
        setField(term337050, term337050.getClass(), "recordList", null);
        setLongField(term337050, term337050.getClass(), "recordNumber", 0L);
        setLongField(term337050, term337050.getClass(), "characterOffset", 0L);
        setField(term337052, term337052.getClass(), "type", null);
        setField(term337053, term337053.getClass(), "value", term337054);
        setByteField(term337053, term337053.getClass(), "coder", (byte) 0);
        setIntField(term337053, term337053.getClass(), "count", 0);
        setField(term337052, term337052.getClass(), "content", term337053);
        setBooleanField(term337052, term337052.getClass(), "isReady", false);
        setField(term337050, term337050.getClass(), "reusableToken", term337052);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = true;
        callMethod(klass, "addRecordValue", argTypes, term336795, args);
        assertTrue(recursiveEquals(term336795, term337050));
    }

};


