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
import java.lang.Object;
import java.util.ArrayList;

public class QueryParser_has_105012963237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term765;

    public QueryParser_has_105012963237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term792 = new ArrayList();
        ((ArrayList) term792).add((Object)null);
        ((ArrayList) term792).add((Object)null);
        ((ArrayList) term792).add((Object)null);
        term765 = newInstance(Class.forName("org.jsoup.select.QueryParser"));
        Object term766 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term766, term766.getClass(), "queue", "OWDIEULEFu");
        setIntField(term766, term766.getClass(), "pos", 1585847225);
        setField(term765, term765.getClass(), "tq", term766);
        setField(term765, term765.getClass(), "query", "dWRymuLBtr");
        setField(term765, term765.getClass(), "evals", term792);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.QueryParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "has", argTypes, term765, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


