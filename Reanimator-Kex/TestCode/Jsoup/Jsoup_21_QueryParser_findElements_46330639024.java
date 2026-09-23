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
import java.lang.StringIndexOutOfBoundsException;
import static org.jsoup.select.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class QueryParser_findElements_46330639024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term200;

    public QueryParser_findElements_46330639024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term227 = new ArrayList();
        ((ArrayList) term227).add((Object)null);
        ((ArrayList) term227).add((Object)null);
        ((ArrayList) term227).add((Object)null);
        ((ArrayList) term227).add((Object)null);
        term200 = newInstance(Class.forName("org.jsoup.select.QueryParser"));
        Object term201 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term201, term201.getClass(), "queue", "hRNSzYYIrc");
        setIntField(term201, term201.getClass(), "pos", 391863371);
        setField(term200, term200.getClass(), "tq", term201);
        setField(term200, term200.getClass(), "query", "RMFIsYGgne");
        setField(term200, term200.getClass(), "evals", term227);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.QueryParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "findElements", argTypes, term200, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


