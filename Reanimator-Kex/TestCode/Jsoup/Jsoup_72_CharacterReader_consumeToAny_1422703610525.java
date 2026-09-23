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

public class CharacterReader_consumeToAny_1422703610525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1143012;
     Object term1142622;

    public CharacterReader_consumeToAny_1422703610525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1143012 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term1142626 = (char[]) newCharArray(105);
        setIntField(term1143012, term1143012.getClass(), "bufPos", -1207408640);
        setIntField(term1143012, term1143012.getClass(), "bufSplitPoint", -1207408639);
        setIntField(term1143012, term1143012.getClass(), "bufLength", -1207408631);
        setField(term1143012, term1143012.getClass(), "charBuf", term1142626);
        setField(term1143012, term1143012.getClass(), "stringCache", null);
        term1142622 = (char[]) newCharArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1142622;
        try {
            callMethod(klass, "consumeToAny", argTypes, term1143012, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


