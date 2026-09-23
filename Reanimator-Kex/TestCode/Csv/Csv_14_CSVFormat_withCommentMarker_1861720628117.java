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

public class CSVFormat_withCommentMarker_1861720628117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18352;
     Object term18524;
     Object term75017;
     Object term74855;

    public CSVFormat_withCommentMarker_1861720628117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term18354 = new Character('G');
        Character term18357 = new Character('b');
        Character term18496 = new Character('n');
        Class<? extends Object> term75161 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term75160 = ((Class) term75161).getDeclaredField((String) "MINIMAL");
        ((Field) term75160).setAccessible(true);
        Object enum151 = ((Field) term75160).get((Object) null);
        term18352 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term18359 = (Object[]) newArray("java.lang.String", 4);
        Object[] term18408 = (Object[]) newArray("java.lang.String", 6);
        setBooleanField(term18352, term18352.getClass(), "allowMissingColumnNames", true);
        setField(term18352, term18352.getClass(), "commentMarker", term18354);
        setCharField(term18352, term18352.getClass(), "delimiter", 'I');
        setField(term18352, term18352.getClass(), "escapeCharacter", term18357);
        setElement(term18359, 0, "KtuuNAqGCQ");
        setElement(term18359, 1, "OGQsfjmReM");
        setElement(term18359, 2, "YsUtbngnRO");
        setElement(term18359, 3, "JisaWUxcNb");
        setField(term18352, term18352.getClass(), "header", term18359);
        setElement(term18408, 0, "NxgmYPzWCI");
        setElement(term18408, 1, "SqjyKmayBx");
        setElement(term18408, 2, "XjDhvToxJy");
        setElement(term18408, 3, "nxSTJflLQy");
        setElement(term18408, 4, "FlHzxEfFzI");
        setElement(term18408, 5, "aSATgQUpoe");
        setField(term18352, term18352.getClass(), "headerComments", term18408);
        setBooleanField(term18352, term18352.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term18352, term18352.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term18352, term18352.getClass(), "ignoreSurroundingSpaces", true);
        setField(term18352, term18352.getClass(), "nullString", "VkPSXewZfB");
        setField(term18352, term18352.getClass(), "quoteCharacter", term18496);
        setField(term18352, term18352.getClass(), "quoteMode", enum151);
        setField(term18352, term18352.getClass(), "recordSeparator", "ubodzJoMGW");
        setBooleanField(term18352, term18352.getClass(), "skipHeaderRecord", true);
        setBooleanField(term18352, term18352.getClass(), "trailingDelimiter", true);
        setBooleanField(term18352, term18352.getClass(), "trim", true);
        term18524 = new Character('z');
        Character term75018 = new Character('G');
        Character term75019 = new Character('b');
        Character term75044 = new Character('n');
        Class<? extends Object> term75469 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term75468 = ((Class) term75469).getDeclaredField((String) "MINIMAL");
        ((Field) term75468).setAccessible(true);
        Object enum152 = ((Field) term75468).get((Object) null);
        term75017 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term75020 = (Object[]) newArray("java.lang.String", 4);
        Object[] term75029 = (Object[]) newArray("java.lang.String", 6);
        setBooleanField(term75017, term75017.getClass(), "allowMissingColumnNames", true);
        setField(term75017, term75017.getClass(), "commentMarker", term75018);
        setCharField(term75017, term75017.getClass(), "delimiter", 'I');
        setField(term75017, term75017.getClass(), "escapeCharacter", term75019);
        setElement(term75020, 0, "KtuuNAqGCQ");
        setElement(term75020, 1, "OGQsfjmReM");
        setElement(term75020, 2, "YsUtbngnRO");
        setElement(term75020, 3, "JisaWUxcNb");
        setField(term75017, term75017.getClass(), "header", term75020);
        setElement(term75029, 0, "NxgmYPzWCI");
        setElement(term75029, 1, "SqjyKmayBx");
        setElement(term75029, 2, "XjDhvToxJy");
        setElement(term75029, 3, "nxSTJflLQy");
        setElement(term75029, 4, "FlHzxEfFzI");
        setElement(term75029, 5, "aSATgQUpoe");
        setField(term75017, term75017.getClass(), "headerComments", term75029);
        setBooleanField(term75017, term75017.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term75017, term75017.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term75017, term75017.getClass(), "ignoreSurroundingSpaces", true);
        setField(term75017, term75017.getClass(), "nullString", "VkPSXewZfB");
        setField(term75017, term75017.getClass(), "quoteCharacter", term75044);
        setField(term75017, term75017.getClass(), "quoteMode", enum152);
        setField(term75017, term75017.getClass(), "recordSeparator", "ubodzJoMGW");
        setBooleanField(term75017, term75017.getClass(), "skipHeaderRecord", true);
        setBooleanField(term75017, term75017.getClass(), "trailingDelimiter", true);
        setBooleanField(term75017, term75017.getClass(), "trim", true);
        Character term74857 = new Character('z');
        Character term74860 = new Character('b');
        Character term74999 = new Character('n');
        Class<? extends Object> term75777 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term75776 = ((Class) term75777).getDeclaredField((String) "MINIMAL");
        ((Field) term75776).setAccessible(true);
        Object enum153 = ((Field) term75776).get((Object) null);
        term74855 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term74862 = (Object[]) newArray("java.lang.String", 4);
        Object[] term74911 = (Object[]) newArray("java.lang.String", 6);
        setBooleanField(term74855, term74855.getClass(), "allowMissingColumnNames", true);
        setField(term74855, term74855.getClass(), "commentMarker", term74857);
        setCharField(term74855, term74855.getClass(), "delimiter", 'I');
        setField(term74855, term74855.getClass(), "escapeCharacter", term74860);
        setElement(term74862, 0, "KtuuNAqGCQ");
        setElement(term74862, 1, "OGQsfjmReM");
        setElement(term74862, 2, "YsUtbngnRO");
        setElement(term74862, 3, "JisaWUxcNb");
        setField(term74855, term74855.getClass(), "header", term74862);
        setElement(term74911, 0, "NxgmYPzWCI");
        setElement(term74911, 1, "SqjyKmayBx");
        setElement(term74911, 2, "XjDhvToxJy");
        setElement(term74911, 3, "nxSTJflLQy");
        setElement(term74911, 4, "FlHzxEfFzI");
        setElement(term74911, 5, "aSATgQUpoe");
        setField(term74855, term74855.getClass(), "headerComments", term74911);
        setBooleanField(term74855, term74855.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term74855, term74855.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term74855, term74855.getClass(), "ignoreSurroundingSpaces", true);
        setField(term74855, term74855.getClass(), "nullString", "VkPSXewZfB");
        setField(term74855, term74855.getClass(), "quoteCharacter", term74999);
        setField(term74855, term74855.getClass(), "quoteMode", enum153);
        setField(term74855, term74855.getClass(), "recordSeparator", "ubodzJoMGW");
        setBooleanField(term74855, term74855.getClass(), "skipHeaderRecord", true);
        setBooleanField(term74855, term74855.getClass(), "trailingDelimiter", true);
        setBooleanField(term74855, term74855.getClass(), "trim", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term18524;
        Object retValue = callMethod(klass, "withCommentMarker", argTypes, term18352, args);
        assertTrue(recursiveEquals(term18352, term75017));
        assertTrue(recursiveEquals(term18524, 'z'));
        assertTrue(recursiveEquals(retValue, term74855));
    }

};


