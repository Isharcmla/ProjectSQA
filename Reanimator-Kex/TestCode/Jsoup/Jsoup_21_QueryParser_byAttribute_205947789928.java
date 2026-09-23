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

public class QueryParser_byAttribute_205947789928 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term404;

    public QueryParser_byAttribute_205947789928() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term431 = new ArrayList();
        ((ArrayList) term431).add((Object)null);
        ((ArrayList) term431).add((Object)null);
        ((ArrayList) term431).add((Object)null);
        ((ArrayList) term431).add((Object)null);
        ((ArrayList) term431).add((Object)null);
        ((ArrayList) term431).add((Object)null);
        term404 = newInstance(Class.forName("org.jsoup.select.QueryParser"));
        Object term405 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term405, term405.getClass(), "queue", "ZiaGIbnzTs");
        setIntField(term405, term405.getClass(), "pos", -2038273078);
        setField(term404, term404.getClass(), "tq", term405);
        setField(term404, term404.getClass(), "query", "tbcdzjIfER");
        setField(term404, term404.getClass(), "evals", term431);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.QueryParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "byAttribute", argTypes, term404, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


