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
import java.lang.Object;

public class CharacterReader_consumeTo_1694855709534 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134347;

    public CharacterReader_consumeTo_1694855709534() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term134347 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term134393 = newInstance(Class.forName("java.io.StringReader"));
        setIntField(term134347, term134347.getClass(), "bufPos", -2147483648);
        setIntField(term134347, term134347.getClass(), "bufSplitPoint", -2147483648);
        setField(term134347, term134347.getClass(), "reader", term134393);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "consumeTo", argTypes, term134347, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


