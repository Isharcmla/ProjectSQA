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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_id_13187903499 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term570;
     Object term18911;

    public Element_id_13187903499() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term592 = new HashMap();
        Set<Object> term18933 =  ((Map) term592).keySet();
        HashSet term591 = new HashSet((Collection<? extends Object>) term18933);
        ArrayList term610 = new ArrayList();
        ((ArrayList) term610).add((Object)null);
        ((ArrayList) term610).add((Object)null);
        ((ArrayList) term610).add((Object)null);
        ((ArrayList) term610).add((Object)null);
        ((ArrayList) term610).add((Object)null);
        LinkedHashMap term615 = new LinkedHashMap();
        term570 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term571 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term614 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term571, term571.getClass(), "tagName", "UiUYnPrcCi");
        setBooleanField(term571, term571.getClass(), "isBlock", true);
        setBooleanField(term571, term571.getClass(), "formatAsBlock", false);
        setBooleanField(term571, term571.getClass(), "canContainBlock", false);
        setBooleanField(term571, term571.getClass(), "canContainInline", true);
        setBooleanField(term571, term571.getClass(), "empty", false);
        setBooleanField(term571, term571.getClass(), "selfClosing", true);
        setBooleanField(term571, term571.getClass(), "preserveWhitespace", false);
        setField(term570, term570.getClass(), "tag", term571);
        setField(term570, term570.getClass(), "classNames", term591);
        setField(term570, term570.getClass(), "parentNode", null);
        setField(term570, term570.getClass(), "childNodes", term610);
        setField(term614, term614.getClass(), "attributes", term615);
        setField(term570, term570.getClass(), "attributes", term614);
        setField(term570, term570.getClass(), "baseUri", "dEnhdmILtU");
        setIntField(term570, term570.getClass(), "siblingIndex", -616727354);
        HashMap term18916 = new HashMap();
        Set<Object> term18954 =  ((Map) term18916).keySet();
        HashSet term18915 = new HashSet((Collection<? extends Object>) term18954);
        ArrayList term18917 = new ArrayList();
        ((ArrayList) term18917).add((Object)null);
        ((ArrayList) term18917).add((Object)null);
        ((ArrayList) term18917).add((Object)null);
        ((ArrayList) term18917).add((Object)null);
        ((ArrayList) term18917).add((Object)null);
        LinkedHashMap term18920 = new LinkedHashMap();
        term18911 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term18912 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term18919 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term18912, term18912.getClass(), "tagName", "UiUYnPrcCi");
        setBooleanField(term18912, term18912.getClass(), "isBlock", true);
        setBooleanField(term18912, term18912.getClass(), "formatAsBlock", false);
        setBooleanField(term18912, term18912.getClass(), "canContainBlock", false);
        setBooleanField(term18912, term18912.getClass(), "canContainInline", true);
        setBooleanField(term18912, term18912.getClass(), "empty", false);
        setBooleanField(term18912, term18912.getClass(), "selfClosing", true);
        setBooleanField(term18912, term18912.getClass(), "preserveWhitespace", false);
        setField(term18911, term18911.getClass(), "tag", term18912);
        setField(term18911, term18911.getClass(), "classNames", term18915);
        setField(term18911, term18911.getClass(), "parentNode", null);
        setField(term18911, term18911.getClass(), "childNodes", term18917);
        setField(term18919, term18919.getClass(), "attributes", term18920);
        setField(term18911, term18911.getClass(), "attributes", term18919);
        setField(term18911, term18911.getClass(), "baseUri", "dEnhdmILtU");
        setIntField(term18911, term18911.getClass(), "siblingIndex", -616727354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "id", argTypes, term570, args);
        assertTrue(recursiveEquals(term570, term18911));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


