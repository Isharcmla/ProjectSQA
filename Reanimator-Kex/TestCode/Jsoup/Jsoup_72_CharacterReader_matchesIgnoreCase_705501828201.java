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
import java.lang.NullPointerException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CharacterReader_matchesIgnoreCase_705501828201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38748;

    public CharacterReader_matchesIgnoreCase_705501828201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38748 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term38748, term38748.getClass(), "bufPos", -2147483648);
        setIntField(term38748, term38748.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term38748, term38748.getClass(), "bufLength", -2147483647);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = " ";
        try {
            callMethod(klass, "matchesIgnoreCase", argTypes, term38748, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


