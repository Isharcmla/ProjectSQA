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

public class QueryParser_byClass_143583848926 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term302;

    public QueryParser_byClass_143583848926() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term329 = new ArrayList();
        ((ArrayList) term329).add((Object)null);
        ((ArrayList) term329).add((Object)null);
        ((ArrayList) term329).add((Object)null);
        ((ArrayList) term329).add((Object)null);
        ((ArrayList) term329).add((Object)null);
        ((ArrayList) term329).add((Object)null);
        term302 = newInstance(Class.forName("org.jsoup.select.QueryParser"));
        Object term303 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term303, term303.getClass(), "queue", "MxlszYVzRf");
        setIntField(term303, term303.getClass(), "pos", -616727354);
        setField(term302, term302.getClass(), "tq", term303);
        setField(term302, term302.getClass(), "query", "LQFpaHEwXR");
        setField(term302, term302.getClass(), "evals", term329);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.QueryParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "byClass", argTypes, term302, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


