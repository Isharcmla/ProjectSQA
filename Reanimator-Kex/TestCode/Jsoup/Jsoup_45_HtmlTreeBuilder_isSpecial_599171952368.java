package org.jsoup.parser;

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
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class HtmlTreeBuilder_isSpecial_599171952368 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term732931;
     Object term732983;

    public HtmlTreeBuilder_isSpecial_599171952368() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term732931 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        term732983 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term733029 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term733029, term733029.getClass(), "tagName", "  \u0001   \f\u0007\u0005\u0006  \u0003\b\u0010\u0001\u0001                                                                                                               ");
        setField(term732983, term732983.getClass(), "tag", term733029);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term732983;
        callMethod(klass, "isSpecial", argTypes, term732931, args);
    }

};


