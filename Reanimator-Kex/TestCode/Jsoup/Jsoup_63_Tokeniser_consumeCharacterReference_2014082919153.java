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

public class Tokeniser_consumeCharacterReference_2014082919153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term165026;

    public Tokeniser_consumeCharacterReference_2014082919153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term165026 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term165096 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term164931 = (char[]) newCharArray(0);
        setIntField(term165096, term165096.getClass(), "bufPos", -2147483648);
        setIntField(term165096, term165096.getClass(), "bufLength", -2147483647);
        setIntField(term165096, term165096.getClass(), "bufSplitPoint", -2147483647);
        setField(term165096, term165096.getClass(), "charBuf", term164931);
        setField(term165026, term165026.getClass(), "reader", term165096);
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
            callMethod(klass, "consumeCharacterReference", argTypes, term165026, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


