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

public class CharacterReader_consume_97879059846 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term519;

    public CharacterReader_consume_97879059846() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term519 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term520 = (char[]) newCharArray(7);
        Object[] term533 = (Object[]) newArray("java.lang.String", 1);
        setCharElement(term520, 0, 'j');
        setCharElement(term520, 1, 'l');
        setCharElement(term520, 2, 'J');
        setCharElement(term520, 3, 'A');
        setCharElement(term520, 4, 'E');
        setCharElement(term520, 5, 't');
        setCharElement(term520, 6, 'R');
        setField(term519, term519.getClass(), "charBuf", term520);
        setField(term519, term519.getClass(), "reader", null);
        setIntField(term519, term519.getClass(), "bufLength", -6029667);
        setIntField(term519, term519.getClass(), "bufSplitPoint", -2068769794);
        setIntField(term519, term519.getClass(), "bufPos", -117576464);
        setIntField(term519, term519.getClass(), "readerPos", -1007160944);
        setIntField(term519, term519.getClass(), "bufMark", 1135664017);
        setElement(term533, 0, "RkybSrpybU");
        setField(term519, term519.getClass(), "stringCache", term533);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "consume", argTypes, term519, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


