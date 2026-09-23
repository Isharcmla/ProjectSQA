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
import java.lang.StringIndexOutOfBoundsException;
import static org.jsoup.select.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Selector_indexLessThan_196669213148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1586;

    public Selector_indexLessThan_196669213148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1610 = new ArrayList();
        ((ArrayList) term1610).add((Object)null);
        ((ArrayList) term1610).add((Object)null);
        ((ArrayList) term1610).add((Object)null);
        ((ArrayList) term1610).add((Object)null);
        ((ArrayList) term1610).add((Object)null);
        ((ArrayList) term1610).add((Object)null);
        ((ArrayList) term1610).add((Object)null);
        ArrayList term1614 = new ArrayList();
        ((ArrayList) term1614).add((Object)null);
        ((ArrayList) term1614).add((Object)null);
        ((ArrayList) term1614).add((Object)null);
        ((ArrayList) term1614).add((Object)null);
        ((ArrayList) term1614).add((Object)null);
        ArrayList term1618 = new ArrayList();
        ((ArrayList) term1618).add((Object)null);
        ((ArrayList) term1618).add((Object)null);
        ((ArrayList) term1618).add((Object)null);
        ((ArrayList) term1618).add((Object)null);
        ((ArrayList) term1618).add((Object)null);
        ((ArrayList) term1618).add((Object)null);
        ((ArrayList) term1618).add((Object)null);
        ((ArrayList) term1618).add((Object)null);
        HashMap term1625 = new HashMap();
        Set<Object> term8323 =  ((Map) term1625).keySet();
        HashSet term1624 = new HashSet((Collection<? extends Object>) term8323);
        ArrayList term1631 = new ArrayList();
        ((ArrayList) term1631).add((Object)null);
        ((ArrayList) term1631).add((Object)null);
        ((ArrayList) term1631).add((Object)null);
        ((ArrayList) term1631).add((Object)null);
        ((ArrayList) term1631).add((Object)null);
        ((ArrayList) term1631).add((Object)null);
        ((ArrayList) term1631).add((Object)null);
        ((ArrayList) term1631).add((Object)null);
        LinkedHashMap term1636 = new LinkedHashMap();
        LinkedHashMap term1656 = new LinkedHashMap();
        Set<Object> term8334 =  ((Map) term1656).keySet();
        LinkedHashSet term1655 = new LinkedHashSet((Collection<? extends Object>) term8334);
        term1586 = newInstance(Class.forName("org.jsoup.select.Selector"));
        Object term1587 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1588 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1635 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term1682 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term1588, term1588.getClass(), "tagName", "DSFGlcaXUb");
        setBooleanField(term1588, term1588.getClass(), "knownTag", false);
        setBooleanField(term1588, term1588.getClass(), "isBlock", false);
        setBooleanField(term1588, term1588.getClass(), "formatAsBlock", true);
        setBooleanField(term1588, term1588.getClass(), "canContainBlock", false);
        setBooleanField(term1588, term1588.getClass(), "canContainInline", true);
        setBooleanField(term1588, term1588.getClass(), "optionalClosing", true);
        setBooleanField(term1588, term1588.getClass(), "empty", true);
        setBooleanField(term1588, term1588.getClass(), "selfClosing", true);
        setBooleanField(term1588, term1588.getClass(), "preserveWhitespace", false);
        setField(term1588, term1588.getClass(), "ancestors", term1610);
        setField(term1588, term1588.getClass(), "excludes", term1614);
        setField(term1588, term1588.getClass(), "ignoreEndTags", term1618);
        setBooleanField(term1588, term1588.getClass(), "directDescendant", false);
        setBooleanField(term1588, term1588.getClass(), "limitChildren", true);
        setField(term1587, term1587.getClass(), "tag", term1588);
        setField(term1587, term1587.getClass(), "classNames", term1624);
        setField(term1587, term1587.getClass(), "parentNode", null);
        setField(term1587, term1587.getClass(), "childNodes", term1631);
        setField(term1635, term1635.getClass(), "attributes", term1636);
        setField(term1587, term1587.getClass(), "attributes", term1635);
        setField(term1587, term1587.getClass(), "baseUri", "IApvtmfhnq");
        setIntField(term1587, term1587.getClass(), "siblingIndex", 1596070772);
        setField(term1586, term1586.getClass(), "root", term1587);
        setField(term1586, term1586.getClass(), "elements", term1655);
        setField(term1586, term1586.getClass(), "query", "BWxJSgKHRT");
        setField(term1682, term1682.getClass(), "queue", "AGXoIndFnm");
        setIntField(term1682, term1682.getClass(), "pos", -2095575670);
        setField(term1586, term1586.getClass(), "tq", term1682);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.Selector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "indexLessThan", argTypes, term1586, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


