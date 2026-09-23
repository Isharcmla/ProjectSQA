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

public class CharacterReader_consumeToAny_1422703610726 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term195845;
     Object term194718;

    public CharacterReader_consumeToAny_1422703610726() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term195845 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term194722 = (char[]) newCharArray(490);
        setIntField(term195845, term195845.getClass(), "bufPos", 488);
        setIntField(term195845, term195845.getClass(), "bufSplitPoint", 489);
        setIntField(term195845, term195845.getClass(), "bufLength", 493);
        setField(term195845, term195845.getClass(), "charBuf", term194722);
        setField(term195845, term195845.getClass(), "stringCache", null);
        term194718 = (char[]) newCharArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term194718;
        try {
            callMethod(klass, "consumeToAny", argTypes, term195845, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


