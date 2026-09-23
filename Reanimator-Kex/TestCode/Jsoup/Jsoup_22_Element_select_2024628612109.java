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

public class Element_select_2024628612109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1409;
     Object term21595;
     Object term21590;

    public Element_select_2024628612109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1431 = new HashMap();
        Set<Object> term21619 =  ((Map) term1431).keySet();
        HashSet term1430 = new HashSet((Collection<? extends Object>) term21619);
        ArrayList term1445 = new ArrayList();
        ((ArrayList) term1445).add((Object)null);
        ((ArrayList) term1445).add((Object)null);
        ((ArrayList) term1445).add((Object)null);
        ((ArrayList) term1445).add((Object)null);
        ((ArrayList) term1445).add((Object)null);
        ((ArrayList) term1445).add((Object)null);
        LinkedHashMap term1450 = new LinkedHashMap();
        term1409 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1410 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1449 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1410, term1410.getClass(), "tagName", "VYkqXKVlAJ");
        setBooleanField(term1410, term1410.getClass(), "isBlock", false);
        setBooleanField(term1410, term1410.getClass(), "formatAsBlock", false);
        setBooleanField(term1410, term1410.getClass(), "canContainBlock", false);
        setBooleanField(term1410, term1410.getClass(), "canContainInline", false);
        setBooleanField(term1410, term1410.getClass(), "empty", false);
        setBooleanField(term1410, term1410.getClass(), "selfClosing", false);
        setBooleanField(term1410, term1410.getClass(), "preserveWhitespace", false);
        setField(term1409, term1409.getClass(), "tag", term1410);
        setField(term1409, term1409.getClass(), "classNames", term1430);
        setField(term1409, term1409.getClass(), "parentNode", null);
        setField(term1409, term1409.getClass(), "childNodes", term1445);
        setField(term1449, term1449.getClass(), "attributes", term1450);
        setField(term1409, term1409.getClass(), "attributes", term1449);
        setField(term1409, term1409.getClass(), "baseUri", "DbiCVtPPCT");
        setIntField(term1409, term1409.getClass(), "siblingIndex", -1685132342);
        HashMap term21600 = new HashMap();
        Set<Object> term21650 =  ((Map) term21600).keySet();
        HashSet term21599 = new HashSet((Collection<? extends Object>) term21650);
        ArrayList term21601 = new ArrayList();
        ((ArrayList) term21601).add((Object)null);
        ((ArrayList) term21601).add((Object)null);
        ((ArrayList) term21601).add((Object)null);
        ((ArrayList) term21601).add((Object)null);
        ((ArrayList) term21601).add((Object)null);
        ((ArrayList) term21601).add((Object)null);
        LinkedHashMap term21604 = new LinkedHashMap();
        term21595 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term21596 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term21603 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term21596, term21596.getClass(), "tagName", "VYkqXKVlAJ");
        setBooleanField(term21596, term21596.getClass(), "isBlock", false);
        setBooleanField(term21596, term21596.getClass(), "formatAsBlock", false);
        setBooleanField(term21596, term21596.getClass(), "canContainBlock", false);
        setBooleanField(term21596, term21596.getClass(), "canContainInline", false);
        setBooleanField(term21596, term21596.getClass(), "empty", false);
        setBooleanField(term21596, term21596.getClass(), "selfClosing", false);
        setBooleanField(term21596, term21596.getClass(), "preserveWhitespace", false);
        setField(term21595, term21595.getClass(), "tag", term21596);
        setField(term21595, term21595.getClass(), "classNames", term21599);
        setField(term21595, term21595.getClass(), "parentNode", null);
        setField(term21595, term21595.getClass(), "childNodes", term21601);
        setField(term21603, term21603.getClass(), "attributes", term21604);
        setField(term21595, term21595.getClass(), "attributes", term21603);
        setField(term21595, term21595.getClass(), "baseUri", "DbiCVtPPCT");
        setIntField(term21595, term21595.getClass(), "siblingIndex", -1685132342);
        ArrayList term21591 = new ArrayList();
        term21590 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term21590, term21590.getClass(), "contents", term21591);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "WzFopsaDuG";
        Object retValue = callMethod(klass, "select", argTypes, term1409, args);
        assertTrue(recursiveEquals(term1409, term21595));
        assertTrue(recursiveEquals(retValue, term21590));
    }

};


