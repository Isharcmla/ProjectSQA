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

public class QueryParser_byTag_127682247329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term353;

    public QueryParser_byTag_127682247329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term380 = new ArrayList();
        ((ArrayList) term380).add((Object)null);
        ((ArrayList) term380).add((Object)null);
        term353 = newInstance(Class.forName("org.jsoup.select.QueryParser"));
        Object term354 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term354, term354.getClass(), "queue", "oVcInYnLWB");
        setIntField(term354, term354.getClass(), "pos", -1955890973);
        setField(term353, term353.getClass(), "tq", term354);
        setField(term353, term353.getClass(), "query", "aJlieCFVtF");
        setField(term353, term353.getClass(), "evals", term380);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.QueryParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "byTag", argTypes, term353, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


