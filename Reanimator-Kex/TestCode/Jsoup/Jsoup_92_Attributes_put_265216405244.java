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

public class Attributes_put_265216405244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term601691;
     Object term601747;

    public Attributes_put_265216405244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term601691 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term600605 = (Object[]) newArray("java.lang.String", 492);
        setIntField(term601691, term601691.getClass(), "size", 2);
        setField(term601691, term601691.getClass(), "keys", term600605);
        term601747 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term601747, term601747.getClass(), "key", "");
        setField(term601747, term601747.getClass(), "val", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Attribute");
        Object[] args = new Object[1];
        args[0] = term601747;
        try {
            callMethod(klass, "put", argTypes, term601691, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


