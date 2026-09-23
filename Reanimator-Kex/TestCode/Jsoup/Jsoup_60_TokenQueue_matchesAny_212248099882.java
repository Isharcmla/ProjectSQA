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

public class TokenQueue_matchesAny_212248099882 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1464178;
     Object term1463102;

    public TokenQueue_matchesAny_212248099882() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1464178 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term1464178, term1464178.getClass(), "queue", " \u0002\u0002                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
        setIntField(term1464178, term1464178.getClass(), "pos", 0);
        term1463102 = (Object[]) newArray("java.lang.String", 2);
        setElement(term1463102, 0, " \u0002\u0002                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
        setElement(term1463102, 1, " \u0002\u0002                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TokenQueue");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1463102;
        callMethod(klass, "matchesAny", argTypes, term1464178, args);
    }

};


