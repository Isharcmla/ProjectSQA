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

public class Element_parent_836683031102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term876;
     Object term19386;

    public Element_parent_836683031102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term898 = new HashMap();
        Set<Object> term19408 =  ((Map) term898).keySet();
        HashSet term897 = new HashSet((Collection<? extends Object>) term19408);
        ArrayList term903 = new ArrayList();
        ((ArrayList) term903).add((Object)null);
        ((ArrayList) term903).add((Object)null);
        LinkedHashMap term908 = new LinkedHashMap();
        term876 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term877 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term907 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term877, term877.getClass(), "tagName", "jUbSRrkrYZ");
        setBooleanField(term877, term877.getClass(), "isBlock", false);
        setBooleanField(term877, term877.getClass(), "formatAsBlock", false);
        setBooleanField(term877, term877.getClass(), "canContainBlock", false);
        setBooleanField(term877, term877.getClass(), "canContainInline", false);
        setBooleanField(term877, term877.getClass(), "empty", false);
        setBooleanField(term877, term877.getClass(), "selfClosing", false);
        setBooleanField(term877, term877.getClass(), "preserveWhitespace", true);
        setField(term876, term876.getClass(), "tag", term877);
        setField(term876, term876.getClass(), "classNames", term897);
        setField(term876, term876.getClass(), "parentNode", null);
        setField(term876, term876.getClass(), "childNodes", term903);
        setField(term907, term907.getClass(), "attributes", term908);
        setField(term876, term876.getClass(), "attributes", term907);
        setField(term876, term876.getClass(), "baseUri", "PHvxnGHptP");
        setIntField(term876, term876.getClass(), "siblingIndex", 1227103734);
        HashMap term19391 = new HashMap();
        Set<Object> term19429 =  ((Map) term19391).keySet();
        HashSet term19390 = new HashSet((Collection<? extends Object>) term19429);
        ArrayList term19392 = new ArrayList();
        ((ArrayList) term19392).add((Object)null);
        ((ArrayList) term19392).add((Object)null);
        LinkedHashMap term19395 = new LinkedHashMap();
        term19386 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term19387 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term19394 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term19387, term19387.getClass(), "tagName", "jUbSRrkrYZ");
        setBooleanField(term19387, term19387.getClass(), "isBlock", false);
        setBooleanField(term19387, term19387.getClass(), "formatAsBlock", false);
        setBooleanField(term19387, term19387.getClass(), "canContainBlock", false);
        setBooleanField(term19387, term19387.getClass(), "canContainInline", false);
        setBooleanField(term19387, term19387.getClass(), "empty", false);
        setBooleanField(term19387, term19387.getClass(), "selfClosing", false);
        setBooleanField(term19387, term19387.getClass(), "preserveWhitespace", true);
        setField(term19386, term19386.getClass(), "tag", term19387);
        setField(term19386, term19386.getClass(), "classNames", term19390);
        setField(term19386, term19386.getClass(), "parentNode", null);
        setField(term19386, term19386.getClass(), "childNodes", term19392);
        setField(term19394, term19394.getClass(), "attributes", term19395);
        setField(term19386, term19386.getClass(), "attributes", term19394);
        setField(term19386, term19386.getClass(), "baseUri", "PHvxnGHptP");
        setIntField(term19386, term19386.getClass(), "siblingIndex", 1227103734);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "parent", argTypes, term876, args);
        assertTrue(recursiveEquals(term876, term19386));
        assertTrue(recursiveEquals(retValue, null));
    }

};


