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

public class Attribute_html_82120855587 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149111;
     Object term149245;

    public Attribute_html_82120855587() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term149111 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term149111, term149111.getClass(), "key", "");
        setField(term149111, term149111.getClass(), "val", "");
        term149245 = newInstance(Class.forName("java.io.OutputStreamWriter"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[2];
        args[0] = term149245;
        args[1] = null;
        try {
            callMethod(klass, "html", argTypes, term149111, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


