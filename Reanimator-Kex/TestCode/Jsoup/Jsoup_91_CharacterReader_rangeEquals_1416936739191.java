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

public class CharacterReader_rangeEquals_1416936739191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38144;

    public CharacterReader_rangeEquals_1416936739191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38144 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term38144, term38144.getClass(), "charBuf", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = 0;
        args[1] = 28;
        args[2] = "                            ";
        try {
            callMethod(klass, "rangeEquals", argTypes, term38144, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


