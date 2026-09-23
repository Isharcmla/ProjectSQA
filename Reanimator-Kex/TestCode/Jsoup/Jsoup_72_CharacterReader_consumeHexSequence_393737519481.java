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

public class CharacterReader_consumeHexSequence_393737519481 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1127395;

    public CharacterReader_consumeHexSequence_393737519481() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1127395 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term1127451 = newInstance(Class.forName("java.io.InputStreamReader"));
        setIntField(term1127395, term1127395.getClass(), "bufPos", -2147483648);
        setIntField(term1127395, term1127395.getClass(), "bufSplitPoint", -2147483648);
        setIntField(term1127395, term1127395.getClass(), "readerPos", 0);
        setField(term1127395, term1127395.getClass(), "reader", term1127451);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "consumeHexSequence", argTypes, term1127395, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


