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

public class CharacterReader_isEmpty_80380485159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5828;
     Object term6217;

    public CharacterReader_isEmpty_80380485159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5828 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term5828, term5828.getClass(), "pos", -2147483648);
        setIntField(term5828, term5828.getClass(), "length", -2147483648);
        term6217 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term6217, term6217.getClass(), "input", null);
        setIntField(term6217, term6217.getClass(), "length", -2147483648);
        setIntField(term6217, term6217.getClass(), "pos", -2147483648);
        setIntField(term6217, term6217.getClass(), "mark", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isEmpty", argTypes, term5828, args);
        assertTrue(recursiveEquals(term5828, term6217));
        assertTrue(recursiveEquals(retValue, true));
    }

};


