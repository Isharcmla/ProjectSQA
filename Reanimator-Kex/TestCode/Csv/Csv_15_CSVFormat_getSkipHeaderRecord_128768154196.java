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

public class CSVFormat_getSkipHeaderRecord_128768154196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7049;
     Object term52902;

    public CSVFormat_getSkipHeaderRecord_128768154196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term7051 = new Character('T');
        Character term7054 = new Character('S');
        Character term7169 = new Character('M');
        Class<? extends Object> term53022 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term53021 = ((Class) term53022).getDeclaredField((String) "MINIMAL");
        ((Field) term53021).setAccessible(true);
        Object enum108 = ((Field) term53021).get((Object) null);
        term7049 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term7056 = (Object[]) newArray("java.lang.String", 5);
        Object[] term7117 = (Object[]) newArray("java.lang.String", 3);
        setBooleanField(term7049, term7049.getClass(), "allowMissingColumnNames", false);
        setField(term7049, term7049.getClass(), "commentMarker", term7051);
        setCharField(term7049, term7049.getClass(), "delimiter", 'y');
        setField(term7049, term7049.getClass(), "escapeCharacter", term7054);
        setElement(term7056, 0, "VeDtgDzGAN");
        setElement(term7056, 1, "aWYOWZFyaX");
        setElement(term7056, 2, "BRIVNtfUWU");
        setElement(term7056, 3, "DbiCVtPPCT");
        setElement(term7056, 4, "WzFopsaDuG");
        setField(term7049, term7049.getClass(), "header", term7056);
        setElement(term7117, 0, "PapWxkhEWe");
        setElement(term7117, 1, "smnHEqRFRx");
        setElement(term7117, 2, "XYtryyobou");
        setField(term7049, term7049.getClass(), "headerComments", term7117);
        setBooleanField(term7049, term7049.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term7049, term7049.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term7049, term7049.getClass(), "ignoreSurroundingSpaces", false);
        setField(term7049, term7049.getClass(), "nullString", "OYbzXylRWW");
        setField(term7049, term7049.getClass(), "quoteCharacter", term7169);
        setField(term7049, term7049.getClass(), "quoteMode", enum108);
        setField(term7049, term7049.getClass(), "recordSeparator", "DSNsTGYXDF");
        setBooleanField(term7049, term7049.getClass(), "skipHeaderRecord", false);
        setBooleanField(term7049, term7049.getClass(), "trailingDelimiter", true);
        setBooleanField(term7049, term7049.getClass(), "trim", false);
        setBooleanField(term7049, term7049.getClass(), "autoFlush", true);
        Character term52903 = new Character('T');
        Character term52904 = new Character('S');
        Character term52925 = new Character('M');
        Class<? extends Object> term53310 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term53309 = ((Class) term53310).getDeclaredField((String) "MINIMAL");
        ((Field) term53309).setAccessible(true);
        Object enum109 = ((Field) term53309).get((Object) null);
        term52902 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term52905 = (Object[]) newArray("java.lang.String", 5);
        Object[] term52916 = (Object[]) newArray("java.lang.String", 3);
        setBooleanField(term52902, term52902.getClass(), "allowMissingColumnNames", false);
        setField(term52902, term52902.getClass(), "commentMarker", term52903);
        setCharField(term52902, term52902.getClass(), "delimiter", 'y');
        setField(term52902, term52902.getClass(), "escapeCharacter", term52904);
        setElement(term52905, 0, "VeDtgDzGAN");
        setElement(term52905, 1, "aWYOWZFyaX");
        setElement(term52905, 2, "BRIVNtfUWU");
        setElement(term52905, 3, "DbiCVtPPCT");
        setElement(term52905, 4, "WzFopsaDuG");
        setField(term52902, term52902.getClass(), "header", term52905);
        setElement(term52916, 0, "PapWxkhEWe");
        setElement(term52916, 1, "smnHEqRFRx");
        setElement(term52916, 2, "XYtryyobou");
        setField(term52902, term52902.getClass(), "headerComments", term52916);
        setBooleanField(term52902, term52902.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term52902, term52902.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term52902, term52902.getClass(), "ignoreSurroundingSpaces", false);
        setField(term52902, term52902.getClass(), "nullString", "OYbzXylRWW");
        setField(term52902, term52902.getClass(), "quoteCharacter", term52925);
        setField(term52902, term52902.getClass(), "quoteMode", enum109);
        setField(term52902, term52902.getClass(), "recordSeparator", "DSNsTGYXDF");
        setBooleanField(term52902, term52902.getClass(), "skipHeaderRecord", false);
        setBooleanField(term52902, term52902.getClass(), "trailingDelimiter", true);
        setBooleanField(term52902, term52902.getClass(), "trim", false);
        setBooleanField(term52902, term52902.getClass(), "autoFlush", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSkipHeaderRecord", argTypes, term7049, args);
        assertTrue(recursiveEquals(term7049, term52902));
    }

};


