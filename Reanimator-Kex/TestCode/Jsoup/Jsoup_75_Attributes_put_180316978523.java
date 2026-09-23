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

public class Attributes_put_180316978523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14333159;
     Object term14333222;
     Object term14333203;

    public Attributes_put_180316978523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14333159 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term14333058 = (Object[]) newArray("java.lang.String", 0);
        Object[] term14333061 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term14333159, term14333159.getClass(), "size", 0);
        setField(term14333159, term14333159.getClass(), "keys", term14333058);
        setField(term14333159, term14333159.getClass(), "vals", term14333061);
        term14333222 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term14333223 = (Object[]) newArray("java.lang.String", 4);
        Object[] term14333226 = (Object[]) newArray("java.lang.String", 4);
        setIntField(term14333222, term14333222.getClass(), "size", 1);
        setElement(term14333223, 0, "");
        setField(term14333222, term14333222.getClass(), "keys", term14333223);
        setField(term14333222, term14333222.getClass(), "vals", term14333226);
        term14333203 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term14333205 = (Object[]) newArray("java.lang.String", 4);
        Object[] term14333208 = (Object[]) newArray("java.lang.String", 4);
        setIntField(term14333203, term14333203.getClass(), "size", 1);
        setElement(term14333205, 0, "");
        setField(term14333203, term14333203.getClass(), "keys", term14333205);
        setField(term14333203, term14333203.getClass(), "vals", term14333208);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term14333159, args);
        assertTrue(recursiveEquals(term14333159, term14333222));
        assertTrue(recursiveEquals(retValue, term14333203));
    }

};


