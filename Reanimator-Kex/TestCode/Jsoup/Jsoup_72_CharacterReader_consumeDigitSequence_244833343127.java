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

public class CharacterReader_consumeDigitSequence_244833343127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24515;

    public CharacterReader_consumeDigitSequence_244833343127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24515 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object[] term24412 = (Object[]) newArray("java.lang.String", 489);
        setIntField(term24515, term24515.getClass(), "bufPos", -2147483648);
        setIntField(term24515, term24515.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term24515, term24515.getClass(), "bufLength", -2147483648);
        setField(term24515, term24515.getClass(), "charBuf", null);
        setField(term24515, term24515.getClass(), "stringCache", term24412);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "consumeDigitSequence", argTypes, term24515, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


