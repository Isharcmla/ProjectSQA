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

public class CharacterReader_consumeToAny_1422703610493 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3375629;
     Object term3374924;

    public CharacterReader_consumeToAny_1422703610493() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3375629 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term3374927 = (char[]) newCharArray(261);
        Object[] term3375450 = (Object[]) newArray("java.lang.String", 492);
        setIntField(term3375629, term3375629.getClass(), "pos", -1085719296);
        setIntField(term3375629, term3375629.getClass(), "length", -1085719291);
        setField(term3375629, term3375629.getClass(), "input", term3374927);
        setField(term3375629, term3375629.getClass(), "stringCache", term3375450);
        term3374924 = (char[]) newCharArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term3374924;
        try {
            callMethod(klass, "consumeToAny", argTypes, term3375629, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


