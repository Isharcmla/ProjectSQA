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

public class CSVFormat_format_2070435827366 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term264382;
     Object term263881;

    public CSVFormat_format_2070435827366() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term264434 = new Character((char) 512);
        Character term264486 = new Character((char) 128);
        Character term264538 = new Character((char) 0);
        Class<? extends Object> term264640 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term264639 = ((Class) term264640).getDeclaredField((String) "ALL");
        ((Field) term264639).setAccessible(true);
        Object enum416 = ((Field) term264639).get((Object) null);
        term264382 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term264098 = (Object[]) newArray("java.lang.String", 0);
        setField(term264382, term264382.getClass(), "quoteChar", term264434);
        setCharField(term264382, term264382.getClass(), "delimiter", (char) 65532);
        setField(term264382, term264382.getClass(), "escape", term264486);
        setField(term264382, term264382.getClass(), "commentStart", term264538);
        setField(term264382, term264382.getClass(), "header", term264098);
        setField(term264382, term264382.getClass(), "quotePolicy", enum416);
        term263881 = (Object[]) newArray("java.lang.String", 64);
        byte[] term263882 = (byte[]) newByteArray(16);
        setElement(term263881, 0, term263882);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term263881;
        callMethod(klass, "format", argTypes, term264382, args);
    }

};


