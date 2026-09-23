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

public class CharacterReader_consumeToAny_1422703610821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term243995;
     Object term243831;

    public CharacterReader_consumeToAny_1422703610821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term243995 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term243995, term243995.getClass(), "bufPos", 821579267);
        setIntField(term243995, term243995.getClass(), "bufSplitPoint", 821579268);
        setIntField(term243995, term243995.getClass(), "bufLength", 821579279);
        setField(term243995, term243995.getClass(), "charBuf", null);
        setField(term243995, term243995.getClass(), "stringCache", null);
        term243831 = (char[]) newCharArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term243831;
        try {
            callMethod(klass, "consumeToAny", argTypes, term243995, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


