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

public class Element_tagName_57694054396 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term308;
     Object term9775;
     Object term9722;

    public Element_tagName_57694054396() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term332 = new HashMap();
        Set<Object> term9799 =  ((Map) term332).keySet();
        HashSet term331 = new HashSet((Collection<? extends Object>) term9799);
        ArrayList term340 = new ArrayList();
        ((ArrayList) term340).add((Object)null);
        ((ArrayList) term340).add((Object)null);
        ((ArrayList) term340).add((Object)null);
        ((ArrayList) term340).add((Object)null);
        ((ArrayList) term340).add((Object)null);
        ((ArrayList) term340).add((Object)null);
        LinkedHashMap term345 = new LinkedHashMap();
        term308 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term309 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term344 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term309, term309.getClass(), "tagName", "vrQLuWIDJX");
        setBooleanField(term309, term309.getClass(), "isBlock", true);
        setBooleanField(term309, term309.getClass(), "formatAsBlock", true);
        setBooleanField(term309, term309.getClass(), "canContainBlock", true);
        setBooleanField(term309, term309.getClass(), "canContainInline", false);
        setBooleanField(term309, term309.getClass(), "empty", false);
        setBooleanField(term309, term309.getClass(), "selfClosing", false);
        setBooleanField(term309, term309.getClass(), "preserveWhitespace", true);
        setBooleanField(term309, term309.getClass(), "formList", true);
        setBooleanField(term309, term309.getClass(), "formSubmit", false);
        setField(term308, term308.getClass(), "tag", term309);
        setField(term308, term308.getClass(), "classNames", term331);
        setField(term308, term308.getClass(), "parentNode", null);
        setField(term308, term308.getClass(), "childNodes", term340);
        setField(term344, term344.getClass(), "attributes", term345);
        setField(term308, term308.getClass(), "attributes", term344);
        setField(term308, term308.getClass(), "baseUri", "OWDIEULEFu");
        setIntField(term308, term308.getClass(), "siblingIndex", 1484323161);
        HashMap term9780 = new HashMap();
        Set<Object> term9830 =  ((Map) term9780).keySet();
        HashSet term9779 = new HashSet((Collection<? extends Object>) term9830);
        ArrayList term9781 = new ArrayList();
        ((ArrayList) term9781).add((Object)null);
        ((ArrayList) term9781).add((Object)null);
        ((ArrayList) term9781).add((Object)null);
        ((ArrayList) term9781).add((Object)null);
        ((ArrayList) term9781).add((Object)null);
        ((ArrayList) term9781).add((Object)null);
        LinkedHashMap term9784 = new LinkedHashMap();
        term9775 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term9776 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term9783 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term9776, term9776.getClass(), "tagName", "dwrymulbtr");
        setBooleanField(term9776, term9776.getClass(), "isBlock", false);
        setBooleanField(term9776, term9776.getClass(), "formatAsBlock", true);
        setBooleanField(term9776, term9776.getClass(), "canContainBlock", true);
        setBooleanField(term9776, term9776.getClass(), "canContainInline", true);
        setBooleanField(term9776, term9776.getClass(), "empty", false);
        setBooleanField(term9776, term9776.getClass(), "selfClosing", false);
        setBooleanField(term9776, term9776.getClass(), "preserveWhitespace", false);
        setBooleanField(term9776, term9776.getClass(), "formList", false);
        setBooleanField(term9776, term9776.getClass(), "formSubmit", false);
        setField(term9775, term9775.getClass(), "tag", term9776);
        setField(term9775, term9775.getClass(), "classNames", term9779);
        setField(term9775, term9775.getClass(), "parentNode", null);
        setField(term9775, term9775.getClass(), "childNodes", term9781);
        setField(term9783, term9783.getClass(), "attributes", term9784);
        setField(term9775, term9775.getClass(), "attributes", term9783);
        setField(term9775, term9775.getClass(), "baseUri", "OWDIEULEFu");
        setIntField(term9775, term9775.getClass(), "siblingIndex", 1484323161);
        HashMap term9746 = new HashMap();
        Set<Object> term9861 =  ((Map) term9746).keySet();
        HashSet term9745 = new HashSet((Collection<? extends Object>) term9861);
        ArrayList term9751 = new ArrayList();
        ((ArrayList) term9751).add((Object)null);
        ((ArrayList) term9751).add((Object)null);
        ((ArrayList) term9751).add((Object)null);
        ((ArrayList) term9751).add((Object)null);
        ((ArrayList) term9751).add((Object)null);
        ((ArrayList) term9751).add((Object)null);
        LinkedHashMap term9756 = new LinkedHashMap();
        term9722 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term9723 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term9755 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term9723, term9723.getClass(), "tagName", "dwrymulbtr");
        setBooleanField(term9723, term9723.getClass(), "isBlock", false);
        setBooleanField(term9723, term9723.getClass(), "formatAsBlock", true);
        setBooleanField(term9723, term9723.getClass(), "canContainBlock", true);
        setBooleanField(term9723, term9723.getClass(), "canContainInline", true);
        setBooleanField(term9723, term9723.getClass(), "empty", false);
        setBooleanField(term9723, term9723.getClass(), "selfClosing", false);
        setBooleanField(term9723, term9723.getClass(), "preserveWhitespace", false);
        setBooleanField(term9723, term9723.getClass(), "formList", false);
        setBooleanField(term9723, term9723.getClass(), "formSubmit", false);
        setField(term9722, term9722.getClass(), "tag", term9723);
        setField(term9722, term9722.getClass(), "classNames", term9745);
        setField(term9722, term9722.getClass(), "parentNode", null);
        setField(term9722, term9722.getClass(), "childNodes", term9751);
        setField(term9755, term9755.getClass(), "attributes", term9756);
        setField(term9722, term9722.getClass(), "attributes", term9755);
        setField(term9722, term9722.getClass(), "baseUri", "OWDIEULEFu");
        setIntField(term9722, term9722.getClass(), "siblingIndex", 1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "dWRymuLBtr";
        Object retValue = callMethod(klass, "tagName", argTypes, term308, args);
        assertTrue(recursiveEquals(term308, term9775));
        assertTrue(recursiveEquals(retValue, term9722));
    }

};


