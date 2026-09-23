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

public class CSVFormat_withHeader_269759087126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22640;
     Object term22785;
     Object term88988;
     Object term89017;
     Object term88631;

    public CSVFormat_withHeader_269759087126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term22642 = new Character('a');
        Character term22645 = new Character('c');
        Character term22760 = new Character('f');
        Class<? extends Object> term89117 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term89116 = ((Class) term89117).getDeclaredField((String) "NONE");
        ((Field) term89116).setAccessible(true);
        Object enum178 = ((Field) term89116).get((Object) null);
        term22640 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term22647 = (Object[]) newArray("java.lang.String", 8);
        Object[] term22744 = (Object[]) newArray("java.lang.String", 0);
        setBooleanField(term22640, term22640.getClass(), "allowMissingColumnNames", true);
        setField(term22640, term22640.getClass(), "commentMarker", term22642);
        setCharField(term22640, term22640.getClass(), "delimiter", 'H');
        setField(term22640, term22640.getClass(), "escapeCharacter", term22645);
        setElement(term22647, 0, "bEmHScVZaQ");
        setElement(term22647, 1, "TcuXODkzBV");
        setElement(term22647, 2, "coJPjrBZNe");
        setElement(term22647, 3, "vMsWjuPTnO");
        setElement(term22647, 4, "zHvfKaOstO");
        setElement(term22647, 5, "tOszriqETr");
        setElement(term22647, 6, "ncSPTkhKjO");
        setElement(term22647, 7, "jcWKHRWhyj");
        setField(term22640, term22640.getClass(), "header", term22647);
        setField(term22640, term22640.getClass(), "headerComments", term22744);
        setBooleanField(term22640, term22640.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term22640, term22640.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term22640, term22640.getClass(), "ignoreSurroundingSpaces", true);
        setField(term22640, term22640.getClass(), "nullString", "nrQjODRMLD");
        setField(term22640, term22640.getClass(), "quoteCharacter", term22760);
        setField(term22640, term22640.getClass(), "quoteMode", enum178);
        setField(term22640, term22640.getClass(), "recordSeparator", "PNoWXrsFic");
        setBooleanField(term22640, term22640.getClass(), "skipHeaderRecord", false);
        setBooleanField(term22640, term22640.getClass(), "trailingDelimiter", true);
        setBooleanField(term22640, term22640.getClass(), "trim", true);
        term22785 = (Object[]) newArray("java.lang.String", 4);
        setElement(term22785, 0, "QZBHZqZope");
        setElement(term22785, 1, "VBUahCvyxC");
        setElement(term22785, 2, "MlzTkzKMCX");
        setElement(term22785, 3, "UqKUbMyPMJ");
        Character term88989 = new Character('a');
        Character term88990 = new Character('c');
        Character term89011 = new Character('f');
        Class<? extends Object> term89436 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term89435 = ((Class) term89436).getDeclaredField((String) "NONE");
        ((Field) term89435).setAccessible(true);
        Object enum179 = ((Field) term89435).get((Object) null);
        term88988 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term88991 = (Object[]) newArray("java.lang.String", 8);
        Object[] term89008 = (Object[]) newArray("java.lang.String", 0);
        setBooleanField(term88988, term88988.getClass(), "allowMissingColumnNames", true);
        setField(term88988, term88988.getClass(), "commentMarker", term88989);
        setCharField(term88988, term88988.getClass(), "delimiter", 'H');
        setField(term88988, term88988.getClass(), "escapeCharacter", term88990);
        setElement(term88991, 0, "bEmHScVZaQ");
        setElement(term88991, 1, "TcuXODkzBV");
        setElement(term88991, 2, "coJPjrBZNe");
        setElement(term88991, 3, "vMsWjuPTnO");
        setElement(term88991, 4, "zHvfKaOstO");
        setElement(term88991, 5, "tOszriqETr");
        setElement(term88991, 6, "ncSPTkhKjO");
        setElement(term88991, 7, "jcWKHRWhyj");
        setField(term88988, term88988.getClass(), "header", term88991);
        setField(term88988, term88988.getClass(), "headerComments", term89008);
        setBooleanField(term88988, term88988.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term88988, term88988.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term88988, term88988.getClass(), "ignoreSurroundingSpaces", true);
        setField(term88988, term88988.getClass(), "nullString", "nrQjODRMLD");
        setField(term88988, term88988.getClass(), "quoteCharacter", term89011);
        setField(term88988, term88988.getClass(), "quoteMode", enum179);
        setField(term88988, term88988.getClass(), "recordSeparator", "PNoWXrsFic");
        setBooleanField(term88988, term88988.getClass(), "skipHeaderRecord", false);
        setBooleanField(term88988, term88988.getClass(), "trailingDelimiter", true);
        setBooleanField(term88988, term88988.getClass(), "trim", true);
        term89017 = (Object[]) newArray("java.lang.String", 4);
        setElement(term89017, 0, "QZBHZqZope");
        setElement(term89017, 1, "VBUahCvyxC");
        setElement(term89017, 2, "MlzTkzKMCX");
        setElement(term89017, 3, "UqKUbMyPMJ");
        Character term88633 = new Character('a');
        Character term88636 = new Character('c');
        Character term88703 = new Character('f');
        Class<? extends Object> term89715 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term89714 = ((Class) term89715).getDeclaredField((String) "NONE");
        ((Field) term89714).setAccessible(true);
        Object enum180 = ((Field) term89714).get((Object) null);
        term88631 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term88638 = (Object[]) newArray("java.lang.String", 4);
        Object[] term88687 = (Object[]) newArray("java.lang.String", 0);
        setBooleanField(term88631, term88631.getClass(), "allowMissingColumnNames", true);
        setField(term88631, term88631.getClass(), "commentMarker", term88633);
        setCharField(term88631, term88631.getClass(), "delimiter", 'H');
        setField(term88631, term88631.getClass(), "escapeCharacter", term88636);
        setElement(term88638, 0, "QZBHZqZope");
        setElement(term88638, 1, "VBUahCvyxC");
        setElement(term88638, 2, "MlzTkzKMCX");
        setElement(term88638, 3, "UqKUbMyPMJ");
        setField(term88631, term88631.getClass(), "header", term88638);
        setField(term88631, term88631.getClass(), "headerComments", term88687);
        setBooleanField(term88631, term88631.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term88631, term88631.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term88631, term88631.getClass(), "ignoreSurroundingSpaces", true);
        setField(term88631, term88631.getClass(), "nullString", "nrQjODRMLD");
        setField(term88631, term88631.getClass(), "quoteCharacter", term88703);
        setField(term88631, term88631.getClass(), "quoteMode", enum180);
        setField(term88631, term88631.getClass(), "recordSeparator", "PNoWXrsFic");
        setBooleanField(term88631, term88631.getClass(), "skipHeaderRecord", false);
        setBooleanField(term88631, term88631.getClass(), "trailingDelimiter", true);
        setBooleanField(term88631, term88631.getClass(), "trim", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term22785;
        Object retValue = callMethod(klass, "withHeader", argTypes, term22640, args);
        assertTrue(recursiveEquals(term22640, term88988));
        assertTrue(recursiveEquals(term22785, term89017));
        assertTrue(recursiveEquals(retValue, term88631));
    }

};


