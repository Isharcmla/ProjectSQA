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

public class QueryParser_indexEquals_195188948132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term608;

    public QueryParser_indexEquals_195188948132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term635 = new ArrayList();
        ((ArrayList) term635).add((Object)null);
        ((ArrayList) term635).add((Object)null);
        ((ArrayList) term635).add((Object)null);
        ((ArrayList) term635).add((Object)null);
        ((ArrayList) term635).add((Object)null);
        term608 = newInstance(Class.forName("org.jsoup.select.QueryParser"));
        Object term609 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term609, term609.getClass(), "queue", "BYqFIqCKAV");
        setIntField(term609, term609.getClass(), "pos", -522618178);
        setField(term608, term608.getClass(), "tq", term609);
        setField(term608, term608.getClass(), "query", "vrQLuWIDJX");
        setField(term608, term608.getClass(), "evals", term635);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.QueryParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "indexEquals", argTypes, term608, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


