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

public class QueryParser_consumeSubQuery_46075385143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8869;
     Object term8983;

    public QueryParser_consumeSubQuery_46075385143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8869 = newInstance(Class.forName("org.jsoup.select.QueryParser"));
        Object term8929 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term8929, term8929.getClass(), "queue", "");
        setIntField(term8929, term8929.getClass(), "pos", 0);
        setField(term8869, term8869.getClass(), "tq", term8929);
        term8983 = newInstance(Class.forName("org.jsoup.select.QueryParser"));
        Object term8984 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term8984, term8984.getClass(), "queue", "");
        setIntField(term8984, term8984.getClass(), "pos", 0);
        setField(term8983, term8983.getClass(), "tq", term8984);
        setField(term8983, term8983.getClass(), "query", null);
        setField(term8983, term8983.getClass(), "evals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.QueryParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "consumeSubQuery", argTypes, term8869, args);
        assertTrue(recursiveEquals(term8869, term8983));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


