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

public class Attributes_put_28062925319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2354801;
     Object term2354894;
     Object term2354885;

    public Attributes_put_28062925319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2354801 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term2354699 = (Object[]) newArray("java.lang.String", 128);
        Object[] term2354701 = (Object[]) newArray("java.lang.String", 106);
        setIntField(term2354801, term2354801.getClass(), "size", 1);
        setElement(term2354699, 0, "");
        setField(term2354801, term2354801.getClass(), "keys", term2354699);
        setField(term2354801, term2354801.getClass(), "vals", term2354701);
        term2354894 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term2354895 = (Object[]) newArray("java.lang.String", 128);
        Object[] term2354898 = (Object[]) newArray("java.lang.String", 106);
        setIntField(term2354894, term2354894.getClass(), "size", 1);
        setElement(term2354895, 0, "");
        setField(term2354894, term2354894.getClass(), "keys", term2354895);
        setField(term2354894, term2354894.getClass(), "vals", term2354898);
        term2354885 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term2354887 = (Object[]) newArray("java.lang.String", 128);
        Object[] term2354890 = (Object[]) newArray("java.lang.String", 106);
        setIntField(term2354885, term2354885.getClass(), "size", 1);
        setElement(term2354887, 0, "");
        setField(term2354885, term2354885.getClass(), "keys", term2354887);
        setField(term2354885, term2354885.getClass(), "vals", term2354890);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = true;
        Object retValue = callMethod(klass, "put", argTypes, term2354801, args);
        assertTrue(recursiveEquals(term2354801, term2354894));
        assertTrue(recursiveEquals(retValue, term2354885));
    }

};


