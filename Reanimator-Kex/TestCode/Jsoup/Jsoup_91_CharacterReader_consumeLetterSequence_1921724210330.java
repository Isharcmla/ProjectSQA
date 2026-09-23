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
import java.lang.IllegalArgumentException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CharacterReader_consumeLetterSequence_1921724210330 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73063;

    public CharacterReader_consumeLetterSequence_1921724210330() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73063 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term73105 = newInstance(Class.forName("java.io.FileReader"));
        setIntField(term73063, term73063.getClass(), "bufPos", -2147483648);
        setIntField(term73063, term73063.getClass(), "bufSplitPoint", -2147483648);
        setField(term73063, term73063.getClass(), "reader", term73105);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "consumeLetterSequence", argTypes, term73063, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


