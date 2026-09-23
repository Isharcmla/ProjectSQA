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

public class CharacterReader_nextIndexOf_1667543582444 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111246;
     Object term111676;

    public CharacterReader_nextIndexOf_1667543582444() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term111246 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term111246, term111246.getClass(), "bufPos", -2147483648);
        setIntField(term111246, term111246.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term111246, term111246.getClass(), "bufLength", -2147483648);
        term111676 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term111676, term111676.getClass(), "charBuf", null);
        setField(term111676, term111676.getClass(), "reader", null);
        setIntField(term111676, term111676.getClass(), "bufLength", -2147483648);
        setIntField(term111676, term111676.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term111676, term111676.getClass(), "bufPos", -2147483648);
        setIntField(term111676, term111676.getClass(), "readerPos", 0);
        setIntField(term111676, term111676.getClass(), "bufMark", 0);
        setField(term111676, term111676.getClass(), "stringCache", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = (char) 0;
        Object retValue = callMethod(klass, "nextIndexOf", argTypes, term111246, args);
        assertTrue(recursiveEquals(term111246, term111676));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


