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
import java.lang.Character;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuffer;

public class CSVFormat_format_2070435827332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term214992;
     Object term211683;
     Object term216923;
     Object term216931;

    public CSVFormat_format_2070435827332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term215044 = new Character((char) 2048);
        Character term215096 = new Character((char) 1024);
        Character term215148 = new Character((char) 0);
        Class<? extends Object> term216941 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term216940 = ((Class) term216941).getDeclaredField((String) "ALL");
        ((Field) term216940).setAccessible(true);
        Object enum356 = ((Field) term216940).get((Object) null);
        term214992 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term212013 = (Object[]) newArray("java.lang.String", 0);
        setField(term214992, term214992.getClass(), "quoteChar", term215044);
        setCharField(term214992, term214992.getClass(), "delimiter", 'd');
        setField(term214992, term214992.getClass(), "escape", term215096);
        setField(term214992, term214992.getClass(), "commentStart", term215148);
        setField(term214992, term214992.getClass(), "header", term212013);
        setField(term214992, term214992.getClass(), "quotePolicy", enum356);
        StringBuffer term215306 = new StringBuffer();
        Class<? extends Object> term217097 = Class.forName((String) "java.nio.file.attribute.AclEntryFlag");
        Field term217096 = ((Class) term217097).getDeclaredField((String) "FILE_INHERIT");
        ((Field) term217096).setAccessible(true);
        Object enum357 = ((Field) term217096).get((Object) null);
        term211683 = (Object[]) newArray("java.lang.Object", 4);
        Object term215432 = newInstance(Class.forName("java.lang.StringUTF16"));
        setElement(term211683, 0, term215306);
        setElement(term211683, 1, enum357);
        setElement(term211683, 2, term215306);
        setElement(term211683, 3, term215432);
        Character term216924 = new Character((char) 2048);
        Class<? extends Object> term217320 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term217319 = ((Class) term217320).getDeclaredField((String) "ALL");
        ((Field) term217319).setAccessible(true);
        Object enum358 = ((Field) term217319).get((Object) null);
        Character term216928 = new Character((char) 0);
        Character term216929 = new Character((char) 1024);
        term216923 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term216930 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term216923, term216923.getClass(), "delimiter", 'd');
        setField(term216923, term216923.getClass(), "quoteChar", term216924);
        setField(term216923, term216923.getClass(), "quotePolicy", enum358);
        setField(term216923, term216923.getClass(), "commentStart", term216928);
        setField(term216923, term216923.getClass(), "escape", term216929);
        setBooleanField(term216923, term216923.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term216923, term216923.getClass(), "ignoreEmptyLines", false);
        setField(term216923, term216923.getClass(), "recordSeparator", null);
        setField(term216923, term216923.getClass(), "nullString", null);
        setField(term216923, term216923.getClass(), "header", term216930);
        setBooleanField(term216923, term216923.getClass(), "skipHeaderRecord", false);
        Class<? extends Object> term217492 = Class.forName((String) "java.nio.file.attribute.AclEntryFlag");
        Field term217491 = ((Class) term217492).getDeclaredField((String) "FILE_INHERIT");
        ((Field) term217491).setAccessible(true);
        Object enum359 = ((Field) term217491).get((Object) null);
        term216931 = (Object[]) newArray("java.lang.Object", 4);
        Object term216932 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term216935 = (byte[]) newByteArray(16);
        Object term216939 = newInstance(Class.forName("java.lang.StringUTF16"));
        setField(term216932, term216932.getClass(), "toStringCache", "");
        setField(term216932, term216932.getClass(), "value", term216935);
        setByteField(term216932, term216932.getClass(), "coder", (byte) 0);
        setIntField(term216932, term216932.getClass(), "count", 0);
        setElement(term216931, 0, term216932);
        setElement(term216931, 1, enum359);
        setElement(term216931, 2, term216932);
        setElement(term216931, 3, term216939);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term211683;
        Object retValue = callMethod(klass, "format", argTypes, term214992, args);
        assertTrue(recursiveEquals(term214992, term216923));
        assertTrue(recursiveEquals(term211683, term216931));
        assertTrue(recursiveEquals(retValue, " \b \bd  \bF I L E _ I N H E R I T  \bd  \b \bd  \bj a v a . l a n g . S t r i n g U T F 1 6 @ 7 f d 2 d f 4 3  \b"));
    }

};


