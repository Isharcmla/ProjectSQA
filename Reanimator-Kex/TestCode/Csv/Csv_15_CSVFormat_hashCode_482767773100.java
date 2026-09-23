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

public class CSVFormat_hashCode_482767773100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8789;
     Object term56771;

    public CSVFormat_hashCode_482767773100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term8791 = new Character('S');
        Character term8794 = new Character('Y');
        Character term8981 = new Character('Y');
        Class<? extends Object> term56963 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term56962 = ((Class) term56963).getDeclaredField((String) "NONE");
        ((Field) term56962).setAccessible(true);
        Object enum116 = ((Field) term56962).get((Object) null);
        term8789 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term8796 = (Object[]) newArray("java.lang.String", 8);
        Object[] term8893 = (Object[]) newArray("java.lang.String", 6);
        setBooleanField(term8789, term8789.getClass(), "allowMissingColumnNames", false);
        setField(term8789, term8789.getClass(), "commentMarker", term8791);
        setCharField(term8789, term8789.getClass(), "delimiter", 'z');
        setField(term8789, term8789.getClass(), "escapeCharacter", term8794);
        setElement(term8796, 0, "iikZEapDlu");
        setElement(term8796, 1, "nhoHrZfnIN");
        setElement(term8796, 2, "ZkMALXpEAZ");
        setElement(term8796, 3, "tXfQjSqDzN");
        setElement(term8796, 4, "BjugTaMcxJ");
        setElement(term8796, 5, "vGiuZVPJNH");
        setElement(term8796, 6, "tlzpzIjMib");
        setElement(term8796, 7, "AZdLeSugwv");
        setField(term8789, term8789.getClass(), "header", term8796);
        setElement(term8893, 0, "RMsXuyzKJV");
        setElement(term8893, 1, "FwPbDZcHmB");
        setElement(term8893, 2, "hOncybyCAH");
        setElement(term8893, 3, "QduALnDSVo");
        setElement(term8893, 4, "izPpKDErnQ");
        setElement(term8893, 5, "NnpwZBUTvx");
        setField(term8789, term8789.getClass(), "headerComments", term8893);
        setBooleanField(term8789, term8789.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term8789, term8789.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term8789, term8789.getClass(), "ignoreSurroundingSpaces", false);
        setField(term8789, term8789.getClass(), "nullString", "tlQSNgTkQX");
        setField(term8789, term8789.getClass(), "quoteCharacter", term8981);
        setField(term8789, term8789.getClass(), "quoteMode", enum116);
        setField(term8789, term8789.getClass(), "recordSeparator", "PCipZnmBOF");
        setBooleanField(term8789, term8789.getClass(), "skipHeaderRecord", true);
        setBooleanField(term8789, term8789.getClass(), "trailingDelimiter", true);
        setBooleanField(term8789, term8789.getClass(), "trim", false);
        setBooleanField(term8789, term8789.getClass(), "autoFlush", true);
        Character term56772 = new Character('S');
        Character term56773 = new Character('Y');
        Character term56806 = new Character('Y');
        Class<? extends Object> term57375 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term57374 = ((Class) term57375).getDeclaredField((String) "NONE");
        ((Field) term57374).setAccessible(true);
        Object enum117 = ((Field) term57374).get((Object) null);
        term56771 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term56774 = (Object[]) newArray("java.lang.String", 8);
        Object[] term56791 = (Object[]) newArray("java.lang.String", 6);
        setBooleanField(term56771, term56771.getClass(), "allowMissingColumnNames", false);
        setField(term56771, term56771.getClass(), "commentMarker", term56772);
        setCharField(term56771, term56771.getClass(), "delimiter", 'z');
        setField(term56771, term56771.getClass(), "escapeCharacter", term56773);
        setElement(term56774, 0, "iikZEapDlu");
        setElement(term56774, 1, "nhoHrZfnIN");
        setElement(term56774, 2, "ZkMALXpEAZ");
        setElement(term56774, 3, "tXfQjSqDzN");
        setElement(term56774, 4, "BjugTaMcxJ");
        setElement(term56774, 5, "vGiuZVPJNH");
        setElement(term56774, 6, "tlzpzIjMib");
        setElement(term56774, 7, "AZdLeSugwv");
        setField(term56771, term56771.getClass(), "header", term56774);
        setElement(term56791, 0, "RMsXuyzKJV");
        setElement(term56791, 1, "FwPbDZcHmB");
        setElement(term56791, 2, "hOncybyCAH");
        setElement(term56791, 3, "QduALnDSVo");
        setElement(term56791, 4, "izPpKDErnQ");
        setElement(term56791, 5, "NnpwZBUTvx");
        setField(term56771, term56771.getClass(), "headerComments", term56791);
        setBooleanField(term56771, term56771.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term56771, term56771.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term56771, term56771.getClass(), "ignoreSurroundingSpaces", false);
        setField(term56771, term56771.getClass(), "nullString", "tlQSNgTkQX");
        setField(term56771, term56771.getClass(), "quoteCharacter", term56806);
        setField(term56771, term56771.getClass(), "quoteMode", enum117);
        setField(term56771, term56771.getClass(), "recordSeparator", "PCipZnmBOF");
        setBooleanField(term56771, term56771.getClass(), "skipHeaderRecord", true);
        setBooleanField(term56771, term56771.getClass(), "trailingDelimiter", true);
        setBooleanField(term56771, term56771.getClass(), "trim", false);
        setBooleanField(term56771, term56771.getClass(), "autoFlush", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term8789, args);
        assertTrue(recursiveEquals(term8789, term56771));
        assertTrue(recursiveEquals(retValue, -222624349));
    }

};


