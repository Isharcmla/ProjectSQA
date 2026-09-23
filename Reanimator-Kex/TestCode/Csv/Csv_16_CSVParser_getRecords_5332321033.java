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
import java.io.IOException;
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Character;
import java.lang.String;
import java.util.HashMap;
import java.util.ArrayList;

public class CSVParser_getRecords_5332321033 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9368;

    public CSVParser_getRecords_5332321033() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term9371 = new Character('X');
        Character term9374 = new Character('o');
        Character term9561 = new Character('V');
        Class<? extends Object> term180895 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term180894 = ((Class) term180895).getDeclaredField((String) "MINIMAL");
        ((Field) term180894).setAccessible(true);
        Object enum69 = ((Field) term180894).get((Object) null);
        HashMap term9590 = new HashMap();
        ArrayList term9650 = new ArrayList();
        ((ArrayList) term9650).add("PgPzMSEjjX");
        ((ArrayList) term9650).add("wzsPSPcRdj");
        ((ArrayList) term9650).add("kGMQdqJYyB");
        Class<? extends Object> term181149 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term181148 = ((Class) term181149).getDeclaredField((String) "INVALID");
        ((Field) term181148).setAccessible(true);
        Object enum70 = ((Field) term181148).get((Object) null);
        term9368 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term9369 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term9376 = (Object[]) newArray("java.lang.String", 6);
        Object[] term9449 = (Object[]) newArray("java.lang.String", 8);
        Object term9601 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term9608 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        char[] term9613 = (char[]) newCharArray(9);
        Object term9629 = newInstance(Class.forName("java.lang.Object"));
        char[] term9630 = (char[]) newCharArray(7);
        Object term9692 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term9704 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term9705 = (byte[]) newByteArray(50);
        setBooleanField(term9369, term9369.getClass(), "allowMissingColumnNames", true);
        setField(term9369, term9369.getClass(), "commentMarker", term9371);
        setCharField(term9369, term9369.getClass(), "delimiter", 'R');
        setField(term9369, term9369.getClass(), "escapeCharacter", term9374);
        setElement(term9376, 0, "JmcmxoGhIK");
        setElement(term9376, 1, "jXzmYyrnnT");
        setElement(term9376, 2, "igCAtimmYB");
        setElement(term9376, 3, "DyiXbeYIaN");
        setElement(term9376, 4, "VGizxZnyHX");
        setElement(term9376, 5, "kVEZMHmRtR");
        setField(term9369, term9369.getClass(), "header", term9376);
        setElement(term9449, 0, "ekxGuOYIwi");
        setElement(term9449, 1, "RbVQXSpxXy");
        setElement(term9449, 2, "YpJbIgJWWv");
        setElement(term9449, 3, "JppkknKVOw");
        setElement(term9449, 4, "iljANwuEjk");
        setElement(term9449, 5, "kNqaJKIATy");
        setElement(term9449, 6, "vKQukfbJUd");
        setElement(term9449, 7, "lFRJFUMVbx");
        setField(term9369, term9369.getClass(), "headerComments", term9449);
        setBooleanField(term9369, term9369.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term9369, term9369.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term9369, term9369.getClass(), "ignoreSurroundingSpaces", true);
        setField(term9369, term9369.getClass(), "nullString", "sZdUNdggUW");
        setField(term9369, term9369.getClass(), "quoteCharacter", term9561);
        setField(term9369, term9369.getClass(), "quoteMode", enum69);
        setField(term9369, term9369.getClass(), "recordSeparator", "OqbwYQfvAe");
        setBooleanField(term9369, term9369.getClass(), "skipHeaderRecord", true);
        setBooleanField(term9369, term9369.getClass(), "trailingDelimiter", false);
        setBooleanField(term9369, term9369.getClass(), "trim", false);
        setBooleanField(term9369, term9369.getClass(), "autoFlush", false);
        setField(term9368, term9368.getClass(), "format", term9369);
        setField(term9368, term9368.getClass(), "headerMap", term9590);
        setCharField(term9601, term9601.getClass(), "delimiter", 'c');
        setCharField(term9601, term9601.getClass(), "escape", 'I');
        setCharField(term9601, term9601.getClass(), "quoteChar", 'n');
        setCharField(term9601, term9601.getClass(), "commentStart", 'Y');
        setBooleanField(term9601, term9601.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term9601, term9601.getClass(), "ignoreEmptyLines", false);
        setIntField(term9608, term9608.getClass(), "lastChar", -1179120542);
        setLongField(term9608, term9608.getClass(), "eolCounter", -7672528020740371001L);
        setLongField(term9608, term9608.getClass(), "position", -4502405999831680926L);
        setBooleanField(term9608, term9608.getClass(), "closed", false);
        setField(term9608, term9608.getClass(), "in", null);
        setCharElement(term9613, 0, 'n');
        setCharElement(term9613, 1, 'L');
        setCharElement(term9613, 2, 'W');
        setCharElement(term9613, 3, 'B');
        setCharElement(term9613, 4, 'a');
        setCharElement(term9613, 5, 'J');
        setCharElement(term9613, 6, 'l');
        setCharElement(term9613, 7, 'i');
        setCharElement(term9613, 8, 'e');
        setField(term9608, term9608.getClass(), "cb", term9613);
        setIntField(term9608, term9608.getClass(), "nChars", -73683645);
        setIntField(term9608, term9608.getClass(), "nextChar", -226514366);
        setIntField(term9608, term9608.getClass(), "markedChar", 1193880199);
        setIntField(term9608, term9608.getClass(), "readAheadLimit", -1087774327);
        setBooleanField(term9608, term9608.getClass(), "skipLF", false);
        setBooleanField(term9608, term9608.getClass(), "markedSkipLF", true);
        setField(term9608, term9608.getClass(), "lock", term9629);
        setCharElement(term9630, 0, 'C');
        setCharElement(term9630, 1, 'F');
        setCharElement(term9630, 2, 'V');
        setCharElement(term9630, 3, 't');
        setCharElement(term9630, 4, 'F');
        setCharElement(term9630, 5, 'Z');
        setCharElement(term9630, 6, 'i');
        setField(term9608, term9608.getClass(), "skipBuffer", term9630);
        setField(term9601, term9601.getClass(), "reader", term9608);
        setField(term9601, term9601.getClass(), "firstEol", "DhjNLmRMCu");
        setField(term9368, term9368.getClass(), "lexer", term9601);
        setField(term9368, term9368.getClass(), "recordList", term9650);
        setLongField(term9368, term9368.getClass(), "recordNumber", 1967728129628047933L);
        setLongField(term9368, term9368.getClass(), "characterOffset", 2120084523938730454L);
        setField(term9692, term9692.getClass(), "type", enum70);
        setField(term9704, term9704.getClass(), "value", term9705);
        setByteField(term9704, term9704.getClass(), "coder", (byte) 0);
        setIntField(term9704, term9704.getClass(), "count", 0);
        setField(term9692, term9692.getClass(), "content", term9704);
        setBooleanField(term9692, term9692.getClass(), "isReady", false);
        setField(term9368, term9368.getClass(), "reusableToken", term9692);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getRecords", argTypes, term9368, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


