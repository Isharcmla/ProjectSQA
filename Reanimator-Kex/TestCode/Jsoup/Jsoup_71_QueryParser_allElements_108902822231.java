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
import java.util.ArrayList;

public class QueryParser_allElements_108902822231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term455;
     Object term4440;

    public QueryParser_allElements_108902822231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term482 = new ArrayList();
        ((ArrayList) term482).add((Object)null);
        ((ArrayList) term482).add((Object)null);
        ((ArrayList) term482).add((Object)null);
        ((ArrayList) term482).add((Object)null);
        ((ArrayList) term482).add((Object)null);
        ((ArrayList) term482).add((Object)null);
        ((ArrayList) term482).add((Object)null);
        term455 = newInstance(Class.forName("org.jsoup.select.QueryParser"));
        Object term456 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term456, term456.getClass(), "queue", "HyxfbSQYBe");
        setIntField(term456, term456.getClass(), "pos", 1227103734);
        setField(term455, term455.getClass(), "tq", term456);
        setField(term455, term455.getClass(), "query", "pCTimMblYc");
        setField(term455, term455.getClass(), "evals", term482);
        Object term4448 = newInstance(Class.forName("org.jsoup.select.Evaluator$AllElements"));
        ArrayList term4446 = new ArrayList();
        ((ArrayList) term4446).add((Object)null);
        ((ArrayList) term4446).add((Object)null);
        ((ArrayList) term4446).add((Object)null);
        ((ArrayList) term4446).add((Object)null);
        ((ArrayList) term4446).add((Object)null);
        ((ArrayList) term4446).add((Object)null);
        ((ArrayList) term4446).add((Object)null);
        ((ArrayList) term4446).add(term4448);
        term4440 = newInstance(Class.forName("org.jsoup.select.QueryParser"));
        Object term4441 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term4441, term4441.getClass(), "queue", "HyxfbSQYBe");
        setIntField(term4441, term4441.getClass(), "pos", 1227103734);
        setField(term4440, term4440.getClass(), "tq", term4441);
        setField(term4440, term4440.getClass(), "query", "pCTimMblYc");
        setField(term4440, term4440.getClass(), "evals", term4446);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.QueryParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "allElements", argTypes, term455, args);
        assertTrue(recursiveEquals(term455, term4440));
    }

};


