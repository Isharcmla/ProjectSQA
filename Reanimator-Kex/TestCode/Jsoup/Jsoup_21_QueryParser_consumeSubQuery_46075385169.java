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

public class QueryParser_consumeSubQuery_46075385169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20427;

    public QueryParser_consumeSubQuery_46075385169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20427 = newInstance(Class.forName("org.jsoup.select.QueryParser"));
        Object term20487 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term20487, term20487.getClass(), "queue", "(                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ");
        setIntField(term20487, term20487.getClass(), "pos", -490);
        setField(term20427, term20427.getClass(), "tq", term20487);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.QueryParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "consumeSubQuery", argTypes, term20427, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


