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

public class Element_getElementsByClass_1506017604136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3330;
     Object term22048;
     Object term22044;

    public Element_getElementsByClass_1506017604136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3353 = new ArrayList();
        ((ArrayList) term3353).add((Object)null);
        ((ArrayList) term3353).add((Object)null);
        ((ArrayList) term3353).add((Object)null);
        ((ArrayList) term3353).add((Object)null);
        ((ArrayList) term3353).add((Object)null);
        LinkedHashMap term3358 = new LinkedHashMap();
        term3330 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3331 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3357 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3331, term3331.getClass(), "tagName", "HBGNxdNURv");
        setBooleanField(term3331, term3331.getClass(), "isBlock", false);
        setBooleanField(term3331, term3331.getClass(), "formatAsBlock", false);
        setBooleanField(term3331, term3331.getClass(), "canContainBlock", false);
        setBooleanField(term3331, term3331.getClass(), "canContainInline", false);
        setBooleanField(term3331, term3331.getClass(), "empty", true);
        setBooleanField(term3331, term3331.getClass(), "selfClosing", true);
        setBooleanField(term3331, term3331.getClass(), "preserveWhitespace", true);
        setBooleanField(term3331, term3331.getClass(), "formList", true);
        setBooleanField(term3331, term3331.getClass(), "formSubmit", false);
        setField(term3330, term3330.getClass(), "tag", term3331);
        setField(term3330, term3330.getClass(), "parentNode", null);
        setField(term3330, term3330.getClass(), "childNodes", term3353);
        setField(term3357, term3357.getClass(), "attributes", term3358);
        setField(term3330, term3330.getClass(), "attributes", term3357);
        setField(term3330, term3330.getClass(), "baseUri", "MHGKyEnwKc");
        setIntField(term3330, term3330.getClass(), "siblingIndex", 1876565163);
        ArrayList term22052 = new ArrayList();
        ((ArrayList) term22052).add((Object)null);
        ((ArrayList) term22052).add((Object)null);
        ((ArrayList) term22052).add((Object)null);
        ((ArrayList) term22052).add((Object)null);
        ((ArrayList) term22052).add((Object)null);
        LinkedHashMap term22055 = new LinkedHashMap();
        term22048 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term22049 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term22054 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term22049, term22049.getClass(), "tagName", "HBGNxdNURv");
        setBooleanField(term22049, term22049.getClass(), "isBlock", false);
        setBooleanField(term22049, term22049.getClass(), "formatAsBlock", false);
        setBooleanField(term22049, term22049.getClass(), "canContainBlock", false);
        setBooleanField(term22049, term22049.getClass(), "canContainInline", false);
        setBooleanField(term22049, term22049.getClass(), "empty", true);
        setBooleanField(term22049, term22049.getClass(), "selfClosing", true);
        setBooleanField(term22049, term22049.getClass(), "preserveWhitespace", true);
        setBooleanField(term22049, term22049.getClass(), "formList", true);
        setBooleanField(term22049, term22049.getClass(), "formSubmit", false);
        setField(term22048, term22048.getClass(), "tag", term22049);
        setField(term22048, term22048.getClass(), "parentNode", null);
        setField(term22048, term22048.getClass(), "childNodes", term22052);
        setField(term22054, term22054.getClass(), "attributes", term22055);
        setField(term22048, term22048.getClass(), "attributes", term22054);
        setField(term22048, term22048.getClass(), "baseUri", "MHGKyEnwKc");
        setIntField(term22048, term22048.getClass(), "siblingIndex", 1876565163);
        term22044 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term22045 = (Object[]) newArray("java.lang.Object", 0);
        setField(term22044, term22044.getClass(), "elementData", term22045);
        setIntField(term22044, term22044.getClass(), "size", 0);
        setIntField(term22044, term22044.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ShIELyuULw";
        Object retValue = callMethod(klass, "getElementsByClass", argTypes, term3330, args);
        assertTrue(recursiveEquals(term3330, term22048));
        assertTrue(recursiveEquals(retValue, term22044));
    }

};


