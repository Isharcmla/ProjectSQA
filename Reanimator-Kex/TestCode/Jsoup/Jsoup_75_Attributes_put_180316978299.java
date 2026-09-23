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

public class Attributes_put_180316978299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1841035;
     Object term2341258;
     Object term2341132;

    public Attributes_put_180316978299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1841035 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term1840530 = (Object[]) newArray("java.lang.String", 11);
        Object[] term1840651 = (Object[]) newArray("java.lang.String", 242);
        setIntField(term1841035, term1841035.getClass(), "size", 3);
        setElement(term1840530, 1, "");
        setField(term1841035, term1841035.getClass(), "keys", term1840530);
        setField(term1841035, term1841035.getClass(), "vals", term1840651);
        term2341258 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term2341259 = (Object[]) newArray("java.lang.String", 11);
        Object[] term2341264 = (Object[]) newArray("java.lang.String", 242);
        setIntField(term2341258, term2341258.getClass(), "size", 4);
        setElement(term2341259, 1, "");
        setElement(term2341259, 3, "                                                                                                                ");
        setField(term2341258, term2341258.getClass(), "keys", term2341259);
        setField(term2341258, term2341258.getClass(), "vals", term2341264);
        term2341132 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term2341134 = (Object[]) newArray("java.lang.String", 11);
        Object[] term2341251 = (Object[]) newArray("java.lang.String", 242);
        setIntField(term2341132, term2341132.getClass(), "size", 4);
        setElement(term2341134, 1, "");
        setElement(term2341134, 3, "                                                                                                                ");
        setField(term2341132, term2341132.getClass(), "keys", term2341134);
        setField(term2341132, term2341132.getClass(), "vals", term2341251);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "                                                                                                                ";
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term1841035, args);
        assertTrue(recursiveEquals(term1841035, term2341258));
        assertTrue(recursiveEquals(retValue, term2341132));
    }

};


