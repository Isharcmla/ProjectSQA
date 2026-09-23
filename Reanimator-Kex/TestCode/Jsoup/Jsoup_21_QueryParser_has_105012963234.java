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

public class QueryParser_has_105012963234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term710;

    public QueryParser_has_105012963234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term737 = new ArrayList();
        ((ArrayList) term737).add((Object)null);
        ((ArrayList) term737).add((Object)null);
        term710 = newInstance(Class.forName("org.jsoup.select.QueryParser"));
        Object term711 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term711, term711.getClass(), "queue", "IoAlmYsBwc");
        setIntField(term711, term711.getClass(), "pos", -883034806);
        setField(term710, term710.getClass(), "tq", term711);
        setField(term710, term710.getClass(), "query", "TEParAifyi");
        setField(term710, term710.getClass(), "evals", term737);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.QueryParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "has", argTypes, term710, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


