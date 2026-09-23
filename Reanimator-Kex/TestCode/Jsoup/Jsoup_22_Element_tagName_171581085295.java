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

public class Element_tagName_171581085295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term216;
     Object term18285;

    public Element_tagName_171581085295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term238 = new HashMap();
        Set<Object> term18307 =  ((Map) term238).keySet();
        HashSet term237 = new HashSet((Collection<? extends Object>) term18307);
        ArrayList term250 = new ArrayList();
        ((ArrayList) term250).add((Object)null);
        ((ArrayList) term250).add((Object)null);
        ((ArrayList) term250).add((Object)null);
        ((ArrayList) term250).add((Object)null);
        LinkedHashMap term255 = new LinkedHashMap();
        term216 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term217 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term254 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term217, term217.getClass(), "tagName", "tbcdzjIfER");
        setBooleanField(term217, term217.getClass(), "isBlock", true);
        setBooleanField(term217, term217.getClass(), "formatAsBlock", true);
        setBooleanField(term217, term217.getClass(), "canContainBlock", true);
        setBooleanField(term217, term217.getClass(), "canContainInline", true);
        setBooleanField(term217, term217.getClass(), "empty", false);
        setBooleanField(term217, term217.getClass(), "selfClosing", false);
        setBooleanField(term217, term217.getClass(), "preserveWhitespace", false);
        setField(term216, term216.getClass(), "tag", term217);
        setField(term216, term216.getClass(), "classNames", term237);
        setField(term216, term216.getClass(), "parentNode", null);
        setField(term216, term216.getClass(), "childNodes", term250);
        setField(term254, term254.getClass(), "attributes", term255);
        setField(term216, term216.getClass(), "attributes", term254);
        setField(term216, term216.getClass(), "baseUri", "BYqFIqCKAV");
        setIntField(term216, term216.getClass(), "siblingIndex", 1162663216);
        HashMap term18290 = new HashMap();
        Set<Object> term18328 =  ((Map) term18290).keySet();
        HashSet term18289 = new HashSet((Collection<? extends Object>) term18328);
        ArrayList term18291 = new ArrayList();
        ((ArrayList) term18291).add((Object)null);
        ((ArrayList) term18291).add((Object)null);
        ((ArrayList) term18291).add((Object)null);
        ((ArrayList) term18291).add((Object)null);
        LinkedHashMap term18294 = new LinkedHashMap();
        term18285 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term18286 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term18293 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term18286, term18286.getClass(), "tagName", "tbcdzjIfER");
        setBooleanField(term18286, term18286.getClass(), "isBlock", true);
        setBooleanField(term18286, term18286.getClass(), "formatAsBlock", true);
        setBooleanField(term18286, term18286.getClass(), "canContainBlock", true);
        setBooleanField(term18286, term18286.getClass(), "canContainInline", true);
        setBooleanField(term18286, term18286.getClass(), "empty", false);
        setBooleanField(term18286, term18286.getClass(), "selfClosing", false);
        setBooleanField(term18286, term18286.getClass(), "preserveWhitespace", false);
        setField(term18285, term18285.getClass(), "tag", term18286);
        setField(term18285, term18285.getClass(), "classNames", term18289);
        setField(term18285, term18285.getClass(), "parentNode", null);
        setField(term18285, term18285.getClass(), "childNodes", term18291);
        setField(term18293, term18293.getClass(), "attributes", term18294);
        setField(term18285, term18285.getClass(), "attributes", term18293);
        setField(term18285, term18285.getClass(), "baseUri", "BYqFIqCKAV");
        setIntField(term18285, term18285.getClass(), "siblingIndex", 1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "tagName", argTypes, term216, args);
        assertTrue(recursiveEquals(term216, term18285));
        assertTrue(recursiveEquals(retValue, "tbcdzjIfER"));
    }

};


