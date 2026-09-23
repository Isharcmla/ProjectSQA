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

public class Element_empty_659299020124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2350;
     Object term18248;
     Object term18201;

    public Element_empty_659299020124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2373 = new ArrayList();
        ((ArrayList) term2373).add((Object)null);
        ((ArrayList) term2373).add((Object)null);
        LinkedHashMap term2378 = new LinkedHashMap();
        term2350 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2351 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2377 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2351, term2351.getClass(), "tagName", "WzFopsaDuG");
        setBooleanField(term2351, term2351.getClass(), "isBlock", false);
        setBooleanField(term2351, term2351.getClass(), "formatAsBlock", true);
        setBooleanField(term2351, term2351.getClass(), "canContainBlock", true);
        setBooleanField(term2351, term2351.getClass(), "canContainInline", false);
        setBooleanField(term2351, term2351.getClass(), "empty", true);
        setBooleanField(term2351, term2351.getClass(), "selfClosing", true);
        setBooleanField(term2351, term2351.getClass(), "preserveWhitespace", true);
        setBooleanField(term2351, term2351.getClass(), "formList", true);
        setBooleanField(term2351, term2351.getClass(), "formSubmit", true);
        setField(term2350, term2350.getClass(), "tag", term2351);
        setField(term2350, term2350.getClass(), "parentNode", null);
        setField(term2350, term2350.getClass(), "childNodes", term2373);
        setField(term2377, term2377.getClass(), "attributes", term2378);
        setField(term2350, term2350.getClass(), "attributes", term2377);
        setField(term2350, term2350.getClass(), "baseUri", "OYbzXylRWW");
        setIntField(term2350, term2350.getClass(), "siblingIndex", -1179120542);
        ArrayList term18252 = new ArrayList();
        LinkedHashMap term18255 = new LinkedHashMap();
        term18248 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term18249 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term18254 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term18249, term18249.getClass(), "tagName", "WzFopsaDuG");
        setBooleanField(term18249, term18249.getClass(), "isBlock", false);
        setBooleanField(term18249, term18249.getClass(), "formatAsBlock", true);
        setBooleanField(term18249, term18249.getClass(), "canContainBlock", true);
        setBooleanField(term18249, term18249.getClass(), "canContainInline", false);
        setBooleanField(term18249, term18249.getClass(), "empty", true);
        setBooleanField(term18249, term18249.getClass(), "selfClosing", true);
        setBooleanField(term18249, term18249.getClass(), "preserveWhitespace", true);
        setBooleanField(term18249, term18249.getClass(), "formList", true);
        setBooleanField(term18249, term18249.getClass(), "formSubmit", true);
        setField(term18248, term18248.getClass(), "tag", term18249);
        setField(term18248, term18248.getClass(), "parentNode", null);
        setField(term18248, term18248.getClass(), "childNodes", term18252);
        setField(term18254, term18254.getClass(), "attributes", term18255);
        setField(term18248, term18248.getClass(), "attributes", term18254);
        setField(term18248, term18248.getClass(), "baseUri", "OYbzXylRWW");
        setIntField(term18248, term18248.getClass(), "siblingIndex", -1179120542);
        ArrayList term18224 = new ArrayList();
        LinkedHashMap term18229 = new LinkedHashMap();
        term18201 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term18202 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term18228 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term18202, term18202.getClass(), "tagName", "WzFopsaDuG");
        setBooleanField(term18202, term18202.getClass(), "isBlock", false);
        setBooleanField(term18202, term18202.getClass(), "formatAsBlock", true);
        setBooleanField(term18202, term18202.getClass(), "canContainBlock", true);
        setBooleanField(term18202, term18202.getClass(), "canContainInline", false);
        setBooleanField(term18202, term18202.getClass(), "empty", true);
        setBooleanField(term18202, term18202.getClass(), "selfClosing", true);
        setBooleanField(term18202, term18202.getClass(), "preserveWhitespace", true);
        setBooleanField(term18202, term18202.getClass(), "formList", true);
        setBooleanField(term18202, term18202.getClass(), "formSubmit", true);
        setField(term18201, term18201.getClass(), "tag", term18202);
        setField(term18201, term18201.getClass(), "parentNode", null);
        setField(term18201, term18201.getClass(), "childNodes", term18224);
        setField(term18228, term18228.getClass(), "attributes", term18229);
        setField(term18201, term18201.getClass(), "attributes", term18228);
        setField(term18201, term18201.getClass(), "baseUri", "OYbzXylRWW");
        setIntField(term18201, term18201.getClass(), "siblingIndex", -1179120542);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "empty", argTypes, term2350, args);
        assertTrue(recursiveEquals(term2350, term18248));
        assertTrue(recursiveEquals(retValue, term18201));
    }

};


