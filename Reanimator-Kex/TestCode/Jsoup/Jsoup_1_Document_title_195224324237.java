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
import static org.jsoup.nodes.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;

public class Document_title_195224324237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17857;
     Object term20814;

    public Document_title_195224324237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term17993 = new ArrayList();
        ((ArrayList) term17993).add((Object)null);
        ((ArrayList) term17993).add((Object)null);
        ((ArrayList) term17993).add((Object)null);
        term17857 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term17903 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term17903, term17903.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
        setField(term17857, term17857.getClass(), "tag", term17903);
        setField(term17857, term17857.getClass(), "childNodes", term17993);
        ArrayList term20818 = new ArrayList();
        ((ArrayList) term20818).add((Object)null);
        ((ArrayList) term20818).add((Object)null);
        ((ArrayList) term20818).add((Object)null);
        term20814 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term20815 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term20815, term20815.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
        setBooleanField(term20815, term20815.getClass(), "isBlock", false);
        setBooleanField(term20815, term20815.getClass(), "canContainBlock", false);
        setBooleanField(term20815, term20815.getClass(), "canContainInline", false);
        setBooleanField(term20815, term20815.getClass(), "optionalClosing", false);
        setBooleanField(term20815, term20815.getClass(), "empty", false);
        setBooleanField(term20815, term20815.getClass(), "preserveWhitespace", false);
        setField(term20815, term20815.getClass(), "ancestors", null);
        setField(term20814, term20814.getClass(), "tag", term20815);
        setField(term20814, term20814.getClass(), "classNames", null);
        setField(term20814, term20814.getClass(), "parentNode", null);
        setField(term20814, term20814.getClass(), "childNodes", term20818);
        setField(term20814, term20814.getClass(), "attributes", null);
        setField(term20814, term20814.getClass(), "baseUri", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Document");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "title", argTypes, term17857, args);
        assertTrue(recursiveEquals(term17857, term20814));
        assertTrue(recursiveEquals(retValue, ""));
    }

};
