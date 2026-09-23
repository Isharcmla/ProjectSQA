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

public class CharacterReader_matchesLetter_852097219266 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51647;
     Object term51741;

    public CharacterReader_matchesLetter_852097219266() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51647 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term51647, term51647.getClass(), "bufPos", -2147483648);
        setIntField(term51647, term51647.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term51647, term51647.getClass(), "bufLength", -2147483648);
        term51741 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term51741, term51741.getClass(), "charBuf", null);
        setField(term51741, term51741.getClass(), "reader", null);
        setIntField(term51741, term51741.getClass(), "bufLength", -2147483648);
        setIntField(term51741, term51741.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term51741, term51741.getClass(), "bufPos", -2147483648);
        setIntField(term51741, term51741.getClass(), "readerPos", 0);
        setIntField(term51741, term51741.getClass(), "bufMark", 0);
        setField(term51741, term51741.getClass(), "stringCache", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "matchesLetter", argTypes, term51647, args);
        assertTrue(recursiveEquals(term51647, term51741));
        assertTrue(recursiveEquals(retValue, false));
    }

};


