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
import java.io.IOException;
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Character;
import java.lang.String;
import java.util.HashMap;
import java.util.ArrayList;

public class CSVParser_nextRecord_168680661329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8630;

    public CSVParser_nextRecord_168680661329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term8633 = new Character('R');
        Class<? extends Object> term26007 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term26006 = ((Class) term26007).getDeclaredField((String) "MINIMAL");
        ((Field) term26006).setAccessible(true);
        Object enum69 = ((Field) term26006).get((Object) null);
        Character term8646 = new Character('H');
        Character term8648 = new Character('y');
        HashMap term8774 = new HashMap();
        ArrayList term8814 = new ArrayList();
        ((ArrayList) term8814).add("ZfdXfCCFDf");
        ((ArrayList) term8814).add("MwwjNtdOFT");
        ((ArrayList) term8814).add("VYkqXKVlAJ");
        ((ArrayList) term8814).add("XkIoWJRNwN");
        ((ArrayList) term8814).add("aNWLJdrZMq");
        ((ArrayList) term8814).add("HHmNoYxIGj");
        ((ArrayList) term8814).add("PtirvZmsGt");
        ((ArrayList) term8814).add("HWkpTmtlrc");
        Class<? extends Object> term26364 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term26363 = ((Class) term26364).getDeclaredField((String) "INVALID");
        ((Field) term26363).setAccessible(true);
        Object enum70 = ((Field) term26363).get((Object) null);
        term8630 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term8631 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term8676 = (Object[]) newArray("java.lang.String", 8);
        Object term8785 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term8792 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        char[] term8796 = (char[]) newCharArray(3);
        Object term8806 = newInstance(Class.forName("java.lang.Object"));
        char[] term8807 = (char[]) newCharArray(6);
        Object term8915 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term8927 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term8928 = (byte[]) newByteArray(50);
        setCharField(term8631, term8631.getClass(), "delimiter", 'E');
        setField(term8631, term8631.getClass(), "quoteChar", term8633);
        setField(term8631, term8631.getClass(), "quotePolicy", enum69);
        setField(term8631, term8631.getClass(), "commentStart", term8646);
        setField(term8631, term8631.getClass(), "escape", term8648);
        setBooleanField(term8631, term8631.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term8631, term8631.getClass(), "ignoreEmptyLines", false);
        setField(term8631, term8631.getClass(), "recordSeparator", "LWyEaeIyAo");
        setField(term8631, term8631.getClass(), "nullString", "yVMkkQhvmN");
        setElement(term8676, 0, "mvrkADEgpp");
        setElement(term8676, 1, "pXOkjyeIRb");
        setElement(term8676, 2, "GgZWSjxjyE");
        setElement(term8676, 3, "EeBVbzjcCI");
        setElement(term8676, 4, "UfQtPRyWRC");
        setElement(term8676, 5, "FPvxVzzSvD");
        setElement(term8676, 6, "WHcwFgsGFC");
        setElement(term8676, 7, "HzqpegHiRq");
        setField(term8631, term8631.getClass(), "header", term8676);
        setBooleanField(term8631, term8631.getClass(), "skipHeaderRecord", true);
        setField(term8630, term8630.getClass(), "format", term8631);
        setField(term8630, term8630.getClass(), "headerMap", term8774);
        setCharField(term8785, term8785.getClass(), "delimiter", 'x');
        setCharField(term8785, term8785.getClass(), "escape", 'f');
        setCharField(term8785, term8785.getClass(), "quoteChar", 'b');
        setCharField(term8785, term8785.getClass(), "commentStart", 'S');
        setBooleanField(term8785, term8785.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term8785, term8785.getClass(), "ignoreEmptyLines", true);
        setIntField(term8792, term8792.getClass(), "lastChar", 454281060);
        setLongField(term8792, term8792.getClass(), "eolCounter", 8428634514691209827L);
        setBooleanField(term8792, term8792.getClass(), "closed", false);
        setField(term8792, term8792.getClass(), "in", null);
        setCharElement(term8796, 0, 'Q');
        setCharElement(term8796, 1, 'Y');
        setCharElement(term8796, 2, 'B');
        setField(term8792, term8792.getClass(), "cb", term8796);
        setIntField(term8792, term8792.getClass(), "nChars", -1786399638);
        setIntField(term8792, term8792.getClass(), "nextChar", 2055867847);
        setIntField(term8792, term8792.getClass(), "markedChar", -1048298087);
        setIntField(term8792, term8792.getClass(), "readAheadLimit", 292681826);
        setBooleanField(term8792, term8792.getClass(), "skipLF", true);
        setBooleanField(term8792, term8792.getClass(), "markedSkipLF", true);
        setField(term8792, term8792.getClass(), "lock", term8806);
        setCharElement(term8807, 0, 'e');
        setCharElement(term8807, 1, 'p');
        setCharElement(term8807, 2, 'C');
        setCharElement(term8807, 3, 'T');
        setCharElement(term8807, 4, 'i');
        setCharElement(term8807, 5, 'm');
        setField(term8792, term8792.getClass(), "skipBuffer", term8807);
        setField(term8785, term8785.getClass(), "reader", term8792);
        setField(term8630, term8630.getClass(), "lexer", term8785);
        setField(term8630, term8630.getClass(), "record", term8814);
        setLongField(term8630, term8630.getClass(), "recordNumber", -2585684163342970173L);
        setField(term8915, term8915.getClass(), "type", enum70);
        setField(term8927, term8927.getClass(), "value", term8928);
        setByteField(term8927, term8927.getClass(), "coder", (byte) 0);
        setIntField(term8927, term8927.getClass(), "count", 0);
        setField(term8915, term8915.getClass(), "content", term8927);
        setBooleanField(term8915, term8915.getClass(), "isReady", true);
        setField(term8630, term8630.getClass(), "reusableToken", term8915);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextRecord", argTypes, term8630, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


