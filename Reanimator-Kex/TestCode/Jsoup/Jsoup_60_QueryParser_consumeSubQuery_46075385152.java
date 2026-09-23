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

public class QueryParser_consumeSubQuery_46075385152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11292;

    public QueryParser_consumeSubQuery_46075385152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11292 = newInstance(Class.forName("org.jsoup.select.QueryParser"));
        Object term11352 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term11352, term11352.getClass(), "queue", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
        setIntField(term11352, term11352.getClass(), "pos", -493);
        setField(term11292, term11292.getClass(), "tq", term11352);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.QueryParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "consumeSubQuery", argTypes, term11292, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


