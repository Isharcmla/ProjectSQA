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

public class CharacterReader_consumeLetterSequence_1921724210424 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106896;

    public CharacterReader_consumeLetterSequence_1921724210424() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term106896 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term106950 = newInstance(Class.forName("java.io.LineNumberReader"));
        setIntField(term106896, term106896.getClass(), "bufPos", -2147483648);
        setIntField(term106896, term106896.getClass(), "bufSplitPoint", -2147483648);
        setField(term106896, term106896.getClass(), "reader", term106950);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "consumeLetterSequence", argTypes, term106896, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


