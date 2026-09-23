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

public class HtmlTreeBuilder_isSameFormattingElement_651705163384 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term262693;
     Object term262745;
     Object term262843;

    public HtmlTreeBuilder_isSameFormattingElement_651705163384() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term262693 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        term262745 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term262791 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term262791, term262791.getClass(), "tagName", null);
        setField(term262745, term262745.getClass(), "tag", term262791);
        term262843 = newInstance(Class.forName("org.jsoup.nodes.Element"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        argTypes[1] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[2];
        args[0] = term262745;
        args[1] = term262843;
        try {
            callMethod(klass, "isSameFormattingElement", argTypes, term262693, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


