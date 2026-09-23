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
import java.lang.NullPointerException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Attributes_put_265216405114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83517;
     Object term83573;

    public Attributes_put_265216405114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83517 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term83429 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term83517, term83517.getClass(), "size", 0);
        setField(term83517, term83517.getClass(), "keys", term83429);
        term83573 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term83573, term83573.getClass(), "key", "");
        setField(term83573, term83573.getClass(), "val", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Attribute");
        Object[] args = new Object[1];
        args[0] = term83573;
        try {
            callMethod(klass, "put", argTypes, term83517, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


