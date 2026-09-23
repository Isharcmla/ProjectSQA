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
import java.lang.StringIndexOutOfBoundsException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CharacterReader_consumeToEnd_141903063759 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1803;

    public CharacterReader_consumeToEnd_141903063759() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1803 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term1804 = (char[]) newCharArray(5);
        Object[] term1815 = (Object[]) newArray("java.lang.String", 1);
        setCharElement(term1804, 0, 'S');
        setCharElement(term1804, 1, 'z');
        setCharElement(term1804, 2, 'Y');
        setCharElement(term1804, 3, 'Y');
        setCharElement(term1804, 4, 'I');
        setField(term1803, term1803.getClass(), "charBuf", term1804);
        setField(term1803, term1803.getClass(), "reader", null);
        setIntField(term1803, term1803.getClass(), "bufLength", -1547384488);
        setIntField(term1803, term1803.getClass(), "bufSplitPoint", 1442160736);
        setIntField(term1803, term1803.getClass(), "bufPos", 1114000454);
        setIntField(term1803, term1803.getClass(), "readerPos", -556405712);
        setIntField(term1803, term1803.getClass(), "bufMark", -1772434990);
        setElement(term1815, 0, "tPlsykYBqO");
        setField(term1803, term1803.getClass(), "stringCache", term1815);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "consumeToEnd", argTypes, term1803, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


