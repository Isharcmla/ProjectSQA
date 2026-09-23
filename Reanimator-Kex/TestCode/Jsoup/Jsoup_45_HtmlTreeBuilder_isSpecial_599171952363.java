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

public class HtmlTreeBuilder_isSpecial_599171952363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term725720;
     Object term725772;

    public HtmlTreeBuilder_isSpecial_599171952363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term725720 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        term725772 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term725818 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term725818, term725818.getClass(), "tagName", null);
        setField(term725772, term725772.getClass(), "tag", term725818);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term725772;
        callMethod(klass, "isSpecial", argTypes, term725720, args);
    }

};


