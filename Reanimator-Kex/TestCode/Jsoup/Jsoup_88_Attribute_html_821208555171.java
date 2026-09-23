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

public class Attribute_html_821208555171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term279645;
     Object term279767;

    public Attribute_html_821208555171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term279645 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term279645, term279645.getClass(), "key", "");
        setField(term279645, term279645.getClass(), "val", "");
        term279767 = newInstance(Class.forName("java.io.StringWriter"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[2];
        args[0] = term279767;
        args[1] = null;
        try {
            callMethod(klass, "html", argTypes, term279645, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


