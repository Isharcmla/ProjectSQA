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

public class CSVParser_addRecordValue_1746571915113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term329792;
     Object term331110;

    public CSVParser_addRecordValue_1746571915113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        char[] term327687 = (char[]) newCharArray(489);
        StringBuilder term329914 = new StringBuilder();
        ((StringBuilder) term329914).append(term327687);
        ArrayList term330074 = new ArrayList();
        term329792 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term329854 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term329984 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setField(term329854, term329854.getClass(), "content", term329914);
        setField(term329792, term329792.getClass(), "reusableToken", term329854);
        setBooleanField(term329984, term329984.getClass(), "trim", true);
        setField(term329984, term329984.getClass(), "nullString", "");
        setField(term329792, term329792.getClass(), "format", term329984);
        setField(term329792, term329792.getClass(), "recordList", term330074);
        ArrayList term331114 = new ArrayList();
        ((ArrayList) term331114).add((Object)null);
        term331110 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term331111 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object term331116 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term331117 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term331118 = (byte[]) newByteArray(489);
        setBooleanField(term331111, term331111.getClass(), "allowMissingColumnNames", false);
        setField(term331111, term331111.getClass(), "commentMarker", null);
        setCharField(term331111, term331111.getClass(), "delimiter", (char) 0);
        setField(term331111, term331111.getClass(), "escapeCharacter", null);
        setField(term331111, term331111.getClass(), "header", null);
        setField(term331111, term331111.getClass(), "headerComments", null);
        setBooleanField(term331111, term331111.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term331111, term331111.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term331111, term331111.getClass(), "ignoreSurroundingSpaces", false);
        setField(term331111, term331111.getClass(), "nullString", "");
        setField(term331111, term331111.getClass(), "quoteCharacter", null);
        setField(term331111, term331111.getClass(), "quoteMode", null);
        setField(term331111, term331111.getClass(), "recordSeparator", null);
        setBooleanField(term331111, term331111.getClass(), "skipHeaderRecord", false);
        setBooleanField(term331111, term331111.getClass(), "trailingDelimiter", false);
        setBooleanField(term331111, term331111.getClass(), "trim", true);
        setBooleanField(term331111, term331111.getClass(), "autoFlush", false);
        setField(term331110, term331110.getClass(), "format", term331111);
        setField(term331110, term331110.getClass(), "headerMap", null);
        setField(term331110, term331110.getClass(), "lexer", null);
        setField(term331110, term331110.getClass(), "recordList", term331114);
        setLongField(term331110, term331110.getClass(), "recordNumber", 0L);
        setLongField(term331110, term331110.getClass(), "characterOffset", 0L);
        setField(term331116, term331116.getClass(), "type", null);
        setField(term331117, term331117.getClass(), "value", term331118);
        setByteField(term331117, term331117.getClass(), "coder", (byte) 0);
        setIntField(term331117, term331117.getClass(), "count", 489);
        setField(term331116, term331116.getClass(), "content", term331117);
        setBooleanField(term331116, term331116.getClass(), "isReady", false);
        setField(term331110, term331110.getClass(), "reusableToken", term331116);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = false;
        callMethod(klass, "addRecordValue", argTypes, term329792, args);
        assertTrue(recursiveEquals(term329792, term331110));
    }

};


