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

public class CSVFormat_format_207043582779 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term829;
     Object term965;
     Object term40257;
     Object term40284;

    public CSVFormat_format_207043582779() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term831 = new Character('j');
        Character term834 = new Character('J');
        Character term937 = new Character('A');
        Class<? extends Object> term40368 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term40367 = ((Class) term40368).getDeclaredField((String) "MINIMAL");
        ((Field) term40367).setAccessible(true);
        Object enum76 = ((Field) term40367).get((Object) null);
        term829 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term836 = (Object[]) newArray("java.lang.String", 1);
        Object[] term849 = (Object[]) newArray("java.lang.String", 6);
        setBooleanField(term829, term829.getClass(), "allowMissingColumnNames", false);
        setField(term829, term829.getClass(), "commentMarker", term831);
        setCharField(term829, term829.getClass(), "delimiter", 'l');
        setField(term829, term829.getClass(), "escapeCharacter", term834);
        setElement(term836, 0, "ZiaGIbnzTs");
        setField(term829, term829.getClass(), "header", term836);
        setElement(term849, 0, "tbcdzjIfER");
        setElement(term849, 1, "HyxfbSQYBe");
        setElement(term849, 2, "pCTimMblYc");
        setElement(term849, 3, "hNxWaHcfhY");
        setElement(term849, 4, "RkybSrpybU");
        setElement(term849, 5, "xOEqzGAmDU");
        setField(term829, term829.getClass(), "headerComments", term849);
        setBooleanField(term829, term829.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term829, term829.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term829, term829.getClass(), "ignoreSurroundingSpaces", true);
        setField(term829, term829.getClass(), "nullString", "eZFUvlxvGV");
        setField(term829, term829.getClass(), "quoteCharacter", term937);
        setField(term829, term829.getClass(), "quoteMode", enum76);
        setField(term829, term829.getClass(), "recordSeparator", "BYqFIqCKAV");
        setBooleanField(term829, term829.getClass(), "skipHeaderRecord", false);
        setBooleanField(term829, term829.getClass(), "trailingDelimiter", false);
        setBooleanField(term829, term829.getClass(), "trim", true);
        term965 = (Object[]) newArray("java.lang.Object", 2);
        Object term966 = newInstance(Class.forName("java.lang.Object"));
        Object term967 = newInstance(Class.forName("java.lang.Object"));
        setElement(term965, 0, term966);
        setElement(term965, 1, term967);
        Character term40258 = new Character('j');
        Character term40259 = new Character('J');
        Character term40278 = new Character('A');
        Class<? extends Object> term40646 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term40645 = ((Class) term40646).getDeclaredField((String) "MINIMAL");
        ((Field) term40645).setAccessible(true);
        Object enum77 = ((Field) term40645).get((Object) null);
        term40257 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term40260 = (Object[]) newArray("java.lang.String", 1);
        Object[] term40263 = (Object[]) newArray("java.lang.String", 6);
        setBooleanField(term40257, term40257.getClass(), "allowMissingColumnNames", false);
        setField(term40257, term40257.getClass(), "commentMarker", term40258);
        setCharField(term40257, term40257.getClass(), "delimiter", 'l');
        setField(term40257, term40257.getClass(), "escapeCharacter", term40259);
        setElement(term40260, 0, "ZiaGIbnzTs");
        setField(term40257, term40257.getClass(), "header", term40260);
        setElement(term40263, 0, "tbcdzjIfER");
        setElement(term40263, 1, "HyxfbSQYBe");
        setElement(term40263, 2, "pCTimMblYc");
        setElement(term40263, 3, "hNxWaHcfhY");
        setElement(term40263, 4, "RkybSrpybU");
        setElement(term40263, 5, "xOEqzGAmDU");
        setField(term40257, term40257.getClass(), "headerComments", term40263);
        setBooleanField(term40257, term40257.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term40257, term40257.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term40257, term40257.getClass(), "ignoreSurroundingSpaces", true);
        setField(term40257, term40257.getClass(), "nullString", "eZFUvlxvGV");
        setField(term40257, term40257.getClass(), "quoteCharacter", term40278);
        setField(term40257, term40257.getClass(), "quoteMode", enum77);
        setField(term40257, term40257.getClass(), "recordSeparator", "BYqFIqCKAV");
        setBooleanField(term40257, term40257.getClass(), "skipHeaderRecord", false);
        setBooleanField(term40257, term40257.getClass(), "trailingDelimiter", false);
        setBooleanField(term40257, term40257.getClass(), "trim", true);
        term40284 = (Object[]) newArray("java.lang.Object", 2);
        Object term40285 = newInstance(Class.forName("java.lang.Object"));
        Object term40286 = newInstance(Class.forName("java.lang.Object"));
        setElement(term40284, 0, term40285);
        setElement(term40284, 1, term40286);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term965;
        Object retValue = callMethod(klass, "format", argTypes, term829, args);
        assertTrue(recursiveEquals(term829, term40257));
        assertTrue(recursiveEquals(term965, term40284));
        assertTrue(recursiveEquals(retValue, "j tbcdzjIfERBYqFIqCKAVj HyxfbSQYBeBYqFIqCKAVj pCTimMblYcBYqFIqCKAVj hNxWaHcfhYBYqFIqCKAVj RkybSrpybUBYqFIqCKAVj xOEqzGAmDUBYqFIqCKAVZiaGIbnzTsBYqFIqCKAVAjava.lang.Object@34508d90AlAjava.lang.Object@59658b5cABYqFIqCKAV"));
    }

};


