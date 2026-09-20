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
import java.lang.Object;

public class ExtendedBufferedReader_getLineNumber_156847003313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term156;
     Object term1704;

    public ExtendedBufferedReader_getLineNumber_156847003313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term156 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        char[] term159 = (char[]) newCharArray(5);
        Object term171 = newInstance(Class.forName("java.lang.Object"));
        char[] term172 = (char[]) newCharArray(5);
        setIntField(term156, term156.getClass(), "lastChar", -73683645);
        setIntField(term156, term156.getClass(), "lineCounter", -226514366);
        setField(term156, term156.getClass(), "in", null);
        setCharElement(term159, 0, 'V');
        setCharElement(term159, 1, 'm');
        setCharElement(term159, 2, 'a');
        setCharElement(term159, 3, 'n');
        setCharElement(term159, 4, 'W');
        setField(term156, term156.getClass(), "cb", term159);
        setIntField(term156, term156.getClass(), "nChars", 1193880199);
        setIntField(term156, term156.getClass(), "nextChar", -1087774327);
        setIntField(term156, term156.getClass(), "markedChar", -1530420153);
        setIntField(term156, term156.getClass(), "readAheadLimit", -469968304);
        setBooleanField(term156, term156.getClass(), "skipLF", false);
        setBooleanField(term156, term156.getClass(), "markedSkipLF", true);
        setField(term156, term156.getClass(), "lock", term171);
        setCharElement(term172, 0, 'E');
        setCharElement(term172, 1, 'G');
        setCharElement(term172, 2, 't');
        setCharElement(term172, 3, 'D');
        setCharElement(term172, 4, 'I');
        setField(term156, term156.getClass(), "skipBuffer", term172);
        term1704 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        char[] term1705 = (char[]) newCharArray(5);
        Object term1706 = newInstance(Class.forName("java.lang.Object"));
        char[] term1707 = (char[]) newCharArray(5);
        setIntField(term1704, term1704.getClass(), "lastChar", -73683645);
        setIntField(term1704, term1704.getClass(), "lineCounter", -226514366);
        setField(term1704, term1704.getClass(), "in", null);
        setCharElement(term1705, 0, 'V');
        setCharElement(term1705, 1, 'm');
        setCharElement(term1705, 2, 'a');
        setCharElement(term1705, 3, 'n');
        setCharElement(term1705, 4, 'W');
        setField(term1704, term1704.getClass(), "cb", term1705);
        setIntField(term1704, term1704.getClass(), "nChars", 1193880199);
        setIntField(term1704, term1704.getClass(), "nextChar", -1087774327);
        setIntField(term1704, term1704.getClass(), "markedChar", -1530420153);
        setIntField(term1704, term1704.getClass(), "readAheadLimit", -469968304);
        setBooleanField(term1704, term1704.getClass(), "skipLF", false);
        setBooleanField(term1704, term1704.getClass(), "markedSkipLF", true);
        setField(term1704, term1704.getClass(), "lock", term1706);
        setCharElement(term1707, 0, 'E');
        setCharElement(term1707, 1, 'G');
        setCharElement(term1707, 2, 't');
        setCharElement(term1707, 3, 'D');
        setCharElement(term1707, 4, 'I');
        setField(term1704, term1704.getClass(), "skipBuffer", term1707);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.ExtendedBufferedReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLineNumber", argTypes, term156, args);
        assertTrue(recursiveEquals(term156, term1704));
        assertTrue(recursiveEquals(retValue, -226514366));
    }

};
