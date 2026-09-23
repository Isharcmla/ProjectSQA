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

public class Document_title_195224324284 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36722;

    public Document_title_195224324284() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term36920 = newInstance(Class.forName("org.jsoup.nodes.DocumentType"));
        ArrayList term36858 = new ArrayList();
        ((ArrayList) term36858).add(term36920);
        term36722 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term36768 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term36768, term36768.getClass(), "tagName", "");
        setField(term36722, term36722.getClass(), "tag", term36768);
        setField(term36722, term36722.getClass(), "childNodes", term36858);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Document");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "title", argTypes, term36722, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


