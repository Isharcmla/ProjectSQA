package org.jsoup.select;

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
import static org.jsoup.select.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.select.EqualityUtils.*;
import java.lang.Object;

public class QueryParser_consumeSubQuery_46075385153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12122;
     Object term24522;

    public QueryParser_consumeSubQuery_46075385153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12122 = newInstance(Class.forName("org.jsoup.select.QueryParser"));
        Object term12182 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term12182, term12182.getClass(), "queue", "");
        setIntField(term12182, term12182.getClass(), "pos", 0);
        setField(term12122, term12122.getClass(), "tq", term12182);
        term24522 = newInstance(Class.forName("org.jsoup.select.QueryParser"));
        Object term24523 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term24523, term24523.getClass(), "queue", "");
        setIntField(term24523, term24523.getClass(), "pos", 0);
        setField(term24522, term24522.getClass(), "tq", term24523);
        setField(term24522, term24522.getClass(), "query", null);
        setField(term24522, term24522.getClass(), "evals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.QueryParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "consumeSubQuery", argTypes, term12122, args);
        assertTrue(recursiveEquals(term12122, term24522));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


