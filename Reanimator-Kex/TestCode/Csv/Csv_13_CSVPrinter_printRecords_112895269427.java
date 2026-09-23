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

public class CSVPrinter_printRecords_112895269427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5235;

    public CSVPrinter_printRecords_112895269427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term5238 = new Character('W');
        Class<? extends Object> term16093 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term16092 = ((Class) term16093).getDeclaredField((String) "MINIMAL");
        ((Field) term16092).setAccessible(true);
        Object enum30 = ((Field) term16092).get((Object) null);
        Character term5251 = new Character('E');
        Character term5253 = new Character('G');
        term5235 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term5236 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term5282 = (Object[]) newArray("java.lang.String", 6);
        Object[] term5355 = (Object[]) newArray("java.lang.String", 5);
        setField(term5235, term5235.getClass(), "out", null);
        setCharField(term5236, term5236.getClass(), "delimiter", 'n');
        setField(term5236, term5236.getClass(), "quoteCharacter", term5238);
        setField(term5236, term5236.getClass(), "quoteMode", enum30);
        setField(term5236, term5236.getClass(), "commentMarker", term5251);
        setField(term5236, term5236.getClass(), "escapeCharacter", term5253);
        setBooleanField(term5236, term5236.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term5236, term5236.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term5236, term5236.getClass(), "ignoreEmptyLines", false);
        setField(term5236, term5236.getClass(), "recordSeparator", "XylxrMBraH");
        setField(term5236, term5236.getClass(), "nullString", "pORebkoRdD");
        setElement(term5282, 0, "mXGCWJDOqA");
        setElement(term5282, 1, "dpNsDgfPso");
        setElement(term5282, 2, "hCWPJQKpdc");
        setElement(term5282, 3, "WzMEhMXkKx");
        setElement(term5282, 4, "XOiDvlDhdc");
        setElement(term5282, 5, "AdxvLJhNLe");
        setField(term5236, term5236.getClass(), "header", term5282);
        setElement(term5355, 0, "lHfTrWKMPk");
        setElement(term5355, 1, "JDaAnsVTGV");
        setElement(term5355, 2, "mLUZFTfjle");
        setElement(term5355, 3, "xIeFjkHkOe");
        setElement(term5355, 4, "SdCKLMIYnX");
        setField(term5236, term5236.getClass(), "headerComments", term5355);
        setBooleanField(term5236, term5236.getClass(), "skipHeaderRecord", false);
        setBooleanField(term5236, term5236.getClass(), "ignoreHeaderCase", false);
        setField(term5235, term5235.getClass(), "format", term5236);
        setBooleanField(term5235, term5235.getClass(), "newRecord", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Iterable");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "printRecords", argTypes, term5235, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


