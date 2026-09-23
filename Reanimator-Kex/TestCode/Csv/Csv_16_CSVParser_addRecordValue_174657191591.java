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

public class CSVParser_addRecordValue_174657191591 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term278415;
     Object term280225;

    public CSVParser_addRecordValue_174657191591() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        char[] term275334 = (char[]) newCharArray(489);
        StringBuilder term278537 = new StringBuilder();
        ((StringBuilder) term278537).append(term275334);
        ArrayList term278697 = new ArrayList();
        term278415 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term278477 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term278607 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        setField(term278477, term278477.getClass(), "content", term278537);
        setField(term278415, term278415.getClass(), "reusableToken", term278477);
        setBooleanField(term278607, term278607.getClass(), "trim", false);
        setField(term278607, term278607.getClass(), "nullString", "");
        setField(term278415, term278415.getClass(), "format", term278607);
        setField(term278415, term278415.getClass(), "recordList", term278697);
        ArrayList term280229 = new ArrayList();
        ((ArrayList) term280229).add("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        term280225 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term280226 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object term280233 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term280234 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term280235 = (byte[]) newByteArray(489);
        setBooleanField(term280226, term280226.getClass(), "allowMissingColumnNames", false);
        setField(term280226, term280226.getClass(), "commentMarker", null);
        setCharField(term280226, term280226.getClass(), "delimiter", (char) 0);
        setField(term280226, term280226.getClass(), "escapeCharacter", null);
        setField(term280226, term280226.getClass(), "header", null);
        setField(term280226, term280226.getClass(), "headerComments", null);
        setBooleanField(term280226, term280226.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term280226, term280226.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term280226, term280226.getClass(), "ignoreSurroundingSpaces", false);
        setField(term280226, term280226.getClass(), "nullString", "");
        setField(term280226, term280226.getClass(), "quoteCharacter", null);
        setField(term280226, term280226.getClass(), "quoteMode", null);
        setField(term280226, term280226.getClass(), "recordSeparator", null);
        setBooleanField(term280226, term280226.getClass(), "skipHeaderRecord", false);
        setBooleanField(term280226, term280226.getClass(), "trailingDelimiter", false);
        setBooleanField(term280226, term280226.getClass(), "trim", false);
        setBooleanField(term280226, term280226.getClass(), "autoFlush", false);
        setField(term280225, term280225.getClass(), "format", term280226);
        setField(term280225, term280225.getClass(), "headerMap", null);
        setField(term280225, term280225.getClass(), "lexer", null);
        setField(term280225, term280225.getClass(), "recordList", term280229);
        setLongField(term280225, term280225.getClass(), "recordNumber", 0L);
        setLongField(term280225, term280225.getClass(), "characterOffset", 0L);
        setField(term280233, term280233.getClass(), "type", null);
        setField(term280234, term280234.getClass(), "value", term280235);
        setByteField(term280234, term280234.getClass(), "coder", (byte) 0);
        setIntField(term280234, term280234.getClass(), "count", 489);
        setField(term280233, term280233.getClass(), "content", term280234);
        setBooleanField(term280233, term280233.getClass(), "isReady", false);
        setField(term280225, term280225.getClass(), "reusableToken", term280233);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = true;
        callMethod(klass, "addRecordValue", argTypes, term278415, args);
        assertTrue(recursiveEquals(term278415, term280225));
    }

};


