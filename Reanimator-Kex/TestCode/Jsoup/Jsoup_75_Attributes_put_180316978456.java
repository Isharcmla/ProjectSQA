package org.jsoup.nodes;

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
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.nodes.EqualityUtils.*;
import java.lang.Object;

public class Attributes_put_180316978456 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8787028;
     Object term8788603;
     Object term8788031;

    public Attributes_put_180316978456() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8787028 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term8786289 = (Object[]) newArray("java.lang.String", 5);
        Object[] term8786906 = (Object[]) newArray("java.lang.String", 236);
        setIntField(term8787028, term8787028.getClass(), "size", 2);
        setElement(term8786289, 0, "         ");
        setElement(term8786289, 1, "\u0001                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
        setElement(term8786289, 2, "                                                 ");
        setField(term8787028, term8787028.getClass(), "keys", term8786289);
        setField(term8787028, term8787028.getClass(), "vals", term8786906);
        term8788603 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term8788604 = (Object[]) newArray("java.lang.String", 5);
        Object[] term8788611 = (Object[]) newArray("java.lang.String", 236);
        setIntField(term8788603, term8788603.getClass(), "size", 3);
        setElement(term8788604, 0, "         ");
        setElement(term8788604, 1, "\u0001                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
        setElement(term8788604, 2, "                                                 ");
        setField(term8788603, term8788603.getClass(), "keys", term8788604);
        setField(term8788603, term8788603.getClass(), "vals", term8788611);
        term8788031 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term8788033 = (Object[]) newArray("java.lang.String", 5);
        Object[] term8788596 = (Object[]) newArray("java.lang.String", 236);
        setIntField(term8788031, term8788031.getClass(), "size", 3);
        setElement(term8788033, 0, "         ");
        setElement(term8788033, 1, "\u0001                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
        setElement(term8788033, 2, "                                                 ");
        setField(term8788031, term8788031.getClass(), "keys", term8788033);
        setField(term8788031, term8788031.getClass(), "vals", term8788596);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "                                                 ";
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term8787028, args);
        assertTrue(recursiveEquals(term8787028, term8788603));
        assertTrue(recursiveEquals(retValue, term8788031));
    }

};


