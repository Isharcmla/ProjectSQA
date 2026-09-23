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

public class Element_getElementsByIndexLessThan_751556693145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5050;
     Object term5115;
     Object term28632;
     Object term28627;

    public Element_getElementsByIndexLessThan_751556693145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5072 = new HashMap();
        Set<Object> term28648 =  ((Map) term5072).keySet();
        HashSet term5071 = new HashSet((Collection<? extends Object>) term28648);
        ArrayList term5086 = new ArrayList();
        ((ArrayList) term5086).add((Object)null);
        ((ArrayList) term5086).add((Object)null);
        ((ArrayList) term5086).add((Object)null);
        ((ArrayList) term5086).add((Object)null);
        ((ArrayList) term5086).add((Object)null);
        ((ArrayList) term5086).add((Object)null);
        LinkedHashMap term5091 = new LinkedHashMap();
        term5050 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term5051 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term5090 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term5051, term5051.getClass(), "tagName", "CAMnvfDLJL");
        setBooleanField(term5051, term5051.getClass(), "isBlock", false);
        setBooleanField(term5051, term5051.getClass(), "formatAsBlock", true);
        setBooleanField(term5051, term5051.getClass(), "canContainBlock", false);
        setBooleanField(term5051, term5051.getClass(), "canContainInline", true);
        setBooleanField(term5051, term5051.getClass(), "empty", false);
        setBooleanField(term5051, term5051.getClass(), "selfClosing", false);
        setBooleanField(term5051, term5051.getClass(), "preserveWhitespace", true);
        setField(term5050, term5050.getClass(), "tag", term5051);
        setField(term5050, term5050.getClass(), "classNames", term5071);
        setField(term5050, term5050.getClass(), "parentNode", null);
        setField(term5050, term5050.getClass(), "childNodes", term5086);
        setField(term5090, term5090.getClass(), "attributes", term5091);
        setField(term5050, term5050.getClass(), "attributes", term5090);
        setField(term5050, term5050.getClass(), "baseUri", "bHHjfDCntT");
        setIntField(term5050, term5050.getClass(), "siblingIndex", 335112684);
        term5115 = new Integer(1551099402);
        HashSet term28634 = new HashSet();
        ArrayList term28635 = new ArrayList();
        ((ArrayList) term28635).add((Object)null);
        ((ArrayList) term28635).add((Object)null);
        ((ArrayList) term28635).add((Object)null);
        ((ArrayList) term28635).add((Object)null);
        ((ArrayList) term28635).add((Object)null);
        ((ArrayList) term28635).add((Object)null);
        term28632 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term28633 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term28636 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term28633, term28633.getClass(), "tagName", null);
        setBooleanField(term28633, term28633.getClass(), "isBlock", false);
        setBooleanField(term28633, term28633.getClass(), "formatAsBlock", true);
        setBooleanField(term28633, term28633.getClass(), "canContainBlock", false);
        setBooleanField(term28633, term28633.getClass(), "canContainInline", true);
        setBooleanField(term28633, term28633.getClass(), "empty", false);
        setBooleanField(term28633, term28633.getClass(), "selfClosing", false);
        setBooleanField(term28633, term28633.getClass(), "preserveWhitespace", true);
        setField(term28632, term28632.getClass(), "tag", term28633);
        setField(term28632, term28632.getClass(), "classNames", term28634);
        setField(term28632, term28632.getClass(), "parentNode", null);
        setField(term28632, term28632.getClass(), "childNodes", term28635);
        setField(term28636, term28636.getClass(), "attributes", null);
        setField(term28632, term28632.getClass(), "attributes", term28636);
        setField(term28632, term28632.getClass(), "baseUri", "");
        setIntField(term28632, term28632.getClass(), "siblingIndex", 335112684);
        HashSet term28373 = new HashSet();
        ArrayList term28374 = new ArrayList();
        ((ArrayList) term28374).add((Object)null);
        ((ArrayList) term28374).add((Object)null);
        ((ArrayList) term28374).add((Object)null);
        ((ArrayList) term28374).add((Object)null);
        ((ArrayList) term28374).add((Object)null);
        ((ArrayList) term28374).add((Object)null);
        Object term28364 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term28365 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term28377 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term28365, term28365.getClass(), "tagName", null);
        setBooleanField(term28365, term28365.getClass(), "isBlock", false);
        setBooleanField(term28365, term28365.getClass(), "formatAsBlock", true);
        setBooleanField(term28365, term28365.getClass(), "canContainBlock", false);
        setBooleanField(term28365, term28365.getClass(), "canContainInline", true);
        setBooleanField(term28365, term28365.getClass(), "empty", false);
        setBooleanField(term28365, term28365.getClass(), "selfClosing", false);
        setBooleanField(term28365, term28365.getClass(), "preserveWhitespace", true);
        setField(term28364, term28364.getClass(), "tag", term28365);
        setField(term28364, term28364.getClass(), "classNames", term28373);
        setField(term28364, term28364.getClass(), "parentNode", null);
        setField(term28364, term28364.getClass(), "childNodes", term28374);
        setField(term28377, term28377.getClass(), "attributes", null);
        setField(term28364, term28364.getClass(), "attributes", term28377);
        setField(term28364, term28364.getClass(), "baseUri", "");
        setIntField(term28364, term28364.getClass(), "siblingIndex", 335112684);
        ArrayList term28628 = new ArrayList();
        ((ArrayList) term28628).add(term28364);
        term28627 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term28627, term28627.getClass(), "contents", term28628);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5115;
        Object retValue = callMethod(klass, "getElementsByIndexLessThan", argTypes, term5050, args);
        assertTrue(recursiveEquals(term5050, term28632));
        assertTrue(recursiveEquals(term5115, 1551099402));
        assertTrue(recursiveEquals(retValue, term28627));
    }

};


