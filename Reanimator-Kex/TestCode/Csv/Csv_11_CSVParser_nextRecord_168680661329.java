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

public class CSVParser_nextRecord_168680661329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8643;

    public CSVParser_nextRecord_168680661329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term8646 = new Character('R');
        Class<? extends Object> term158232 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term158231 = ((Class) term158232).getDeclaredField((String) "MINIMAL");
        ((Field) term158231).setAccessible(true);
        Object enum69 = ((Field) term158231).get((Object) null);
        Character term8659 = new Character('H');
        Character term8661 = new Character('y');
        HashMap term8788 = new HashMap();
        ArrayList term8828 = new ArrayList();
        ((ArrayList) term8828).add("ZfdXfCCFDf");
        ((ArrayList) term8828).add("MwwjNtdOFT");
        ((ArrayList) term8828).add("VYkqXKVlAJ");
        ((ArrayList) term8828).add("XkIoWJRNwN");
        ((ArrayList) term8828).add("aNWLJdrZMq");
        ((ArrayList) term8828).add("HHmNoYxIGj");
        ((ArrayList) term8828).add("PtirvZmsGt");
        ((ArrayList) term8828).add("HWkpTmtlrc");
        Class<? extends Object> term158589 = Class.forName((String) "org.apache.commons.csv.Token$Type");
        Field term158588 = ((Class) term158589).getDeclaredField((String) "INVALID");
        ((Field) term158588).setAccessible(true);
        Object enum70 = ((Field) term158588).get((Object) null);
        term8643 = newInstance(Class.forName("org.apache.commons.csv.CSVParser"));
        Object term8644 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term8690 = (Object[]) newArray("java.lang.String", 8);
        Object term8799 = newInstance(Class.forName("org.apache.commons.csv.Lexer"));
        Object term8806 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        char[] term8810 = (char[]) newCharArray(3);
        Object term8820 = newInstance(Class.forName("java.lang.Object"));
        char[] term8821 = (char[]) newCharArray(6);
        Object term8929 = newInstance(Class.forName("org.apache.commons.csv.Token"));
        Object term8941 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term8942 = (byte[]) newByteArray(50);
        setCharField(term8644, term8644.getClass(), "delimiter", 'E');
        setField(term8644, term8644.getClass(), "quoteChar", term8646);
        setField(term8644, term8644.getClass(), "quotePolicy", enum69);
        setField(term8644, term8644.getClass(), "commentStart", term8659);
        setField(term8644, term8644.getClass(), "escape", term8661);
        setBooleanField(term8644, term8644.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term8644, term8644.getClass(), "ignoreEmptyHeaders", true);
        setBooleanField(term8644, term8644.getClass(), "ignoreEmptyLines", false);
        setField(term8644, term8644.getClass(), "recordSeparator", "LWyEaeIyAo");
        setField(term8644, term8644.getClass(), "nullString", "yVMkkQhvmN");
        setElement(term8690, 0, "mvrkADEgpp");
        setElement(term8690, 1, "pXOkjyeIRb");
        setElement(term8690, 2, "GgZWSjxjyE");
        setElement(term8690, 3, "EeBVbzjcCI");
        setElement(term8690, 4, "UfQtPRyWRC");
        setElement(term8690, 5, "FPvxVzzSvD");
        setElement(term8690, 6, "WHcwFgsGFC");
        setElement(term8690, 7, "HzqpegHiRq");
        setField(term8644, term8644.getClass(), "header", term8690);
        setBooleanField(term8644, term8644.getClass(), "skipHeaderRecord", false);
        setField(term8643, term8643.getClass(), "format", term8644);
        setField(term8643, term8643.getClass(), "headerMap", term8788);
        setCharField(term8799, term8799.getClass(), "delimiter", 'x');
        setCharField(term8799, term8799.getClass(), "escape", 'f');
        setCharField(term8799, term8799.getClass(), "quoteChar", 'b');
        setCharField(term8799, term8799.getClass(), "commentStart", 'S');
        setBooleanField(term8799, term8799.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term8799, term8799.getClass(), "ignoreEmptyLines", false);
        setIntField(term8806, term8806.getClass(), "lastChar", 454281060);
        setLongField(term8806, term8806.getClass(), "eolCounter", 8428634514691209827L);
        setBooleanField(term8806, term8806.getClass(), "closed", false);
        setField(term8806, term8806.getClass(), "in", null);
        setCharElement(term8810, 0, 'Q');
        setCharElement(term8810, 1, 'Y');
        setCharElement(term8810, 2, 'B');
        setField(term8806, term8806.getClass(), "cb", term8810);
        setIntField(term8806, term8806.getClass(), "nChars", -1786399638);
        setIntField(term8806, term8806.getClass(), "nextChar", 2055867847);
        setIntField(term8806, term8806.getClass(), "markedChar", -1048298087);
        setIntField(term8806, term8806.getClass(), "readAheadLimit", 292681826);
        setBooleanField(term8806, term8806.getClass(), "skipLF", false);
        setBooleanField(term8806, term8806.getClass(), "markedSkipLF", false);
        setField(term8806, term8806.getClass(), "lock", term8820);
        setCharElement(term8821, 0, 'e');
        setCharElement(term8821, 1, 'p');
        setCharElement(term8821, 2, 'C');
        setCharElement(term8821, 3, 'T');
        setCharElement(term8821, 4, 'i');
        setCharElement(term8821, 5, 'm');
        setField(term8806, term8806.getClass(), "skipBuffer", term8821);
        setField(term8799, term8799.getClass(), "reader", term8806);
        setField(term8643, term8643.getClass(), "lexer", term8799);
        setField(term8643, term8643.getClass(), "record", term8828);
        setLongField(term8643, term8643.getClass(), "recordNumber", -2585684163342970173L);
        setField(term8929, term8929.getClass(), "type", enum70);
        setField(term8941, term8941.getClass(), "value", term8942);
        setByteField(term8941, term8941.getClass(), "coder", (byte) 0);
        setIntField(term8941, term8941.getClass(), "count", 0);
        setField(term8929, term8929.getClass(), "content", term8941);
        setBooleanField(term8929, term8929.getClass(), "isReady", false);
        setField(term8643, term8643.getClass(), "reusableToken", term8929);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "nextRecord", argTypes, term8643, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


