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
import java.lang.StringBuffer;

public class CSVFormat_format_2070435827353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term246724;
     Object term240521;

    public CSVFormat_format_2070435827353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term246776 = new Character((char) 0);
        Character term246828 = new Character((char) 0);
        Character term246880 = new Character((char) 55807);
        Class<? extends Object> term247116 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term247115 = ((Class) term247116).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term247115).setAccessible(true);
        Object enum394 = ((Field) term247115).get((Object) null);
        term246724 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term241172 = (Object[]) newArray("java.lang.String", 0);
        setField(term246724, term246724.getClass(), "quoteChar", term246776);
        setCharField(term246724, term246724.getClass(), "delimiter", 'h');
        setField(term246724, term246724.getClass(), "escape", term246828);
        setField(term246724, term246724.getClass(), "commentStart", term246880);
        setField(term246724, term246724.getClass(), "header", term241172);
        setField(term246724, term246724.getClass(), "quotePolicy", enum394);
        StringBuffer term247076 = new StringBuffer();
        term240521 = (Object[]) newArray("java.lang.String", 4);
        byte[] term240525 = (byte[]) newByteArray(73);
        setElement(term240521, 0, "NONE");
        setElement(term240521, 1, term247076);
        setElement(term240521, 2, "h   @ \u0002      \u0004\u0010  @ \b  \u0004\u0010 ");
        setByteElement(term240525, 0, (byte) 104);
        setByteElement(term240525, 1, (byte) 2);
        setByteElement(term240525, 2, (byte) 2);
        setByteElement(term240525, 3, (byte) 64);
        setByteElement(term240525, 4, (byte) 16);
        setByteElement(term240525, 6, (byte) 32);
        setByteElement(term240525, 9, (byte) 64);
        setByteElement(term240525, 10, (byte) 2);
        setByteElement(term240525, 11, (byte) 2);
        setByteElement(term240525, 13, (byte) 64);
        setByteElement(term240525, 14, (byte) 64);
        setByteElement(term240525, 15, (byte) 2);
        setByteElement(term240525, 17, (byte) 32);
        setByteElement(term240525, 19, (byte) 8);
        setByteElement(term240525, 21, (byte) 2);
        setByteElement(term240525, 22, (byte) 64);
        setByteElement(term240525, 23, (byte) -128);
        setByteElement(term240525, 25, (byte) 1);
        setByteElement(term240525, 26, (byte) 1);
        setByteElement(term240525, 27, (byte) 1);
        setByteElement(term240525, 28, (byte) 1);
        setByteElement(term240525, 29, (byte) 1);
        setByteElement(term240525, 30, (byte) 1);
        setByteElement(term240525, 31, (byte) 1);
        setByteElement(term240525, 32, (byte) 1);
        setByteElement(term240525, 33, (byte) 1);
        setByteElement(term240525, 34, (byte) 1);
        setByteElement(term240525, 35, (byte) 1);
        setByteElement(term240525, 36, (byte) 1);
        setByteElement(term240525, 37, (byte) 1);
        setByteElement(term240525, 38, (byte) 1);
        setByteElement(term240525, 39, (byte) 1);
        setByteElement(term240525, 40, (byte) 1);
        setByteElement(term240525, 41, (byte) 1);
        setByteElement(term240525, 42, (byte) 1);
        setByteElement(term240525, 43, (byte) 1);
        setByteElement(term240525, 44, (byte) 1);
        setByteElement(term240525, 45, (byte) 1);
        setByteElement(term240525, 46, (byte) 1);
        setByteElement(term240525, 47, (byte) 1);
        setByteElement(term240525, 48, (byte) 1);
        setByteElement(term240525, 49, (byte) 1);
        setByteElement(term240525, 50, (byte) 1);
        setByteElement(term240525, 51, (byte) 1);
        setByteElement(term240525, 52, (byte) 1);
        setByteElement(term240525, 53, (byte) 1);
        setByteElement(term240525, 54, (byte) 1);
        setByteElement(term240525, 55, (byte) 1);
        setByteElement(term240525, 56, (byte) 1);
        setByteElement(term240525, 57, (byte) 1);
        setByteElement(term240525, 58, (byte) 1);
        setByteElement(term240525, 59, (byte) 1);
        setByteElement(term240525, 60, (byte) 1);
        setByteElement(term240525, 61, (byte) 1);
        setByteElement(term240525, 62, (byte) 1);
        setByteElement(term240525, 63, (byte) 1);
        setByteElement(term240525, 64, (byte) 1);
        setByteElement(term240525, 65, (byte) 1);
        setByteElement(term240525, 66, (byte) 1);
        setByteElement(term240525, 67, (byte) 1);
        setByteElement(term240525, 68, (byte) 1);
        setByteElement(term240525, 69, (byte) 1);
        setByteElement(term240525, 70, (byte) 1);
        setByteElement(term240525, 71, (byte) 1);
        setByteElement(term240525, 72, (byte) 1);
        setElement(term240521, 3, term240525);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term240521;
        callMethod(klass, "format", argTypes, term246724, args);
    }

};


