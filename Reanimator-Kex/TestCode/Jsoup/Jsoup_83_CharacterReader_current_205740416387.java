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
import org.jsoup.UncheckedIOException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CharacterReader_current_205740416387 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16493;

    public CharacterReader_current_205740416387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16493 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term16531 = newInstance(Class.forName("java.io.Reader$1"));
        setIntField(term16493, term16493.getClass(), "bufPos", -2147483648);
        setIntField(term16493, term16493.getClass(), "bufSplitPoint", -2147483648);
        setField(term16493, term16493.getClass(), "reader", term16531);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "current", argTypes, term16493, args);
            assertTrue(false);
        }
        catch (UncheckedIOException e) {
        }

    }

};


