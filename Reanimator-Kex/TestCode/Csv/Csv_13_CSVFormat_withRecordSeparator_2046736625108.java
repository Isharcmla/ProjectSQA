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
import java.lang.String;
import java.lang.Object;

public class CSVFormat_withRecordSeparator_2046736625108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22289;
     Object term22480;
     Object term93762;
     Object term93587;

    public CSVFormat_withRecordSeparator_2046736625108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term22291 = new Character('W');
        Class<? extends Object> term93800 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term93799 = ((Class) term93800).getDeclaredField((String) "NONE");
        ((Field) term93799).setAccessible(true);
        Object enum168 = ((Field) term93799).get((Object) null);
        Character term22301 = new Character('a');
        Character term22303 = new Character('H');
        term22289 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term22332 = (Object[]) newArray("java.lang.String", 4);
        Object[] term22381 = (Object[]) newArray("java.lang.String", 8);
        setCharField(term22289, term22289.getClass(), "delimiter", 'x');
        setField(term22289, term22289.getClass(), "quoteCharacter", term22291);
        setField(term22289, term22289.getClass(), "quoteMode", enum168);
        setField(term22289, term22289.getClass(), "commentMarker", term22301);
        setField(term22289, term22289.getClass(), "escapeCharacter", term22303);
        setBooleanField(term22289, term22289.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term22289, term22289.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term22289, term22289.getClass(), "ignoreEmptyLines", false);
        setField(term22289, term22289.getClass(), "recordSeparator", "EKpdCBubDE");
        setField(term22289, term22289.getClass(), "nullString", "zMsSLTfGhl");
        setElement(term22332, 0, "bEmHScVZaQ");
        setElement(term22332, 1, "TcuXODkzBV");
        setElement(term22332, 2, "coJPjrBZNe");
        setElement(term22332, 3, "vMsWjuPTnO");
        setField(term22289, term22289.getClass(), "header", term22332);
        setElement(term22381, 0, "zHvfKaOstO");
        setElement(term22381, 1, "tOszriqETr");
        setElement(term22381, 2, "ncSPTkhKjO");
        setElement(term22381, 3, "jcWKHRWhyj");
        setElement(term22381, 4, "nrQjODRMLD");
        setElement(term22381, 5, "PNoWXrsFic");
        setElement(term22381, 6, "QZBHZqZope");
        setElement(term22381, 7, "VBUahCvyxC");
        setField(term22289, term22289.getClass(), "headerComments", term22381);
        setBooleanField(term22289, term22289.getClass(), "skipHeaderRecord", false);
        setBooleanField(term22289, term22289.getClass(), "ignoreHeaderCase", false);
        term22480 = new Character('c');
        Character term93763 = new Character('W');
        Class<? extends Object> term94119 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term94118 = ((Class) term94119).getDeclaredField((String) "NONE");
        ((Field) term94118).setAccessible(true);
        Object enum169 = ((Field) term94118).get((Object) null);
        Character term93767 = new Character('a');
        Character term93768 = new Character('H');
        term93762 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term93773 = (Object[]) newArray("java.lang.String", 4);
        Object[] term93782 = (Object[]) newArray("java.lang.String", 8);
        setCharField(term93762, term93762.getClass(), "delimiter", 'x');
        setField(term93762, term93762.getClass(), "quoteCharacter", term93763);
        setField(term93762, term93762.getClass(), "quoteMode", enum169);
        setField(term93762, term93762.getClass(), "commentMarker", term93767);
        setField(term93762, term93762.getClass(), "escapeCharacter", term93768);
        setBooleanField(term93762, term93762.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term93762, term93762.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term93762, term93762.getClass(), "ignoreEmptyLines", false);
        setField(term93762, term93762.getClass(), "recordSeparator", "EKpdCBubDE");
        setField(term93762, term93762.getClass(), "nullString", "zMsSLTfGhl");
        setElement(term93773, 0, "bEmHScVZaQ");
        setElement(term93773, 1, "TcuXODkzBV");
        setElement(term93773, 2, "coJPjrBZNe");
        setElement(term93773, 3, "vMsWjuPTnO");
        setField(term93762, term93762.getClass(), "header", term93773);
        setElement(term93782, 0, "zHvfKaOstO");
        setElement(term93782, 1, "tOszriqETr");
        setElement(term93782, 2, "ncSPTkhKjO");
        setElement(term93782, 3, "jcWKHRWhyj");
        setElement(term93782, 4, "nrQjODRMLD");
        setElement(term93782, 5, "PNoWXrsFic");
        setElement(term93782, 6, "QZBHZqZope");
        setElement(term93782, 7, "VBUahCvyxC");
        setField(term93762, term93762.getClass(), "headerComments", term93782);
        setBooleanField(term93762, term93762.getClass(), "skipHeaderRecord", false);
        setBooleanField(term93762, term93762.getClass(), "ignoreHeaderCase", false);
        Character term93589 = new Character('W');
        Class<? extends Object> term94438 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term94437 = ((Class) term94438).getDeclaredField((String) "NONE");
        ((Field) term94437).setAccessible(true);
        Object enum170 = ((Field) term94437).get((Object) null);
        Character term93591 = new Character('a');
        Character term93593 = new Character('H');
        term93587 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term93613 = (Object[]) newArray("java.lang.String", 4);
        Object[] term93662 = (Object[]) newArray("java.lang.String", 8);
        setCharField(term93587, term93587.getClass(), "delimiter", 'x');
        setField(term93587, term93587.getClass(), "quoteCharacter", term93589);
        setField(term93587, term93587.getClass(), "quoteMode", enum170);
        setField(term93587, term93587.getClass(), "commentMarker", term93591);
        setField(term93587, term93587.getClass(), "escapeCharacter", term93593);
        setBooleanField(term93587, term93587.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term93587, term93587.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term93587, term93587.getClass(), "ignoreEmptyLines", false);
        setField(term93587, term93587.getClass(), "recordSeparator", "c");
        setField(term93587, term93587.getClass(), "nullString", "zMsSLTfGhl");
        setElement(term93613, 0, "bEmHScVZaQ");
        setElement(term93613, 1, "TcuXODkzBV");
        setElement(term93613, 2, "coJPjrBZNe");
        setElement(term93613, 3, "vMsWjuPTnO");
        setField(term93587, term93587.getClass(), "header", term93613);
        setElement(term93662, 0, "zHvfKaOstO");
        setElement(term93662, 1, "tOszriqETr");
        setElement(term93662, 2, "ncSPTkhKjO");
        setElement(term93662, 3, "jcWKHRWhyj");
        setElement(term93662, 4, "nrQjODRMLD");
        setElement(term93662, 5, "PNoWXrsFic");
        setElement(term93662, 6, "QZBHZqZope");
        setElement(term93662, 7, "VBUahCvyxC");
        setField(term93587, term93587.getClass(), "headerComments", term93662);
        setBooleanField(term93587, term93587.getClass(), "skipHeaderRecord", false);
        setBooleanField(term93587, term93587.getClass(), "ignoreHeaderCase", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term22480;
        Object retValue = callMethod(klass, "withRecordSeparator", argTypes, term22289, args);
        assertTrue(recursiveEquals(term22289, term93762));
        assertTrue(recursiveEquals(term22480, 'c'));
        assertTrue(recursiveEquals(retValue, term93587));
    }

};


