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
     Object term402;
     Object term18647;
     Object term18596;

    public Element_tag_153489332197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term424 = new HashMap();
        Set<Object> term18669 =  ((Map) term424).keySet();
        HashSet term423 = new HashSet((Collection<? extends Object>) term18669);
        ArrayList term434 = new ArrayList();
        ((ArrayList) term434).add((Object)null);
        ((ArrayList) term434).add((Object)null);
        ((ArrayList) term434).add((Object)null);
        ((ArrayList) term434).add((Object)null);
        ((ArrayList) term434).add((Object)null);
        ((ArrayList) term434).add((Object)null);
        LinkedHashMap term439 = new LinkedHashMap();
        term402 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term403 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term438 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term403, term403.getClass(), "tagName", "AijpHYOFuy");
        setBooleanField(term403, term403.getClass(), "isBlock", true);
        setBooleanField(term403, term403.getClass(), "formatAsBlock", true);
        setBooleanField(term403, term403.getClass(), "canContainBlock", true);
        setBooleanField(term403, term403.getClass(), "canContainInline", true);
        setBooleanField(term403, term403.getClass(), "empty", false);
        setBooleanField(term403, term403.getClass(), "selfClosing", false);
        setBooleanField(term403, term403.getClass(), "preserveWhitespace", false);
        setField(term402, term402.getClass(), "tag", term403);
        setField(term402, term402.getClass(), "classNames", term423);
        setField(term402, term402.getClass(), "parentNode", null);
        setField(term402, term402.getClass(), "childNodes", term434);
        setField(term438, term438.getClass(), "attributes", term439);
        setField(term402, term402.getClass(), "attributes", term438);
        setField(term402, term402.getClass(), "baseUri", "nyiiPDVjAc");
        setIntField(term402, term402.getClass(), "siblingIndex", 391863371);
        HashMap term18652 = new HashMap();
        Set<Object> term18690 =  ((Map) term18652).keySet();
        HashSet term18651 = new HashSet((Collection<? extends Object>) term18690);
        ArrayList term18653 = new ArrayList();
        ((ArrayList) term18653).add((Object)null);
        ((ArrayList) term18653).add((Object)null);
        ((ArrayList) term18653).add((Object)null);
        ((ArrayList) term18653).add((Object)null);
        ((ArrayList) term18653).add((Object)null);
        ((ArrayList) term18653).add((Object)null);
        LinkedHashMap term18656 = new LinkedHashMap();
        term18647 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term18648 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term18655 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term18648, term18648.getClass(), "tagName", "AijpHYOFuy");
        setBooleanField(term18648, term18648.getClass(), "isBlock", true);
        setBooleanField(term18648, term18648.getClass(), "formatAsBlock", true);
        setBooleanField(term18648, term18648.getClass(), "canContainBlock", true);
        setBooleanField(term18648, term18648.getClass(), "canContainInline", true);
        setBooleanField(term18648, term18648.getClass(), "empty", false);
        setBooleanField(term18648, term18648.getClass(), "selfClosing", false);
        setBooleanField(term18648, term18648.getClass(), "preserveWhitespace", false);
        setField(term18647, term18647.getClass(), "tag", term18648);
        setField(term18647, term18647.getClass(), "classNames", term18651);
        setField(term18647, term18647.getClass(), "parentNode", null);
        setField(term18647, term18647.getClass(), "childNodes", term18653);
        setField(term18655, term18655.getClass(), "attributes", term18656);
        setField(term18647, term18647.getClass(), "attributes", term18655);
        setField(term18647, term18647.getClass(), "baseUri", "nyiiPDVjAc");
        setIntField(term18647, term18647.getClass(), "siblingIndex", 391863371);
        term18596 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term18596, term18596.getClass(), "tagName", "AijpHYOFuy");
        setBooleanField(term18596, term18596.getClass(), "isBlock", true);
        setBooleanField(term18596, term18596.getClass(), "formatAsBlock", true);
        setBooleanField(term18596, term18596.getClass(), "canContainBlock", true);
        setBooleanField(term18596, term18596.getClass(), "canContainInline", true);
        setBooleanField(term18596, term18596.getClass(), "empty", false);
        setBooleanField(term18596, term18596.getClass(), "selfClosing", false);
        setBooleanField(term18596, term18596.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "tag", argTypes, term402, args);
        assertTrue(recursiveEquals(term402, term18647));
        assertTrue(recursiveEquals(retValue, term18596));
    }

};


