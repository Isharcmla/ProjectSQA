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

public class QueryParser_not_105608879341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term973;

    public QueryParser_not_105608879341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1000 = new ArrayList();
        ((ArrayList) term1000).add((Object)null);
        ((ArrayList) term1000).add((Object)null);
        ((ArrayList) term1000).add((Object)null);
        ((ArrayList) term1000).add((Object)null);
        ((ArrayList) term1000).add((Object)null);
        ((ArrayList) term1000).add((Object)null);
        ((ArrayList) term1000).add((Object)null);
        ((ArrayList) term1000).add((Object)null);
        term973 = newInstance(Class.forName("org.jsoup.select.QueryParser"));
        Object term974 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term974, term974.getClass(), "queue", "nyiiPDVjAc");
        setIntField(term974, term974.getClass(), "pos", 1622346318);
        setField(term973, term973.getClass(), "tq", term974);
        setField(term973, term973.getClass(), "query", "aKnKipADSo");
        setField(term973, term973.getClass(), "evals", term1000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.QueryParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "not", argTypes, term973, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


