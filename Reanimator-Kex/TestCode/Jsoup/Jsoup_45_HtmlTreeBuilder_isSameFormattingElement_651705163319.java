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
import java.lang.NullPointerException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class HtmlTreeBuilder_isSameFormattingElement_651705163319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term705848;
     Object term705900;
     Object term706036;

    public HtmlTreeBuilder_isSameFormattingElement_651705163319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term705848 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        term705900 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term705946 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term705946, term705946.getClass(), "tagName", "");
        setField(term705900, term705900.getClass(), "tag", term705946);
        term706036 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term706082 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term706082, term706082.getClass(), "tagName", "");
        setField(term706036, term706036.getClass(), "tag", term706082);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        argTypes[1] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[2];
        args[0] = term705900;
        args[1] = term706036;
        try {
            callMethod(klass, "isSameFormattingElement", argTypes, term705848, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


