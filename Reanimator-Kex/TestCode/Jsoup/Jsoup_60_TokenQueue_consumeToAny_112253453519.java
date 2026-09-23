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

public class TokenQueue_consumeToAny_112253453519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term731;
     Object term745;

    public TokenQueue_consumeToAny_112253453519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term731 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term731, term731.getClass(), "queue", "dWRymuLBtr");
        setIntField(term731, term731.getClass(), "pos", 1622346318);
        term745 = (Object[]) newArray("java.lang.String", 3);
        setElement(term745, 0, "AijpHYOFuy");
        setElement(term745, 1, "SbAoxhfrkn");
        setElement(term745, 2, "kuTXqwMtDB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TokenQueue");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term745;
        callMethod(klass, "consumeToAny", argTypes, term731, args);
    }

};


