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

public class CSVFormat_format_207043582782 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term880;
     Object term1013;
     Object term41607;
     Object term41634;

    public CSVFormat_format_207043582782() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term882 = new Character('j');
        Character term885 = new Character('J');
        Character term988 = new Character('A');
        Class<? extends Object> term41718 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term41717 = ((Class) term41718).getDeclaredField((String) "ALL");
        ((Field) term41717).setAccessible(true);
        Object enum79 = ((Field) term41717).get((Object) null);
        term880 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term887 = (Object[]) newArray("java.lang.String", 1);
        Object[] term900 = (Object[]) newArray("java.lang.String", 6);
        setBooleanField(term880, term880.getClass(), "allowMissingColumnNames", true);
        setField(term880, term880.getClass(), "commentMarker", term882);
        setCharField(term880, term880.getClass(), "delimiter", 'l');
        setField(term880, term880.getClass(), "escapeCharacter", term885);
        setElement(term887, 0, "ZiaGIbnzTs");
        setField(term880, term880.getClass(), "header", term887);
        setElement(term900, 0, "tbcdzjIfER");
        setElement(term900, 1, "HyxfbSQYBe");
        setElement(term900, 2, "pCTimMblYc");
        setElement(term900, 3, "hNxWaHcfhY");
        setElement(term900, 4, "RkybSrpybU");
        setElement(term900, 5, "xOEqzGAmDU");
        setField(term880, term880.getClass(), "headerComments", term900);
        setBooleanField(term880, term880.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term880, term880.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term880, term880.getClass(), "ignoreSurroundingSpaces", false);
        setField(term880, term880.getClass(), "nullString", "eZFUvlxvGV");
        setField(term880, term880.getClass(), "quoteCharacter", term988);
        setField(term880, term880.getClass(), "quoteMode", enum79);
        setField(term880, term880.getClass(), "recordSeparator", "BYqFIqCKAV");
        setBooleanField(term880, term880.getClass(), "skipHeaderRecord", true);
        setBooleanField(term880, term880.getClass(), "trailingDelimiter", true);
        setBooleanField(term880, term880.getClass(), "trim", true);
        setBooleanField(term880, term880.getClass(), "autoFlush", true);
        term1013 = (Object[]) newArray("java.lang.Object", 2);
        Object term1014 = newInstance(Class.forName("java.lang.Object"));
        Object term1015 = newInstance(Class.forName("java.lang.Object"));
        setElement(term1013, 0, term1014);
        setElement(term1013, 1, term1015);
        Character term41608 = new Character('j');
        Character term41609 = new Character('J');
        Character term41628 = new Character('A');
        Class<? extends Object> term41984 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term41983 = ((Class) term41984).getDeclaredField((String) "ALL");
        ((Field) term41983).setAccessible(true);
        Object enum80 = ((Field) term41983).get((Object) null);
        term41607 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term41610 = (Object[]) newArray("java.lang.String", 1);
        Object[] term41613 = (Object[]) newArray("java.lang.String", 6);
        setBooleanField(term41607, term41607.getClass(), "allowMissingColumnNames", true);
        setField(term41607, term41607.getClass(), "commentMarker", term41608);
        setCharField(term41607, term41607.getClass(), "delimiter", 'l');
        setField(term41607, term41607.getClass(), "escapeCharacter", term41609);
        setElement(term41610, 0, "ZiaGIbnzTs");
        setField(term41607, term41607.getClass(), "header", term41610);
        setElement(term41613, 0, "tbcdzjIfER");
        setElement(term41613, 1, "HyxfbSQYBe");
        setElement(term41613, 2, "pCTimMblYc");
        setElement(term41613, 3, "hNxWaHcfhY");
        setElement(term41613, 4, "RkybSrpybU");
        setElement(term41613, 5, "xOEqzGAmDU");
        setField(term41607, term41607.getClass(), "headerComments", term41613);
        setBooleanField(term41607, term41607.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term41607, term41607.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term41607, term41607.getClass(), "ignoreSurroundingSpaces", false);
        setField(term41607, term41607.getClass(), "nullString", "eZFUvlxvGV");
        setField(term41607, term41607.getClass(), "quoteCharacter", term41628);
        setField(term41607, term41607.getClass(), "quoteMode", enum80);
        setField(term41607, term41607.getClass(), "recordSeparator", "BYqFIqCKAV");
        setBooleanField(term41607, term41607.getClass(), "skipHeaderRecord", true);
        setBooleanField(term41607, term41607.getClass(), "trailingDelimiter", true);
        setBooleanField(term41607, term41607.getClass(), "trim", true);
        setBooleanField(term41607, term41607.getClass(), "autoFlush", true);
        term41634 = (Object[]) newArray("java.lang.Object", 2);
        Object term41635 = newInstance(Class.forName("java.lang.Object"));
        Object term41636 = newInstance(Class.forName("java.lang.Object"));
        setElement(term41634, 0, term41635);
        setElement(term41634, 1, term41636);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1013;
        Object retValue = callMethod(klass, "format", argTypes, term880, args);
        assertTrue(recursiveEquals(term880, term41607));
        assertTrue(recursiveEquals(term1013, term41634));
        assertTrue(recursiveEquals(retValue, "j tbcdzjIfERlBYqFIqCKAVj HyxfbSQYBelBYqFIqCKAVj pCTimMblYclBYqFIqCKAVj hNxWaHcfhYlBYqFIqCKAVj RkybSrpybUlBYqFIqCKAVj xOEqzGAmDUlBYqFIqCKAVAjava.lang.Object@4cc6787fAlAjava.lang.Object@524c8a6bAlBYqFIqCKAV"));
    }

};


