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

public class CharacterReader_consumeDigitSequence_244833343559 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1152764;

    public CharacterReader_consumeDigitSequence_244833343559() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1152764 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term1152810 = newInstance(Class.forName("java.io.StringReader"));
        setIntField(term1152764, term1152764.getClass(), "bufPos", -2147483648);
        setIntField(term1152764, term1152764.getClass(), "bufSplitPoint", -2147483648);
        setIntField(term1152764, term1152764.getClass(), "readerPos", 0);
        setField(term1152764, term1152764.getClass(), "reader", term1152810);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "consumeDigitSequence", argTypes, term1152764, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


