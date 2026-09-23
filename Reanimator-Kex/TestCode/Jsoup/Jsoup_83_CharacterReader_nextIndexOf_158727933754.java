package org.jsoup.parser;

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
import java.lang.NullPointerException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CharacterReader_nextIndexOf_158727933754 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1035;

    public CharacterReader_nextIndexOf_158727933754() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1035 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term1036 = (char[]) newCharArray(9);
        Object[] term1051 = (Object[]) newArray("java.lang.String", 3);
        setCharElement(term1036, 0, 'Z');
        setCharElement(term1036, 1, 'p');
        setCharElement(term1036, 2, 'V');
        setCharElement(term1036, 3, 'm');
        setCharElement(term1036, 4, 'a');
        setCharElement(term1036, 5, 'n');
        setCharElement(term1036, 6, 'W');
        setCharElement(term1036, 7, 'E');
        setCharElement(term1036, 8, 'G');
        setField(term1035, term1035.getClass(), "charBuf", term1036);
        setField(term1035, term1035.getClass(), "reader", null);
        setIntField(term1035, term1035.getClass(), "bufLength", 458147407);
        setIntField(term1035, term1035.getClass(), "bufSplitPoint", -184153539);
        setIntField(term1035, term1035.getClass(), "bufPos", 493620644);
        setIntField(term1035, term1035.getClass(), "readerPos", 1328271830);
        setIntField(term1035, term1035.getClass(), "bufMark", 1596070772);
        setElement(term1051, 0, "aKnKipADSo");
        setElement(term1051, 1, "wSQxaModmm");
        setElement(term1051, 2, "UlajhuVLaP");
        setField(term1035, term1035.getClass(), "stringCache", term1051);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.CharSequence");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "nextIndexOf", argTypes, term1035, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


