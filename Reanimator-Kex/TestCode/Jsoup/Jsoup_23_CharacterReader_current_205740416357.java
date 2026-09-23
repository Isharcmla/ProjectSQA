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
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.parser.EqualityUtils.*;

public class CharacterReader_current_205740416357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5434;
     Object term5451;

    public CharacterReader_current_205740416357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5434 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term5434, term5434.getClass(), "pos", -2147483648);
        setIntField(term5434, term5434.getClass(), "length", -2147483648);
        term5451 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term5451, term5451.getClass(), "input", null);
        setIntField(term5451, term5451.getClass(), "length", -2147483648);
        setIntField(term5451, term5451.getClass(), "pos", -2147483648);
        setIntField(term5451, term5451.getClass(), "mark", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "current", argTypes, term5434, args);
        assertTrue(recursiveEquals(term5434, term5451));
        assertTrue(recursiveEquals(retValue, 65535));
    }

};


