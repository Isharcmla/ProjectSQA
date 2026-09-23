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

public class TokenQueue_matchesAny_212248099896 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1474678;
     Object term1472600;

    public TokenQueue_matchesAny_212248099896() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1474678 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term1474678, term1474678.getClass(), "queue", "\u0001\u0002\u0002\u0002                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
        setIntField(term1474678, term1474678.getClass(), "pos", 0);
        term1472600 = (Object[]) newArray("java.lang.String", 495);
        setElement(term1472600, 0, "\u0001\u0002\u0002\u0002                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
        setElement(term1472600, 1, "\u0001\u0002\u0002\u0002                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
        setElement(term1472600, 2, "\u0001\u0002\u0002\u0002                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
        setElement(term1472600, 3, "\u0001\u0002\u0002\u0002                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TokenQueue");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1472600;
        callMethod(klass, "matchesAny", argTypes, term1474678, args);
    }

};


