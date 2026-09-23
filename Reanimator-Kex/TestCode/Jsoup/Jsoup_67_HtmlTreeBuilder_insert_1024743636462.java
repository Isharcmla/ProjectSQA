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

public class HtmlTreeBuilder_insert_1024743636462 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term302695;

    public HtmlTreeBuilder_insert_1024743636462() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term302785 = newInstance(Class.forName("java.lang.Object"));
        Object term302845 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term302891 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term302891, term302891.getClass(), "tagName", "style");
        setField(term302845, term302845.getClass(), "tag", term302891);
        ArrayList term302747 = new ArrayList();
        ((ArrayList) term302747).add(term302785);
        ((ArrayList) term302747).add((Object)null);
        ((ArrayList) term302747).add((Object)null);
        ((ArrayList) term302747).add((Object)null);
        ((ArrayList) term302747).add((Object)null);
        ((ArrayList) term302747).add((Object)null);
        ((ArrayList) term302747).add((Object)null);
        ((ArrayList) term302747).add((Object)null);
        ((ArrayList) term302747).add((Object)null);
        ((ArrayList) term302747).add((Object)null);
        ((ArrayList) term302747).add((Object)null);
        ((ArrayList) term302747).add((Object)null);
        ((ArrayList) term302747).add((Object)null);
        ((ArrayList) term302747).add((Object)null);
        ((ArrayList) term302747).add((Object)null);
        ((ArrayList) term302747).add((Object)null);
        ((ArrayList) term302747).add((Object)null);
        ((ArrayList) term302747).add((Object)null);
        ((ArrayList) term302747).add((Object)null);
        ((ArrayList) term302747).add((Object)null);
        ((ArrayList) term302747).add((Object)null);
        ((ArrayList) term302747).add((Object)null);
        ((ArrayList) term302747).add((Object)null);
        ((ArrayList) term302747).add((Object)null);
        ((ArrayList) term302747).add((Object)null);
        ((ArrayList) term302747).add((Object)null);
        ((ArrayList) term302747).add((Object)null);
        ((ArrayList) term302747).add((Object)null);
        ((ArrayList) term302747).add((Object)null);
        ((ArrayList) term302747).add((Object)null);
        ((ArrayList) term302747).add((Object)null);
        ((ArrayList) term302747).add(term302845);
        term302695 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term302695, term302695.getClass(), "stack", term302747);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Character");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "insert", argTypes, term302695, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


