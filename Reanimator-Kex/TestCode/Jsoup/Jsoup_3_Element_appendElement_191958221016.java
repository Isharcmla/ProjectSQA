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
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class Element_appendElement_191958221016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1589;

    public Element_appendElement_191958221016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1611 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1611, term1611.getClass(), "tagName", null);
        setBooleanField(term1611, term1611.getClass(), "isBlock", false);
        setBooleanField(term1611, term1611.getClass(), "canContainBlock", false);
        setBooleanField(term1611, term1611.getClass(), "canContainInline", false);
        setBooleanField(term1611, term1611.getClass(), "optionalClosing", false);
        setBooleanField(term1611, term1611.getClass(), "empty", true);
        setBooleanField(term1611, term1611.getClass(), "preserveWhitespace", false);
        setField(term1611, term1611.getClass(), "ancestors", null);
        Object term1618 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1618, term1618.getClass(), "tagName", null);
        setBooleanField(term1618, term1618.getClass(), "isBlock", false);
        setBooleanField(term1618, term1618.getClass(), "canContainBlock", false);
        setBooleanField(term1618, term1618.getClass(), "canContainInline", false);
        setBooleanField(term1618, term1618.getClass(), "optionalClosing", true);
        setBooleanField(term1618, term1618.getClass(), "empty", true);
        setBooleanField(term1618, term1618.getClass(), "preserveWhitespace", false);
        setField(term1618, term1618.getClass(), "ancestors", null);
        Object term1625 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1625, term1625.getClass(), "tagName", null);
        setBooleanField(term1625, term1625.getClass(), "isBlock", true);
        setBooleanField(term1625, term1625.getClass(), "canContainBlock", true);
        setBooleanField(term1625, term1625.getClass(), "canContainInline", true);
        setBooleanField(term1625, term1625.getClass(), "optionalClosing", true);
        setBooleanField(term1625, term1625.getClass(), "empty", false);
        setBooleanField(term1625, term1625.getClass(), "preserveWhitespace", false);
        setField(term1625, term1625.getClass(), "ancestors", null);
        Object term1632 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1632, term1632.getClass(), "tagName", null);
        setBooleanField(term1632, term1632.getClass(), "isBlock", false);
        setBooleanField(term1632, term1632.getClass(), "canContainBlock", false);
        setBooleanField(term1632, term1632.getClass(), "canContainInline", false);
        setBooleanField(term1632, term1632.getClass(), "optionalClosing", false);
        setBooleanField(term1632, term1632.getClass(), "empty", true);
        setBooleanField(term1632, term1632.getClass(), "preserveWhitespace", true);
        setField(term1632, term1632.getClass(), "ancestors", null);
        Object term1639 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1639, term1639.getClass(), "tagName", null);
        setBooleanField(term1639, term1639.getClass(), "isBlock", true);
        setBooleanField(term1639, term1639.getClass(), "canContainBlock", true);
        setBooleanField(term1639, term1639.getClass(), "canContainInline", false);
        setBooleanField(term1639, term1639.getClass(), "optionalClosing", false);
        setBooleanField(term1639, term1639.getClass(), "empty", true);
        setBooleanField(term1639, term1639.getClass(), "preserveWhitespace", true);
        setField(term1639, term1639.getClass(), "ancestors", null);
        ArrayList term1609 = new ArrayList();
        ((ArrayList) term1609).add(term1611);
        ((ArrayList) term1609).add(term1618);
        ((ArrayList) term1609).add(term1611);
        ((ArrayList) term1609).add(term1625);
        ((ArrayList) term1609).add(term1618);
        ((ArrayList) term1609).add(term1618);
        ((ArrayList) term1609).add(term1632);
        ((ArrayList) term1609).add(term1639);
        HashMap term1649 = new HashMap();
        Set<Object> term1708 =  ((Map) term1649).keySet();
        HashSet term1648 = new HashSet((Collection<? extends Object>) term1708);
        ArrayList term1663 = new ArrayList();
        ((ArrayList) term1663).add((Object)null);
        LinkedHashMap term1668 = new LinkedHashMap();
        term1589 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1590 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1667 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1590, term1590.getClass(), "tagName", "TwfWVQGiIj");
        setBooleanField(term1590, term1590.getClass(), "isBlock", false);
        setBooleanField(term1590, term1590.getClass(), "canContainBlock", false);
        setBooleanField(term1590, term1590.getClass(), "canContainInline", false);
        setBooleanField(term1590, term1590.getClass(), "optionalClosing", true);
        setBooleanField(term1590, term1590.getClass(), "empty", false);
        setBooleanField(term1590, term1590.getClass(), "preserveWhitespace", false);
        setField(term1590, term1590.getClass(), "ancestors", term1609);
        setField(term1589, term1589.getClass(), "tag", term1590);
        setField(term1589, term1589.getClass(), "classNames", term1648);
        setField(term1589, term1589.getClass(), "parentNode", null);
        setField(term1589, term1589.getClass(), "childNodes", term1663);
        setField(term1667, term1667.getClass(), "attributes", term1668);
        setField(term1589, term1589.getClass(), "attributes", term1667);
        setField(term1589, term1589.getClass(), "baseUri", "WBAOTqErtm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PqtVXXZMqK";
        callMethod(klass, "appendElement", argTypes, term1589, args);
    }

};


