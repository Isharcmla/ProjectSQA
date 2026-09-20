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

public class ExtendedBufferedReader_read_17799988688 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public ExtendedBufferedReader_read_17799988688() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        char[] term4 = (char[]) newCharArray(5);
        Object term16 = newInstance(Class.forName("java.lang.Object"));
        char[] term17 = (char[]) newCharArray(4);
        setIntField(term1, term1.getClass(), "lastChar", 568599855);
        setIntField(term1, term1.getClass(), "lineCounter", 1162663216);
        setField(term1, term1.getClass(), "in", null);
        setCharElement(term4, 0, 'P');
        setCharElement(term4, 1, 'A');
        setCharElement(term4, 2, 'E');
        setCharElement(term4, 3, 'B');
        setCharElement(term4, 4, 't');
        setField(term1, term1.getClass(), "cb", term4);
        setIntField(term1, term1.getClass(), "nChars", 1484323161);
        setIntField(term1, term1.getClass(), "nextChar", 391863371);
        setIntField(term1, term1.getClass(), "markedChar", -1922583790);
        setIntField(term1, term1.getClass(), "readAheadLimit", -616727354);
        setBooleanField(term1, term1.getClass(), "skipLF", false);
        setBooleanField(term1, term1.getClass(), "markedSkipLF", false);
        setField(term1, term1.getClass(), "lock", term16);
        setCharElement(term17, 0, 'n');
        setCharElement(term17, 1, 'Z');
        setCharElement(term17, 2, 't');
        setCharElement(term17, 3, 'T');
        setField(term1, term1.getClass(), "skipBuffer", term17);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.ExtendedBufferedReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "read", argTypes, term1, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};
