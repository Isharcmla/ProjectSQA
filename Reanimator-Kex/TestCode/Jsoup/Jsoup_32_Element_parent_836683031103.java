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

public class Element_parent_836683031103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term876;
     Object term10781;

    public Element_parent_836683031103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term898 = new HashMap();
        Set<Object> term10803 =  ((Map) term898).keySet();
        HashSet term897 = new HashSet((Collection<? extends Object>) term10803);
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
        HashMap term10786 = new HashMap();
        Set<Object> term10824 =  ((Map) term10786).keySet();
        HashSet term10785 = new HashSet((Collection<? extends Object>) term10824);
        ArrayList term10787 = new ArrayList();
        ((ArrayList) term10787).add((Object)null);
        ((ArrayList) term10787).add((Object)null);
        LinkedHashMap term10790 = new LinkedHashMap();
        term10781 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term10782 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term10789 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term10782, term10782.getClass(), "tagName", "jUbSRrkrYZ");
        setBooleanField(term10782, term10782.getClass(), "isBlock", false);
        setBooleanField(term10782, term10782.getClass(), "formatAsBlock", false);
        setBooleanField(term10782, term10782.getClass(), "canContainBlock", false);
        setBooleanField(term10782, term10782.getClass(), "canContainInline", false);
        setBooleanField(term10782, term10782.getClass(), "empty", false);
        setBooleanField(term10782, term10782.getClass(), "selfClosing", false);
        setBooleanField(term10782, term10782.getClass(), "preserveWhitespace", true);
        setField(term10781, term10781.getClass(), "tag", term10782);
        setField(term10781, term10781.getClass(), "classNames", term10785);
        setField(term10781, term10781.getClass(), "parentNode", null);
        setField(term10781, term10781.getClass(), "childNodes", term10787);
        setField(term10789, term10789.getClass(), "attributes", term10790);
        setField(term10781, term10781.getClass(), "attributes", term10789);
        setField(term10781, term10781.getClass(), "baseUri", "PHvxnGHptP");
        setIntField(term10781, term10781.getClass(), "siblingIndex", 1227103734);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "parent", argTypes, term876, args);
        assertTrue(recursiveEquals(term876, term10781));
        assertTrue(recursiveEquals(retValue, null));
    }

};


