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
import java.lang.NullPointerException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class Document_title_195224324267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41931;

    public Document_title_195224324267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term42119 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        ArrayList term42067 = new ArrayList();
        ((ArrayList) term42067).add((Object)null);
        ((ArrayList) term42067).add((Object)null);
        ((ArrayList) term42067).add(term42119);
        term41931 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term41977 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term41977, term41977.getClass(), "tagName", "         ");
        setField(term41931, term41931.getClass(), "tag", term41977);
        setField(term41931, term41931.getClass(), "childNodes", term42067);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Document");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "title", argTypes, term41931, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
