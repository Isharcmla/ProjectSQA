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

public class Attributes_html_1859908606138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72516;
     Object term72908;

    public Attributes_html_1859908606138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72516 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setIntField(term72516, term72516.getClass(), "size", 0);
        term72908 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setIntField(term72908, term72908.getClass(), "size", 0);
        setField(term72908, term72908.getClass(), "keys", null);
        setField(term72908, term72908.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "html", argTypes, term72516, args);
        assertTrue(recursiveEquals(term72516, term72908));
    }

};


