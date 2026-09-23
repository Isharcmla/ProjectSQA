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
import java.lang.Character;

public class TokenQueue_chompBalanced_174562799072 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1463065;
     Object term1463067;
     Object term1463069;

    public TokenQueue_chompBalanced_174562799072() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1463065 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term1463065, term1463065.getClass(), "queue", null);
        setIntField(term1463065, term1463065.getClass(), "pos", 0);
        term1463067 = new Character((char) 0);
        term1463069 = new Character((char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TokenQueue");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = char.class;
        argTypes[1] = char.class;
        Object[] args = new Object[2];
        args[0] = term1463067;
        args[1] = term1463069;
        callMethod(klass, "chompBalanced", argTypes, term1463065, args);
    }

};


