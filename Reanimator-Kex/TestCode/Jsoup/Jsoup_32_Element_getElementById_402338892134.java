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

public class Element_getElementById_402338892134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3622;
     Object term22085;

    public Element_getElementById_402338892134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3644 = new HashMap();
        Set<Object> term22109 =  ((Map) term3644).keySet();
        HashSet term3643 = new HashSet((Collection<? extends Object>) term22109);
        ArrayList term3652 = new ArrayList();
        ((ArrayList) term3652).add((Object)null);
        ((ArrayList) term3652).add((Object)null);
        ((ArrayList) term3652).add((Object)null);
        ((ArrayList) term3652).add((Object)null);
        ((ArrayList) term3652).add((Object)null);
        ((ArrayList) term3652).add((Object)null);
        ((ArrayList) term3652).add((Object)null);
        ((ArrayList) term3652).add((Object)null);
        LinkedHashMap term3657 = new LinkedHashMap();
        term3622 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3623 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3656 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3623, term3623.getClass(), "tagName", "ZwZIDwYcSW");
        setBooleanField(term3623, term3623.getClass(), "isBlock", true);
        setBooleanField(term3623, term3623.getClass(), "formatAsBlock", true);
        setBooleanField(term3623, term3623.getClass(), "canContainBlock", true);
        setBooleanField(term3623, term3623.getClass(), "canContainInline", true);
        setBooleanField(term3623, term3623.getClass(), "empty", false);
        setBooleanField(term3623, term3623.getClass(), "selfClosing", false);
        setBooleanField(term3623, term3623.getClass(), "preserveWhitespace", false);
        setField(term3622, term3622.getClass(), "tag", term3623);
        setField(term3622, term3622.getClass(), "classNames", term3643);
        setField(term3622, term3622.getClass(), "parentNode", null);
        setField(term3622, term3622.getClass(), "childNodes", term3652);
        setField(term3656, term3656.getClass(), "attributes", term3657);
        setField(term3622, term3622.getClass(), "attributes", term3656);
        setField(term3622, term3622.getClass(), "baseUri", "orEuhCStGM");
        setIntField(term3622, term3622.getClass(), "siblingIndex", 767834723);
        HashMap term22090 = new HashMap();
        Set<Object> term22140 =  ((Map) term22090).keySet();
        HashSet term22089 = new HashSet((Collection<? extends Object>) term22140);
        ArrayList term22091 = new ArrayList();
        ((ArrayList) term22091).add((Object)null);
        ((ArrayList) term22091).add((Object)null);
        ((ArrayList) term22091).add((Object)null);
        ((ArrayList) term22091).add((Object)null);
        ((ArrayList) term22091).add((Object)null);
        ((ArrayList) term22091).add((Object)null);
        ((ArrayList) term22091).add((Object)null);
        ((ArrayList) term22091).add((Object)null);
        LinkedHashMap term22094 = new LinkedHashMap();
        term22085 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term22086 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term22093 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term22086, term22086.getClass(), "tagName", "ZwZIDwYcSW");
        setBooleanField(term22086, term22086.getClass(), "isBlock", true);
        setBooleanField(term22086, term22086.getClass(), "formatAsBlock", true);
        setBooleanField(term22086, term22086.getClass(), "canContainBlock", true);
        setBooleanField(term22086, term22086.getClass(), "canContainInline", true);
        setBooleanField(term22086, term22086.getClass(), "empty", false);
        setBooleanField(term22086, term22086.getClass(), "selfClosing", false);
        setBooleanField(term22086, term22086.getClass(), "preserveWhitespace", false);
        setField(term22085, term22085.getClass(), "tag", term22086);
        setField(term22085, term22085.getClass(), "classNames", term22089);
        setField(term22085, term22085.getClass(), "parentNode", null);
        setField(term22085, term22085.getClass(), "childNodes", term22091);
        setField(term22093, term22093.getClass(), "attributes", term22094);
        setField(term22085, term22085.getClass(), "attributes", term22093);
        setField(term22085, term22085.getClass(), "baseUri", "orEuhCStGM");
        setIntField(term22085, term22085.getClass(), "siblingIndex", 767834723);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HhEaSXWvrY";
        Object retValue = callMethod(klass, "getElementById", argTypes, term3622, args);
        assertTrue(recursiveEquals(term3622, term22085));
        assertTrue(recursiveEquals(retValue, null));
    }

};


