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

public class CSVFormat_withEscape_158958405150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21254;
     Object term21503;

    public CSVFormat_withEscape_158958405150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term21256 = new Character('C');
        Character term21259 = new Character('i');
        Character term21470 = new Character('m');
        Class<? extends Object> term21676 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term21675 = ((Class) term21676).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term21675).setAccessible(true);
        Object enum47 = ((Field) term21675).get((Object) null);
        term21254 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term21261 = (Object[]) newArray("java.lang.String", 9);
        Object[] term21370 = (Object[]) newArray("java.lang.String", 7);
        setBooleanField(term21254, term21254.getClass(), "allowMissingColumnNames", false);
        setField(term21254, term21254.getClass(), "commentMarker", term21256);
        setCharField(term21254, term21254.getClass(), "delimiter", 'T');
        setField(term21254, term21254.getClass(), "escapeCharacter", term21259);
        setElement(term21261, 0, "BXTjEyEZxD");
        setElement(term21261, 1, "oKhVzOKUFW");
        setElement(term21261, 2, "mNHyqmOAFy");
        setElement(term21261, 3, "UxgSdhxPCH");
        setElement(term21261, 4, "DAujxZPHJC");
        setElement(term21261, 5, "IlBhdrCvHq");
        setElement(term21261, 6, "OirVUQhauU");
        setElement(term21261, 7, "GLbyDfbNZI");
        setElement(term21261, 8, "oNLcCYDAsO");
        setField(term21254, term21254.getClass(), "header", term21261);
        setElement(term21370, 0, "CNqMxLvtcJ");
        setElement(term21370, 1, "ktbqerIaKW");
        setElement(term21370, 2, "VoghngXfsK");
        setElement(term21370, 3, "GbahCBMvct");
        setElement(term21370, 4, "iiHBhsNFgk");
        setElement(term21370, 5, "HknsTajwxJ");
        setElement(term21370, 6, "XtiurrVYKw");
        setField(term21254, term21254.getClass(), "headerComments", term21370);
        setBooleanField(term21254, term21254.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term21254, term21254.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term21254, term21254.getClass(), "ignoreSurroundingSpaces", false);
        setField(term21254, term21254.getClass(), "nullString", "rsumfoDNHa");
        setField(term21254, term21254.getClass(), "quoteCharacter", term21470);
        setField(term21254, term21254.getClass(), "quoteMode", enum47);
        setField(term21254, term21254.getClass(), "recordSeparator", "ceCWHUTQUM");
        setBooleanField(term21254, term21254.getClass(), "skipHeaderRecord", true);
        setBooleanField(term21254, term21254.getClass(), "trailingDelimiter", true);
        setBooleanField(term21254, term21254.getClass(), "trim", true);
        setBooleanField(term21254, term21254.getClass(), "autoFlush", false);
        term21503 = new Character('M');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Character");
        Object[] args = new Object[1];
        args[0] = term21503;
        callMethod(klass, "withEscape", argTypes, term21254, args);
    }

};


