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

public class CharacterReader_consumeToEnd_1419030637581 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term144736;

    public CharacterReader_consumeToEnd_1419030637581() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term144736 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term144774 = newInstance(Class.forName("java.io.Reader$1"));
        setIntField(term144736, term144736.getClass(), "bufPos", -2147483648);
        setIntField(term144736, term144736.getClass(), "bufSplitPoint", -2147483648);
        setField(term144736, term144736.getClass(), "reader", term144774);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "consumeToEnd", argTypes, term144736, args);
            assertTrue(false);
        }
        catch (UncheckedIOException e) {
        }

    }

};


