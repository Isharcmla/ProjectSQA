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

public class CharacterReader_consumeLetterThenDigitSequence_1769752354234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49947;
     Object term50056;

    public CharacterReader_consumeLetterThenDigitSequence_1769752354234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49947 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term49947, term49947.getClass(), "bufPos", -2147483648);
        setIntField(term49947, term49947.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term49947, term49947.getClass(), "bufLength", -2147483648);
        term50056 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term50056, term50056.getClass(), "charBuf", null);
        setField(term50056, term50056.getClass(), "reader", null);
        setIntField(term50056, term50056.getClass(), "bufLength", -2147483648);
        setIntField(term50056, term50056.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term50056, term50056.getClass(), "bufPos", -2147483648);
        setIntField(term50056, term50056.getClass(), "readerPos", 0);
        setIntField(term50056, term50056.getClass(), "bufMark", 0);
        setField(term50056, term50056.getClass(), "stringCache", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "consumeLetterThenDigitSequence", argTypes, term49947, args);
        assertTrue(recursiveEquals(term49947, term50056));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


