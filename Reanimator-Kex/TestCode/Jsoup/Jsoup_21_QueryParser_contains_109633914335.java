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
import java.lang.Boolean;

public class QueryParser_contains_109633914335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term761;
     Object term792;

    public QueryParser_contains_109633914335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term788 = new ArrayList();
        ((ArrayList) term788).add((Object)null);
        ((ArrayList) term788).add((Object)null);
        ((ArrayList) term788).add((Object)null);
        term761 = newInstance(Class.forName("org.jsoup.select.QueryParser"));
        Object term762 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term762, term762.getClass(), "queue", "OWDIEULEFu");
        setIntField(term762, term762.getClass(), "pos", 1585847225);
        setField(term761, term761.getClass(), "tq", term762);
        setField(term761, term761.getClass(), "query", "dWRymuLBtr");
        setField(term761, term761.getClass(), "evals", term788);
        term792 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.QueryParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term792;
        try {
            callMethod(klass, "contains", argTypes, term761, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


