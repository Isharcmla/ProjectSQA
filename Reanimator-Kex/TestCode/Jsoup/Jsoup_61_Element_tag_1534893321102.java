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

public class Element_tag_1534893321102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term389;
     Object term9454;
     Object term9408;

    public Element_tag_1534893321102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term411 = new ArrayList();
        ((ArrayList) term411).add((Object)null);
        ((ArrayList) term411).add((Object)null);
        ((ArrayList) term411).add((Object)null);
        ((ArrayList) term411).add((Object)null);
        LinkedHashMap term416 = new LinkedHashMap();
        term389 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term390 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term415 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term390, term390.getClass(), "tagName", "BYqFIqCKAV");
        setBooleanField(term390, term390.getClass(), "isBlock", false);
        setBooleanField(term390, term390.getClass(), "formatAsBlock", false);
        setBooleanField(term390, term390.getClass(), "canContainInline", true);
        setBooleanField(term390, term390.getClass(), "empty", true);
        setBooleanField(term390, term390.getClass(), "selfClosing", false);
        setBooleanField(term390, term390.getClass(), "preserveWhitespace", true);
        setBooleanField(term390, term390.getClass(), "formList", true);
        setBooleanField(term390, term390.getClass(), "formSubmit", true);
        setField(term389, term389.getClass(), "tag", term390);
        setField(term389, term389.getClass(), "parentNode", null);
        setField(term389, term389.getClass(), "childNodes", term411);
        setField(term415, term415.getClass(), "attributes", term416);
        setField(term389, term389.getClass(), "attributes", term415);
        setField(term389, term389.getClass(), "baseUri", "IoAlmYsBwc");
        setIntField(term389, term389.getClass(), "siblingIndex", 391863371);
        ArrayList term9458 = new ArrayList();
        ((ArrayList) term9458).add((Object)null);
        ((ArrayList) term9458).add((Object)null);
        ((ArrayList) term9458).add((Object)null);
        ((ArrayList) term9458).add((Object)null);
        LinkedHashMap term9461 = new LinkedHashMap();
        term9454 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term9455 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term9460 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term9455, term9455.getClass(), "tagName", "BYqFIqCKAV");
        setBooleanField(term9455, term9455.getClass(), "isBlock", false);
        setBooleanField(term9455, term9455.getClass(), "formatAsBlock", false);
        setBooleanField(term9455, term9455.getClass(), "canContainInline", true);
        setBooleanField(term9455, term9455.getClass(), "empty", true);
        setBooleanField(term9455, term9455.getClass(), "selfClosing", false);
        setBooleanField(term9455, term9455.getClass(), "preserveWhitespace", true);
        setBooleanField(term9455, term9455.getClass(), "formList", true);
        setBooleanField(term9455, term9455.getClass(), "formSubmit", true);
        setField(term9454, term9454.getClass(), "tag", term9455);
        setField(term9454, term9454.getClass(), "parentNode", null);
        setField(term9454, term9454.getClass(), "childNodes", term9458);
        setField(term9460, term9460.getClass(), "attributes", term9461);
        setField(term9454, term9454.getClass(), "attributes", term9460);
        setField(term9454, term9454.getClass(), "baseUri", "IoAlmYsBwc");
        setIntField(term9454, term9454.getClass(), "siblingIndex", 391863371);
        term9408 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term9408, term9408.getClass(), "tagName", "BYqFIqCKAV");
        setBooleanField(term9408, term9408.getClass(), "isBlock", false);
        setBooleanField(term9408, term9408.getClass(), "formatAsBlock", false);
        setBooleanField(term9408, term9408.getClass(), "canContainInline", true);
        setBooleanField(term9408, term9408.getClass(), "empty", true);
        setBooleanField(term9408, term9408.getClass(), "selfClosing", false);
        setBooleanField(term9408, term9408.getClass(), "preserveWhitespace", true);
        setBooleanField(term9408, term9408.getClass(), "formList", true);
        setBooleanField(term9408, term9408.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "tag", argTypes, term389, args);
        assertTrue(recursiveEquals(term389, term9454));
        assertTrue(recursiveEquals(retValue, term9408));
    }

};


