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

public class QueryParser_byId_42421040827 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term251;

    public QueryParser_byId_42421040827() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term278 = new ArrayList();
        ((ArrayList) term278).add((Object)null);
        term251 = newInstance(Class.forName("org.jsoup.select.QueryParser"));
        Object term252 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term252, term252.getClass(), "queue", "NRdvgJlhkX");
        setIntField(term252, term252.getClass(), "pos", -1922583790);
        setField(term251, term251.getClass(), "tq", term252);
        setField(term251, term251.getClass(), "query", "uuaPigETmJ");
        setField(term251, term251.getClass(), "evals", term278);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.QueryParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "byId", argTypes, term251, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


