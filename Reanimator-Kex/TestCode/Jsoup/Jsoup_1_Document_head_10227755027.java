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

public class Document_head_10227755027 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7623;
     Object term11755;

    public Document_head_10227755027() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7759 = new ArrayList();
        ((ArrayList) term7759).add((Object)null);
        ((ArrayList) term7759).add((Object)null);
        ((ArrayList) term7759).add((Object)null);
        ((ArrayList) term7759).add((Object)null);
        term7623 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term7669 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term7669, term7669.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        setField(term7623, term7623.getClass(), "tag", term7669);
        setField(term7623, term7623.getClass(), "childNodes", term7759);
        ArrayList term11759 = new ArrayList();
        ((ArrayList) term11759).add((Object)null);
        ((ArrayList) term11759).add((Object)null);
        ((ArrayList) term11759).add((Object)null);
        ((ArrayList) term11759).add((Object)null);
        term11755 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term11756 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term11756, term11756.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        setBooleanField(term11756, term11756.getClass(), "isBlock", false);
        setBooleanField(term11756, term11756.getClass(), "canContainBlock", false);
        setBooleanField(term11756, term11756.getClass(), "canContainInline", false);
        setBooleanField(term11756, term11756.getClass(), "optionalClosing", false);
        setBooleanField(term11756, term11756.getClass(), "empty", false);
        setBooleanField(term11756, term11756.getClass(), "preserveWhitespace", false);
        setField(term11756, term11756.getClass(), "ancestors", null);
        setField(term11755, term11755.getClass(), "tag", term11756);
        setField(term11755, term11755.getClass(), "classNames", null);
        setField(term11755, term11755.getClass(), "parentNode", null);
        setField(term11755, term11755.getClass(), "childNodes", term11759);
        setField(term11755, term11755.getClass(), "attributes", null);
        setField(term11755, term11755.getClass(), "baseUri", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Document");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "head", argTypes, term7623, args);
        assertTrue(recursiveEquals(term7623, term11755));
        assertTrue(recursiveEquals(retValue, null));
    }

};
