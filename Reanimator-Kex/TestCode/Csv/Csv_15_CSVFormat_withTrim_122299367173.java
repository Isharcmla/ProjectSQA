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
import java.lang.Character;
import java.lang.Object;
import java.lang.String;

public class CSVFormat_withTrim_122299367173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31804;

    public CSVFormat_withTrim_122299367173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term31806 = new Character('B');
        Character term31809 = new Character('c');
        Character term31948 = new Character('T');
        Class<? extends Object> term32093 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term32092 = ((Class) term32093).getDeclaredField((String) "ALL_NON_NULL");
        ((Field) term32092).setAccessible(true);
        Object enum71 = ((Field) term32092).get((Object) null);
        term31804 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term31811 = (Object[]) newArray("java.lang.String", 2);
        Object[] term31836 = (Object[]) newArray("java.lang.String", 8);
        setBooleanField(term31804, term31804.getClass(), "allowMissingColumnNames", false);
        setField(term31804, term31804.getClass(), "commentMarker", term31806);
        setCharField(term31804, term31804.getClass(), "delimiter", 'w');
        setField(term31804, term31804.getClass(), "escapeCharacter", term31809);
        setElement(term31811, 0, "fgOpAWlGYN");
        setElement(term31811, 1, "PNzNzzjSXM");
        setField(term31804, term31804.getClass(), "header", term31811);
        setElement(term31836, 0, "ktKcSZiuGM");
        setElement(term31836, 1, "PSOttyUeqv");
        setElement(term31836, 2, "HmEvTlmzXo");
        setElement(term31836, 3, "BMMonTIZgJ");
        setElement(term31836, 4, "QXyFXBjFde");
        setElement(term31836, 5, "xVFgeyYxZS");
        setElement(term31836, 6, "iQiGTulJiH");
        setElement(term31836, 7, "utCuuVCKqE");
        setField(term31804, term31804.getClass(), "headerComments", term31836);
        setBooleanField(term31804, term31804.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term31804, term31804.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term31804, term31804.getClass(), "ignoreSurroundingSpaces", false);
        setField(term31804, term31804.getClass(), "nullString", "zSfoqzJbPT");
        setField(term31804, term31804.getClass(), "quoteCharacter", term31948);
        setField(term31804, term31804.getClass(), "quoteMode", enum71);
        setField(term31804, term31804.getClass(), "recordSeparator", "QUymMnsCIj");
        setBooleanField(term31804, term31804.getClass(), "skipHeaderRecord", true);
        setBooleanField(term31804, term31804.getClass(), "trailingDelimiter", true);
        setBooleanField(term31804, term31804.getClass(), "trim", false);
        setBooleanField(term31804, term31804.getClass(), "autoFlush", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "withTrim", argTypes, term31804, args);
    }

};


