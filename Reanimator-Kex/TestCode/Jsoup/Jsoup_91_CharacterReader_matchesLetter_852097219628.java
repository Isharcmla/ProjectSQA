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

public class CharacterReader_matchesLetter_852097219628 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term160961;

    public CharacterReader_matchesLetter_852097219628() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term160961 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term161011 = newInstance(Class.forName("java.io.PushbackReader"));
        setIntField(term160961, term160961.getClass(), "bufPos", -2147483648);
        setIntField(term160961, term160961.getClass(), "bufSplitPoint", -2147483648);
        setField(term160961, term160961.getClass(), "reader", term161011);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "matchesLetter", argTypes, term160961, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


