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

public class CSVFormat_getSkipHeaderRecord_128768154193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7020;
     Object term51685;

    public CSVFormat_getSkipHeaderRecord_128768154193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term7022 = new Character('T');
        Character term7025 = new Character('S');
        Character term7140 = new Character('M');
        Class<? extends Object> term51805 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term51804 = ((Class) term51805).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term51804).setAccessible(true);
        Object enum105 = ((Field) term51804).get((Object) null);
        term7020 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term7027 = (Object[]) newArray("java.lang.String", 5);
        Object[] term7088 = (Object[]) newArray("java.lang.String", 3);
        setBooleanField(term7020, term7020.getClass(), "allowMissingColumnNames", true);
        setField(term7020, term7020.getClass(), "commentMarker", term7022);
        setCharField(term7020, term7020.getClass(), "delimiter", 'y');
        setField(term7020, term7020.getClass(), "escapeCharacter", term7025);
        setElement(term7027, 0, "VeDtgDzGAN");
        setElement(term7027, 1, "aWYOWZFyaX");
        setElement(term7027, 2, "BRIVNtfUWU");
        setElement(term7027, 3, "DbiCVtPPCT");
        setElement(term7027, 4, "WzFopsaDuG");
        setField(term7020, term7020.getClass(), "header", term7027);
        setElement(term7088, 0, "PapWxkhEWe");
        setElement(term7088, 1, "smnHEqRFRx");
        setElement(term7088, 2, "XYtryyobou");
        setField(term7020, term7020.getClass(), "headerComments", term7088);
        setBooleanField(term7020, term7020.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term7020, term7020.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term7020, term7020.getClass(), "ignoreSurroundingSpaces", false);
        setField(term7020, term7020.getClass(), "nullString", "OYbzXylRWW");
        setField(term7020, term7020.getClass(), "quoteCharacter", term7140);
        setField(term7020, term7020.getClass(), "quoteMode", enum105);
        setField(term7020, term7020.getClass(), "recordSeparator", "DSNsTGYXDF");
        setBooleanField(term7020, term7020.getClass(), "skipHeaderRecord", true);
        setBooleanField(term7020, term7020.getClass(), "trailingDelimiter", true);
        setBooleanField(term7020, term7020.getClass(), "trim", false);
        Character term51686 = new Character('T');
        Character term51687 = new Character('S');
        Character term51708 = new Character('M');
        Class<? extends Object> term52105 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term52104 = ((Class) term52105).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term52104).setAccessible(true);
        Object enum106 = ((Field) term52104).get((Object) null);
        term51685 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term51688 = (Object[]) newArray("java.lang.String", 5);
        Object[] term51699 = (Object[]) newArray("java.lang.String", 3);
        setBooleanField(term51685, term51685.getClass(), "allowMissingColumnNames", true);
        setField(term51685, term51685.getClass(), "commentMarker", term51686);
        setCharField(term51685, term51685.getClass(), "delimiter", 'y');
        setField(term51685, term51685.getClass(), "escapeCharacter", term51687);
        setElement(term51688, 0, "VeDtgDzGAN");
        setElement(term51688, 1, "aWYOWZFyaX");
        setElement(term51688, 2, "BRIVNtfUWU");
        setElement(term51688, 3, "DbiCVtPPCT");
        setElement(term51688, 4, "WzFopsaDuG");
        setField(term51685, term51685.getClass(), "header", term51688);
        setElement(term51699, 0, "PapWxkhEWe");
        setElement(term51699, 1, "smnHEqRFRx");
        setElement(term51699, 2, "XYtryyobou");
        setField(term51685, term51685.getClass(), "headerComments", term51699);
        setBooleanField(term51685, term51685.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term51685, term51685.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term51685, term51685.getClass(), "ignoreSurroundingSpaces", false);
        setField(term51685, term51685.getClass(), "nullString", "OYbzXylRWW");
        setField(term51685, term51685.getClass(), "quoteCharacter", term51708);
        setField(term51685, term51685.getClass(), "quoteMode", enum106);
        setField(term51685, term51685.getClass(), "recordSeparator", "DSNsTGYXDF");
        setBooleanField(term51685, term51685.getClass(), "skipHeaderRecord", true);
        setBooleanField(term51685, term51685.getClass(), "trailingDelimiter", true);
        setBooleanField(term51685, term51685.getClass(), "trim", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSkipHeaderRecord", argTypes, term7020, args);
        assertTrue(recursiveEquals(term7020, term51685));
    }

};


