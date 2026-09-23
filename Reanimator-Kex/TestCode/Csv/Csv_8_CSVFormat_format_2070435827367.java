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
import java.lang.Character;
import java.lang.Object;
import java.lang.String;

public class CSVFormat_format_2070435827367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term273855;
     Object term265166;

    public CSVFormat_format_2070435827367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term273907 = new Character((char) 23518);
        Character term273959 = new Character((char) 1);
        Character term274011 = new Character((char) 0);
        Class<? extends Object> term274151 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term274150 = ((Class) term274151).getDeclaredField((String) "ALL");
        ((Field) term274150).setAccessible(true);
        Object enum417 = ((Field) term274150).get((Object) null);
        term273855 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term265746 = (Object[]) newArray("java.lang.String", 0);
        setField(term273855, term273855.getClass(), "quoteChar", term273907);
        setCharField(term273855, term273855.getClass(), "delimiter", (char) 41984);
        setField(term273855, term273855.getClass(), "escape", term273959);
        setField(term273855, term273855.getClass(), "commentStart", term274011);
        setField(term273855, term273855.getClass(), "header", term265746);
        setField(term273855, term273855.getClass(), "quotePolicy", enum417);
        setField(term273855, term273855.getClass(), "nullString", null);
        term265166 = (Object[]) newArray("java.lang.String", 16);
        Object[] term265167 = (Object[]) newArray("java.lang.String", 0);
        byte[] term265169 = (byte[]) newByteArray(0);
        setElement(term265166, 0, term265167);
        setElement(term265166, 1, "");
        setElement(term265166, 11, term265169);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term265166;
        callMethod(klass, "format", argTypes, term273855, args);
    }

};


