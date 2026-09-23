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

public class Element_getElementsByIndexGreaterThan_364627238145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5240;
     Object term5305;
     Object term29156;
     Object term29151;

    public Element_getElementsByIndexGreaterThan_364627238145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5264 = new HashMap();
        Set<Object> term29178 =  ((Map) term5264).keySet();
        HashSet term5263 = new HashSet((Collection<? extends Object>) term29178);
        ArrayList term5276 = new ArrayList();
        ((ArrayList) term5276).add((Object)null);
        ((ArrayList) term5276).add((Object)null);
        ((ArrayList) term5276).add((Object)null);
        ((ArrayList) term5276).add((Object)null);
        ((ArrayList) term5276).add((Object)null);
        ((ArrayList) term5276).add((Object)null);
        LinkedHashMap term5281 = new LinkedHashMap();
        term5240 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term5241 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term5280 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term5241, term5241.getClass(), "tagName", "sEphiduvkv");
        setBooleanField(term5241, term5241.getClass(), "isBlock", true);
        setBooleanField(term5241, term5241.getClass(), "formatAsBlock", true);
        setBooleanField(term5241, term5241.getClass(), "canContainBlock", false);
        setBooleanField(term5241, term5241.getClass(), "canContainInline", true);
        setBooleanField(term5241, term5241.getClass(), "empty", false);
        setBooleanField(term5241, term5241.getClass(), "selfClosing", true);
        setBooleanField(term5241, term5241.getClass(), "preserveWhitespace", false);
        setBooleanField(term5241, term5241.getClass(), "formList", false);
        setBooleanField(term5241, term5241.getClass(), "formSubmit", false);
        setField(term5240, term5240.getClass(), "tag", term5241);
        setField(term5240, term5240.getClass(), "classNames", term5263);
        setField(term5240, term5240.getClass(), "parentNode", null);
        setField(term5240, term5240.getClass(), "childNodes", term5276);
        setField(term5280, term5280.getClass(), "attributes", term5281);
        setField(term5240, term5240.getClass(), "attributes", term5280);
        setField(term5240, term5240.getClass(), "baseUri", "bEmHScVZaQ");
        setIntField(term5240, term5240.getClass(), "siblingIndex", -2027534003);
        term5305 = new Integer(1063420942);
        HashMap term29161 = new HashMap();
        Set<Object> term29199 =  ((Map) term29161).keySet();
        HashSet term29160 = new HashSet((Collection<? extends Object>) term29199);
        ArrayList term29162 = new ArrayList();
        ((ArrayList) term29162).add((Object)null);
        ((ArrayList) term29162).add((Object)null);
        ((ArrayList) term29162).add((Object)null);
        ((ArrayList) term29162).add((Object)null);
        ((ArrayList) term29162).add((Object)null);
        ((ArrayList) term29162).add((Object)null);
        LinkedHashMap term29165 = new LinkedHashMap();
        term29156 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term29157 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term29164 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term29157, term29157.getClass(), "tagName", "sEphiduvkv");
        setBooleanField(term29157, term29157.getClass(), "isBlock", true);
        setBooleanField(term29157, term29157.getClass(), "formatAsBlock", true);
        setBooleanField(term29157, term29157.getClass(), "canContainBlock", false);
        setBooleanField(term29157, term29157.getClass(), "canContainInline", true);
        setBooleanField(term29157, term29157.getClass(), "empty", false);
        setBooleanField(term29157, term29157.getClass(), "selfClosing", true);
        setBooleanField(term29157, term29157.getClass(), "preserveWhitespace", false);
        setBooleanField(term29157, term29157.getClass(), "formList", false);
        setBooleanField(term29157, term29157.getClass(), "formSubmit", false);
        setField(term29156, term29156.getClass(), "tag", term29157);
        setField(term29156, term29156.getClass(), "classNames", term29160);
        setField(term29156, term29156.getClass(), "parentNode", null);
        setField(term29156, term29156.getClass(), "childNodes", term29162);
        setField(term29164, term29164.getClass(), "attributes", term29165);
        setField(term29156, term29156.getClass(), "attributes", term29164);
        setField(term29156, term29156.getClass(), "baseUri", "bEmHScVZaQ");
        setIntField(term29156, term29156.getClass(), "siblingIndex", -2027534003);
        ArrayList term29152 = new ArrayList();
        term29151 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term29151, term29151.getClass(), "contents", term29152);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5305;
        Object retValue = callMethod(klass, "getElementsByIndexGreaterThan", argTypes, term5240, args);
        assertTrue(recursiveEquals(term5240, term29156));
        assertTrue(recursiveEquals(term5305, 1063420942));
        assertTrue(recursiveEquals(retValue, term29151));
    }

};


