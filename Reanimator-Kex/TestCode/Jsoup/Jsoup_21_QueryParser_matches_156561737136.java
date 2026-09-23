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

public class QueryParser_matches_156561737136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term814;
     Object term845;

    public QueryParser_matches_156561737136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term841 = new ArrayList();
        ((ArrayList) term841).add((Object)null);
        term814 = newInstance(Class.forName("org.jsoup.select.QueryParser"));
        Object term815 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term815, term815.getClass(), "queue", "AijpHYOFuy");
        setIntField(term815, term815.getClass(), "pos", 597278769);
        setField(term814, term814.getClass(), "tq", term815);
        setField(term814, term814.getClass(), "query", "SbAoxhfrkn");
        setField(term814, term814.getClass(), "evals", term841);
        term845 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.QueryParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term845;
        try {
            callMethod(klass, "matches", argTypes, term814, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


