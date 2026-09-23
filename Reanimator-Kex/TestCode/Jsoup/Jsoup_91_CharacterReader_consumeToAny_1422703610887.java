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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CharacterReader_consumeToAny_1422703610887 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term303239;
     Object term301012;

    public CharacterReader_consumeToAny_1422703610887() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term303239 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term301016 = (char[]) newCharArray(1000);
        setIntField(term303239, term303239.getClass(), "bufPos", 992);
        setIntField(term303239, term303239.getClass(), "bufSplitPoint", 993);
        setIntField(term303239, term303239.getClass(), "bufLength", 1003);
        setField(term303239, term303239.getClass(), "charBuf", term301016);
        setField(term303239, term303239.getClass(), "stringCache", null);
        term301012 = (char[]) newCharArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term301012;
        try {
            callMethod(klass, "consumeToAny", argTypes, term303239, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


