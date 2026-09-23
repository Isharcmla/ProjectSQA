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

public class QueryParser_consumeSubQuery_46075385125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149;

    public QueryParser_consumeSubQuery_46075385125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term176 = new ArrayList();
        ((ArrayList) term176).add((Object)null);
        ((ArrayList) term176).add((Object)null);
        ((ArrayList) term176).add((Object)null);
        term149 = newInstance(Class.forName("org.jsoup.select.QueryParser"));
        Object term150 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term150, term150.getClass(), "queue", "SzjVpOQTyS");
        setIntField(term150, term150.getClass(), "pos", 1484323161);
        setField(term149, term149.getClass(), "tq", term150);
        setField(term149, term149.getClass(), "query", "MjGYSRKTNF");
        setField(term149, term149.getClass(), "evals", term176);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.QueryParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "consumeSubQuery", argTypes, term149, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


