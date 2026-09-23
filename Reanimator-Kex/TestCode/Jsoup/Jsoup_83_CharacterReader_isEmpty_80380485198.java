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

public class CharacterReader_isEmpty_80380485198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19368;
     Object term19461;

    public CharacterReader_isEmpty_80380485198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19368 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term19368, term19368.getClass(), "bufPos", -2147483648);
        setIntField(term19368, term19368.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term19368, term19368.getClass(), "bufLength", -2147483648);
        term19461 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term19461, term19461.getClass(), "charBuf", null);
        setField(term19461, term19461.getClass(), "reader", null);
        setIntField(term19461, term19461.getClass(), "bufLength", -2147483648);
        setIntField(term19461, term19461.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term19461, term19461.getClass(), "bufPos", -2147483648);
        setIntField(term19461, term19461.getClass(), "readerPos", 0);
        setIntField(term19461, term19461.getClass(), "bufMark", 0);
        setField(term19461, term19461.getClass(), "stringCache", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isEmpty", argTypes, term19368, args);
        assertTrue(recursiveEquals(term19368, term19461));
        assertTrue(recursiveEquals(retValue, true));
    }

};


