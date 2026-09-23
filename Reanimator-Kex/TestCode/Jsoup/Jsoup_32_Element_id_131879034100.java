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

public class Element_id_131879034100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term570;
     Object term10299;

    public Element_id_131879034100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term592 = new HashMap();
        Set<Object> term10321 =  ((Map) term592).keySet();
        HashSet term591 = new HashSet((Collection<? extends Object>) term10321);
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
        HashMap term10304 = new HashMap();
        Set<Object> term10342 =  ((Map) term10304).keySet();
        HashSet term10303 = new HashSet((Collection<? extends Object>) term10342);
        ArrayList term10305 = new ArrayList();
        ((ArrayList) term10305).add((Object)null);
        ((ArrayList) term10305).add((Object)null);
        ((ArrayList) term10305).add((Object)null);
        ((ArrayList) term10305).add((Object)null);
        ((ArrayList) term10305).add((Object)null);
        LinkedHashMap term10308 = new LinkedHashMap();
        term10299 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term10300 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term10307 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term10300, term10300.getClass(), "tagName", "UiUYnPrcCi");
        setBooleanField(term10300, term10300.getClass(), "isBlock", true);
        setBooleanField(term10300, term10300.getClass(), "formatAsBlock", false);
        setBooleanField(term10300, term10300.getClass(), "canContainBlock", false);
        setBooleanField(term10300, term10300.getClass(), "canContainInline", true);
        setBooleanField(term10300, term10300.getClass(), "empty", false);
        setBooleanField(term10300, term10300.getClass(), "selfClosing", true);
        setBooleanField(term10300, term10300.getClass(), "preserveWhitespace", false);
        setField(term10299, term10299.getClass(), "tag", term10300);
        setField(term10299, term10299.getClass(), "classNames", term10303);
        setField(term10299, term10299.getClass(), "parentNode", null);
        setField(term10299, term10299.getClass(), "childNodes", term10305);
        setField(term10307, term10307.getClass(), "attributes", term10308);
        setField(term10299, term10299.getClass(), "attributes", term10307);
        setField(term10299, term10299.getClass(), "baseUri", "dEnhdmILtU");
        setIntField(term10299, term10299.getClass(), "siblingIndex", -616727354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "id", argTypes, term570, args);
        assertTrue(recursiveEquals(term570, term10299));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


