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
import java.lang.IllegalArgumentException;
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Character;
import java.lang.String;
import java.lang.Object;

public class CSVFormat_withHeader_115835227494 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15604;

    public CSVFormat_withHeader_115835227494() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term15606 = new Character('Y');
        Class<? extends Object> term72575 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term72574 = ((Class) term72575).getDeclaredField((String) "MINIMAL");
        ((Field) term72574).setAccessible(true);
        Object enum128 = ((Field) term72574).get((Object) null);
        Character term15619 = new Character('n');
        Character term15621 = new Character('L');
        term15604 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term15650 = (Object[]) newArray("java.lang.String", 6);
        Object[] term15723 = (Object[]) newArray("java.lang.String", 5);
        setCharField(term15604, term15604.getClass(), "delimiter", 'n');
        setField(term15604, term15604.getClass(), "quoteCharacter", term15606);
        setField(term15604, term15604.getClass(), "quoteMode", enum128);
        setField(term15604, term15604.getClass(), "commentMarker", term15619);
        setField(term15604, term15604.getClass(), "escapeCharacter", term15621);
        setBooleanField(term15604, term15604.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term15604, term15604.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term15604, term15604.getClass(), "ignoreEmptyLines", false);
        setField(term15604, term15604.getClass(), "recordSeparator", "KSJeYkkvpk");
        setField(term15604, term15604.getClass(), "nullString", "qUtkFGMNUV");
        setElement(term15650, 0, "mGRiYhnMcR");
        setElement(term15650, 1, "NFlvfJCVPO");
        setElement(term15650, 2, "KarbTXFmUU");
        setElement(term15650, 3, "jiUSjqwSIQ");
        setElement(term15650, 4, "MgLCedQfoj");
        setElement(term15650, 5, "zgKiINdgNu");
        setField(term15604, term15604.getClass(), "header", term15650);
        setElement(term15723, 0, "zLMTXDQHYH");
        setElement(term15723, 1, "PqywFWJlpE");
        setElement(term15723, 2, "OzXRsFGTIp");
        setElement(term15723, 3, "TjWpyghUWN");
        setElement(term15723, 4, "dkZFDZxcde");
        setField(term15604, term15604.getClass(), "headerComments", term15723);
        setBooleanField(term15604, term15604.getClass(), "skipHeaderRecord", true);
        setBooleanField(term15604, term15604.getClass(), "ignoreHeaderCase", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.sql.ResultSetMetaData");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "withHeader", argTypes, term15604, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


