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

public class TokenQueue_advance_100318713046 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term545;
     Object term4097;

    public TokenQueue_advance_100318713046() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term545 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term545, term545.getClass(), "queue", "eZFUvlxvGV");
        setIntField(term545, term545.getClass(), "pos", -883034806);
        term4097 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term4097, term4097.getClass(), "queue", "eZFUvlxvGV");
        setIntField(term4097, term4097.getClass(), "pos", -883034805);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TokenQueue");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "advance", argTypes, term545, args);
        assertTrue(recursiveEquals(term545, term4097));
    }

};


