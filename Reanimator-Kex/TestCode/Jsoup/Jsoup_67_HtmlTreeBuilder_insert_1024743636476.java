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
import java.util.ArrayList;
import java.lang.Object;

public class HtmlTreeBuilder_insert_1024743636476 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term308864;

    public HtmlTreeBuilder_insert_1024743636476() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term308976 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term309022 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term309022, term309022.getClass(), "tagName", "script");
        setField(term308976, term308976.getClass(), "tag", term309022);
        ArrayList term308916 = new ArrayList();
        ((ArrayList) term308916).add(term308976);
        term308864 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term308864, term308864.getClass(), "stack", term308916);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Character");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "insert", argTypes, term308864, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


