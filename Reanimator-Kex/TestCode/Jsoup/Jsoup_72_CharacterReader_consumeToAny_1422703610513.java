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
import java.lang.StringIndexOutOfBoundsException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CharacterReader_consumeToAny_1422703610513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1140380;
     Object term1140219;

    public CharacterReader_consumeToAny_1422703610513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1140380 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term1140223 = (char[]) newCharArray(0);
        setIntField(term1140380, term1140380.getClass(), "bufPos", -1);
        setIntField(term1140380, term1140380.getClass(), "bufSplitPoint", 0);
        setIntField(term1140380, term1140380.getClass(), "bufLength", 47);
        setField(term1140380, term1140380.getClass(), "charBuf", term1140223);
        term1140219 = (char[]) newCharArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1140219;
        try {
            callMethod(klass, "consumeToAny", argTypes, term1140380, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


