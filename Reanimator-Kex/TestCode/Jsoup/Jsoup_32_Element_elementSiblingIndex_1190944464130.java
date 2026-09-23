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
import java.lang.Integer;

public class Element_elementSiblingIndex_1190944464130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3260;
     Object term20608;
     Object term20606;

    public Element_elementSiblingIndex_1190944464130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3282 = new HashMap();
        Set<Object> term20630 =  ((Map) term3282).keySet();
        HashSet term3281 = new HashSet((Collection<? extends Object>) term20630);
        ArrayList term3287 = new ArrayList();
        ((ArrayList) term3287).add((Object)null);
        ((ArrayList) term3287).add((Object)null);
        ((ArrayList) term3287).add((Object)null);
        ((ArrayList) term3287).add((Object)null);
        ((ArrayList) term3287).add((Object)null);
        ((ArrayList) term3287).add((Object)null);
        LinkedHashMap term3292 = new LinkedHashMap();
        term3260 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3261 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3291 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3261, term3261.getClass(), "tagName", "IoSfuKDFRe");
        setBooleanField(term3261, term3261.getClass(), "isBlock", false);
        setBooleanField(term3261, term3261.getClass(), "formatAsBlock", true);
        setBooleanField(term3261, term3261.getClass(), "canContainBlock", false);
        setBooleanField(term3261, term3261.getClass(), "canContainInline", false);
        setBooleanField(term3261, term3261.getClass(), "empty", false);
        setBooleanField(term3261, term3261.getClass(), "selfClosing", false);
        setBooleanField(term3261, term3261.getClass(), "preserveWhitespace", true);
        setField(term3260, term3260.getClass(), "tag", term3261);
        setField(term3260, term3260.getClass(), "classNames", term3281);
        setField(term3260, term3260.getClass(), "parentNode", null);
        setField(term3260, term3260.getClass(), "childNodes", term3287);
        setField(term3291, term3291.getClass(), "attributes", term3292);
        setField(term3260, term3260.getClass(), "attributes", term3291);
        setField(term3260, term3260.getClass(), "baseUri", "sUEeHQTWkA");
        setIntField(term3260, term3260.getClass(), "siblingIndex", -469968304);
        HashMap term20613 = new HashMap();
        Set<Object> term20651 =  ((Map) term20613).keySet();
        HashSet term20612 = new HashSet((Collection<? extends Object>) term20651);
        ArrayList term20614 = new ArrayList();
        ((ArrayList) term20614).add((Object)null);
        ((ArrayList) term20614).add((Object)null);
        ((ArrayList) term20614).add((Object)null);
        ((ArrayList) term20614).add((Object)null);
        ((ArrayList) term20614).add((Object)null);
        ((ArrayList) term20614).add((Object)null);
        LinkedHashMap term20617 = new LinkedHashMap();
        term20608 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term20609 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term20616 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term20609, term20609.getClass(), "tagName", "IoSfuKDFRe");
        setBooleanField(term20609, term20609.getClass(), "isBlock", false);
        setBooleanField(term20609, term20609.getClass(), "formatAsBlock", true);
        setBooleanField(term20609, term20609.getClass(), "canContainBlock", false);
        setBooleanField(term20609, term20609.getClass(), "canContainInline", false);
        setBooleanField(term20609, term20609.getClass(), "empty", false);
        setBooleanField(term20609, term20609.getClass(), "selfClosing", false);
        setBooleanField(term20609, term20609.getClass(), "preserveWhitespace", true);
        setField(term20608, term20608.getClass(), "tag", term20609);
        setField(term20608, term20608.getClass(), "classNames", term20612);
        setField(term20608, term20608.getClass(), "parentNode", null);
        setField(term20608, term20608.getClass(), "childNodes", term20614);
        setField(term20616, term20616.getClass(), "attributes", term20617);
        setField(term20608, term20608.getClass(), "attributes", term20616);
        setField(term20608, term20608.getClass(), "baseUri", "sUEeHQTWkA");
        setIntField(term20608, term20608.getClass(), "siblingIndex", -469968304);
        term20606 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "elementSiblingIndex", argTypes, term3260, args);
        assertTrue(recursiveEquals(term3260, term20608));
        assertTrue(recursiveEquals(retValue, term20606));
    }

};


