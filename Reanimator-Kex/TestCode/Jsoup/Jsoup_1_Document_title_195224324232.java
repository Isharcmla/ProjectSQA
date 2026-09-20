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

public class Document_title_195224324232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15910;
     Object term16147;

    public Document_title_195224324232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term16046 = new ArrayList();
        ((ArrayList) term16046).add((Object)null);
        ((ArrayList) term16046).add((Object)null);
        ((ArrayList) term16046).add((Object)null);
        ((ArrayList) term16046).add((Object)null);
        term15910 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term15956 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term15956, term15956.getClass(), "tagName", "");
        setField(term15910, term15910.getClass(), "tag", term15956);
        setField(term15910, term15910.getClass(), "childNodes", term16046);
        ArrayList term16151 = new ArrayList();
        ((ArrayList) term16151).add((Object)null);
        ((ArrayList) term16151).add((Object)null);
        ((ArrayList) term16151).add((Object)null);
        ((ArrayList) term16151).add((Object)null);
        term16147 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term16148 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term16148, term16148.getClass(), "tagName", "");
        setBooleanField(term16148, term16148.getClass(), "isBlock", false);
        setBooleanField(term16148, term16148.getClass(), "canContainBlock", false);
        setBooleanField(term16148, term16148.getClass(), "canContainInline", false);
        setBooleanField(term16148, term16148.getClass(), "optionalClosing", false);
        setBooleanField(term16148, term16148.getClass(), "empty", false);
        setBooleanField(term16148, term16148.getClass(), "preserveWhitespace", false);
        setField(term16148, term16148.getClass(), "ancestors", null);
        setField(term16147, term16147.getClass(), "tag", term16148);
        setField(term16147, term16147.getClass(), "classNames", null);
        setField(term16147, term16147.getClass(), "parentNode", null);
        setField(term16147, term16147.getClass(), "childNodes", term16151);
        setField(term16147, term16147.getClass(), "attributes", null);
        setField(term16147, term16147.getClass(), "baseUri", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Document");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "title", argTypes, term15910, args);
        assertTrue(recursiveEquals(term15910, term16147));
        assertTrue(recursiveEquals(retValue, ""));
    }

};
