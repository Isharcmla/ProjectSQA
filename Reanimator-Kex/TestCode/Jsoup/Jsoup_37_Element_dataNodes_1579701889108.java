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

public class Element_dataNodes_1579701889108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1349;
     Object term11825;
     Object term11767;

    public Element_dataNodes_1579701889108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1373 = new HashMap();
        Set<Object> term11847 =  ((Map) term1373).keySet();
        HashSet term1372 = new HashSet((Collection<? extends Object>) term11847);
        ArrayList term1391 = new ArrayList();
        ((ArrayList) term1391).add((Object)null);
        ((ArrayList) term1391).add((Object)null);
        LinkedHashMap term1396 = new LinkedHashMap();
        term1349 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1350 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1395 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1350, term1350.getClass(), "tagName", "yVMkkQhvmN");
        setBooleanField(term1350, term1350.getClass(), "isBlock", false);
        setBooleanField(term1350, term1350.getClass(), "formatAsBlock", true);
        setBooleanField(term1350, term1350.getClass(), "canContainBlock", false);
        setBooleanField(term1350, term1350.getClass(), "canContainInline", false);
        setBooleanField(term1350, term1350.getClass(), "empty", false);
        setBooleanField(term1350, term1350.getClass(), "selfClosing", true);
        setBooleanField(term1350, term1350.getClass(), "preserveWhitespace", true);
        setBooleanField(term1350, term1350.getClass(), "formList", false);
        setBooleanField(term1350, term1350.getClass(), "formSubmit", true);
        setField(term1349, term1349.getClass(), "tag", term1350);
        setField(term1349, term1349.getClass(), "classNames", term1372);
        setField(term1349, term1349.getClass(), "parentNode", null);
        setField(term1349, term1349.getClass(), "childNodes", term1391);
        setField(term1395, term1395.getClass(), "attributes", term1396);
        setField(term1349, term1349.getClass(), "attributes", term1395);
        setField(term1349, term1349.getClass(), "baseUri", "MwwjNtdOFT");
        setIntField(term1349, term1349.getClass(), "siblingIndex", 597278769);
        HashMap term11830 = new HashMap();
        Set<Object> term11868 =  ((Map) term11830).keySet();
        HashSet term11829 = new HashSet((Collection<? extends Object>) term11868);
        ArrayList term11831 = new ArrayList();
        ((ArrayList) term11831).add((Object)null);
        ((ArrayList) term11831).add((Object)null);
        LinkedHashMap term11834 = new LinkedHashMap();
        term11825 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term11826 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term11833 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term11826, term11826.getClass(), "tagName", "yVMkkQhvmN");
        setBooleanField(term11826, term11826.getClass(), "isBlock", false);
        setBooleanField(term11826, term11826.getClass(), "formatAsBlock", true);
        setBooleanField(term11826, term11826.getClass(), "canContainBlock", false);
        setBooleanField(term11826, term11826.getClass(), "canContainInline", false);
        setBooleanField(term11826, term11826.getClass(), "empty", false);
        setBooleanField(term11826, term11826.getClass(), "selfClosing", true);
        setBooleanField(term11826, term11826.getClass(), "preserveWhitespace", true);
        setBooleanField(term11826, term11826.getClass(), "formList", false);
        setBooleanField(term11826, term11826.getClass(), "formSubmit", true);
        setField(term11825, term11825.getClass(), "tag", term11826);
        setField(term11825, term11825.getClass(), "classNames", term11829);
        setField(term11825, term11825.getClass(), "parentNode", null);
        setField(term11825, term11825.getClass(), "childNodes", term11831);
        setField(term11833, term11833.getClass(), "attributes", term11834);
        setField(term11825, term11825.getClass(), "attributes", term11833);
        setField(term11825, term11825.getClass(), "baseUri", "MwwjNtdOFT");
        setIntField(term11825, term11825.getClass(), "siblingIndex", 597278769);
        ArrayList term11768 = new ArrayList();
        term11767 = newInstance(Class.forName("java.util.Collections$UnmodifiableRandomAccessList"));
        setField(term11767, term11767.getClass(), "list", term11768);
        setField(term11767, term11767.getClass(), "c", term11768);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "dataNodes", argTypes, term1349, args);
        assertTrue(recursiveEquals(term1349, term11825));
        assertTrue(recursiveEquals(retValue, term11767));
    }

};


