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

public class Element_parent_836683031103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term776;
     Object term9941;

    public Element_parent_836683031103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term799 = new ArrayList();
        ((ArrayList) term799).add((Object)null);
        ((ArrayList) term799).add((Object)null);
        ((ArrayList) term799).add((Object)null);
        ((ArrayList) term799).add((Object)null);
        ((ArrayList) term799).add((Object)null);
        ((ArrayList) term799).add((Object)null);
        ((ArrayList) term799).add((Object)null);
        LinkedHashMap term804 = new LinkedHashMap();
        term776 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term777 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term803 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term777, term777.getClass(), "tagName", "nGKItKLYNC");
        setBooleanField(term777, term777.getClass(), "isBlock", true);
        setBooleanField(term777, term777.getClass(), "formatAsBlock", true);
        setBooleanField(term777, term777.getClass(), "canContainBlock", true);
        setBooleanField(term777, term777.getClass(), "canContainInline", true);
        setBooleanField(term777, term777.getClass(), "empty", false);
        setBooleanField(term777, term777.getClass(), "selfClosing", false);
        setBooleanField(term777, term777.getClass(), "preserveWhitespace", true);
        setBooleanField(term777, term777.getClass(), "formList", true);
        setBooleanField(term777, term777.getClass(), "formSubmit", true);
        setField(term776, term776.getClass(), "tag", term777);
        setField(term776, term776.getClass(), "parentNode", null);
        setField(term776, term776.getClass(), "childNodes", term799);
        setField(term803, term803.getClass(), "attributes", term804);
        setField(term776, term776.getClass(), "attributes", term803);
        setField(term776, term776.getClass(), "baseUri", "onpbIeEKoi");
        setIntField(term776, term776.getClass(), "siblingIndex", 1227103734);
        ArrayList term9945 = new ArrayList();
        ((ArrayList) term9945).add((Object)null);
        ((ArrayList) term9945).add((Object)null);
        ((ArrayList) term9945).add((Object)null);
        ((ArrayList) term9945).add((Object)null);
        ((ArrayList) term9945).add((Object)null);
        ((ArrayList) term9945).add((Object)null);
        ((ArrayList) term9945).add((Object)null);
        LinkedHashMap term9948 = new LinkedHashMap();
        term9941 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term9942 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term9947 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term9942, term9942.getClass(), "tagName", "nGKItKLYNC");
        setBooleanField(term9942, term9942.getClass(), "isBlock", true);
        setBooleanField(term9942, term9942.getClass(), "formatAsBlock", true);
        setBooleanField(term9942, term9942.getClass(), "canContainBlock", true);
        setBooleanField(term9942, term9942.getClass(), "canContainInline", true);
        setBooleanField(term9942, term9942.getClass(), "empty", false);
        setBooleanField(term9942, term9942.getClass(), "selfClosing", false);
        setBooleanField(term9942, term9942.getClass(), "preserveWhitespace", true);
        setBooleanField(term9942, term9942.getClass(), "formList", true);
        setBooleanField(term9942, term9942.getClass(), "formSubmit", true);
        setField(term9941, term9941.getClass(), "tag", term9942);
        setField(term9941, term9941.getClass(), "parentNode", null);
        setField(term9941, term9941.getClass(), "childNodes", term9945);
        setField(term9947, term9947.getClass(), "attributes", term9948);
        setField(term9941, term9941.getClass(), "attributes", term9947);
        setField(term9941, term9941.getClass(), "baseUri", "onpbIeEKoi");
        setIntField(term9941, term9941.getClass(), "siblingIndex", 1227103734);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "parent", argTypes, term776, args);
        assertTrue(recursiveEquals(term776, term9941));
        assertTrue(recursiveEquals(retValue, null));
    }

};


