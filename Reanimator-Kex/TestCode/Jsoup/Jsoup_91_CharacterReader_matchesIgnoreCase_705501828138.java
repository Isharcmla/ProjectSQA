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

public class CharacterReader_matchesIgnoreCase_705501828138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27120;
     Object term27330;

    public CharacterReader_matchesIgnoreCase_705501828138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27120 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term27120, term27120.getClass(), "bufPos", -2147483648);
        setIntField(term27120, term27120.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term27120, term27120.getClass(), "bufLength", -2147483648);
        term27330 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term27330, term27330.getClass(), "charBuf", null);
        setField(term27330, term27330.getClass(), "reader", null);
        setIntField(term27330, term27330.getClass(), "bufLength", -2147483648);
        setIntField(term27330, term27330.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term27330, term27330.getClass(), "bufPos", -2147483648);
        setIntField(term27330, term27330.getClass(), "readerPos", 0);
        setIntField(term27330, term27330.getClass(), "bufMark", 0);
        setField(term27330, term27330.getClass(), "stringCache", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "matchesIgnoreCase", argTypes, term27120, args);
        assertTrue(recursiveEquals(term27120, term27330));
        assertTrue(recursiveEquals(retValue, true));
    }

};


