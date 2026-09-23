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

public class CharacterReader_matches_1862078842218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41523;
     Object term42120;

    public CharacterReader_matches_1862078842218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41523 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term41523, term41523.getClass(), "bufPos", -2147483648);
        setIntField(term41523, term41523.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term41523, term41523.getClass(), "bufLength", -2147483648);
        term42120 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term42120, term42120.getClass(), "charBuf", null);
        setField(term42120, term42120.getClass(), "reader", null);
        setIntField(term42120, term42120.getClass(), "bufLength", -2147483648);
        setIntField(term42120, term42120.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term42120, term42120.getClass(), "bufPos", -2147483648);
        setIntField(term42120, term42120.getClass(), "readerPos", 0);
        setIntField(term42120, term42120.getClass(), "bufMark", 0);
        setField(term42120, term42120.getClass(), "stringCache", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "matches", argTypes, term41523, args);
        assertTrue(recursiveEquals(term41523, term42120));
        assertTrue(recursiveEquals(retValue, true));
    }

};


