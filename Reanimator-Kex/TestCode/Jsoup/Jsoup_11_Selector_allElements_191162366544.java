package org.jsoup.select;

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
import static org.jsoup.select.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.select.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Selector_allElements_191162366544 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1460;
     Object term7536;
     Object term7489;

    public Selector_allElements_191162366544() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1484 = new ArrayList();
        ((ArrayList) term1484).add((Object)null);
        ((ArrayList) term1484).add((Object)null);
        ((ArrayList) term1484).add((Object)null);
        ((ArrayList) term1484).add((Object)null);
        ((ArrayList) term1484).add((Object)null);
        ((ArrayList) term1484).add((Object)null);
        ((ArrayList) term1484).add((Object)null);
        ArrayList term1488 = new ArrayList();
        ((ArrayList) term1488).add((Object)null);
        ((ArrayList) term1488).add((Object)null);
        ((ArrayList) term1488).add((Object)null);
        ArrayList term1492 = new ArrayList();
        ((ArrayList) term1492).add((Object)null);
        ((ArrayList) term1492).add((Object)null);
        ((ArrayList) term1492).add((Object)null);
        ((ArrayList) term1492).add((Object)null);
        ((ArrayList) term1492).add((Object)null);
        HashMap term1499 = new HashMap();
        Set<Object> term7558 =  ((Map) term1499).keySet();
        HashSet term1498 = new HashSet((Collection<? extends Object>) term7558);
        ArrayList term1505 = new ArrayList();
        ((ArrayList) term1505).add((Object)null);
        ((ArrayList) term1505).add((Object)null);
        ((ArrayList) term1505).add((Object)null);
        ((ArrayList) term1505).add((Object)null);
        ((ArrayList) term1505).add((Object)null);
        ((ArrayList) term1505).add((Object)null);
        LinkedHashMap term1510 = new LinkedHashMap();
        LinkedHashMap term1530 = new LinkedHashMap();
        Set<Object> term7606 =  ((Map) term1530).keySet();
        LinkedHashSet term1529 = new LinkedHashSet((Collection<? extends Object>) term7606);
        term1460 = newInstance(Class.forName("org.jsoup.select.Selector"));
        Object term1461 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1462 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1509 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term1568 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term1462, term1462.getClass(), "tagName", "PqywFWJlpE");
        setBooleanField(term1462, term1462.getClass(), "knownTag", true);
        setBooleanField(term1462, term1462.getClass(), "isBlock", false);
        setBooleanField(term1462, term1462.getClass(), "formatAsBlock", false);
        setBooleanField(term1462, term1462.getClass(), "canContainBlock", true);
        setBooleanField(term1462, term1462.getClass(), "canContainInline", true);
        setBooleanField(term1462, term1462.getClass(), "optionalClosing", true);
        setBooleanField(term1462, term1462.getClass(), "empty", true);
        setBooleanField(term1462, term1462.getClass(), "selfClosing", false);
        setBooleanField(term1462, term1462.getClass(), "preserveWhitespace", true);
        setField(term1462, term1462.getClass(), "ancestors", term1484);
        setField(term1462, term1462.getClass(), "excludes", term1488);
        setField(term1462, term1462.getClass(), "ignoreEndTags", term1492);
        setBooleanField(term1462, term1462.getClass(), "directDescendant", true);
        setBooleanField(term1462, term1462.getClass(), "limitChildren", true);
        setField(term1461, term1461.getClass(), "tag", term1462);
        setField(term1461, term1461.getClass(), "classNames", term1498);
        setField(term1461, term1461.getClass(), "parentNode", null);
        setField(term1461, term1461.getClass(), "childNodes", term1505);
        setField(term1509, term1509.getClass(), "attributes", term1510);
        setField(term1461, term1461.getClass(), "attributes", term1509);
        setField(term1461, term1461.getClass(), "baseUri", "HhEaSXWvrY");
        setIntField(term1461, term1461.getClass(), "siblingIndex", -1786399638);
        setField(term1460, term1460.getClass(), "root", term1461);
        setField(term1460, term1460.getClass(), "elements", term1529);
        setField(term1460, term1460.getClass(), "query", "DSFGlcaXUb");
        setField(term1568, term1568.getClass(), "queue", null);
        setIntField(term1568, term1568.getClass(), "pos", 0);
        setField(term1460, term1460.getClass(), "tq", term1568);
        HashSet term7539 = new HashSet();
        ArrayList term7540 = new ArrayList();
        ((ArrayList) term7540).add((Object)null);
        ((ArrayList) term7540).add((Object)null);
        ((ArrayList) term7540).add((Object)null);
        ((ArrayList) term7540).add((Object)null);
        ((ArrayList) term7540).add((Object)null);
        ((ArrayList) term7540).add((Object)null);
        LinkedHashMap term7544 = new LinkedHashMap();
        Set<Object> term7874 =  ((Map) term7544).keySet();
        LinkedHashSet term7543 = new LinkedHashSet((Collection<? extends Object>) term7874);
        term7536 = newInstance(Class.forName("org.jsoup.select.Selector"));
        Object term7537 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term7538 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term7541 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term7547 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term7538, term7538.getClass(), "tagName", null);
        setBooleanField(term7538, term7538.getClass(), "knownTag", true);
        setBooleanField(term7538, term7538.getClass(), "isBlock", false);
        setBooleanField(term7538, term7538.getClass(), "formatAsBlock", false);
        setBooleanField(term7538, term7538.getClass(), "canContainBlock", true);
        setBooleanField(term7538, term7538.getClass(), "canContainInline", true);
        setBooleanField(term7538, term7538.getClass(), "optionalClosing", true);
        setBooleanField(term7538, term7538.getClass(), "empty", true);
        setBooleanField(term7538, term7538.getClass(), "selfClosing", false);
        setBooleanField(term7538, term7538.getClass(), "preserveWhitespace", true);
        setField(term7538, term7538.getClass(), "ancestors", null);
        setField(term7538, term7538.getClass(), "excludes", null);
        setField(term7538, term7538.getClass(), "ignoreEndTags", null);
        setBooleanField(term7538, term7538.getClass(), "directDescendant", true);
        setBooleanField(term7538, term7538.getClass(), "limitChildren", true);
        setField(term7537, term7537.getClass(), "tag", term7538);
        setField(term7537, term7537.getClass(), "classNames", term7539);
        setField(term7537, term7537.getClass(), "parentNode", null);
        setField(term7537, term7537.getClass(), "childNodes", term7540);
        setField(term7541, term7541.getClass(), "attributes", null);
        setField(term7537, term7537.getClass(), "attributes", term7541);
        setField(term7537, term7537.getClass(), "baseUri", "");
        setIntField(term7537, term7537.getClass(), "siblingIndex", -1786399638);
        setField(term7536, term7536.getClass(), "root", term7537);
        setField(term7536, term7536.getClass(), "elements", term7543);
        setField(term7536, term7536.getClass(), "query", "DSFGlcaXUb");
        setField(term7547, term7547.getClass(), "queue", null);
        setIntField(term7547, term7547.getClass(), "pos", 0);
        setField(term7536, term7536.getClass(), "tq", term7547);
        HashSet term7505 = new HashSet();
        ArrayList term7506 = new ArrayList();
        ((ArrayList) term7506).add((Object)null);
        ((ArrayList) term7506).add((Object)null);
        ((ArrayList) term7506).add((Object)null);
        ((ArrayList) term7506).add((Object)null);
        ((ArrayList) term7506).add((Object)null);
        ((ArrayList) term7506).add((Object)null);
        Object term7492 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term7493 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term7509 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term7493, term7493.getClass(), "tagName", null);
        setBooleanField(term7493, term7493.getClass(), "knownTag", true);
        setBooleanField(term7493, term7493.getClass(), "isBlock", false);
        setBooleanField(term7493, term7493.getClass(), "formatAsBlock", false);
        setBooleanField(term7493, term7493.getClass(), "canContainBlock", true);
        setBooleanField(term7493, term7493.getClass(), "canContainInline", true);
        setBooleanField(term7493, term7493.getClass(), "optionalClosing", true);
        setBooleanField(term7493, term7493.getClass(), "empty", true);
        setBooleanField(term7493, term7493.getClass(), "selfClosing", false);
        setBooleanField(term7493, term7493.getClass(), "preserveWhitespace", true);
        setField(term7493, term7493.getClass(), "ancestors", null);
        setField(term7493, term7493.getClass(), "excludes", null);
        setField(term7493, term7493.getClass(), "ignoreEndTags", null);
        setBooleanField(term7493, term7493.getClass(), "directDescendant", true);
        setBooleanField(term7493, term7493.getClass(), "limitChildren", true);
        setField(term7492, term7492.getClass(), "tag", term7493);
        setField(term7492, term7492.getClass(), "classNames", term7505);
        setField(term7492, term7492.getClass(), "parentNode", null);
        setField(term7492, term7492.getClass(), "childNodes", term7506);
        setField(term7509, term7509.getClass(), "attributes", null);
        setField(term7492, term7492.getClass(), "attributes", term7509);
        setField(term7492, term7492.getClass(), "baseUri", "");
        setIntField(term7492, term7492.getClass(), "siblingIndex", -1786399638);
        ArrayList term7490 = new ArrayList();
        ((ArrayList) term7490).add(term7492);
        term7489 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term7489, term7489.getClass(), "contents", term7490);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.Selector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "allElements", argTypes, term1460, args);
        assertTrue(recursiveEquals(term1460, term7536));
        assertTrue(recursiveEquals(retValue, term7489));
    }

};


