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

public class CharacterReader_consumeToEnd_1419030637216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41425;

    public CharacterReader_consumeToEnd_1419030637216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41425 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term41425, term41425.getClass(), "bufPos", -2147483648);
        setIntField(term41425, term41425.getClass(), "bufSplitPoint", -2147483647);
        setField(term41425, term41425.getClass(), "charBuf", null);
        setField(term41425, term41425.getClass(), "stringCache", null);
        setIntField(term41425, term41425.getClass(), "bufLength", -2147483640);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "consumeToEnd", argTypes, term41425, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


