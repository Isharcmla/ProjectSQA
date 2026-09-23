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
     Object term9928;

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
        ArrayList term9932 = new ArrayList();
        ((ArrayList) term9932).add((Object)null);
        ((ArrayList) term9932).add((Object)null);
        ((ArrayList) term9932).add((Object)null);
        ((ArrayList) term9932).add((Object)null);
        ((ArrayList) term9932).add((Object)null);
        ((ArrayList) term9932).add((Object)null);
        ((ArrayList) term9932).add((Object)null);
        LinkedHashMap term9935 = new LinkedHashMap();
        term9928 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term9929 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term9934 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term9929, term9929.getClass(), "tagName", "nGKItKLYNC");
        setBooleanField(term9929, term9929.getClass(), "isBlock", true);
        setBooleanField(term9929, term9929.getClass(), "formatAsBlock", true);
        setBooleanField(term9929, term9929.getClass(), "canContainBlock", true);
        setBooleanField(term9929, term9929.getClass(), "canContainInline", true);
        setBooleanField(term9929, term9929.getClass(), "empty", false);
        setBooleanField(term9929, term9929.getClass(), "selfClosing", false);
        setBooleanField(term9929, term9929.getClass(), "preserveWhitespace", true);
        setBooleanField(term9929, term9929.getClass(), "formList", true);
        setBooleanField(term9929, term9929.getClass(), "formSubmit", true);
        setField(term9928, term9928.getClass(), "tag", term9929);
        setField(term9928, term9928.getClass(), "parentNode", null);
        setField(term9928, term9928.getClass(), "childNodes", term9932);
        setField(term9934, term9934.getClass(), "attributes", term9935);
        setField(term9928, term9928.getClass(), "attributes", term9934);
        setField(term9928, term9928.getClass(), "baseUri", "onpbIeEKoi");
        setIntField(term9928, term9928.getClass(), "siblingIndex", 1227103734);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "parent", argTypes, term776, args);
        assertTrue(recursiveEquals(term776, term9928));
        assertTrue(recursiveEquals(retValue, null));
    }

};


