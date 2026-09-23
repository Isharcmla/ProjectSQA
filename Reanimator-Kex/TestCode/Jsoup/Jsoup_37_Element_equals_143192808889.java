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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_equals_143192808889 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8764;
     Object term8822;

    public Element_equals_143192808889() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term8788 = new HashMap();
        Set<Object> term8833 =  ((Map) term8788).keySet();
        HashSet term8787 = new HashSet((Collection<? extends Object>) term8833);
        ArrayList term8793 = new ArrayList();
        ((ArrayList) term8793).add((Object)null);
        ((ArrayList) term8793).add((Object)null);
        ((ArrayList) term8793).add((Object)null);
        ((ArrayList) term8793).add((Object)null);
        ((ArrayList) term8793).add((Object)null);
        ((ArrayList) term8793).add((Object)null);
        ((ArrayList) term8793).add((Object)null);
        LinkedHashMap term8798 = new LinkedHashMap();
        term8764 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term8765 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term8797 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term8765, term8765.getClass(), "tagName", "gZPZNkweEp");
        setBooleanField(term8765, term8765.getClass(), "isBlock", true);
        setBooleanField(term8765, term8765.getClass(), "formatAsBlock", false);
        setBooleanField(term8765, term8765.getClass(), "canContainBlock", true);
        setBooleanField(term8765, term8765.getClass(), "canContainInline", false);
        setBooleanField(term8765, term8765.getClass(), "empty", false);
        setBooleanField(term8765, term8765.getClass(), "selfClosing", false);
        setBooleanField(term8765, term8765.getClass(), "preserveWhitespace", false);
        setBooleanField(term8765, term8765.getClass(), "formList", true);
        setBooleanField(term8765, term8765.getClass(), "formSubmit", true);
        setField(term8764, term8764.getClass(), "tag", term8765);
        setField(term8764, term8764.getClass(), "classNames", term8787);
        setField(term8764, term8764.getClass(), "parentNode", null);
        setField(term8764, term8764.getClass(), "childNodes", term8793);
        setField(term8797, term8797.getClass(), "attributes", term8798);
        setField(term8764, term8764.getClass(), "attributes", term8797);
        setField(term8764, term8764.getClass(), "baseUri", "VWPFyrpmmb");
        setIntField(term8764, term8764.getClass(), "siblingIndex", -507387516);
        term8822 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term8822;
        callMethod(klass, "equals", argTypes, term8764, args);
    }

};


