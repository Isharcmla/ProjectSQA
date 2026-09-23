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
import java.lang.NullPointerException;
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Character;
import java.lang.String;

public class CSVPrinter_printRecords_141997098329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6208;

    public CSVPrinter_printRecords_141997098329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term6211 = new Character('S');
        Class<? extends Object> term18304 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term18303 = ((Class) term18304).getDeclaredField((String) "MINIMAL");
        ((Field) term18303).setAccessible(true);
        Object enum32 = ((Field) term18303).get((Object) null);
        Character term6224 = new Character('S');
        Character term6226 = new Character('b');
        term6208 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term6209 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term6255 = (Object[]) newArray("java.lang.String", 6);
        Object[] term6328 = (Object[]) newArray("java.lang.String", 6);
        setField(term6208, term6208.getClass(), "out", null);
        setCharField(term6209, term6209.getClass(), "delimiter", 'b');
        setField(term6209, term6209.getClass(), "quoteCharacter", term6211);
        setField(term6209, term6209.getClass(), "quoteMode", enum32);
        setField(term6209, term6209.getClass(), "commentMarker", term6224);
        setField(term6209, term6209.getClass(), "escapeCharacter", term6226);
        setBooleanField(term6209, term6209.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term6209, term6209.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term6209, term6209.getClass(), "ignoreEmptyLines", false);
        setField(term6209, term6209.getClass(), "recordSeparator", "mvrkADEgpp");
        setField(term6209, term6209.getClass(), "nullString", "pXOkjyeIRb");
        setElement(term6255, 0, "GgZWSjxjyE");
        setElement(term6255, 1, "EeBVbzjcCI");
        setElement(term6255, 2, "UfQtPRyWRC");
        setElement(term6255, 3, "FPvxVzzSvD");
        setElement(term6255, 4, "WHcwFgsGFC");
        setElement(term6255, 5, "HzqpegHiRq");
        setField(term6209, term6209.getClass(), "header", term6255);
        setElement(term6328, 0, "jwsfVjMoJT");
        setElement(term6328, 1, "ZfdXfCCFDf");
        setElement(term6328, 2, "MwwjNtdOFT");
        setElement(term6328, 3, "VYkqXKVlAJ");
        setElement(term6328, 4, "XkIoWJRNwN");
        setElement(term6328, 5, "aNWLJdrZMq");
        setField(term6209, term6209.getClass(), "headerComments", term6328);
        setBooleanField(term6209, term6209.getClass(), "skipHeaderRecord", true);
        setBooleanField(term6209, term6209.getClass(), "ignoreHeaderCase", false);
        setField(term6208, term6208.getClass(), "format", term6209);
        setBooleanField(term6208, term6208.getClass(), "newRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.sql.ResultSet");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "printRecords", argTypes, term6208, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


