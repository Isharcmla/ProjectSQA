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

public class Element_previousElementSibling_1256357764136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2979;
     Object term21173;

    public Element_previousElementSibling_1256357764136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3001 = new ArrayList();
        ((ArrayList) term3001).add((Object)null);
        LinkedHashMap term3006 = new LinkedHashMap();
        term2979 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2980 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3005 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2980, term2980.getClass(), "tagName", "RMsXuyzKJV");
        setBooleanField(term2980, term2980.getClass(), "isBlock", false);
        setBooleanField(term2980, term2980.getClass(), "formatAsBlock", true);
        setBooleanField(term2980, term2980.getClass(), "canContainInline", false);
        setBooleanField(term2980, term2980.getClass(), "empty", true);
        setBooleanField(term2980, term2980.getClass(), "selfClosing", false);
        setBooleanField(term2980, term2980.getClass(), "preserveWhitespace", false);
        setBooleanField(term2980, term2980.getClass(), "formList", true);
        setBooleanField(term2980, term2980.getClass(), "formSubmit", false);
        setField(term2979, term2979.getClass(), "tag", term2980);
        setField(term2979, term2979.getClass(), "parentNode", null);
        setField(term2979, term2979.getClass(), "childNodes", term3001);
        setField(term3005, term3005.getClass(), "attributes", term3006);
        setField(term2979, term2979.getClass(), "attributes", term3005);
        setField(term2979, term2979.getClass(), "baseUri", "izPpKDErnQ");
        setIntField(term2979, term2979.getClass(), "siblingIndex", 679763016);
        ArrayList term21177 = new ArrayList();
        ((ArrayList) term21177).add((Object)null);
        LinkedHashMap term21180 = new LinkedHashMap();
        term21173 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term21174 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term21179 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term21174, term21174.getClass(), "tagName", "RMsXuyzKJV");
        setBooleanField(term21174, term21174.getClass(), "isBlock", false);
        setBooleanField(term21174, term21174.getClass(), "formatAsBlock", true);
        setBooleanField(term21174, term21174.getClass(), "canContainInline", false);
        setBooleanField(term21174, term21174.getClass(), "empty", true);
        setBooleanField(term21174, term21174.getClass(), "selfClosing", false);
        setBooleanField(term21174, term21174.getClass(), "preserveWhitespace", false);
        setBooleanField(term21174, term21174.getClass(), "formList", true);
        setBooleanField(term21174, term21174.getClass(), "formSubmit", false);
        setField(term21173, term21173.getClass(), "tag", term21174);
        setField(term21173, term21173.getClass(), "parentNode", null);
        setField(term21173, term21173.getClass(), "childNodes", term21177);
        setField(term21179, term21179.getClass(), "attributes", term21180);
        setField(term21173, term21173.getClass(), "attributes", term21179);
        setField(term21173, term21173.getClass(), "baseUri", "izPpKDErnQ");
        setIntField(term21173, term21173.getClass(), "siblingIndex", 679763016);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "previousElementSibling", argTypes, term2979, args);
        assertTrue(recursiveEquals(term2979, term21173));
        assertTrue(recursiveEquals(retValue, null));
    }

};


