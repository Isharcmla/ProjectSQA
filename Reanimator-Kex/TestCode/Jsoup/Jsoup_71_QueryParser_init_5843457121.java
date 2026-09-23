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

public class QueryParser_init_5843457121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1082;

    public QueryParser_init_5843457121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1088 = new ArrayList();
        term1082 = newInstance(Class.forName("org.jsoup.select.QueryParser"));
        Object term1083 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term1083, term1083.getClass(), "queue", "PAEBtnZtTD");
        setIntField(term1083, term1083.getClass(), "pos", 0);
        setField(term1082, term1082.getClass(), "tq", term1083);
        setField(term1082, term1082.getClass(), "query", "PAEBtnZtTD");
        setField(term1082, term1082.getClass(), "evals", term1088);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.QueryParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PAEBtnZtTD";
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term1082));
    }

};


