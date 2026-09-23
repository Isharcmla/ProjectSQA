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
import java.lang.Integer;

public class Element_elementSiblingIndex_1190944464138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3121;
     Object term21616;
     Object term21614;

    public Element_elementSiblingIndex_1190944464138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3143 = new ArrayList();
        ((ArrayList) term3143).add((Object)null);
        ((ArrayList) term3143).add((Object)null);
        ((ArrayList) term3143).add((Object)null);
        ((ArrayList) term3143).add((Object)null);
        ((ArrayList) term3143).add((Object)null);
        ((ArrayList) term3143).add((Object)null);
        ((ArrayList) term3143).add((Object)null);
        ((ArrayList) term3143).add((Object)null);
        ((ArrayList) term3143).add((Object)null);
        LinkedHashMap term3148 = new LinkedHashMap();
        term3121 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3122 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3147 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3122, term3122.getClass(), "tagName", "CFyoseFGLF");
        setBooleanField(term3122, term3122.getClass(), "isBlock", true);
        setBooleanField(term3122, term3122.getClass(), "formatAsBlock", false);
        setBooleanField(term3122, term3122.getClass(), "canContainInline", true);
        setBooleanField(term3122, term3122.getClass(), "empty", true);
        setBooleanField(term3122, term3122.getClass(), "selfClosing", false);
        setBooleanField(term3122, term3122.getClass(), "preserveWhitespace", true);
        setBooleanField(term3122, term3122.getClass(), "formList", false);
        setBooleanField(term3122, term3122.getClass(), "formSubmit", true);
        setField(term3121, term3121.getClass(), "tag", term3122);
        setField(term3121, term3121.getClass(), "parentNode", null);
        setField(term3121, term3121.getClass(), "childNodes", term3143);
        setField(term3147, term3147.getClass(), "attributes", term3148);
        setField(term3121, term3121.getClass(), "attributes", term3147);
        setField(term3121, term3121.getClass(), "baseUri", "WXMWFDGcLB");
        setIntField(term3121, term3121.getClass(), "siblingIndex", 767834723);
        ArrayList term21620 = new ArrayList();
        ((ArrayList) term21620).add((Object)null);
        ((ArrayList) term21620).add((Object)null);
        ((ArrayList) term21620).add((Object)null);
        ((ArrayList) term21620).add((Object)null);
        ((ArrayList) term21620).add((Object)null);
        ((ArrayList) term21620).add((Object)null);
        ((ArrayList) term21620).add((Object)null);
        ((ArrayList) term21620).add((Object)null);
        ((ArrayList) term21620).add((Object)null);
        LinkedHashMap term21623 = new LinkedHashMap();
        term21616 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term21617 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term21622 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term21617, term21617.getClass(), "tagName", "CFyoseFGLF");
        setBooleanField(term21617, term21617.getClass(), "isBlock", true);
        setBooleanField(term21617, term21617.getClass(), "formatAsBlock", false);
        setBooleanField(term21617, term21617.getClass(), "canContainInline", true);
        setBooleanField(term21617, term21617.getClass(), "empty", true);
        setBooleanField(term21617, term21617.getClass(), "selfClosing", false);
        setBooleanField(term21617, term21617.getClass(), "preserveWhitespace", true);
        setBooleanField(term21617, term21617.getClass(), "formList", false);
        setBooleanField(term21617, term21617.getClass(), "formSubmit", true);
        setField(term21616, term21616.getClass(), "tag", term21617);
        setField(term21616, term21616.getClass(), "parentNode", null);
        setField(term21616, term21616.getClass(), "childNodes", term21620);
        setField(term21622, term21622.getClass(), "attributes", term21623);
        setField(term21616, term21616.getClass(), "attributes", term21622);
        setField(term21616, term21616.getClass(), "baseUri", "WXMWFDGcLB");
        setIntField(term21616, term21616.getClass(), "siblingIndex", 767834723);
        term21614 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "elementSiblingIndex", argTypes, term3121, args);
        assertTrue(recursiveEquals(term3121, term21616));
        assertTrue(recursiveEquals(retValue, term21614));
    }

};


