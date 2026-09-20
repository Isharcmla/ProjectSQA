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
import java.lang.Integer;

public class ExtendedBufferedReader_read_178095410210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57;
     Object term76;
     Object term79;
     Object term81;

    public ExtendedBufferedReader_read_178095410210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57 = newInstance(Class.forName("org.apache.commons.csv.ExtendedBufferedReader"));
        char[] term60 = (char[]) newCharArray(1);
        Object term68 = newInstance(Class.forName("java.lang.Object"));
        char[] term69 = (char[]) newCharArray(6);
        setIntField(term57, term57.getClass(), "lastChar", 1134449235);
        setIntField(term57, term57.getClass(), "lineCounter", -883034806);
        setField(term57, term57.getClass(), "in", null);
        setCharElement(term60, 0, 't');
        setField(term57, term57.getClass(), "cb", term60);
        setIntField(term57, term57.getClass(), "nChars", 1585847225);
        setIntField(term57, term57.getClass(), "nextChar", 597278769);
        setIntField(term57, term57.getClass(), "markedChar", -1685132342);
        setIntField(term57, term57.getClass(), "readAheadLimit", -1456670397);
        setBooleanField(term57, term57.getClass(), "skipLF", true);
        setBooleanField(term57, term57.getClass(), "markedSkipLF", true);
        setField(term57, term57.getClass(), "lock", term68);
        setCharElement(term69, 0, 'R');
        setCharElement(term69, 1, 'r');
        setCharElement(term69, 2, 'b');
        setCharElement(term69, 3, 'M');
        setCharElement(term69, 4, 'u');
        setCharElement(term69, 5, 'L');
        setField(term57, term57.getClass(), "skipBuffer", term69);
        term76 = (char[]) newCharArray(2);
        setCharElement(term76, 0, 'c');
        setCharElement(term76, 1, 'g');
        term79 = new Integer(1622346318);
        term81 = new Integer(1048535127);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.ExtendedBufferedReader");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term76;
        args[1] = term79;
        args[2] = term81;
        try {
            callMethod(klass, "read", argTypes, term57, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};
