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
import java.lang.StringIndexOutOfBoundsException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Tokeniser_consumeCharacterReference_547768274114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108467;

    public Tokeniser_consumeCharacterReference_547768274114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108467 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term108537 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term108537, term108537.getClass(), "pos", -2147483648);
        setIntField(term108537, term108537.getClass(), "length", -2147483647);
        setField(term108537, term108537.getClass(), "input", "");
        setField(term108467, term108467.getClass(), "reader", term108537);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Character");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = false;
        try {
            callMethod(klass, "consumeCharacterReference", argTypes, term108467, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


