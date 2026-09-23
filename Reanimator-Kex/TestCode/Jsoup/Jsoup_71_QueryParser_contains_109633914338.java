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

public class QueryParser_contains_109633914338 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term816;
     Object term847;

    public QueryParser_contains_109633914338() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term843 = new ArrayList();
        ((ArrayList) term843).add((Object)null);
        term816 = newInstance(Class.forName("org.jsoup.select.QueryParser"));
        Object term817 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term817, term817.getClass(), "queue", "AijpHYOFuy");
        setIntField(term817, term817.getClass(), "pos", 597278769);
        setField(term816, term816.getClass(), "tq", term817);
        setField(term816, term816.getClass(), "query", "SbAoxhfrkn");
        setField(term816, term816.getClass(), "evals", term843);
        term847 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.QueryParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term847;
        try {
            callMethod(klass, "contains", argTypes, term816, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


