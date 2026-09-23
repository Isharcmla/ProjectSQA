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

public class CSVFormat_getCommentMarker_191689993649 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1074;
     Object term21114;
     Object term21056;

    public CSVFormat_getCommentMarker_191689993649() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term1076 = new Character('t');
        Class<? extends Object> term21129 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term21128 = ((Class) term21129).getDeclaredField((String) "ALL");
        ((Field) term21128).setAccessible(true);
        Object enum48 = ((Field) term21128).get((Object) null);
        Character term1085 = new Character('R');
        Character term1087 = new Character('r');
        term1074 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term1116 = (Object[]) newArray("java.lang.String", 1);
        setCharField(term1074, term1074.getClass(), "delimiter", 'E');
        setField(term1074, term1074.getClass(), "quoteCharacter", term1076);
        setField(term1074, term1074.getClass(), "quoteMode", enum48);
        setField(term1074, term1074.getClass(), "commentMarker", term1085);
        setField(term1074, term1074.getClass(), "escapeCharacter", term1087);
        setBooleanField(term1074, term1074.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term1074, term1074.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term1074, term1074.getClass(), "ignoreEmptyLines", false);
        setField(term1074, term1074.getClass(), "recordSeparator", "HyxfbSQYBe");
        setField(term1074, term1074.getClass(), "nullString", "pCTimMblYc");
        setElement(term1116, 0, "hNxWaHcfhY");
        setField(term1074, term1074.getClass(), "header", term1116);
        setBooleanField(term1074, term1074.getClass(), "skipHeaderRecord", false);
        Character term21115 = new Character('t');
        Class<? extends Object> term21335 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term21334 = ((Class) term21335).getDeclaredField((String) "ALL");
        ((Field) term21334).setAccessible(true);
        Object enum49 = ((Field) term21334).get((Object) null);
        Character term21119 = new Character('R');
        Character term21120 = new Character('r');
        term21114 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term21125 = (Object[]) newArray("java.lang.String", 1);
        setCharField(term21114, term21114.getClass(), "delimiter", 'E');
        setField(term21114, term21114.getClass(), "quoteCharacter", term21115);
        setField(term21114, term21114.getClass(), "quoteMode", enum49);
        setField(term21114, term21114.getClass(), "commentMarker", term21119);
        setField(term21114, term21114.getClass(), "escapeCharacter", term21120);
        setBooleanField(term21114, term21114.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term21114, term21114.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term21114, term21114.getClass(), "ignoreEmptyLines", false);
        setField(term21114, term21114.getClass(), "recordSeparator", "HyxfbSQYBe");
        setField(term21114, term21114.getClass(), "nullString", "pCTimMblYc");
        setElement(term21125, 0, "hNxWaHcfhY");
        setField(term21114, term21114.getClass(), "header", term21125);
        setBooleanField(term21114, term21114.getClass(), "skipHeaderRecord", false);
        term21056 = new Character('R');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getCommentMarker", argTypes, term1074, args);
        assertTrue(recursiveEquals(term1074, term21114));
        assertTrue(recursiveEquals(retValue, term21056));
    }

};


