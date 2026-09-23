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

public class HtmlTreeBuilder_isSameFormattingElement_651705163296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term230090;
     Object term230142;
     Object term230278;

    public HtmlTreeBuilder_isSameFormattingElement_651705163296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term230090 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        term230142 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term230188 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term230188, term230188.getClass(), "tagName", "");
        setField(term230142, term230142.getClass(), "tag", term230188);
        term230278 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term230324 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term230324, term230324.getClass(), "tagName", "");
        setField(term230278, term230278.getClass(), "tag", term230324);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        argTypes[1] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[2];
        args[0] = term230142;
        args[1] = term230278;
        try {
            callMethod(klass, "isSameFormattingElement", argTypes, term230090, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


