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

public class ExtendedBufferedReader_lookAhead_94965308812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term130;

    public ExtendedBufferedReader_lookAhead_94965308812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term130 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        char[] term133 = (char[]) newCharArray(1);
        Object term141 = newInstance(Class.forName("java.lang.Object"));
        char[] term142 = (char[]) newCharArray(6);
        setIntField(term130, term130.getClass(), "lastChar", 590364439);
        setIntField(term130, term130.getClass(), "lineCounter", 865208305);
        setField(term130, term130.getClass(), "in", null);
        setCharElement(term133, 0, 'F');
        setField(term130, term130.getClass(), "cb", term133);
        setIntField(term130, term130.getClass(), "nChars", -1275173084);
        setIntField(term130, term130.getClass(), "nextChar", -244121226);
        setIntField(term130, term130.getClass(), "markedChar", -203030934);
        setIntField(term130, term130.getClass(), "readAheadLimit", -1179120542);
        setBooleanField(term130, term130.getClass(), "skipLF", false);
        setBooleanField(term130, term130.getClass(), "markedSkipLF", true);
        setField(term130, term130.getClass(), "lock", term141);
        setCharElement(term142, 0, 's');
        setCharElement(term142, 1, 'j');
        setCharElement(term142, 2, 'J');
        setCharElement(term142, 3, 'C');
        setCharElement(term142, 4, 'Z');
        setCharElement(term142, 5, 'p');
        setField(term130, term130.getClass(), "skipBuffer", term142);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.ExtendedBufferedReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "lookAhead", argTypes, term130, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};
