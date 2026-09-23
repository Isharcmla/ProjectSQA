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

public class CharacterReader_matchesIgnoreCase_705501828257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50074;

    public CharacterReader_matchesIgnoreCase_705501828257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50074 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term49965 = (char[]) newCharArray(0);
        setIntField(term50074, term50074.getClass(), "bufPos", -2147483648);
        setIntField(term50074, term50074.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term50074, term50074.getClass(), "bufLength", -2147483647);
        setField(term50074, term50074.getClass(), "charBuf", term49965);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "p";
        try {
            callMethod(klass, "matchesIgnoreCase", argTypes, term50074, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


