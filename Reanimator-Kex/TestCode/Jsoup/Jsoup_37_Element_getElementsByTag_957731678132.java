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

public class Element_getElementsByTag_957731678132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3586;
     Object term21592;
     Object term21587;

    public Element_getElementsByTag_957731678132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3610 = new HashMap();
        Set<Object> term21616 =  ((Map) term3610).keySet();
        HashSet term3609 = new HashSet((Collection<? extends Object>) term21616);
        ArrayList term3628 = new ArrayList();
        ((ArrayList) term3628).add((Object)null);
        ((ArrayList) term3628).add((Object)null);
        ((ArrayList) term3628).add((Object)null);
        ((ArrayList) term3628).add((Object)null);
        ((ArrayList) term3628).add((Object)null);
        ((ArrayList) term3628).add((Object)null);
        ((ArrayList) term3628).add((Object)null);
        ((ArrayList) term3628).add((Object)null);
        LinkedHashMap term3633 = new LinkedHashMap();
        term3586 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3587 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3632 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3587, term3587.getClass(), "tagName", "KarbTXFmUU");
        setBooleanField(term3587, term3587.getClass(), "isBlock", false);
        setBooleanField(term3587, term3587.getClass(), "formatAsBlock", true);
        setBooleanField(term3587, term3587.getClass(), "canContainBlock", true);
        setBooleanField(term3587, term3587.getClass(), "canContainInline", true);
        setBooleanField(term3587, term3587.getClass(), "empty", false);
        setBooleanField(term3587, term3587.getClass(), "selfClosing", true);
        setBooleanField(term3587, term3587.getClass(), "preserveWhitespace", true);
        setBooleanField(term3587, term3587.getClass(), "formList", false);
        setBooleanField(term3587, term3587.getClass(), "formSubmit", true);
        setField(term3586, term3586.getClass(), "tag", term3587);
        setField(term3586, term3586.getClass(), "classNames", term3609);
        setField(term3586, term3586.getClass(), "parentNode", null);
        setField(term3586, term3586.getClass(), "childNodes", term3628);
        setField(term3632, term3632.getClass(), "attributes", term3633);
        setField(term3586, term3586.getClass(), "attributes", term3632);
        setField(term3586, term3586.getClass(), "baseUri", "OUeBWNTQDh");
        setIntField(term3586, term3586.getClass(), "siblingIndex", 1962444399);
        HashMap term21597 = new HashMap();
        Set<Object> term21647 =  ((Map) term21597).keySet();
        HashSet term21596 = new HashSet((Collection<? extends Object>) term21647);
        ArrayList term21598 = new ArrayList();
        ((ArrayList) term21598).add((Object)null);
        ((ArrayList) term21598).add((Object)null);
        ((ArrayList) term21598).add((Object)null);
        ((ArrayList) term21598).add((Object)null);
        ((ArrayList) term21598).add((Object)null);
        ((ArrayList) term21598).add((Object)null);
        ((ArrayList) term21598).add((Object)null);
        ((ArrayList) term21598).add((Object)null);
        LinkedHashMap term21601 = new LinkedHashMap();
        term21592 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term21593 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term21600 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term21593, term21593.getClass(), "tagName", "KarbTXFmUU");
        setBooleanField(term21593, term21593.getClass(), "isBlock", false);
        setBooleanField(term21593, term21593.getClass(), "formatAsBlock", true);
        setBooleanField(term21593, term21593.getClass(), "canContainBlock", true);
        setBooleanField(term21593, term21593.getClass(), "canContainInline", true);
        setBooleanField(term21593, term21593.getClass(), "empty", false);
        setBooleanField(term21593, term21593.getClass(), "selfClosing", true);
        setBooleanField(term21593, term21593.getClass(), "preserveWhitespace", true);
        setBooleanField(term21593, term21593.getClass(), "formList", false);
        setBooleanField(term21593, term21593.getClass(), "formSubmit", true);
        setField(term21592, term21592.getClass(), "tag", term21593);
        setField(term21592, term21592.getClass(), "classNames", term21596);
        setField(term21592, term21592.getClass(), "parentNode", null);
        setField(term21592, term21592.getClass(), "childNodes", term21598);
        setField(term21600, term21600.getClass(), "attributes", term21601);
        setField(term21592, term21592.getClass(), "attributes", term21600);
        setField(term21592, term21592.getClass(), "baseUri", "OUeBWNTQDh");
        setIntField(term21592, term21592.getClass(), "siblingIndex", 1962444399);
        ArrayList term21588 = new ArrayList();
        term21587 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term21587, term21587.getClass(), "contents", term21588);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "gltJarNuUk";
        Object retValue = callMethod(klass, "getElementsByTag", argTypes, term3586, args);
        assertTrue(recursiveEquals(term3586, term21592));
        assertTrue(recursiveEquals(retValue, term21587));
    }

};


