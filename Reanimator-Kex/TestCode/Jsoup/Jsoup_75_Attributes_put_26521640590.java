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

public class Attributes_put_26521640590 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63261;
     Object term63317;

    public Attributes_put_26521640590() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63261 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term63175 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term63261, term63261.getClass(), "size", 0);
        setField(term63261, term63261.getClass(), "keys", term63175);
        term63317 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term63317, term63317.getClass(), "key", "");
        setField(term63317, term63317.getClass(), "val", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Attribute");
        Object[] args = new Object[1];
        args[0] = term63317;
        try {
            callMethod(klass, "put", argTypes, term63261, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


