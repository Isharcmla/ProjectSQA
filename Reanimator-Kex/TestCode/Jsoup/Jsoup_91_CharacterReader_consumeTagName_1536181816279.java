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

public class CharacterReader_consumeTagName_1536181816279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60080;

    public CharacterReader_consumeTagName_1536181816279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60080 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term60124 = newInstance(Class.forName("java.io.PipedReader"));
        setIntField(term60080, term60080.getClass(), "bufPos", -2147483648);
        setIntField(term60080, term60080.getClass(), "bufSplitPoint", -2147483648);
        setField(term60080, term60080.getClass(), "reader", term60124);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "consumeTagName", argTypes, term60080, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


