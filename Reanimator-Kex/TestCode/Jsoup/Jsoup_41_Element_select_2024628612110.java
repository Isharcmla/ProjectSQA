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

public class Element_select_2024628612110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1212;
     Object term12062;
     Object term12058;

    public Element_select_2024628612110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1235 = new ArrayList();
        ((ArrayList) term1235).add((Object)null);
        LinkedHashMap term1240 = new LinkedHashMap();
        term1212 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1213 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1239 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1213, term1213.getClass(), "tagName", "LvJFtLBaxj");
        setBooleanField(term1213, term1213.getClass(), "isBlock", true);
        setBooleanField(term1213, term1213.getClass(), "formatAsBlock", false);
        setBooleanField(term1213, term1213.getClass(), "canContainBlock", false);
        setBooleanField(term1213, term1213.getClass(), "canContainInline", false);
        setBooleanField(term1213, term1213.getClass(), "empty", true);
        setBooleanField(term1213, term1213.getClass(), "selfClosing", false);
        setBooleanField(term1213, term1213.getClass(), "preserveWhitespace", false);
        setBooleanField(term1213, term1213.getClass(), "formList", false);
        setBooleanField(term1213, term1213.getClass(), "formSubmit", true);
        setField(term1212, term1212.getClass(), "tag", term1213);
        setField(term1212, term1212.getClass(), "parentNode", null);
        setField(term1212, term1212.getClass(), "childNodes", term1235);
        setField(term1239, term1239.getClass(), "attributes", term1240);
        setField(term1212, term1212.getClass(), "attributes", term1239);
        setField(term1212, term1212.getClass(), "baseUri", "jSpAteRute");
        setIntField(term1212, term1212.getClass(), "siblingIndex", -1685132342);
        ArrayList term12066 = new ArrayList();
        ((ArrayList) term12066).add((Object)null);
        LinkedHashMap term12069 = new LinkedHashMap();
        term12062 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term12063 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term12068 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term12063, term12063.getClass(), "tagName", "LvJFtLBaxj");
        setBooleanField(term12063, term12063.getClass(), "isBlock", true);
        setBooleanField(term12063, term12063.getClass(), "formatAsBlock", false);
        setBooleanField(term12063, term12063.getClass(), "canContainBlock", false);
        setBooleanField(term12063, term12063.getClass(), "canContainInline", false);
        setBooleanField(term12063, term12063.getClass(), "empty", true);
        setBooleanField(term12063, term12063.getClass(), "selfClosing", false);
        setBooleanField(term12063, term12063.getClass(), "preserveWhitespace", false);
        setBooleanField(term12063, term12063.getClass(), "formList", false);
        setBooleanField(term12063, term12063.getClass(), "formSubmit", true);
        setField(term12062, term12062.getClass(), "tag", term12063);
        setField(term12062, term12062.getClass(), "parentNode", null);
        setField(term12062, term12062.getClass(), "childNodes", term12066);
        setField(term12068, term12068.getClass(), "attributes", term12069);
        setField(term12062, term12062.getClass(), "attributes", term12068);
        setField(term12062, term12062.getClass(), "baseUri", "jSpAteRute");
        setIntField(term12062, term12062.getClass(), "siblingIndex", -1685132342);
        term12058 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term12059 = (Object[]) newArray("java.lang.Object", 0);
        setField(term12058, term12058.getClass(), "elementData", term12059);
        setIntField(term12058, term12058.getClass(), "size", 0);
        setIntField(term12058, term12058.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "swZVeJAxjt";
        Object retValue = callMethod(klass, "select", argTypes, term1212, args);
        assertTrue(recursiveEquals(term1212, term12062));
        assertTrue(recursiveEquals(retValue, term12058));
    }

};


