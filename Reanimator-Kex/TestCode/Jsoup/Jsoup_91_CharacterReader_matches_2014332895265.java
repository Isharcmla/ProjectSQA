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

public class CharacterReader_matches_2014332895265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57918;
     Object term58239;

    public CharacterReader_matches_2014332895265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57918 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term57918, term57918.getClass(), "bufPos", -2147483648);
        setIntField(term57918, term57918.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term57918, term57918.getClass(), "bufLength", -2147483648);
        term58239 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term58239, term58239.getClass(), "charBuf", null);
        setField(term58239, term58239.getClass(), "reader", null);
        setIntField(term58239, term58239.getClass(), "bufLength", -2147483648);
        setIntField(term58239, term58239.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term58239, term58239.getClass(), "bufPos", -2147483648);
        setIntField(term58239, term58239.getClass(), "readerPos", 0);
        setIntField(term58239, term58239.getClass(), "bufMark", 0);
        setField(term58239, term58239.getClass(), "stringCache", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = (char) 0;
        Object retValue = callMethod(klass, "matches", argTypes, term57918, args);
        assertTrue(recursiveEquals(term57918, term58239));
        assertTrue(recursiveEquals(retValue, false));
    }

};


