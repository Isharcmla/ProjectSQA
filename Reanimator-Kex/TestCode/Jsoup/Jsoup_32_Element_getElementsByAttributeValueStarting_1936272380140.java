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

public class Element_getElementsByAttributeValueStarting_1936272380140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4305;
     Object term25372;
     Object term25367;

    public Element_getElementsByAttributeValueStarting_1936272380140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4327 = new HashMap();
        Set<Object> term25398 =  ((Map) term4327).keySet();
        HashSet term4326 = new HashSet((Collection<? extends Object>) term25398);
        ArrayList term4345 = new ArrayList();
        ((ArrayList) term4345).add((Object)null);
        ((ArrayList) term4345).add((Object)null);
        ((ArrayList) term4345).add((Object)null);
        ((ArrayList) term4345).add((Object)null);
        ((ArrayList) term4345).add((Object)null);
        ((ArrayList) term4345).add((Object)null);
        ((ArrayList) term4345).add((Object)null);
        LinkedHashMap term4350 = new LinkedHashMap();
        term4305 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term4306 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term4349 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term4306, term4306.getClass(), "tagName", "QITgiBrmfj");
        setBooleanField(term4306, term4306.getClass(), "isBlock", true);
        setBooleanField(term4306, term4306.getClass(), "formatAsBlock", false);
        setBooleanField(term4306, term4306.getClass(), "canContainBlock", true);
        setBooleanField(term4306, term4306.getClass(), "canContainInline", true);
        setBooleanField(term4306, term4306.getClass(), "empty", false);
        setBooleanField(term4306, term4306.getClass(), "selfClosing", true);
        setBooleanField(term4306, term4306.getClass(), "preserveWhitespace", false);
        setField(term4305, term4305.getClass(), "tag", term4306);
        setField(term4305, term4305.getClass(), "classNames", term4326);
        setField(term4305, term4305.getClass(), "parentNode", null);
        setField(term4305, term4305.getClass(), "childNodes", term4345);
        setField(term4349, term4349.getClass(), "attributes", term4350);
        setField(term4305, term4305.getClass(), "attributes", term4349);
        setField(term4305, term4305.getClass(), "baseUri", "RjNoEywJbC");
        setIntField(term4305, term4305.getClass(), "siblingIndex", -1968847291);
        HashMap term25377 = new HashMap();
        Set<Object> term25439 =  ((Map) term25377).keySet();
        HashSet term25376 = new HashSet((Collection<? extends Object>) term25439);
        ArrayList term25378 = new ArrayList();
        ((ArrayList) term25378).add((Object)null);
        ((ArrayList) term25378).add((Object)null);
        ((ArrayList) term25378).add((Object)null);
        ((ArrayList) term25378).add((Object)null);
        ((ArrayList) term25378).add((Object)null);
        ((ArrayList) term25378).add((Object)null);
        ((ArrayList) term25378).add((Object)null);
        LinkedHashMap term25381 = new LinkedHashMap();
        term25372 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term25373 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term25380 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term25373, term25373.getClass(), "tagName", "QITgiBrmfj");
        setBooleanField(term25373, term25373.getClass(), "isBlock", true);
        setBooleanField(term25373, term25373.getClass(), "formatAsBlock", false);
        setBooleanField(term25373, term25373.getClass(), "canContainBlock", true);
        setBooleanField(term25373, term25373.getClass(), "canContainInline", true);
        setBooleanField(term25373, term25373.getClass(), "empty", false);
        setBooleanField(term25373, term25373.getClass(), "selfClosing", true);
        setBooleanField(term25373, term25373.getClass(), "preserveWhitespace", false);
        setField(term25372, term25372.getClass(), "tag", term25373);
        setField(term25372, term25372.getClass(), "classNames", term25376);
        setField(term25372, term25372.getClass(), "parentNode", null);
        setField(term25372, term25372.getClass(), "childNodes", term25378);
        setField(term25380, term25380.getClass(), "attributes", term25381);
        setField(term25372, term25372.getClass(), "attributes", term25380);
        setField(term25372, term25372.getClass(), "baseUri", "RjNoEywJbC");
        setIntField(term25372, term25372.getClass(), "siblingIndex", -1968847291);
        ArrayList term25368 = new ArrayList();
        term25367 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term25367, term25367.getClass(), "contents", term25368);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "RTTvrwwhou";
        args[1] = "lRORwXipuk";
        Object retValue = callMethod(klass, "getElementsByAttributeValueStarting", argTypes, term4305, args);
        assertTrue(recursiveEquals(term4305, term25372));
        assertTrue(recursiveEquals(retValue, term25367));
    }

};


