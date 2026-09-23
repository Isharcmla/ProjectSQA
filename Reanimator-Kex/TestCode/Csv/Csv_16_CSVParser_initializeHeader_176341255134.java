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

public class CSVParser_initializeHeader_176341255134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10406;

    public CSVParser_initializeHeader_176341255134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term10409 = new Character('a');
        Character term10412 = new Character('I');
        Character term10503 = new Character('b');
        Class<? extends Object> term182299 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term182298 = ((Class) term182299).getDeclaredField((String) "NONE");
        ((Field) term182298).setAccessible(true);
        Object enum71 = ((Field) term182298).get((Object) null);
        HashMap term10529 = new HashMap();
        ArrayList term10578 = new ArrayList();
        ((ArrayList) term10578).add("RMsXuyzKJV");
        ((ArrayList) term10578).add("FwPbDZcHmB");
        Class<? extends Object> term182523 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term182522 = ((Class) term182523).getDeclaredField((String) "INVALID");
        ((Field) term182522).setAccessible(true);
        Object enum72 = ((Field) term182522).get((Object) null);
        term10406 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term10407 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term10414 = (Object[]) newArray("java.lang.String", 4);
        Object[] term10463 = (Object[]) newArray("java.lang.String", 2);
        Object term10540 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term10547 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        char[] term10552 = (char[]) newCharArray(5);
        Object term10564 = newInstance(Class.forName("java.lang.Object"));
        char[] term10565 = (char[]) newCharArray(0);
        Object term10608 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term10620 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term10621 = (byte[]) newByteArray(50);
        setBooleanField(term10407, term10407.getClass(), "allowMissingColumnNames", false);
        setField(term10407, term10407.getClass(), "commentMarker", term10409);
        setCharField(term10407, term10407.getClass(), "delimiter", 'G');
        setField(term10407, term10407.getClass(), "escapeCharacter", term10412);
        setElement(term10414, 0, "XJJNClzHRf");
        setElement(term10414, 1, "HDaezxQfQR");
        setElement(term10414, 2, "iikZEapDlu");
        setElement(term10414, 3, "nhoHrZfnIN");
        setField(term10407, term10407.getClass(), "header", term10414);
        setElement(term10463, 0, "ZkMALXpEAZ");
        setElement(term10463, 1, "tXfQjSqDzN");
        setField(term10407, term10407.getClass(), "headerComments", term10463);
        setBooleanField(term10407, term10407.getClass(), "ignoreEmptyLines", true);
        setBooleanField(term10407, term10407.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term10407, term10407.getClass(), "ignoreSurroundingSpaces", false);
        setField(term10407, term10407.getClass(), "nullString", "BjugTaMcxJ");
        setField(term10407, term10407.getClass(), "quoteCharacter", term10503);
        setField(term10407, term10407.getClass(), "quoteMode", enum71);
        setField(term10407, term10407.getClass(), "recordSeparator", "vGiuZVPJNH");
        setBooleanField(term10407, term10407.getClass(), "skipHeaderRecord", true);
        setBooleanField(term10407, term10407.getClass(), "trailingDelimiter", true);
        setBooleanField(term10407, term10407.getClass(), "trim", false);
        setBooleanField(term10407, term10407.getClass(), "autoFlush", false);
        setField(term10406, term10406.getClass(), "format", term10407);
        setField(term10406, term10406.getClass(), "headerMap", term10529);
        setCharField(term10540, term10540.getClass(), "delimiter", 'n');
        setCharField(term10540, term10540.getClass(), "escape", 'z');
        setCharField(term10540, term10540.getClass(), "quoteChar", 'T');
        setCharField(term10540, term10540.getClass(), "commentStart", 's');
        setBooleanField(term10540, term10540.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term10540, term10540.getClass(), "ignoreEmptyLines", false);
        setIntField(term10547, term10547.getClass(), "lastChar", -1530420153);
        setLongField(term10547, term10547.getClass(), "eolCounter", 6855071767938501807L);
        setLongField(term10547, term10547.getClass(), "position", -5892135042702373494L);
        setBooleanField(term10547, term10547.getClass(), "closed", true);
        setField(term10547, term10547.getClass(), "in", null);
        setCharElement(term10552, 0, 't');
        setCharElement(term10552, 1, 'b');
        setCharElement(term10552, 2, 'c');
        setCharElement(term10552, 3, 'd');
        setCharElement(term10552, 4, 'z');
        setField(term10547, term10547.getClass(), "cb", term10552);
        setIntField(term10547, term10547.getClass(), "nChars", -469968304);
        setIntField(term10547, term10547.getClass(), "nextChar", -1145578966);
        setIntField(term10547, term10547.getClass(), "markedChar", 679763016);
        setIntField(term10547, term10547.getClass(), "readAheadLimit", 1962444399);
        setBooleanField(term10547, term10547.getClass(), "skipLF", false);
        setBooleanField(term10547, term10547.getClass(), "markedSkipLF", true);
        setField(term10547, term10547.getClass(), "lock", term10564);
        setField(term10547, term10547.getClass(), "skipBuffer", term10565);
        setField(term10540, term10540.getClass(), "reader", term10547);
        setField(term10540, term10540.getClass(), "firstEol", "AZdLeSugwv");
        setField(term10406, term10406.getClass(), "lexer", term10540);
        setField(term10406, term10406.getClass(), "recordList", term10578);
        setLongField(term10406, term10406.getClass(), "recordNumber", 5262507301787091109L);
        setLongField(term10406, term10406.getClass(), "characterOffset", -6823727938421990489L);
        setField(term10608, term10608.getClass(), "type", enum72);
        setField(term10620, term10620.getClass(), "value", term10621);
        setByteField(term10620, term10620.getClass(), "coder", (byte) 0);
        setIntField(term10620, term10620.getClass(), "count", 0);
        setField(term10608, term10608.getClass(), "content", term10620);
        setBooleanField(term10608, term10608.getClass(), "isReady", true);
        setField(term10406, term10406.getClass(), "reusableToken", term10608);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "initializeHeader", argTypes, term10406, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


