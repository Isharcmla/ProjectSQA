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
import java.lang.IllegalArgumentException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CharacterReader_matchesIgnoreCase_705501828290 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78398;

    public CharacterReader_matchesIgnoreCase_705501828290() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78398 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term78456 = newInstance(Class.forName("java.io.Console$LineReader"));
        setIntField(term78398, term78398.getClass(), "bufPos", -2147483648);
        setIntField(term78398, term78398.getClass(), "bufSplitPoint", -2147483648);
        setIntField(term78398, term78398.getClass(), "readerPos", 0);
        setField(term78398, term78398.getClass(), "reader", term78456);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "matchesIgnoreCase", argTypes, term78398, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


