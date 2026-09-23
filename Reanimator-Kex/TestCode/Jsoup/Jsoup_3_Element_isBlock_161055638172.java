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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class Element_isBlock_161055638172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term536;
     Object term8752;

    public Element_isBlock_161055638172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term556 = new ArrayList();
        HashMap term561 = new HashMap();
        Set<Object> term8776 =  ((Map) term561).keySet();
        HashSet term560 = new HashSet((Collection<? extends Object>) term8776);
        ArrayList term571 = new ArrayList();
        ((ArrayList) term571).add((Object)null);
        ((ArrayList) term571).add((Object)null);
        ((ArrayList) term571).add((Object)null);
        ((ArrayList) term571).add((Object)null);
        ((ArrayList) term571).add((Object)null);
        ((ArrayList) term571).add((Object)null);
        ((ArrayList) term571).add((Object)null);
        LinkedHashMap term576 = new LinkedHashMap();
        term536 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term537 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term575 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term537, term537.getClass(), "tagName", "uWHnvSvaPl");
        setBooleanField(term537, term537.getClass(), "isBlock", true);
        setBooleanField(term537, term537.getClass(), "canContainBlock", true);
        setBooleanField(term537, term537.getClass(), "canContainInline", true);
        setBooleanField(term537, term537.getClass(), "optionalClosing", false);
        setBooleanField(term537, term537.getClass(), "empty", false);
        setBooleanField(term537, term537.getClass(), "preserveWhitespace", false);
        setField(term537, term537.getClass(), "ancestors", term556);
        setField(term536, term536.getClass(), "tag", term537);
        setField(term536, term536.getClass(), "classNames", term560);
        setField(term536, term536.getClass(), "parentNode", null);
        setField(term536, term536.getClass(), "childNodes", term571);
        setField(term575, term575.getClass(), "attributes", term576);
        setField(term536, term536.getClass(), "attributes", term575);
        setField(term536, term536.getClass(), "baseUri", "tPlsykYBqO");
        ArrayList term8756 = new ArrayList();
        HashMap term8759 = new HashMap();
        Set<Object> term8797 =  ((Map) term8759).keySet();
        HashSet term8758 = new HashSet((Collection<? extends Object>) term8797);
        ArrayList term8760 = new ArrayList();
        ((ArrayList) term8760).add((Object)null);
        ((ArrayList) term8760).add((Object)null);
        ((ArrayList) term8760).add((Object)null);
        ((ArrayList) term8760).add((Object)null);
        ((ArrayList) term8760).add((Object)null);
        ((ArrayList) term8760).add((Object)null);
        ((ArrayList) term8760).add((Object)null);
        LinkedHashMap term8763 = new LinkedHashMap();
        term8752 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term8753 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term8762 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term8753, term8753.getClass(), "tagName", "uWHnvSvaPl");
        setBooleanField(term8753, term8753.getClass(), "isBlock", true);
        setBooleanField(term8753, term8753.getClass(), "canContainBlock", true);
        setBooleanField(term8753, term8753.getClass(), "canContainInline", true);
        setBooleanField(term8753, term8753.getClass(), "optionalClosing", false);
        setBooleanField(term8753, term8753.getClass(), "empty", false);
        setBooleanField(term8753, term8753.getClass(), "preserveWhitespace", false);
        setField(term8753, term8753.getClass(), "ancestors", term8756);
        setField(term8752, term8752.getClass(), "tag", term8753);
        setField(term8752, term8752.getClass(), "classNames", term8758);
        setField(term8752, term8752.getClass(), "parentNode", null);
        setField(term8752, term8752.getClass(), "childNodes", term8760);
        setField(term8762, term8762.getClass(), "attributes", term8763);
        setField(term8752, term8752.getClass(), "attributes", term8762);
        setField(term8752, term8752.getClass(), "baseUri", "tPlsykYBqO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isBlock", argTypes, term536, args);
        assertTrue(recursiveEquals(term536, term8752));
    }

};


