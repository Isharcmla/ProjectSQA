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

public class CharacterReader_consumeToAny_1422703610808 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term230808;
     Object term229110;

    public CharacterReader_consumeToAny_1422703610808() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term230808 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term229114 = (char[]) newCharArray(785);
        setIntField(term230808, term230808.getClass(), "bufPos", 784);
        setIntField(term230808, term230808.getClass(), "bufSplitPoint", 785);
        setIntField(term230808, term230808.getClass(), "bufLength", 787);
        setField(term230808, term230808.getClass(), "charBuf", term229114);
        setField(term230808, term230808.getClass(), "stringCache", null);
        term229110 = (char[]) newCharArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term229110;
        try {
            callMethod(klass, "consumeToAny", argTypes, term230808, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


