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
import java.lang.StringBuilder;

public class HtmlTreeBuilder_insert_1723153206244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term253754;
     Object term253872;

    public HtmlTreeBuilder_insert_1723153206244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term253806 = new ArrayList();
        term253754 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term253754, term253754.getClass(), "stack", term253806);
        StringBuilder term253932 = new StringBuilder();
        term253872 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term253872, term253872.getClass(), "data", term253932);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Comment");
        Object[] args = new Object[1];
        args[0] = term253872;
        try {
            callMethod(klass, "insert", argTypes, term253754, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


