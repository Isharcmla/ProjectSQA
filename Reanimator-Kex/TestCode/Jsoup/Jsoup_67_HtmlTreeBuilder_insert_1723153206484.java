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
import java.lang.StringBuilder;

public class HtmlTreeBuilder_insert_1723153206484 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term313378;
     Object term313550;

    public HtmlTreeBuilder_insert_1723153206484() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term313484 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term313430 = new ArrayList();
        ((ArrayList) term313430).add(term313484);
        term313378 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term313378, term313378.getClass(), "stack", term313430);
        setBooleanField(term313378, term313378.getClass(), "fosterInserts", true);
        StringBuilder term313610 = new StringBuilder();
        term313550 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term313550, term313550.getClass(), "data", term313610);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Comment");
        Object[] args = new Object[1];
        args[0] = term313550;
        try {
            callMethod(klass, "insert", argTypes, term313378, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


