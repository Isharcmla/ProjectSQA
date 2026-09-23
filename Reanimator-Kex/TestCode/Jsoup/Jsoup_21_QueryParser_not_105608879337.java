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

public class QueryParser_not_105608879337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term867;

    public QueryParser_not_105608879337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term894 = new ArrayList();
        term867 = newInstance(Class.forName("org.jsoup.select.QueryParser"));
        Object term868 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term868, term868.getClass(), "queue", "kuTXqwMtDB");
        setIntField(term868, term868.getClass(), "pos", -1685132342);
        setField(term867, term867.getClass(), "tq", term868);
        setField(term867, term867.getClass(), "query", "Ghbwtircqb");
        setField(term867, term867.getClass(), "evals", term894);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.QueryParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "not", argTypes, term867, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


