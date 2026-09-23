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

public class CharacterReader_containsIgnoreCase_2016817048513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133521;

    public CharacterReader_containsIgnoreCase_2016817048513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term133521 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term133563 = newInstance(Class.forName("java.io.FileReader"));
        setIntField(term133521, term133521.getClass(), "bufPos", -2147483648);
        setIntField(term133521, term133521.getClass(), "bufSplitPoint", -2147483648);
        setField(term133521, term133521.getClass(), "reader", term133563);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        try {
            callMethod(klass, "containsIgnoreCase", argTypes, term133521, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


