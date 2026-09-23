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

public class CSVParser_nextRecord_168680661327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8782;

    public CSVParser_nextRecord_168680661327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term8785 = new Character('V');
        Class<? extends Object> term25308 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term25307 = ((Class) term25308).getDeclaredField((String) "NONE");
        ((Field) term25307).setAccessible(true);
        Object enum67 = ((Field) term25307).get((Object) null);
        Character term8795 = new Character('t');
        Character term8797 = new Character('F');
        HashMap term8875 = new HashMap();
        ArrayList term8920 = new ArrayList();
        ((ArrayList) term8920).add("PznxWXsZME");
        ((ArrayList) term8920).add("ZzIujlwVsw");
        Class<? extends Object> term25561 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term25560 = ((Class) term25561).getDeclaredField((String) "INVALID");
        ((Field) term25560).setAccessible(true);
        Object enum68 = ((Field) term25560).get((Object) null);
        term8782 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term8783 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term8825 = (Object[]) newArray("java.lang.String", 4);
        Object term8886 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term8893 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        char[] term8897 = (char[]) newCharArray(8);
        Object term8912 = newInstance(Class.forName("java.lang.Object"));
        char[] term8913 = (char[]) newCharArray(6);
        Object term8949 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term8961 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term8962 = (byte[]) newByteArray(50);
        setCharField(term8783, term8783.getClass(), "delimiter", 'F');
        setField(term8783, term8783.getClass(), "quoteChar", term8785);
        setField(term8783, term8783.getClass(), "quotePolicy", enum67);
        setField(term8783, term8783.getClass(), "commentStart", term8795);
        setField(term8783, term8783.getClass(), "escape", term8797);
        setBooleanField(term8783, term8783.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term8783, term8783.getClass(), "ignoreEmptyLines", false);
        setField(term8783, term8783.getClass(), "recordSeparator", "AKNapTAfmD");
        setField(term8783, term8783.getClass(), "nullString", "xJgPlLxpgC");
        setElement(term8825, 0, "EYtfuJaxiM");
        setElement(term8825, 1, "gCWtLVKVVe");
        setElement(term8825, 2, "fWKJoSoCwE");
        setElement(term8825, 3, "wfaXBpWAUH");
        setField(term8783, term8783.getClass(), "header", term8825);
        setBooleanField(term8783, term8783.getClass(), "skipHeaderRecord", false);
        setField(term8782, term8782.getClass(), "format", term8783);
        setField(term8782, term8782.getClass(), "headerMap", term8875);
        setCharField(term8886, term8886.getClass(), "delimiter", 'Z');
        setCharField(term8886, term8886.getClass(), "escape", 'i');
        setCharField(term8886, term8886.getClass(), "quoteChar", 'a');
        setCharField(term8886, term8886.getClass(), "commentStart", 'G');
        setBooleanField(term8886, term8886.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term8886, term8886.getClass(), "ignoreEmptyLines", true);
        setIntField(term8893, term8893.getClass(), "lastChar", -1016503459);
        setLongField(term8893, term8893.getClass(), "eolCounter", -6573104506744284592L);
        setBooleanField(term8893, term8893.getClass(), "closed", true);
        setField(term8893, term8893.getClass(), "in", null);
        setCharElement(term8897, 0, 'I');
        setCharElement(term8897, 1, 'b');
        setCharElement(term8897, 2, 'n');
        setCharElement(term8897, 3, 'z');
        setCharElement(term8897, 4, 'T');
        setCharElement(term8897, 5, 's');
        setCharElement(term8897, 6, 't');
        setCharElement(term8897, 7, 'b');
        setField(term8893, term8893.getClass(), "cb", term8897);
        setIntField(term8893, term8893.getClass(), "nChars", -1968847291);
        setIntField(term8893, term8893.getClass(), "nextChar", 579005622);
        setIntField(term8893, term8893.getClass(), "markedChar", -14890619);
        setIntField(term8893, term8893.getClass(), "readAheadLimit", 1632125673);
        setBooleanField(term8893, term8893.getClass(), "skipLF", false);
        setBooleanField(term8893, term8893.getClass(), "markedSkipLF", true);
        setField(term8893, term8893.getClass(), "lock", term8912);
        setCharElement(term8913, 0, 'c');
        setCharElement(term8913, 1, 'd');
        setCharElement(term8913, 2, 'z');
        setCharElement(term8913, 3, 'j');
        setCharElement(term8913, 4, 'I');
        setCharElement(term8913, 5, 'f');
        setField(term8893, term8893.getClass(), "skipBuffer", term8913);
        setField(term8886, term8886.getClass(), "in", term8893);
        setField(term8782, term8782.getClass(), "lexer", term8886);
        setField(term8782, term8782.getClass(), "record", term8920);
        setLongField(term8782, term8782.getClass(), "recordNumber", -4920224193275732920L);
        setField(term8949, term8949.getClass(), "type", enum68);
        setField(term8961, term8961.getClass(), "value", term8962);
        setByteField(term8961, term8961.getClass(), "coder", (byte) 0);
        setIntField(term8961, term8961.getClass(), "count", 0);
        setField(term8949, term8949.getClass(), "content", term8961);
        setBooleanField(term8949, term8949.getClass(), "isReady", true);
        setField(term8782, term8782.getClass(), "reusableToken", term8949);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextRecord", argTypes, term8782, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


