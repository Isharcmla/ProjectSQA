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

public class CharacterReader_consumeToAny_1422703610864 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term282047;
     Object term280779;

    public CharacterReader_consumeToAny_1422703610864() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term282047 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term280783 = (char[]) newCharArray(511);
        setIntField(term282047, term282047.getClass(), "bufPos", -536870900);
        setIntField(term282047, term282047.getClass(), "bufSplitPoint", -536870899);
        setIntField(term282047, term282047.getClass(), "bufLength", -536870889);
        setField(term282047, term282047.getClass(), "charBuf", term280783);
        setField(term282047, term282047.getClass(), "stringCache", null);
        term280779 = (char[]) newCharArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term280779;
        try {
            callMethod(klass, "consumeToAny", argTypes, term282047, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


