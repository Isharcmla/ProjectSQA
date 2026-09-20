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
import java.lang.NullPointerException;
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

public class Document_title_40823041018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term348;

    public Document_title_40823041018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term370 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term370, term370.getClass(), "tagName", null);
        setBooleanField(term370, term370.getClass(), "isBlock", false);
        setBooleanField(term370, term370.getClass(), "canContainBlock", true);
        setBooleanField(term370, term370.getClass(), "canContainInline", true);
        setBooleanField(term370, term370.getClass(), "optionalClosing", true);
        setBooleanField(term370, term370.getClass(), "empty", false);
        setBooleanField(term370, term370.getClass(), "preserveWhitespace", true);
        setField(term370, term370.getClass(), "ancestors", null);
        Object term377 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term377, term377.getClass(), "tagName", null);
        setBooleanField(term377, term377.getClass(), "isBlock", false);
        setBooleanField(term377, term377.getClass(), "canContainBlock", true);
        setBooleanField(term377, term377.getClass(), "canContainInline", true);
        setBooleanField(term377, term377.getClass(), "optionalClosing", false);
        setBooleanField(term377, term377.getClass(), "empty", true);
        setBooleanField(term377, term377.getClass(), "preserveWhitespace", true);
        setField(term377, term377.getClass(), "ancestors", null);
        ArrayList term368 = new ArrayList();
        ((ArrayList) term368).add(term370);
        ((ArrayList) term368).add(term377);
        ((ArrayList) term368).add(term377);
        HashMap term387 = new HashMap();
        Set<Object> term3885 =  ((Map) term387).keySet();
        HashSet term386 = new HashSet((Collection<? extends Object>) term3885);
        ArrayList term405 = new ArrayList();
        ((ArrayList) term405).add((Object)null);
        ((ArrayList) term405).add((Object)null);
        ((ArrayList) term405).add((Object)null);
        LinkedHashMap term410 = new LinkedHashMap();
        term348 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term349 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term409 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term349, term349.getClass(), "tagName", "IDCWpPLRkE");
        setBooleanField(term349, term349.getClass(), "isBlock", true);
        setBooleanField(term349, term349.getClass(), "canContainBlock", false);
        setBooleanField(term349, term349.getClass(), "canContainInline", false);
        setBooleanField(term349, term349.getClass(), "optionalClosing", true);
        setBooleanField(term349, term349.getClass(), "empty", false);
        setBooleanField(term349, term349.getClass(), "preserveWhitespace", true);
        setField(term349, term349.getClass(), "ancestors", term368);
        setField(term348, term348.getClass(), "tag", term349);
        setField(term348, term348.getClass(), "classNames", term386);
        setField(term348, term348.getClass(), "parentNode", null);
        setField(term348, term348.getClass(), "childNodes", term405);
        setField(term409, term409.getClass(), "attributes", term410);
        setField(term348, term348.getClass(), "attributes", term409);
        setField(term348, term348.getClass(), "baseUri", "YRHGsAkhxb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Document");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ffYhPOzlUs";
        try {
            callMethod(klass, "title", argTypes, term348, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
