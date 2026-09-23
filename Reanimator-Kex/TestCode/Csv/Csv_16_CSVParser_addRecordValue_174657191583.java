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

public class CSVParser_addRecordValue_174657191583 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term262507;
     Object term262993;

    public CSVParser_addRecordValue_174657191583() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        char[] term261734 = (char[]) newCharArray(48);
        StringBuilder term262629 = new StringBuilder();
        ((StringBuilder) term262629).append(term261734);
        ArrayList term262789 = new ArrayList();
        term262507 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term262569 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term262699 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setField(term262569, term262569.getClass(), "content", term262629);
        setField(term262507, term262507.getClass(), "reusableToken", term262569);
        setBooleanField(term262699, term262699.getClass(), "trim", false);
        setField(term262699, term262699.getClass(), "nullString", "");
        setField(term262507, term262507.getClass(), "format", term262699);
        setField(term262507, term262507.getClass(), "recordList", term262789);
        ArrayList term262997 = new ArrayList();
        ((ArrayList) term262997).add("                                                ");
        term262993 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term262994 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object term263001 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term263002 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term263003 = (byte[]) newByteArray(48);
        setBooleanField(term262994, term262994.getClass(), "allowMissingColumnNames", false);
        setField(term262994, term262994.getClass(), "commentMarker", null);
        setCharField(term262994, term262994.getClass(), "delimiter", (char) 0);
        setField(term262994, term262994.getClass(), "escapeCharacter", null);
        setField(term262994, term262994.getClass(), "header", null);
        setField(term262994, term262994.getClass(), "headerComments", null);
        setBooleanField(term262994, term262994.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term262994, term262994.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term262994, term262994.getClass(), "ignoreSurroundingSpaces", false);
        setField(term262994, term262994.getClass(), "nullString", "");
        setField(term262994, term262994.getClass(), "quoteCharacter", null);
        setField(term262994, term262994.getClass(), "quoteMode", null);
        setField(term262994, term262994.getClass(), "recordSeparator", null);
        setBooleanField(term262994, term262994.getClass(), "skipHeaderRecord", false);
        setBooleanField(term262994, term262994.getClass(), "trailingDelimiter", false);
        setBooleanField(term262994, term262994.getClass(), "trim", false);
        setBooleanField(term262994, term262994.getClass(), "autoFlush", false);
        setField(term262993, term262993.getClass(), "format", term262994);
        setField(term262993, term262993.getClass(), "headerMap", null);
        setField(term262993, term262993.getClass(), "lexer", null);
        setField(term262993, term262993.getClass(), "recordList", term262997);
        setLongField(term262993, term262993.getClass(), "recordNumber", 0L);
        setLongField(term262993, term262993.getClass(), "characterOffset", 0L);
        setField(term263001, term263001.getClass(), "type", null);
        setField(term263002, term263002.getClass(), "value", term263003);
        setByteField(term263002, term263002.getClass(), "coder", (byte) 0);
        setIntField(term263002, term263002.getClass(), "count", 48);
        setField(term263001, term263001.getClass(), "content", term263002);
        setBooleanField(term263001, term263001.getClass(), "isReady", false);
        setField(term262993, term262993.getClass(), "reusableToken", term263001);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = false;
        callMethod(klass, "addRecordValue", argTypes, term262507, args);
        assertTrue(recursiveEquals(term262507, term262993));
    }

};


