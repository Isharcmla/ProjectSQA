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
import java.lang.Object;

public class TokenQueue_matchesAny_212248099895 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1717361;
     Object term1716281;

    public TokenQueue_matchesAny_212248099895() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1717361 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term1717361, term1717361.getClass(), "queue", " \u0002                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
        setIntField(term1717361, term1717361.getClass(), "pos", 0);
        term1716281 = (Object[]) newArray("java.lang.String", 491);
        setElement(term1716281, 0, " \u0002                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
        setElement(term1716281, 1, " \u0002                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TokenQueue");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1716281;
        callMethod(klass, "matchesAny", argTypes, term1717361, args);
    }

};


