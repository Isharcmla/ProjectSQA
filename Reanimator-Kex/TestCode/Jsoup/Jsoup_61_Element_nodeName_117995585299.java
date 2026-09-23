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
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_nodeName_117995585299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154;
     Object term8941;

    public Element_nodeName_117995585299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term176 = new ArrayList();
        ((ArrayList) term176).add((Object)null);
        ((ArrayList) term176).add((Object)null);
        ((ArrayList) term176).add((Object)null);
        ((ArrayList) term176).add((Object)null);
        ((ArrayList) term176).add((Object)null);
        LinkedHashMap term181 = new LinkedHashMap();
        term154 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term155 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term180 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term155, term155.getClass(), "tagName", "hRNSzYYIrc");
        setBooleanField(term155, term155.getClass(), "isBlock", true);
        setBooleanField(term155, term155.getClass(), "formatAsBlock", true);
        setBooleanField(term155, term155.getClass(), "canContainInline", false);
        setBooleanField(term155, term155.getClass(), "empty", false);
        setBooleanField(term155, term155.getClass(), "selfClosing", true);
        setBooleanField(term155, term155.getClass(), "preserveWhitespace", true);
        setBooleanField(term155, term155.getClass(), "formList", true);
        setBooleanField(term155, term155.getClass(), "formSubmit", true);
        setField(term154, term154.getClass(), "tag", term155);
        setField(term154, term154.getClass(), "parentNode", null);
        setField(term154, term154.getClass(), "childNodes", term176);
        setField(term180, term180.getClass(), "attributes", term181);
        setField(term154, term154.getClass(), "attributes", term180);
        setField(term154, term154.getClass(), "baseUri", "MxlszYVzRf");
        setIntField(term154, term154.getClass(), "siblingIndex", 568599855);
        ArrayList term8945 = new ArrayList();
        ((ArrayList) term8945).add((Object)null);
        ((ArrayList) term8945).add((Object)null);
        ((ArrayList) term8945).add((Object)null);
        ((ArrayList) term8945).add((Object)null);
        ((ArrayList) term8945).add((Object)null);
        LinkedHashMap term8948 = new LinkedHashMap();
        term8941 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term8942 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term8947 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term8942, term8942.getClass(), "tagName", "hRNSzYYIrc");
        setBooleanField(term8942, term8942.getClass(), "isBlock", true);
        setBooleanField(term8942, term8942.getClass(), "formatAsBlock", true);
        setBooleanField(term8942, term8942.getClass(), "canContainInline", false);
        setBooleanField(term8942, term8942.getClass(), "empty", false);
        setBooleanField(term8942, term8942.getClass(), "selfClosing", true);
        setBooleanField(term8942, term8942.getClass(), "preserveWhitespace", true);
        setBooleanField(term8942, term8942.getClass(), "formList", true);
        setBooleanField(term8942, term8942.getClass(), "formSubmit", true);
        setField(term8941, term8941.getClass(), "tag", term8942);
        setField(term8941, term8941.getClass(), "parentNode", null);
        setField(term8941, term8941.getClass(), "childNodes", term8945);
        setField(term8947, term8947.getClass(), "attributes", term8948);
        setField(term8941, term8941.getClass(), "attributes", term8947);
        setField(term8941, term8941.getClass(), "baseUri", "MxlszYVzRf");
        setIntField(term8941, term8941.getClass(), "siblingIndex", 568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "nodeName", argTypes, term154, args);
        assertTrue(recursiveEquals(term154, term8941));
        assertTrue(recursiveEquals(retValue, "hRNSzYYIrc"));
    }

};


