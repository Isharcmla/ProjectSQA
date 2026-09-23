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

public class QueryParser_indexLessThan_67237672230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term506;

    public QueryParser_indexLessThan_67237672230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term533 = new ArrayList();
        ((ArrayList) term533).add((Object)null);
        term506 = newInstance(Class.forName("org.jsoup.select.QueryParser"));
        Object term507 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term507, term507.getClass(), "queue", "hNxWaHcfhY");
        setIntField(term507, term507.getClass(), "pos", -1339778481);
        setField(term506, term506.getClass(), "tq", term507);
        setField(term506, term506.getClass(), "query", "RkybSrpybU");
        setField(term506, term506.getClass(), "evals", term533);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.QueryParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "indexLessThan", argTypes, term506, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


