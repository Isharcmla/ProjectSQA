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

public class QueryParser_matches_156561737140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term920;
     Object term951;

    public QueryParser_matches_156561737140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term947 = new ArrayList();
        ((ArrayList) term947).add((Object)null);
        ((ArrayList) term947).add((Object)null);
        term920 = newInstance(Class.forName("org.jsoup.select.QueryParser"));
        Object term921 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term921, term921.getClass(), "queue", "xrwlQZdwCp");
        setIntField(term921, term921.getClass(), "pos", -1456670397);
        setField(term920, term920.getClass(), "tq", term921);
        setField(term920, term920.getClass(), "query", "IDCWpPLRkE");
        setField(term920, term920.getClass(), "evals", term947);
        term951 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.QueryParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term951;
        try {
            callMethod(klass, "matches", argTypes, term920, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


