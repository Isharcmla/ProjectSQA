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

public class CharacterReader_consumeToAny_1422703610327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70809;
     Object term70690;

    public CharacterReader_consumeToAny_1422703610327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70809 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term70702 = (char[]) newCharArray(8);
        setIntField(term70809, term70809.getClass(), "bufPos", -2147483648);
        setIntField(term70809, term70809.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term70809, term70809.getClass(), "bufLength", -2147483647);
        setField(term70809, term70809.getClass(), "charBuf", term70702);
        term70690 = (char[]) newCharArray(8);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term70690;
        try {
            callMethod(klass, "consumeToAny", argTypes, term70809, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


