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

public class CSVFormat_withAllowMissingColumnNames_75501339044 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18424;

    public CSVFormat_withAllowMissingColumnNames_75501339044() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term18426 = new Character('G');
        Character term18429 = new Character('b');
        Character term18568 = new Character('n');
        Class<? extends Object> term18705 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term18704 = ((Class) term18705).getDeclaredField((String) "NONE");
        ((Field) term18704).setAccessible(true);
        Object enum41 = ((Field) term18704).get((Object) null);
        term18424 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term18431 = (Object[]) newArray("java.lang.String", 4);
        Object[] term18480 = (Object[]) newArray("java.lang.String", 6);
        setBooleanField(term18424, term18424.getClass(), "allowMissingColumnNames", false);
        setField(term18424, term18424.getClass(), "commentMarker", term18426);
        setCharField(term18424, term18424.getClass(), "delimiter", 'I');
        setField(term18424, term18424.getClass(), "escapeCharacter", term18429);
        setElement(term18431, 0, "YkZtEtthvz");
        setElement(term18431, 1, "dwlZSxlXOo");
        setElement(term18431, 2, "lKrEAkypza");
        setElement(term18431, 3, "KtuuNAqGCQ");
        setField(term18424, term18424.getClass(), "header", term18431);
        setElement(term18480, 0, "OGQsfjmReM");
        setElement(term18480, 1, "YsUtbngnRO");
        setElement(term18480, 2, "JisaWUxcNb");
        setElement(term18480, 3, "NxgmYPzWCI");
        setElement(term18480, 4, "SqjyKmayBx");
        setElement(term18480, 5, "XjDhvToxJy");
        setField(term18424, term18424.getClass(), "headerComments", term18480);
        setBooleanField(term18424, term18424.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term18424, term18424.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term18424, term18424.getClass(), "ignoreSurroundingSpaces", true);
        setField(term18424, term18424.getClass(), "nullString", "nxSTJflLQy");
        setField(term18424, term18424.getClass(), "quoteCharacter", term18568);
        setField(term18424, term18424.getClass(), "quoteMode", enum41);
        setField(term18424, term18424.getClass(), "recordSeparator", "FlHzxEfFzI");
        setBooleanField(term18424, term18424.getClass(), "skipHeaderRecord", false);
        setBooleanField(term18424, term18424.getClass(), "trailingDelimiter", true);
        setBooleanField(term18424, term18424.getClass(), "trim", true);
        setBooleanField(term18424, term18424.getClass(), "autoFlush", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "withAllowMissingColumnNames", argTypes, term18424, args);
    }

};


