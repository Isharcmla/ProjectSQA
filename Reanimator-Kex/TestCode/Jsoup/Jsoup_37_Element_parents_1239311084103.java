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

public class Element_parents_1239311084103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term975;
     Object term10788;
     Object term10729;

    public Element_parents_1239311084103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term999 = new HashMap();
        Set<Object> term10810 =  ((Map) term999).keySet();
        HashSet term998 = new HashSet((Collection<? extends Object>) term10810);
        ArrayList term1019 = new ArrayList();
        ((ArrayList) term1019).add((Object)null);
        ((ArrayList) term1019).add((Object)null);
        ((ArrayList) term1019).add((Object)null);
        ((ArrayList) term1019).add((Object)null);
        ((ArrayList) term1019).add((Object)null);
        ((ArrayList) term1019).add((Object)null);
        LinkedHashMap term1024 = new LinkedHashMap();
        term975 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term976 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1023 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term976, term976.getClass(), "tagName", "TimdotUuNC");
        setBooleanField(term976, term976.getClass(), "isBlock", false);
        setBooleanField(term976, term976.getClass(), "formatAsBlock", true);
        setBooleanField(term976, term976.getClass(), "canContainBlock", true);
        setBooleanField(term976, term976.getClass(), "canContainInline", false);
        setBooleanField(term976, term976.getClass(), "empty", false);
        setBooleanField(term976, term976.getClass(), "selfClosing", true);
        setBooleanField(term976, term976.getClass(), "preserveWhitespace", true);
        setBooleanField(term976, term976.getClass(), "formList", true);
        setBooleanField(term976, term976.getClass(), "formSubmit", false);
        setField(term975, term975.getClass(), "tag", term976);
        setField(term975, term975.getClass(), "classNames", term998);
        setField(term975, term975.getClass(), "parentNode", null);
        setField(term975, term975.getClass(), "childNodes", term1019);
        setField(term1023, term1023.getClass(), "attributes", term1024);
        setField(term975, term975.getClass(), "attributes", term1023);
        setField(term975, term975.getClass(), "baseUri", "BKLfkLiZTH");
        setIntField(term975, term975.getClass(), "siblingIndex", -1339778481);
        HashMap term10793 = new HashMap();
        Set<Object> term10831 =  ((Map) term10793).keySet();
        HashSet term10792 = new HashSet((Collection<? extends Object>) term10831);
        ArrayList term10794 = new ArrayList();
        ((ArrayList) term10794).add((Object)null);
        ((ArrayList) term10794).add((Object)null);
        ((ArrayList) term10794).add((Object)null);
        ((ArrayList) term10794).add((Object)null);
        ((ArrayList) term10794).add((Object)null);
        ((ArrayList) term10794).add((Object)null);
        LinkedHashMap term10797 = new LinkedHashMap();
        term10788 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term10789 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term10796 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term10789, term10789.getClass(), "tagName", "TimdotUuNC");
        setBooleanField(term10789, term10789.getClass(), "isBlock", false);
        setBooleanField(term10789, term10789.getClass(), "formatAsBlock", true);
        setBooleanField(term10789, term10789.getClass(), "canContainBlock", true);
        setBooleanField(term10789, term10789.getClass(), "canContainInline", false);
        setBooleanField(term10789, term10789.getClass(), "empty", false);
        setBooleanField(term10789, term10789.getClass(), "selfClosing", true);
        setBooleanField(term10789, term10789.getClass(), "preserveWhitespace", true);
        setBooleanField(term10789, term10789.getClass(), "formList", true);
        setBooleanField(term10789, term10789.getClass(), "formSubmit", false);
        setField(term10788, term10788.getClass(), "tag", term10789);
        setField(term10788, term10788.getClass(), "classNames", term10792);
        setField(term10788, term10788.getClass(), "parentNode", null);
        setField(term10788, term10788.getClass(), "childNodes", term10794);
        setField(term10796, term10796.getClass(), "attributes", term10797);
        setField(term10788, term10788.getClass(), "attributes", term10796);
        setField(term10788, term10788.getClass(), "baseUri", "BKLfkLiZTH");
        setIntField(term10788, term10788.getClass(), "siblingIndex", -1339778481);
        ArrayList term10730 = new ArrayList();
        term10729 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term10729, term10729.getClass(), "contents", term10730);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "parents", argTypes, term975, args);
        assertTrue(recursiveEquals(term975, term10788));
        assertTrue(recursiveEquals(retValue, term10729));
    }

};


