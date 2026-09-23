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

public class CharacterReader_consumeTagName_1536181816134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36689;
     Object term37378;

    public CharacterReader_consumeTagName_1536181816134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36689 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term36689, term36689.getClass(), "pos", -2147483648);
        setIntField(term36689, term36689.getClass(), "length", -2147483648);
        setField(term36689, term36689.getClass(), "input", null);
        term37378 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term37378, term37378.getClass(), "input", null);
        setIntField(term37378, term37378.getClass(), "length", -2147483648);
        setIntField(term37378, term37378.getClass(), "pos", -2147483648);
        setIntField(term37378, term37378.getClass(), "mark", 0);
        setField(term37378, term37378.getClass(), "stringCache", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "consumeTagName", argTypes, term36689, args);
        assertTrue(recursiveEquals(term36689, term37378));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


