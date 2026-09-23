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

public class CSVParser_getRecords_5332321023 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5470;

    public CSVParser_getRecords_5332321023() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term5473 = new Character('g');
        Class<? extends Object> term20187 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term20186 = ((Class) term20187).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term20186).setAccessible(true);
        Object enum53 = ((Field) term20186).get((Object) null);
        Character term5490 = new Character('n');
        Character term5492 = new Character('e');
        HashMap term5582 = new HashMap();
        ArrayList term5624 = new ArrayList();
        ((ArrayList) term5624).add("LvJFtLBaxj");
        ((ArrayList) term5624).add("PHvxnGHptP");
        ((ArrayList) term5624).add("TimdotUuNC");
        Class<? extends Object> term20478 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term20477 = ((Class) term20478).getDeclaredField((String) "INVALID");
        ((Field) term20477).setAccessible(true);
        Object enum54 = ((Field) term20477).get((Object) null);
        term5470 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term5471 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term5520 = (Object[]) newArray("java.lang.String", 5);
        Object term5593 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term5600 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        char[] term5604 = (char[]) newCharArray(6);
        Object term5617 = newInstance(Class.forName("java.lang.Object"));
        char[] term5618 = (char[]) newCharArray(5);
        Object term5665 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term5677 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term5678 = (byte[]) newByteArray(50);
        setCharField(term5471, term5471.getClass(), "delimiter", 'G');
        setField(term5471, term5471.getClass(), "quoteChar", term5473);
        setField(term5471, term5471.getClass(), "quotePolicy", enum53);
        setField(term5471, term5471.getClass(), "commentStart", term5490);
        setField(term5471, term5471.getClass(), "escape", term5492);
        setBooleanField(term5471, term5471.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term5471, term5471.getClass(), "ignoreEmptyLines", false);
        setField(term5471, term5471.getClass(), "recordSeparator", "vQVyKLdtaz");
        setField(term5471, term5471.getClass(), "nullString", "OWKQODBLzb");
        setElement(term5520, 0, "wGmYcqUkgE");
        setElement(term5520, 1, "idgaQsnJpQ");
        setElement(term5520, 2, "VgZnGoIFwQ");
        setElement(term5520, 3, "jUbSRrkrYZ");
        setElement(term5520, 4, "bWWfajKbEX");
        setField(term5471, term5471.getClass(), "header", term5520);
        setBooleanField(term5471, term5471.getClass(), "skipHeaderRecord", false);
        setField(term5470, term5470.getClass(), "format", term5471);
        setField(term5470, term5470.getClass(), "headerMap", term5582);
        setCharField(term5593, term5593.getClass(), "delimiter", 'N');
        setCharField(term5593, term5593.getClass(), "escape", 'R');
        setCharField(term5593, term5593.getClass(), "quoteChar", 'd');
        setCharField(term5593, term5593.getClass(), "commentStart", 'v');
        setBooleanField(term5593, term5593.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term5593, term5593.getClass(), "ignoreEmptyLines", false);
        setIntField(term5600, term5600.getClass(), "lastChar", 590364439);
        setLongField(term5600, term5600.getClass(), "eolCounter", -2813493605142626659L);
        setBooleanField(term5600, term5600.getClass(), "closed", true);
        setField(term5600, term5600.getClass(), "in", null);
        setCharElement(term5604, 0, 'g');
        setCharElement(term5604, 1, 'J');
        setCharElement(term5604, 2, 'l');
        setCharElement(term5604, 3, 'h');
        setCharElement(term5604, 4, 'k');
        setCharElement(term5604, 5, 'X');
        setField(term5600, term5600.getClass(), "cb", term5604);
        setIntField(term5600, term5600.getClass(), "nChars", 865208305);
        setIntField(term5600, term5600.getClass(), "nextChar", -1275173084);
        setIntField(term5600, term5600.getClass(), "markedChar", -244121226);
        setIntField(term5600, term5600.getClass(), "readAheadLimit", -203030934);
        setBooleanField(term5600, term5600.getClass(), "skipLF", true);
        setBooleanField(term5600, term5600.getClass(), "markedSkipLF", false);
        setField(term5600, term5600.getClass(), "lock", term5617);
        setCharElement(term5618, 0, 'u');
        setCharElement(term5618, 1, 'u');
        setCharElement(term5618, 2, 'a');
        setCharElement(term5618, 3, 'P');
        setCharElement(term5618, 4, 'i');
        setField(term5600, term5600.getClass(), "skipBuffer", term5618);
        setField(term5593, term5593.getClass(), "in", term5600);
        setField(term5470, term5470.getClass(), "lexer", term5593);
        setField(term5470, term5470.getClass(), "record", term5624);
        setLongField(term5470, term5470.getClass(), "recordNumber", -8885298608300233488L);
        setField(term5665, term5665.getClass(), "type", enum54);
        setField(term5677, term5677.getClass(), "value", term5678);
        setByteField(term5677, term5677.getClass(), "coder", (byte) 0);
        setIntField(term5677, term5677.getClass(), "count", 0);
        setField(term5665, term5665.getClass(), "content", term5677);
        setBooleanField(term5665, term5665.getClass(), "isReady", false);
        setField(term5470, term5470.getClass(), "reusableToken", term5665);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getRecords", argTypes, term5470, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


