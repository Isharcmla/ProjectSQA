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

public class Element_nextElementSibling_1527392136127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3007;
     Object term20041;

    public Element_nextElementSibling_1527392136127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3029 = new HashMap();
        Set<Object> term20063 =  ((Map) term3029).keySet();
        HashSet term3028 = new HashSet((Collection<? extends Object>) term20063);
        ArrayList term3047 = new ArrayList();
        ((ArrayList) term3047).add((Object)null);
        ((ArrayList) term3047).add((Object)null);
        ((ArrayList) term3047).add((Object)null);
        ((ArrayList) term3047).add((Object)null);
        ((ArrayList) term3047).add((Object)null);
        ((ArrayList) term3047).add((Object)null);
        LinkedHashMap term3052 = new LinkedHashMap();
        term3007 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3008 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3051 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3008, term3008.getClass(), "tagName", "lZIgPZPgTu");
        setBooleanField(term3008, term3008.getClass(), "isBlock", true);
        setBooleanField(term3008, term3008.getClass(), "formatAsBlock", false);
        setBooleanField(term3008, term3008.getClass(), "canContainBlock", false);
        setBooleanField(term3008, term3008.getClass(), "canContainInline", true);
        setBooleanField(term3008, term3008.getClass(), "empty", false);
        setBooleanField(term3008, term3008.getClass(), "selfClosing", false);
        setBooleanField(term3008, term3008.getClass(), "preserveWhitespace", true);
        setField(term3007, term3007.getClass(), "tag", term3008);
        setField(term3007, term3007.getClass(), "classNames", term3028);
        setField(term3007, term3007.getClass(), "parentNode", null);
        setField(term3007, term3007.getClass(), "childNodes", term3047);
        setField(term3051, term3051.getClass(), "attributes", term3052);
        setField(term3007, term3007.getClass(), "attributes", term3051);
        setField(term3007, term3007.getClass(), "baseUri", "VDokbsCuqq");
        setIntField(term3007, term3007.getClass(), "siblingIndex", 1193880199);
        HashMap term20046 = new HashMap();
        Set<Object> term20084 =  ((Map) term20046).keySet();
        HashSet term20045 = new HashSet((Collection<? extends Object>) term20084);
        ArrayList term20047 = new ArrayList();
        ((ArrayList) term20047).add((Object)null);
        ((ArrayList) term20047).add((Object)null);
        ((ArrayList) term20047).add((Object)null);
        ((ArrayList) term20047).add((Object)null);
        ((ArrayList) term20047).add((Object)null);
        ((ArrayList) term20047).add((Object)null);
        LinkedHashMap term20050 = new LinkedHashMap();
        term20041 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term20042 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term20049 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term20042, term20042.getClass(), "tagName", "lZIgPZPgTu");
        setBooleanField(term20042, term20042.getClass(), "isBlock", true);
        setBooleanField(term20042, term20042.getClass(), "formatAsBlock", false);
        setBooleanField(term20042, term20042.getClass(), "canContainBlock", false);
        setBooleanField(term20042, term20042.getClass(), "canContainInline", true);
        setBooleanField(term20042, term20042.getClass(), "empty", false);
        setBooleanField(term20042, term20042.getClass(), "selfClosing", false);
        setBooleanField(term20042, term20042.getClass(), "preserveWhitespace", true);
        setField(term20041, term20041.getClass(), "tag", term20042);
        setField(term20041, term20041.getClass(), "classNames", term20045);
        setField(term20041, term20041.getClass(), "parentNode", null);
        setField(term20041, term20041.getClass(), "childNodes", term20047);
        setField(term20049, term20049.getClass(), "attributes", term20050);
        setField(term20041, term20041.getClass(), "attributes", term20049);
        setField(term20041, term20041.getClass(), "baseUri", "VDokbsCuqq");
        setIntField(term20041, term20041.getClass(), "siblingIndex", 1193880199);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "nextElementSibling", argTypes, term3007, args);
        assertTrue(recursiveEquals(term3007, term20041));
        assertTrue(recursiveEquals(retValue, null));
    }

};


