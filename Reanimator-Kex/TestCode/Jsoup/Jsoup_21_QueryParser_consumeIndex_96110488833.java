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

public class QueryParser_consumeIndex_96110488833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term659;

    public QueryParser_consumeIndex_96110488833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term686 = new ArrayList();
        ((ArrayList) term686).add((Object)null);
        ((ArrayList) term686).add((Object)null);
        ((ArrayList) term686).add((Object)null);
        ((ArrayList) term686).add((Object)null);
        ((ArrayList) term686).add((Object)null);
        term659 = newInstance(Class.forName("org.jsoup.select.QueryParser"));
        Object term660 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term660, term660.getClass(), "queue", "flxyYxBRtu");
        setIntField(term660, term660.getClass(), "pos", 1134449235);
        setField(term659, term659.getClass(), "tq", term660);
        setField(term659, term659.getClass(), "query", "OclPbYPkcH");
        setField(term659, term659.getClass(), "evals", term686);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.QueryParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "consumeIndex", argTypes, term659, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


