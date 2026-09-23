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

public class CSVParser_getRecords_5332321024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5479;

    public CSVParser_getRecords_5332321024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term5482 = new Character('g');
        Class<? extends Object> term152945 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term152944 = ((Class) term152945).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term152944).setAccessible(true);
        Object enum55 = ((Field) term152944).get((Object) null);
        Character term5499 = new Character('n');
        Character term5501 = new Character('e');
        HashMap term5592 = new HashMap();
        ArrayList term5634 = new ArrayList();
        ((ArrayList) term5634).add("LvJFtLBaxj");
        ((ArrayList) term5634).add("PHvxnGHptP");
        ((ArrayList) term5634).add("TimdotUuNC");
        Class<? extends Object> term153236 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term153235 = ((Class) term153236).getDeclaredField((String) "INVALID");
        ((Field) term153235).setAccessible(true);
        Object enum56 = ((Field) term153235).get((Object) null);
        term5479 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term5480 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term5530 = (Object[]) newArray("java.lang.String", 5);
        Object term5603 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term5610 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        char[] term5614 = (char[]) newCharArray(6);
        Object term5627 = newInstance(Class.forName("java.lang.Object"));
        char[] term5628 = (char[]) newCharArray(5);
        Object term5675 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term5687 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term5688 = (byte[]) newByteArray(50);
        setCharField(term5480, term5480.getClass(), "delimiter", 'G');
        setField(term5480, term5480.getClass(), "quoteChar", term5482);
        setField(term5480, term5480.getClass(), "quotePolicy", enum55);
        setField(term5480, term5480.getClass(), "commentStart", term5499);
        setField(term5480, term5480.getClass(), "escape", term5501);
        setBooleanField(term5480, term5480.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term5480, term5480.getClass(), "ignoreEmptyHeaders", true);
        setBooleanField(term5480, term5480.getClass(), "ignoreEmptyLines", true);
        setField(term5480, term5480.getClass(), "recordSeparator", "vQVyKLdtaz");
        setField(term5480, term5480.getClass(), "nullString", "OWKQODBLzb");
        setElement(term5530, 0, "wGmYcqUkgE");
        setElement(term5530, 1, "idgaQsnJpQ");
        setElement(term5530, 2, "VgZnGoIFwQ");
        setElement(term5530, 3, "jUbSRrkrYZ");
        setElement(term5530, 4, "bWWfajKbEX");
        setField(term5480, term5480.getClass(), "header", term5530);
        setBooleanField(term5480, term5480.getClass(), "skipHeaderRecord", false);
        setField(term5479, term5479.getClass(), "format", term5480);
        setField(term5479, term5479.getClass(), "headerMap", term5592);
        setCharField(term5603, term5603.getClass(), "delimiter", 'N');
        setCharField(term5603, term5603.getClass(), "escape", 'R');
        setCharField(term5603, term5603.getClass(), "quoteChar", 'd');
        setCharField(term5603, term5603.getClass(), "commentStart", 'v');
        setBooleanField(term5603, term5603.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term5603, term5603.getClass(), "ignoreEmptyLines", false);
        setIntField(term5610, term5610.getClass(), "lastChar", 590364439);
        setLongField(term5610, term5610.getClass(), "eolCounter", -2813493605142626659L);
        setBooleanField(term5610, term5610.getClass(), "closed", false);
        setField(term5610, term5610.getClass(), "in", null);
        setCharElement(term5614, 0, 'g');
        setCharElement(term5614, 1, 'J');
        setCharElement(term5614, 2, 'l');
        setCharElement(term5614, 3, 'h');
        setCharElement(term5614, 4, 'k');
        setCharElement(term5614, 5, 'X');
        setField(term5610, term5610.getClass(), "cb", term5614);
        setIntField(term5610, term5610.getClass(), "nChars", 865208305);
        setIntField(term5610, term5610.getClass(), "nextChar", -1275173084);
        setIntField(term5610, term5610.getClass(), "markedChar", -244121226);
        setIntField(term5610, term5610.getClass(), "readAheadLimit", -203030934);
        setBooleanField(term5610, term5610.getClass(), "skipLF", false);
        setBooleanField(term5610, term5610.getClass(), "markedSkipLF", false);
        setField(term5610, term5610.getClass(), "lock", term5627);
        setCharElement(term5628, 0, 'u');
        setCharElement(term5628, 1, 'u');
        setCharElement(term5628, 2, 'a');
        setCharElement(term5628, 3, 'P');
        setCharElement(term5628, 4, 'i');
        setField(term5610, term5610.getClass(), "skipBuffer", term5628);
        setField(term5603, term5603.getClass(), "reader", term5610);
        setField(term5479, term5479.getClass(), "lexer", term5603);
        setField(term5479, term5479.getClass(), "record", term5634);
        setLongField(term5479, term5479.getClass(), "recordNumber", -8885298608300233488L);
        setField(term5675, term5675.getClass(), "type", enum56);
        setField(term5687, term5687.getClass(), "value", term5688);
        setByteField(term5687, term5687.getClass(), "coder", (byte) 0);
        setIntField(term5687, term5687.getClass(), "count", 0);
        setField(term5675, term5675.getClass(), "content", term5687);
        setBooleanField(term5675, term5675.getClass(), "isReady", false);
        setField(term5479, term5479.getClass(), "reusableToken", term5675);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getRecords", argTypes, term5479, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


