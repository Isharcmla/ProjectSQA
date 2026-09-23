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
import java.lang.Object;

public class CharacterReader_consumeToAny_1422703610745 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term205790;
     Object term204122;

    public CharacterReader_consumeToAny_1422703610745() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term205790 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term204126 = (char[]) newCharArray(749);
        Object[] term205625 = (Object[]) newArray("java.lang.String", 497);
        setIntField(term205790, term205790.getClass(), "bufPos", -1419058688);
        setIntField(term205790, term205790.getClass(), "bufSplitPoint", -1419058687);
        setIntField(term205790, term205790.getClass(), "bufLength", -1419058683);
        setField(term205790, term205790.getClass(), "charBuf", term204126);
        setField(term205790, term205790.getClass(), "stringCache", term205625);
        term204122 = (char[]) newCharArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term204122;
        try {
            callMethod(klass, "consumeToAny", argTypes, term205790, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


