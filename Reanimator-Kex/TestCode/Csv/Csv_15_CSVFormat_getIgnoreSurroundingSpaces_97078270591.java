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

public class CSVFormat_getIgnoreSurroundingSpaces_97078270591 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4794;
     Object term48798;

    public CSVFormat_getIgnoreSurroundingSpaces_97078270591() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term4796 = new Character('a');
        Character term4799 = new Character('W');
        Character term4914 = new Character('E');
        Class<? extends Object> term49115 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term49114 = ((Class) term49115).getDeclaredField((String) "NONE");
        ((Field) term49114).setAccessible(true);
        Object enum97 = ((Field) term49114).get((Object) null);
        term4794 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term4801 = (Object[]) newArray("java.lang.String", 3);
        Object[] term4838 = (Object[]) newArray("java.lang.String", 5);
        setBooleanField(term4794, term4794.getClass(), "allowMissingColumnNames", false);
        setField(term4794, term4794.getClass(), "commentMarker", term4796);
        setCharField(term4794, term4794.getClass(), "delimiter", 'n');
        setField(term4794, term4794.getClass(), "escapeCharacter", term4799);
        setElement(term4801, 0, "qxSDVejjiY");
        setElement(term4801, 1, "xBsXSDjXYK");
        setElement(term4801, 2, "sEnIVFtZuQ");
        setField(term4794, term4794.getClass(), "header", term4801);
        setElement(term4838, 0, "ZVecLZMLHF");
        setElement(term4838, 1, "fztQhjqwdP");
        setElement(term4838, 2, "eVpkWxjuki");
        setElement(term4838, 3, "SJiQaLvSKv");
        setElement(term4838, 4, "OEXDRUKcFl");
        setField(term4794, term4794.getClass(), "headerComments", term4838);
        setBooleanField(term4794, term4794.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term4794, term4794.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term4794, term4794.getClass(), "ignoreSurroundingSpaces", true);
        setField(term4794, term4794.getClass(), "nullString", "RYdKCNNMBR");
        setField(term4794, term4794.getClass(), "quoteCharacter", term4914);
        setField(term4794, term4794.getClass(), "quoteMode", enum97);
        setField(term4794, term4794.getClass(), "recordSeparator", "yGtHPyvYiQ");
        setBooleanField(term4794, term4794.getClass(), "skipHeaderRecord", true);
        setBooleanField(term4794, term4794.getClass(), "trailingDelimiter", true);
        setBooleanField(term4794, term4794.getClass(), "trim", false);
        setBooleanField(term4794, term4794.getClass(), "autoFlush", false);
        Character term48799 = new Character('a');
        Character term48800 = new Character('W');
        Character term48821 = new Character('E');
        Class<? extends Object> term49428 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term49427 = ((Class) term49428).getDeclaredField((String) "NONE");
        ((Field) term49427).setAccessible(true);
        Object enum98 = ((Field) term49427).get((Object) null);
        term48798 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term48801 = (Object[]) newArray("java.lang.String", 3);
        Object[] term48808 = (Object[]) newArray("java.lang.String", 5);
        setBooleanField(term48798, term48798.getClass(), "allowMissingColumnNames", false);
        setField(term48798, term48798.getClass(), "commentMarker", term48799);
        setCharField(term48798, term48798.getClass(), "delimiter", 'n');
        setField(term48798, term48798.getClass(), "escapeCharacter", term48800);
        setElement(term48801, 0, "qxSDVejjiY");
        setElement(term48801, 1, "xBsXSDjXYK");
        setElement(term48801, 2, "sEnIVFtZuQ");
        setField(term48798, term48798.getClass(), "header", term48801);
        setElement(term48808, 0, "ZVecLZMLHF");
        setElement(term48808, 1, "fztQhjqwdP");
        setElement(term48808, 2, "eVpkWxjuki");
        setElement(term48808, 3, "SJiQaLvSKv");
        setElement(term48808, 4, "OEXDRUKcFl");
        setField(term48798, term48798.getClass(), "headerComments", term48808);
        setBooleanField(term48798, term48798.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term48798, term48798.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term48798, term48798.getClass(), "ignoreSurroundingSpaces", true);
        setField(term48798, term48798.getClass(), "nullString", "RYdKCNNMBR");
        setField(term48798, term48798.getClass(), "quoteCharacter", term48821);
        setField(term48798, term48798.getClass(), "quoteMode", enum98);
        setField(term48798, term48798.getClass(), "recordSeparator", "yGtHPyvYiQ");
        setBooleanField(term48798, term48798.getClass(), "skipHeaderRecord", true);
        setBooleanField(term48798, term48798.getClass(), "trailingDelimiter", true);
        setBooleanField(term48798, term48798.getClass(), "trim", false);
        setBooleanField(term48798, term48798.getClass(), "autoFlush", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIgnoreSurroundingSpaces", argTypes, term4794, args);
        assertTrue(recursiveEquals(term4794, term48798));
    }

};


