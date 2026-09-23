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

public class HtmlTreeBuilder_isSpecial_599171952365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term728882;
     Object term728934;

    public HtmlTreeBuilder_isSpecial_599171952365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term728882 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        term728934 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term728980 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term728980, term728980.getClass(), "tagName", "");
        setField(term728934, term728934.getClass(), "tag", term728980);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term728934;
        callMethod(klass, "isSpecial", argTypes, term728882, args);
    }

};


