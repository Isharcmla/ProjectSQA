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
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.parser.EqualityUtils.*;

public class CharacterReader_consumeToEnd_1419030637146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27421;
     Object term27576;

    public CharacterReader_consumeToEnd_1419030637146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27421 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term27421, term27421.getClass(), "bufPos", -2147483648);
        setIntField(term27421, term27421.getClass(), "bufSplitPoint", -2147483647);
        term27576 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term27576, term27576.getClass(), "charBuf", null);
        setField(term27576, term27576.getClass(), "reader", null);
        setIntField(term27576, term27576.getClass(), "bufLength", 0);
        setIntField(term27576, term27576.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term27576, term27576.getClass(), "bufPos", 0);
        setIntField(term27576, term27576.getClass(), "readerPos", 0);
        setIntField(term27576, term27576.getClass(), "bufMark", 0);
        setField(term27576, term27576.getClass(), "stringCache", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "consumeToEnd", argTypes, term27421, args);
        assertTrue(recursiveEquals(term27421, term27576));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


