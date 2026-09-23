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

public class CharacterReader_consumeToAny_1422703610794 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term224038;
     Object term222906;

    public CharacterReader_consumeToAny_1422703610794() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term224038 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term222910 = (char[]) newCharArray(494);
        setIntField(term224038, term224038.getClass(), "bufPos", -1342175231);
        setIntField(term224038, term224038.getClass(), "bufSplitPoint", -1342175230);
        setIntField(term224038, term224038.getClass(), "bufLength", -1342175225);
        setField(term224038, term224038.getClass(), "charBuf", term222910);
        setField(term224038, term224038.getClass(), "stringCache", null);
        term222906 = (char[]) newCharArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term222906;
        try {
            callMethod(klass, "consumeToAny", argTypes, term224038, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


