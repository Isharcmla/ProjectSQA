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
import java.lang.Object;

public class Element_getElementsMatchingText_694257764180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42056;
     Object term42154;

    public Element_getElementsMatchingText_694257764180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42056 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term42102 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term42056, term42056.getClass(), "tag", term42102);
        term42154 = newInstance(Class.forName("java.util.regex.Pattern"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.regex.Pattern");
        Object[] args = new Object[1];
        args[0] = term42154;
        callMethod(klass, "getElementsMatchingText", argTypes, term42056, args);
    }

};


