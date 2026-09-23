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

public class CharacterReader_matchesAnySorted_492648898113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21300;
     Object term21588;

    public CharacterReader_matchesAnySorted_492648898113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21300 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term21300, term21300.getClass(), "bufPos", -2147483648);
        setIntField(term21300, term21300.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term21300, term21300.getClass(), "bufLength", -2147483648);
        term21588 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term21588, term21588.getClass(), "charBuf", null);
        setField(term21588, term21588.getClass(), "reader", null);
        setIntField(term21588, term21588.getClass(), "bufLength", -2147483648);
        setIntField(term21588, term21588.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term21588, term21588.getClass(), "bufPos", -2147483648);
        setIntField(term21588, term21588.getClass(), "readerPos", 0);
        setIntField(term21588, term21588.getClass(), "bufMark", 0);
        setField(term21588, term21588.getClass(), "stringCache", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "matchesAnySorted", argTypes, term21300, args);
        assertTrue(recursiveEquals(term21300, term21588));
        assertTrue(recursiveEquals(retValue, false));
    }

};


