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

public class Document_title_195224324263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39480;
     Object term42389;

    public Document_title_195224324263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term39616 = new ArrayList();
        ((ArrayList) term39616).add((Object)null);
        ((ArrayList) term39616).add((Object)null);
        term39480 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term39526 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term39526, term39526.getClass(), "tagName", "                                         ");
        setField(term39480, term39480.getClass(), "tag", term39526);
        setField(term39480, term39480.getClass(), "childNodes", term39616);
        ArrayList term42393 = new ArrayList();
        ((ArrayList) term42393).add((Object)null);
        ((ArrayList) term42393).add((Object)null);
        term42389 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term42390 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term42390, term42390.getClass(), "tagName", "                                         ");
        setBooleanField(term42390, term42390.getClass(), "isBlock", false);
        setBooleanField(term42390, term42390.getClass(), "canContainBlock", false);
        setBooleanField(term42390, term42390.getClass(), "canContainInline", false);
        setBooleanField(term42390, term42390.getClass(), "optionalClosing", false);
        setBooleanField(term42390, term42390.getClass(), "empty", false);
        setBooleanField(term42390, term42390.getClass(), "preserveWhitespace", false);
        setField(term42390, term42390.getClass(), "ancestors", null);
        setField(term42389, term42389.getClass(), "tag", term42390);
        setField(term42389, term42389.getClass(), "classNames", null);
        setField(term42389, term42389.getClass(), "parentNode", null);
        setField(term42389, term42389.getClass(), "childNodes", term42393);
        setField(term42389, term42389.getClass(), "attributes", null);
        setField(term42389, term42389.getClass(), "baseUri", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Document");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "title", argTypes, term39480, args);
        assertTrue(recursiveEquals(term39480, term42389));
        assertTrue(recursiveEquals(retValue, ""));
    }

};
