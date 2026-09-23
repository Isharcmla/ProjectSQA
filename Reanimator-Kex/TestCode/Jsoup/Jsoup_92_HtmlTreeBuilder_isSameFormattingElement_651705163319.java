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
     Object term339998;
     Object term340052;
     Object term340190;

    public HtmlTreeBuilder_isSameFormattingElement_651705163319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term339998 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        term340052 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term340098 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term340098, term340098.getClass(), "normalName", "");
        setField(term340052, term340052.getClass(), "tag", term340098);
        term340190 = newInstance(Class.forName("org.jsoup.nodes.Document"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        argTypes[1] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[2];
        args[0] = term340052;
        args[1] = term340190;
        try {
            callMethod(klass, "isSameFormattingElement", argTypes, term339998, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


