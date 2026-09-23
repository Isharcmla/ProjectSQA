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

public class CharacterReader_matches_2014332895111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21902;
     Object term22171;

    public CharacterReader_matches_2014332895111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21902 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term21902, term21902.getClass(), "bufPos", -2147483648);
        setIntField(term21902, term21902.getClass(), "bufLength", -2147483648);
        term22171 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term22171, term22171.getClass(), "charBuf", null);
        setField(term22171, term22171.getClass(), "reader", null);
        setIntField(term22171, term22171.getClass(), "bufLength", -2147483648);
        setIntField(term22171, term22171.getClass(), "bufSplitPoint", 0);
        setIntField(term22171, term22171.getClass(), "bufPos", -2147483648);
        setIntField(term22171, term22171.getClass(), "readerPos", 0);
        setIntField(term22171, term22171.getClass(), "bufMark", 0);
        setField(term22171, term22171.getClass(), "stringCache", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = (char) 0;
        Object retValue = callMethod(klass, "matches", argTypes, term21902, args);
        assertTrue(recursiveEquals(term21902, term22171));
        assertTrue(recursiveEquals(retValue, false));
    }

};


