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
import java.util.LinkedHashMap;

public class Element_parents_1239311084109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term954;
     Object term10433;
     Object term10382;

    public Element_parents_1239311084109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term976 = new ArrayList();
        ((ArrayList) term976).add((Object)null);
        ((ArrayList) term976).add((Object)null);
        ((ArrayList) term976).add((Object)null);
        ((ArrayList) term976).add((Object)null);
        ((ArrayList) term976).add((Object)null);
        ((ArrayList) term976).add((Object)null);
        LinkedHashMap term981 = new LinkedHashMap();
        term954 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term955 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term980 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term955, term955.getClass(), "tagName", "hoicvmsovO");
        setBooleanField(term955, term955.getClass(), "isBlock", true);
        setBooleanField(term955, term955.getClass(), "formatAsBlock", true);
        setBooleanField(term955, term955.getClass(), "canContainInline", false);
        setBooleanField(term955, term955.getClass(), "empty", true);
        setBooleanField(term955, term955.getClass(), "selfClosing", true);
        setBooleanField(term955, term955.getClass(), "preserveWhitespace", false);
        setBooleanField(term955, term955.getClass(), "formList", false);
        setBooleanField(term955, term955.getClass(), "formSubmit", true);
        setField(term954, term954.getClass(), "tag", term955);
        setField(term954, term954.getClass(), "parentNode", null);
        setField(term954, term954.getClass(), "childNodes", term976);
        setField(term980, term980.getClass(), "attributes", term981);
        setField(term954, term954.getClass(), "attributes", term980);
        setField(term954, term954.getClass(), "baseUri", "kBdSllIBVz");
        setIntField(term954, term954.getClass(), "siblingIndex", 1725571209);
        ArrayList term10437 = new ArrayList();
        ((ArrayList) term10437).add((Object)null);
        ((ArrayList) term10437).add((Object)null);
        ((ArrayList) term10437).add((Object)null);
        ((ArrayList) term10437).add((Object)null);
        ((ArrayList) term10437).add((Object)null);
        ((ArrayList) term10437).add((Object)null);
        LinkedHashMap term10440 = new LinkedHashMap();
        term10433 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term10434 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term10439 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term10434, term10434.getClass(), "tagName", "hoicvmsovO");
        setBooleanField(term10434, term10434.getClass(), "isBlock", true);
        setBooleanField(term10434, term10434.getClass(), "formatAsBlock", true);
        setBooleanField(term10434, term10434.getClass(), "canContainInline", false);
        setBooleanField(term10434, term10434.getClass(), "empty", true);
        setBooleanField(term10434, term10434.getClass(), "selfClosing", true);
        setBooleanField(term10434, term10434.getClass(), "preserveWhitespace", false);
        setBooleanField(term10434, term10434.getClass(), "formList", false);
        setBooleanField(term10434, term10434.getClass(), "formSubmit", true);
        setField(term10433, term10433.getClass(), "tag", term10434);
        setField(term10433, term10433.getClass(), "parentNode", null);
        setField(term10433, term10433.getClass(), "childNodes", term10437);
        setField(term10439, term10439.getClass(), "attributes", term10440);
        setField(term10433, term10433.getClass(), "attributes", term10439);
        setField(term10433, term10433.getClass(), "baseUri", "kBdSllIBVz");
        setIntField(term10433, term10433.getClass(), "siblingIndex", 1725571209);
        term10382 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term10383 = (Object[]) newArray("java.lang.Object", 0);
        setField(term10382, term10382.getClass(), "elementData", term10383);
        setIntField(term10382, term10382.getClass(), "size", 0);
        setIntField(term10382, term10382.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "parents", argTypes, term954, args);
        assertTrue(recursiveEquals(term954, term10433));
        assertTrue(recursiveEquals(retValue, term10382));
    }

};


