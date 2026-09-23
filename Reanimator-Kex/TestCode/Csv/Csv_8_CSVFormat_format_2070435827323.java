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
import java.lang.StringBuilder;

public class CSVFormat_format_2070435827323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term201045;
     Object term198925;
     Object term201998;
     Object term202006;

    public CSVFormat_format_2070435827323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term201097 = new Character((char) 8192);
        Character term201149 = new Character((char) 24575);
        Character term201201 = new Character((char) 32768);
        Class<? extends Object> term202010 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term202009 = ((Class) term202010).getDeclaredField((String) "ALL");
        ((Field) term202009).setAccessible(true);
        Object enum340 = ((Field) term202009).get((Object) null);
        term201045 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term199118 = (Object[]) newArray("java.lang.String", 0);
        setField(term201045, term201045.getClass(), "quoteChar", term201097);
        setCharField(term201045, term201045.getClass(), "delimiter", 'h');
        setField(term201045, term201045.getClass(), "escape", term201149);
        setField(term201045, term201045.getClass(), "commentStart", term201201);
        setField(term201045, term201045.getClass(), "header", term199118);
        setField(term201045, term201045.getClass(), "quotePolicy", enum340);
        StringBuilder term201361 = new StringBuilder();
        term198925 = (Object[]) newArray("java.lang.Object", 2);
        setElement(term198925, 0, term201361);
        setElement(term198925, 1, term201361);
        Character term201999 = new Character((char) 8192);
        Class<? extends Object> term202166 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term202165 = ((Class) term202166).getDeclaredField((String) "ALL");
        ((Field) term202165).setAccessible(true);
        Object enum341 = ((Field) term202165).get((Object) null);
        Character term202003 = new Character((char) 32768);
        Character term202004 = new Character((char) 24575);
        term201998 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term202005 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term201998, term201998.getClass(), "delimiter", 'h');
        setField(term201998, term201998.getClass(), "quoteChar", term201999);
        setField(term201998, term201998.getClass(), "quotePolicy", enum341);
        setField(term201998, term201998.getClass(), "commentStart", term202003);
        setField(term201998, term201998.getClass(), "escape", term202004);
        setBooleanField(term201998, term201998.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term201998, term201998.getClass(), "ignoreEmptyLines", false);
        setField(term201998, term201998.getClass(), "recordSeparator", null);
        setField(term201998, term201998.getClass(), "nullString", null);
        setField(term201998, term201998.getClass(), "header", term202005);
        setBooleanField(term201998, term201998.getClass(), "skipHeaderRecord", false);
        term202006 = (Object[]) newArray("java.lang.Object", 2);
        Object term202007 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term202008 = (byte[]) newByteArray(16);
        setField(term202007, term202007.getClass(), "value", term202008);
        setByteField(term202007, term202007.getClass(), "coder", (byte) 0);
        setIntField(term202007, term202007.getClass(), "count", 0);
        setElement(term202006, 0, term202007);
        setElement(term202006, 1, term202007);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term198925;
        Object retValue = callMethod(klass, "format", argTypes, term201045, args);
        assertTrue(recursiveEquals(term201045, term201998));
        assertTrue(recursiveEquals(term198925, term202006));
        assertTrue(recursiveEquals(retValue, "    h     "));
    }

};


