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

public class CSVPrinter_close_54107623916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term482;
     Object term7547;

    public CSVPrinter_close_54107623916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term485 = new Character('n');
        Class<? extends Object> term7576 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term7575 = ((Class) term7576).getDeclaredField((String) "MINIMAL");
        ((Field) term7575).setAccessible(true);
        Object enum16 = ((Field) term7575).get((Object) null);
        Character term498 = new Character('Z');
        Character term500 = new Character('t');
        term482 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term483 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term529 = (Object[]) newArray("java.lang.String", 3);
        Object[] term566 = (Object[]) newArray("java.lang.String", 4);
        setField(term482, term482.getClass(), "out", null);
        setCharField(term483, term483.getClass(), "delimiter", 't');
        setField(term483, term483.getClass(), "quoteCharacter", term485);
        setField(term483, term483.getClass(), "quoteMode", enum16);
        setField(term483, term483.getClass(), "commentMarker", term498);
        setField(term483, term483.getClass(), "escapeCharacter", term500);
        setBooleanField(term483, term483.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term483, term483.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term483, term483.getClass(), "ignoreEmptyLines", true);
        setField(term483, term483.getClass(), "recordSeparator", "uuaPigETmJ");
        setField(term483, term483.getClass(), "nullString", "MxlszYVzRf");
        setElement(term529, 0, "LQFpaHEwXR");
        setElement(term529, 1, "oVcInYnLWB");
        setElement(term529, 2, "aJlieCFVtF");
        setField(term483, term483.getClass(), "header", term529);
        setElement(term566, 0, "ZiaGIbnzTs");
        setElement(term566, 1, "tbcdzjIfER");
        setElement(term566, 2, "HyxfbSQYBe");
        setElement(term566, 3, "pCTimMblYc");
        setField(term483, term483.getClass(), "headerComments", term566);
        setBooleanField(term483, term483.getClass(), "skipHeaderRecord", false);
        setBooleanField(term483, term483.getClass(), "ignoreHeaderCase", true);
        setField(term482, term482.getClass(), "format", term483);
        setBooleanField(term482, term482.getClass(), "newRecord", false);
        Character term7549 = new Character('n');
        Class<? extends Object> term7854 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term7853 = ((Class) term7854).getDeclaredField((String) "MINIMAL");
        ((Field) term7853).setAccessible(true);
        Object enum17 = ((Field) term7853).get((Object) null);
        Character term7553 = new Character('Z');
        Character term7554 = new Character('t');
        term7547 = newInstance(Class.forName("org.apache.commons.csv.CSVPrinter"));
        Object term7548 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term7559 = (Object[]) newArray("java.lang.String", 3);
        Object[] term7566 = (Object[]) newArray("java.lang.String", 4);
        setField(term7547, term7547.getClass(), "out", null);
        setCharField(term7548, term7548.getClass(), "delimiter", 't');
        setField(term7548, term7548.getClass(), "quoteCharacter", term7549);
        setField(term7548, term7548.getClass(), "quoteMode", enum17);
        setField(term7548, term7548.getClass(), "commentMarker", term7553);
        setField(term7548, term7548.getClass(), "escapeCharacter", term7554);
        setBooleanField(term7548, term7548.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term7548, term7548.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term7548, term7548.getClass(), "ignoreEmptyLines", true);
        setField(term7548, term7548.getClass(), "recordSeparator", "uuaPigETmJ");
        setField(term7548, term7548.getClass(), "nullString", "MxlszYVzRf");
        setElement(term7559, 0, "LQFpaHEwXR");
        setElement(term7559, 1, "oVcInYnLWB");
        setElement(term7559, 2, "aJlieCFVtF");
        setField(term7548, term7548.getClass(), "header", term7559);
        setElement(term7566, 0, "ZiaGIbnzTs");
        setElement(term7566, 1, "tbcdzjIfER");
        setElement(term7566, 2, "HyxfbSQYBe");
        setElement(term7566, 3, "pCTimMblYc");
        setField(term7548, term7548.getClass(), "headerComments", term7566);
        setBooleanField(term7548, term7548.getClass(), "skipHeaderRecord", false);
        setBooleanField(term7548, term7548.getClass(), "ignoreHeaderCase", true);
        setField(term7547, term7547.getClass(), "format", term7548);
        setBooleanField(term7547, term7547.getClass(), "newRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVPrinter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term482, args);
        assertTrue(recursiveEquals(term482, term7547));
    }

};


