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

public class HtmlTreeBuilder_isSameFormattingElement_651705163269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term442994;
     Object term443048;
     Object term443186;

    public HtmlTreeBuilder_isSameFormattingElement_651705163269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term442994 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        term443048 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term443094 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term443094, term443094.getClass(), "tagName", "");
        setField(term443048, term443048.getClass(), "tag", term443094);
        term443186 = newInstance(Class.forName("org.jsoup.nodes.Document"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        argTypes[1] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[2];
        args[0] = term443048;
        args[1] = term443186;
        try {
            callMethod(klass, "isSameFormattingElement", argTypes, term442994, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


