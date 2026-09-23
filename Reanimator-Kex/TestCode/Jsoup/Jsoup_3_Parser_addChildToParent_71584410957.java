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
import java.util.LinkedList;
import java.lang.Object;
import java.util.ArrayList;

public class Parser_addChildToParent_71584410957 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37763;
     Object term37959;

    public Parser_addChildToParent_71584410957() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term37817 = new LinkedList();
        term37763 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        setField(term37763, term37763.getClass(), "stack", term37817);
        setField(term37763, term37763.getClass(), "baseUri", "");
        Object term38080 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        ArrayList term38034 = new ArrayList();
        ((ArrayList) term38034).add(term38080);
        ((ArrayList) term38034).add((Object)null);
        ((ArrayList) term38034).add((Object)null);
        ((ArrayList) term38034).add((Object)null);
        ((ArrayList) term38034).add((Object)null);
        ((ArrayList) term38034).add((Object)null);
        ((ArrayList) term38034).add((Object)null);
        ((ArrayList) term38034).add((Object)null);
        ((ArrayList) term38034).add((Object)null);
        ((ArrayList) term38034).add((Object)null);
        ((ArrayList) term38034).add((Object)null);
        ((ArrayList) term38034).add((Object)null);
        ((ArrayList) term38034).add((Object)null);
        ((ArrayList) term38034).add((Object)null);
        ((ArrayList) term38034).add((Object)null);
        ((ArrayList) term38034).add((Object)null);
        ((ArrayList) term38034).add((Object)null);
        ((ArrayList) term38034).add((Object)null);
        ((ArrayList) term38034).add((Object)null);
        ((ArrayList) term38034).add((Object)null);
        ((ArrayList) term38034).add((Object)null);
        ((ArrayList) term38034).add((Object)null);
        ((ArrayList) term38034).add((Object)null);
        ((ArrayList) term38034).add((Object)null);
        ((ArrayList) term38034).add((Object)null);
        ((ArrayList) term38034).add((Object)null);
        ((ArrayList) term38034).add((Object)null);
        ((ArrayList) term38034).add((Object)null);
        ((ArrayList) term38034).add((Object)null);
        ((ArrayList) term38034).add((Object)null);
        ((ArrayList) term38034).add((Object)null);
        ((ArrayList) term38034).add((Object)null);
        term37959 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term37982 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term37982, term37982.getClass(), "ancestors", term38034);
        setBooleanField(term37982, term37982.getClass(), "canContainBlock", true);
        setBooleanField(term37982, term37982.getClass(), "canContainInline", true);
        setField(term37959, term37959.getClass(), "tag", term37982);
        setField(term37959, term37959.getClass(), "parentNode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term37959;
        args[1] = false;
        try {
            callMethod(klass, "addChildToParent", argTypes, term37763, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


