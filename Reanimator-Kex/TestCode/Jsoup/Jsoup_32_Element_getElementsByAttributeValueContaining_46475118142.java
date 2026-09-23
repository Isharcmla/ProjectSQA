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

public class Element_getElementsByAttributeValueContaining_46475118142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4567;
     Object term26570;
     Object term26565;

    public Element_getElementsByAttributeValueContaining_46475118142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4589 = new HashMap();
        Set<Object> term26596 =  ((Map) term4589).keySet();
        HashSet term4588 = new HashSet((Collection<? extends Object>) term26596);
        ArrayList term4609 = new ArrayList();
        ((ArrayList) term4609).add((Object)null);
        ((ArrayList) term4609).add((Object)null);
        ((ArrayList) term4609).add((Object)null);
        ((ArrayList) term4609).add((Object)null);
        ((ArrayList) term4609).add((Object)null);
        LinkedHashMap term4614 = new LinkedHashMap();
        term4567 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term4568 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term4613 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term4568, term4568.getClass(), "tagName", "goAoCMhKBu");
        setBooleanField(term4568, term4568.getClass(), "isBlock", true);
        setBooleanField(term4568, term4568.getClass(), "formatAsBlock", true);
        setBooleanField(term4568, term4568.getClass(), "canContainBlock", false);
        setBooleanField(term4568, term4568.getClass(), "canContainInline", true);
        setBooleanField(term4568, term4568.getClass(), "empty", true);
        setBooleanField(term4568, term4568.getClass(), "selfClosing", true);
        setBooleanField(term4568, term4568.getClass(), "preserveWhitespace", false);
        setField(term4567, term4567.getClass(), "tag", term4568);
        setField(term4567, term4567.getClass(), "classNames", term4588);
        setField(term4567, term4567.getClass(), "parentNode", null);
        setField(term4567, term4567.getClass(), "childNodes", term4609);
        setField(term4613, term4613.getClass(), "attributes", term4614);
        setField(term4567, term4567.getClass(), "attributes", term4613);
        setField(term4567, term4567.getClass(), "baseUri", "GeddnXjHGy");
        setIntField(term4567, term4567.getClass(), "siblingIndex", -14890619);
        HashMap term26575 = new HashMap();
        Set<Object> term26637 =  ((Map) term26575).keySet();
        HashSet term26574 = new HashSet((Collection<? extends Object>) term26637);
        ArrayList term26576 = new ArrayList();
        ((ArrayList) term26576).add((Object)null);
        ((ArrayList) term26576).add((Object)null);
        ((ArrayList) term26576).add((Object)null);
        ((ArrayList) term26576).add((Object)null);
        ((ArrayList) term26576).add((Object)null);
        LinkedHashMap term26579 = new LinkedHashMap();
        term26570 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term26571 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term26578 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term26571, term26571.getClass(), "tagName", "goAoCMhKBu");
        setBooleanField(term26571, term26571.getClass(), "isBlock", true);
        setBooleanField(term26571, term26571.getClass(), "formatAsBlock", true);
        setBooleanField(term26571, term26571.getClass(), "canContainBlock", false);
        setBooleanField(term26571, term26571.getClass(), "canContainInline", true);
        setBooleanField(term26571, term26571.getClass(), "empty", true);
        setBooleanField(term26571, term26571.getClass(), "selfClosing", true);
        setBooleanField(term26571, term26571.getClass(), "preserveWhitespace", false);
        setField(term26570, term26570.getClass(), "tag", term26571);
        setField(term26570, term26570.getClass(), "classNames", term26574);
        setField(term26570, term26570.getClass(), "parentNode", null);
        setField(term26570, term26570.getClass(), "childNodes", term26576);
        setField(term26578, term26578.getClass(), "attributes", term26579);
        setField(term26570, term26570.getClass(), "attributes", term26578);
        setField(term26570, term26570.getClass(), "baseUri", "GeddnXjHGy");
        setIntField(term26570, term26570.getClass(), "siblingIndex", -14890619);
        ArrayList term26566 = new ArrayList();
        term26565 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term26565, term26565.getClass(), "contents", term26566);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "vLTbaoAxBm";
        args[1] = "BXTjEyEZxD";
        Object retValue = callMethod(klass, "getElementsByAttributeValueContaining", argTypes, term4567, args);
        assertTrue(recursiveEquals(term4567, term26570));
        assertTrue(recursiveEquals(retValue, term26565));
    }

};


