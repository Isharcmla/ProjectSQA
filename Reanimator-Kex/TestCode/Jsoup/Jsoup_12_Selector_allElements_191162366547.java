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

public class Selector_allElements_191162366547 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1442;
     Object term7697;
     Object term7650;

    public Selector_allElements_191162366547() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1466 = new ArrayList();
        ((ArrayList) term1466).add((Object)null);
        ((ArrayList) term1466).add((Object)null);
        ((ArrayList) term1466).add((Object)null);
        ((ArrayList) term1466).add((Object)null);
        ((ArrayList) term1466).add((Object)null);
        ((ArrayList) term1466).add((Object)null);
        ((ArrayList) term1466).add((Object)null);
        ArrayList term1470 = new ArrayList();
        ((ArrayList) term1470).add((Object)null);
        ((ArrayList) term1470).add((Object)null);
        ((ArrayList) term1470).add((Object)null);
        ArrayList term1474 = new ArrayList();
        ((ArrayList) term1474).add((Object)null);
        ((ArrayList) term1474).add((Object)null);
        ((ArrayList) term1474).add((Object)null);
        ((ArrayList) term1474).add((Object)null);
        ((ArrayList) term1474).add((Object)null);
        HashMap term1481 = new HashMap();
        Set<Object> term7719 =  ((Map) term1481).keySet();
        HashSet term1480 = new HashSet((Collection<? extends Object>) term7719);
        ArrayList term1487 = new ArrayList();
        ((ArrayList) term1487).add((Object)null);
        ((ArrayList) term1487).add((Object)null);
        ((ArrayList) term1487).add((Object)null);
        ((ArrayList) term1487).add((Object)null);
        ((ArrayList) term1487).add((Object)null);
        ((ArrayList) term1487).add((Object)null);
        LinkedHashMap term1492 = new LinkedHashMap();
        LinkedHashMap term1512 = new LinkedHashMap();
        Set<Object> term7730 =  ((Map) term1512).keySet();
        LinkedHashSet term1511 = new LinkedHashSet((Collection<? extends Object>) term7730);
        term1442 = newInstance(Class.forName("org.jsoup.select.Selector"));
        Object term1443 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1444 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1491 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term1552 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term1444, term1444.getClass(), "tagName", "zLMTXDQHYH");
        setBooleanField(term1444, term1444.getClass(), "knownTag", true);
        setBooleanField(term1444, term1444.getClass(), "isBlock", false);
        setBooleanField(term1444, term1444.getClass(), "formatAsBlock", false);
        setBooleanField(term1444, term1444.getClass(), "canContainBlock", true);
        setBooleanField(term1444, term1444.getClass(), "canContainInline", true);
        setBooleanField(term1444, term1444.getClass(), "optionalClosing", true);
        setBooleanField(term1444, term1444.getClass(), "empty", true);
        setBooleanField(term1444, term1444.getClass(), "selfClosing", false);
        setBooleanField(term1444, term1444.getClass(), "preserveWhitespace", true);
        setField(term1444, term1444.getClass(), "ancestors", term1466);
        setField(term1444, term1444.getClass(), "excludes", term1470);
        setField(term1444, term1444.getClass(), "ignoreEndTags", term1474);
        setBooleanField(term1444, term1444.getClass(), "directDescendant", true);
        setBooleanField(term1444, term1444.getClass(), "limitChildren", true);
        setField(term1443, term1443.getClass(), "tag", term1444);
        setField(term1443, term1443.getClass(), "classNames", term1480);
        setField(term1443, term1443.getClass(), "parentNode", null);
        setField(term1443, term1443.getClass(), "childNodes", term1487);
        setField(term1491, term1491.getClass(), "attributes", term1492);
        setField(term1443, term1443.getClass(), "attributes", term1491);
        setField(term1443, term1443.getClass(), "baseUri", "orEuhCStGM");
        setIntField(term1443, term1443.getClass(), "siblingIndex", -1786399638);
        setField(term1442, term1442.getClass(), "root", term1443);
        setField(term1442, term1442.getClass(), "elements", term1511);
        setField(term1442, term1442.getClass(), "query", "UuYWMTqWTV");
        setField(term1552, term1552.getClass(), "queue", null);
        setIntField(term1552, term1552.getClass(), "pos", 0);
        setField(term1442, term1442.getClass(), "tq", term1552);
        HashSet term7700 = new HashSet();
        ArrayList term7701 = new ArrayList();
        ((ArrayList) term7701).add((Object)null);
        ((ArrayList) term7701).add((Object)null);
        ((ArrayList) term7701).add((Object)null);
        ((ArrayList) term7701).add((Object)null);
        ((ArrayList) term7701).add((Object)null);
        ((ArrayList) term7701).add((Object)null);
        LinkedHashMap term7705 = new LinkedHashMap();
        Set<Object> term7741 =  ((Map) term7705).keySet();
        LinkedHashSet term7704 = new LinkedHashSet((Collection<? extends Object>) term7741);
        term7697 = newInstance(Class.forName("org.jsoup.select.Selector"));
        Object term7698 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term7699 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term7702 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term7708 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term7699, term7699.getClass(), "tagName", null);
        setBooleanField(term7699, term7699.getClass(), "knownTag", true);
        setBooleanField(term7699, term7699.getClass(), "isBlock", false);
        setBooleanField(term7699, term7699.getClass(), "formatAsBlock", false);
        setBooleanField(term7699, term7699.getClass(), "canContainBlock", true);
        setBooleanField(term7699, term7699.getClass(), "canContainInline", true);
        setBooleanField(term7699, term7699.getClass(), "optionalClosing", true);
        setBooleanField(term7699, term7699.getClass(), "empty", true);
        setBooleanField(term7699, term7699.getClass(), "selfClosing", false);
        setBooleanField(term7699, term7699.getClass(), "preserveWhitespace", true);
        setField(term7699, term7699.getClass(), "ancestors", null);
        setField(term7699, term7699.getClass(), "excludes", null);
        setField(term7699, term7699.getClass(), "ignoreEndTags", null);
        setBooleanField(term7699, term7699.getClass(), "directDescendant", true);
        setBooleanField(term7699, term7699.getClass(), "limitChildren", true);
        setField(term7698, term7698.getClass(), "tag", term7699);
        setField(term7698, term7698.getClass(), "classNames", term7700);
        setField(term7698, term7698.getClass(), "parentNode", null);
        setField(term7698, term7698.getClass(), "childNodes", term7701);
        setField(term7702, term7702.getClass(), "attributes", null);
        setField(term7698, term7698.getClass(), "attributes", term7702);
        setField(term7698, term7698.getClass(), "baseUri", "");
        setIntField(term7698, term7698.getClass(), "siblingIndex", -1786399638);
        setField(term7697, term7697.getClass(), "root", term7698);
        setField(term7697, term7697.getClass(), "elements", term7704);
        setField(term7697, term7697.getClass(), "query", "UuYWMTqWTV");
        setField(term7708, term7708.getClass(), "queue", null);
        setIntField(term7708, term7708.getClass(), "pos", 0);
        setField(term7697, term7697.getClass(), "tq", term7708);
        HashSet term7666 = new HashSet();
        ArrayList term7667 = new ArrayList();
        ((ArrayList) term7667).add((Object)null);
        ((ArrayList) term7667).add((Object)null);
        ((ArrayList) term7667).add((Object)null);
        ((ArrayList) term7667).add((Object)null);
        ((ArrayList) term7667).add((Object)null);
        ((ArrayList) term7667).add((Object)null);
        Object term7653 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term7654 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term7670 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term7654, term7654.getClass(), "tagName", null);
        setBooleanField(term7654, term7654.getClass(), "knownTag", true);
        setBooleanField(term7654, term7654.getClass(), "isBlock", false);
        setBooleanField(term7654, term7654.getClass(), "formatAsBlock", false);
        setBooleanField(term7654, term7654.getClass(), "canContainBlock", true);
        setBooleanField(term7654, term7654.getClass(), "canContainInline", true);
        setBooleanField(term7654, term7654.getClass(), "optionalClosing", true);
        setBooleanField(term7654, term7654.getClass(), "empty", true);
        setBooleanField(term7654, term7654.getClass(), "selfClosing", false);
        setBooleanField(term7654, term7654.getClass(), "preserveWhitespace", true);
        setField(term7654, term7654.getClass(), "ancestors", null);
        setField(term7654, term7654.getClass(), "excludes", null);
        setField(term7654, term7654.getClass(), "ignoreEndTags", null);
        setBooleanField(term7654, term7654.getClass(), "directDescendant", true);
        setBooleanField(term7654, term7654.getClass(), "limitChildren", true);
        setField(term7653, term7653.getClass(), "tag", term7654);
        setField(term7653, term7653.getClass(), "classNames", term7666);
        setField(term7653, term7653.getClass(), "parentNode", null);
        setField(term7653, term7653.getClass(), "childNodes", term7667);
        setField(term7670, term7670.getClass(), "attributes", null);
        setField(term7653, term7653.getClass(), "attributes", term7670);
        setField(term7653, term7653.getClass(), "baseUri", "");
        setIntField(term7653, term7653.getClass(), "siblingIndex", -1786399638);
        ArrayList term7651 = new ArrayList();
        ((ArrayList) term7651).add(term7653);
        term7650 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term7650, term7650.getClass(), "contents", term7651);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.Selector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "allElements", argTypes, term1442, args);
        assertTrue(recursiveEquals(term1442, term7697));
        assertTrue(recursiveEquals(retValue, term7650));
    }

};


