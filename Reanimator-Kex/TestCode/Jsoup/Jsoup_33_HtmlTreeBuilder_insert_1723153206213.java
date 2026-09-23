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
import java.lang.StringBuilder;

public class HtmlTreeBuilder_insert_1723153206213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term419330;
     Object term419516;

    public HtmlTreeBuilder_insert_1723153206213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term419330 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term419450 = newInstance(Class.forName("org.jsoup.helper.DescendableLinkedList"));
        setField(term419330, term419330.getClass(), "baseUri", "");
        setField(term419330, term419330.getClass(), "stack", term419450);
        StringBuilder term419576 = new StringBuilder();
        term419516 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term419516, term419516.getClass(), "data", term419576);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Comment");
        Object[] args = new Object[1];
        args[0] = term419516;
        try {
            callMethod(klass, "insert", argTypes, term419330, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


