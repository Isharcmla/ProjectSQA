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

public class QueryParser_containsData_3179236739 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term869;

    public QueryParser_containsData_3179236739() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term896 = new ArrayList();
        term869 = newInstance(Class.forName("org.jsoup.select.QueryParser"));
        Object term870 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term870, term870.getClass(), "queue", "kuTXqwMtDB");
        setIntField(term870, term870.getClass(), "pos", -1685132342);
        setField(term869, term869.getClass(), "tq", term870);
        setField(term869, term869.getClass(), "query", "Ghbwtircqb");
        setField(term869, term869.getClass(), "evals", term896);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.QueryParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "containsData", argTypes, term869, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


