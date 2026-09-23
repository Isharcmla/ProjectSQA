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

public class QueryParser_consumeIndex_96110488836 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term714;

    public QueryParser_consumeIndex_96110488836() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term741 = new ArrayList();
        ((ArrayList) term741).add((Object)null);
        ((ArrayList) term741).add((Object)null);
        term714 = newInstance(Class.forName("org.jsoup.select.QueryParser"));
        Object term715 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term715, term715.getClass(), "queue", "IoAlmYsBwc");
        setIntField(term715, term715.getClass(), "pos", -883034806);
        setField(term714, term714.getClass(), "tq", term715);
        setField(term714, term714.getClass(), "query", "TEParAifyi");
        setField(term714, term714.getClass(), "evals", term741);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.QueryParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "consumeIndex", argTypes, term714, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


