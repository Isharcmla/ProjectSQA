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
import java.lang.NullPointerException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CharacterReader_consumeLetterThenDigitSequence_1769752354448 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1109788;

    public CharacterReader_consumeLetterThenDigitSequence_1769752354448() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1109788 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object[] term1109680 = (Object[]) newArray("java.lang.String", 489);
        setIntField(term1109788, term1109788.getClass(), "bufPos", -2147483648);
        setIntField(term1109788, term1109788.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term1109788, term1109788.getClass(), "bufLength", -2147483648);
        setField(term1109788, term1109788.getClass(), "charBuf", null);
        setField(term1109788, term1109788.getClass(), "stringCache", term1109680);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "consumeLetterThenDigitSequence", argTypes, term1109788, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


