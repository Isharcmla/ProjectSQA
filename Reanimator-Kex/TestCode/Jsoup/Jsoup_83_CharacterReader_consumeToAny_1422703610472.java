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

public class CharacterReader_consumeToAny_1422703610472 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117014;
     Object term116802;

    public CharacterReader_consumeToAny_1422703610472() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term117014 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term116806 = (char[]) newCharArray(41);
        setIntField(term117014, term117014.getClass(), "bufPos", 8396800);
        setIntField(term117014, term117014.getClass(), "bufSplitPoint", 8396801);
        setIntField(term117014, term117014.getClass(), "bufLength", 8396803);
        setCharElement(term116806, 0, (char) 8192);
        setCharElement(term116806, 1, (char) 8192);
        setCharElement(term116806, 2, (char) 8192);
        setCharElement(term116806, 3, (char) 8192);
        setCharElement(term116806, 4, (char) 8192);
        setCharElement(term116806, 5, (char) 8192);
        setCharElement(term116806, 6, (char) 8192);
        setCharElement(term116806, 7, (char) 8192);
        setCharElement(term116806, 8, (char) 8192);
        setCharElement(term116806, 9, (char) 8192);
        setCharElement(term116806, 10, (char) 8192);
        setField(term117014, term117014.getClass(), "charBuf", term116806);
        setField(term117014, term117014.getClass(), "stringCache", null);
        term116802 = (char[]) newCharArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term116802;
        try {
            callMethod(klass, "consumeToAny", argTypes, term117014, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


