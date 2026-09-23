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

public class CharacterReader_consumeDigitSequence_244833343202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38676;
     Object term39138;

    public CharacterReader_consumeDigitSequence_244833343202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38676 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term38676, term38676.getClass(), "bufPos", -2147483648);
        setIntField(term38676, term38676.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term38676, term38676.getClass(), "bufLength", -2147483648);
        term39138 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term39138, term39138.getClass(), "charBuf", null);
        setField(term39138, term39138.getClass(), "reader", null);
        setIntField(term39138, term39138.getClass(), "bufLength", -2147483648);
        setIntField(term39138, term39138.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term39138, term39138.getClass(), "bufPos", -2147483648);
        setIntField(term39138, term39138.getClass(), "readerPos", 0);
        setIntField(term39138, term39138.getClass(), "bufMark", 0);
        setField(term39138, term39138.getClass(), "stringCache", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "consumeDigitSequence", argTypes, term38676, args);
        assertTrue(recursiveEquals(term38676, term39138));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


