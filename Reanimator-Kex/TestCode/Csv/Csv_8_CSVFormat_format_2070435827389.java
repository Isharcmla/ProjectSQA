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

public class CSVFormat_format_2070435827389 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term308097;
     Object term307412;
     Object term309435;
     Object term309443;

    public CSVFormat_format_2070435827389() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term308149 = new Character((char) 0);
        Character term308201 = new Character((char) 1);
        Class<? extends Object> term309452 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term309451 = ((Class) term309452).getDeclaredField((String) "MINIMAL");
        ((Field) term309451).setAccessible(true);
        Object enum449 = ((Field) term309451).get((Object) null);
        term308097 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term307580 = (Object[]) newArray("java.lang.String", 0);
        setField(term308097, term308097.getClass(), "quoteChar", term308149);
        setCharField(term308097, term308097.getClass(), "delimiter", (char) 65532);
        setField(term308097, term308097.getClass(), "escape", term308149);
        setField(term308097, term308097.getClass(), "commentStart", term308201);
        setField(term308097, term308097.getClass(), "header", term307580);
        setField(term308097, term308097.getClass(), "quotePolicy", enum449);
        StringBuffer term308359 = new StringBuffer();
        Class<? extends Object> term309620 = Class.forName((String) "java.nio.file.attribute.AclEntryFlag");
        Field term309619 = ((Class) term309620).getDeclaredField((String) "FILE_INHERIT");
        ((Field) term309619).setAccessible(true);
        Object enum450 = ((Field) term309619).get((Object) null);
        term307412 = (Object[]) newArray("java.lang.Object", 2);
        setElement(term307412, 0, term308359);
        setElement(term307412, 1, enum450);
        Character term309436 = new Character((char) 0);
        Class<? extends Object> term309843 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term309842 = ((Class) term309843).getDeclaredField((String) "MINIMAL");
        ((Field) term309842).setAccessible(true);
        Object enum451 = ((Field) term309842).get((Object) null);
        Character term309440 = new Character((char) 1);
        Character term309441 = new Character((char) 0);
        term309435 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term309442 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term309435, term309435.getClass(), "delimiter", (char) 65532);
        setField(term309435, term309435.getClass(), "quoteChar", term309436);
        setField(term309435, term309435.getClass(), "quotePolicy", enum451);
        setField(term309435, term309435.getClass(), "commentStart", term309440);
        setField(term309435, term309435.getClass(), "escape", term309441);
        setBooleanField(term309435, term309435.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term309435, term309435.getClass(), "ignoreEmptyLines", false);
        setField(term309435, term309435.getClass(), "recordSeparator", null);
        setField(term309435, term309435.getClass(), "nullString", null);
        setField(term309435, term309435.getClass(), "header", term309442);
        setBooleanField(term309435, term309435.getClass(), "skipHeaderRecord", false);
        Class<? extends Object> term310027 = Class.forName((String) "java.nio.file.attribute.AclEntryFlag");
        Field term310026 = ((Class) term310027).getDeclaredField((String) "FILE_INHERIT");
        ((Field) term310026).setAccessible(true);
        Object enum452 = ((Field) term310026).get((Object) null);
        term309443 = (Object[]) newArray("java.lang.Object", 2);
        Object term309444 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term309447 = (byte[]) newByteArray(16);
        setField(term309444, term309444.getClass(), "toStringCache", "");
        setField(term309444, term309444.getClass(), "value", term309447);
        setByteField(term309444, term309444.getClass(), "coder", (byte) 0);
        setIntField(term309444, term309444.getClass(), "count", 0);
        setElement(term309443, 0, term309444);
        setElement(term309443, 1, enum452);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term307412;
        Object retValue = callMethod(klass, "format", argTypes, term308097, args);
        assertTrue(recursiveEquals(term308097, term309435));
        assertTrue(recursiveEquals(term307412, term309443));
        assertTrue(recursiveEquals(retValue, "\uFFFC\uFFFFF I L E _ I N H E R I T "));
    }

};


