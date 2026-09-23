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
     Object term1441;
     Object term12908;
     Object term12903;

    public Element_select_2024628612109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1465 = new HashMap();
        Set<Object> term12932 =  ((Map) term1465).keySet();
        HashSet term1464 = new HashSet((Collection<? extends Object>) term12932);
        ArrayList term1479 = new ArrayList();
        ((ArrayList) term1479).add((Object)null);
        ((ArrayList) term1479).add((Object)null);
        ((ArrayList) term1479).add((Object)null);
        ((ArrayList) term1479).add((Object)null);
        ((ArrayList) term1479).add((Object)null);
        ((ArrayList) term1479).add((Object)null);
        LinkedHashMap term1484 = new LinkedHashMap();
        term1441 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1442 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1483 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1442, term1442.getClass(), "tagName", "VYkqXKVlAJ");
        setBooleanField(term1442, term1442.getClass(), "isBlock", true);
        setBooleanField(term1442, term1442.getClass(), "formatAsBlock", false);
        setBooleanField(term1442, term1442.getClass(), "canContainBlock", false);
        setBooleanField(term1442, term1442.getClass(), "canContainInline", false);
        setBooleanField(term1442, term1442.getClass(), "empty", true);
        setBooleanField(term1442, term1442.getClass(), "selfClosing", false);
        setBooleanField(term1442, term1442.getClass(), "preserveWhitespace", false);
        setBooleanField(term1442, term1442.getClass(), "formList", false);
        setBooleanField(term1442, term1442.getClass(), "formSubmit", true);
        setField(term1441, term1441.getClass(), "tag", term1442);
        setField(term1441, term1441.getClass(), "classNames", term1464);
        setField(term1441, term1441.getClass(), "parentNode", null);
        setField(term1441, term1441.getClass(), "childNodes", term1479);
        setField(term1483, term1483.getClass(), "attributes", term1484);
        setField(term1441, term1441.getClass(), "attributes", term1483);
        setField(term1441, term1441.getClass(), "baseUri", "DbiCVtPPCT");
        setIntField(term1441, term1441.getClass(), "siblingIndex", -1685132342);
        HashMap term12913 = new HashMap();
        Set<Object> term12963 =  ((Map) term12913).keySet();
        HashSet term12912 = new HashSet((Collection<? extends Object>) term12963);
        ArrayList term12914 = new ArrayList();
        ((ArrayList) term12914).add((Object)null);
        ((ArrayList) term12914).add((Object)null);
        ((ArrayList) term12914).add((Object)null);
        ((ArrayList) term12914).add((Object)null);
        ((ArrayList) term12914).add((Object)null);
        ((ArrayList) term12914).add((Object)null);
        LinkedHashMap term12917 = new LinkedHashMap();
        term12908 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term12909 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term12916 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term12909, term12909.getClass(), "tagName", "VYkqXKVlAJ");
        setBooleanField(term12909, term12909.getClass(), "isBlock", true);
        setBooleanField(term12909, term12909.getClass(), "formatAsBlock", false);
        setBooleanField(term12909, term12909.getClass(), "canContainBlock", false);
        setBooleanField(term12909, term12909.getClass(), "canContainInline", false);
        setBooleanField(term12909, term12909.getClass(), "empty", true);
        setBooleanField(term12909, term12909.getClass(), "selfClosing", false);
        setBooleanField(term12909, term12909.getClass(), "preserveWhitespace", false);
        setBooleanField(term12909, term12909.getClass(), "formList", false);
        setBooleanField(term12909, term12909.getClass(), "formSubmit", true);
        setField(term12908, term12908.getClass(), "tag", term12909);
        setField(term12908, term12908.getClass(), "classNames", term12912);
        setField(term12908, term12908.getClass(), "parentNode", null);
        setField(term12908, term12908.getClass(), "childNodes", term12914);
        setField(term12916, term12916.getClass(), "attributes", term12917);
        setField(term12908, term12908.getClass(), "attributes", term12916);
        setField(term12908, term12908.getClass(), "baseUri", "DbiCVtPPCT");
        setIntField(term12908, term12908.getClass(), "siblingIndex", -1685132342);
        ArrayList term12904 = new ArrayList();
        term12903 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term12903, term12903.getClass(), "contents", term12904);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "WzFopsaDuG";
        Object retValue = callMethod(klass, "select", argTypes, term1441, args);
        assertTrue(recursiveEquals(term1441, term12908));
        assertTrue(recursiveEquals(retValue, term12903));
    }

};


