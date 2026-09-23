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

public class CharacterReader_init_2130144751361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80585;

    public CharacterReader_init_2130144751361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term80529 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object[] term80444 = (Object[]) newArray("java.lang.String", 0);
        setField(term80529, term80529.getClass(), "stringCache", term80444);
        term80585 = newInstance(Class.forName("java.io.InputStreamReader"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.Reader");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term80585;
        args[1] = 0;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


