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

public class CSVFormat_format_2070435827156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73896;
     Object term72780;

    public CSVFormat_format_2070435827156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term73948 = new Character((char) 0);
        Character term74000 = new Character((char) 0);
        Character term74052 = new Character((char) 16);
        Class<? extends Object> term74154 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term74153 = ((Class) term74154).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term74153).setAccessible(true);
        Object enum155 = ((Field) term74153).get((Object) null);
        term73896 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term72904 = (Object[]) newArray("java.lang.String", 0);
        setField(term73896, term73896.getClass(), "quoteChar", term73948);
        setCharField(term73896, term73896.getClass(), "delimiter", 'p');
        setField(term73896, term73896.getClass(), "escape", term74000);
        setField(term73896, term73896.getClass(), "commentStart", term74052);
        setField(term73896, term73896.getClass(), "header", term72904);
        setField(term73896, term73896.getClass(), "quotePolicy", enum155);
        term72780 = (Object[]) newArray("java.lang.String", 4);
        byte[] term72781 = (byte[]) newByteArray(17);
        setByteElement(term72781, 0, (byte) 112);
        setByteElement(term72781, 1, (byte) -128);
        setByteElement(term72781, 3, (byte) 8);
        setByteElement(term72781, 4, (byte) 4);
        setByteElement(term72781, 6, (byte) 4);
        setByteElement(term72781, 8, (byte) 2);
        setByteElement(term72781, 9, (byte) 32);
        setByteElement(term72781, 10, (byte) 16);
        setByteElement(term72781, 11, (byte) 16);
        setByteElement(term72781, 14, (byte) -128);
        setByteElement(term72781, 15, (byte) -128);
        setByteElement(term72781, 16, (byte) 2);
        setElement(term72780, 0, term72781);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term72780;
        callMethod(klass, "format", argTypes, term73896, args);
    }

};


