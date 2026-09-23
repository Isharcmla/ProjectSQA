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

public class Element_getElementsByAttribute_599263456135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3908;
     Object term23146;
     Object term23141;

    public Element_getElementsByAttribute_599263456135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3932 = new HashMap();
        Set<Object> term23170 =  ((Map) term3932).keySet();
        HashSet term3931 = new HashSet((Collection<? extends Object>) term23170);
        ArrayList term3946 = new ArrayList();
        ((ArrayList) term3946).add((Object)null);
        ((ArrayList) term3946).add((Object)null);
        ((ArrayList) term3946).add((Object)null);
        ((ArrayList) term3946).add((Object)null);
        ((ArrayList) term3946).add((Object)null);
        ((ArrayList) term3946).add((Object)null);
        ((ArrayList) term3946).add((Object)null);
        ((ArrayList) term3946).add((Object)null);
        ((ArrayList) term3946).add((Object)null);
        LinkedHashMap term3951 = new LinkedHashMap();
        term3908 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3909 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3950 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3909, term3909.getClass(), "tagName", "yeSXGqQExb");
        setBooleanField(term3909, term3909.getClass(), "isBlock", false);
        setBooleanField(term3909, term3909.getClass(), "formatAsBlock", false);
        setBooleanField(term3909, term3909.getClass(), "canContainBlock", false);
        setBooleanField(term3909, term3909.getClass(), "canContainInline", true);
        setBooleanField(term3909, term3909.getClass(), "empty", true);
        setBooleanField(term3909, term3909.getClass(), "selfClosing", false);
        setBooleanField(term3909, term3909.getClass(), "preserveWhitespace", false);
        setBooleanField(term3909, term3909.getClass(), "formList", false);
        setBooleanField(term3909, term3909.getClass(), "formSubmit", false);
        setField(term3908, term3908.getClass(), "tag", term3909);
        setField(term3908, term3908.getClass(), "classNames", term3931);
        setField(term3908, term3908.getClass(), "parentNode", null);
        setField(term3908, term3908.getClass(), "childNodes", term3946);
        setField(term3950, term3950.getClass(), "attributes", term3951);
        setField(term3908, term3908.getClass(), "attributes", term3950);
        setField(term3908, term3908.getClass(), "baseUri", "EusenEbIoF");
        setIntField(term3908, term3908.getClass(), "siblingIndex", -157887805);
        HashMap term23151 = new HashMap();
        Set<Object> term23201 =  ((Map) term23151).keySet();
        HashSet term23150 = new HashSet((Collection<? extends Object>) term23201);
        ArrayList term23152 = new ArrayList();
        ((ArrayList) term23152).add((Object)null);
        ((ArrayList) term23152).add((Object)null);
        ((ArrayList) term23152).add((Object)null);
        ((ArrayList) term23152).add((Object)null);
        ((ArrayList) term23152).add((Object)null);
        ((ArrayList) term23152).add((Object)null);
        ((ArrayList) term23152).add((Object)null);
        ((ArrayList) term23152).add((Object)null);
        ((ArrayList) term23152).add((Object)null);
        LinkedHashMap term23155 = new LinkedHashMap();
        term23146 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term23147 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term23154 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term23147, term23147.getClass(), "tagName", "yeSXGqQExb");
        setBooleanField(term23147, term23147.getClass(), "isBlock", false);
        setBooleanField(term23147, term23147.getClass(), "formatAsBlock", false);
        setBooleanField(term23147, term23147.getClass(), "canContainBlock", false);
        setBooleanField(term23147, term23147.getClass(), "canContainInline", true);
        setBooleanField(term23147, term23147.getClass(), "empty", true);
        setBooleanField(term23147, term23147.getClass(), "selfClosing", false);
        setBooleanField(term23147, term23147.getClass(), "preserveWhitespace", false);
        setBooleanField(term23147, term23147.getClass(), "formList", false);
        setBooleanField(term23147, term23147.getClass(), "formSubmit", false);
        setField(term23146, term23146.getClass(), "tag", term23147);
        setField(term23146, term23146.getClass(), "classNames", term23150);
        setField(term23146, term23146.getClass(), "parentNode", null);
        setField(term23146, term23146.getClass(), "childNodes", term23152);
        setField(term23154, term23154.getClass(), "attributes", term23155);
        setField(term23146, term23146.getClass(), "attributes", term23154);
        setField(term23146, term23146.getClass(), "baseUri", "EusenEbIoF");
        setIntField(term23146, term23146.getClass(), "siblingIndex", -157887805);
        ArrayList term23142 = new ArrayList();
        term23141 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term23141, term23141.getClass(), "contents", term23142);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SScVQYSvWH";
        Object retValue = callMethod(klass, "getElementsByAttribute", argTypes, term3908, args);
        assertTrue(recursiveEquals(term3908, term23146));
        assertTrue(recursiveEquals(retValue, term23141));
    }

};


