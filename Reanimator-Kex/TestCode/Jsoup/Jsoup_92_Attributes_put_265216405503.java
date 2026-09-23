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

public class Attributes_put_265216405503 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11609272;
     Object term11609328;

    public Attributes_put_265216405503() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11609272 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term11609181 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term11609272, term11609272.getClass(), "size", 0);
        setField(term11609272, term11609272.getClass(), "keys", term11609181);
        term11609328 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term11609328, term11609328.getClass(), "key", "");
        setField(term11609328, term11609328.getClass(), "val", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Attribute");
        Object[] args = new Object[1];
        args[0] = term11609328;
        try {
            callMethod(klass, "put", argTypes, term11609272, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


