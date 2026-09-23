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

public class Element_tag_153489332197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term412;
     Object term9925;
     Object term9872;

    public Element_tag_153489332197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term436 = new HashMap();
        Set<Object> term9947 =  ((Map) term436).keySet();
        HashSet term435 = new HashSet((Collection<? extends Object>) term9947);
        ArrayList term446 = new ArrayList();
        ((ArrayList) term446).add((Object)null);
        ((ArrayList) term446).add((Object)null);
        ((ArrayList) term446).add((Object)null);
        ((ArrayList) term446).add((Object)null);
        ((ArrayList) term446).add((Object)null);
        ((ArrayList) term446).add((Object)null);
        LinkedHashMap term451 = new LinkedHashMap();
        term412 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term413 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term450 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term413, term413.getClass(), "tagName", "AijpHYOFuy");
        setBooleanField(term413, term413.getClass(), "isBlock", true);
        setBooleanField(term413, term413.getClass(), "formatAsBlock", true);
        setBooleanField(term413, term413.getClass(), "canContainBlock", true);
        setBooleanField(term413, term413.getClass(), "canContainInline", false);
        setBooleanField(term413, term413.getClass(), "empty", true);
        setBooleanField(term413, term413.getClass(), "selfClosing", false);
        setBooleanField(term413, term413.getClass(), "preserveWhitespace", false);
        setBooleanField(term413, term413.getClass(), "formList", true);
        setBooleanField(term413, term413.getClass(), "formSubmit", false);
        setField(term412, term412.getClass(), "tag", term413);
        setField(term412, term412.getClass(), "classNames", term435);
        setField(term412, term412.getClass(), "parentNode", null);
        setField(term412, term412.getClass(), "childNodes", term446);
        setField(term450, term450.getClass(), "attributes", term451);
        setField(term412, term412.getClass(), "attributes", term450);
        setField(term412, term412.getClass(), "baseUri", "nyiiPDVjAc");
        setIntField(term412, term412.getClass(), "siblingIndex", 391863371);
        HashMap term9930 = new HashMap();
        Set<Object> term9968 =  ((Map) term9930).keySet();
        HashSet term9929 = new HashSet((Collection<? extends Object>) term9968);
        ArrayList term9931 = new ArrayList();
        ((ArrayList) term9931).add((Object)null);
        ((ArrayList) term9931).add((Object)null);
        ((ArrayList) term9931).add((Object)null);
        ((ArrayList) term9931).add((Object)null);
        ((ArrayList) term9931).add((Object)null);
        ((ArrayList) term9931).add((Object)null);
        LinkedHashMap term9934 = new LinkedHashMap();
        term9925 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term9926 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term9933 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term9926, term9926.getClass(), "tagName", "AijpHYOFuy");
        setBooleanField(term9926, term9926.getClass(), "isBlock", true);
        setBooleanField(term9926, term9926.getClass(), "formatAsBlock", true);
        setBooleanField(term9926, term9926.getClass(), "canContainBlock", true);
        setBooleanField(term9926, term9926.getClass(), "canContainInline", false);
        setBooleanField(term9926, term9926.getClass(), "empty", true);
        setBooleanField(term9926, term9926.getClass(), "selfClosing", false);
        setBooleanField(term9926, term9926.getClass(), "preserveWhitespace", false);
        setBooleanField(term9926, term9926.getClass(), "formList", true);
        setBooleanField(term9926, term9926.getClass(), "formSubmit", false);
        setField(term9925, term9925.getClass(), "tag", term9926);
        setField(term9925, term9925.getClass(), "classNames", term9929);
        setField(term9925, term9925.getClass(), "parentNode", null);
        setField(term9925, term9925.getClass(), "childNodes", term9931);
        setField(term9933, term9933.getClass(), "attributes", term9934);
        setField(term9925, term9925.getClass(), "attributes", term9933);
        setField(term9925, term9925.getClass(), "baseUri", "nyiiPDVjAc");
        setIntField(term9925, term9925.getClass(), "siblingIndex", 391863371);
        term9872 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term9872, term9872.getClass(), "tagName", "AijpHYOFuy");
        setBooleanField(term9872, term9872.getClass(), "isBlock", true);
        setBooleanField(term9872, term9872.getClass(), "formatAsBlock", true);
        setBooleanField(term9872, term9872.getClass(), "canContainBlock", true);
        setBooleanField(term9872, term9872.getClass(), "canContainInline", false);
        setBooleanField(term9872, term9872.getClass(), "empty", true);
        setBooleanField(term9872, term9872.getClass(), "selfClosing", false);
        setBooleanField(term9872, term9872.getClass(), "preserveWhitespace", false);
        setBooleanField(term9872, term9872.getClass(), "formList", true);
        setBooleanField(term9872, term9872.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "tag", argTypes, term412, args);
        assertTrue(recursiveEquals(term412, term9925));
        assertTrue(recursiveEquals(retValue, term9872));
    }

};


