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

public class CharacterReader_consumeToAny_1422703610875 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term292073;
     Object term291383;

    public CharacterReader_consumeToAny_1422703610875() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term292073 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term291387 = (char[]) newCharArray(248);
        setIntField(term292073, term292073.getClass(), "bufPos", 244);
        setIntField(term292073, term292073.getClass(), "bufSplitPoint", 245);
        setIntField(term292073, term292073.getClass(), "bufLength", 255);
        setField(term292073, term292073.getClass(), "charBuf", term291387);
        setField(term292073, term292073.getClass(), "stringCache", null);
        term291383 = (char[]) newCharArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term291383;
        try {
            callMethod(klass, "consumeToAny", argTypes, term292073, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


