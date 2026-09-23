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
import java.lang.Integer;

public class Element_getElementsByIndexLessThan_751556693144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5150;
     Object term5217;
     Object term28780;
     Object term28775;

    public Element_getElementsByIndexLessThan_751556693144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5174 = new HashMap();
        Set<Object> term28796 =  ((Map) term5174).keySet();
        HashSet term5173 = new HashSet((Collection<? extends Object>) term28796);
        ArrayList term5188 = new ArrayList();
        ((ArrayList) term5188).add((Object)null);
        ((ArrayList) term5188).add((Object)null);
        ((ArrayList) term5188).add((Object)null);
        ((ArrayList) term5188).add((Object)null);
        ((ArrayList) term5188).add((Object)null);
        ((ArrayList) term5188).add((Object)null);
        LinkedHashMap term5193 = new LinkedHashMap();
        term5150 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term5151 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term5192 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term5151, term5151.getClass(), "tagName", "CAMnvfDLJL");
        setBooleanField(term5151, term5151.getClass(), "isBlock", false);
        setBooleanField(term5151, term5151.getClass(), "formatAsBlock", true);
        setBooleanField(term5151, term5151.getClass(), "canContainBlock", false);
        setBooleanField(term5151, term5151.getClass(), "canContainInline", false);
        setBooleanField(term5151, term5151.getClass(), "empty", true);
        setBooleanField(term5151, term5151.getClass(), "selfClosing", true);
        setBooleanField(term5151, term5151.getClass(), "preserveWhitespace", true);
        setBooleanField(term5151, term5151.getClass(), "formList", false);
        setBooleanField(term5151, term5151.getClass(), "formSubmit", false);
        setField(term5150, term5150.getClass(), "tag", term5151);
        setField(term5150, term5150.getClass(), "classNames", term5173);
        setField(term5150, term5150.getClass(), "parentNode", null);
        setField(term5150, term5150.getClass(), "childNodes", term5188);
        setField(term5192, term5192.getClass(), "attributes", term5193);
        setField(term5150, term5150.getClass(), "attributes", term5192);
        setField(term5150, term5150.getClass(), "baseUri", "bHHjfDCntT");
        setIntField(term5150, term5150.getClass(), "siblingIndex", 335112684);
        term5217 = new Integer(1551099402);
        HashSet term28782 = new HashSet();
        ArrayList term28783 = new ArrayList();
        ((ArrayList) term28783).add((Object)null);
        ((ArrayList) term28783).add((Object)null);
        ((ArrayList) term28783).add((Object)null);
        ((ArrayList) term28783).add((Object)null);
        ((ArrayList) term28783).add((Object)null);
        ((ArrayList) term28783).add((Object)null);
        term28780 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term28781 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term28784 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term28781, term28781.getClass(), "tagName", null);
        setBooleanField(term28781, term28781.getClass(), "isBlock", false);
        setBooleanField(term28781, term28781.getClass(), "formatAsBlock", true);
        setBooleanField(term28781, term28781.getClass(), "canContainBlock", false);
        setBooleanField(term28781, term28781.getClass(), "canContainInline", false);
        setBooleanField(term28781, term28781.getClass(), "empty", true);
        setBooleanField(term28781, term28781.getClass(), "selfClosing", true);
        setBooleanField(term28781, term28781.getClass(), "preserveWhitespace", true);
        setBooleanField(term28781, term28781.getClass(), "formList", false);
        setBooleanField(term28781, term28781.getClass(), "formSubmit", false);
        setField(term28780, term28780.getClass(), "tag", term28781);
        setField(term28780, term28780.getClass(), "classNames", term28782);
        setField(term28780, term28780.getClass(), "parentNode", null);
        setField(term28780, term28780.getClass(), "childNodes", term28783);
        setField(term28784, term28784.getClass(), "attributes", null);
        setField(term28780, term28780.getClass(), "attributes", term28784);
        setField(term28780, term28780.getClass(), "baseUri", "");
        setIntField(term28780, term28780.getClass(), "siblingIndex", 335112684);
        HashSet term28511 = new HashSet();
        ArrayList term28512 = new ArrayList();
        ((ArrayList) term28512).add((Object)null);
        ((ArrayList) term28512).add((Object)null);
        ((ArrayList) term28512).add((Object)null);
        ((ArrayList) term28512).add((Object)null);
        ((ArrayList) term28512).add((Object)null);
        ((ArrayList) term28512).add((Object)null);
        Object term28500 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term28501 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term28515 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term28501, term28501.getClass(), "tagName", null);
        setBooleanField(term28501, term28501.getClass(), "isBlock", false);
        setBooleanField(term28501, term28501.getClass(), "formatAsBlock", true);
        setBooleanField(term28501, term28501.getClass(), "canContainBlock", false);
        setBooleanField(term28501, term28501.getClass(), "canContainInline", false);
        setBooleanField(term28501, term28501.getClass(), "empty", true);
        setBooleanField(term28501, term28501.getClass(), "selfClosing", true);
        setBooleanField(term28501, term28501.getClass(), "preserveWhitespace", true);
        setBooleanField(term28501, term28501.getClass(), "formList", false);
        setBooleanField(term28501, term28501.getClass(), "formSubmit", false);
        setField(term28500, term28500.getClass(), "tag", term28501);
        setField(term28500, term28500.getClass(), "classNames", term28511);
        setField(term28500, term28500.getClass(), "parentNode", null);
        setField(term28500, term28500.getClass(), "childNodes", term28512);
        setField(term28515, term28515.getClass(), "attributes", null);
        setField(term28500, term28500.getClass(), "attributes", term28515);
        setField(term28500, term28500.getClass(), "baseUri", "");
        setIntField(term28500, term28500.getClass(), "siblingIndex", 335112684);
        ArrayList term28776 = new ArrayList();
        ((ArrayList) term28776).add(term28500);
        term28775 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term28775, term28775.getClass(), "contents", term28776);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5217;
        Object retValue = callMethod(klass, "getElementsByIndexLessThan", argTypes, term5150, args);
        assertTrue(recursiveEquals(term5150, term28780));
        assertTrue(recursiveEquals(term5217, 1551099402));
        assertTrue(recursiveEquals(retValue, term28775));
    }

};


