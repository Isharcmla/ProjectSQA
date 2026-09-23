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
import java.lang.Boolean;

public class CSVFormat_withSkipHeaderRecord_826587940141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29238;
     Object term29410;
     Object term110603;
     Object term110078;

    public CSVFormat_withSkipHeaderRecord_826587940141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term29240 = new Character('R');
        Character term29243 = new Character('u');
        Character term29382 = new Character('O');
        Class<? extends Object> term110747 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term110746 = ((Class) term110747).getDeclaredField((String) "MINIMAL");
        ((Field) term110746).setAccessible(true);
        Object enum225 = ((Field) term110746).get((Object) null);
        term29238 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term29245 = (Object[]) newArray("java.lang.String", 1);
        Object[] term29258 = (Object[]) newArray("java.lang.String", 9);
        setBooleanField(term29238, term29238.getClass(), "allowMissingColumnNames", true);
        setField(term29238, term29238.getClass(), "commentMarker", term29240);
        setCharField(term29238, term29238.getClass(), "delimiter", 't');
        setField(term29238, term29238.getClass(), "escapeCharacter", term29243);
        setElement(term29245, 0, "VGiXZZTWRO");
        setField(term29238, term29238.getClass(), "header", term29245);
        setElement(term29258, 0, "MlPtwXnJOJ");
        setElement(term29258, 1, "DbfiyFeaTe");
        setElement(term29258, 2, "dQxXGBtDLZ");
        setElement(term29258, 3, "EgSgEFIyyN");
        setElement(term29258, 4, "iAOFcXaLSf");
        setElement(term29258, 5, "EHoNUaeyvT");
        setElement(term29258, 6, "ZwKmasCVIy");
        setElement(term29258, 7, "pxokrVaeMd");
        setElement(term29258, 8, "ujxmmZZcbT");
        setField(term29238, term29238.getClass(), "headerComments", term29258);
        setBooleanField(term29238, term29238.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term29238, term29238.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term29238, term29238.getClass(), "ignoreSurroundingSpaces", false);
        setField(term29238, term29238.getClass(), "nullString", "BOvgwHfoHQ");
        setField(term29238, term29238.getClass(), "quoteCharacter", term29382);
        setField(term29238, term29238.getClass(), "quoteMode", enum225);
        setField(term29238, term29238.getClass(), "recordSeparator", "hPpFNeDBIb");
        setBooleanField(term29238, term29238.getClass(), "skipHeaderRecord", false);
        setBooleanField(term29238, term29238.getClass(), "trailingDelimiter", false);
        setBooleanField(term29238, term29238.getClass(), "trim", false);
        term29410 = new Boolean(true);
        Character term110604 = new Character('R');
        Character term110605 = new Character('u');
        Character term110630 = new Character('O');
        Class<? extends Object> term111055 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term111054 = ((Class) term111055).getDeclaredField((String) "MINIMAL");
        ((Field) term111054).setAccessible(true);
        Object enum226 = ((Field) term111054).get((Object) null);
        term110603 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term110606 = (Object[]) newArray("java.lang.String", 1);
        Object[] term110609 = (Object[]) newArray("java.lang.String", 9);
        setBooleanField(term110603, term110603.getClass(), "allowMissingColumnNames", true);
        setField(term110603, term110603.getClass(), "commentMarker", term110604);
        setCharField(term110603, term110603.getClass(), "delimiter", 't');
        setField(term110603, term110603.getClass(), "escapeCharacter", term110605);
        setElement(term110606, 0, "VGiXZZTWRO");
        setField(term110603, term110603.getClass(), "header", term110606);
        setElement(term110609, 0, "MlPtwXnJOJ");
        setElement(term110609, 1, "DbfiyFeaTe");
        setElement(term110609, 2, "dQxXGBtDLZ");
        setElement(term110609, 3, "EgSgEFIyyN");
        setElement(term110609, 4, "iAOFcXaLSf");
        setElement(term110609, 5, "EHoNUaeyvT");
        setElement(term110609, 6, "ZwKmasCVIy");
        setElement(term110609, 7, "pxokrVaeMd");
        setElement(term110609, 8, "ujxmmZZcbT");
        setField(term110603, term110603.getClass(), "headerComments", term110609);
        setBooleanField(term110603, term110603.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term110603, term110603.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term110603, term110603.getClass(), "ignoreSurroundingSpaces", false);
        setField(term110603, term110603.getClass(), "nullString", "BOvgwHfoHQ");
        setField(term110603, term110603.getClass(), "quoteCharacter", term110630);
        setField(term110603, term110603.getClass(), "quoteMode", enum226);
        setField(term110603, term110603.getClass(), "recordSeparator", "hPpFNeDBIb");
        setBooleanField(term110603, term110603.getClass(), "skipHeaderRecord", false);
        setBooleanField(term110603, term110603.getClass(), "trailingDelimiter", false);
        setBooleanField(term110603, term110603.getClass(), "trim", false);
        Character term110080 = new Character('R');
        Character term110083 = new Character('u');
        Character term110222 = new Character('O');
        Class<? extends Object> term111363 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term111362 = ((Class) term111363).getDeclaredField((String) "MINIMAL");
        ((Field) term111362).setAccessible(true);
        Object enum227 = ((Field) term111362).get((Object) null);
        term110078 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term110085 = (Object[]) newArray("java.lang.String", 1);
        Object[] term110098 = (Object[]) newArray("java.lang.String", 9);
        setBooleanField(term110078, term110078.getClass(), "allowMissingColumnNames", true);
        setField(term110078, term110078.getClass(), "commentMarker", term110080);
        setCharField(term110078, term110078.getClass(), "delimiter", 't');
        setField(term110078, term110078.getClass(), "escapeCharacter", term110083);
        setElement(term110085, 0, "VGiXZZTWRO");
        setField(term110078, term110078.getClass(), "header", term110085);
        setElement(term110098, 0, "MlPtwXnJOJ");
        setElement(term110098, 1, "DbfiyFeaTe");
        setElement(term110098, 2, "dQxXGBtDLZ");
        setElement(term110098, 3, "EgSgEFIyyN");
        setElement(term110098, 4, "iAOFcXaLSf");
        setElement(term110098, 5, "EHoNUaeyvT");
        setElement(term110098, 6, "ZwKmasCVIy");
        setElement(term110098, 7, "pxokrVaeMd");
        setElement(term110098, 8, "ujxmmZZcbT");
        setField(term110078, term110078.getClass(), "headerComments", term110098);
        setBooleanField(term110078, term110078.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term110078, term110078.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term110078, term110078.getClass(), "ignoreSurroundingSpaces", false);
        setField(term110078, term110078.getClass(), "nullString", "BOvgwHfoHQ");
        setField(term110078, term110078.getClass(), "quoteCharacter", term110222);
        setField(term110078, term110078.getClass(), "quoteMode", enum227);
        setField(term110078, term110078.getClass(), "recordSeparator", "hPpFNeDBIb");
        setBooleanField(term110078, term110078.getClass(), "skipHeaderRecord", true);
        setBooleanField(term110078, term110078.getClass(), "trailingDelimiter", false);
        setBooleanField(term110078, term110078.getClass(), "trim", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term29410;
        Object retValue = callMethod(klass, "withSkipHeaderRecord", argTypes, term29238, args);
        assertTrue(recursiveEquals(term29238, term110603));
        assertTrue(recursiveEquals(term29410, true));
        assertTrue(recursiveEquals(retValue, term110078));
    }

};


