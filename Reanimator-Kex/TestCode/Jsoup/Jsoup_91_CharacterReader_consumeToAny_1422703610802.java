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

public class CharacterReader_consumeToAny_1422703610802 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term227467;
     Object term227244;

    public CharacterReader_consumeToAny_1422703610802() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term227467 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term227248 = (char[]) newCharArray(34);
        setIntField(term227467, term227467.getClass(), "bufPos", 31);
        setIntField(term227467, term227467.getClass(), "bufSplitPoint", 32);
        setIntField(term227467, term227467.getClass(), "bufLength", 36);
        setField(term227467, term227467.getClass(), "charBuf", term227248);
        setField(term227467, term227467.getClass(), "stringCache", null);
        term227244 = (char[]) newCharArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term227244;
        try {
            callMethod(klass, "consumeToAny", argTypes, term227467, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


