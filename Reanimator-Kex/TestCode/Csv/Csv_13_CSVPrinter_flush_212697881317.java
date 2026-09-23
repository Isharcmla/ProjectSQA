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
import java.lang.Object;
import java.lang.Character;
import java.lang.String;

public class CSVPrinter_flush_212697881317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term896;
     Object term8268;

    public CSVPrinter_flush_212697881317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term899 = new Character('D');
        Class<? extends Object> term8297 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term8296 = ((Class) term8297).getDeclaredField((String) "MINIMAL");
        ((Field) term8296).setAccessible(true);
        Object enum18 = ((Field) term8296).get((Object) null);
        Character term912 = new Character('s');
        Character term914 = new Character('j');
        term896 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term897 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term943 = (Object[]) newArray("java.lang.String", 1);
        Object[] term956 = (Object[]) newArray("java.lang.String", 6);
        setField(term896, term896.getClass(), "out", null);
        setCharField(term897, term897.getClass(), "delimiter", 'T');
        setField(term897, term897.getClass(), "quoteCharacter", term899);
        setField(term897, term897.getClass(), "quoteMode", enum18);
        setField(term897, term897.getClass(), "commentMarker", term912);
        setField(term897, term897.getClass(), "escapeCharacter", term914);
        setBooleanField(term897, term897.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term897, term897.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term897, term897.getClass(), "ignoreEmptyLines", true);
        setField(term897, term897.getClass(), "recordSeparator", "hNxWaHcfhY");
        setField(term897, term897.getClass(), "nullString", "RkybSrpybU");
        setElement(term943, 0, "xOEqzGAmDU");
        setField(term897, term897.getClass(), "header", term943);
        setElement(term956, 0, "eZFUvlxvGV");
        setElement(term956, 1, "BYqFIqCKAV");
        setElement(term956, 2, "vrQLuWIDJX");
        setElement(term956, 3, "flxyYxBRtu");
        setElement(term956, 4, "OclPbYPkcH");
        setElement(term956, 5, "IoAlmYsBwc");
        setField(term897, term897.getClass(), "headerComments", term956);
        setBooleanField(term897, term897.getClass(), "skipHeaderRecord", false);
        setBooleanField(term897, term897.getClass(), "ignoreHeaderCase", false);
        setField(term896, term896.getClass(), "format", term897);
        setBooleanField(term896, term896.getClass(), "newRecord", true);
        Character term8270 = new Character('D');
        Class<? extends Object> term8719 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term8718 = ((Class) term8719).getDeclaredField((String) "MINIMAL");
        ((Field) term8718).setAccessible(true);
        Object enum19 = ((Field) term8718).get((Object) null);
        Character term8274 = new Character('s');
        Character term8275 = new Character('j');
        term8268 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term8269 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term8280 = (Object[]) newArray("java.lang.String", 1);
        Object[] term8283 = (Object[]) newArray("java.lang.String", 6);
        setField(term8268, term8268.getClass(), "out", null);
        setCharField(term8269, term8269.getClass(), "delimiter", 'T');
        setField(term8269, term8269.getClass(), "quoteCharacter", term8270);
        setField(term8269, term8269.getClass(), "quoteMode", enum19);
        setField(term8269, term8269.getClass(), "commentMarker", term8274);
        setField(term8269, term8269.getClass(), "escapeCharacter", term8275);
        setBooleanField(term8269, term8269.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term8269, term8269.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term8269, term8269.getClass(), "ignoreEmptyLines", true);
        setField(term8269, term8269.getClass(), "recordSeparator", "hNxWaHcfhY");
        setField(term8269, term8269.getClass(), "nullString", "RkybSrpybU");
        setElement(term8280, 0, "xOEqzGAmDU");
        setField(term8269, term8269.getClass(), "header", term8280);
        setElement(term8283, 0, "eZFUvlxvGV");
        setElement(term8283, 1, "BYqFIqCKAV");
        setElement(term8283, 2, "vrQLuWIDJX");
        setElement(term8283, 3, "flxyYxBRtu");
        setElement(term8283, 4, "OclPbYPkcH");
        setElement(term8283, 5, "IoAlmYsBwc");
        setField(term8269, term8269.getClass(), "headerComments", term8283);
        setBooleanField(term8269, term8269.getClass(), "skipHeaderRecord", false);
        setBooleanField(term8269, term8269.getClass(), "ignoreHeaderCase", false);
        setField(term8268, term8268.getClass(), "format", term8269);
        setBooleanField(term8268, term8268.getClass(), "newRecord", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "flush", argTypes, term896, args);
        assertTrue(recursiveEquals(term896, term8268));
    }

};


