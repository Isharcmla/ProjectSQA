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

public class Element_getElementsByTag_957731678141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3337;
     Object term22536;
     Object term22532;

    public Element_getElementsByTag_957731678141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3359 = new ArrayList();
        ((ArrayList) term3359).add((Object)null);
        ((ArrayList) term3359).add((Object)null);
        ((ArrayList) term3359).add((Object)null);
        ((ArrayList) term3359).add((Object)null);
        ((ArrayList) term3359).add((Object)null);
        LinkedHashMap term3364 = new LinkedHashMap();
        term3337 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3338 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3363 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3338, term3338.getClass(), "tagName", "mfCpTPPQQm");
        setBooleanField(term3338, term3338.getClass(), "isBlock", true);
        setBooleanField(term3338, term3338.getClass(), "formatAsBlock", false);
        setBooleanField(term3338, term3338.getClass(), "canContainInline", false);
        setBooleanField(term3338, term3338.getClass(), "empty", false);
        setBooleanField(term3338, term3338.getClass(), "selfClosing", false);
        setBooleanField(term3338, term3338.getClass(), "preserveWhitespace", true);
        setBooleanField(term3338, term3338.getClass(), "formList", true);
        setBooleanField(term3338, term3338.getClass(), "formSubmit", false);
        setField(term3337, term3337.getClass(), "tag", term3338);
        setField(term3337, term3337.getClass(), "parentNode", null);
        setField(term3337, term3337.getClass(), "childNodes", term3359);
        setField(term3363, term3363.getClass(), "attributes", term3364);
        setField(term3337, term3337.getClass(), "attributes", term3363);
        setField(term3337, term3337.getClass(), "baseUri", "ShIELyuULw");
        setIntField(term3337, term3337.getClass(), "siblingIndex", 1876565163);
        ArrayList term22540 = new ArrayList();
        ((ArrayList) term22540).add((Object)null);
        ((ArrayList) term22540).add((Object)null);
        ((ArrayList) term22540).add((Object)null);
        ((ArrayList) term22540).add((Object)null);
        ((ArrayList) term22540).add((Object)null);
        LinkedHashMap term22543 = new LinkedHashMap();
        term22536 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term22537 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term22542 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term22537, term22537.getClass(), "tagName", "mfCpTPPQQm");
        setBooleanField(term22537, term22537.getClass(), "isBlock", true);
        setBooleanField(term22537, term22537.getClass(), "formatAsBlock", false);
        setBooleanField(term22537, term22537.getClass(), "canContainInline", false);
        setBooleanField(term22537, term22537.getClass(), "empty", false);
        setBooleanField(term22537, term22537.getClass(), "selfClosing", false);
        setBooleanField(term22537, term22537.getClass(), "preserveWhitespace", true);
        setBooleanField(term22537, term22537.getClass(), "formList", true);
        setBooleanField(term22537, term22537.getClass(), "formSubmit", false);
        setField(term22536, term22536.getClass(), "tag", term22537);
        setField(term22536, term22536.getClass(), "parentNode", null);
        setField(term22536, term22536.getClass(), "childNodes", term22540);
        setField(term22542, term22542.getClass(), "attributes", term22543);
        setField(term22536, term22536.getClass(), "attributes", term22542);
        setField(term22536, term22536.getClass(), "baseUri", "ShIELyuULw");
        setIntField(term22536, term22536.getClass(), "siblingIndex", 1876565163);
        term22532 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term22533 = (Object[]) newArray("java.lang.Object", 0);
        setField(term22532, term22532.getClass(), "elementData", term22533);
        setIntField(term22532, term22532.getClass(), "size", 0);
        setIntField(term22532, term22532.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IpQuOGMgmj";
        Object retValue = callMethod(klass, "getElementsByTag", argTypes, term3337, args);
        assertTrue(recursiveEquals(term3337, term22536));
        assertTrue(recursiveEquals(retValue, term22532));
    }

};


