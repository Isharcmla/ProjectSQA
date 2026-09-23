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

public class CharacterReader_consume_978790598550 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154518;

    public CharacterReader_consume_978790598550() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term154518 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term154564 = newInstance(Class.forName("java.io.StringReader"));
        setIntField(term154518, term154518.getClass(), "bufPos", -2147483648);
        setIntField(term154518, term154518.getClass(), "bufSplitPoint", -2147483648);
        setField(term154518, term154518.getClass(), "reader", term154564);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "consume", argTypes, term154518, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


